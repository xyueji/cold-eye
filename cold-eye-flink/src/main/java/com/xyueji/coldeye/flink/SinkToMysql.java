package com.xyueji.coldeye.flink;

import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author xiongzhigang
 * @date 2021-01-28 17:11
 * @description
 */
public class SinkToMysql extends RichSinkFunction<MessageEntity> {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private StringBuilder sql = new StringBuilder();

    public SinkToMysql() {
        this.getSQL();
    }

    @Override
    public void open(Configuration parameters) throws Exception {
        super.open(parameters);
        connection = getConnection();
        preparedStatement = connection.prepareStatement(this.sql.toString());
    }

    @Override
    public void close() throws Exception {
        super.close();
        if (connection != null) {
            connection.close();
        }

        if (preparedStatement != null) {
            preparedStatement.close();
        }

    }

    @Override
    public void invoke(MessageEntity value, Context context) throws Exception {
        setPreparedStatement(value);
        preparedStatement.execute();
    }

    private Connection getConnection() {
        String url = "jdbc:mysql://cold.eye.com:3306/coldeye?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "office-computer@xiong199467";
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    private void getSQL() {
        sql.append("replace into t_message_realtime(");
        sql.append("meter_code, meter_id, meter_name, ");
        sql.append("host_id, host_code, host_name, ");
        sql.append("house_id, house_code, house_name, ");
        sql.append("company_id, company_name, ");
        sql.append("tem, max_tem, min_tem, ");
        sql.append("hum, max_hum, min_hum, ");
        sql.append("tem_alert, hum_alert, state, ");
        sql.append("lon, lat, curtime) ");
        sql.append("values(");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ?, ");
        sql.append("?, ?, ?)");
    }

    private void setPreparedStatement(MessageEntity value) throws Exception {
        preparedStatement.setString(1, value.getMeterCode());
        preparedStatement.setString(2, value.getMeterId());
        preparedStatement.setString(3, value.getMeterName());
        preparedStatement.setString(4, value.getHostId());
        preparedStatement.setString(5, value.getHostCode());
        preparedStatement.setString(6, value.getHostName());
        preparedStatement.setString(7, value.getHouseId());
        preparedStatement.setString(8, value.getHouseCode());
        preparedStatement.setString(9, value.getHouseName());
        preparedStatement.setString(10, value.getCompanyId());
        preparedStatement.setString(11, value.getCompanyName());

        preparedStatement.setInt(12, value.getTem());
        preparedStatement.setInt(13, value.getMaxTem());
        preparedStatement.setInt(14, value.getMinTem());
        preparedStatement.setInt(15, value.getHum());
        preparedStatement.setInt(16, value.getMaxHum());
        preparedStatement.setInt(17, value.getMinHum());

        preparedStatement.setInt(18, value.getTemAlert());
        preparedStatement.setInt(19, value.getHumAlert());
        preparedStatement.setInt(20, value.getState());
        preparedStatement.setString(21, value.getLon());
        preparedStatement.setString(22, value.getLat());
        preparedStatement.setString(23, value.getCurtime());
    }
}

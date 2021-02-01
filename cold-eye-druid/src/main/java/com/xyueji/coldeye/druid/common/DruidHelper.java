package com.xyueji.coldeye.druid.common;

import java.sql.*;
import java.util.Properties;

/**
 * @author xiongzhigang
 * @date 2021-02-01 14:44
 * @description
 */
public class DruidHelper {
    private String url = "jdbc:avatica:remote:url=http://cold.eye.com:8888/druid/v2/sql/avatica/";
    private Properties conf = new Properties();
    private Connection connection;


    /**
     * 获得Druid连接
     *
     * @return
     */
    public Connection getConnection() {
        try {
            if (null == connection) {
                connection = DriverManager.getConnection(url, conf);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭Druid连接
     *
     * @param connection
     * @param st
     * @param rs
     */
    public void close(Connection connection, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        DruidHelper druidHelper = new DruidHelper();
        Connection connection = druidHelper.getConnection();
        System.out.println(connection.isClosed());
    }
}

package com.xyueji.coldeye.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author xiongzhigang
 * @date 2021-01-27 16:19
 * @description
 */
public class MD5Util {
    /**
     * 对字符串进行32位MD5加密
     * @param str
     * @return
     */
    public static String enCodeByMd5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes("UTF-8"));
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            String md5=new BigInteger(1, md.digest()).toString(16);
            //BigInteger会把0省略掉，需补全至32位
            return fillMd5(md5);
        } catch (Exception e) {
            throw new RuntimeException("MD5加密错误:"+e.getMessage(),e);
        }
    }

    private static String fillMd5(String md5){
        //如果不够32位则回调自身补零，最后返回32位长度的签名
        return md5.length()==32?md5:fillMd5("0"+md5);
    }
}

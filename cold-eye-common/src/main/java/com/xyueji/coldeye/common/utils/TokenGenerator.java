package com.xyueji.coldeye.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

/**
 * @author xiongzhigang
 * @date 2021-01-01 16:23
 * @description 生成token
 */
public class TokenGenerator {
    private static Logger logger = LoggerFactory.getLogger(TokenGenerator.class);

    public static String generateValue() {
        return generateValue(UUID.randomUUID().toString());
    }

    private static final char[] hexCode = "0123456789abcdef".toCharArray();

    public static String toHexString(byte[] data) {
        if (data == null) {
            return null;
        }

        StringBuilder res = new StringBuilder(data.length * 2);

        for (byte b : data) {
            res.append(hexCode[(b >> 4) & 0xF]);
            res.append(hexCode[b & 0xF]);
        }

        return res.toString();
    }

    public static String generateValue(String param) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(param.getBytes());
            byte[] messageDigest = algorithm.digest();
            return toHexString(messageDigest);
        }
        catch (Exception e) {
            e.printStackTrace();
            logger.error("生成Token失败");
        }
        return null;
    }
}

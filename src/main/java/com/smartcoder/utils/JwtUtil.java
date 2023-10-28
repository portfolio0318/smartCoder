package com.smartcoder.utils;

import io.jsonwebtoken.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    /**过期时间---24 hour*/
    private static final int EXPIRATION_TIME = 60*60*24;
    /**自己设定的秘钥*/
    private static final String SECRET = "smartcoder";
    /**前缀*/
    public static final String TOKEN_PREFIX = "Bearer ";
    /**表头授权*/
    public static final String AUTHORIZATION = "Authorization";

    /**
     * 创建Token
     */
    public static String generateToken(String username) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        // 设置签发时间
        calendar.setTime(new Date());
        // 设置过期时间
        // 添加秒钟
        calendar.add(Calendar.SECOND, EXPIRATION_TIME);
        Date time = calendar.getTime();
        HashMap<String, Object> map = new HashMap<>();
        //you can put any data in the map
        map.put("username", username);
        String jwt = Jwts.builder()
                .setClaims(map)
                //签发时间
                .setIssuedAt(now)
                //过期时间
                .setExpiration(time)
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        //jwt前面一般都会加Bearer
        return TOKEN_PREFIX + jwt;
    }
    /**
     *
     * 解密Token
     */
    public static String validateToken(String token) {
        // parse the token.
        Map<String, Object> body = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                .getBody();
        return body.get("username").toString();
    }

}


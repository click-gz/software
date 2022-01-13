package software.xmclass.Software_engineering._course.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import software.xmclass.Software_engineering._course.domain.usermodel;

import java.util.Date;

/**
 * Jwt工具类
 * 注意点:
 * 1、生成的token, 是可以通过base64进行解密出明文信息
 * 2、base64进行解密出明文信息，修改再进行编码，则会解密失败
 * 3、无法作废已颁布的token，除非改秘钥
 */
public class JWTUtils {
    /**
     * 过期时间，一周
     */
    private  static final long EXPIRE = 60000 * 60 * 24 * 7;
    //可以改成1秒测试过期时间
    //private static final long EXPIRE = 1;
    /**
     * 加密秘钥
     */
    private static final String SECRET = "hair";
    /**
     * 令牌前缀
     */
    private static final String TOKEN_PREFIX = "hair";
    /**
     * subject
     */
    private static final String SUBJECT = "hair";


    /**
     * 根据用户信息，生成令牌
     */
    public static String geneJsonWebToken(usermodel user) {

        String token = Jwts.builder().setSubject(SUBJECT)//设置主题
                .claim("id", user.getUid())
                .claim("name", user.getName())
                .setIssuedAt(new Date())//设置生效开始时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))//设置过期时间
                .signWith(SignatureAlgorithm.HS256, SECRET).compact();//设置签名也就是加密方式和将文本内容压缩
        token = TOKEN_PREFIX + token;//加上头部信息
        return token;
    }

    public static String geneJsonWebToken(usermodel user,long time) {

        String token = Jwts.builder().setSubject(SUBJECT)//设置主题
                .claim("phone", user.getPhone())
                .claim("code", user.getToken())
                .setIssuedAt(new Date())//设置生效开始时间
                .setExpiration(new Date(System.currentTimeMillis() + 60000 * time))//设置过期时间
                .signWith(SignatureAlgorithm.HS256, SECRET).compact();//设置签名也就是加密方式和将文本内容压缩
        token = TOKEN_PREFIX + token;//加上头部信息
        return token;
    }




    /**
     * 校验token的方法
     */
    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody();
            return claims;
        } catch (Exception e) {
            return null;
        }
    }


}
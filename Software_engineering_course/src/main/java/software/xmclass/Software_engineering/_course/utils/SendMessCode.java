package software.xmclass.Software_engineering._course.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import com.zhenzi.sms.ZhenziSmsClient;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServlet;

public class SendMessCode extends HttpServlet {
    private static   StringBuffer flag = new StringBuffer();
    public boolean check(String s){
        if(s.equals(flag.toString())){
            return true;
        }
        return false;
    }
    public static String main(String args) throws Exception {
        System.out.print(args);
        String sources = "0123456789"; // 加上一些字母，就可以生成pc站的验证码了
        Random rand = new Random();
        flag = new StringBuffer();
        for (int j = 0; j < 6; j++)
        {
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }


        final  String apiUrl="https://sms_developer.zhenzikj.com";
        final String appId="110127";
        final String appSecret="fe6de18a-d8d9-4e28-8154-da07f06aaa63";
        ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("number", args);
        params.put("templateId", "6959");
        String[] templateParams = new String[2];
        templateParams[0] = flag.toString();
        templateParams[1] = "3";
        params.put("templateParams", templateParams);
        String result = client.send(params);
        JSONObject obj = JSONObject.parseObject(result);
        System.out.println(obj.getString("code"));
        if(obj.getString("code").equals("0")){
            return templateParams[0];
        }else{
            return "error";
        }

    }
}

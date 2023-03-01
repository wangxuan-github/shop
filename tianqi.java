package com.tianqi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


@Controller("/tianqi")
public class tianqi {

//    @RequestMapping("list")
//    @RequestBody
//    public static String getWeather(HttpSession session) {
//        String result = null;
//        StringBuffer sbf = new StringBuffer();
//        try {
//            String httpUrl = "https://free-api.heweather.net/s6/weather?location=北京&key=cbb58beffc284604b418260ba0adb554";
//            result = HttpUtil.httpsRequest("GET", httpUrl,null);
//            System.out.println(result);
//            session.setAttribute("result", result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "list";
//    }

    public static void main(String[] args) {

    }

    @RequestMapping("list")
    public static void json(String City) throws Exception {
        // 参数url化
        String city = URLEncoder.encode(City, "utf-8");
        // 拼地址
        String apiUrl = String.format("https://www.sojson.com/open/api/weather/json.shtml?city=%s", city);
        // 开始请求
        URL url = new URL(apiUrl);
        URLConnection open = url.openConnection();
        InputStream input = open.getInputStream();
        // 这里转换为String

    }

}

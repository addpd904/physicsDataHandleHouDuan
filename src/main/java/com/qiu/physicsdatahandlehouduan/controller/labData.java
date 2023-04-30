package com.qiu.physicsdatahandlehouduan.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.net.URLDecoder;

@RestController
public class labData extends labDataStandard{

    @RequestMapping("/submitZhangLiXiShu")
    public String collectLabData(@RequestBody String JSONStr){
        String recStr= URLDecoder.decode(JSONStr);
//        System.out.println(recStr);
        File file=new File("E:\\programme\\web\\physicsDataHandleHouDuan\\DataFromUser\\ZhangLiXiShu.txt");
        if (file.exists()){
            try(FileWriter fileWriter=new FileWriter(file,true)) {
                fileWriter.append("\r\n").append(recStr);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return "<!DOCTYPE html>\n" +
                "<html lang=\"\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n" +
                "    <link rel=\"icon\" href=\"<%= BASE_URL %>favicon.ico\">\n" +
                "    <title><%= htmlWebpackPlugin.options.title %></title>\n" +
                "  </head>\n" +
                "  <body class=\"lightshade\">\n" +
                "    <noscript>\n" +
                "      <strong>We're sorry but <%= htmlWebpackPlugin.options.title %> doesn't work properly without JavaScript enabled. Please enable it to continue.</strong>\n" +
                "    </noscript>\n" +
                "\n" +
                "    <div id=\"app\"></div>\n" +
                "    <!-- built files will be auto injected -->\n" +
                "  </body>\n" +
                "</html>\n";
    }
    @GetMapping("/index")
    public String index(){
        return "ok";
    }
}

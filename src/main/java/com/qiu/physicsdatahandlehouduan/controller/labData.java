package com.qiu.physicsdatahandlehouduan.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLDecoder;

@RestController
public class labData extends labDataStandard{

    @RequestMapping("/submitZhangLiXiShu")
    public String collectLabData_zhang(@RequestBody String JSONStr){
        String recStr= URLDecoder.decode(JSONStr);
//        System.out.println(recStr);
        String class_path="";
        try {

             class_path=ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        File file=new File("E:\\programme\\web\\physicsDataHandleHouDuan\\DataFromUser\\ZhangLiXiShu.txt");
        File file=new File(class_path+"\\ZhangLiXiShu.txt");
        if (file.exists()){
            try(FileWriter fileWriter=new FileWriter(file,true)) {
                fileWriter.append("\r\n").append(recStr);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            try {
                file.createNewFile();
                try(FileWriter fileWriter=new FileWriter(file,true)) {
                    fileWriter.append("\r\n").append(recStr);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
    @RequestMapping("/submitFocalDistance")
    public String collectLabData_FocalDistance(@RequestBody String JSONStr){
        String recStr= URLDecoder.decode(JSONStr);
//        System.out.println(recStr);
        String class_path="";
        try {

            class_path=ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        File file=new File("E:\\programme\\web\\physicsDataHandleHouDuan\\DataFromUser\\ZhangLiXiShu.txt");
        File file=new File(class_path+"\\FocalDistance.txt");
        if (file.exists()){
            try(FileWriter fileWriter=new FileWriter(file,true)) {
                fileWriter.append("\r\n").append(recStr);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            try {
                file.createNewFile();
                try(FileWriter fileWriter=new FileWriter(file,true)) {
                    fileWriter.append("\r\n").append(recStr);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
    @RequestMapping("/submitHuiSiTong")
    public String collectLabData_HuiSiTong(@RequestBody String JSONStr){
        String recStr= URLDecoder.decode(JSONStr);
//        System.out.println(recStr);
        String class_path="";
        try {

            class_path=ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        File file=new File("E:\\programme\\web\\physicsDataHandleHouDuan\\DataFromUser\\ZhangLiXiShu.txt");
        File file=new File(class_path+"\\HuiSiTong.txt");
        if (file.exists()){
            try(FileWriter fileWriter=new FileWriter(file,true)) {
                fileWriter.append("\r\n").append(recStr);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            try {
                file.createNewFile();
                try(FileWriter fileWriter=new FileWriter(file,true)) {
                    fileWriter.append("\r\n").append(recStr);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
    @RequestMapping("/submitShengSuCeLiang")
    public String collectLabData_ShengSuCeLiang(@RequestBody String JSONStr){
        String recStr= URLDecoder.decode(JSONStr);
//        System.out.println(recStr);
        String class_path="";
        try {

            class_path=ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        File file=new File("E:\\programme\\web\\physicsDataHandleHouDuan\\DataFromUser\\ZhangLiXiShu.txt");
        File file=new File(class_path+"\\ShengSuCeLiang.txt");
        if (file.exists()){
            try(FileWriter fileWriter=new FileWriter(file,true)) {
                fileWriter.append("\r\n").append(recStr);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            try {
                file.createNewFile();
                try(FileWriter fileWriter=new FileWriter(file,true)) {
                    fileWriter.append("\r\n").append(recStr);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
    @GetMapping("/index")
    public String index(){
        return "ok";
    }
}

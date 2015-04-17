package com.xinux.mavenDemo.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class CreateHtml {

    public void convertVM2Html() {
        //初始化vm模板
        Template template = Velocity.getTemplate("webapp/WEB-INF/velocity/showUser.vm", "UTF-8");
        //初始化上下文
        VelocityContext context = new VelocityContext();
        //添加数据到上下文
        context.put("title", "我的第一个velocity页面");
        //生成html页面
        try {
            PrintWriter writer = new PrintWriter("d:\\temp\\myveloity\\showUser.html");
            template.merge(context, writer);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

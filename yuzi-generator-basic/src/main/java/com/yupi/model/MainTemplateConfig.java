package com.yupi.model;

import lombok.Data;

/**
 * 定义一个模板类，定义需要替换的部分，即挖坑
 * 静态模板配置
 */
@Data
public class MainTemplateConfig {
    //我们先声明动态声明的需求
    //1.在代码开头增加作者@Author注释(增加代码)
    //2.输出内容改为自己想要的
    //将循环该为单次
    /**
     * 输出内容
     */
    private String outputText = "输出结果";
    /**
     * 作者
     */
    private String author = "yupi";
    /**
     * 是否循环
     */
    private boolean loop = false;
}

package com.pengliufeng.leetcode.test;


import javafx.print.Collation;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class MobileMissile {

    @Test
    public void fileSearch(){
        File file = new File("/Users/mr-peng/workspace");
        if (file == null){
            sysPrint("当前初始目录错误");
            return;
        }
        sysPrint("开始目录:"+ file.getAbsolutePath());
        getFile(file);

    }

    public void getFile(File file){
        if (!file.isFile()){
            sysPrint(file.getName());
            if (!CollectionUtils.isEmpty(Arrays.asList(file.listFiles()))){
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    getFile(files[i]);
                }
            }
        }
    }

    public void sysPrint(String text){
        System.out.println(text);
    }

}

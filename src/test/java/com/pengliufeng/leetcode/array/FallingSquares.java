/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.array;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @author liufeng.peng
 * @version $Id: FallingSquares.java, v 0.1 2022-05-26 10:16 liufeng.peng Exp $$
 */
public class FallingSquares {
    public List<Integer> fallingSquares(int[][] positions) {
        Integer[] maxLength = new Integer[positions.length];
        int maxHigh = 0;
        int right = 0;
        if( positions == null || positions.length == 0 ){
            return Arrays.asList(maxLength);
        }
        maxLength[0] = positions[0][1];
        maxHigh = maxLength[0];
        right = positions[0][0] + positions[0][1];
        for(int i = 1 ; i < positions.length ; i++){
            if(positions[i][0] >= right ){
                maxHigh = Math.max(maxHigh , positions[i][1]) ;
            }else {
                maxHigh = Math.max(maxHigh , maxLength[i-1] + positions[i][1]);
            }
            right = positions[i][0] + positions[i][1];
            maxLength[i] = maxHigh;
        }
        return Arrays.asList(maxLength);
    }


    @Test
    public void testmain() throws ParseException {


    }
}
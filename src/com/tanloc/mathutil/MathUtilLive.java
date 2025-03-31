/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tanloc.mathutil;

/**
 *
 * @author tanlo
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120, actual: " + result);
        
        //MathUtil.getFactorial(-5);
        result = MathUtil.getFactorial(6);
        System.out.println("expected: 6! = 720, actual: " + result);
        System.out.println("expected: 0! = 1, actual: " + MathUtil.getFactorial(0));
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //hàm ngon trong tình huống expected === actual
    }
    
}

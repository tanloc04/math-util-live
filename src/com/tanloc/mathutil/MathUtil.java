/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanloc.mathutil;

/**
 *
 * @author tanlo
 */

//Ta viết cái class để cung cấp tiện ích cho nơi khác xài,
//mà khi ta cung cấp cái j đó cho người ta xài thì ta ko cần
//nhớ bất kỳ cái j cho riêng ta, hàm static sẽ giúp làm điều này.
public class MathUtil {
    
    //n! = 1.2.3.4.5....n
    //Quy ước: 0! = 1! = 1
    //Ko tính giai thừa số âm
    //20! là vừa khớp kiểu long, kiểu long có tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm hoặc 21! thì ko tính, đưa ra 1 ngoại lệ ko tính đc
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20!");
        //hàm dừng liền ko cần return
        
        if ( n == 0 || n == 1)
            return 1; //dừng ngay khi n đặc biệt
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;       
    }
}

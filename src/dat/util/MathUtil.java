/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util;

/**
 *
 * @author asus
 */
//day la class chua cac ham tinh toan, toan hoc, dung chung, lam tien ich
//cho cac noi khac su dung. Pham cai gi ma mang tinh chat xai dung
//ta dung ki thuat STATIC
public class MathUtil {
    //hàm tính n! = 1,2,3,...n
    //vì giá trị giai thừa tăng cực nhanh, nên sẽ tran vùng int rất sớm
    //do int chỉ tối đa 2 tỷ 1, nên ta xài long thì mới chưa đc n lớn
    //nhưng cũng chỉ cỡ 15! 
    
    public static long computeFactorial (int n) {
     long result = 1;
     for (int i = 1; i <= n; i++) {
         result *= i;
     }
     return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtil;

import static dat.util.MathUtil.computeFactorial;
/**
 *
 * @author asus
 */
public class MathUtil {
    
    public static void main(String[] args) {
        //5 giai thua se in ra 120
        System.out.println("5! = " + computeFactorial(5));
        //6! hy vong may se in ra 720
        //thuc te no ra bao nhieu thi phai chay moi biet
        //thuc te ket qua tra ve luc chay app goi la ACTUAL
        System.out.println("6! = " + computeFactorial(6));
        //actual: 720, expected: 720 -> dung
        //actual 1000, expected: 720 -> sai
        //expected: 1 if cF(0), chay ham cF(0), hy vong nhan ve 1
        //neu khong ve 1, tuc la actual khac expected, ham viet code sai
        System.out.println("0! = " + computeFactorial(0));
        
        System.out.println("1! = " + computeFactorial(1));
        
        //chay F6, nhin ket qua, luan dung sai bang mat tren tung ham sout()
        System.out.println("-5! =" + computeFactorial(-5));
        //tao ki vong may nem ve ngoai le(ham cF)
        //do dua vao du lieu sai
        //-5! tinh khong duoc vi giai thua choi voi 0,1,2,....
        
        //do ta dung sout() nen sai dung cu in ra ket qua, nen
        //ta phai luan dung sai = mat
        //-5! = 1, phai nhin kq in khi chay -> luan dung sai
        // HỢP LÍ NHƯNG NHÌN BẰNG MẮT, SO SÁNH
        // TRONG ĐẦU, DỄ BỊ SAI SÓT
        // giang hồ độ ra 1 bộ thư viện, giúp ta test các hàm dùng
        //màu sắc
        //xanh-> code chạy đúng
        //đỏ -> code chạy sai
        //viết thêm đoạn code tự so sánh dùm giữa expected và actual
        //để ném ra màu, mình chỉ cần nhìn màu, không cần tự so sánh
        //và kết luận
        //kĩ thuật này gọi là TDD kết hợp với UnitTesting xài cái thư
        //viện phụ trợ JUnit, NUnit, TestNG, PHPUnit, CPPUnit, xUnit, MSTest,...
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static dat.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class UnitTestTest {
    
    //đây là class truyền trống dùng để test code chính của mình ở bên
    //MathUtil
    //Nhưng ta không xài sout() mà ta xài màu sắc xanh đỏ
    //class này chứa rất nhiều hàm main()
    //muốn có hàm bất kì trong này thành main() bạn chỉ việc xài annotation
    //@Test, JVM sẽ tự động hieur hàm này là main() và Shift F6 từ đó
    //Nếu có nhiều @Tét tức là nhiều main() trong này, các main() sẽ
    //chạy tuần tự theo mặc định từ trên xuống
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        computeFactorial(-5);
        computeFactorial(20);
        //hàm này dùng để test các tình huống cà chớn đến từ người dùng
        //ví dụ người dùng muốn tính -5! thì tính thế mẹ nào được
        //khi đó trong thiết kế của hàm cF() ta phải dự liệu tình huống
        //cà chớn này, tức là người dùng đưa data cả chớn vào thì 
        //mình ném ra cái ngoại lệ, không thèm xử lí
        //cF(-5) đập vào mặt cái ngoại lệ
        //và ngoại lệ là 1 thứ bất thường, không dự tính, không phải là 1 loại
        //value có thể so sánh, tức là không thể assertEquals(một-cái-ngoại-lệ)
        //vì assert() trong tiếng Anh nghĩa là so sánh 2 thứ gì đó
        //tức là phải có value để so, mà ngoại lệ Exception thì không phải là value
        //ta phải dùng chiêu
        
    }
    //dù code bạn viết có đỏ hay xanh, miễn không bị lỗi cú pháp khi gõ
    //lỗi import thì CLEAN & BUILD luôn ra được file .JAR .WAR
    //lí do là thằng Clean & Build nó chỉ kiểm tra code không sai cú pháp
    //nó không care code có sai logic xử lí hay không
    
    //MÌNH CHƠI LỚN :
    //NẾU CODE ĐANG MÀU ĐỎ, KHÔNG PHẢI XANH, CẤM CLEAN & BUILD ĐỂ ĐẢM BẢO
    //RẰNG CODE PHẢI CHẠY ĐÚNG(MÀU XANH) CHO CÁC TÌNH HUỐNG SỬ DỤNG QUA ASSERT()
    //TỨC LÀ ĐÚNG VỀ XỬ LÍ THÌ MỚI CHO RA FILE .JAR .WAR
    //TỨC LÀ ĐÈN XANH THÌ THÔNG ĐƯỜNG
    //ĐỎ, VỊN LẠI, KHÔNG CHO RA .JAR .WAR
    //PLEASE, NHỚ 2 CON SỐ
    //NETBEAN 8X, 1005
    //NETBEAN 10X TRỞ LÊN, 1204
    
    @Test 
    //hàm main() này dùng để test các tình huống hàm cF() nhân đúng tham
    //số và mày phải chạy đúng như kì vọng
    public void testSuccessfullCases() {
        //assertEquals(120, 720);
        //hy vọng 5 giai thừa trả về 120, nếu không thì xuất hiện màu đỏ
        assertEquals(120, computeFactorial(5));
        
        //hy vọng 6 giai thừa trả về 720, nếu không thì xuất hiện màu đỏ
        assertEquals(720, computeFactorial(6));
        
        assertEquals(1, computeFactorial(0));//hy vọng 0! là 1
        assertEquals(1, computeFactorial(1));//hy vọng 1! là 1
        
        //xanh chỉ xuất hiện khi tất cả xanh, hàm ý hàm chạy đúng mọi trường hợp
        //đỏ thì chỉ cần 1 thằng đỏ trong cả đám xanh
        //hàm ý: mày xanh gần hết, còn vài case màu đỏ
        //chứng tỏ xử lí hàm không tốt, không chạy tốt cho mọi trường hợp
    }
    
}

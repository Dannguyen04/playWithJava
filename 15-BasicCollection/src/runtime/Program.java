package runtime;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import javafx.scene.layout.Priority;

public class Program {
    public static void main(String[] args) {
        //playWithArrayList();
        playWithQueue();
    }
    
    public static void playWithArrayList(){
        //ArrayList là 1 túi hành hiệu để triển khai các 
        //tính năng của List interface 
        
        //ArrayList giống với ArrayPrimitive 
        //nhưng khác là nó có khả năng co giãn - concat cu
        
        //tạo mảng thường 
        int arrIntPrimitive[] = new int[10];
        //mảng bình thường lưu được primitive datatype, wrapper, obj
        //  không giãn được, fixed size
        //  lưu ở stack
        
        //ArrayList Collection
        //say no vơi primitive - dữ liệu nguyên thủy
        ArrayList<Integer> arrIntList = new ArrayList<>();
        List<Integer> arrIntListV2 = new ArrayList<>();
        //khai cha new con
        //collection chỉ chơi với obj thôi 
        //arrayList có tính co giãn, tại sao?
        //vì nó được lưu ở Heap chỉ chơi với obj
        //tạo ra các con trỏ (sợi dây liên kết) móc vào vùng nhớ
        
        //.add()
        arrIntList.add(new Integer(3));
        arrIntList.add(new Integer(5));
        arrIntList.add(2); //cơ chế auto-boxing
        
        System.out.println(arrIntList); //[3, 5, 2]
        //tự gọi hàm .toString
        
        //.clear(): xóa hết các phần tử
        arrIntList.clear();
        
        //--------------------------------------------
        //.add(index, value): nhét value vào vị trí index
        arrIntList.add(0, 3);
        arrIntList.add(1, 5);
        arrIntList.add(2, 4);
        arrIntList.add(1, 4);
        
        // 3 4 5 4
        // 0 1 2 3 4 
        
        System.out.println(arrIntList);//[3, 4, 5, 4]      
        
        //--------------------------------------------
        //.addAll(List): nhét List vào danh sách
        arrIntListV2.add(9);
        arrIntListV2.add(19);
        arrIntListV2.addAll(1, arrIntList);
        System.out.println(arrIntListV2); //[9, 3, 4, 5, 4, 19]
        
        //--------------------------------------------
        //giả sử có mảng cùi 
        //Array.asList(): giúp biến mảng cùi thành mảng xịn
        //giống như kiểu Peter Parker khi được nhện chich =))
        //và từ đó Sờ pai đờ man ra đời 
        Integer arrDemo[] = {3,5,7}; //auto - unboxing 
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arrDemo));
        //arrLít chính là phiên bản ArrayList của arrdemo(primitive)
        
        //.toArray() chuyển mảng List thành arrayPrimitive
        Integer numList[] = new Integer[arrList.size()];
        arrList.toArray(numList);
        //không thể dùng sout cho numList vì nó không có toString()
        
        //.get(index): lấy ra phần tử ở vị trí index trong List
        //arrList[3,5,7]
        System.out.println(arrList.get(1));//5
        
        //.set(index, newValue): gán giá trị ở index bằng newValue
        arrList.set(1, 9);//[3,9,7]
        
        //Challange: swap số 3 và số 7 đi hế hế =))
        Integer tmp = arrList.get(0);
        arrList.set(0, arrList.get(2));
        arrList.set(2, tmp);
        System.out.println(arrList);
        
        //Iterable: tính khả duyệt - tính khả lập
        //iterator: khả lập, là 1 obj có thể định nghĩa là 1 trình tự
        //và giá trị có thể trả về tiếp theo trước khi kết thúc
        
        Iterator<Integer> it = arrList.iterator();
        System.out.println(it.hasNext()); //true
        System.out.println(it.next()); //7
        System.out.println(it.next()); //9
        System.out.println(it.next()); //3
        System.out.println(it.hasNext());//false
        
        
        
        //.remove(index) xóa phần tử ở vị trí lào đó
        arrList.remove(1);//xóa được số 9
        //.removeAll(list) xóa hết những thằng có trong List
        //.size()
        //.clone(): sao chép tạo 1 mảng khác có cùng phần tử, kích thước, dung lượng
        //shallow copy: diệt cỏ mà không diệt tận gốc mà tạo ra hai chàng trỏ 1 nàng
        //deep copy: cắt hết
        //arrList = [7,3]
        
        ArrayList<Integer> demoClone = (ArrayList)arrList.clone();
        //demoClone là clone của arrList
        
        //.contain(key): tìm kiếm sự tồn tại cuả key (boolean)
        //.notifyCapacity(): cung cấp giới hạn có thể chứa 
        //.isEmpty(): xem mảng có vườn không nhà trống không? (boolean)
        //.trimToSize: giảm dung lượng về đúng kích thước
    }   
    
    public static void playWithQueue(){
        //Queue là 1 interface có class triển khai là LinkedList
        Queue<Integer> numList = new LinkedList<>();
        //head [ ] tail
        //.add(value) nhét value vào danh sách (true, illegalException) thuộc về Collection
        //.offer(value) nhét value vào ds (true, false) thuộc về Queue
        numList.add(3);
        numList.offer(1);
        numList.add(5);
        numList.offer(4);
        
        //Queue là hàng đợi như mình xếp hàng đi xem phim ở chỉ bán quạt
        //Queue không xài .add(index, value)
        //vì nó là hàng đợi, xài như này gọi là đéo có ý thức xếp hàng - chen hàng
        
        //trong Queue không có get và set 
        System.out.println(numList);//[3, 1, 5, 4]
        
        //xem
        //.element() chỉ xem phần tử ở đầu (head), thuộc vể Collection (pt, nullPointerException)
        System.out.println(numList.element());//3
        System.out.println(numList.element());//3
        //.peek() chỉ xem phần tử ở đầu, thuộc về Queue (pt, null)
        System.out.println(numList.peek());//3
        
        //lấy ra
        //.remove() lấy phần tử ở đầu ra khỏi danh sách (pt, nullPointerException)
        System.out.println(numList.remove());//3
        System.out.println(numList.remove());//1
        //.poll() lấy phần tử ở đầu ra khỏi danh sách(pt, null)
        System.out.println(numList.poll());//5
        
        //numList = [4]
        
        //bình thường người ta mà xài queue thì người ta don't care đến
        //số lượng, hay là hàng đợi có cái qq gì
        //người ta chỉ quan tâm giải quyết thằng đầu tiên, rồi tới thằng
        //tiếp theo mà thôi 
        
        numList.offer(5);
        numList.offer(8);
        numList.offer(9);
        //numList = [4 5 8 9]
        while(true){
            Integer tmp = numList.poll(); //lấy thăng ở đầu
            if(tmp == null) break;
            System.out.println(tmp);   
        }
        
        //numList = []
        
        //PriorityQueue là class triển khai của Queue
        //nên giống Queue hoàn toàn
        //điểm đặc biệt khác đó là nó có sự ưu tiên
        //nhỏ trước lớn sau - chơi theo node ruồi đó =))
        Queue<Integer> numListV2 = new PriorityQueue<>();
        numListV2.offer(2);
        numListV2.offer(1);
        numListV2.offer(5);
        numListV2.offer(9);
        numListV2.offer(7);
        System.out.println(numListV2); //[1, 2, 5, 9, 7]
        
        System.out.println(numListV2.poll());//1
        System.out.println(numListV2.poll());//2
        System.out.println(numListV2.poll());//5
        System.out.println(numListV2.poll());//7
        System.out.println(numListV2.poll());//9
        
        //nếu như ta cần một hàng đợi bình thường, nhưng 
        //ló có giới hạn
        //ví dụ: chứa tối đa 3 idol jav-a thì dùng ArrayBlockingQueue
        Queue<Integer> numListV3 = new ArrayBlockingQueue<>(3);
        numListV3.offer(1);
        numListV3.offer(3);
        numListV3.offer(2);
        //numListV3.add(4); dính con bọ IllegalException do dùng add
        numListV3.offer(4); //offer (true|false) ; add(true|IllegalException)
        System.out.println(numListV3);//[1, 3, 2]
        
    }
    
    public static void playWithDeque(){
        //Dequeue - Double ended queue
        //có quyền ra vàovoo vào cả 2 đầu front - rear
        
        //Array Deque là con của Deque
        //được cho là mạnh nhất trong Collection
        
        //Demo Dequeue thông qua ArrayDeque (là 1 class triển khai của Deque)
        
        Deque<Integer> numList = new ArrayDeque<>();
        //front"First"  []  "Last"rear
        //.add()|.addLast       |         .offer()|.offerLast  :nhét vào Last
        //.add()|.addFirst       |         .offer()|.fferFirsy  :nhét vào First
        
        //xem
        //.getFirst() | .peekFirst : xem phần tử ở front 
        //.getLast() | .peekLast : xem phần tử ở rear
        
        //xóa hay lấy ra
        //.removeFirst() | .pollFirst(): lấy phần tử ở đầu front
        //.removeLast() | .pollLast(): lấy phần tử ở đầu rear
        
        //ArrayDeque mà muốn thay thế cho cấu trúc Queue
        //front - rear                     head - tail
        //thêm: .offerLast()
        //xem:  .peekFirst()
        //xóa:  .pollFirst()
        
        //ArrayDeque mà muốn thay thế cho cấu trúc Stack(xếp chồng) LIFO
        //front - rear                     vào first ra first 
        //thêm: .offerFirst()
        //xem:  .peekFirst()
        //xóa:  .pollFirst() 
        
        
        
   
    }
        
    
    
    
}

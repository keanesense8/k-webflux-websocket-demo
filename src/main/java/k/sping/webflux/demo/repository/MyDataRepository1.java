//package k.sping.webflux.demo.repository;
//
//
//import com.sun.org.glassfish.gmbal.ManagedData;
//import k.sping.webflux.demo.model.MyData;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.util.*;
//import java.util.stream.IntStream;
//
//@Repository
//public class MyDataRepository {
//
//    private static Map<Integer , MyData> myDatas ;
//
//    @PostConstruct
//    public void init(){
//        myDatas = new HashMap<>();
//        IntStream.range(1, 50).forEach(
//                i -> myDatas.put(i , new MyData(i , "keane" + i))
//        );
//    }
//
//    public List<MyData> getAll(){
//        List<MyData> myDataList = new ArrayList<>();
//        myDatas.values().stream().forEach(
//                myData -> {
//                    myDataList.add(myData);
//                }
//        );
//        return myDataList;
//    }
//
//    public MyData getById(Integer id){
//        return myDatas.get(id);
//    }
//
//
//}

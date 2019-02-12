package k.sping.webflux.demo.repository;

import k.sping.webflux.demo.model.MyData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    MyDataRepository myDataRepository;

    @Test
    public void mogodbTest01() {
        myDataRepository.deleteAll();
        IntStream.range(1, 50).mapToObj(
                i -> {return new MyData(i , "keane" + i);}
        ).forEach(x -> myDataRepository.save(x).subscribe(System.out::println));

    }

}


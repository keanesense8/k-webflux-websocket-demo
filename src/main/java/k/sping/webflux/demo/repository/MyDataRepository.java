package k.sping.webflux.demo.repository;

import k.sping.webflux.demo.model.MyData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MyDataRepository extends ReactiveMongoRepository<MyData ,Integer> {
}

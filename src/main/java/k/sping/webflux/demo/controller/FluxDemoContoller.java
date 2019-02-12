package k.sping.webflux.demo.controller;

import k.sping.webflux.demo.model.MyData;
import k.sping.webflux.demo.repository.MyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static reactor.core.publisher.Flux.fromArray;


@CrossOrigin
@RestController
@RequestMapping("/flux/demo")
public class FluxDemoContoller {

    @Autowired
    MyDataRepository myDataRepository;

    @RequestMapping("/all")
    public Flux<MyData> getAll(){
        return myDataRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Mono<ResponseEntity<MyData>> getById(@PathVariable("id") final Integer id){
        return myDataRepository.findById(id)
                .map(e -> new ResponseEntity<>(e , HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}

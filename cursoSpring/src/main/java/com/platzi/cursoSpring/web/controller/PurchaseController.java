package com.platzi.cursoSpring.web.controller;

import com.platzi.cursoSpring.domain.dto.Purchase;
import com.platzi.cursoSpring.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll(){
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    /*@GetMapping("/{id}")
    private ResponseEntity<Purchase> getPurchase(@PathVariable("id") int purchaseId){
        return purchaseService.getByClient(purchaseId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    @GetMapping("/client/{IdClient}")
    public ResponseEntity <List<Purchase>> getByClient(@PathVariable("idClient") String clientId){
        return  purchaseService.getByClient(clientId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> save (@RequestBody Purchase purchase){
        return  new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED );
    }

    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity delete (@PathVariable("id") int purchaseId){
        if (purchaseService.delete(purchaseId)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }*/


}

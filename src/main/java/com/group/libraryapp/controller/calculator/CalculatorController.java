package com.group.libraryapp.controller.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;



@RestController //주어진 class를 controller로 등록 (controller: API입구)
public class CalculatorController {

    @GetMapping("/add") //HTTP Method / HTTP Path
    public int addTwoNumbers(
        @RequestParam("num1") int num1,
        @RequestParam("num2") int num2 
    ) { //쿼리
        return num1 + num2; //반환 결과
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }
    
    
}

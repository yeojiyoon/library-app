package com.group.libraryapp.controller.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //주어진 class를 controller로 등록 (controller: API입구)
public class CalculatorController {

    @GetMapping("/add") //HTTP Method / HTTP Path
    public int addTwoNumbers(
        @RequestParam("num1") int num1,
        @RequestParam("num2") int num2 
    ) { //쿼리
        return num1 + num2; //반환 결과
    }
    
}

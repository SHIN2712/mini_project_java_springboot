package com.fastcampus.admin.controller;


import com.fastcampus.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")    // localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi getMethod!";
    }

    @GetMapping("getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){

        String password = "bbbb";

        System.out.println("id : "+id);
        System.out.println("password : "+password);

        return id+pwd;
    }

    // localhost:8080/api/multiParameter?
    // 객체를 통해 mapping 가능
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());


        return searchParam;
    }

}

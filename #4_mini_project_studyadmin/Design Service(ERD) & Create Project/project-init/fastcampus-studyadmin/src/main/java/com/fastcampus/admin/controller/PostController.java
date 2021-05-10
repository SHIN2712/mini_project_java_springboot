package com.fastcampus.admin.controller;

import com.fastcampus.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // POST: http 통신 시 body에 내용을 집어서 보내겠다
    // HTML <Form>
    // ajax 문서
    // json, xml, multipart-from / text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){
    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }

}

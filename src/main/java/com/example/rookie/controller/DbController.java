package com.example.rookie.controller;

import com.example.rookie.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rookie on 2018/1/12.
 */
@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    private DbService dbService;

    @RequestMapping("/query")
    public void query() {

        String sql = "select productCode,productName from union_product where id = '5';";
        dbService.query(sql);

    }

}

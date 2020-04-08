package com.csdj.service.impl;

import com.csdj.pojo.BookInfo;
import com.csdj.service.TestService;
import com.csdj.tonyonmapper.Tonyon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceimpl implements TestService {


    @Autowired
    Tonyon tonyon;

    @Override
    public List<BookInfo> getemplist(){
        return tonyon.selectAll();
    }

}

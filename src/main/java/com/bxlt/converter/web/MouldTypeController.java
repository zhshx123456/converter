package com.bxlt.converter.web;

import com.bxlt.converter.domain.MouldType;
import com.bxlt.converter.domain.TbbizShape;
import com.bxlt.converter.service.MouldAttributeService;
import com.bxlt.converter.service.MouldTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: converter
 * @description: MouldController
 * @author: zsx
 * @create: 2018-08-24 12:21
 **/
@EnableTransactionManagement
@RestController
@RequestMapping("/mouldType")
public class MouldTypeController {
    @Autowired
    private MouldAttributeService mouldAttributeService;
    @Autowired
    private MouldTypeService mouldTypeService;

    @RequestMapping(value = "/findList",produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List<MouldType> findList(){
        List<MouldType> mouldTypeList = mouldTypeService.findList();
        return mouldTypeList;
    }




}

package com.api.smtp.ctrlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.smtp.model.MyCustomException;
import com.api.smtp.utility.CheckArraysUtils;

@RestController
@RequestMapping("/trycatch")
public class TryCatchController {

    private Log log = LogFactory.getLog(TryCatchController.class);

    @RequestMapping("/test")
    public String test(@RequestParam("index") int index) {
        String[] arr = null;
        try {
            arr = new String[] { "a", "b", "c" };

            CheckArraysUtils.checkArrayIndex(index, arr.length);
        } catch (MyCustomException e) {
            log.error("Exception: ", e);
            return e.getMessage();
        }
        return arr[index];
    }

}

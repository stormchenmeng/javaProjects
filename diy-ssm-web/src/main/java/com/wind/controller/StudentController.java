package com.wind.controller;

import com.wind.entity.StudentEntity;
import com.wind.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<StudentEntity> findAll() {
        List<StudentEntity> studentEntities = studentService.findAllStudent();
        logger.info("size=" + studentEntities.size());
        return studentEntities;
    }
}

package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xtd.bs.entity.Menu;
import com.xtd.bs.entity.Student;
import com.xtd.bs.entity.User;
import com.xtd.bs.service.MenuService;
import com.xtd.bs.service.StudentService;
import com.xtd.bs.utils.MenuNode;
import com.xtd.bs.utils.R;
import com.xtd.bs.utils.SystemConstant;
import com.xtd.bs.utils.TreeUtil;
import com.xtd.bs.vo.StudentVo;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@RestController
@RequestMapping("/bs/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/list")
    public R findAllStudent(StudentVo studentVo){
        System.out.println(studentVo);
        System.out.println("==================================>"+studentVo.getPage()+studentVo.getLimit());
        PageHelper.startPage(studentVo.getPage(),studentVo.getLimit());
        List<Student> employeeList = studentService.students(studentVo);
        PageInfo<Student> pageInfo = new PageInfo<Student>(employeeList);
        return new R(pageInfo.getTotal(),pageInfo.getList());
    }

    @PostMapping("addStudent")
    public String addStudent(Student student, HttpSession session){
        System.out.println("student = " + student);
        Map<String, Object> map = new HashMap<String, Object>();
        if (studentService.addStudent(student) > 0){

            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"添加成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"添加失败");
        }

        return JSON.toJSONString(map);
    }

    @PostMapping("importExcel")
    public Map<String,Object> importExecl(@RequestParam(value = "file",required = false) MultipartFile importExcel){
        Map<String, Object> map = new HashMap<>();
        if (importExcel != null){
            try {
                //1.将文件封装成工作薄
                XSSFWorkbook workbook = new XSSFWorkbook(importExcel.getInputStream());
                //2.获取工作表的数量
                int numberOfSheets = workbook.getNumberOfSheets();
                XSSFSheet sheetAt = workbook.getSheetAt(0);

                System.out.println("numberOfSheets = " + numberOfSheets);
                //3.循环所有的工作表，根据工作表下标获取对应的sheet
                for (int i = 0; i < numberOfSheets; i++) {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    // 4.获取当前工作表中数据的开始位置  0
                    int firstRowNum = sheet.getFirstRowNum();
                    // 5.获取当前工作表中数据的结束位置   5  就是多少行数据
                    int lastRowNum = sheet.getLastRowNum();
                    // 6.将文件中的数据封装为一个list保存到数据库中
                    List<Student> list = new ArrayList<Student>();
                    for (int j = firstRowNum+1; j <= lastRowNum; j++) {
                        // 获取sheet中的每一行
                        XSSFRow row = sheet.getRow(j);
                        short lastCellNum = row.getLastCellNum();
                        for (int k = 0; k < lastCellNum; k++) {
                            String cell = String.valueOf(row.getCell(k));

                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("进入了文件上传");
            map.put("code",200);
            map.put("msg","上传成功");
            return map;
        }else{
            map.put("msg","没有上传文件");
            return map;
        }

    }


    @PostMapping("updateStudent")
    public String updateStudent(HttpSession session,Student student){
        System.out.println(student);
        Map<String, Object> map = new HashMap<String, Object>();

        if(studentService.updateStudent(student)>0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"修改成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"修改失败");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping("deleteStudentById")
    public String updateStudent(@RequestParam("id") Integer id){
        System.out.println(id);
        Map<String, Object> map = new HashMap<String, Object>();

        if(studentService.deleteStudent(id)>0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"删除成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"删除失败");
        }
        return JSON.toJSONString(map);
    }



}


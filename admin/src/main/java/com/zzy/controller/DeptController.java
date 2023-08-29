package com.zzy.controller;

import com.zzy.domain.Dept;
import com.zzy.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
@Api(value = "部门相关")
public class DeptController {
    // 所有接口进行菜单权限控制
    @PostMapping
    @ApiOperation(value = "添加部门")
    private Result addDept(@RequestBody Dept dept) {
        // 判断部门是否存在，部门名称
        return null;
    }

    @DeleteMapping
    @ApiOperation(value = "通过id删除部门")
    private Result deleteDept(@RequestParam(value = "deptId") Long deptId) {
        return null;
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新部门")
    private Result update(@RequestBody Dept dept) {
        return null;
    }
    @PostMapping("/updateStatus")
    @ApiOperation(value = "更新部门状态")
    private Result updateStatus(@RequestParam(value = "deptId") Long deptId, @RequestParam(value = "status") String status) {
        return null;
    }
    @GetMapping
    @ApiOperation(value = "根据部门id查询")
    private Result selectById(@RequestParam(value = "deptId") Long deptId) {
        return null;
    }
    @GetMapping("/tree")
    @ApiOperation(value = "查询树状结构的部门")
    private Result selectTree() {
        return null;
    }
}

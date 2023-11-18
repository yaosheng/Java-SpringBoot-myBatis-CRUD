package tw.com.lccnet.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tw.com.lccnet.maven.pojo.Emp;
import tw.com.lccnet.maven.pojo.PageBean;
import tw.com.lccnet.maven.pojo.Result;
import tw.com.lccnet.maven.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping("/emps")
	public Result page(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer pageSize) {
		
		PageBean pageBean = empService.page(page, pageSize);
		
		return Result.success(pageBean);
	}
	
	@GetMapping("/emps/{id}")
	public Result updateById(@PathVariable Integer id) {
		
		Emp emp = empService.getById(id);
		
		return Result.success(emp);
	}
}

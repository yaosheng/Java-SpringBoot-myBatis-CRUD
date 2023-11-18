package tw.com.lccnet.maven.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tw.com.lccnet.maven.pojo.Dept;
import tw.com.lccnet.maven.pojo.Result;
import tw.com.lccnet.maven.service.DeptService;

@Slf4j
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	//private static Logger log = LoggerFactory.getLogger(DeptController.class);
	
	//@RequestMapping(value = "/depts", method = RequestMethod.GET)
	//@PostMapping("/depts")
	@GetMapping("/depts")
	//@PutMapping("/depts")
	//@DeleteMapping("/depts")
	public Result list() {
		
		List<Dept> deptList = deptService.list();
		//log.info("aaaa");
		
		System.out.println(deptList);
		
		return Result.success(deptList);
	}
	
	@DeleteMapping("/depts/{id}")
	public Result delete(@PathVariable Integer id) {
		deptService.delete(id);
		
		return Result.success();
	}
	
	@PostMapping("/depts")
	public Result add(@RequestBody Dept dept) {
		deptService.add(dept);
		return Result.success();
	}
	
	@PutMapping("/depts")
	public Result update(@RequestBody Dept dept) {
		deptService.update(dept);
		
		return Result.success();
	}
}

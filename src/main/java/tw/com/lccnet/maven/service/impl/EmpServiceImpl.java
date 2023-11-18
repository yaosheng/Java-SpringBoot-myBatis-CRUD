package tw.com.lccnet.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.lccnet.maven.mapper.EmpMapper;
import tw.com.lccnet.maven.pojo.Emp;
import tw.com.lccnet.maven.pojo.PageBean;
import tw.com.lccnet.maven.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public PageBean page(Integer page, Integer pageSize) {
		
		Long count = empMapper.count();
		
		Integer start = (page - 1)*pageSize; 
		
		List<Emp> empList = empMapper.page(start, pageSize);
		
		PageBean pageBean = new PageBean(count, empList);
		
		return pageBean;
	}

	@Override
	public Emp getById(Integer id) {
		
		return empMapper.getById(id);
	}

}

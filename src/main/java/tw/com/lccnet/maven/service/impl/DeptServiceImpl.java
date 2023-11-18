package tw.com.lccnet.maven.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.lccnet.maven.mapper.DeptMapper;
import tw.com.lccnet.maven.pojo.Dept;
import tw.com.lccnet.maven.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Dept> list() {
		
		return deptMapper.list();
	}

	@Override
	public void delete(Integer id) {
		deptMapper.delete(id);
	}

	public void add(Dept dept) {
		dept.setCreateTime(LocalDateTime.now());
		dept.setUpdateTime(LocalDateTime.now());
		deptMapper.add(dept);
	}
	
	
	@Override
	public void update(Dept dept) {
		System.out.println("serviceImpl");
		dept.setId(1);
		dept.setCreateTime(LocalDateTime.now());
		dept.setUpdateTime(LocalDateTime.now());
		deptMapper.update(dept);
	}


}

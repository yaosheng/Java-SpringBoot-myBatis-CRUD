package tw.com.lccnet.maven.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tw.com.lccnet.maven.pojo.Dept;

public interface DeptService {

	public List<Dept> list();
	
	public void delete(Integer id);
	
	public void add(Dept dept);
	
	public void update(Dept dept);
}

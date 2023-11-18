package tw.com.lccnet.maven.service;

import org.springframework.stereotype.Service;

import tw.com.lccnet.maven.pojo.Emp;
import tw.com.lccnet.maven.pojo.PageBean;

public interface EmpService {

	public PageBean page(Integer page, Integer pageSize);

	public Emp getById(Integer id);
}

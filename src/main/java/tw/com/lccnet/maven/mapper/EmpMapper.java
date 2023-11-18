package tw.com.lccnet.maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tw.com.lccnet.maven.pojo.Emp;

@Mapper
public interface EmpMapper {

	@Select("select count(*) from emp")
	public Long count();
	
	@Select("select * from emp limit #{start}, #{pageSize}")
	public List<Emp> page(Integer start, Integer pageSize);

	@Select("select * from emp where id=#{id}")
	public Emp getById(Integer id);
}

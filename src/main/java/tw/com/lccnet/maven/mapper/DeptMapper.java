package tw.com.lccnet.maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tw.com.lccnet.maven.pojo.Dept;

@Mapper
public interface DeptMapper {

	@Select("select * from dept")
	public List<Dept> list();
	
	@Delete("delete from dept where id=#{id}")
	public void delete(Integer id);
	
	@Insert("insert into dept(name, createTime, updateTime)values(#{name}, #{createTime}, #{updateTime})")
	public void add(Dept dept);
	
	@Update("update dept set name=#{name},createTime=#{createTime},updateTime=#{updateTime} where id=#{id}")
	public void update(Dept dept);
	
}

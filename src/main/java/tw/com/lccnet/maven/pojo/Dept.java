package tw.com.lccnet.maven.pojo;

import java.time.LocalDateTime;

public class Dept {
	private Integer id;
	private String name;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public Dept(Integer id, String name, LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Dept() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}

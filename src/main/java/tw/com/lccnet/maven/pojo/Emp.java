package tw.com.lccnet.maven.pojo;

import java.time.LocalDate;

public class Emp {
	private Integer id;
	private String username;
	private String password;
	private String name;
	private Short gender;
	private String images;
	private Short job;
	private LocalDate entryDate;
	private Integer depId;
	private LocalDate createTime;
	private LocalDate updateTime;
	
	public Emp(String username, String password, String name, Short gender, String images, Short job,
			LocalDate entryDate, Integer depId, LocalDate createTime, LocalDate updateTime) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.images = images;
		this.job = job;
		this.entryDate = entryDate;
		this.depId = depId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Emp() {
		super();
	}
	
	public Short getJob() {
		return job;
	}

	public void setJob(Short job) {
		this.job = job;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Short getGender() {
		return gender;
	}
	public void setGender(Short gender) {
		this.gender = gender;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	public LocalDate getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}
	public LocalDate getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(LocalDate updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", gender="
				+ gender + ", images=" + images + ", job=" + job + ", entryDate=" + entryDate + ", depId=" + depId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	

	
	
}

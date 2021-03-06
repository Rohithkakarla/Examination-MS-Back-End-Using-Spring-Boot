package com.rohith.examination_ms_spring.models;

public class faculty {

	String facultyid;
	String name;
	String email;
	String password;
	boolean status;

	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public faculty(String facultyid, String name, String email, String password, boolean status) {
		super();
		this.facultyid = facultyid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public String getFacultyid() {
		return facultyid;
	}

	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "faculty [facultyid=" + facultyid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", status=" + status + "]";
	}

}

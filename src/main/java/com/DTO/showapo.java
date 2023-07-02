package com.DTO;

public class showapo {

	
	private String doctorName;

	private String time;

	private String user;

	public showapo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public showapo(String doctorName, String time, String user) {
		super();
		this.doctorName = doctorName;
		this.time = time;
		this.user = user;
	}
	

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "showapo [doctorName=" + doctorName + ", time=" + time + ", user=" + user + "]";
	}
	
	
}

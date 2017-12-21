package com.spring.domain.custom;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.domain.Role;

public class UserInfo {
	private String userID;
	private String userName;
	private LocalDateTime registrationDate;
	private String email;
	private String avatar;
	private Integer score;
	private Integer status;
	private String address;
	private String phoneNumber;
	private List<Role> permission;
	private LocalDateTime lastPasswordResetDate;

	public UserInfo(String userID, String userName, LocalDateTime registrationDate, String email, String avatar,
			Integer score, Integer status, String address, String phoneNumber, List<Role> permission,
			LocalDateTime lastPasswordResetDate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.registrationDate = registrationDate;
		this.email = email;
		this.avatar = avatar;
		this.score = score;
		this.status = status;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.permission = permission;
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public UserInfo() {
		super();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Role> getPermission() {
		return permission;
	}

	public void setPermission(List<Role> permission) {
		this.permission = permission;
	}

	public LocalDateTime getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	public void setLastPasswordResetDate(LocalDateTime lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	@Override
	public String toString() {
		return "UserCustom [userID=" + userID + ", userName=" + userName + ", registrationDate=" + registrationDate
				+ ", email=" + email + ", avatar=" + avatar + ", score=" + score + ", status=" + status + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", permission=" + permission + ", lastPasswordResetDate="
				+ lastPasswordResetDate + "]";
	}

}

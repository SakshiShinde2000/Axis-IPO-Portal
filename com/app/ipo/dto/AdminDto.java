package com.app.ipo.dto;



/*import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;*/

public class AdminDto 
{
	private Long adminId;
	
	/*
	 * @NotBlank(message = "Username cannot be blank")
	 * 
	 * @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).+$", message =
	 * "Username must contain both uppercase and lowercase letters")
	 */
	private String adminName;
	
	/*
	 * @NotBlank(message = "Password cannot be blank")
	 * 
	 * @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).+$", message =
	 * "Password must contain both uppercase and lowercase letters")
	 */
	private String adminPassword;

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
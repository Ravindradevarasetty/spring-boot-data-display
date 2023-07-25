package com.data.display.modal;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
	@Column
    private String email;
	@Column
    private String password;
     
    @Column(name = "full_name")
    private String fullName;
    @Column   
    private boolean enabled;

    
    

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Integer id, String email, String password, String fullName, boolean enabled) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.enabled = enabled;
	
	}


	public Integer getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public String getFullName() {
		return fullName;
	}


	public boolean isEnabled() {
		return enabled;
	}




	public void setId(Integer id) {
		this.id = id;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", fullName=" + fullName
				+ ", enabled=" + enabled + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, enabled, fullName, id, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && enabled == other.enabled
				&& Objects.equals(fullName, other.fullName) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password);
	}
 
    
	
	
}


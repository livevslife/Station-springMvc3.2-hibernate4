package com.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
@SequenceGenerator(name="bbs_seq",sequenceName="bbs")
public class User {
	@Id
	@Column(name="c_userid",length=32)
	@GenericGenerator(name="bbs_uuid",strategy="uuid")//≤…”√uuid≤ﬂ¬‘
	@GeneratedValue(generator="bbs_uuid")
	private String userId;
	@Column(name="c_username")
	private String userName;
	@Column(name="c_password")
	private String passWd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}

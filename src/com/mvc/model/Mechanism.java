package com.mvc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Mechanism")
//@SequenceGenerator(name="bbs_seq",sequenceName="bbs")
public class Mechanism {
	@Id
	@Column(name="Uuid",length=32)
	@GenericGenerator(name="m_uuid",strategy="uuid")//≤…”√uuid≤ﬂ¬‘
	@GeneratedValue(generator="m_uuid")
	private String Id;
	@Column(name="Mechanism_name")
	private String Name;
	@Column(name="Active")
	private int Active;
	@Column(name = "Create_time", insertable = false, columnDefinition = "DATE DEFAULT SYSDATE")
	private Date time;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}

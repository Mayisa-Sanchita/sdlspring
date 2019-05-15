package com.example.sdlspring.sdlspring.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Students {
	@Id
	public ObjectId _id;
	public String name;
	public String session;
	public String mobile;
	
	public Students() {}

	public Students(ObjectId _id, String name, String session, String mobile) {
		this._id = _id;
		this.name = name;
		this.session = session;
		this.mobile = mobile;
	}

	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

	  
}


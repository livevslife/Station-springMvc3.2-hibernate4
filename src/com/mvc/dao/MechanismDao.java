package com.mvc.dao;

import com.mvc.model.Mechanism;

public interface MechanismDao {

	Mechanism getMechanism(Mechanism user);

	void delete(Mechanism user);

	void save(Mechanism user);


}

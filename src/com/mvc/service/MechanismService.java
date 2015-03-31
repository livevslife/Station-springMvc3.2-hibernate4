package com.mvc.service;

import com.mvc.model.Mechanism;

public interface MechanismService {

	Mechanism getMechanism(Mechanism mechanism);

	void delete(Mechanism mechanism);

	void save(Mechanism mechanism);


}

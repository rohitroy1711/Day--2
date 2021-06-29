package com.cognizant.ormlearnformapping.services;

import org.springframework.stereotype.Service;
import com.cognizant.ormlearnformapping.model.Skill;

@Service
public interface SkillService {

	public Skill getById(int id);

	public void save(Skill skill);

}

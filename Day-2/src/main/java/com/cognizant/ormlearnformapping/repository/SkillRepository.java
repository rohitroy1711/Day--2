package com.cognizant.ormlearnformapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearnformapping.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}

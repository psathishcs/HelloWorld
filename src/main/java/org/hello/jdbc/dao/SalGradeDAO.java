package org.hello.jdbc.dao;

import org.hello.jdbc.model.SalGrade;

import java.util.List;

public interface SalGradeDAO {
	public void save(SalGrade salGrade);
	public void deleteById(int id);
	public SalGrade getById(int id);
	public List<SalGrade> getAll();
}

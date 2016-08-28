package org.hello.jdbc.dao;

import java.util.List;

import org.hello.jdbc.model.SalGrade;

public interface SalGradeDAO {
	public void save(SalGrade salGrade);
	public void deleteById(int id);
	public SalGrade getById(int id);
	public List<SalGrade> getAll();
}

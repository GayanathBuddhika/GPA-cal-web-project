package com.example.demo.service;

import com.example.demo.model.MarkModel;
import com.example.demo.model.StudentModel;

public interface MarkeService {

	public Iterable<MarkModel> addMark(Iterable<MarkModel> marks);

	public Iterable<MarkModel> getMark(String epnum, Integer year, Integer sem);

	public Iterable<MarkModel> getMarks(String epnum);
}

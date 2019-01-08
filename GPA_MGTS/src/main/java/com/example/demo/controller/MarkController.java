package com.example.demo.controller;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarkModel;
import com.example.demo.model.StudentModel;
import com.example.demo.service.MarkeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.mysql.fabric.xmlrpc.base.Array;
@RestController
public class MarkController {
//	
	double totalgradevalue=0;
	double gradeValue;
	Integer totalCreditValue = 0;
	double gpa;
//	int additionValue = 0;
  // List<Integer> a1 = (List<Integer>) new Array();
   @Autowired
	private MarkeService markeService;
	@PostMapping("/api/addMarks")
	public Iterable<MarkModel> addMark(@RequestBody Iterable<MarkModel> marks) {
		System.out.println("this is mark controller");
		return markeService.addMark(marks);
		
	}
	@GetMapping("/api/getmark/{epnum}/{year}/{sem}")
	private Iterable<MarkModel> getmark(@PathVariable String epnum, @PathVariable Integer year, @PathVariable Integer sem){
		
		return markeService.getMark(epnum,year,sem);
		//Iterable<MarkModel> mark=  markeService.getMark(epnum,year,sem);
//		JSONObject jsonObj=new JSONObject(jsonMark);
//
//		String name=jsonObj.getString(“name”);
//
//		int age=jsonObj.getInt(“age”);
//		ObjectMapper mapper=new ObjectMapper();
//
//		MarkModel mark=mapper.readValue(jsonMark,MarkModel.class);
//		
//		System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		System.out.println(IterableUtils.size(mark));
//		/*for(int x=0;x<=IterableUtils.size(mark);x++){
//			String m= 
//		}*/
//		for (MarkModel marks: mark){
//		if(year = 1) {	
//			String m = marks.getGrade();
//			// if (a )
//			Integer c  = marks.getCredit();
//			creditValue = creditValue + c;
//			Integer n = c * gradevalue;
//			additionValue = additonvalue + n;
//			a1.add(b);
//			
//		}
			
			
		//}
		
		//return null;
	}
	@GetMapping("/api/getmarks/{epnum}")
	private double getgpa(@PathVariable String epnum){
		System.out.println("err mark1");
		Iterable<MarkModel>mark=markeService.getMarks(epnum);
		System.out.println("err mark2");
		for(MarkModel marks:mark) {
			Integer year=marks.getYear();
			String grade=marks.getGrade();
			Integer credit=marks.getCredit();
			
			
			switch (grade) {
            case "A+":
                gradeValue = credit * 4;
                break;
            case "A":
                gradeValue = credit * 4;
                break;
            case "A-":
            	gradeValue= credit * 3.70;
                break;
            case "B+":
            	gradeValue =  credit * 3.30;
                break;
            case "B":
            	gradeValue =  credit* 3;
                break;
            case "B-":
            	gradeValue =credit * 2.70;
                break;
            case "C+":
            	gradeValue= credit* 2.30;
                break;
            case "C":
            	gradeValue = credit* 2;
                break;
            case "C-":
            	gradeValue = credit* 1.70;
                break;
            case "D+":
            	gradeValue =credit* 1.30;
                break;
            case "D":
            	gradeValue=credit* 1;
                break;
            case "E":
            	gradeValue= credit* 0;
                break;
            default:
            	System.out.println("err mark");

        }
			System.out.println("err mark3");
			totalgradevalue= totalgradevalue+ gradeValue;
			System.out.println("err mark4");
			totalCreditValue=totalCreditValue+credit;
			
//			if(year==1) {
//				
//			}
			
		}
		gpa=totalgradevalue/totalCreditValue;
		return gpa;
	}
}

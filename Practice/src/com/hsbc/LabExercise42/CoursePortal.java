package com.hsbc.LabExercise42;

import java.util.ArrayList;
import java.util.List;

public class CoursePortal {
	public static void main(String[] args) {
		
		List<Courses> list = new ArrayList<>();
		Registration r1=new Registration();
		r1.register(list);
		
		r1.deregister(list);
		
		System.out.println(list);
	}
}

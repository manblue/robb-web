package com.robb.test;

import com.robb.asm.DefaultManager2Controller;
import com.robb.manager.RobbManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class ccClass = DefaultManager2Controller.buildControClass(RobbManager.class);
		System.out.println("----"+ccClass);
	}

}

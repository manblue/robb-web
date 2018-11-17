package com.robb.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;

import com.robb.asm.DefaultManager2Controller;
import com.robb.manager.RobbManager;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.tree.ClassNode;

public class test {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// TODO Auto-generated method stub

//		Class ccClass = DefaultManager2Controller.buildControClass(RobbManager.class);
//		System.out.println("----"+ccClass);


		for (Method md : RobbManager.class.getDeclaredMethods()) {
//			if (!md.getName().equals("add")) {
//				continue;
//			}
			
			String mdes = Type.getMethodDescriptor(md);
			Type type = Type.getMethodType(mdes);
			type = Type.getType(md);
			System.out.println("----class method:"+md.getName()+"-MethodDescriptor:"+Type.getMethodDescriptor(md));
			for (Annotation ma : md.getAnnotations()) {
				System.out.println("----class method:"+md.getName()+"-annotationType:"+ma.annotationType());
				for (Method amd : ma.annotationType().getDeclaredMethods()) {
					amd.getModifiers();
					System.out.println("----class method:"+md.getName()+"-annotationType:"+ma.annotationType()+"-field:"+amd.getName()+"-MethodDescriptor:"
				+Type.getMethodDescriptor(amd)+"-val:");

					Object val = amd.invoke(ma,null);
					if (val !=null) {
						if (val.getClass().isArray()) {
							for (Object object : (Object[])val) {
								System.out.println("----------"+object);
							}
						}else {
							System.out.println("----------"+val);
						}
					}

				}
				
			}
			
			
			
			//---------------------------------------
//			InputStream is = managerClass.getClassLoader().getSystemResourceAsStream(managerClass.getName().replace(".", "/")+".class");

			ClassReader reader = new ClassReader(ClassLoader.getSystemResourceAsStream(RobbManager.class.getName().replace(".", "/")+".class"));
			ClassNode node = new ClassNode();
			
			
			
		}
		
		
	}

}

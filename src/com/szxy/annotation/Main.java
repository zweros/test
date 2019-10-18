package com.szxy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.szxy.pojo.Users;

public class Main {

	public static void main(String[] args) throws Exception {
		Class clazz =
			 Class.forName("com.szxy.pojo.Users");
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println(annotations.length+" "+annotations[0]);
		
	   Field[] fields = clazz.getDeclaredFields();
	   for (Field f : fields) {
		   Column col = f.getAnnotation(Column.class);
		   System.out.println(col.columnName()+" "+col.length()+" "+col.type());
	   }
	  
	   System.out.println(""+"12"=="12"&&"12".equals("12"));
	   System.out.println("12"=="12"&&" 12".equals("12"));
		
	}
	
}

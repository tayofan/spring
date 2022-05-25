package com.jsp.controller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

public class HttpRequestParameterAdapter {
	
	public static <T>T execute(HttpServletRequest request, Class<T> className) throws Exception{
		//의존성 확인 및 조립
		Method[] methods = className.getMethods();
		
		//인스턴스 생성
		T obj = className.newInstance();
		
		//setter 확인
		for(Method method : methods) {
			if(method.getName().indexOf("set")==0) {
				// 맴버변수???
				String requestParamName = method.getName().replace("set", "");
				requestParamName = (requestParamName.charAt(0)+"").toLowerCase() + requestParamName.substring(1);
				
				//여기 부터 이해 안감
				//TODO 
				String[] paramValues = request.getParameterValues(requestParamName);
				
				if(paramValues != null && paramValues.length > 0) {
					if(method.getParameterTypes()[0].isArray()) { //배열 판별
						method.invoke(obj, new Object[] {paramValues});
					}else {
						method.invoke(obj, paramValues[0]);
					}
				}
			}
		}
		return obj;
	}
}

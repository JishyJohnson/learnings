package com.java8.learning.nashorn;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornLearning {

	public static void main(String[] args) throws Exception {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("res/nashorn1.js"));

		Invocable invocable = (Invocable) engine;
		Object result = invocable.invokeFunction("fun1", "Peter Parker");
		System.out.println(result);
		System.out.println(result.getClass());

		invocable.invokeFunction("fun2", new Date());
		invocable.invokeFunction("fun2", LocalDateTime.now());
		invocable.invokeFunction("fun2", new Person());
	}

}

package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void test() {
		System.out.println("Testing");
	}
	
	@Test
	void test2() {
		System.out.println("Testing2");
	}
	
	@BeforeEach
	void test3() {
		System.out.println("Before Testing");
	}
	
	@AfterEach
	void test4() {
		System.out.println("After Testing");
	}
	
	@AfterAll
	static void test5() {
		System.out.println("After Testing");
	}
	
	@BeforeAll
	static void test6() {
		System.out.println("Before Testing");
	}

}

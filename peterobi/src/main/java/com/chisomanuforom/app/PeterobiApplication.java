package com.chisomanuforom.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PeterobiApplication extends SpringBootServletInitializer{

	
	//private final UserRepository userRepo;
	
	
//	@Autowired
//	public PeterobiApplication(UserRepository userRepo) {
//		super();
//		this.userRepo = userRepo;
//	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(PeterobiApplication.class);
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(PeterobiApplication.class, args);
		
		System.out.println("Hello World!");
	}
//	
//	@Override
//	public void run(String... args) throws Exception{
//		
////		
////		String sql = "Select * from student;";
////		
////		List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
//	 
//		
//		List<User> students = userRepo.findAll();
//		
//	   students.forEach(System.out :: println);
//		
//	}

}

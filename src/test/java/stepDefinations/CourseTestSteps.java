package stepDefinations;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.course.bean.Course;
import com.home.course.courseService.CourseService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CourseTestSteps {

	@Autowired
	CourseService courseService;
	
	@Given("getCourse method is called")
	public void get_course_method() {
		System.out.println("getCourse method given");
	}

	@When(" After getCourse method is called")
	public void get_course_method_is_called() {
		System.out.println("getCourse method called");
	}

	@Then("return List<Course>")
	public void return_list_course() {
		Course c = new Course();
		List<Course> x = new ArrayList<>();
		c.setCourseId("123");
		x.add(c);
		System.out.println(x);		
	}

}

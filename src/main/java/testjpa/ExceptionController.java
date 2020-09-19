package testjpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.sql.SQLException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value = TestException.class)
	public ResponseEntity<Object> exception(TestException exception) {
		return null;
	}
	}



/**
 * 
 */
package org.learntek.add.controller;

import org.learntek.add.model.Input;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class SubController {
	@PostMapping("/sub")
	public ResponseEntity<String> addOperation(@RequestBody Input input){
		int sum = input.getNo1()-input.getNo2();
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(sum+"", HttpStatus.OK);
		return responseEntity;
	}
}

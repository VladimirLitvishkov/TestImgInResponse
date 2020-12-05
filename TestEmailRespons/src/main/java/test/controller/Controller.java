package test.controller;

import java.awt.image.BufferedImage;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@GetMapping("/response")
	public BufferedImage response() {
		BufferedImage pixel = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
//		pixel.setRGB(0, 0, (0xFF));
		return pixel;
	}

}

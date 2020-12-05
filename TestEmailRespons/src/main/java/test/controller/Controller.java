package test.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@GetMapping("/response")
	public void response(HttpServletRequest request, HttpServletResponse response) {
		BufferedImage pixel = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		pixel.setRGB(0, 0, (0xFF));
		response.setContentType("image/png");
		OutputStream os;
		try {
			os = response.getOutputStream();
			ImageIO.write(pixel, "png", os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

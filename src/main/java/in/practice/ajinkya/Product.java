package in.practice.ajinkya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Product {
	@Value("${my.app.pid}")
	private Integer pid;
	@Value("${my.app.pcost}")
	private Integer pcost;
	@Value("${my.app.pname}")
	private String Pname;
}

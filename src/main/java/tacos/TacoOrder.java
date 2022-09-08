package tacos;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.CreditCardNumber;
import tacos.web.DesignTacoController;

@Slf4j
@Data
public class TacoOrder {

	@NotBlank(message = "Delivery name required.")
	private String deliveryName;

	@NotBlank(message = "Street is required.")
	private String deliveryStreet;

	@NotBlank(message = "City is required.")
	private String deliveryCity;

	@NotBlank(message = "State is required.")
	private String deliveryState;

	@NotBlank(message = "ZIP is required.")
	private String deliveryZip;

	@CreditCardNumber(message = "Not a valid card number.")
	private String ccNumber;

	@Pattern(regexp = "(^0[1-9]|1[0-2])([\\/])([2-9][0-9])",
			message="Must be formatted MM/YY")

	@Digits(integer = 3, fraction = 0, message="Invalid CVV")
	private String ccExpiration;


	private String ccCVV;	
	private List<Taco> tacos = new ArrayList<>();
        
	public void addTaco(Taco taco) {
		log.info("Create order {}", taco);
		this.tacos.add(taco);
	}
	
}

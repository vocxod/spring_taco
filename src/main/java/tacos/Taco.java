package tacos;

import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
	@NotNull
	@Size(min=5, message = "This field is required. Fill it 5 char min length, please.")
	private String name;

	@NotNull
	@Size(min = 1, message = "Need select min one ingredient.")
	private List<Ingredient> ingredients;
}

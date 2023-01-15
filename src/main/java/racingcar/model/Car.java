package racingcar.model;

import racingcar.util.validator.NameValidator;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
		NameValidator.validateCarName(name);
	}

	public String getName() {
		return name;
	}
	
}

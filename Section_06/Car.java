public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setModel(String model) {
		String validModel = model.toLowerCase();

		if (validModel.equals("porsche") || validModel.equals("commodore")) {
			this.model = model;
		}
		else {
			this.model = "unknown";
		}
	}

	public String getModel() {
		return this.model;
	}


	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();

		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel() + ".");
	}
}


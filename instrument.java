package abstract_interface.ass2;

public abstract class instrument {

	String instrument_name;
	
	public instrument(String instrument_name) {
		super();
		this.instrument_name = instrument_name;
	}

	
	abstract  void play();
	
}

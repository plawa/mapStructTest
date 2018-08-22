package logic;


import data.SimpleDestination;
import data.SimpleSource;
import mapper.DataMapper;

public class MyApp {

	
	private static final String TEST_NAME = "test name";
	private static final String TEST_DESCRIPTION = "test description";

	public static void main(String[] args) {
		SimpleSource source = new SimpleSource();
		source.setDescription(TEST_DESCRIPTION);
		source.setName(TEST_NAME);
		
		SimpleDestination destination = DataMapper.INSTANCE.sourceToDestination(source);
		
		if (!TEST_DESCRIPTION.equals(destination.getDescription())){
			throw new IllegalStateException("mapper failure");
		}
		
		if (!TEST_NAME.equals(destination.getName())){
			throw new IllegalStateException("mapper failure");
		}
	}
}

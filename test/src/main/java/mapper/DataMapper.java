package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import data.SimpleDestination;
import data.SimpleSource;

@Mapper
public interface DataMapper {


	DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);
	
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
	 
}

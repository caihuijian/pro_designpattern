package criteria;

import java.util.List;

import person.Person;

public interface Criteria {
	   public List<Person> meetCriteria(List<Person> persons);
	}

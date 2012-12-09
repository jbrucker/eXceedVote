package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Criterion extends Model {

	@Id
	public Long id;
	
	@Constraints.Required
	public String question;
	
	public static Finder<Long, Criterion> find = new Finder<Long, Criterion>(Long.class, Criterion.class);
	
	public String toString() {
		return "";
	}
	
}
package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author Komal Shrivastava
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 1 put your implementation here
		String temp = "";
		if(input.length() == 0){
			return null;
		} else if(input.length() == 1) {
			return input;
		} else if (input.length() == 2) {
			String swap = "";
			swap = swap.concat(input.substring(1));
			swap = swap.concat(input.substring(0,1));
			return swap;
		} else {
			//(input.length() > 2)
			String front = input.substring(0, 2);
			temp = input.substring(2);
			temp = temp.concat(front);
			temp = temp.concat(front);
			return temp;
		}
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}

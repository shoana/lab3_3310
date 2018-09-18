import java.util.*;

/**
 * The class contains a collection of BuddyInfo objects 
 * and methods addBuddy() and removeBuddy()
 * @author Shoana Sharma
 * @version September 18th, 2018
 */
public class AddressBook {
	
	//LinkedList of BuddyInfo objects
	static LinkedList ll = new LinkedList <BuddyInfo>();

	/**
	 * addBuddy adds the buddy to the linkedlist
	 * @param b1 is the parameter from the BuddyInfo class
	 */
	public static void addBuddy(BuddyInfo b1) {
		
		ll.add(b1);
		
	}

	/**
	 * removeBuddy removes the buddy from the linkedlist
	 * @param b1 is the parameter from the BuddyInfo class
	 */
	public static void removeBuddy(BuddyInfo b1) {
		
		ll.remove(b1);
		
	}
	
	public static void main(String[] args) {
		
		//creating new names for buddies
		BuddyInfo a = new BuddyInfo();
		a.setName("Shoana");
		BuddyInfo b = new BuddyInfo();
		b.setName("Homer");
		BuddyInfo c = new BuddyInfo();
		c.setName("Anne");
		
		//using the methods from this class
		addBuddy(a);
		removeBuddy(a);
		addBuddy(b);
		addBuddy(c);
		
		//iterator used to print out the list
		Iterator iter = ll.iterator();
		while(iter.hasNext()) {
			System.out.println(((BuddyInfo) iter.next()).getName());
		}
		
		System.out.println("AddressBook");

	}

}

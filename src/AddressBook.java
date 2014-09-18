import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies;
	
	public static void main(String args[])
	{
		System.out.println("Address book");
		BuddyInfo b = new BuddyInfo();
		AddressBook book = new AddressBook();
		book.addBuddy(b);
		book.removeBuddy(b);
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		buddies.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy)
	{
		buddies.remove(buddy);
	}
}

import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook()
	{
		buddies = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		buddies.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy)
	{
		buddies.remove(buddy);
	}
	
	public static void main(String args[])
	{
		BuddyInfo b = new BuddyInfo();
		AddressBook book = new AddressBook();
		book.addBuddy(b);
		book.removeBuddy(b);
	}
}

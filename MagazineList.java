//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
	private MagazineNode list;

	//----------------------------------------------------------------
	//  Sets up an initially empty list of magazines.
	//----------------------------------------------------------------
	public MagazineList()
	{
		list = null;
	}
	//----------------------------------------------------------------
	//  Creates a new MagazineNode object and adds it to the end of
	//  the linked list.
	//----------------------------------------------------------------
	public void add (Magazine mag)
	{
		MagazineNode node = new MagazineNode (mag);
		MagazineNode current;

		if (list == null)
			list = node;
		else
		{
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	//----------------------------------------------------------------
	//  Returns this list of magazines as a string.
	//----------------------------------------------------------------
	public String toString ()
	{
		String result = "";

		MagazineNode current = list;

		while (current != null)
		{
			result += current.magazine + "\n";
			current = current.next;
		}

		return result;
	}
	public void addToFront(Magazine mag)
	{
	  MagazineNode newNode = new MagazineNode(mag);
	  newNode.next = list;
	  list = newNode;
	}
	public void addToEnd (Magazine mag)
	{
		MagazineNode newNode = new MagazineNode(mag);
		MagazineNode current = list;
		if (list == null)
			list = newNode;
		else 
		{
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
		}
	 }
	public void removeFirst()
	{
		list = list.next;
	}
	public void removeLast()
	{
		MagazineNode current = list;
		MagazineNode previous = list;
		while (current.next != null)
		{
			previous = current;
			current = current.next;
		}
		previous.next =  null;
	}
	public void print()
	{
		MagazineNode current = list;
		while (current.next != null)
		{
		System.out.println(current.magazine);
		current = current.next;
		}
	}
	//*****************************************************************
	//  An inner class that represents a node in the magazine list.
	//  The public variables are accessed by the MagazineList class.
	//*****************************************************************
	private class MagazineNode
	{
		public Magazine magazine;
		public MagazineNode next;

		//--------------------------------------------------------------
		//  Sets up the node
		//--------------------------------------------------------------
		public MagazineNode (Magazine mag)
		{
			magazine = mag;
			next = null;
		}
	}
}
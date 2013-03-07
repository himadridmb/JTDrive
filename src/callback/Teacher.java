package callback;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	List<CallBack > callbackList;
	String name;
	
	public Teacher(String name)
	{
		this.name = name;
		callbackList = new ArrayList<CallBack>();
	}
	
	public void register(CallBack callback)
	{
		callbackList.add(callback);
	}
	
	public void callTheRoll()
	{
		System.out.println("Teacher "+name+" calling roll call ");
		for(CallBack back : callbackList)
		{
			back.callBack();
		}
	}

}

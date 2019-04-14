//
//
//
//
//
//
public void writeToLog(String clubName, String eventName, String eventLocation, String eventTime)
{
	File location = new File("location.txt");
	PrintWriter locationWriter = new PrintWriter(location);
	locationWriter.println(clubName + "/" + eventName + "/" + eventLocation + "/" + eventTime);
}

public ArrayList studySpot()
{
	Scanner readSpot = new Scanner(new File("location.txt"))

	ArrayList <String> newSpot = new ArrayList <String>();

	while (readspot.next() != null)
	{
		String readString = readSpot.next();
		newSpot.add(readString);
	}
	readSpot.close();
	return newSpot;
}
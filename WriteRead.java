//
// 2019 ACM Hackathon
// Code to copy Userinputs through a GUI and be able to make it into an ArrayList and use it
// to list all the sutdying spots that will be useful for students at UCSC.
// - Richard Choe Nelson Yip Naman Bhushan Tim Lim
//
//
public void writeToLog(String a, String b, String c)
{
	File location = new File("location.txt");
	PrintWriter locationWriter = new PrintWriter(location);
	locationWriter.println(a + "/" + b + "/" + c);
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
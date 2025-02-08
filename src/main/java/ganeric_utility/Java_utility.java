package ganeric_utility;

import java.util.Random;

public class Java_utility {
	/*
	 * This method is used to avoid Duplicates*/
public int getRandomNumber() 
{
	Random ran = new Random();
	int ranNum = ran.nextInt(1000);
	return ranNum;
}
public void JavaSleep(int sec) throws Throwable
{
	Thread.sleep(sec);
}

}

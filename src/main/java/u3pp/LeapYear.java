package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * when isLeapYear is called, true or false is returned based on wether year is a leap year or not
   less than 1582, return false
   divisible by 4 and not 100, return true
   divisible by 400, return false
	 */
	public static boolean isLeapYear(int year) {
		if (year < 1582) {
    return false;
    }
    else if (year%4 == 0) {
      if (year%100 != 0 || year%400 == 0) {
        return true;
      }
      else
        return false;
    }
    else {
      return false;
    }
	}
}
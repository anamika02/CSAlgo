
public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("MDLLX"));

	}
	
	public static int romanToInt(String s) {
		String [] units = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] tens = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String [] hundreds = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String [] thousands = new String[] {"","M","MM","MMM"};
		int unitPlace = 0;
		int tensPlace = 0;
		int hundredsPlace = 0;
		int thousandsPlace = 0;
		String parseNext ="";
		for(int i=units.length-1;i>0;i--)
		{
			
			if(s.endsWith(units[i])) {
				if(i==5) {
					if(s.endsWith(units[4]))
						continue;
				}
				unitPlace = i;
				System.out.println("unitPlace="+i);
				parseNext = s.substring(0,(s.length()-units[i].length()));
				System.out.println("parseNext="+parseNext);
				break;
			}
			parseNext = s;
		}
		if(parseNext==null || parseNext.equals(""))
			return unitPlace;
		
		for(int j=tens.length-1;j>0;j--)
		{
			if(parseNext.endsWith(tens[j])) {
				if(j==5) {
					if(parseNext.endsWith(tens[4]))
						continue;
				}
				tensPlace = j;
				System.out.println("tensPlace="+j);
				//System.out.println("next="+parseNext.substring(0,(parseNext.length()-tens[j].length()));
				parseNext = parseNext.substring(0,(parseNext.length()-tens[j].length()));
				System.out.println("parseNext="+parseNext);
				break;
			}
			
		}		
		
		if(parseNext==null || parseNext.equals(""))
			return 10*tensPlace+unitPlace;
		
		for(int k=hundreds.length-1;k>0;k--)
		{
			if(parseNext.endsWith(hundreds[k])) {
				if(k==5) {
					if(parseNext.endsWith(hundreds[4]))
						continue;
				}
				hundredsPlace = k;
				System.out.println("hundredsPlace="+k);
				//System.out.println("next="+parseNext.substring(0,(parseNext.length()-tens[j].length()));
				parseNext = parseNext.substring(0,(parseNext.length()-hundreds[k].length()));
				System.out.println("parseNext="+parseNext);
				break;
			}
			
		}	
		
		if(parseNext==null || parseNext.equals(""))
			return 100*hundredsPlace+10*tensPlace+unitPlace;
		
		for(int m=thousands.length-1;m>0;m--)
		{
			if(parseNext.endsWith(thousands[m])) {
				if(m==5) {
					if(parseNext.endsWith(thousands[4]))
						continue;
				}
				thousandsPlace = m;
				System.out.println("thousandsPlace="+m);
				//System.out.println("next="+parseNext.substring(0,(parseNext.length()-tens[j].length()));
				parseNext = parseNext.substring(0,(parseNext.length()-thousands[m].length()));
				System.out.println("parseNext="+parseNext);
				break;
			}
			
		}	
		
		if(parseNext==null || parseNext.equals(""))
			return 1000*thousandsPlace+100*hundredsPlace+10*tensPlace+unitPlace;
		
		return 0;
	        
	    }

}

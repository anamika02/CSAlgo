import java.util.HashMap;

public class IntToRoman {
//	Symbol       Value
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000
	public static void main(String[] args) {
		System.out.println(intToRoman(1994));

	}
public static String intToRoman(int num) {
	String [] units = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String [] tens = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String [] hundreds = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	String [] thousands = new String[] {"","M","MM","MMM"};
	//System.out.println(thousands[num/1000]);
	//System.out.println(hundreds[(num%1000)/100]);
	String finalStr = thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num/10)%10] + units[num%10];
	
	return finalStr;
        
    }

}

package CHARConversion;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;

public class LatinConversion extends AbstractTransformation{
	
	//to define a container for different objects objects
	HashMap<Character,String> map = new HashMap<Character,String>();

	
	public LatinConversion() {
		//to refer to the AbstractTransformation methods
		super();
		initializeMap();     }
	
	
	public String convertString(String text)	{
		String result="";
		char[] ar_text;
		
		ar_text = text.toCharArray();
		for(int i=0;i<ar_text.length;i++)
		{
			result += performConversion(ar_text[i]);
		}
		return result;       					}
	
	
	private String performConversion(char input)   {
		String result = String.valueOf(input);
		if (map.containsKey(input))
		{
			result =  map.get(input);
		}
		else
			result = "_";
		return result;                    		 	}
	
	
	private void initializeMap() 	{
		map.put('Ö', "Ö");
		map.put('ç', "ç");
		map.put('ä', "ä");
		map.put('ü', "ü");
		map.put('é', "é");
		map.put('ŕ', "a");
		map.put('č', "e");
		map.put('ß', "ß");
		map.put('@', "@");
		map.put('#', "#");
		map.put('[', "[");
		map.put(']', "]");
		map.put('{', "{");
		map.put('}', "}");
		map.put('‘', "");
		map.put(':', ":");
		map.put(';', ";");
		map.put('!', "!");
		map.put('?', "?");
		map.put('%', "%");
		map.put('^', "^");
		map.put('~', "");
		map.put('<', "<");
		map.put('>', ">");
		map.put('§', "§");
		map.put('A', "A");
		map.put('B', "B");
		map.put('C', "C");
		map.put('D', "D");
		map.put('E', "E");
		map.put('F', "F");
		map.put('G', "G");
		map.put('H', "H");
		map.put('I', "I");
		map.put('J', "J");
		map.put('K', "K");
		map.put('L', "L");
		map.put('M', "M");
		map.put('N', "N");
		map.put('O', "O");
		map.put('P', "P");
		map.put('Q', "Q");
		map.put('R', "R");
		map.put('S', "S");
		map.put('T', "T");
		map.put('U', "U");
		map.put('V', "V");
		map.put('W', "W");
		map.put('X', "X");
		map.put('Y', "Y");
		map.put('Z', "Z");
		map.put('a', "a");
		map.put('b', "b");
		map.put('c', "c");
		map.put('d', "d");
		map.put('e', "e");
		map.put('f', "f");
		map.put('g', "g");
		map.put('h', "h");
		map.put('i', "i");
		map.put('j', "j");
		map.put('k', "k");
		map.put('l', "l");
		map.put('m', "m");
		map.put('n', "n");
		map.put('o', "o");
		map.put('p', "p");
		map.put('q', "q");
		map.put('r', "r");
		map.put('s', "s");
		map.put('t', "t");
		map.put('u', "u");
		map.put('v', "v");
		map.put('w', "w");
		map.put('x', "x");
		map.put('y', "y");
		map.put('z', "z");
		map.put('0', "0");
		map.put('1', "1");
		map.put('2', "2");
		map.put('3', "3");
		map.put('4', "4");
		map.put('5', "5");
		map.put('6', "6");
		map.put('7', "7");
		map.put('8', "8");
		map.put('9', "9");
		map.put(' ', " ");
		map.put('.', ".");
		map.put(',', ",");
		map.put('-', "-");
		map.put('(', "(");
		map.put(')', ")");
		map.put('/', "/");
		map.put('=', "=");
		map.put('*', "*");
		map.put('+', "+");
		map.put('&', "&amp;");
		map.put('"', "\"");
		map.put('\\', "\\");
		map.put('_', "_");
		map.put('`', "`");
		map.put('¦', "¦");
		map.put('°', "°");
		map.put('ę', "e");
		map.put('ë', "ë");
		map.put('Ń', "N");
		map.put('â', "â");
		map.put('\u2122', "");  
		map.put('\u00A9', "©"); 
		map.put('\u00AE', "®"); 
		map.put('\u212e', "e"); 
		map.put('\u2030', "0/00"); 
		map.put('µ', "µ"); 
		map.put('$', "$"); 
		map.put('\u0092', "'"); 
		map.put('\u007C', "|"); 
		map.put('¢', "¢"); 
		map.put('£', "£"); 
		map.put('¥', "¥"); 
		map.put('\u00AB', "«"); 
		map.put('\u00B1', "±"); 
		map.put('²', "²"); 
		map.put('\u00B3', "³"); 
		map.put('\u00BC', "¼"); 
		map.put('½', "½");
		map.put('\u00BE', "¾");
		map.put('\u00D7', "×");
		map.put('Ø', "Ø");
		map.put('à', "à");
		map.put('á', "á");
		map.put('ã', "ã");
		map.put('å', "å");
		map.put('æ', "æ");
		map.put('è', "è");
		map.put('ê', "ê");
		map.put('÷', "÷");
		map.put('Δ', "");
		map.put('Σ', "");
		map.put('Ω', "");
		map.put('α', "");
		map.put('β', "");
		map.put('μ', "u");
		map.put('≤', "&lt;=");
		map.put('≥', "&gt;=");
		map.put('㎡', "m2");
		map.put('–', "-");
		map.put('“', "\"");
		map.put('”', "\"");
		map.put('″', "\"");
		map.put('€', "E");
		map.put('Ⅰ', "I");
		map.put('Ⅱ', "II");
		map.put('Ⅲ', "III");
		map.put('Ⅳ', "IV");
		map.put('Ⅴ', "V");
		map.put('Ⅵ', "VI");
		map.put('Ⅶ', "VII");
		map.put('Ⅷ', "VIII");
		map.put('Ⅸ', "IX");
		map.put('Ⅹ', "X");
		map.put('´', "´");
		map.put('î', "î");
		map.put('’', "`");
		map.put('℃', "C");  }
	
	
	public void execute(InputStream in, OutputStream out)
	throws StreamTransformationException {
		// Add your code here

		boolean isText = true;

		try {

			BufferedReader bufReader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
			String lineOfStream = null;
		    StringBuffer resultline = new StringBuffer();
			String strResultline;
			String conversion;

			char[] inputCharArray;

			while ((lineOfStream = bufReader.readLine()) != null) 
			{
				resultline.append(lineOfStream);
			}
			
			strResultline = resultline.toString();
			strResultline = strResultline.replaceAll("&amp;", "&");
			strResultline = strResultline.replaceAll("&lt;", "(");
			strResultline = strResultline.replaceAll("&gt;", ")");
			strResultline = strResultline.replaceAll("&quot;", "\"");
			strResultline = strResultline.replaceAll("&#39;", "\'");
			strResultline = strResultline.replaceAll("&#0153;", "");
			strResultline = strResultline.replaceAll("&#0169;", "©");
			strResultline = strResultline.replaceAll("&#0174;", "®");
			resultline = new StringBuffer(strResultline);
		
			inputCharArray = strResultline.toCharArray();


			int sbcounter = 0;

			for (int i = 0; i < inputCharArray.length; i++) 
			{

				if(inputCharArray[i] == '<')
				{
					isText = false;
				}
				else if (inputCharArray[i] == '>')
				{
					isText = true;
				}

				if(isText && (inputCharArray[i] != '>'))
				{
					conversion = performConversion(inputCharArray[i]);

					resultline.deleteCharAt(sbcounter);
					resultline.insert(sbcounter, conversion);

					sbcounter = sbcounter + conversion.length();
					
				}
				else
				{
					sbcounter++;
				}
			}						

			out.write(resultline.toString().getBytes("UTF-8"));
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}

	@Override
	public void transform(TransformationInput arg0, TransformationOutput arg1)
	throws StreamTransformationException {
		// TODO Auto-generated method stub

		this.execute(arg0.getInputPayload().getInputStream(),arg1.getOutputPayload().getOutputStream());


	}

	

}

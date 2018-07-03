package xingtest;

import java.util.Arrays;



public class test {
	

	  public static String getSignature(String appKey,  String secret,  String timestamp, String nonce) {
	    	
	        String[] params = {appKey, secret, timestamp, nonce};
	        
	        /*
	        for(int i=0; i< params.length; i++) {
	            System.out.print(params[i] + "  ");
	        }
	        
	        */
	        //System.out.println();
	        
	        Arrays.sort(params);
	        
	        System.out.println("----start new sort params----");
	        for(int i=0; i< params.length; i++) {
	            System.out.print(params[i] + "  ");
	        }
	        System.out.println();
	        System.out.println("----end new sort params----");
	        
	        
	        StringBuilder plaintext = new StringBuilder("");
	        for (int i=0; i< params.length; i++){
	            plaintext.append(params[i]);
	        }
	        System.out.println("-----start--plaintext-----");
	        System.out.println(plaintext);
	        
	        
	        try {
	        	return "AAAAA";
	  //        return Base64.encodeBase64String(HMACSHA1.getHMAC_SHA1(plaintext.toString(), secret));
	            
	        }catch (Exception e) {
	            return "";
	        }
	    }
	  
	  
	  public static void main(String[] args) {
		
		String tmp = test.getSignature("222", "111", "33", "44");
		System.out.println("-----start--print tmp-------");
		System.out.println(tmp);
		System.out.println("-----end----print tmp-------");
	}
	

}

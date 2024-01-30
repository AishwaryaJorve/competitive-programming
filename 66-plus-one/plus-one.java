import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {

        StringBuffer str=new StringBuffer();

        for(int i=0;i<digits.length;i++){
        str=str.append(digits[i]);
        }

        BigInteger no= new BigInteger(str.toString());
        BigInteger result = no.add(BigInteger.ONE);
        char[] chars=result.toString().toCharArray();
        int[] resultArray=new int[chars.length];

        System.out.println(str);

        for(int i=0;i<chars.length;i++){
             resultArray[i]=chars[i]- '0';
        }

        return resultArray;
    }
}
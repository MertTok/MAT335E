package Homework2;

public class Encryption {
    private long EncryptedText;
    private long Key;

    public Encryption(long EncryptedText, long Key){
        if(!validate(EncryptedText, Key)) return;

        this.EncryptedText = EncryptedText;
        this.Key = Key;
    }

    public long getEncryptedText(){
        return this.EncryptedText;
    }

    public void setEncryptedText(long EncryptedText){
        this.EncryptedText = EncryptedText;
    }

    public long getKey(){
        return this.Key;
    }

    public void setKey(long Key){
        this.Key = Key;
    }

    private static boolean validate(long EncryptedText, long Key){
        // Find the sum of digits in this.Key
        int sumOfKeyDigits = 0;
        long value = Key;
        int textLength = 0;

        while(value > 0)
        {
            if(value % 10 != 2 && value % 10 != 3)
            {
                System.out.println("Key is not proper.");
                return false;
            }
            sumOfKeyDigits += value % 10;
            value /= 10;
        }

        // Find Encrypted Text Length
        value = EncryptedText;

        while(value > 0)
        {
            textLength++;
            value /= 10;
        }

        // Compare the sum to text length
        if(sumOfKeyDigits != textLength)
        {
            System.out.println("The key and encrypted text are not compatible and cannot be resolved");
            return false;
        }

        return true;
    }

    public String decrypt(){
        String DecryptedText = "";
        int lastVisitedDigit = 0;
        long lastEncryptedValue = this.getEncryptedText();
        char ch = '0';

        for(long currentKeyDigit = this.getKey(); currentKeyDigit % 10 != 0; currentKeyDigit /= 10){
            if(currentKeyDigit % 10 == 2)
            {
                ch = (char) ( lastEncryptedValue % 100 );
                lastVisitedDigit += 2;
                lastEncryptedValue /= 100;
            }
            else if(currentKeyDigit % 10 == 3)
            {
                ch = (char) ( lastEncryptedValue % 1000 );
                lastVisitedDigit += 3;
                lastEncryptedValue /= 1000;
            }
            DecryptedText = ch + DecryptedText;
        }

        return DecryptedText;
    }
}

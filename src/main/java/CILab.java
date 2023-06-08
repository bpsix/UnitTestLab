public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    /*Checks if this.myString contains all capital characters
      If it does, return true. Otherwise, return false.
    */
    @Override
    public boolean detectCapitalUse() {
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(Character.isLowerCase(c) || !Character.isAlphabetic(c)) return false;
        }
        return true;
    }
}

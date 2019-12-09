package reverse;

public class Reverse {
    private String string;
    public Reverse(String string){
        this.string=string;
    }


    public String findReverse(){
        String string2= "";
        for (int i=0 ;i<string.length();i++){
            string2 = string2.concat(String.valueOf(string.charAt(string.length()-i-1)));
        }
        return string2;
    }


    public String getString(){
        return string;
    }

    public void setString(String string){
        this.string =string;
    }
}

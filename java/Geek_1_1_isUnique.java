import java.util.HashMap;

public class Geek_1_1_isUnique {

    public static void main(String[] args) {
        String s1="TESt";
        Geek_1_1_isUnique g1=new Geek_1_1_isUnique();
        if(g1.isUnique(s1.toLowerCase())){
            System.out.println("Is Unique True");
        }else{
            System.out.println("Is unique false");
        }

    }
    public boolean isUnique(String s1){

        HashMap map=new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
            if (map.get(s1.charAt(i)) == null) {
                map.put(s1.charAt(i),1);
            }else {
                return false;
            }
        }
        return true;
    }
}

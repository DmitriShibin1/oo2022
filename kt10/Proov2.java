import java.util.HashMap;

public class Proov2 {
    public static void main(String[] args) {
        HashMap<Integer, String> valvajad=new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(3, "Mati");
        System.out.println(valvajad);

        HashMap<String, Integer> skoorid=new HashMap<>();
        skoorid.put("Kati", 5);
        skoorid.put("Hanna", 5);
        skoorid.put("Priit", 4);
       System.out.println(skoorid.get("Kati"));
        for (String skoor:skoorid.keySet()) {
            System.out.println(skoor);
        }
        // System.out.println(skoorid);


    }
}

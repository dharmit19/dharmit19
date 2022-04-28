import java.util.*;
public class threeAC
{
    ArrayList < String > equations = new ArrayList < String > ();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        threeAC obj = new threeAC();
        System.out.print("Enter number of statements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter statement " + (i + 1) + ": ");
            String s = sc.next();
            obj.getEquations(s);
        }
        obj.putEquations();
        obj.quadruples();
        obj.triples();
    }
    public void getEquations(String statement) {
        this.equations.add(statement);
    }
    public void putEquations() {
        System.out.println("The equations are: ");
        for (String s: this.equations) {
            System.out.println(s);
        }
    }
    public void quadruples() {
        String[] q = new String[4];
        System.out.println("Quadruples Representation: ");
        for (int i = 0; i < this.equations.size(); i++) {
            String s = this.equations.get(i);
            for (int j = 0; j < this.equations.get(i).length(); j++) {
                q[0] = String.valueOf((s.charAt(3)));
                q[1] = String.valueOf((s.charAt(2)));
                q[2] = String.valueOf((s.charAt(4)));
                q[3] = String.valueOf((s.charAt(0)));
            }
            System.out.println(Arrays.toString(q));
        }
    }
    public void triples() {
        HashMap < String, Integer > map = new HashMap < > ();
        String[] t = new String[4];
        System.out.println("Triples Representation: "); 
        for (int i = 0; i < this.equations.size(); i++) {
            String s = this.equations.get(i);
            for (int j = 0; j < this.equations.get(i).length(); j++) {
                map.put(String.valueOf(s.charAt(0)), i);
                t[0] = String.valueOf(i);
                t[1] = String.valueOf(s.charAt(3));
                if (map.containsKey(String.valueOf(s.charAt(2)))) 
                {
                    t[2] = String.valueOf(map.get(String.valueOf(s.charAt(2))));
                } 
                else 
                {
                    t[2] = String.valueOf(s.charAt(2));
                }
                if (map.containsKey(String.valueOf(s.charAt(4)))) 
                {
                    t[3] = String.valueOf(map.get(String.valueOf(s.charAt(4))));
                } 
                else 
                {
                    t[3] = (String.valueOf(s.charAt(4)));
                }
            }
            System.out.println(Arrays.toString(t));
        }
    }
}
package BANK;

/**
 *
 * @author Azarya Divino
 */
public class Tulis {

    /**
     * @param args the command line arguments
     */
    private int t;
    private String s;

    public String SetTulisString(String r) {
        this.s = r;
        System.out.println(r);
        return null;
    }

    public int SetTulisInt(int i) {
        this.t = i;
        System.out.println(i);
        return 0;
        // TODO code application logic here
    }

}
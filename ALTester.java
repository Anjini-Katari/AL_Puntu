/***
TNPG: Puntu (Anjini Katari, Jacc Chen)
APCS-- pd07
12-12-21
***/
import java.util.ArrayList;

public class ALTester{

  private ArrayList<Integer> _data;

public ALTester() {
  _data = new ArrayList<Integer>();

} // constructor -> array of length 23

public boolean sortCheck() {
  for (int i = 0; i < _data.size() - 1; i ++) {
    if (_data.get(i) > (_data.get(i + 1))) {
      return false;
    }
    else {
      return true;
    }
  }
} // sortcheck

public static void main(String[] args) {
  ALTester meep = new ALTester();
  ArrayList<Integer> Franz = new ArrayList<Integer>();

  for( int i = 0; i < 23; i++ ) {
    Franz.add( (int)( 50 * Math.random() ) );
    //System.out.println( Franz );
  }
  
  System.out.println(meep.sortCheck());

  ArrayList<Integer> Liebestraume = new ArrayList<Integer>();
  for( int i = 0; i < 23; i++ ) {
    Liebestraume.add(i);
    //System.out.println( Liebestraume );
  }

  System.out.println(meep.sortCheck());



} // main

} // ALTester

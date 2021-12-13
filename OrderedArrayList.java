// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }
/*
  public String toString(){
    String foo = "[";
    for( int i = 0; i < _data.size(); i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;

  } // override toString
 */
/*
  public Integer remove( int i ){
    int[] capybara = new int[_size - 1];
    for (int i = 0; i < index; i++) {
      capybara[i] = _data[i];
    }
    for (int h = index + 1; h <= _size - 1; h++) {
      capybara[h - 1] = _data[h];
    }
    _data = capybara;
    _size -= 1;
    return _size;
  } // remove
  }
*/
  public int size(){
    return _data.size();
  }


  public Integer get( int i )
  {
    return _data.get(i);
  }
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public boolean addLinear(Integer newVal){
	for (int i = 0; i < size(); i ++) {
		if (newVal.compareTo(_data.get(i)) < 0) {
			_data.add(i, newVal);
			return true;
		}
		else {
			_data.add(newVal);
		}
	}
	return true;
  }
/*
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {

  }	
  */
  // main method solely for testing purposes
  public static void main( String[] args )
  {


    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList


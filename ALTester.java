

public class ALTester implements OrderedArrayList {

private int[] _data;
private int _size;

public ALTester() {

  _data = new int[23];
  _size = 0;

} // constructor intiializes array of length 23

//accessor -- return value at specified index
public int get( int index ) {

    return _data[index];

} // accesor get

//mutator -- set value at index to newVal,
 //           return old value at index
public int set( int index, int newVal ) {

   int temp = _data[index];
   _data[index] = newVal;
   return temp;

} // mutator set

public String toString() {

    String foo = "[";
    for( int i = 0; i < _data.length; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;

  } // override toString

public boolean add (int index, int newVal) {

  int mole[] = new int[_size + 1];
  for (int i = 0;i < index; i++) {
    mole[i] = _data[i];
  }
  mole[index] = newVal;
  for (int h = index + 1; h < _size + 1; h++) {
      mole[h] = _data[h - 1];
  }
  _data = mole;
  _size += 1;
  return true;

} // add

public boolean add (int newVal) {
  add(_size, newVal);
  return true;
} // add

//removes the item at index
  //shifts elements left to fill in newly-empted slot
public int remove( int index ) {
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

public int findmin() {
  int currentmin = 0;
  int indexmin = 0;
  for (int i = 0; i < _data.length - 1; i++) {
    if (_data[i] < _data[i + 1]) {
      currentmin = _data[i];
      indexmin = i;
    }
    if (_data[i] > _data[i +1]) {
      currentmin = _data[i + 1];
      indexmin = i + 1;
    }
  }
  return indexmin;
} // findmin

public boolean sortcheck() {
  boolean mousevalue = true;
  for (int i = 0; i < _data.length - 1; i++) {
    if (_data[i] > _data[i + 1]) {
     mousevalue = false;
      break;
    }
  }
  return mousevalue;
} // sortcheck

public boolean sort() {
  int[] rodent = new int[_data.length];
  int gopher = _data.length;
  for (int i = 0; i < gopher; i++) {
    rodent[i] = (_data[findmin()]);
    remove(findmin());
  }
  _data = rodent;
  return true;
} // sort

public static void main(String[] args) {
  OrderedArrayList meepo = new ALTester();
  System.out.println("Printing empty SuperArray meepo...");
  System.out.println(meepo);
  for (int i = 23; i > 0; i --) {
    meepo.add(i);
  }
  System.out.println("Printing populated SuperArray meepo...");
  System.out.println(meepo);
  System.out.println("Is meepo sorted?..." + meepo.sortcheck());
  meepo.sort();
  System.out.println("Printing sorted SuperArray meepo...");
  System.out.println(meepo);
  System.out.println("Is meepo sorted?..." + meepo.sortcheck());


} // main

} // ALTester

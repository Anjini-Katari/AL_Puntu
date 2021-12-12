public class ALTester {

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

public boolean add(int newVal) {
  add(_size, newVal);
  return true;
} // add

} // ALTester

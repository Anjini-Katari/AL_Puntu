public interface OrderedArrayList {

  public boolean sort(); // we need to implement something for this
  public boolean sortcheck(); // checks if it is sorted
  public boolean add(int newVal);
  public boolean add(int index, int newVal);
  public int remove(int index);
  public int get(int index);
  public int set(int index, int x);


} // interface

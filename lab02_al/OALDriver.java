public class OALDriver
{

  public static void main( String[] args )
  {
    OrderedArrayList foo = new OrderedArrayList();

    for( int i = 0; i < 15; i++ )
      foo.add( (int)( 50 * Math.random() ) );
    System.out.println( foo );

  }

}

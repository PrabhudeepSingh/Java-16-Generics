import java.util.ArrayList;
class WildCardCharacter
{
  public static void main(String []args)
  {
    ArrayList<String> g1=new ArrayList<String>();
    ArrayList<?> g2=new ArrayList<String>();
    ArrayList<? extends Number> g3=new ArrayList<Integer>();
    ArrayList<? super String> g4=new ArrayList<Object>();
  }
}
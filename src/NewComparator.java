public class NewComparator extends Comparator{
    public int compare(int a, int b){
      return -super.compare(a,b);
    }
}

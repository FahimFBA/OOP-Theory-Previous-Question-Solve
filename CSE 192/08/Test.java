import java.util.* ;
class listCompare implements Comparator<Integer> {
    public int compare (Integer a, Integer b) {
        if (a%100 < b%100) return 1;
        else if (a%100 > b%100 ) return -1 ;
        return 0 ;
    }
}
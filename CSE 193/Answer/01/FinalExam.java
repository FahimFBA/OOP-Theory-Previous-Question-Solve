import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Player implements Comparable<Player>{
    int jerseyNo;
    double rating;
    public Player(int number, double rating){
        jerseyNo=number;
        this.rating=rating;
    }





    public int compareTo(Player o) {
        if (this.rating < o.rating) return 1;
        else if (this.rating > o.rating) return -1;
        return 0;

    }
}
public class FinalExam {
    public static void main(String args[]){
        Player p1=new Player(7, 9.2);
        Player p2=new Player(9, 8.5);
        Player p3=new Player(10, 9.0);
        ArrayList<Player> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1,p3);
        list.add(2,new Player(5, 6.7));
        list.set(3, p3);
//        for(Player i:list){
//            System.out.println(i.jerseyNo+" "+i.rating);
//      }

        Collections.sort(list);

        for(Player l:list){
            System.out.println(l.jerseyNo+" "+l.rating);

        }
//        list.sort(new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//
//                if (o1.rating < o2.rating) return 1;
//                else if (o1.rating > o2.rating) return -1;
//                return 0;
//            }
//
//        });
//        for(Player i:list){
//            System.out.println(i.jerseyNo+" "+i.rating);
//        }



        //Create HashSet here for question (b)

//        HashSet<Player> hset=new HashSet<>();
//        hset.add(p1);
//        hset.add(p2);
//        hset.add(p3);
//        hset.add(new Player(5, 6.7));
//        hset.add( p3);
//        for (Player item : hset){
//            System.out.println(item.jerseyNo+" "+ item.rating);
//        }

    }


}
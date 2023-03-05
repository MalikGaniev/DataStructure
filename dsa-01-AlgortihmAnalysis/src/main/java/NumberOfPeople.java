import java.util.ArrayList;

public class NumberOfPeople {
    public static void main(String[] args) {
        ArrayList<int[]>stops=new ArrayList<>();
        stops.add(new int[]{10,0});//first stop
        stops.add(new int[]{3,5});
        stops.add(new int[]{2,5});//last stop
        System.out.println(countPassengers(stops));
    }
    public static int countPassengers(ArrayList<int[]> stops){
       //Runs in O(n)complexity because there is a single loop with size n
        int numOfPeople=0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople=numOfPeople+stops.get(i)[0]-stops.get(i)[1];
        }


        return numOfPeople;
    }
}

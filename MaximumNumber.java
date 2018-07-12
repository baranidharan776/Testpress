import java.util.*;

public class MaximumNumber {
    void printMaximumNumber(){
        System.out.println("Enter the number elements ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> value = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = input.nextInt();
            value.add(String.valueOf(val));
        }
        Collections.sort(value, new Comparator<String>(){
            @Override
            public int compare(String X, String Y) {
                String XY=X + Y;
                String YX=Y + X;
                return XY.compareTo(YX) > 0 ? -1:1;
            }
        });
        Iterator it = value.iterator();

        while(it.hasNext())
            System.out.print(it.next());
    }
    public static void main(String[] args) {
            MaximumNumber mx = new MaximumNumber();
            mx.printMaximumNumber();
    }
}

public class arr {
    public static void main(String[] args) {

        double[] array ={1,2.7,2.6,2.9,1,2,1};
        double maximum=array[0];
        for (int i=0;i< 6;i++){
            if (array[i]>maximum){
                maximum=array[i];

            }
        }
        System.out.println("greatest value is :"+maximum);
    }
}

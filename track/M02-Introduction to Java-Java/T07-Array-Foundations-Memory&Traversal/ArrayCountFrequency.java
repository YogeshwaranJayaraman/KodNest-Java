class ArrayFrequency {
    void frequency(int arr[],int key) {
        int count=0;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]==key) {
                count++;
            }
        }
        System.out.println(key+" : "+count); 
    }
}
public class ArrayCountFrequency {
    public static void main(String[] args) {
        int[] arr={10,10,10,20,20,30,30,30,30};
        ArrayFrequency af=new ArrayFrequency();
        af.frequency(arr,10);
        af.frequency(arr,20);
        af.frequency(arr,30);
    }
}

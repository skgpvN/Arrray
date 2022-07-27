package MockEasy;

public class findthekthsmallestelement {
    public static void main(String[] args) {
        int arr[]={1,3,4,5, 8, 99, 900, 998989, 78788778};
        int Size= arr.length;
        int i;
        int number=11;
        for(i=0; i<Size; i++){
            if(arr[i]>=number){
                System.out.println(arr[i]);
                return;

            }
            if(arr[i]==Size){
                System.out.println(-1);
            }
        }
    }
}
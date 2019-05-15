import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + "\t");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so muon xoa :");
        int x = input.nextInt();
        int j;
       for(j = 0;j < arr.length;j ++){
           if(arr[j] == x) {
               System.out.println("So " + x + " o vi tri " + (j + 1));
               break;
           }
       }

        for(;j < arr.length -2; j ++) {
            arr[j] = arr[j +1];
        }
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

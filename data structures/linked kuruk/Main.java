package linkListOneDirection;
import java.util.Scanner;
import java.util.Random;
public class Main{

    public static void main(String []args )
    {
        Scanner number=new Scanner(System.in);
        Scanner kelime=new Scanner(System.in);            //number nextInt kullandigimiz icin nextLine kullandigimizda calismadi 
        Queue listemiz =new Queue();

        int c;
        String sorma="Evet";
        while(sorma.trim().charAt(0)=='e'||sorma.trim().charAt(0)=='E')
        {
            //charAt ilk index almak icin 
            System.out.println("hangi islem yapmak istersiniz eklemek icin 1 silmek icin 2 aramak icin 3'e basiniz ");
            c=number.nextInt();

            switch(c){
                case 1:
                {
                    System.out.println("kac eleman eklemek istiyorsunuz (liste boyutu)");
                    int a =number.nextInt();
                    for(int i =0 ; i<a;i++)
                    {
                        //Her defasinda listeye bir eleman eklenecek 
                        //bu eleman rastgele olacak 
                        Random rnd=new Random();
                        int randomNumber =rnd.nextInt(100);
                        Node isim=new Node(randomNumber);
                        listemiz.add(isim);
                    }
                    listemiz.yazdir();
                    break;
                }
                case 2:
                {
                    listemiz.silme();
                    listemiz.yazdir();
                    break;
                }
                case 3 : 


                System.out.println("aracaginiz sayi girebilirsiniz ");
                int key =number.nextInt();
                System.out.println(listemiz.arama(key));
                listemiz.yazdir();
            }
            System.out.println("\n baska islem yapmak isterseniz \'e\' harfina basiniz ");
            sorma=kelime.nextLine();
        } 
    } 
}
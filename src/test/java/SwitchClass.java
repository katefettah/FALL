import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        //Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
        //“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. “Pazar” ise ekrana
        //“Hıristiyanlar için kutsal gün” yazdırın. Diler günler icin “Kutsal gün değil” yazdırın.
        //
        //Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
        //“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
        //Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
        //
        //Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
        //99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
        //999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
        //Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
        //
        //Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
        //Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
        //Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
        //Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
        //
        //Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana "Dogru cevap" yazdirin. A,B,D den
        //biri ise ekrana "yanlis cevap yazdirin". Bunlarin disinda gecersiz cevap yazdirin.
        //String [] days={"cuma","cumartesi","pazar"};
        //2. soru
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a letter");
        char letter=scan.next().charAt(0);
        letter=Character.toLowerCase(letter);

        switch (letter){
            case'a':
                System.out.println("sesli harf");
                break;
            case'e':
                System.out.println("sesli harf");
                break;
            case'i':
                System.out.println("sesli harf");
                break;
            case'o':
                System.out.println("sesli harf");
                break;
            default:
                System.out.println("sessiz haf");
        }
        //3.soru
        System.out.println("write the numbers");
        int digit=scan.nextInt();

        switch (digit){
            case 9:
                System.out.println("1 digit number");
                break;
            case 99:
                System.out.println("2 digit number");
                break;
            case 999:
                System.out.println("3 basamakli sayi");
                break;
            default:
                System.out.println("no comment");
        }
        //5. soru
        System.out.println("enter the letter");
        char l=scan.next().charAt(0);


        switch (l){
            case 'A':
                System.out.println("wrong");
                break;
            case 'B':
                System.out.println("wrong");
            case 'C':
                System.out.println("correct");
                break;
            default:
                System.out.println("no comment");

        }


    }
    }


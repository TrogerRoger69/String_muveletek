import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem a vezetéknevet");
    String vez = sc.nextLine();
    System.out.println("Kérem a keresztnevet");
    String ker = sc.nextLine();
    System.out.println("Kérem a születési helyet");
    String szul = sc.nextLine();
    System.out.println("Kérem az életkort");
    int kor = sc.nextInt();

    String fullName = vez+" "+ ker;
    System.out.println(fullName);
    System.out.println(fullName.toUpperCase());
    System.out.println(fullName.indexOf(ker));
    System.out.println(fullName.toLowerCase() +" "+ szul.toLowerCase());
    System.out.println("A felhasználó:\n\t"+kor+" éves\n\t"+vez+" "+ker+" a neve és\n\t"+szul+" a születési helye");
    if(ker.startsWith("A")){
        System.out.println("A keresztnév A betűvel kezdődik");
    }
    System.out.println(ker.endsWith("t"));
    System.out.println(fullName.length());
    System.out.println(fullName.replace("i","y"));
}
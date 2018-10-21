public class FamilyMember {

    static String surname = "Nowak";
    String name;
    int age;


    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";

        FamilyMember mum = new FamilyMember();
        mum.age = 25;
        mum.name = "Agata";

        FamilyMember.surname = "Kowalski";

        System.out.println("Tata: " + dad.name + " " + FamilyMember.surname + " lat " + dad.age);
        System.out.println("Mama: " + mum.name + " " + FamilyMember.surname + " lat " + mum.age);

        System.out.println(Math.max(234234234, 234567));

        int i = 68764876;
        String str = String.valueOf(i);
        System.out.println(str.charAt(5));

    }
}

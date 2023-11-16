package B2_Baeume;

public class StartBaum {

 public static void main(String[] args) {
    Tree b1 = new Tree();
    int menge;
    //9,10,17,5,2,1,8

    b1.insert(9);
    b1.insert(10);
    b1.insert(17);
    b1.insert(5);
    b1.insert(2);
    b1.insert(1);
    b1.insert(8);

    menge = b1.height();

    System.out.println(menge);




 }   
}

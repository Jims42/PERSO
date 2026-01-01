public class Couleurs {
public static void main(String[] args) {
    
      String[] tableau=new String[7];
    tableau[0]="\u001B[30mGris\u001B[0m";
    tableau[1]="\u001B[31mRouge\u001B[0m";
    tableau[2]="\u001B[32mVert\u001B[0m";
    tableau[3]="\u001B[33mJaune\u001B[0m";
    tableau[4]="\u001B[34mBleu\u001B[0m";
    tableau[5]="\u001B[35mViolet\u001B[0m";
    tableau[6]="\u001B[36mCyan\u001B[0m";

    

    
    for (String couleur : tableau) {
        System.out.print(couleur+"\t");
    }System.out.println();

    String[] tableau1=new String[]{"\u001B[30mGris\u001B[0m","\u001B[31mRouge\u001B[0m","\u001B[32mVert\u001B[0m","\u001B[33mJaune\u001B[0m","\u001B[34mBleu\u001B[0m","\u001B[35mViolet\u001B[0m","\u001B[36mCyan\u001B[0m"};

    for (String couleur1 : tableau1) {
        System.out.println(couleur1);
    }
}
}

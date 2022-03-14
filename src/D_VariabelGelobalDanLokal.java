/**
 * contoh penggunaan variabel global dan lokal dijava
 */
public class D_VariabelGelobalDanLokal {
    static int varGlobal = 34;

    public static void main(String[] args) {
        varGlobal =25;
        System.out.println("varGlobal diakses di method main dengan nilai = "+ varGlobal);
        double varLokal = 3.14;
        System.out.println("varGlobal hanya bisa diakses di method main dengan nilai = " + varLokal);

    aksesVariabelLokal();
    }
    public static void aksesVariabelLokal(){
        System.out.println("varGlobal bisa diakses di method aksesVariabelLokal dengan nilai = "+ varGlobal);
        //varLokal =2.5;
        System.out.println("varGlobal tak bisa diakses di method aksesVariabelLokal ini");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class kiragaji{
public static void main (String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Masukkan nama pekerja");
String nama=input.next();

System.out.println("Masukkan bilangan jam bekerja sehari :");
int jam =input.nextInt();

if (jam>9);{
    System.out.println(" Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul :");
    int jam1=input.nextInt();
}

 System.out.println("Masukkan bilangan hari bekerja :");
int hari =input.nextInt();

if (hari>30);{
    System.out.println(" Bilangan hari bekerja tidak boleh melebihi 30hari, sila masukkan bilangan hari yang betul :");
    int hari1=input.nextInt();
}

    System.out.println("Masukkan bilangan jam ot :");
    int ot= input.nextInt();

    if (ot >50);
    {
        System.out.println(" Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan bilangan jam yang betul :");
        int ot1=input.nextInt();
    }
    
   double gaji=(jam*hari*20) + (ot*15);
   
   System.out.println("Rumusan gaji bulanan"+nama );
   System.out.println("Jumlah jam bekerja: "+jam+"jam");
   System.out.println("Jumlah hari bekerja: "+hari+"hari");
   System.out.println("Jumlah jam lebih masa:"+ot+"jam");
   System.out.println("JUMLAH GAJI: RM"+gaji);
   
   

}
}
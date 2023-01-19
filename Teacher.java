package patika.Ogrenci_Bilgi_Sistemi;

public class Teacher {
    String name;
    String pnone;
    String branch;
    Teacher(String name,String pnone,String branch){
        this.name=name;
        this.pnone=pnone;
        this.branch=branch;
    }
    void  print(){
        System.out.println("Adı:"+this.name);
        System.out.println("Bölüm:"+this.branch);
        System.out.println("Tlf:"+this.pnone);
    }
}

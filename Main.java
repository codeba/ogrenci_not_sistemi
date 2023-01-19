package patika.Ogrenci_Bilgi_Sistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("abdullah", "1234", "TRH");
        Teacher t2 = new Teacher("ahmet", "00001", "FZK");
        Teacher t3=new Teacher("ali","2222","BIO");

        Course tarih = new Course("tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo=new Course("biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("azra","12","4",tarih,fizik,biyo);
        s1.addBulkExanNote(100,200,60);
        s1.isPass();
        Student s2=new Student("ali","454","4",fizik,tarih,biyo);
        s2.addBulkExanNote(100,80,90);
        s2.isPass();
    }
}

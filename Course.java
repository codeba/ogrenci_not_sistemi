package patika.Ogrenci_Bilgi_Sistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
                note=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else {
            System.out.println("yalnış atama");
        }


    }
    void printTeacherİnfo(){
        this.teacher.print();
    }
}

public class Student{
  String name;
  String idNumber;
  int mark1, mark2, mark3, mark4;
  double total, average;
  String grade;

  Student(String name, String idNumber,int mark1, int mark2, int mark3, int mark4 ){
    this.name = name;
    this.idNumber = idNumber;
    this.mark1 = mark1;
    this.mark2 = mark2;
    this.mark3 = mark3;
    this.mark4 = mark4;
  }

  Student(double total, double average, String grade){
    this.total = total;
    this.average = average;
    this.grade = grade;
  }
}

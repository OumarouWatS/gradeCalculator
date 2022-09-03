public class Main{
  Student students[] = new Student[4];
  
  public static void main(String[] args){
    // Initializing the elements of the array
    Student[] arr = new Student[4];
    arr[0] = new Student("Razina", "1069368", 90,89,97,99);
    arr[1] = new Student("Fadila", "1069369", 85, 96,84, 90);
    arr[2] = new Student("Samira", "1069367", 98, 82, 85, 90);
    arr[3] = new Student("Farida", "1069361",87, 95, 86, 93);

    // Printing a title of the class summary out
    System.out.println("Students   " + "      ID Number "  + "      Name " + "     Mark1 " + "    Mark2 " + "    Mark3 " +"  Mark4 " + "  Average " + "  Grade " );
    // Computing each student/object's mark average
    for(int j=0; j<4; j++){
      arr[j].total = arr[j].mark1 + arr[j].mark2 +arr[j].mark3 +arr[j].mark4;
      arr[j].average = arr[j].total/4;
    }

    // Setting the right letter grade according to the student average
    for(int j=0; j<4; j++){
      if(arr[j].average >= 93){
        arr[j].grade = "A";
      }
      else if(arr[j].average < 93 && arr[j].average >= 90){
        arr[j].grade = "A-";
      }
      else if(arr[j].average < 89 && arr[j].average >= 85){
        arr[j].grade = "B+";
      }
      else if(arr[j].average < 85 && arr[j].average >= 80){
        arr[j].grade = "B";
      }
      else if(arr[j].average < 80 && arr[j].average >= 76){
        arr[j].grade = "B-";
      }
      else if(arr[j].average < 76 && arr[j].average >= 73){
        arr[j].grade = "C+";
      }
      else if(arr[j].average < 73 && arr[j].average >= 70){
        arr[j].grade = "C";
      }
      else if(arr[j].average < 70 && arr[j].average >= 68){
        arr[j].grade = "C-";
      }
      else if(arr[j].average < 68 && arr[j].average >= 65){
        arr[j].grade = "D+";
      }
      else if(arr[j].average < 65 && arr[j].average >= 60){
        arr[j].grade = "D";
      }
    }

    // Printing the class summary out
    for(int j=0; j<4; j++){
      System.out.println("Student no." + (j+1) + ":      "
+ arr[j].idNumber + "      "
+ arr[j].name + "       " + arr[j].mark1 + "       " + arr[j].mark2 + "       " + arr[j].mark3 + "       " + arr[j].mark4 + "       " + arr[j].average + "       " + arr[j].grade);
    }
  }
}

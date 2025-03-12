public class GradeMarks {
    public static String Grade(int marks){
       String grade = " ";
       if((marks> 91) && (marks < 100)){
           grade = "AA";
        }
       else if((marks> 81) && (marks < 90)){
            grade = "AB";
        }
       else if((marks> 71) && (marks < 80)){
           grade = "BB";
       }
       else if((marks> 61) && (marks < 70)){
           grade = "BC";
       }
       else if((marks> 51) && (marks < 60)){
           grade = "CD";
       }
       else if((marks> 41) && (marks < 50)){
           grade = "DD";
       }
       else if(marks <=40){
           grade = "Fail";
       }
        return grade;
    }
    public static void main(String[] args) {
        String report1 =Grade(56);
        String report2 =Grade(43);
        String report3 =Grade(95);
        System.out.println(report1);
        System.out.println(report2);
        System.out.println(report3);
    }
}

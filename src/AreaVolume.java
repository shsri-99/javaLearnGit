public class AreaVolume {
    // Task 1: Area of Circle                                                                ---1
    public static float Circle(int r){
        System.out.println("Enter radius: "+ r);
        float Area = (float)Math.PI * r * r;
        return Area;
    }

    // Task 2: Area of Triangle                                                             ---2
    public static float Triangle(float side){
        System.out.println("Enter side: "+side);
        float Area = side * side;
        return Area;
    }

    //Task 3: Area of Recatangle                                                            ---3
    public static int Rectangle (int l, int w) {
        System.out.println("Enter length: " + l);
        System.out.println("Enter width: " + w);
        int Area = l * w;
        return Area;
    }
    //Task 4: Area of Isosceles Triangle                                                    ---4

    public static float IsoscelesTriangle(int b,int h){
        System.out.println("Enter base: " + b);
        System.out.println("Enter height: " + h);
        float Area = (float) (b * h)/2f;
            return Area;
        }

    //Task 5: Area of Parallelogram                                                         ---5
    public static int Parallelogram(int b, int h){
        System.out.println("Enter base: " + b);
        System.out.println("Enter height: " + h);
        int Area = b * h;
        return Area;
    }

    //Task 6: Volume Of Cone Java Program                                                   ---6
    public static float VolumeCone( int r,int h){
        System.out.println("Enter radius: "+r);
        System.out.println("Enter height: "+h);
        float volume = (float) (Math.PI * Math.pow(r,2) * h/3);
        return volume;
    }


    // Main method where all the functions or different tasks are called                    ---Main
    public static void  main(String[] args){
    //float Areac=Circle(7);                  //Calling Area of circle
        //System.out.println("Area of circle is: "+Areac);
    //float Areat = Triangle(8);          //Calling Area of triangle
        //System.out.println("Area of trianlge is: "+Areat);
    //int Arear = Rectangle(6,8);          //Calling Area of Rectangle
        //System.out.println("Area of trianlge is: "+Arear);
    //float Areait = IsoscelesTriangle(9,7);//Calling Area of Isosceles Triangle
        //System.out.println("Area of Isosceles triangle is: "+Areait);
    //int Areap = Parallelogram(8,9);   //Calling Area of Parallelogram
        //System.out.println("Area of Parallelogram is: "+Areap);
     //float vc = VolumeCone(1,3);      //Calling volume of cone
        //sSystem.out.println("Volume of Cone is: "+vc);
    }
}

package by.belhard.j20.Matushin.homework;

public class HomeworkAfterLesson2 {
    public static void main(String[] args) {
        //1)
        byte b = 1;
        short s = 2;
        char c = 'C';
        int in = 158;
        long l = 4;
        float f = 3.14f;
        double d = 6.28;
        boolean bo = true;
        System.out.println((b+5)*5);
        System.out.println(s*5 > l*4);
        System.out.println((in*30 % 24)/5);
        System.out.println((int)c + f);
        System.out.println(d*55/33);
        System.out.println(bo);
        //2)
        int r = 15;
      // double pi = Math.PI;
        if (r>0)
            System.out.println("S = " + Math.pow(r,2)*Math.PI + " , L = " + 2*3.14*r);
        else System.out.println("Input data is invalid");
        //3)
        int temp = 23;
        if (temp > 30)
            System.out.println("Ничего не надевай");
            //resault = "Ничего не надевайНичего не надевай"
        else if (temp >= 21)
            System.out.println("Надень майку");
            //resault = "Надень майку"
        else if (temp >= 16)
            System.out.println("Надень свитер");
        else if (temp >= 10)
            System.out.println("Надень ветровку");
        else
            System.out.println("Надень куртку");
        //System.out.println(resault);
        //4)
        int salary1 = 500;
        int salary2 = 700;
        int salary3 = 950;
        //int s1 = 5, s2 = 10, s3 = 15;

        if ((salary1 > salary2) && (salary1 < salary3))
            System.out.println(salary3 - salary2);
        if ((salary1 < salary2) && (salary1 > salary3))
            System.out.println(salary2 - salary3);

        if ((salary2 > salary1) && (salary2 < salary3))
            System.out.println(salary3 - salary1);
        if ((salary2 < salary1) && (salary2 > salary3))
            System.out.println(salary1 - salary3);

        if ((salary3 > salary2) && (salary3 < salary1))
            System.out.println(salary1 - salary2);
        if ((salary3 < salary2) && (salary3 > salary1))
            System.out.println(salary2 - salary1);
            //5)
        int a = -3;
        int n = 5;
        int a2 = a;
        for (int i = 1;i < n;i++)
            a = a * a2;
            //a *=a2;
        System.out.println(a);
        //6)
        int startSum = 1000;
        int proc = 5;
        int years = 8;
        int tax = startSum/100;
        for (int i = 1;i<years;i++)
            startSum = startSum*(100 + proc)/100 - tax;
        System.out.println(startSum);
    }
}

           double b=sc.nextDouble();

           r.getdata(l,b);

           r.printarea();

           break;

   case 2: System.out.println("Enter base and height: ");

           double b1=sc.nextDouble();

           double h=sc.nextDouble();

           t.getdata(b1,h);

           t.printarea();

           break;

   case 3: System.out.println("Enter radius: ");

           double r1=sc.nextDouble();

           c.getdata(r1);

           c.printarea();

           break;

   default: System.out.println("Invalid input");

  }

 }

}  

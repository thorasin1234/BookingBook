import java.util.*;
import java.util.ArrayList; // import the ArrayList class

// it's a me Mario

public class Main
{
    public static Deque<Book> listBook = new ArrayDeque<>();



    public static void main(String[] args)
    {

        int select = 0;
        String con; // ;-;

        do
        {
            //MENU MAIN

            System.out.println("\t\t\t  Book Land store.");
            System.out.println("\t\t\t........Menu.......");
            System.out.println("\t\t\t1. Input Data.");
            System.out.println("\t\t\t2. Edit && Delete data.");
            System.out.println("\t\t\t3. Display data.");
            System.out.println("\t\t\t4. Rent Book.");
            System.out.println("\t\t\t5. Return Book.");
            System.out.println("\t\t\t.......................");

            try
            {

                Scanner kb =new Scanner(System.in);
                System.out.print("\t\t\tPress Select menu[1-5] : ");
                int number=kb.nextInt();
                System.out.println(number);

            }

            catch(Exception e){
                System.out.println("\n\n\t\t\tPlease use only number");

                System.out.println("\n\n\t\t\t Book Land store.");
                System.out.println("\t\t\t........Menu.......");
                System.out.println("\t\t\t1. Input Data.");
                System.out.println("\t\t\t2. Edit && Delete data.");
                System.out.println("\t\t\t3. Display data.");
                System.out.println("\t\t\t4. Rent Book.");
                System.out.println("\t\t\t5. Return Book.");
                System.out.println("\t\t\t.......................");
                System.out.print("\t\t\tPress Select menu[1-5] : ");
            }

            select = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (select)
            {
                case 1:
                    Input_Data();

                    System.out.println(listBook);

                    break;
//                case 2:
//                    Edit_Delete_data(top);1

//                    break;
//                case 3:
//                    top = Display_data(top);
//                    break;
//                case 4:
//                    Rent_Book(top);
//                    break;
//                case 5:
//                    Return_Book(top);
//                    break;
                default:
                    System.out.println("\t\t\tInvalid Menu");
                    break;
            }

            System.out.print("\t\t\tDo you want to menu [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());


        } while (con.equals("Y") || con.equals("y"));


        System.out.println("\t\t\t......Thank you......");

    }

    //INPUT
    private static void Input_Data()
    {
        String con;
//        int excode, index;

        Book newBook = new Book();
        
        do
        {
//            index = 0;

            

            System.out.println("\n\n\t\t\t------Input Data------");
            System.out.print("\t\t\tKey Code =");
                
            newBook.setCode(Integer.parseInt(new Scanner(System.in).nextLine()));

//                for (int i = 1;i <= top;i++)
//                {
//                    if (excode == Code[i])
//                    {
//                        index = i;
//                    }
//                }



//                if (index == 0)
//                {
                    
                    System.out.print("\t\t\tKey Name Book =");
//                    Name[top] = String.valueOf(new Scanner(System.in).nextLine());
                    newBook.setName(String.valueOf(new Scanner(System.in).nextLine()));
            
                    System.out.print("\t\t\tKey Price =");
//                    Price[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                    newBook.setPrice(Double.parseDouble(new Scanner(System.in).nextLine()));

                    System.out.print("\t\t\tKey Rent for day =");
//                    Rent_day[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                    newBook.setRent_day(Double.parseDouble(new Scanner(System.in).nextLine()));
                    
                    System.out.println("\t\t\t.......................");
                    
                    
//                    Status[top] = 0;
                    newBook.setStatus(0);

//                    Date[top] = 0;
                    newBook.setDate(0);

//                }

//                else //เจอตัวซ้ำ
//                {
//                    System.out.println("\t\t\tData already exists, cannot enter new data.");
//                    top--;
//                }
//            }

//            else //top>=num ถ้าช่่องเก็บเต็ม
//            {
//                System.out.println("\t\t\tOverlode data");
//                top--;
//            }

            System.out.print("\t\t\tDo you want to Key Data  [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());

        } while (con.equals("Y") || con.equals("y"));

        listBook.addLast(newBook);

    }

//    private static void Edit_Delete_data(int top)
//    {
//        int excode,index,check;
//        String con;
//        do
//        {
//            index = 0;
//            check = 0;
//
//            System.out.println("\n\n\n\n\t\t\t------Edit && Delete Data------");
//            System.out.print("\t\t\tKey code =");
//            excode = Integer.parseInt(new Scanner(System.in).nextLine());
//            for (int i = 1; i <= top; i++)
//            {
//                if (excode == Code[i]) //เช็คตัวซ้ำ
//                {
//                    index = i; //ถ้าเจอตัวซ้ำให้เก็บหมายเลขช่องคัวซ้ำ
//                }
//            }
//
//            if (index != 0) //เจอตัวซ้ำ
//            {
//                System.out.printf("\t\t\tEdit Code %1$s = ", Code[index]);
//                excode = Integer.parseInt(new Scanner(System.in).nextLine());
//                for (int i = 1; i <= top; i++)
//                {
//                    if (excode == Code[i] && Code[i] != 0) //เจอตัวซ้ำ&!=0
//                    {
//                        check = 1; //ซ้ำ ไม่ยอมให้แก้
//                    }
//                }
//                if (check == 0) //ไม่เจอตัวซ้ำ
//                {
//                    Code[index] = excode;
//                    System.out.printf("\t\t\tEdit Name Book %1$s= ", Name[index]);
//                    Name[index] = String.valueOf(new Scanner(System.in).nextLine());
//                    System.out.printf("\t\t\tEdit Price %1$s= ", Price[index]);
//                    Price[index] = Double.parseDouble(new Scanner(System.in).nextLine());
//                    System.out.printf("\t\t\tEdit Rent per Day %1$s= ", Rent_day[index]);
//                    Rent_day[index] = Double.parseDouble(new Scanner(System.in).nextLine());
//                    System.out.printf("\t\t\tEdit Status %1$s= ", Status[index]);
//                    Status[index] = Integer.parseInt(new Scanner(System.in).nextLine());
//                    System.out.printf("\t\t\tEdit Data %1$s= ", Date[index]);
//                    Date[index] = Integer.parseInt(new Scanner(System.in).nextLine());
//                    System.out.println("\t\t\t.......................");
//                }
//                else
//                {
//                    System.out.println("\t\t\tData already exists, cannot edit data."); //เจอซ้ำ
//                }
//            }
//            else
//            {
//                System.out.println("\t\t\tBook code not found"); //ไม่เจอตัวซ้ำ
//            }
//            System.out.print("\t\t\tDo you want to Edit Data [Y/N] :");
//            con = String.valueOf(new Scanner(System.in).nextLine());
//        } while (con.equals("Y") || con.equals("y"));
//
//    }
//    static int Display_data(int top)
//    {
//        for (int i = 1;i <= top;i++)
//        {
//            for (int j = 1;j < top;j++) // < จัดเรียงจากเลขมากไปน้อย
//            {
//                if (Code[j] < Code[j + 1])
//                {
//                    int c = Code[j];
//                    Code[j] = Code[j + 1];
//                    Code[j + 1] = c;
//                    String n = Name[j];
//                    Name[j] = Name[j + 1];
//                    Name[j + 1] = n;
//                    double p = Price[j];
//                    Price[j] = Price[j + 1];
//                    Price[j + 1] = p;
//                    double pd = Rent_day[j];
//                    Rent_day[j] = Rent_day[j + 1];
//                    Rent_day[j + 1] = pd;
//                    int s = Status[j];
//                    Status[j] = Status[j + 1];
//                    Status[j + 1] = s;
//                    int d = Date[j];
//                    Date[j] = Date[j + 1];
//                    Date[j + 1] = d;
//                    double de = Deposit[j];
//                    Deposit[j] = Deposit[j + 1];
//                    Deposit[j + 1] = de;
//                    int de_re = Date_return[j];
//                    Date_return[j] = Date_return[j + 1];
//                    Date_return[j + 1] = de_re;
//                }
//            }
//        }
//        while (Code[top] == 0 && top > 0) //ถอยช่อง เมื่อข้อมูลที่ top ชี้ =0 และ ช่่องtop>0
//        {
//            top--;
//        }
//        System.out.println("\n\n\n\n\t\t\t------Display Data------");
//        System.out.println("\t\t\tNo.  Code  Name  Price  Rent/Day  Status  Date");
//        System.out.println("\t\t\t---------------------------------------------");
//        for (int i = 1; i <= top; i++)
//        {
//            System.out.printf("\t\t\t%1$s  %2$s  %3$s  %4$.2f  %5$.2f  %6$s  %7$s" + "\r\n", i, Code[i], Name[i], Price[i], Rent_day[i], Status[i], Date[i]);
//        }
//        System.out.println("\t\t\t---------------------------------------------");
//        return top;
//    }
//    static void Rent_Book(int top)
//    {
//        int excode,index;
//        String con;
//        do
//        {
//            index = 0;
//
//            System.out.println("\n\n\n\n\t\t\t------Rent Book------");
//            System.out.print("\t\t\tKey Code =");
//            excode = Integer.parseInt(new Scanner(System.in).nextLine());
//            for (int i = 1; i <= top; i++)
//            {
//                if (excode == Code[i])
//                {
//                    index = i;
//                }
//            }
//            if (index != 0) //มีหนังสือ
//            {
//                if (Status[index] == 0) //มีหนังสือ
//                {
//                    System.out.printf("\t\t\tCode = %1$s" + "\r\n", Code[index]);
//                    System.out.printf("\t\t\tName Book = %1$s" + "\r\n", Name[index]);
//                    System.out.printf("\t\t\tRent per day = %1$.2f" + "\r\n", Rent_day[index]);
//                    Deposit[index] = Price[index] + (Price[index] / 2);
//                    System.out.printf("\t\t\tDeposit of Book = %1$.2f" + "\r\n", Deposit[index]);
//                    System.out.printf("\t\t\tStatus = %1$s" + "\r\n", Status[index]);
//                    Status[index] = 1;
//                    System.out.print("\t\t\tKey Date [1-30] = ");
//                    Date[index] = Integer.parseInt(new Scanner(System.in).nextLine());
//                }
//                else //ยื้มไปแล้ว
//                {
//                    System.out.println("This book code has been rented");
//                }
//            }
//            else //ไม่มีหนังสือในร้านนี้
//            {
//                System.out.println("Book code not found");
//            }
//            System.out.print("\t\t\tDo you want to Rent Book. [Y/N] :");
//            con = String.valueOf(new Scanner(System.in).nextLine());
//        } while (con.equals("Y") || con.equals("y"));
//    }
//    static void Return_Book(int top)
//    {
//        int excode, index, member, day;
//        double Total_rent, Discount, Net_rental, Change_Money;
//        String con;
//        do
//        {
//            index = 0;
//
//            System.out.println("\n\n\n\n\t\t\t------Return Book------");
//            System.out.print("\t\t\tKey code =");
//            excode = Integer.parseInt(new Scanner(System.in).nextLine());
//            for (int i = 1; i <= top; i++)
//            {
//                if (excode == Code[i])
//                {
//                    index = i;
//                }
//            }
//            if (index != 0) //เจอหนังสือ
//            {
//                if (Status[index] == 1) //ยืมไปแล้ว
//                {
//                    System.out.printf("\t\t\tCode = %1$s" + "\r\n", Code[index]);
//                    System.out.printf("\t\t\tName Book = %1$s" + "\r\n", Name[index]);
//                    System.out.printf("\t\t\tRent per day = %1$s" + "\r\n", Rent_day[index]);
//                    System.out.printf("\t\t\tDeposit of Book = %1$s" + "\r\n", Deposit[index]);
//                    System.out.printf("\t\t\tStatus = %1$s" + "\r\n", Status[index]);
//                    Status[index] = 0;
//                    System.out.printf("\t\t\tDate Borrow = %1$s" + "\r\n", Date[index]);
//                    System.out.print("\t\t\tDate Return = ");
//                    Date_return[index] = Integer.parseInt(new Scanner(System.in).nextLine());
//                    System.out.print("\t\t\tKey member [0 = No member , 1 = 1 Year , 2 = 2 Year => ");
//                    member = Integer.parseInt(new Scanner(System.in).nextLine());
//                    System.out.println("\t\t\t---------------------------------------------");
//                    if (Date_return[index] >= Date[index]) //วันยืม>วันคืน
//                    {
//                        day = Date_return[index] - Date[index];
//                    }
//                    else //วันยืม<วันคืน
//                    {
//                        day = 30 - Date[index] + Date_return[index];
//                    }
//                    System.out.printf("\t\t\tRent day = %1$s" + "\r\n", day);
//                    Total_rent = Rent_day[index] * day;
//                    System.out.printf("\t\t\tTotal rent = %1$s" + "\r\n", Total_rent);
//                    Discount = Total_rent * Pmember[member];
//                    System.out.printf("\t\t\tDiscount = %1$s" + "\r\n", Discount);
//                    Net_rental = Total_rent - Discount;
//                    System.out.printf("\t\t\tNet rental = %1$s" + "\r\n", Net_rental);
//                    Change_Money = Deposit[index] - Net_rental;
//                    System.out.printf("\t\t\tChange Money = %1$s" + "\r\n", Net_rental);
//                    Date[index] = 0;
//                }
//                else //ยังไม่ยื้ม
//                {
//                    System.out.println("\t\t\tThis book code hasbeen rented.");
//                }
//            }
//            else //ไม่เจอหนังสือ
//            {
//                System.out.println("\t\t\tBook code not found.");
//            }
//            System.out.print("\t\t\tDo you want to Return Book [Y/N] :");
//            con = String.valueOf(new Scanner(System.in).nextLine());
//        } while (con.equals("Y") || con.equals("y"));
//
//    }
}








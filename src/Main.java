import java.util.*;
import java.util.ArrayList; // import the ArrayList class
import java.io.*;


public class Main {

    public static Rabob sys = new Rabob();
    public static Deque<Book> listBook = sys.loadBook();

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int select = 0;
        String con; //

        do {
            //MENU MAIN

            showMenu();

            try
            {


                System.out.print("\t\t\tPress Select menu[1-5] :  ");
                int number=kb.nextInt();
                System.out.print("\t\t\tkey number for confirm = ");

            }

            catch (Exception e)
            {

                System.out.println("\n\n\t\t\tPlease use only number");

                showMenu();

                System.out.print("\t\t\tPress Select menu[1-5] : ");
            }

            select = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (select) {
                case 1:
                    Input_Data();


                    break;
                case 2:
                    Edit_Delete_data();


                    break;
                case 3:
                      Display_data();
                    break;
                case 4:
//                    Rent_Book();
                    break;
                case 5:
//                    Return_Book();
                    break;
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
    private static void Input_Data() {
        String con;

        Book newBook = new Book();

        do {

            System.out.println("\n\n\t\t\t------Input Data------");
            System.out.print("\t\t\tKey Code =");

            newBook.setCode(new Scanner(System.in).nextLine());

                System.out.print("\t\t\tKey Name Book =");
//                Name[top] = String.valueOf(new Scanner(System.in).nextLine());
                newBook.setName(String.valueOf(new Scanner(System.in).nextLine()));

                System.out.print("\t\t\tKey Price =");
//                Price[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                newBook.setPrice(Double.parseDouble(new Scanner(System.in).nextLine()));

                System.out.print("\t\t\tKey Rent for day =");
//                Rent_day[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                newBook.setRent_day(Double.parseDouble(new Scanner(System.in).nextLine()));

                System.out.println("\t\t\t.......................");


//                Status[top] = 0;
                newBook.setStatus(0);

//                Date[top] = 0;
                newBook.setDate(0);


//             Key Code ซ้ำ
//            } else //เจอตัวซ้ำ/                {
//                System.out.println("\t\t\tData already exists, cannot enter new data.");
//            top--;



//        }


            System.out.print("\t\t\tDo you want to Key Data  [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());

        } while (con.equals("Y") || con.equals("y"));

        listBook.addLast(newBook);

        Rabob.writeOn(listBook);



    }


    private static void Edit_Delete_data()
    {
        int excode,index,check;
        String con;

        do
        {
//            index = 0;


            Display_data();

            System.out.println("\n\n\n\n\t\t\t------Edit && Delete Data------");
            System.out.print("\t\t\tKey code =");


            Book selcectBook = Rabob.checkTheBook(listBook, kb.nextLine());


                if ( Objects.equals(selcectBook.getName(),"Not found" ) == false )

                {


                    System.out.printf("\t\t\t%1$s  %2$s  %3$.2f  %4$.2f  %5$s  %6$s" + "\r\n", selcectBook.getCode(), selcectBook.getName()
                            , selcectBook.getPrice(), selcectBook.getRent_day(), selcectBook.getStatus(), selcectBook.getStatus());


                    System.out.print("\t\t\tKey Name Book =");
                    selcectBook.setName(String.valueOf(new Scanner(System.in).nextLine()));

                    System.out.print("\t\t\tKey Price =");
                    selcectBook.setPrice(Double.parseDouble(new Scanner(System.in).nextLine()));

                    System.out.print("\t\t\tKey Rent for day =");
                    selcectBook.setRent_day(Double.parseDouble(new Scanner(System.in).nextLine()));

                    System.out.println("\t\t\t.......................");

                    selcectBook.setStatus(0);

                    selcectBook.setDate(0);


                    Rabob.writeOn(listBook);

                    break;

                }

                else
                {
                    System.out.println("\t\t\tBook code not found"); //ไม่เจอตัวซ้ำ
                }


            System.out.print("\t\t\tDo you want to Edit Data [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());


        } while (con.equals("Y") || con.equals("y"));

    }




    static void Display_data()
    {

        System.out.println("\n\n\n\n\t\t\t------Display Data------");
        System.out.println("\t\t\tNo.  Code  Name  Price  Rent/Day  Status  Date");
        System.out.println("\t\t\t---------------------------------------------");

        int i = 1;

        for (Book book : listBook)
        {
            System.out.printf("\t\t\t%1$s  %2$s  %3$s  %4$.2f  %5$.2f  %6$s  %7$s" + "\r\n", i, book.getCode(), book.getName()
                    , book.getPrice(), book.getRent_day(), book.getStatus(), book.getStatus());
            i++;
        }

    }




    static void Rent_Book(int top)
    {

        String con;
        do
        {


            System.out.println("\n\n\n\n\t\t\t------Rent Book------");
            System.out.print("\t\t\tKey Code =");

            Book selcectBook = Rabob.checkTheBook(listBook, kb.nextLine());


                if ( Objects.equals(selcectBook.getName(),"Not found" ) == false ) //มีหนังสือ
                {
                    System.out.printf("\t\t\tCode = %1$s" + "\r\n", selcectBook.getCode());
                    System.out.printf("\t\t\tName Book = %1$s" + "\r\n", selcectBook.getName());
                    System.out.printf("\t\t\tRent per day = %1$.2f" + "\r\n", selcectBook.getRent_day());

//                    Deposit[index] = Price[index] + (Price[index] / 2);
                    selcectBook.setDeposit( (selcectBook.getPrice() + (selcectBook.getPrice()/2) ) );

                    System.out.printf("\t\t\tDeposit of Book = %1$.2f" + "\r\n", selcectBook.getDeposit());
                    System.out.printf("\t\t\tStatus = %1$s" + "\r\n", selcectBook.getStatus());

//                    Status[index] = 1;
                    selcectBook.setStatus(1);

                    System.out.print("\t\t\tKey Date [1-30] = ");
                    selcectBook.setDate(Integer.parseInt(new Scanner(System.in).nextLine()));


                    Rabob.writeOn(listBook);

                }




            else //ไม่มีหนังสือในร้านนี้
            {
                System.out.println("Book code not found");
            }

            System.out.print("\t\t\tDo you want to Rent Book. [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());

        } while (con.equals("Y") || con.equals("y"));


    }



    static void Return_Book(int top)
    {
        int excode, index, member, day;double Total_rent, Discount, Net_rental, Change_Money;
        String con;
        do
        {
            index = 0;

            System.out.println("\n\n\n\n\t\t\t------Return Book------");
            System.out.print("\t\t\tKey code =");

            Book selcectBook = Rabob.checkTheBook(listBook, kb.nextLine());

            if ( Objects.equals(selcectBook.getName(),"Not found" ) == false )

                if (Objects.equals(selcectBook.getStatus(), 1)) //ยืมไปแล้ว
                {

                    System.out.printf("\t\t\tCode = %1$s" + "\r\n", selcectBook.getCode());
                    System.out.printf("\t\t\tName Book = %1$s" + "\r\n", selcectBook.getName());
                    System.out.printf("\t\t\tRent per day = %1$s" + "\r\n", selcectBook.getRent_day());
                    System.out.printf("\t\t\tDeposit of Book = %1$s" + "\r\n", selcectBook.getDeposit());
                    System.out.printf("\t\t\tStatus = %1$s" + "\r\n", selcectBook.getStatus());

//                    Status[index] = 0;
                    selcectBook.setStatus(0);

                    System.out.printf("\t\t\tDate Borrow = %1$s" + "\r\n", selcectBook.getDate());

                    System.out.print("\t\t\tDate Return = ");

//                    Date_return[index] = Integer.parseInt(new Scanner(System.in).nextLine());
                    selcectBook.setDate_return(kb.nextInt());

                    System.out.print("\t\t\tKey member [0 = No member , 1 = 1 Year , 2 = 2 Year => ");
                    member = Integer.parseInt(new Scanner(System.in).nextLine());

                    System.out.println("\t\t\t---------------------------------------------");


                    if (selcectBook.getDate_return() >= selcectBook.getDate()) //วันยืม>วันคืน
                    {
                        day = selcectBook.getDate_return() - selcectBook.getDate();
                    } else //วันยืม<วันคืน
                    {
                        day = 30 - selcectBook.getDate() + selcectBook.getDate_return();
                    }


                    System.out.printf("\t\t\tRent day = %1$s" + "\r\n", day);
                    Total_rent = selcectBook.getRent_day() * day;
                    System.out.printf("\t\t\tTotal rent = %1$s" + "\r\n", Total_rent);

                    double[] Pmember = {0, 0.05, 0.1};

                    Discount = Total_rent * Pmember[member];

                    System.out.printf("\t\t\tDiscount = %1$s" + "\r\n", Discount);
                    Net_rental = Total_rent - Discount;

                    System.out.printf("\t\t\tNet rental = %1$s" + "\r\n", Net_rental);
                    Change_Money = selcectBook.getDeposit()- Net_rental;

                    System.out.printf("\t\t\tChange Money = %1$s" + "\r\n", Change_Money);

                    selcectBook.setDate(0);

                    Rabob.writeOn(listBook);

                }

            else //ยังไม่ยื้ม
            {
                    System.out.println("\t\t\tThis book.txt code has been rented.");
            }


            else //ไม่เจอหนังสือ
            {
                System.out.println("\t\t\tBook code not found.");
            }

            System.out.print("\t\t\tDo you want to Return Book [Y/N] :");
            con = String.valueOf(new Scanner(System.in).nextLine());


        } while (con.equals("Y") || con.equals("y"));


    }


    public static void showMenu()
    {
        System.out.println("\t\t\t  Book Land store.");
        System.out.println("\t\t\t........Menu.......");
        System.out.println("\t\t\t1. Input Data.");
        System.out.println("\t\t\t2. Edit && Delete data.");
        System.out.println("\t\t\t3. Display data.");
        System.out.println("\t\t\t4. Rent Book.");
        System.out.println("\t\t\t5. Return Book.");
        System.out.println("\t\t\t.......................");
    }



}








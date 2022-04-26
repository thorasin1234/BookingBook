import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

public class Rabob {

    public Deque<Book> loadBook() {

        Deque<Book> loadBook = new ArrayDeque<>();

        File myFile = new File("src/book.txt");



        try (BufferedReader reader = new BufferedReader(new FileReader(myFile)))
        {
            String[] fields = null;
            String line = null;

            for (int i = 0 ; ((line = reader.readLine()) != null); i++) {
                fields = line.split(",");

//                Book book = new Book(String.valueOf(fields[0]),String.valueOf(fields[1]),Double.parseDouble(fields[2])
//                        ,Double.parseDouble(fields[3]),Integer.parseInt(fields[4]),Integer.parseInt(fields[5]));

                Book book = new Book();

                book.setCode(String.valueOf(fields[0]));

//                System.out.print("\t\t\tKey Name Book =");
//                Name[top] = String.valueOf(new Scanner(System.in).nextLine());
                book.setName(String.valueOf(fields[1]));

//                System.out.print("\t\t\tKey Price =");
//                Price[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                book.setPrice(Double.parseDouble(fields[2]));

//                System.out.print("\t\t\tKey Rent for day =");
//                Rent_day[top] = Double.parseDouble(new Scanner(System.in).nextLine());
                book.setRent_day(Double.parseDouble(fields[3]));

//                System.out.println("\t\t\t.......................");


//                Status[top] = 0;
                book.setStatus(Integer.parseInt((fields[4])));

//                Date[top] = 0;
                book.setDate(Integer.parseInt((fields[5])));


                loadBook.add(book);
//                loadGames.set(i, game);

            }

        }

        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }



        return loadBook;


    }


//    public Deque<Book> listBook = loadBook();

    public static void writeOn(Deque<Book> listBook)
    {


        try (BufferedWriter bW = new BufferedWriter(new FileWriter(new File("src/book.txt"))))
        {
//            System.out.printf("\t\t\t%1$s  %2$s  %3$s  %4$s  %5$s  %6$s " + "\r\n",  newBook.getCode(), newBook.getName()
//                    , newBook.getPrice(), newBook.getRent_day(), newBook.getStatus(), newBook.getStatus());

            for (Book loopBook: listBook)
            {
                bW.write(loopBook.getCode()+ "," + loopBook.getName()
                        +  "," +loopBook.getPrice()+ "," + loopBook.getRent_day() + "," + loopBook.getStatus()+ "," + loopBook.getStatus());
                bW.newLine();
            }

//            bW.write(newBook.getCode()+ "," + newBook.getName()
//                    +  "," +newBook.getPrice()+ "," + newBook.getRent_day() + "," + newBook.getStatus()+ "," + newBook.getStatus());
//            bW.newLine();
//
//            listBook.addLast(newBook);
        }

        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }


    public static Book checkTheBook(Deque<Book> listBook ,String aCode)
    {

        for (Book book : listBook)
        {

            if (Objects.equals(book.getCode(), aCode)) {

                return book;
            }

        }

        return new Book("Not found");

    }



}

public class Book {

    private  String Code;
    private  String Name;
    private  double Price; //try
    private  double Rent_day;
    private  int Status;
    private  int Date;
    private  double Deposit;
    private  int Date_return;

    public Book()
    {

    }

    public Book(String talangka)
    {

        this.Name = talangka;

    }

    public  String getCode() {
        return Code;
    }

    public  void setCode(String code) {
        Code = code;
    }

    public  String getName() {
        return Name;
    }

    public  void setName(String name) {
        Name = name;
    }

    public  double getPrice() {
        return Price;
    }

    public  void setPrice(double price) {
        Price = price;
    }

    public  double getRent_day() {
        return Rent_day;
    }

    public  void setRent_day(double rent_day) {
        Rent_day = rent_day;
    }

    public  int getStatus() {
        return Status;
    }

    public  void setStatus(int status) {
        Status = status;
    }

    public  int getDate() {
        return Date;
    }

    public  void setDate(int date) {
        Date = date;
    }

    public  double getDeposit() {
        return Deposit;
    }

    public  void setDeposit(double deposit) {
        Deposit = deposit;
    }

    public  int getDate_return() {
        return Date_return;
    }

    public  void setDate_return(int date_return) {
        Date_return = date_return;
    }

    @Override
    public String toString() {
        return Name+Code;
    }
}

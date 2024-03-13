package cinemas;

public class Cinema {
    private String name,creator;
    private int duration, price, ticketSales, studentDiscount, teacherDiscount;

    public Cinema(String name, String creator, int duration, int price, int ticketSales, int studentDiscount, int teacherDiscount) {
        setName(name);
        setCreator(creator);
        setDuration(duration);
        setPrice(price);
        setTicketSales(ticketSales);
        setStudentDiscount(studentDiscount);
        setTeacherDiscount(teacherDiscount);
    }

    public Cinema() {
        setName("Die Hard"+(int)(Math.random()*8+1));
        setCreator("Tarantino"+(int)(Math.random()*3+1));
        setDuration((int)(Math.random()*90+90));
        setPrice((int)(Math.random()*171+30));
      // setTicketSales(3);
        setTicketSales((int)(Math.random()*31+10));
        setStudentDiscount((int)(Math.random()*11+10));
        setTeacherDiscount((int)(Math.random()*6+5));
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creators) {
        this.creator = creators;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTicketSales() {
        return ticketSales;
    }

    public void setTicketSales(int ticketSales) {
        this.ticketSales = ticketSales;
    }

    public int getStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(int studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    public int getTeacherDiscount() {
        return teacherDiscount;
    }

    public void setTeacherDiscount(int teacherDiscount) {
        this.teacherDiscount = teacherDiscount;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", ticketSales=" + ticketSales +
                ", studentDiscount=" + studentDiscount +
                ", teacherDiscount=" + teacherDiscount +
                '}';
    }
}

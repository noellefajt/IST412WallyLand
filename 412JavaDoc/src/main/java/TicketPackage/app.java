package TicketPackage;

public class app {
    public static void main(String[] args)
    {
        TicketModel model = new TicketModel();
        TicketController controller = new TicketController(model);
    }
}

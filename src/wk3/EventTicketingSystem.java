
public class EventTicketingSystem 
{
    
    private String eventName;
    private double ticketCost;
    private int attendeeNumber;
    private double hostingCost;
    private double revenue;

    public EventTicketingSystem()
    {
        this("Default", 1, 1);
    }
    public EventTicketingSystem(String eventName, double ticketCost, double hostingCost)
    {
        setEventName(eventName);
        setTicketCost(ticketCost);
        setHostingCost(hostingCost);
    }


    public String getEventName() 
    {
        return eventName;
    }

    public void setEventName(String eventName) 
    {
        this.eventName = eventName;
    }

    public double getTicketCost() 
    {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) 
    {
        this.ticketCost = ticketCost;
    }

    public double getHostingCost() 
    {
        return hostingCost;
    }

    public void setHostingCost(double hostingCost) 
    {
        this.hostingCost = hostingCost;
    }

    public int getAttendeeNumber() 
    {
        return attendeeNumber;
    }

    public void setAttendeeNumber(int attendeeNumber) 
    {
        this.attendeeNumber = attendeeNumber;
    }

    public double getRevenue() 
    {
        return revenue;
    }

    public void setRevenue(double revenue) 
    {
        this.revenue = revenue;
    }

    public void buyTickets(int numberOfTickets)
    {
        setRevenue(getRevenue() + numberOfTickets * getTicketCost());
        setAttendeeNumber(getAttendeeNumber() + numberOfTickets);
    }

    public void refundTickets(int numberOfTickets)
    {
        setRevenue(getRevenue() - numberOfTickets * getTicketCost());
        setAttendeeNumber(getAttendeeNumber() - numberOfTickets);
    }

}

class Book{
    int total_seat=10;
    
    synchronized void book(int seat){
        if(total_seat>=seat){
            System.out.println("<<<<<<<<<<"+seat+" Seat Booked Sucessfulyy>>>>>>>");
            total_seat=total_seat-seat;
            System.out.println("Available Seats = "+total_seat);
        }else{
            System.out.println("<<<<<>SORRY SEATS ARE NOT BOOKED>>>>");
            System.out.println("Enter valid Seats count.......");
        }
    }
}
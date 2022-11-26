public class turnOn implements command{

    reciever r;
    @Override
    public void execute() {
        System.out.println("Appliance is on");
    }
}

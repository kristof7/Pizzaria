public class Client {

    private String clientName;
    private String clientAddress;
    private String clientPhoneNumber;

    public Client(String clientName, String clientAddress, String clientPhoneNumber) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Name= " + clientName + ", adress= " + clientAddress + ", phone number= " + clientPhoneNumber;
    }
}

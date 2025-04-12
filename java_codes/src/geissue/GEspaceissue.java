package geissue;

public class GEspaceissue {
    private String phoneNumber;

    public void setPhoneNumber(String input) {
        phoneNumber = (input.length() > 10) ? input.substring(0, 10) : input;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
    	GEspaceissue phone = new GEspaceissue();
        phone.setPhoneNumber("12345678901234"); //substring will take only 10 digits from the input in our issue
        System.out.println("Phone Number: " + phone.getPhoneNumber());
       
    }
}


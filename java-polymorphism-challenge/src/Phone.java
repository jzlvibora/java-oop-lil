public class Phone {
    private int countryCode;
    private String phoneNumber;

    public Phone(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneNumber) {
        if(phoneNumber.length()>10){
            this.countryCode=Integer.parseInt(phoneNumber.substring(0, phoneNumber.length()-10));
            this.phoneNumber=phoneNumber.substring(phoneNumber.length()-10);
        }
        else{
            this.countryCode=1;
            this.phoneNumber=phoneNumber;
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

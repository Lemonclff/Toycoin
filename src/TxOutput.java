public class TxOutput {
    private String address;
    private int amount;

    public TxOutput(String address, int amount) {
        this.address = address;
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public int getAmount() {
        return amount;
    }
}
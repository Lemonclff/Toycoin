public class TxInput {
    private String txOutId;
    private int txOutIndex;
    private String signature;

    public TxInput(String txOutId, int txOutIndex, String signature) {
        this.txOutId = txOutId;
        this.txOutIndex = txOutIndex;
        this.signature = signature;
    }

    public String getTxOutId() {
        return txOutId;
    }

    public int getTxOutIndex() {
        return txOutIndex;
    }

    public String getSignature() {
        return signature;
    }
}
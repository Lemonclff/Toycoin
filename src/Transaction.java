import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private String id;
    private List<TxInput> txInputs;
    private List<TxOutput> txOutputs;

    public Transaction(List<TxInput> txInputs, List<TxOutput> txOutputs) throws NoSuchAlgorithmException {
        this.txInputs = txInputs;
        this.txOutputs = txOutputs;
        this.id = calculateTransactionId();
    }

    public String getId() {
        return id;
    }

    public List<TxInput> getTxInputs() {
        return txInputs;
    }

    public List<TxOutput> getTxOutputs() {
        return txOutputs;
    }

    private String calculateTransactionId() throws NoSuchAlgorithmException {
        StringBuilder txInputContent = new StringBuilder();
        for (TxInput txInput : txInputs) {
            txInputContent.append(txInput.getTxOutId()).append(txInput.getTxOutIndex());
        }

        StringBuilder txOutputContent = new StringBuilder();
        for (TxOutput txOutput : txOutputs) {
            txOutputContent.append(txOutput.getAddress()).append(txOutput.getAmount());
        }

        return ProofOfWork.calculateHash(txInputContent.toString() + txOutputContent.toString());
    }
}
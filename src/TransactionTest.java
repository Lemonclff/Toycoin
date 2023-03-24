import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class TransactionTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // create some transactions
        TxOutput txOut1 = new TxOutput("address1", 10);
        TxOutput txOut2 = new TxOutput("address2", 5);
        List<TxOutput> txOutputs1 = new ArrayList<>();
        txOutputs1.add(txOut1);
        txOutputs1.add(txOut2);

        TxInput txIn1 = new TxInput("txOutId1", 0, "signature1");
        TxInput txIn2 = new TxInput("txOutId2", 1, "signature2");
        List<TxInput> txInputs1 = new ArrayList<>();
        txInputs1.add(txIn1);
        txInputs1.add(txIn2);

        Transaction tx1 = new Transaction(txInputs1, txOutputs1);

        TxOutput txOut3 = new TxOutput("address3", 7);
        TxOutput txOut4 = new TxOutput("address4", 3);
        List<TxOutput> txOutputs2 = new ArrayList<>();
        txOutputs2.add(txOut3);
        txOutputs2.add(txOut4);

        TxInput txIn3 = new TxInput("txOutId3", 0, "signature3");
        TxInput txIn4 = new TxInput("txOutId4", 1, "signature4");
        List<TxInput> txInputs2 = new ArrayList<>();
        txInputs2.add(txIn3);
        txInputs2.add(txIn4);

        Transaction tx2 = new Transaction(txInputs2, txOutputs2);

        // print out the transaction IDs
        System.out.println("Transaction 1 ID: " + tx1.getId());
        System.out.println("Transaction 2 ID: " + tx2.getId());
    }
}
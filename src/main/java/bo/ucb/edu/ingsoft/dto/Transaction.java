package bo.ucb.edu.ingsoft.dto;

import java.util.Date;

public class Transaction {
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }



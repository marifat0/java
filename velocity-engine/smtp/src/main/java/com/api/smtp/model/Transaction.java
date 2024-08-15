package com.api.smtp.model;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Transaction {
    private String status;
    private List<Object> data;
    long totalBalance;

    // Fields from protobuffer
    private String transactionId;
    private String transactionType;
    private String timestamp;
    private Long amount;
    private String description;

    public Transaction() {
    }

    public Transaction(String status, List<Object> data, long totalBalance) {
        this.status = status;
        this.data = data;
        this.totalBalance = totalBalance;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }

    // Getters and Setters from protobuffer
    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", totalBalance=" + totalBalance +
                ", transactionId='" + transactionId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }


}

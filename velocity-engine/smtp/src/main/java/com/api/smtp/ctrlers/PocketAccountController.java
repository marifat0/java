package com.api.smtp.ctrlers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.smtp.enums.Constants;
import com.api.smtp.model.PocketAccount;
import com.api.smtp.proto.Payment;
import com.api.smtp.proto.Pocket;
import com.api.smtp.proto.Transaction;
import com.api.smtp.proto.TransactionResponse;
import com.api.smtp.proto.Transfer;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;

@RestController
@RequestMapping("/pocket")
public class PocketAccountController {

    private Log log = LogFactory.getLog(PocketAccountController.class);

    @PostMapping("/pocketAccount")
    public Map<String, Map<String, List<PocketAccount>>> pocketAccount(
        @RequestBody String customerID,
        @RequestBody String deviceID,
        @RequestBody String sessionID,
        @RequestBody String token
    ) {
        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("token: " + token);

        PocketAccount pa1 = new PocketAccount(
            Integer.toUnsignedLong(1),
            "19273",
            Constants.PA_MAIN.getValue(),
            "1234567890",
            new BigDecimal(1000),
            "IDR",
            "Main pocket account");
        PocketAccount pa2 = new PocketAccount(
            Integer.toUnsignedLong(2),
            "19273",
            Constants.PA_SAVING.getValue(),
            "1234567891",
            new BigDecimal(2000),
            "IDR",
            "Saving pocket account");
        PocketAccount pa3 = new PocketAccount(
            Integer.toUnsignedLong(3),
            "19273",
            Constants.PA_SPENDING.getValue(),
            "1234567892",
            new BigDecimal(3000),
            "IDR",
            "Spending pocket account");
        PocketAccount pa4 = new PocketAccount(
            Integer.toUnsignedLong(4),
            "19273",
            Constants.PA_TARGET.getValue(),
            "1234567893",
            new BigDecimal(4000),
            "IDR",
            "Target pocket account");
        
        List<PocketAccount> mainPocket = List.of(pa1);
        List<PocketAccount> savingPocket = List.of(pa2);
        List<PocketAccount> spendingPocket = List.of(pa3);
        List<PocketAccount> targetPocket = List.of(pa4);
        
        Map<String, List<PocketAccount>> pocketMap = Map.of(
            "main", mainPocket,
            "saving", savingPocket,
            "spending", spendingPocket,
            "target", targetPocket);

        Map<String, Map<String, List<PocketAccount>>> result = Map.of("pocketAccount", pocketMap);
        return result;
    }

    @RequestMapping("/createPocketAccountMain")
    public Map<String, Object> createPocketAccount(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID,
    @RequestBody String token) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("token: " + token);
        /**
         * Create pocket account (Main)
         * Populate it with dummy data, then return it
         * PocketAccount field:
         * - ID
         * - type
         * - cif (customer information file) number
         * - account number
         * - balance
         * - currency
         * - description
         */
        Map<String,Object> pocketAccount = new HashMap<>();
        PocketAccount pa1 = new PocketAccount(
            Integer.toUnsignedLong(1),
            Constants.PA_MAIN.getValue(),
            "19273",
            "1234567890",
            new BigDecimal(1000),
            "IDR",
            "Main pocket account");
        List<PocketAccount> mainPocket = List.of(pa1);
        pocketAccount.put("pocket", mainPocket);
        pocketAccount.put("status", "Success");
        pocketAccount.put("message", "Main pocket account created successfully");
        return pocketAccount;
    }
    @RequestMapping("/createPocketAccountSaving")
    public Map<String, Object> pocketAccountSavingMain(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID,
    @RequestBody String token) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("token: " + token);
        /**
         * Create pocket account (Saving)
         * Populate it with dummy data, then return it
         * PocketAccount field:
         * - ID
         * - type
         * - cif (customer information file) number
         * - account number
         * - balance
         * - currency
         * - description
         */
        Map<String,Object> pocketAccount = new HashMap<>();
        PocketAccount pa1 = new PocketAccount(
            Integer.toUnsignedLong(1),
            Constants.PA_SAVING.getValue(),
            "19273",
            "1234567891",
            new BigDecimal(2000),
            "IDR",
            "Saving pocket account");
        List<PocketAccount> savingPocket = List.of(pa1);
        pocketAccount.put("pocket", savingPocket);
        pocketAccount.put("status", "Success");
        pocketAccount.put("message", "Saving pocket account created successfully");
        return pocketAccount;
    }

    @RequestMapping("/createPocketAccountSpending")
    public Map<String, Object> pocketAccountSavingSpending(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID,
    @RequestBody String token) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("token: " + token);
        /**
         * Create pocket account (Spending)
         * Populate it with dummy data, then return it
         * PocketAccount field:
         * - ID
         * - type
         * - cif (customer information file) number
         * - account number
         * - balance
         * - currency
         * - description
         */
        Map<String,Object> pocketAccount = new HashMap<>();
        PocketAccount pa1 = new PocketAccount(
            Integer.toUnsignedLong(1),
            Constants.PA_SPENDING.getValue(),
            "19273",
            "1234567892",
            new BigDecimal(3000),
            "IDR",
            "Spending pocket account");
        List<PocketAccount> spendingPocket = List.of(pa1);
        pocketAccount.put("pocket", spendingPocket);
        pocketAccount.put("status", "Success");
        pocketAccount.put("message", "Spending pocket account created successfully");
        return pocketAccount;
    }

    @RequestMapping("/createPocketAccountTarget")
    public Map<String, Object> pocketAccountSavingTarget(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID,
    @RequestBody String token) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("token: " + token);
        /**
         * Create pocket account (Target)
         * Populate it with dummy data, then return it
         * PocketAccount field:
         * - ID
         * - type
         * - cif (customer information file) number
         * - account number
         * - balance
         * - currency
         * - description
         */
        Map<String,Object> pocketAccount = new HashMap<>();
        PocketAccount pa1 = new PocketAccount(
            Integer.toUnsignedLong(1),
            Constants.PA_TARGET.getValue(),
            "19273",
            "1234567893",
            new BigDecimal(4000),
            "IDR",
            "Target pocket account");
        List<PocketAccount> targetPocket = List.of(pa1);
        pocketAccount.put("pocket", targetPocket);
        pocketAccount.put("status", "Success");
        pocketAccount.put("message", "Target pocket account created successfully");
        return pocketAccount;
    }

    @RequestMapping("/allPocketAccountHistory")
    public String  allPocketAccountHistory(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);

        // Use proto above to create the response
        Payment payment1 = Payment.newBuilder()
            .setReferenceNumber("FLY-123456")
            .setProductCode("FLY")
            .setBillerCode("FLY")
            .setBillerName("Air Asia Ticket")
            .build();

        Transfer transfer1 = Transfer.newBuilder()
            .setReferenceNumber("BCA-123456")
            .setBankCode("BCA")
            .setBankName("Bank Central Asia")
            .setAccountNumber("1234567890")
            .setAccountName("M. HANIF")
            .build();
        
        Pocket pocket1 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_MAIN.getValue())
            .setPocketAccount("1234567890")
            .build();

        Pocket pocket2 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_SAVING.getValue())
            .setPocketAccount("1234567890")
            .build();
        
        Pocket pocket3 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_SPENDING.getValue())
            .setPocketAccount("1234567890")
            .build();

        Pocket pocket4 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_TARGET.getValue())
            .setPocketAccount("1234567890")
            .build();

        Transaction transaction1 = Transaction.newBuilder()
            .setTransactionId("1")
            .setTransactionType(Constants.TRX_TYPE_DEPOSIT.getValue())
            .setAmount(10000000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket1.toBuilder().build())
            .setPocket(pocket2.toBuilder().build())
            .setDescription(" ")
            .build();

        Transaction transaction2 = Transaction.newBuilder()
            .setTransactionId("2")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setPayment(payment1.toBuilder().build())
            .setDescription("Bayar tiket pesawat")
            .build();

        Transaction transaction3 = Transaction.newBuilder()
            .setTransactionId("3")
            .setTransactionType(Constants.TRX_TYPE_CREDIT.getValue())
            .setAmount(50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket2.toBuilder().build())
            .setPocket(pocket1.toBuilder().build())
            .setDescription("pindah ke main pocket account")
            .build();

        Transaction transaction4 = Transaction.newBuilder()
            .setTransactionId("4")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setTransfer(transfer1.toBuilder().build())
            .setDescription("Move to from spending to main pocket account")
            .build();

        Transaction transaction5 = Transaction.newBuilder()
            .setTransactionId("5")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket4.toBuilder().build())
            .setPocket(pocket1.toBuilder().build())
            .setDescription("Tabungan untuk liburan ke Bali")
            .build();


// message TransactionResponse {
//     string status = 1;
//     repeated Transaction data = 2;
//     int64 totalBalance = 3;
// }
//
// calculate totalBalance: sum of all transaction amount

        long totalBalance = transaction1.getAmount() + transaction2.getAmount() + transaction3.getAmount() + transaction4.getAmount() + transaction5.getAmount();

        // Create response

        TransactionResponse response = TransactionResponse.newBuilder()
            .setStatus("Success")
            .addData(transaction1)
            .addData(transaction2)
            .addData(transaction3)
            .addData(transaction4)
            .addData(transaction5)
            .setTotalBalance(totalBalance)
            .build();

        try {
            Map<String, Object> result = new HashMap<>();
            String json = JsonFormat.printer().print(response);
            log.info("json: " + json);
            result.put("customerID", customerID);
            result.put("historyPA", json);
            Long totalBalancePA_Main = transaction1.getAmount() + transaction3.getAmount() + transaction5.getAmount();
            Long totalBalancePA_Saving = transaction1.getAmount();
            Long totalBalancePA_Spending = transaction2.getAmount() + transaction4.getAmount();
            Long totalBalancePA_Target = Math.abs(transaction5.getAmount());

            result.put("totalBalancePA_Main", totalBalancePA_Main);
            result.put("totalBalancePA_Saving", totalBalancePA_Saving);
            result.put("totalBalancePA_Spending", totalBalancePA_Spending);
            result.put("totalBalancePA_Target", totalBalancePA_Target);
            return result.toString();
        } catch (Exception e) {
            log.error("Error: " + e.getMessage());
            return "Error: " + e.getMessage();
        }
    }

    @RequestMapping("/historyPocketAccount")
    public com.api.smtp.model.Transaction  historyPocketAccount(
    @RequestBody String customerID,
    @RequestBody String deviceID,
    @RequestBody String sessionID,
    @RequestBody String pocketID,
    @RequestBody String pocketType) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("pocketID: " + pocketID);
        log.info("pocketType: " + pocketType);

        // Use proto above to create the response

        Pocket pocket1 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_MAIN.getValue())
            .setPocketAccount("1234567890")
            .build();

        Pocket pocket2 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_SAVING.getValue())
            .setPocketAccount("1234567890")
            .build();

        Pocket pocket3 = Pocket.newBuilder()
            .setPocketId("S1")
            .setPocketType(Constants.PA_SPENDING.getValue())
            .setPocketAccount("1234567890")
            .build();

        Pocket pocket4 = Pocket.newBuilder()
            .setPocketId("123456")
            .setPocketType(Constants.PA_TARGET.getValue())
            .setPocketAccount("1234567890")
            .build();

        Payment payment1 = Payment.newBuilder()
            .setReferenceNumber("FLY-123456")
            .setProductCode("FLY")
            .setBillerCode("FLY")
            .setBillerName("Air Asia Ticket")
            .build();

        Transfer transfer1 = Transfer.newBuilder()
            .setReferenceNumber("BCA-123456")
            .setBankCode("BCA")
            .setBankName("Bank Central Asia")
            .setAccountNumber("1234567890")
            .setAccountName("M. HANIF")
            .build();

// Set All Transaction with setFrom(pocket3)

        Transaction transaction1 = Transaction.newBuilder()
            .setTransactionId("1")
            .setTransactionType(Constants.TRX_TYPE_DEPOSIT.getValue())
            .setAmount(100000000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket1.toBuilder().build())
            .setPocket(pocket3.toBuilder().build())
            .setDescription(" ")
            .build();

        Transaction transaction2 = Transaction.newBuilder()
            .setTransactionId("2")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setPayment(payment1.toBuilder().build())
            .setDescription("Bayar tiket pesawat")
            .build();

        Transaction transaction3 = Transaction.newBuilder()
            .setTransactionId("3")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setPocket(pocket2.toBuilder().build())
            .setDescription("pindah ke saving pocket account")
            .build();

        Transaction transaction4 = Transaction.newBuilder()
            .setTransactionId("4")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setTransfer(transfer1.toBuilder().build())
            .setDescription("Move to from spending to main pocket account")
            .build();

        Transaction transaction5 = Transaction.newBuilder()
            .setTransactionId("5")
            .setTransactionType(Constants.TRX_TYPE_DEBIT.getValue())
            .setAmount(-50000)
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket3.toBuilder().build())
            .setPocket(pocket4.toBuilder().build())
            .setDescription("Tabungan untuk liburan ke Bali")
            .build();
            
        // Set response

        long sumBalanceTrx1, sumBalanceTrx2, sumBalanceTrx3, sumBalanceTrx4, sumBalanceTrx5;
        sumBalanceTrx1 = transaction1.getAmount();
        sumBalanceTrx2 = transaction2.getAmount();
        sumBalanceTrx3 = transaction3.getAmount();
        sumBalanceTrx4 = transaction4.getAmount();
        sumBalanceTrx5 = transaction5.getAmount();

        long totalBalance = sumBalanceTrx1 + sumBalanceTrx2 + sumBalanceTrx3 + sumBalanceTrx4 + sumBalanceTrx5;

        TransactionResponse response = TransactionResponse.newBuilder()
            .setStatus("Success")
            .addData(transaction1)
            .addData(transaction2)
            .addData(transaction3)
            .addData(transaction4)
            .addData(transaction5)
            .setTotalBalance(totalBalance)
            .build();
            String json = "";
        try {
            json = JsonFormat.printer().print(response);
            log.info("json: " + json);
            } catch (Exception e) {
                log.error("Error: " + e.getMessage());
            }

        com.api.smtp.model.Transaction trx;

        ObjectMapper mapper = new ObjectMapper();
        try {
            trx = mapper.readValue(json, com.api.smtp.model.Transaction.class);
            return trx;
        } catch (Exception e) {
            log.error("Error: " + e.getMessage());
            return null;
        }
    }

    @RequestMapping("/pocketWithdrawal")
    public com.api.smtp.model.Transaction pocketWithdrwal(
    @RequestParam String customerID,
    @RequestParam String deviceID,
    @RequestParam String sessionID,
    @RequestParam String pocketID,
    @RequestParam String pocketType,
    @RequestParam String amount) {

        log.info("customerID: " + customerID);
        log.info("deviceID: " + deviceID);
        log.info("sessionID: " + sessionID);
        log.info("pocketID: " + pocketID);
        log.info("pocketType: " + pocketType);
        log.info("amount: " + amount);

        // Just dummy data
        // represent the user withdraw money from pocket account
        // and return the response with the remaining balance
        
        Pocket pocket = Pocket.newBuilder()
            .setPocketId(pocketID)
            .setPocketType(pocketType)
            .setPocketAccount("1234567890")
            .build();


        Transaction t1 = Transaction.newBuilder()
            .setTransactionId("1")
            .setTransactionType(Constants.TRX_TYPE_WITHDRAW.getValue())
            .setAmount(Long.parseLong(amount))
            .setTimestamp(Timestamp.newBuilder().build())
            .setFrom(pocket)
            .setDescription("Withdraw money from pocket account")
            .build();

        try {
            String trxJson = JsonFormat.printer().print(t1);
            log.info("trxJson: " + trxJson);

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);

            com.api.smtp.model.Transaction trx = new com.api.smtp.model.Transaction();
            trx.setStatus("Success");
            trx = mapper.readValue(trxJson, com.api.smtp.model.Transaction.class);
            log.info("trx: " + trx.toString());

            return trx;
        } catch (Exception e) {
            log.error("Error: " + e.getMessage());
            return null;
        }
    }

}

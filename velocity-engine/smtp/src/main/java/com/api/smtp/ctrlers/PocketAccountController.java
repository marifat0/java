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
import org.springframework.web.bind.annotation.RestController;

import com.api.smtp.enums.Constants;
import com.api.smtp.model.PocketAccount;

@RestController
@RequestMapping("/pocket")
public class PocketAccountController {

    Log log = LogFactory.getLog(PocketAccountController.class);

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
            "mainPocket", mainPocket,
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
        pocketAccount.put("mainPocket", mainPocket);
        pocketAccount.put("Status", "Success");
        pocketAccount.put("Message", "Main pocket account created successfully");
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
        pocketAccount.put("Saving", savingPocket);
        pocketAccount.put("Status", "Success");
        pocketAccount.put("Message", "Saving pocket account created successfully");
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
        pocketAccount.put("Spending", spendingPocket);
        pocketAccount.put("Status", "Success");
        pocketAccount.put("Message", "Spending pocket account created successfully");
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
        pocketAccount.put("Target", targetPocket);
        pocketAccount.put("Status", "Success");
        pocketAccount.put("Message", "Target pocket account created successfully");
        return pocketAccount;
    }

}

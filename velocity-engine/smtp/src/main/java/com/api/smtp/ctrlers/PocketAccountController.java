package com.api.smtp.ctrlers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.smtp.model.PocketAccount;

@RestController
@RequestMapping("/oob")
public class PocketAccountController {

    Log log = LogFactory.getLog(PocketAccountController.class);

    @RequestMapping("/pa")
        public Map<String, List<PocketAccount>> pocketAccount() {

        PocketAccount pa1 = new PocketAccount("Saving", new BigDecimal(1000), "IDR", "Saving account");
        PocketAccount pa2 = new PocketAccount("Spending", new BigDecimal(500), "IDR", "Spending account");
        PocketAccount pa3 = new PocketAccount("Target", new BigDecimal(2000), "IDR", "Target account");
        
        List<PocketAccount> pockets = List.of(pa1);
        List<PocketAccount> pockets2 = List.of(pa2);
        List<PocketAccount> pockets3 = List.of(pa3);

        Map<String, List<PocketAccount>> pocketMap = Map.of("Saving", pockets, "Spending", pockets2, "Target", pockets3);

        return pocketMap;
    }

    @RequestMapping("/pa/saving")
    public String pocketAccountSaving() {
        return "Pocket Account Saving";
    }

    @RequestMapping("/pa/saving/main")
    public String pocketAccountSavingMain() {
        return "Pocket Account Saving Main";
    }

    @RequestMapping("/pa/saving/spending")
    public String pocketAccountSavingSpending() {
        return "Pocket Account Saving Spending";
    }

    @RequestMapping("/pa/saving/target")
    public String pocketAccountSavingTarget() {
        return "Pocket Account Saving Target";
    }

}

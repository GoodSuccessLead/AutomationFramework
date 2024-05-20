package Util;

import java.util.Objects;

public class FiltersValidations {
    public void validation_group(String group) throws InterruptedException {
        if(Objects.equals(group, "Group - Barclays")){
            FiltersActions x = new FiltersActions();
            x.field_group_config1(group);
        }if(Objects.equals(group, "Group - Erste")){
            FiltersActions x = new FiltersActions();
            x.field_group_config2(group);
        }if(Objects.equals(group, "Group - Isbank")){
            FiltersActions x = new FiltersActions();
            x.field_group_config3(group);
        }if(Objects.equals(group, "Group - Lloyds")){
            FiltersActions x = new FiltersActions();
            x.field_group_config4(group);
        }if(Objects.equals(group, "Group - MBH Bank")){
            FiltersActions x = new FiltersActions();
            x.field_group_config5(group);
        }if(Objects.equals(group, "Group - OTP Bank")){
            FiltersActions x = new FiltersActions();
            x.field_group_config6(group);
        }if(Objects.equals(group, "Group - Raiffeisen Bank ")){
            FiltersActions x = new FiltersActions();
            x.field_group_config7(group);
        }if(Objects.equals(group, "Group - UniCredit Bank ")){
            FiltersActions x = new FiltersActions();
            x.field_group_config8(group);
        }

    }
    public void validation_region(String region, String group) throws InterruptedException {
        if(Objects.equals(group, "Group - Barclays")){
            if(Objects.equals(region, "All")){
                FiltersActions x = new FiltersActions();
                x.field_region_config1(region);
            }
            if(Objects.equals(region, "Europe")){
                FiltersActions x = new FiltersActions();
                x.field_region_config1(region);
            }
            if(Objects.equals(region, "Europe SEPA")){
                FiltersActions x = new FiltersActions();
                x.field_region_config1(region);
            }
        }

        if(Objects.equals(group, "Group - Lloyds")) {
            if(Objects.equals(region, "All")){
                FiltersActions x = new FiltersActions();
                x.field_region_config1(region);
            }
            if(Objects.equals(region, "Europe")){
                FiltersActions x = new FiltersActions();
                x.field_region_config2(region);
            }
            if(Objects.equals(region, "Europe SEPA")){
                FiltersActions x = new FiltersActions();
                x.field_region_config3(region);
            }
        }
        if(Objects.equals(group, "Group - MBH Bank")) {
            if(Objects.equals(region, "All")){
                FiltersActions x = new FiltersActions();
                x.field_region_config1(region);
            }
            if(Objects.equals(region, "Europe")){
                FiltersActions x = new FiltersActions();
                x.field_region_config2(region);
            }
            if(Objects.equals(region, "Europe SEPA")){
                FiltersActions x = new FiltersActions();
                x.field_region_config3(region);
            }
        }

    }
    public void validation_country(String country, String region) throws InterruptedException {
        if(Objects.equals(region, "All")){
            if(Objects.equals(country, "All")){
                FiltersActions x = new FiltersActions();
                x.field_country_config1(region);
            }
            if(Objects.equals(country, "Germany")){
                FiltersActions x = new FiltersActions();
                x.field_country_config2(region);
            }
            if(Objects.equals(country, "United Kingdom")){
                FiltersActions x = new FiltersActions();
                x.field_country_config3(region);
            }
        }
        if(Objects.equals(region, "Europe")){
            if(Objects.equals(country, "All")){
                FiltersActions x = new FiltersActions();
                x.field_country_config1(region);
            }
            if(Objects.equals(country, "Germany")){
                FiltersActions x = new FiltersActions();
                x.field_country_config2(region);
            }
            if(Objects.equals(country, "United Kingdom")){
                FiltersActions x = new FiltersActions();
                x.field_country_config3(region);
            }
        }
        if(Objects.equals(region, "Europe SEPA")){
            if(Objects.equals(country, "All")){
                FiltersActions x = new FiltersActions();
                x.field_country_config1(region);
            }
            if(Objects.equals(country, "Germany")){
                FiltersActions x = new FiltersActions();
                x.field_country_config2(region);
            }
            if(Objects.equals(country, "United Kingdom")){
                FiltersActions x = new FiltersActions();
                x.field_country_config3(region);
            }
        }
    }
    public void validation_bank(String bank, String country) throws InterruptedException {

        if(Objects.equals(country, "All")){
            if(Objects.equals(bank, "All")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config1(bank);
            }
            if(Objects.equals(bank, "Germany - Barclays BI")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config2(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BI")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config3(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BIP")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config4(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BUK")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config5(bank);
            }
        }
        if(Objects.equals(country, "Germany")) {
            if (Objects.equals(bank, "All")) {
                FiltersActions x = new FiltersActions();
                x.field_bank_config6(bank);
            }
            if (Objects.equals(bank, "Germany - Barclays BI")) {
                FiltersActions x = new FiltersActions();
                x.field_bank_config7(bank);
            }
        }
        if(Objects.equals(country, "United Kingdom")){
            if(Objects.equals(bank, "All")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config8(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BI")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config9(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BIP")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config10(bank);
            }
            if(Objects.equals(bank, "United Kingdom - Barclays BUK")){
                FiltersActions x = new FiltersActions();
                x.field_bank_config11(bank);
            }
        }

    }
    public void validation_banktatus(String bankstatus,String bank) throws InterruptedException {
        //if(Objects.equals(bank, "All")){

            if(Objects.equals(bankstatus, "Active")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config1(bankstatus);
            }
            if(Objects.equals(bankstatus, "All")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config2(bank);
            }
            if(Objects.equals(bankstatus, "Inactive")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config3(bank);
            }
      //  }
        /*
        if(Objects.equals(bank, "Germany - Barclays BI")){
            if(Objects.equals(bankstatus, "Active")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config1(bankstatus);
            }
            if(Objects.equals(bankstatus, "All")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config2(bank);
            }
            if(Objects.equals(bankstatus, "Inactive")){
                FiltersActions x = new FiltersActions();
                x.field_bank_status_config3(bank);
            }
        }

         */
    }
    public void validation_category(String category, String bankstatus) throws InterruptedException {
            if(Objects.equals(category, "ATM Service Fee")){
                FiltersActions x = new FiltersActions();
                x.field_category_config1(category);
            }
            if(Objects.equals(category, "Authorization Services")){
                FiltersActions x = new FiltersActions();
                x.field_category_config2(category);
            }
            if(Objects.equals(category, "Boletín")) {
                FiltersActions x = new FiltersActions();
                x.field_category_config3(category);
            }
    }
    public void validation_sub_category(String subcategory, String category) throws InterruptedException {
        if(Objects.equals(category, "ATM Service Fee")) {
            if (Objects.equals(subcategory, "ATM Service Fee")) {
                FiltersActions x = new FiltersActions();
                x.field_subcategory_config1(subcategory);
            }
        }
        if(Objects.equals(category, "Authorization Services")) {
            if (Objects.equals(subcategory, "Authorization Request")) {
                FiltersActions x = new FiltersActions();
                x.field_subcategory_config2(subcategory);
            }
            if (Objects.equals(subcategory, "Other Authorization")) {
                FiltersActions x = new FiltersActions();
                x.field_subcategory_config3(subcategory);
            }
            if (Objects.equals(subcategory, "Referral Handling")) {
                FiltersActions x = new FiltersActions();
                x.field_subcategory_config4(subcategory);
            }
        }

        if(Objects.equals(category, "Boletín")){
            if(Objects.equals(subcategory, "FD Boletín")){
                FiltersActions x = new FiltersActions();
                x.field_subcategory_config5(subcategory);
            }

        }
    }
}
/*
All
Germany - Barclays BI
United Kingdom - Barclays BI
United Kingdom - Barclays BIP
United Kingdom - Barclays BUK
 */

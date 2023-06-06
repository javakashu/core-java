package JavaStates.day2;

public class ChaseBankApplication {

    public static void main(String[] args) {

        ChaseBankMenu personal = new ChaseBankMenu();
        // personal.menuId = 1;
        personal.setMenuId(1);
        //personal.menuName = "Personal";
        personal.setMenuName("Personal");
        // personal.url = null;
        personal.setUrl("www.google.com");

        //  personal.isLeaf = false;
        personal.setIsLeaf(false);
        // personal.parentMenuId = 0;
        personal.setParentMenuId(0);
        //  personal.slug = null;
        personal.setSlug(null);
        System.out.println(personal);
        System.out.println(personal.getUrl());

        //long mId = personal.getMenuId();

        ChaseBankMenu checking = new ChaseBankMenu();
//        //checking.menuId = 2;
        checking.setMenuId(2);
//        checking.menuName = "Checking";
        checking.setMenuName("checking");
//           checking.url = null;
        checking.setUrl("www.checking.com");
//           checking.isLeaf = false;
        checking.setIsLeaf(false);
//          checking.parentMenuId = 1;
        checking.setParentMenuId(1);
//        checking.slug = null;
        checking.setSlug(null);
//        System.out.println(checking);
        System.out.println(checking.getMenuId());
//
//        ChaseBankMenu chooseCheckingAccount = new ChaseBankMenu();
//        chooseCheckingAccount.menuId = 3;
//        chooseCheckingAccount.menuName = "Choose a Checking Account";
//        chooseCheckingAccount.url = "https://personal.chase.com/personal/checking";
//        chooseCheckingAccount.isLeaf = true;
//        chooseCheckingAccount.parentMenuId = 2;
//        chooseCheckingAccount.slug = null;
//        System.out.println(chooseCheckingAccount);
//
//        ChaseBankMenu business = new ChaseBankMenu();
//        business.menuId = 4;
//        business.menuName = "Business";
//        business.url = null;
//        business.isLeaf = true;
//        business.parentMenuId = 0;
//        business.slug = "business";
//        System.out.println(business);
//
//        ChaseBankMenu bankingSolution = new ChaseBankMenu();
//        bankingSolution.menuId = 5;
//        bankingSolution.menuName = "Banking Solution";
//        bankingSolution.url = "https://www.chase.com/business/banking-solutions-b?jp_cdf=chase.com%7Ctnt-2851b&adobe_mc_sdid=SDID%3D702EDBC7C7C1F194-083C7CF66E7A01F8%7CMCORGID%3DEA673DFC5A2F19060A495C9C%40AdobeOrg%7CTS%3D1684937546&adobe_mc_ref=https%3A%2F%2Fwww.chase.com%2Fbusiness";
//        bankingSolution.isLeaf = false;
//        bankingSolution.parentMenuId = 4;
//        bankingSolution.slug = "banking solution";
//        System.out.println(bankingSolution);
//
//        ChaseBankMenu bankingSolutionChecking = new ChaseBankMenu();
//        bankingSolutionChecking.menuId = 6;
//        bankingSolutionChecking.menuName = "Checking";
//        bankingSolutionChecking.url = null;
//        bankingSolutionChecking.isLeaf = true;
//        bankingSolutionChecking.parentMenuId = 5;
//        bankingSolutionChecking.slug = "banking/checking";
//        System.out.println(bankingSolutionChecking);


    }

}





package JavaStates.day2;

public class ChaseBankMenu {

    private long menuId;
    private String menuName;
    private String url;
    private boolean isLeaf;
    private long parentMenuId;
    private String slug;

    // setter for menuId
    public void setMenuId(long mId){
        menuId = mId;

    }
    public long getMenuId(){
        return menuId;
    }

    public void setMenuName(String menuName1){
        menuName = menuName1;

    }
    public String getMenuName(){
        return menuName;
    }

    public void setUrl(String url1){
        url = url1;
    }
    public String getUrl(){
        return url;
    }

    public void setIsLeaf(boolean leaf1){
        isLeaf =leaf1;
    }
    public boolean getIsLeaf(){
        return isLeaf;
    }
    public void setParentMenuId(long parentMenuId1){
        parentMenuId =parentMenuId1;
    }
    public long getParentMenuId(){
        return parentMenuId;
    }
    public void setSlug(String slug1){
        slug=slug1;
    }

    public static void main(String[] args) {

        ChaseBankMenu personal = new ChaseBankMenu();
        personal.menuId = 1;
        personal.menuName = "Personal";
        personal.url = null;
        personal.isLeaf = false;
        personal.parentMenuId = 0;
        personal.slug = null;
        System.out.println(personal);

        ChaseBankMenu checking = new ChaseBankMenu();
        checking.menuId = 2;
        checking.menuName = "Checking";
        checking.url = null;
        checking.isLeaf = false;
        checking.parentMenuId = 1;
        checking.slug = null;
        System.out.println(checking);

        ChaseBankMenu chooseCheckingAccount = new ChaseBankMenu();
        chooseCheckingAccount.menuId =3;
        chooseCheckingAccount.menuName ="Choose a Checking Account";
        chooseCheckingAccount.url="https://personal.chase.com/personal/checking";
        chooseCheckingAccount.isLeaf=true;
        chooseCheckingAccount.parentMenuId=2;
        chooseCheckingAccount.slug=null;
        System.out.println(chooseCheckingAccount);

        ChaseBankMenu business =new ChaseBankMenu();
        business.menuId =4;
        business.menuName="Business";
        business.url=null;
        business.isLeaf=true;
        business.parentMenuId=0;
        business.slug="business";
        System.out.println(business);

        ChaseBankMenu bankingSolution =new ChaseBankMenu();
        bankingSolution.menuId=5;
        bankingSolution.menuName="Banking Solution";
        bankingSolution.url="https://www.chase.com/business/banking-solutions-b?jp_cdf=chase.com%7Ctnt-2851b&adobe_mc_sdid=SDID%3D702EDBC7C7C1F194-083C7CF66E7A01F8%7CMCORGID%3DEA673DFC5A2F19060A495C9C%40AdobeOrg%7CTS%3D1684937546&adobe_mc_ref=https%3A%2F%2Fwww.chase.com%2Fbusiness";
        bankingSolution.isLeaf=false;
        bankingSolution.parentMenuId=4;
        bankingSolution.slug="banking solution";
        System.out.println(bankingSolution);

        ChaseBankMenu bankingSolutionChecking =new ChaseBankMenu();
        bankingSolutionChecking.menuId =6;
        bankingSolutionChecking.menuName="Checking";
        bankingSolutionChecking.url=null;
        bankingSolutionChecking.isLeaf=true;
        bankingSolutionChecking.parentMenuId=5;
        bankingSolutionChecking.slug="banking/checking";
        System.out.println(bankingSolutionChecking);

       String name = checking.menuName;
        System.out.println(name);
    }


    @Override
    public String toString() {
        return "ChaseBankMenu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", isLeaf=" + isLeaf +
                ", parentMenuId=" + parentMenuId +
                ", slug='" + slug + '\'' +
                '}';
    }
/*
      Menu ID -1 (int)
      Menu name - personal(String)
      URL -(String)
      Is Leaf - False(boolean)
      Parent menu ID - 0 (int)
      slug -(String)

          personal -> checking
              Menu ID -2
              Menu name-checking
              URL -
              Is Leaf - False
              Parent Menu ID- 1
              slug -

              personal -> Checking -> choose a checking account
                  Menu ID - 3
                  Menu name - choose a checking account
                  URL - https://personal.chase.com/personal/checking
                  Is Leaf - True
                  Parent Menu ID -2
                  slug -

     Business
     Menu ID - 4
     Menu name - Business
     URL -
     Has Children - True
     Parent menu ID - 0
     slug - business

        Business -> Banking solution
          Menu ID - 5
          Menu name - Banking solution
          URL -https://www.chase.com/business/banking-solutions-b?jp_cdf=chase.com%7Ctnt-2851b&adobe_mc_sdid=SDID%3D702EDBC7C7C1F194-083C7CF66E7A01F8%7CMCORGID%3DEA673DFC5A2F19060A495C9C%40AdobeOrg%7CTS%3D1684937546&adobe_mc_ref=https%3A%2F%2Fwww.chase.com%2Fbusiness
          Is Leaf - False
          Parent ID- 4
          Slug-banking solution

               Business -> Banking solution->checking
                    Menu ID -6
                    Menu name-checking
                    URL -
                    Is Leaf - True
                    Parent ID- 5
                    slug -banking/checking








      */


}

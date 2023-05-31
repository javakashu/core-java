package JavaStates.day2;

public class chaseBankmenu {

     /*
      Menu ID -1 (int)
      Menu name - personal(String)
      URL -(String)
      Is Leaf - False(boolean)
      Parent menu ID - 0 (int)
      slug -(String)

          personal -> checking & saving
              Menu ID -2
              Menu name-checking & saving
              URL -
              Is Leaf - False
              Parent Menu ID- 1
              slug -

              personal -> Checking & saving -> choose a checking account
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

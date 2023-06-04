package JavaStates.day2;

public class CardType {

    String cardName;
    String cardType;
    String url;

    public static void main(String[] args) {

        CardType name =new CardType();
        name.cardName="Chase";
        name.cardType="Credit";
        name.url=null;
        System.out.println(name);

    }

    @Override
    public String toString() {
        return "CardType{" +
                "cardName='" + cardName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

/*
      card name(String)
      card type(String)
      card url(String)



      */




}

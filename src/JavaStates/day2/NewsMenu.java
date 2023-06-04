package JavaStates.day2;

public class NewsMenu {

    String menuName;
    String menuDescription;
    int menuId;

    public static void main(String[] args) {

        NewsMenu news =new NewsMenu();
        news.menuDescription="name of menu";
        news.menuId =1;
        news.menuName="Akshu";
        System.out.println(news);

    }

    @Override
    public String toString() {
        return "NewsMenu{" +
                "menuName='" + menuName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                ", menuId=" + menuId +
                '}';
    }
/*
       Menu Name(String)
       Menu Description(String)
       Menu id (int)

     */

}

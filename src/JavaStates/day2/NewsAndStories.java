package JavaStates.day2;

import java.util.List;

public class NewsAndStories {

    String image;
    String title;
    boolean isExternal;
    String url;
    int id;
    String coverImage;
    String coverTitle;
    String coverSubtitle;
    String newsAndStoriesMenu;

    public static void main(String[] args) {

        NewsAndStories menu = new NewsAndStories();
        menu.image=null;
        menu.title="abcd";
        menu.isExternal=false;
        menu.id=1;
        menu.coverImage="ancse";
        menu.url=null;
        menu.newsAndStoriesMenu="avf";
        System.out.println(menu);
    }

    @Override
    public String toString() {
        return "NewsAndStories{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", isExternal=" + isExternal +
                ", url='" + url + '\'' +
                ", id=" + id +
                ", coverImage='" + coverImage + '\'' +
                ", coverTitle='" + coverTitle + '\'' +
                ", coverSubtitle='" + coverSubtitle + '\'' +
                ", newsAndStoriesMenu='" + newsAndStoriesMenu + '\'' +
                '}';
    }

   /*
        Image(String)
        Title(String)
        Is External(boolean)
        URL(String)
        ID(int)
        Cover Image(String)
        Cover Title(String)
        Cover Subtitle(String)
        List of news and stories menu(String)



      */


}

package es.xabertum.ajicr_app;

public class Jornada {

    private String card_title;
    private String card_subTitle;
    private int card_image;
    private int id;

    public Jornada(String card_title, String card_subTitle, int card_image, int id) {
        this.card_title = card_title;
        this.card_subTitle = card_subTitle;
        this.card_image = card_image;
        this.id = id;
    }

    public String getCard_title() {
        return card_title;
    }

    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    public String getCard_subTitle() {
        return card_subTitle;
    }

    public void setCard_subTitle(String card_subTitle) {
        this.card_subTitle = card_subTitle;
    }

    public int getCard_image() {
        return card_image;
    }

    public void setCard_image(int card_image) {
        this.card_image = card_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

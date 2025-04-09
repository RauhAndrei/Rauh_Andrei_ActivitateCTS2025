package ro.cts.clase;

public class Banner implements IBannerPrototype {
    private String denumireBanner;
    private String denumireFont;
    private double pret;
    private int latime;
    private int lungime;

    public Banner() {
    }

    public Banner(String denumireFont, String denumireBanner, double pret, int latime, int lungime) {
        this.denumireFont = denumireFont;
        this.denumireBanner = denumireBanner;
        this.pret = pret;
        this.latime = latime;
        this.lungime = lungime;
    }

    public void setDenumireBanner(String denumireBanner) {
        this.denumireBanner = denumireBanner;
    }

    public void setDenumireFont(String denumireFont) {
        this.denumireFont = denumireFont;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banner{");
        sb.append("denumireFont='").append(denumireFont).append('\'');
        sb.append(", denumireBanner='").append(denumireBanner).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", latime=").append(latime);
        sb.append(", lungime=").append(lungime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IBannerPrototype cloneaza(String denumireBanner) {
        Banner banner = new Banner();
        banner.setDenumireBanner(denumireBanner);
        banner.setPret(this.pret);
        banner.setLungime(this.lungime);
        banner.setLatime(this.latime);
        banner.setDenumireFont(this.denumireFont);
        return banner;
    }
}

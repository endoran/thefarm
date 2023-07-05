package thefarm.orchards.apple.model;

public class Apple {
    private String stem;
    private String blossom;
    private String peeling;
    private String juice;
    private String color;

    public Apple(String stem, String blossom, String peeling, String juice, String color) {
        this.stem = stem;
        this.blossom = blossom;
        this.peeling = peeling;
        this.juice = juice;
        this.color = color;
    }

    public String getPeeling() {
        return peeling;
    }

    public void setPeeling(String peeling) {
        this.peeling = peeling;
    }

    public String getJuice() {
        return juice;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    private String size;
    private String texture;
    private String damage;

    public Apple() {
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getBlossom() {
        return blossom;
    }

    public void setBlossom(String blossom) {
        this.blossom = blossom;
    }
}

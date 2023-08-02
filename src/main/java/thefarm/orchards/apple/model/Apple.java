package thefarm.orchards.apple.model;

import thefarm.orchards.common.Color;
import thefarm.orchards.common.Core;

public class Apple {
    /*

     */
    private boolean hasStem;
    private Core core;
    private String peeling;
    private String juice;
    private Color color;
    private String size;
    private String texture;
    private String damage;

    public Apple(boolean hasStem, Core core, String peeling, String juice, Color color, String size, String texture, String damage) {
        this.hasStem = hasStem;
        this.core = core;
        this.peeling = peeling;
        this.juice = juice;
        this.color = color;
        this.size = size;
        this.texture = texture;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "hasStem=" + hasStem +
                ", core=" + core +
                ", peeling='" + peeling + '\'' +
                ", juice='" + juice + '\'' +
                ", color=" + color +
                ", size='" + size + '\'' +
                ", texture='" + texture + '\'' +
                ", damage='" + damage + '\'' +
                '}';
    }

    public String getPeeling() {
        return peeling;
    }

    /**
     * this method sets
     * @param peeling This pram is for...
     */
    public void setPeeling(String peeling) {
        this.peeling = peeling;
    }

    public String getJuice() {
        return juice;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

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

    public boolean getHasStem() {
        return hasStem;
    }

    public void setHasStem(boolean hasStem) {
        this.hasStem = hasStem;
    }

    public Core getCore() { return core; }

    public void setCore(Core core) { this.core = core; }
}
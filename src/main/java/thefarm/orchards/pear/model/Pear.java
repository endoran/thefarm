package thefarm.orchards.pear.model;

import thefarm.orchards.common.Color;
import thefarm.orchards.common.Core;

public class Pear {
    private boolean hasStem;
    private Core core;
    private String peeling;
    private String juice;
    private Color color;
    private String size;
    private String texture;
    private String damage;


    public Pear(boolean hasStem, Core core, String peeling, String juice, Color color, String size, String texture, String damage) {
        this.hasStem = hasStem;
        this.core = core;
        this.peeling = peeling;
        this.juice = juice;
        this.color = color;
        this.size = size;
        this.texture = texture;
        this.damage = damage;
    }

    public boolean isHasStem() {
        return hasStem;
    }

    public Core getCore() {
        return core;
    }

    public String getPeeling() {
        return peeling;
    }

    public String getJuice() {
        return juice;
    }

    public Color getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getTexture() {
        return texture;
    }

    public String getDamage() {
        return damage;
    }

    public void setHasStem(boolean hasStem) {
        this.hasStem = hasStem;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public void setPeeling(String peeling) {
        this.peeling = peeling;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }
}

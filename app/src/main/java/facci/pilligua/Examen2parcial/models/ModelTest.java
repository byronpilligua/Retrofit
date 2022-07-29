package facci.pilligua.Examen2parcial.models;


import com.google.gson.annotations.SerializedName;

public class ModelTest {

    @SerializedName("id")
    String id;
    @SerializedName("firstName")
    String nom1;
    @SerializedName("lastName")
    String ape;
    @SerializedName("fullName")
    String com;
    @SerializedName("title")
    String tit;
    @SerializedName("family")
    String fam;

    @SerializedName("imageUrl")
    String img;

    public ModelTest() {
    }

    public ModelTest(String id, String nom1, String ape, String com, String tit, String fam, String img) {
        this.id = id;
        this.nom1 = nom1;
        this.ape = ape;
        this.com = com;
        this.tit = tit;
        this.fam = fam;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
package com.example.clinics;

public class post {
    String title;
   // String deac;
    String img;

    public post() {
    }

    public post(String title, String deac, String img) {
        this.title = title;
        //this.deac = deac;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   // public String getDeac() {
    //    return deac;
   // }

   // public void setDeac(String deac) {
      //  this.deac = deac;
   // }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

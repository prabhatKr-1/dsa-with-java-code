package com.OOPs;

public class ComplexNos {
    private int real;
    private int img;

    public ComplexNos(int real,int img){
        this.real=real;
        this.img=img;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }
    public void print(){
        if(img<0) {
            System.out.println(real+" -i"+(-img));}
            else if(img>0)
                System.out.println(real+" +i"+img);


    }
    public void mutliply(ComplexNos c){
        int real= (this.real * c.real)- (this.img*c.img);
        int img= (this.real * c.img) + (this.img*c.real);
        this.real= real;    //we didn't assign these in the above two lines because when the second
        this.img=img;       //line is executed, value of real is already updated

    }
    public void conjugate(){
        img*=-1;
    }



}

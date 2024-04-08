class pixel{
    private int red, green, blue;

    //constructors
    pixel(){
        red = green = blue = 255;
    }
    pixel(int r, int g, int b){
        if(r>=0 && r<=255 && g>=0 && g<=255 && b>=0 && b<=255){
            red = r;
            green = g;
            blue = b;
        }
        else{
            red = green = blue = 255;
        }
    }
    //methods
    void changeRGB(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }
    void printRGB(){
        System.out.print(red + " " + green + " " + blue);
    }
}

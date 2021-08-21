package Action;
import Picture.Picture;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
public class Action {
    public int log2(int N)
        {
            int result = (int)(Math.log(N) / Math.log(2));
            return result;
        }

    public ArrayList<String> CalculateFractalDimension(int tekrarSayısı, String foto){
    ArrayList<String> arr =new ArrayList<>();
        //String foto="C:\\Users\\Sinem Dönmez\\OneDrive\\Belgeler\\GitHub\\FractalDimensionWithBoxCountingMethod-\\src\\sample\\a.png";

            //int tekrarSayısı=5;
            Picture a=new Picture(foto);

            double[]x=new double[tekrarSayısı];
            for(int i=0;i<tekrarSayısı;i++)
            x[i]=Math.log(Math.pow(2, i+1));


            int kontrol1=845485445;
            int kontrol2=596524566;

            double[]y= new double[tekrarSayısı];
            double[]z= new double[tekrarSayısı];
            double say;


            for(int f=2;f<=Math.pow(2,tekrarSayısı);f+=f) {
                say=0;
                for(int n=1;n<=f;n++)
                    for(int m=1;m<=f;m++)
                        for(int i=(n-1)*(a.height()/f); i<n*(a.height()/f);i++)
                            for(int j=(m-1)*(a.width()/f); j<m*(a.width()/f); j++){
                                Color renk =a.get(j, i);
                                int r=renk.getRed();
                                int g=renk.getGreen();
                                int b=renk.getBlue();
                                if(r==0 && g==0 && b==0 && (kontrol1!=n || kontrol2!=m)) {
                                    say++;
                                    kontrol1=n;
                                    kontrol2=m;
                                }
                            }

                y[log2(f)-1]=say;
                arr.add("E="+ "1/"+f +" iken N(E)="+y[log2(f)-1]+" olur.");
            }

            double say2=0;
            double say3=0;
            double say4=0;
            double say5=0;


            for(int i=0;i<tekrarSayısı;i++) {
            y[i]=Math.log(y[i]);
            z[i]=x[i]*y[i];
            say2=(say2+z[i]);
            say3=say3+x[i];
            say4=say4+y[i];
            say5=(say5+(x[i]*x[i]));}

            double dim=(tekrarSayısı*say2-(say3*say4))/(tekrarSayısı*say5-(say3*say3));
            arr.add("Şeklin fraktal boyutu yaklaşık olarak "+dim+ " dir.");
            return arr;

    }

    public void GridMaker(){
        String foto="C:\\Users\\Sinem Dönmez\\OneDrive\\Belgeler\\GitHub\\FractalDimensionWithBoxCountingMethod-\\src\\sample\\a.png";
        Color renk1=new Color(0,0,0);
        int tekrarSayısı=10;
        Picture a=new Picture(foto);


        for(int n=1;n<=128;n++)
            for(int i=0; i<a.height();i++)
                for(int j=0; j<a.width(); j++) {
                    if(i==n*(a.width()/128) ||j==n*(a.height()/128) )
                        renk1=new Color(0,0,0);
                    else
                        renk1=a.get(j, i);
                    a.set(j, i, renk1);
                }
        a.show();
    }




 public void BlackWhite(){
        String foto="C:\\Users\\Sinem Dönmez\\OneDrive\\Belgeler\\GitHub\\FractalDimensionWithBoxCountingMethod-\\src\\sample\\a.png";
        Color renk1=new Color(0,0,0);
        int tekrarSayısı=10;
        Picture a=new Picture(foto);
        Color renk2;
        for(int i=0; i<a.width();i++ )
            for(int j=0; j<a.height();j++ ){
                Color renk =a.get(i, j);
                int b =renk.getBlue();
                int g=renk.getGreen();
                int r=renk.getRed();
                if(r>=200 && g>=200 && b>=200)
                    renk2=new Color(255,255,255);
                    else
                        renk2=a.get(i, j);
                    a.set(i, j, renk2);
                };
            Color renk3;
            for(int i=0; i<a.width();i++ )
                for(int j=0; j<a.height();j++ ){
                    Color renk =a.get(i, j);
                    int b =renk.getBlue();
                    int g=renk.getGreen();
                    int r=renk.getRed();
                    if(r<=55 && g<=55 && b<=55)
                        renk3=new Color(0,0,0);
                    else
                        renk3=a.get(i, j);
                    a.set(i, j, renk3);
                }
            a.show();

        }
}

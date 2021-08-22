package Action;
import Picture.Picture;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Action {
    public static int log2(int N)
        {
            int result = (int)(Math.log(N) / Math.log(2));
            return result;
        }

    public static ArrayList<String> CalculateFractalDimension(int tekrarSayısı, Picture foto){
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
                System.out.println("E="+ "1/"+f +" iken N(E)="+y[log2(f)-1]+" olur.");
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
        System.out.println("Şeklin fraktal boyutu yaklaşık olarak "+dim+ " dir.");
            return arr;

    }

    public static void GridMaker(Picture foto,int tekrarSayısı){

        Color renk1=new Color(0,0,0);

       for(int m=1;m<=tekrarSayısı;m+=1){
        for(int n=1;n<tekrarSayısı;n+=1)
            for(int i=0; i<foto.height();i+=1)
                for(int j=0; j<foto.width(); j+=1) {
                    if(i==(int)((n*foto.width())/(Math.pow(2,m))) || j==(int)((n*foto.height())/((Math.pow(2,m)))) )
                        renk1=new Color(0,0,0);
                    else
                        renk1=foto.get( j, i);
                    foto.set(j, i, renk1);
                }
               File file = new File("C:\\Users\\Sinem Dönmez\\OneDrive\\Belgeler\\GitHub\\FractalDimensionWithBoxCountingMethod-\\src\\sample\\a"+(m)+".png");
                    foto.save(file);
                }

    }




 public static Picture BlackWhite(Picture foto){

        Color renk1=new Color(0,0,0);


        Color renk2;
        for(int i=0; i<foto.width();i++ )
            for(int j=0; j<foto.height();j++ ){
                Color renk =foto.get(i, j);
                int b =renk.getBlue();
                int g=renk.getGreen();
                int r=renk.getRed();
                if(r>=200 && g>=200 && b>=200)
                    renk2=new Color(255,255,255);
                    else
                        renk2=foto.get(i, j);
                    foto.set(i, j, renk2);

                };
            Color renk3;
            for(int i=0; i<foto.width();i++ )
                for(int j=0; j<foto.height();j++ ){
                    Color renk =foto.get(i, j);
                    int b =renk.getBlue();
                    int g=renk.getGreen();
                    int r=renk.getRed();
                    if(r<=55 && g<=55 && b<=55)
                        renk3=new Color(0,0,0);
                    else
                        renk3=foto.get(i, j);
                    foto.set(i, j, renk3);
                }
                foto.save("a");
                return foto;

        }
}

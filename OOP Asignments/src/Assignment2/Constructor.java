package Assignment2;
public class Constructor {
    int height,width,length,volume;
     Constructor(int h,int w,int l)
    {
        height=h;
        width=w;
        length=l;
        volume=h*w*l;
    }
     void Volume()
     {
         System.out.println("The volume of the cube is="+volume);
     }
}

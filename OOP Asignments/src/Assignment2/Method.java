package Assignment2;
public class Method {
    int height,width,length,volume;
    void cube(int h,int w,int l)
    {
        height=h;
        width=w;
        length=l;
        volume=h*w*l;
    }
    void Volume()
    {
        System.out.println("The volume is="+volume);
    }
}

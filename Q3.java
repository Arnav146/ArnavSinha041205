    class Q3
{
    void init()
    {
        for(int i=1;i<=20;i++)
        {
        int ans=(int)(Math.random()*100);
        System.out.println(ans);
    }
}
public static void main()
    {
        Q3 obj=new Q3();
        obj.init();
    }
}

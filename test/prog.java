public class prog implements Runnable
{
    // Instance vars generated from List<ParamDec>
    public int gint0;
    public boolean gbul0;
    public int gint1;
    public boolean gbul1;
    public java.io.File f;
    public java.net.URL u;
    // Constructor
    public prog(String[] args) throws java.net.MalformedURLException
    {
        // TODO: Initialize with values from args
        this.gint0 = Integer.parseInt(args[0]);
        this.gbul0 = Boolean.parseBoolean(args[1]);
        this.gint1 = Integer.parseInt(args[2]);
        this.gbul1 = Boolean.parseBoolean(args[3]);
        this.f = new java.io.File(args[4]);
        this.u = new java.net.URL(args[5]);
    }

    public static void main(String[] args) throws java.net.MalformedURLException
    {
        (new prog(args)).run();
    }

    public void run()
    {
        // declaration list
        int lint0;
        int lint1;
//        boolean lbul0;
        // statement list
        lint0 = 300;
        gint0 = 30;
//        lbul0 = false;

        while( lint0 > gint0 )
        {
            lint0 = lint0 - gint0;
//            System.out.println(lint0);
        }
    }
}

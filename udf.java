public abstract class udf {
    public static final udf a;
    public static final udf b;
    public static final udf c;
    public static final udf d;
    public static final udf e;

    static {
        udf.a = new uda();
        udf.b = new udb();
        udf.c = new udc();
        udf.d = new udd();
        udf.e = new ude();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(uag arg1);

    public abstract boolean d(boolean arg1, uag arg2, int arg3);
}


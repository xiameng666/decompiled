import java.io.IOException;

public final class swe {
    public final sxd a;
    public final sxd b;
    public final int c;

    public swe(sxd sxd0, sxd sxd1, int v) {
        this.a = sxd0;
        this.b = sxd1;
        this.c = v;
    }

    public static sxd a(byte[] arr_b) {
        if(arr_b.length != 0) {
            try(ssv ssv0 = new ssv(arr_b)) {
                ssw ssw0 = ssv0.a();
                return (ssw0 instanceof ssr) ? new sxd(((ssr)ssw0)) : sxd.a;
            }
            catch(IOException unused_ex) {
            }
        }
        return sxd.a;
    }

    public static final byte[] b(sxd sxd0) {
        return sxd0.d() ? ((ssr)sxd0.b()).e() : swv.b;
    }
}


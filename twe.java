import java.util.Iterator;

public class twe extends twf {
    public static final byte[] a;

    static {
        twe.a = twz.e("325041592E5359532E4444463031");
    }

    @Override  // twf
    public final sxm a(sxm sxm0) {
        return new sxm(sxm0.f());
    }

    @Override  // twf
    public sxn b(ttv ttv0, sxm sxm0) {
        throw null;
    }

    public tuw c(tto tto0) {
        throw null;
    }

    public static boolean d(byte[] arr_b) {
        return twe.e(arr_b, twe.a);
    }

    protected static boolean e(byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null) {
            return false;
        }
        if(arr_b1.length <= arr_b.length) {
            for(int v = 0; v < arr_b1.length; ++v) {
                if(arr_b[v] != arr_b1[v]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    protected static final tum f(ttv ttv0) {
        tum tum0 = new tum(((tvf)ttv0.d.b().f(tvf.a)).d);
        if(tum0.r() != null) {
            return tum0;
        }
        throw new sxp("Missing aid", sxr.a);
    }

    public static final byte[] g(ttv ttv0, tuw tuw0) {
        byte[] arr_b3;
        ttv0.d.b();
        syd syd0 = new syd(new syf(sxq.a));
        syd syd1 = syb.b(tum.a, twe.a);
        syd syd2 = new syd(new syf(tup.a));
        syd syd3 = new syd(new syf(tuo.a));
        syd syd4 = new syd(new syf(tun.a));
        byte[] arr_b = twe.f(ttv0).r();
        syd4.g(syb.b(sxq.c, arr_b));
        syd syd5 = twe.h(tuw0.n());
        byte[] arr_b1 = tud.a;
        Iterator iterator0 = syd5.f(new syf(arr_b1));
        byte[] arr_b2 = null;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arr_b3 = ((syd)object0).d();
        }
        else {
            arr_b3 = null;
        }
        if(arr_b3 != null) {
            syd4.g(syb.b(arr_b1, arr_b3));
        }
        syd syd6 = twe.h(tuw0.n());
        byte[] arr_b4 = tuu.a;
        Iterator iterator1 = syd6.f(new syf(arr_b4));
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            arr_b2 = ((syd)object1).d();
        }
        if(arr_b2 != null) {
            syd4.g(syb.b(arr_b4, arr_b2));
        }
        syd3.g(syd4);
        syd2.g(syd3);
        syd0.g(syd1);
        syd0.g(syd2);
        byte[] arr_b5 = syd0.c();
        twz.b(arr_b5);
        return arr_b5;
    }

    private static syd h(byte[] arr_b) {
        twz.c(arr_b, false);
        syd syd0 = syb.a(arr_b);
        try {
            while(!syd0.a.a()) {
                byte[] arr_b1 = syd0.c();
                int v = arr_b.length - arr_b1.length;
                byte[] arr_b2 = new byte[v];
                System.arraycopy(arr_b, arr_b1.length, arr_b2, 0, v);
                syd0 = syb.a(arr_b2);
            }
            return syd0;
        }
        catch(Exception unused_ex) {
            throw new sxp("FCI Template is not correct.", sxr.a);
        }
    }
}


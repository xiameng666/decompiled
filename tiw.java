import java.util.Iterator;

public class tiw extends tix {
    public static final byte[] a;
    public static final String b;

    static {
        tiw.a = tjs.d("325041592E5359532E4444463031");
        tiw.b = "tiw";
    }

    @Override  // tix
    public final ten a(ten ten0) {
        return new ten(ten0.g());
    }

    @Override  // tix
    public teo b(tgn tgn0, ten ten0) {
        throw null;
    }

    public thp c(tgg tgg0) {
        throw null;
    }

    public static boolean d(byte[] arr_b) {
        return tiw.e(arr_b, tiw.a);
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

    protected static final the f(tgn tgn0) {
        the the0 = new the(((thy)tgn0.b.a().d(thy.a)).d);
        if(the0.k() == null) {
            throw new teq("Missing aid", tes.a);
        }
        tjk.f("Application Dedicated File {}", new Object[]{the0});
        return the0;
    }

    public static final byte[] g(tgn tgn0, thp thp0) {
        byte[] arr_b3;
        tgn0.b.a();
        tjk.f("Constructing PPSE response data", new Object[0]);
        tfe tfe0 = new tfe(new tfg(ter.a));
        tfe tfe1 = tfc.a(the.a, tiw.a);
        tfe tfe2 = new tfe(new tfg(thh.a));
        tfe tfe3 = new tfe(new tfg(thg.a));
        tfe tfe4 = new tfe(new tfg(thf.a));
        byte[] arr_b = tiw.f(tgn0).k();
        tfe4.g(tfc.a(ter.c, arr_b));
        tfe tfe5 = tiw.h(thp0.e());
        byte[] arr_b1 = tgv.a;
        Iterator iterator0 = tfe5.f(new tfg(arr_b1));
        byte[] arr_b2 = null;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arr_b3 = ((tfe)object0).d();
            tjk.f("Application label {}", new Object[]{new String(arr_b3)});
        }
        else {
            arr_b3 = null;
        }
        if(arr_b3 != null) {
            tfe4.g(tfc.a(arr_b1, arr_b3));
        }
        tfe tfe6 = tiw.h(thp0.e());
        byte[] arr_b4 = thm.a;
        Iterator iterator1 = tfe6.f(new tfg(arr_b4));
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            arr_b2 = ((tfe)object1).d();
            tjk.f("Application Priority {}", new Object[]{arr_b2});
        }
        if(arr_b2 != null) {
            tfe4.g(tfc.a(arr_b4, arr_b2));
        }
        tfe3.g(tfe4);
        tfe2.g(tfe3);
        tfe0.g(tfe1);
        tfe0.g(tfe2);
        byte[] arr_b5 = tfe0.c();
        tjk.f("Constructed PPSE response data : {}", new Object[]{tjs.b(arr_b5)});
        return arr_b5;
    }

    private static tfe h(byte[] arr_b) {
        tjk.f("FciTemplate data: {}", new Object[]{tjs.c(arr_b, false)});
        tfe tfe0 = tfc.b(arr_b);
        try {
            while(!tfe0.a.a()) {
                byte[] arr_b1 = tfe0.c();
                int v = arr_b.length - arr_b1.length;
                byte[] arr_b2 = new byte[v];
                System.arraycopy(arr_b, arr_b1.length, arr_b2, 0, v);
                tfe0 = tfc.b(arr_b2);
            }
            return tfe0;
        }
        catch(Exception exception0) {
            tjk.f("Error FciTemplate {}", new Object[]{exception0.getMessage()});
            throw new teq("FCI Template is not correct.", tes.a);
        }
    }
}


public class tdr extends tds {
    public static final byte[] a;

    static {
        tdr.a = tek.d("325041592E5359532E4444463031");
    }

    protected tdr(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tds
    public final syi a(syi syi0) {
        return new syi(syi0.f());
    }

    @Override  // tds
    public syj b(tax tax0, syi syi0) {
        throw null;
    }

    protected final sym c(tax tax0, tca tca0) {
        tca0.d();
        szg szg0 = new szg(new szi(sym.b));
        szg0.g(this.e(tax0).g());
        szg0.g(sze.c(tca0.e()).b(new szi(sym.c)));
        return new sym(szg0.d(), syn.i);
    }

    public final sym d(tax tax0, tca tca0) {
        tax0.c.b();
        return new sym(this.h(tax0, tca0), syn.i);
    }

    protected tbp e(tax tax0) {
        throw null;
    }

    public tca f(tao tao0) {
        throw null;
    }

    protected static boolean g(byte[] arr_b, byte[] arr_b1) {
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

    protected byte[] h(tax tax0, tca tca0) {
        throw null;
    }
}


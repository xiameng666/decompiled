import java.util.ArrayList;

public final class bmac extends blzt {
    static final hhrn a;
    static final hhrn b;
    static final hhrn c;
    static final hhrn d;
    static final hhrn e;
    static final hhrn f;
    static final hhrn g;
    static final hhrn h;
    public static final ggfp i;
    public final int j;
    public final bmab k;
    private final bmbv l;
    private final byte[] m;
    private final byte[] n;
    private final byte[] o;
    private final Integer p;
    private final String q;

    static {
        bmac.a = new hhrn(1L);
        bmac.b = new hhrn(2L);
        bmac.c = new hhrn(3L);
        bmac.d = new hhrn(4L);
        bmac.e = new hhrn(5L);
        bmac.f = new hhrn(6L);
        bmac.g = new hhrn(9L);
        bmac.h = new hhrn(10L);
        bmac.i = ggfp.K(Integer.valueOf(1), Integer.valueOf(2));
    }

    public bmac(int v, bmab bmab0, bmbv bmbv0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, Integer integer0, String s) {
        this.j = v;
        this.k = bmab0;
        this.l = bmbv0;
        this.m = arr_b;
        this.n = arr_b1;
        this.o = arr_b2;
        this.p = integer0;
        this.q = s;
    }

    @Override  // blzt
    public final blzs a() {
        return blzs.e;
    }

    @Override  // blzt
    public final hhrp d() {
        batl.s(this.k);
        ArrayList arrayList0 = new ArrayList();
        try {
            hhrn hhrn0 = new hhrn(((long)this.j));
            arrayList0.add(new hhro(bmac.a, hhrn0));
            hhrn hhrn1 = new hhrn(((long)this.k.i));
            arrayList0.add(new hhro(bmac.b, hhrn1));
            bmbv bmbv0 = this.l;
            if(bmbv0 != null) {
                hhrp hhrp0 = bmbv0.c();
                arrayList0.add(new hhro(bmac.c, hhrp0));
            }
            byte[] arr_b = this.m;
            if(arr_b != null) {
                hhrk hhrk0 = hhrs.k(arr_b);
                arrayList0.add(new hhro(bmac.d, hhrk0));
            }
            byte[] arr_b1 = this.n;
            if(arr_b1 != null) {
                hhrk hhrk1 = hhrs.k(arr_b1);
                arrayList0.add(new hhro(bmac.e, hhrk1));
            }
            byte[] arr_b2 = this.o;
            if(arr_b2 != null) {
                hhrk hhrk2 = hhrs.k(arr_b2);
                arrayList0.add(new hhro(bmac.f, hhrk2));
            }
            Integer integer0 = this.p;
            if(integer0 != null) {
                arrayList0.add(new hhro(bmac.g, new hhrn(((long)(((int)integer0))))));
            }
            String s = this.q;
            if(s != null) {
                hhrq hhrq0 = new hhrq(s);
                arrayList0.add(new hhro(bmac.h, hhrq0));
            }
            return hhrs.n(arrayList0);
        }
        catch(hhrh hhrh0) {
            throw new RuntimeException(hhrh0);
        }
    }
}


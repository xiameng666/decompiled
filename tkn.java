import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class tkn extends tam {
    public int c;
    private static final Set d;

    static {
        tkn.d = new HashSet(Arrays.asList(new Integer[]{((int)1), ((int)2), ((int)3), ((int)4), ((int)5), ((int)6), ((int)7), ((int)8), ((int)9), ((int)10)}));
    }

    public tkn(Map map0) {
        super(map0);
        this.c = 0x7F;
    }

    @Override  // tam
    public final tbt c() {
        tkv tkv0 = this.k();
        byte[] arr_b = this.s(tbt.c, tkv0);
        return arr_b == null ? null : new tbt(arr_b);
    }

    public final tbj i() {
        tkv tkv0 = this.k();
        byte[] arr_b = this.s(tbj.c, tkv0);
        tbj tbj0 = arr_b == null ? new tbj(new byte[0]) : new tbj(arr_b);
        tbj0.i();
        return tbj0;
    }

    public final tbu j() {
        tcj tcj0 = tcy.a;
        if(this.f(tcj0)) {
            tbu tbu0 = new tbu(((tcy)this.d(tcj0)).b(tbu.c));
            tbu0.i();
            return tbu0;
        }
        tcj tcj1 = tmw.a;
        if(this.f(tcj1)) {
            tbu tbu1 = new tbu(((tmw)this.d(tcj1)).b(tbu.c));
            tbu1.i();
            return tbu1;
        }
        return null;
    }

    public final tkv k() {
        tlj tlj0 = this.r(this.c);
        return new tkv(tlj0.a(27, Integer.parseInt(tek.b(tlj0.a(26, 1)), 16)));
    }

    public final tlg l(tax tax0) {
        return new tlg(this.n(tax0).a(59, 1));
    }

    public final tlh m() {
        tma tma0 = (tma)this.d(tma.a);
        szi szi0 = new szi(tlh.d);
        return tma0.g(szi0) ? new tlh(tma0.h(szi0)) : new tlh();
    }

    public final tlj n(tax tax0) {
        return this.r(((tkq)tax0).n);
    }

    public final boolean o() {
        return this.f(tcy.a) ? ((tcy)this.d(tcy.a)).a(tbu.c) : false;
    }

    public final byte[] p(tax tax0) {
        return this.n(tax0).a(6, 6);
    }

    public final byte[] q(tax tax0) {
        return this.n(tax0).a(18, 6);
    }

    private final tlj r(int v) {
        tcj tcj0 = new tcj(0x3F, ((byte)v));
        try {
            return (tlj)this.d(tcj0);
        }
        catch(IllegalArgumentException unused_ex) {
            throw new syl(syn.c);
        }
    }

    private final byte[] s(byte[] arr_b, tbb tbb0) {
        Set set0 = tkn.d;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(tbb0.f());
        while(byteArrayInputStream0.available() > 0) {
            byte[] arr_b1 = new byte[4];
            byteArrayInputStream0.read(arr_b1, 0, 4);
            tbf tbf0 = new tbf(arr_b1);
            tbb0.d.add(tbf0);
        }
        Iterator iterator0 = tbb0.d.iterator();
        LinkedList linkedList0 = new LinkedList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            tbf tbf1 = (tbf)object0;
            int v = tbf1.b;
            int v1 = tbf1.c;
            while(v <= v1) {
                linkedList0.add(new syi(((byte)v), ((byte)(tbf1.a << 3 | 4))));
                ++v;
            }
        }
        for(Object object1: DesugarCollections.unmodifiableList(linkedList0)) {
            syi syi0 = (syi)object1;
            if(set0 == null || set0.contains(Integer.valueOf(syi0.h()))) {
                tcj tcj0 = new tcj(syi0.h(), syi0.b());
                Map map0 = this.a;
                if(map0.containsKey(tcj0) && (map0.get(tcj0) instanceof tcm)) {
                    tcm tcm0 = (tcm)map0.get(tcj0);
                    if(tcm0.a(arr_b)) {
                        return tcm0.b(arr_b);
                    }
                }
            }
        }
        return null;
    }
}


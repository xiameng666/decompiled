import android.graphics.Rect;
import android.util.Size;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

final class bui implements bem {
    final Set a;
    final Map b;
    public final Map c;
    final Map d;
    public final bng e;
    public final bin f;
    public final bin g;
    public final bhl h;
    public final Set i;
    public final Map j;
    public final bty k;

    public bui(bin bin0, Set set0, bng bng0, buc buc0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.h = new buh(this);
        this.f = bin0;
        this.g = null;
        this.e = bng0;
        this.a = set0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: set0) {
            bnc bnc0 = ((ben)object0).d(true, bng0);
            hashMap0.put(((ben)object0), ((ben)object0).E(((bhj)bin0).a, null, bnc0));
        }
        this.j = hashMap0;
        HashSet hashSet0 = new HashSet(hashMap0.values());
        this.i = hashSet0;
        this.k = new bty(bin0, hashSet0);
        for(Object object1: set0) {
            this.d.put(((ben)object1), Boolean.valueOf(false));
            bug bug0 = new bug(bin0, this, buc0);
            this.c.put(((ben)object1), bug0);
        }
    }

    static bka a(ben ben0) {
        List list0 = (ben0 instanceof bce) ? ben0.m.g() : ben0.m.g.e();
        kay.c(list0.size() <= 1);
        return list0.size() == 1 ? ((bka)list0.get(0)) : null;
    }

    public final bss b(ben ben0) {
        return (bss)Objects.requireNonNull(((bss)this.b.get(ben0)));
    }

    public final btr c(ben ben0, bty bty0, bin bin0, bss bss0, int v, boolean z) {
        int v6;
        int v1 = bin0.b().c(v);
        float[] arr_f = {0.0f, 1.0f, 1.0f, 0.0f};
        bss0.b.mapVectors(arr_f);
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        double f4 = Math.sqrt(f * f + f1 * f1) * Math.sqrt(f2 * f2 + f3 * f3);
        float f5 = (float)Math.toDegrees(Math.atan2(((double)(f * f3 - f1 * f2)) / f4, ((double)(f * f2 + f1 * f3)) / f4));
        bnc bnc0 = (bnc)Objects.requireNonNull(((bnc)this.j.get(ben0)));
        int v2 = bok.a(bss0.b);
        btw btw0 = bty0.d(bnc0, bss0.d, v2, z);
        Rect rect0 = btw0.a;
        Size size0 = btw0.b;
        int v3 = ((bko)ben0.i).P();
        int v4 = ((bhj)this.f).a.c(v3);
        ((bug)Objects.requireNonNull(((bug)this.c.get(ben0)))).a.a = v4;
        int v5 = bss0.i + v4 - v1;
        if((ben0 instanceof bdf)) {
            v6 = 1;
        }
        else {
            v6 = (ben0 instanceof bce) ? 4 : 2;
        }
        int v7 = bok.b(v5);
        Size size1 = bok.l(size0, v7);
        int v8 = ben0.S(bin0) ^ (f5 > 0.0f ? 1 : 0);
        UUID uUID0 = UUID.randomUUID();
        return (ben0 instanceof bce) ? new btr(uUID0, v6, 0x100, rect0, size1, v7, ((boolean)v8)) : new btr(uUID0, v6, 34, rect0, size1, v7, ((boolean)v8));
    }

    final Map d(bss bss0, boolean z) {
        Map map0 = new HashMap();
        for(Object object0: this.a) {
            bnc bnc0 = (bnc)Objects.requireNonNull(((bnc)this.j.get(((ben)object0))));
            int v = bok.a(bss0.b);
            Size size0 = this.k.d(bnc0, bss0.d, v, z).c;
            map0.put(((ben)object0), size0);
            java.util.Objects.toString(size0);
            java.util.Objects.toString(((ben)object0));
            bcs.h("VirtualCameraAdapter");
        }
        return map0;
    }

    public static void e(bss bss0, bka bka0, bmb bmb0) {
        bss0.i();
        try {
            boj.b();
            bss0.f();
            bsr bsr0 = bss0.j;
            Objects.requireNonNull(bsr0);
            bsr0.i(bka0, new bsj(bsr0));
        }
        catch(bjy unused_ex) {
            blv blv0 = bmb0.f;
            if(blv0 != null) {
                blv0.a(bmb0);
            }
        }
    }

    final void f(Map map0, Map map1) {
        this.b.clear();
        this.b.putAll(map0);
        for(Object object0: this.b.entrySet()) {
            ben ben0 = (ben)((Map.Entry)object0).getKey();
            bss bss0 = (bss)((Map.Entry)object0).getValue();
            ben0.k(bss0.d);
            ben0.j(bss0.b);
            bmh bmh0 = new bmh(bss0.g);
            Size size0 = (Size)map1.get(ben0);
            if(size0 != null) {
                bmh0.c(size0);
            }
            ben0.Q(bmh0.a(), null);
            ben0.L();
        }
    }

    public final boolean g(ben ben0) {
        return ((Boolean)Objects.requireNonNull(((Boolean)this.d.get(ben0)))).booleanValue();
    }

    @Override  // bem
    public final void s(ben ben0) {
        boj.b();
        if(!this.g(ben0)) {
            this.d.put(ben0, Boolean.valueOf(true));
            bka bka0 = bui.a(ben0);
            if(bka0 != null) {
                bui.e(this.b(ben0), bka0, ben0.m);
            }
        }
    }

    @Override  // bem
    public final void t(ben ben0) {
        boj.b();
        if(!this.g(ben0)) {
            return;
        }
        this.d.put(ben0, Boolean.valueOf(false));
        this.b(ben0).h();
    }

    @Override  // bem
    public final void u(ben ben0) {
        boj.b();
        bss bss0 = this.b(ben0);
        if(this.g(ben0)) {
            bka bka0 = bui.a(ben0);
            if(bka0 != null) {
                bui.e(bss0, bka0, ben0.m);
            }
        }
    }

    @Override  // bem
    public final void v(ben ben0) {
        throw null;
    }
}


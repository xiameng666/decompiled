import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class bud extends ben {
    public final bui a;
    public btd b;
    blt c;
    private final buf d;
    private final bas e;
    private final bas f;
    private bth o;
    private bss p;
    private bss q;
    private bss r;
    private bss s;
    private blu t;

    public bud(bin bin0, bas bas0, bas bas1, Set set0, bng bng0) {
        super(bud.s(set0));
        this.d = bud.s(set0);
        this.e = bas0;
        this.f = bas1;
        this.a = new bui(bin0, set0, bng0, new buc(this));
        this.q(set0);
    }

    @Override  // ben
    public final void M() {
        for(Object object0: this.a.a) {
            ((ben)object0).M();
        }
    }

    private final blt U(bss bss0, bnc bnc0, bmi bmi0) {
        Size size0 = bmi0.b;
        blt blt0 = blt.b(bnc0, size0);
        int v = -1;
        for(Object object0: this.i()) {
            v = bmb.a(v, ((ben)object0).i.i().b());
        }
        if(v != -1) {
            blt0.q(v);
        }
        for(Object object1: this.i()) {
            bmb bmb0 = blt.b(((ben)object1).i, size0).a();
            blt0.d(bmb0.f());
            for(Object object2: bmb0.e) {
                bhl bhl0 = (bhl)object2;
                blt0.b.d(bhl0);
                List list0 = blt0.e;
                if(!list0.contains(bhl0)) {
                    list0.add(bhl0);
                }
            }
            blt0.e(bmb0.d);
            blt0.c(bmb0.c);
            blt0.h(bmb0.d());
        }
        boj.b();
        bss0.f();
        bss0.e();
        blt0.m(bss0.j, bmi0.d, -1);
        blt0.j(this.a.h);
        bjt bjt0 = bmi0.g;
        if(bjt0 != null) {
            blt0.h(bjt0);
        }
        blt0.h = bmi0.e;
        this.T(blt0, bmi0);
        return blt0;
    }

    private final void V(blt blt0, String s, String s1, bnc bnc0, bmi bmi0, bmi bmi1) {
        blu blu0 = this.t;
        if(blu0 != null) {
            blu0.b();
        }
        blu blu1 = new blu(new bub(this, s, s1, bnc0, bmi0, null));
        this.t = blu1;
        blt0.f = blu1;
    }

    @Override  // ben
    public final Set Z() {
        Set set0 = new HashSet();
        set0.add(Integer.valueOf(3));
        return set0;
    }

    public final List a(String s, String s1, bnc bnc0, bmi bmi0, bmi bmi1) {
        bss bss1;
        boj.b();
        this.t(s, s1, bnc0, bmi0, null);
        this.b = new btd(((bin)Objects.requireNonNull(this.C())), ((bsw)brz.a.a(bmi0.d)));
        Rect rect0 = this.k;
        bss bss0 = this.r;
        int v = this.z();
        HashMap hashMap0 = new HashMap();
        bui bui0 = this.a;
        for(Object object0: bui0.a) {
            hashMap0.put(((ben)object0), bui0.c(((ben)object0), bui0.k, bui0.f, bss0, v, rect0 != null));
        }
        btd btd0 = this.b;
        btb btb0 = new btb(this.r, new ArrayList(hashMap0.values()));
        boj.b();
        btd0.c = new btc();
        for(Iterator iterator1 = btb0.b.iterator(); true; iterator1 = iterator1) {
            bss1 = btb0.a;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            btc btc0 = btd0.c;
            Matrix matrix0 = new Matrix(bss1.b);
            matrix0.postConcat(bok.e(new RectF(((btr)object1).c), bok.h(((btr)object1).d), ((btr)object1).e, ((btr)object1).f));
            kay.a(bok.o(bok.i(((btr)object1).c, ((btr)object1).e), ((btr)object1).d));
            Rect rect1 = bok.g(((btr)object1).d);
            bmh bmh0 = new bmh(bss1.g);
            bmh0.d(((btr)object1).d);
            bmi bmi2 = bmh0.a();
            btc0.put(((btr)object1), new bss(((btr)object1).a, ((btr)object1).b, bmi2, matrix0, false, rect1, bss1.i - ((btr)object1).e, -1, bss1.e != ((btr)object1).f));
        }
        try {
            bsw bsw0 = btd0.a;
            bel bel0 = bss1.a(btd0.b);
            if(((bsb)bsw0).e.get()) {
                bel0.f();
            }
            else {
                brk brk0 = new brk(((bsb)bsw0), bel0);
                Objects.requireNonNull(bel0);
                ((bsb)bsw0).c(brk0, new brl(bel0));
            }
        }
        catch(bdg bdg0) {
            bcs.b("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", bdg0);
        }
        for(Object object2: btd0.c.entrySet()) {
            btd0.a(bss1, ((Map.Entry)object2));
            ((bss)((Map.Entry)object2).getValue()).d(new bsx(btd0, bss1, ((Map.Entry)object2)));
        }
        bsy bsy0 = new bsy(btd0.c);
        bss1.l.add(bsy0);
        btc btc1 = btd0.c;
        HashMap hashMap1 = new HashMap();
        for(Object object3: hashMap0.entrySet()) {
            hashMap1.put(((ben)((Map.Entry)object3).getKey()), ((bss)btc1.get(((Map.Entry)object3).getValue())));
        }
        bui0.f(hashMap1, bui0.d(this.r, rect0 != null));
        return btz.a(this.c.a());
    }

    @Override  // ben
    public final void aa() {
        bui bui0 = this.a;
        for(Object object0: bui0.a) {
            ((ben)object0).H(((bin)Objects.requireNonNull(((bug)bui0.c.get(((ben)object0))))), null, null, ((ben)object0).d(true, bui0.e));
        }
    }

    @Override  // ben
    public final void ab() {
        for(Object object0: this.a.a) {
            ((ben)object0).ab();
        }
    }

    @Override  // ben
    public final bmi b(bjt bjt0) {
        this.c.h(bjt0);
        this.P(btz.a(this.c.a()));
        bmh bmh0 = new bmh(this.j);
        bmh0.b = bjt0;
        return bmh0.a();
    }

    @Override  // ben
    public final bnb c(bjt bjt0) {
        return new bue(blb.b(bjt0));
    }

    @Override  // ben
    public final bnc d(boolean z, bng bng0) {
        buf buf0 = this.d;
        bjt bjt0 = bng0.a(bmz.g(buf0), 1);
        if(z) {
            bjt0 = bjq.a(bjt0, buf0.b);
        }
        return bjt0 == null ? null : this.c(bjt0).d();
    }

    @Override  // ben
    protected final bnc e(bik bik0, bnb bnb0) {
        bui bui0 = this.a;
        bty bty0 = bui0.k;
        blb blb0 = bnb0.f();
        List list0 = bty0.d.l(34);
        Set set0 = bty0.c;
        for(Object object0: set0) {
            bnc bnc0 = (bnc)object0;
            if(!bnc0.A() && (bnc0 instanceof bko)) {
                ((bko)bnc0).M();
            }
        }
        Object object1 = null;
        List list1 = (List)blb0.m(bko.N, null);
        if(list1 != null) {
            for(Object object2: list1) {
                Pair pair0 = (Pair)object2;
                if(!((Integer)pair0.first).equals(Integer.valueOf(34))) {
                    continue;
                }
                list0 = Arrays.asList(((Size[])pair0.second));
                goto label_23;
            }
            list0 = new ArrayList();
        }
    label_23:
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object3: set0) {
            hashSet0.addAll(bty0.e(((bnc)object3)));
        }
        for(Object object4: hashSet0) {
            if(bni.a(((Size)object4), bty0.b)) {
                continue;
            }
            else {
                arrayList0.addAll(bty0.g(bty0.a, list0, false));
            }
            break;
        }
        arrayList0.addAll(bty0.g(bty0.b, list0, false));
        arrayList0.addAll(bty0.f(list0, false));
        if(arrayList0.isEmpty()) {
            bcs.d("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList0.addAll(bty0.f(list0, true));
        }
        bcs.h("ResolutionsMerger");
        blb0.c(bko.P, arrayList0);
        Set set1 = bui0.i;
        bjr bjr0 = bnc.s;
        int v = 0;
        for(Object object5: set1) {
            v = Math.max(v, ((bnc)object5).z());
        }
        blb0.c(bjr0, Integer.valueOf(v));
        ArrayList arrayList1 = new ArrayList();
        for(Object object6: set1) {
            arrayList1.add(((bnc)object6).e());
        }
        if(arrayList1.isEmpty()) {
        label_89:
            if(object1 != null) {
                blb0.c(bkm.F, object1);
                bjr bjr1 = bnc.u;
                Range range0 = bmi.a;
                Range range1 = range0;
                for(Object object7: set1) {
                    Range range2 = (Range)Objects.requireNonNull(((bnc)object7).d(range1));
                    if(range0.equals(range1)) {
                        range1 = range2;
                        continue;
                    }
                    else {
                        try {
                            range1 = range1.intersect(range2);
                            continue;
                        }
                        catch(IllegalArgumentException unused_ex) {
                            java.util.Objects.toString(range1);
                            java.util.Objects.toString(range2);
                            bcs.h("VirtualCameraAdapter");
                            range1 = range1.extend(range2);
                        }
                    }
                    break;
                }
                blb0.c(bjr1, range1);
                for(Object object8: bui0.a) {
                    bnc bnc1 = (bnc)Objects.requireNonNull(((bnc)bui0.j.get(((ben)object8))));
                    if(bnc1.c() != 0) {
                        Integer integer6 = bnc1.c();
                        blb0.c(bnc.A, integer6);
                    }
                    if(bnc1.b() != 0) {
                        Integer integer7 = bnc1.b();
                        blb0.c(bnc.z, integer7);
                    }
                }
                return bnb0.d();
            }
        }
        else {
            bat bat0 = (bat)arrayList1.get(0);
            Integer integer0 = (int)bat0.h;
            Integer integer1 = (int)bat0.i;
            int v1 = 1;
            while(true) {
                if(v1 < arrayList1.size()) {
                    bat bat1 = (bat)arrayList1.get(v1);
                    Integer integer2 = (int)bat1.h;
                    Integer integer3 = (int)0;
                    if(integer0.equals(integer3)) {
                        integer0 = integer2;
                    }
                    else if(!integer2.equals(integer3)) {
                        Integer integer4 = (int)2;
                        if(integer0.equals(integer4) && !integer2.equals(Integer.valueOf(1))) {
                            integer0 = integer2;
                        }
                        else if((!integer2.equals(integer4) || integer0.equals(Integer.valueOf(1))) && !integer0.equals(integer2)) {
                            integer0 = null;
                        }
                    }
                    Integer integer5 = (int)bat1.i;
                    if(integer1.equals(integer3)) {
                        integer1 = integer5;
                    }
                    else if(!integer5.equals(integer3) && !integer1.equals(integer5)) {
                        integer1 = null;
                    }
                    if(integer0 == null || integer1 == null) {
                        goto label_89;
                    }
                    ++v1;
                    continue;
                }
                object1 = new bat(((int)integer0), ((int)integer1));
                goto label_89;
            }
        }
        throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
    }

    public static List f(ben ben0) {
        List list0 = new ArrayList();
        if((ben0 instanceof bud)) {
            for(Object object0: ((bud)ben0).i()) {
                list0.add(((ben)object0).i.k());
            }
            return list0;
        }
        list0.add(ben0.i.k());
        return list0;
    }

    @Override  // ben
    public final void h() {
        this.p();
        bui bui0 = this.a;
        for(Object object0: bui0.a) {
            ((ben)object0).O(((bin)Objects.requireNonNull(((bug)bui0.c.get(((ben)object0))))));
        }
    }

    public final Set i() {
        return this.a.a;
    }

    @Override  // ben
    protected final void n(bmi bmi0, bmi bmi1) {
        java.util.Objects.toString(bmi0);
        bcs.h("StreamSharing");
        this.P(this.a(this.F(), null, this.i, bmi0, null));
        this.I();
    }

    @Override  // ben
    public final void o() {
        for(Object object0: this.a.a) {
            ((ben)object0).o();
        }
    }

    public final void p() {
        blu blu0 = this.t;
        if(blu0 != null) {
            blu0.b();
            this.t = null;
        }
        bss bss0 = this.p;
        if(bss0 != null) {
            bss0.g();
            this.p = null;
        }
        bss bss1 = this.q;
        if(bss1 != null) {
            bss1.g();
            this.q = null;
        }
        bss bss2 = this.r;
        if(bss2 != null) {
            bss2.g();
            this.r = null;
        }
        bss bss3 = this.s;
        if(bss3 != null) {
            bss3.g();
            this.s = null;
        }
        btd btd0 = this.b;
        if(btd0 != null) {
            btd0.a.d();
            boj.c(new bsz(btd0));
            this.b = null;
        }
        bth bth0 = this.o;
        if(bth0 != null) {
            bth0.a.d();
            boj.c(new btf(bth0));
            this.o = null;
        }
    }

    public final void q(Set set0) {
        Object object0 = set0.iterator().next();
        this.N(((ben)object0).h);
    }

    private final Rect r(Size size0) {
        Rect rect0 = this.k;
        return rect0 == null ? new Rect(0, 0, size0.getWidth(), size0.getHeight()) : rect0;
    }

    private static buf s(Set set0) {
        blb blb0 = new bue(blb.a()).a;
        blb0.c(bkm.l, Integer.valueOf(34));
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            ben ben0 = (ben)object0;
            if(ben0.i.s(bnc.y)) {
                arrayList0.add(ben0.i.k());
            }
            else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        blb0.c(buf.a, arrayList0);
        blb0.c(bko.J, Integer.valueOf(2));
        blb0.c(bnc.C, bmj.f);
        return new buf(blf.f(blb0));
    }

    private final void t(String s, String s1, bnc bnc0, bmi bmi0, bmi bmi1) {
        bss bss0 = new bss(3, 34, bmi0, this.l, ((bin)Objects.requireNonNull(this.C())).F(), ((Rect)Objects.requireNonNull(this.r(bmi0.b))), this.x(((bin)Objects.requireNonNull(this.C()))), -1, this.S(((bin)Objects.requireNonNull(this.C()))));
        this.p = bss0;
        bin bin0 = (bin)Objects.requireNonNull(this.C());
        this.r = bss0;
        blt blt0 = this.U(this.p, bnc0, bmi0);
        this.c = blt0;
        this.V(blt0, s, s1, bnc0, bmi0, null);
    }
}


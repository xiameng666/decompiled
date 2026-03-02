import android.os.Bundle;
import android.support.v4.app.Fragment.SavedState;
import java.util.ArrayList;
import java.util.List;

public final class aaon {
    public final aaln a;
    public final ArrayList b;
    public final lqi c;
    public final bbng d;
    public boolean e;
    public long f;
    public final lqi g;
    public final lqi h;
    public final lqi i;
    public final lqi j;
    public final lqd k;
    public final aaui l;
    private final lqi m;
    private final lrf n;

    public aaon(lps lps0, aaui aaui0, aaln aaln0, bbng bbng0, lrf lrf0, grxw grxw0, ibnf ibnf0) {
        this.m = new lqi(gfqx.a);
        this.e = false;
        this.f = -1L;
        this.g = new lqi(fhru.a);
        this.h = new lqi(fhru.a);
        this.i = new lqi(fhru.a);
        this.j = new lqi();
        this.l = aaui0;
        this.a = aaln0;
        this.d = bbng0;
        aany aany0 = (aany)ibnf0.get();
        byte[] arr_b = (byte[])lrf0.d("navStackHead");
        if(arr_b != null) {
            grxw0 = zhp.f(arr_b);
        }
        this.c = new lqi(new aaok(grxw0, null, false, aany0, null, aany0 != null));
        ArrayList arrayList0 = new ArrayList();
        List list0 = (List)lrf0.d("navStackTail");
        if(list0 != null) {
            arrayList0 = new ArrayList();
            for(Object object0: list0) {
                Bundle bundle0 = (Bundle)object0;
                Object object1 = null;
                if(bundle0.getByteArray("screenKey") != null) {
                    byte[] arr_b1 = bundle0.getByteArray("screenKey");
                    gftb.check(arr_b1);
                    grxw grxw1 = zhp.f(arr_b1);
                    grxw grxw2 = zhp.h(bundle0.getByteArray("topNavKey"));
                    Bundle bundle1 = (Bundle)bundle0.getParcelable("fragmentState");
                    if(bundle1 != null && bundle1.getString("className") != null) {
                        String s = bundle1.getString("className");
                        gftb.check(s);
                        object1 = new aanw(s, ((Fragment.SavedState)bundle1.getParcelable("savedState")), bundle1.getBoolean("headerCollapsed"));
                    }
                    Bundle bundle2 = (Bundle)bundle0.getParcelable("scrollPosition");
                    object1 = new aanz(grxw1, grxw2, ((aanw)object1), (bundle2 == null ? aape.a : new aape(bundle2.getInt("visible_item", 0), bundle2.getInt("visible_item_offset", 0))));
                }
                if(object1 != null) {
                    arrayList0.add(object1);
                }
            }
        }
        this.b = arrayList0;
        this.n = lrf0;
        aaoa aaoa0 = new aaoa(aaln0);
        lqd lqd0 = lsa.c(this.c, aaoa0);
        aaob aaob0 = new aaob(aaln0);
        lqd lqd1 = lsa.c(this.m, aaob0);
        aaoc aaoc0 = new aaoc(aaln0);
        lqd lqd2 = lsa.c(this.m, aaoc0);
        this.k = lqd2;
        lqd0.g(lps0, (kau kau0) -> {
            aaok aaok0 = (aaok)kau0.a;
            zho zho0 = (zho)kau0.b;
            grul grul0 = zho0.a();
            if((!this.l.a() && (grul0.b & 2) != 0 || !zho0.c()) && aadw.b(grul0)) {
                aatb aatb0 = this.a.d();
                this.g.l(new fhru(new aamp(grul0, aatb0, this.a.g, this.b.isEmpty(), true, aaok0.a, aaok0.a)));
            }
            aanx aanx0 = new aanx(zho0, aaok0.b, aaok0.c, aaok0.d, aaok0.e, aaok0.f);
            this.j.l(aanx0);
        });
        lqd2.g(lps0, new aaoe(this));
        lqd1.g(lps0, new aaof(this));
        aaog aaog0 = new aaog(this);
        fhrx.b(aaln0.h, lps0, aaog0);
    }

    public final aanx a() {
        aaok aaok0 = (aaok)this.c.ij();
        gftb.check(aaok0);
        this.f(new kau(aaok0, this.a.c(aaok0.a)));
        aanx aanx0 = (aanx)this.j.ij();
        gftb.check(aanx0);
        return aanx0;
    }

    public final grxw b() {
        aaok aaok0 = (aaok)this.c.ij();
        gftb.check(aaok0);
        return aaok0.a;
    }

    public final void c() {
        this.m.l(gfqx.a);
    }

    public final void d() {
        gged_interceptors gged0;
        aauf aauf0 = this.a.l;
        int v = this.b().c;
        aauf0.b();
        int v2 = 0;
        while(true) {
            gged0 = aauf0.a;
            if(v2 >= gged0.size()) {
                break;
            }
            int v3 = (int)(((Integer)gged0.get(v2)));
            ++v2;
            aauf0.c.add(new aaue(aauf0, v, v3, (v2 >= gged0.size() ? -1 : ((int)(((Integer)gged0.get(v2)))))));
        }
        for(int v1 = 0; true; ++v1) {
            List list0 = aauf0.c;
            if(v1 >= list0.size()) {
                break;
            }
            Runnable runnable0 = (Runnable)list0.get(v1);
            long v4 = (long)(((int)(((Integer)gged0.get(v1)))) * 1000);
            aauf0.b.postDelayed(runnable0, v4);
        }
    }

    public final void e() {
        this.e = true;
    }

    // Detected as a lambda impl.
    public final void f(kau kau0) {
        aaok aaok0 = (aaok)kau0.a;
        zho zho0 = (zho)kau0.b;
        grul grul0 = zho0.a();
        if((!this.l.a() && (grul0.b & 2) != 0 || !zho0.c()) && aadw.b(grul0)) {
            aatb aatb0 = this.a.d();
            this.g.l(new fhru(new aamp(grul0, aatb0, this.a.g, this.b.isEmpty(), true, aaok0.a, aaok0.a)));
        }
        aanx aanx0 = new aanx(zho0, aaok0.b, aaok0.c, aaok0.d, aaok0.e, aaok0.f);
        this.j.l(aanx0);
    }

    public final void g() {
        Bundle bundle1;
        byte[] arr_b = this.b().toBytesArray();
        lrf lrf0 = this.n;
        lrf0.e("navStackHead", arr_b);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b) {
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("screenKey", ((aanz)object0).a.toBytesArray());
            bundle0.putByteArray("topNavKey", zhp.m(((aanz)object0).b));
            aanw aanw0 = ((aanz)object0).c;
            if(aanw0 == null) {
                bundle1 = null;
            }
            else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("className", aanw0.a);
                bundle2.putParcelable("savedState", aanw0.b);
                bundle2.putBoolean("headerCollapsed", aanw0.c);
                bundle1 = bundle2;
            }
            bundle0.putParcelable("fragmentState", bundle1);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("visible_item", ((aanz)object0).d.b);
            bundle3.putInt("visible_item_offset", ((aanz)object0).d.c);
            bundle0.putParcelable("scrollPosition", bundle3);
            arrayList0.add(bundle0);
        }
        lrf0.e("navStackTail", arrayList0);
    }

    public final void h(int v) {
        grxw grxw3;
        int v1;
        this.c();
        grxw grxw0 = this.b();
        boolean z = true;
        if(v - 1 != 1 && v - 1 != 2) {
            v1 = this.l();
        }
        else {
            grxw grxw1 = this.b();
            grxw grxw2 = zhp.d(this.a.c(grxw1).a());
            if(grxw2 == null) {
                v1 = this.l();
            }
            else {
                v1 = -1;
                ArrayList arrayList0 = this.b;
                for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
                    if(!((ProtoLiteMessage)grxw2).equals(((aanz)arrayList0.get(v2)).b)) {
                        v1 = v2;
                        break;
                    }
                }
            }
        }
        if(v1 == -1) {
            grxw3 = null;
        }
        else {
            aanz aanz0 = (aanz)this.b.get(v1);
            this.b.subList(v1, this.b.size()).clear();
            lqi lqi0 = this.c;
            grxw grxw4 = aanz0.a;
            aanw aanw0 = aanz0.c;
            aape aape0 = aanz0.d;
            if(grxw4.c != this.b().c) {
                z = false;
            }
            lqi0.l(new aaok(grxw4, aanw0, true, null, aape0, z));
            this.g();
            this.d();
            grxw3 = grxw4;
        }
        if(grxw3 == null) {
            this.a.l.j(grxw0, zhp.c, 7);
            fhru fhru0 = new fhru(new aamq(this.a.d()));
            this.h.ii(fhru0);
            return;
        }
        this.a.l.j(grxw0, grxw3, 7);
        this.a.l.f(grxw0, grxw3);
        this.a.i(grxw3);
    }

    @Deprecated
    public final void i(grxw grxw0, int v) {
        grwp grwp0;
        aape aape0 = aape.a;
        if(grxw0 == null) {
            grwp0 = null;
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwp.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grwp)hftp0.b_message).c = grxw0;
            ((grwp)hftp0.b_message).b |= 1;
            grwp0 = (grwp)hftp0.N_build();
        }
        this.j(aape0, grwp0, v);
    }

    public final void j(aape aape0, grwp grwp0, int v) {
        int v1;
        grwp grwp1;
        lqi lqi0 = this.m;
        lqi0.l(gfqx.a);
        if(grwp0 != null && zhz.c(grwp0)) {
            if((grwp0.b & 1) == 0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwp.a).w(((ProtoLiteMessage)grwp0));
                grxw grxw0 = this.b();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grwp grwp2 = (grwp)hftp0.b_message;
                grxw0.getClass();
                grwp2.c = grxw0;
                grwp2.b |= 1;
                grwp1 = (grwp)hftp0.N_build();
            }
            else {
                grwp1 = grwp0;
            }
            aaln aaln0 = this.a;
            aauf aauf0 = aaln0.l;
            grxw grxw1 = this.b();
            grxw grxw2 = grwp1.c == null ? grxw.a : grwp1.c;
            switch(v - 1) {
                case 0: {
                    v1 = 6;
                    break;
                }
                case 1: {
                    v1 = 2;
                    break;
                }
                case 2: {
                    v1 = 10;
                    break;
                }
                case 3: {
                    v1 = 4;
                    break;
                }
                case 4: {
                    v1 = 8;
                    break;
                }
                case 5: {
                    v1 = 12;
                    break;
                }
                case 6: {
                    v1 = 15;
                    break;
                }
                case 7: {
                    v1 = 16;
                    break;
                }
                default: {
                    v1 = 18;
                }
            }
            aauf0.j(grxw1, grxw2, v1);
            if((grwp0.b & 1) != 0) {
                aaln0.i((grwp0.c == null ? grxw.a : grwp0.c));
            }
            lqi0.l(gfsx.m(new aaol(aape0, grwp1, v)));
        }
    }

    public final aanz k(grxw grxw0, aape aape0) {
        return new aanz(grxw0, zhp.d(this.a.c(grxw0).a()), null, aape0);
    }

    private final int l() {
        return this.b.size() - 1;
    }
}


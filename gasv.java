import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import j..util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public final class gasv extends gaxs implements gatd {
    public final gast a;
    public final gatc b;
    public hdul c;
    public String d;
    public String e;
    public final gbfv f;
    public gcqy g;
    public byi h;
    public byi i;
    public final ArrayList j;
    public final ArrayList k;
    bzs l;
    public boolean m;
    final gayo n;
    public boolean o;
    int p;
    public static final int q;
    private boolean r;

    public gasv(gbfv gbfv0, gayo gayo0, gast gast0, gatc gatc0) {
        this.j = new ArrayList();
        this.k = new ArrayList(1);
        this.m = false;
        this.r = false;
        this.o = false;
        this.p = -1;
        this.f = gbfv0;
        this.n = gayo0;
        this.a = gast0;
        this.b = gatc0;
    }

    public final int a(long v) {
        if(this.i == null) {
            this.i = new byi();
        }
        gcqy gcqy0 = (gcqy)this.i.e(v, gcqy.c());
        if(!this.i.j(v)) {
            this.i.h(v, gcqy0);
        }
        return gcqy0.a();
    }

    public final int b() {
        int v = this.p;
        this.p = v - 1;
        return v;
    }

    public final hdul f(String s) {
        hdul hdul0 = this.c;
        gavs.g(hdul0, s, this.a.a.g);
        return hdul0;
    }

    public final Pattern g(String s) {
        if(this.l == null) {
            this.l = new bzs();
        }
        Pattern pattern0 = (Pattern)this.l.get(s);
        if(pattern0 == null) {
            pattern0 = Pattern.compile(s);
            this.l.put(s, pattern0);
        }
        return pattern0;
    }

    public final void h() {
        String s = this.e;
        if(s != null) {
            kfe.l(this.b.a(), s);
            this.e = null;
        }
    }

    public final void i(hdul hdul0) {
        bzt bzt1;
        gast gast0 = this.a;
        gavs.c(1 == (hdul0.b & 1), "BE_PC_03", gast0.a.g, "Page.initial_node is required.");
        hdrl hdrl0 = hdul0.c == null ? hdrl.a : hdul0.c;
        hfuo hfuo0 = hdul0.d;
        gasy gasy0 = gast0.c;
        byi byi0 = gasy0.a;
        int v1 = byi0.b();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            gass gass0 = (gass)byi0.f(v1);
            int v2 = gass0.b.g;
            bzt bzt0 = gasy0.b;
            ArrayDeque arrayDeque0 = (ArrayDeque)bzu.a(bzt0, v2);
            if(arrayDeque0 == null) {
                arrayDeque0 = new ArrayDeque();
                bzt0.h(v2, arrayDeque0);
            }
            arrayDeque0.push(gass0);
        }
        byi0.g();
        ArrayList arrayList0 = new ArrayList(hfuo0.size() + 1);
        gass gass1 = gasy0.c(gast0, hdrl0);
        gasy0.g(hdrl0, gass1);
        arrayList0.add(gass1);
        for(Object object0: hfuo0) {
            gass gass2 = gasy0.c(gast0, ((hdrl)object0));
            gasy0.g(((hdrl)object0), gass2);
            arrayList0.add(gass2);
        }
        gatc gatc0 = gasy0.c;
        if(gatc0.e == null) {
            gatc0.e = gatc0.h();
        }
        gatc0.b();
        ArrayList arrayList1 = gatc0.c;
        arrayList1.ensureCapacity(arrayList0.size());
        for(Object object1: arrayList0) {
            ((gass)object1).an(gatc0);
            if(gatc0.a == null) {
                gatc0.a = new gata(gatc0);
            }
            gatc0.a.b(arrayList1.size(), ((gass)object1).e);
            gatb gatb0 = new gatb(gatc0, ((gass)object1));
            ((gass)object1).r = gatb0;
            arrayList1.add(gatb0);
        }
        long[] arr_v = gatc0.e;
        if(arr_v != null) {
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                long v4 = arr_v[v3];
                int v5 = arrayList1.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    gatb gatb1 = (gatb)arrayList1.get(v6);
                    if(gatb1.a() == v4 && gatb1.d()) {
                        gatc0.c(gatb1);
                        break;
                    }
                }
            }
            gatc0.e = null;
        }
        int v7 = arrayList1.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            gatb gatb2 = (gatb)arrayList1.get(v8);
            if(gatb2.d()) {
                gatc0.c(gatb2);
            }
        }
        for(int v9 = 0; true; ++v9) {
            bzt1 = gasy0.b;
            if(v9 >= bzt1.c()) {
                break;
            }
            ArrayDeque arrayDeque1 = (ArrayDeque)bzt1.e(v9);
            if(arrayDeque1 != null) {
                while(!arrayDeque1.isEmpty()) {
                    ((gass)arrayDeque1.pop()).F();
                }
            }
        }
        bzt1.g();
        int v10 = arrayList1.size();
        for(int v = 0; v < v10; ++v) {
            ((gatb)arrayList1.get(v)).f.ag();
        }
        gatc0.b.getViewTreeObserver().addOnGlobalLayoutListener(gatc0);
    }

    public final void j() {
        gatj gatj0 = this.a.a;
        gaym gaym0 = gatj0.g;
        gbaf gbaf0 = gatj0.m;
        if(gbaf0 == null) {
            gavv.b("BW_PC_01", gaym0, null, 12);
        }
        else {
            fbbm fbbm0 = fbbl.a(((ProtoLiteMessage)fbbj.a).v_newBuilder());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbi.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            gkzo gkzo0 = gkzn.a(((ProtoLiteMessage)gkyf.a).v_newBuilder());
            gkzo0.c();
            gkzo0.b(gatj0.f.b);
            gkyf gkyf0 = gkzo0.a();
            ibuq.f(gkyf0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fbbi fbbi0 = (fbbi)hftp0.b_message;
            gkyf0.getClass();
            fbbi0.c = gkyf0;
            fbbi0.b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((fbbi)hftv0), "value");
            ProtoLiteBuilder hftp1 = fbbm0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fbbj fbbj0 = (fbbj)hftp1.b_message;
            ((fbbi)hftv0).getClass();
            fbbj0.c = (fbbi)hftv0;
            fbbj0.b = 2;
            gazl gazl0 = new gazl(fbbm0.a(), new Bundle());
            Object object0 = gbaf0.c.a(gazl0);
            gaxl.a();
            gbaj gbaj0 = gaxm.y() ? gbaj.a : gbad.a;
            Throwable throwable0 = ibnw.a(object0);
            if(throwable0 != null) {
                try {
                    object0 = gbaj0.a(throwable0);
                }
                catch(Throwable throwable1) {
                    object0 = ibnx.a(throwable1);
                }
            }
            ibnx.b(object0);
        }
        this.a.a.f.b();
    }

    public final void k(byi byi0, Boolean boolean0) {
        hdul hdul0 = this.f("BE_PC_10");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvx.a).v_newBuilder();
        hdvc hdvc0 = (hdvc)((ProtoLiteMessage)hdvd.a).v_newBuilder();
        int v = byi0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            hdvc0.k(((hcos)byi0.f(v1)));
        }
        hdrl hdrl0 = hdul0.c == null ? hdrl.a : hdul0.c;
        if(!hdvc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hdvc0).ensureMutable();
        }
        hdvd hdvd0 = (hdvd)hdvc0.b_message;
        hdrl0.getClass();
        hdvd0.e = hdrl0;
        hdvd0.b |= 2;
        hdvc0.a(hdul0.d);
        hdvd hdvd1 = (hdvd)((ProtoLiteBuilder)hdvc0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvx wvx0 = (wvx)hftp0.b_message;
        hdvd1.getClass();
        wvx0.c = hdvd1;
        wvx0.b |= 1;
        boolean z = boolean0.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wvx)hftp0.b_message).d = z;
        this.a.a.g().y(((wvx)hftp0.N_build()));
    }

    @Override  // gaxs
    protected final void lv() {
        this.r = true;
        this.n.d();
        gaxl.a();
        if(hzlv.m()) {
            ArrayList arrayList0 = this.a.c.c.c;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gatb)arrayList0.get(v1)).f.W();
            }
        }
    }

    @Override  // gaxs
    protected final void lw() {
        if(this.r && !this.o) {
            ArrayList arrayList0 = this.k;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((gbvd)arrayList0.get(v2)).V(hddc.d, 4);
            }
        }
        gaxl.a();
        if(hzlv.m()) {
            ArrayList arrayList1 = this.a.c.c.c;
            int v3 = arrayList1.size();
            for(int v = 0; v < v3; ++v) {
                ((gatb)arrayList1.get(v)).f.Z();
            }
        }
    }

    @Override  // gaxs
    protected final void lx(Bundle bundle0) {
        Bundle bundle4;
        Bundle bundle1 = new Bundle();
        this.b.e = this.b.h();
        bundle1.putLongArray("activePresenterIds", this.b.e);
        bundle0.putBundle("rootPresenter", bundle1);
        if(this.g != null) {
            Bundle bundle2 = new Bundle();
            this.g.h(bundle2);
            bundle0.putBundle("idGenerator", bundle2);
        }
        byi byi0 = this.i;
        if(byi0 != null) {
            int v1 = byi0.b();
            long[] arr_v = new long[v1];
            Bundle[] arr_bundle = new Bundle[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                long v3 = byi0.c(v2);
                arr_v[v2] = v3;
                gcqy gcqy0 = (gcqy)byi0.d(v3);
                gavs.h(gcqy0, "BE_PC_01", this.a.a.g, new gayx(v3));
                Bundle bundle3 = new Bundle();
                gcqy0.h(bundle3);
                arr_bundle[v2] = bundle3;
            }
            bundle0.putLongArray("uiReferences", arr_v);
            bundle0.putParcelableArray("idGeneratorStates", arr_bundle);
        }
        byi byi1 = this.h;
        if(byi1 != null) {
            int v4 = byi1.b();
            long[] arr_v1 = new long[v4];
            int[] arr_v2 = new int[v4];
            for(int v = 0; v < v4; ++v) {
                arr_v1[v] = this.h.c(v);
                arr_v2[v] = (int)(((Integer)this.h.f(v)));
            }
            bundle0.putLongArray("uiReferenceMapKey", arr_v1);
            bundle0.putIntArray("uiReferenceMapValue", arr_v2);
        }
        String s = this.d;
        if(s != null) {
            bundle0.putString("pageTitle", s);
        }
        hdul hdul0 = this.c;
        if(hdul0 == null) {
            bundle4 = bundle0;
        }
        else {
            gaxl.a();
            long v5 = (long)gaxm.w();
            gaxl.a();
            boolean z = hrnt.i();
            bundle4 = bundle0;
            gcvs.f(this.a.a.e, bundle4, "page", ((MessageLite)hdul0), v5, false, z);
        }
        gbfv gbfv0 = this.f;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbnh.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((fbnh)hftp0.b_message).b);
        ibuq.e(list0, "getDataList(...)");
        new hfxu(list0);
        Collection collection0 = gbfv0.b.values();
        ibuq.f(collection0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbnh fbnh0 = (fbnh)hftp0.b_message;
        hfuo hfuo0 = fbnh0.b;
        if(!hfuo0.c()) {
            fbnh0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(collection0, fbnh0.b);
        List list1 = DesugarCollections.unmodifiableList(((fbnh)hftp0.b_message).c);
        ibuq.e(list1, "getLoadingDataList(...)");
        new hfxu(list1);
        Collection collection1 = gbfv0.c.values();
        ArrayList arrayList0 = new ArrayList(ibpo.q(collection1, 10));
        for(Object object0: collection1) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fbng.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            fbnf fbnf0 = ((gbgd)object0).b;
            ibuq.f(fbnf0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fbng fbng0 = (fbng)hftp1.b_message;
            fbng0.c = fbnf0.a();
            ByteString hfsf0 = ((gbgd)object0).a;
            ibuq.f(hfsf0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hfsf0.getClass();
            ((fbng)hftv0).d = hfsf0;
            hcnu hcnu0 = ((gbgd)object0).d;
            if(hcnu0 != null) {
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((fbng)hftp1.b_message).e = hcnu0;
                ((fbng)hftp1.b_message).b |= 1;
            }
            ProtoLiteMessage hftv1 = hftp1.N_build();
            ibuq.e(hftv1, "build(...)");
            arrayList0.add(((fbng)hftv1));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbnh fbnh1 = (fbnh)hftp0.b_message;
        hfuo hfuo1 = fbnh1.c;
        if(!hfuo1.c()) {
            fbnh1.c = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList0, fbnh1.c);
        List list2 = DesugarCollections.unmodifiableList(((fbnh)hftp0.b_message).e);
        ibuq.e(list2, "getLoadLazyDataRequestList(...)");
        new hfxu(list2);
        Collection collection2 = gbfv0.d.values();
        ibuq.f(collection2, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbnh fbnh2 = (fbnh)hftp0.b_message;
        hfuo hfuo2 = fbnh2.e;
        if(!hfuo2.c()) {
            fbnh2.e = ProtoLiteMessage.E(hfuo2);
        }
        hfrj.E(collection2, fbnh2.e);
        int v6 = gbfv0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fbnh)hftp0.b_message).d = v6;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        if(((fbnh)hftv2) != null) {
            gawi.p(bundle4, "dr:savedState", ((MessageLite)(((fbnh)hftv2))));
        }
    }

    public final void m(byi byi0, Boolean boolean0, hded hded0) {
        hdul hdul0 = this.f("BE_PC_11");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvx.a).v_newBuilder();
        hdvc hdvc0 = (hdvc)((ProtoLiteMessage)hdvd.a).v_newBuilder();
        int v = byi0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            hdvc0.k(((hcos)byi0.f(v1)));
        }
        hdrl hdrl0 = hdul0.c == null ? hdrl.a : hdul0.c;
        if(!hdvc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hdvc0).ensureMutable();
        }
        hdvd hdvd0 = (hdvd)hdvc0.b_message;
        hdrl0.getClass();
        hdvd0.e = hdrl0;
        hdvd0.b |= 2;
        hdvc0.a(hdul0.d);
        hdvd hdvd1 = (hdvd)((ProtoLiteBuilder)hdvc0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvx wvx0 = (wvx)hftp0.b_message;
        hdvd1.getClass();
        wvx0.c = hdvd1;
        wvx0.b |= 1;
        boolean z = boolean0.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((wvx)hftv0).d = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvx wvx1 = (wvx)hftp0.b_message;
        hded0.getClass();
        wvx1.e = hded0;
        wvx1.b |= 2;
        this.a.a.g().y(((wvx)hftp0.N_build()));
    }

    @Override  // gatd
    public final void n() {
        ArrayList arrayList0 = this.j;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gatd)arrayList0.get(v1)).n();
        }
    }

    @Override  // gaxs
    protected final void nb() {
        this.a.c.c.d.clear();
        this.a.c.c.c.clear();
        this.a.d.g.i();
        this.a.d.b.f.j(this.a.d);
    }

    public final void o(hdul hdul0) {
        gayo gayo0 = this.n;
        gayo0.a();
        this.m = false;
        bxf bxf0 = this.a.d.d;
        bxf0.clear();
        for(Object object0: hdul0.h) {
            hdzz hdzz0 = (hdzz)object0;
            switch((gkwx.b(hdzz0.e) == null ? gkwx.a : gkwx.b(hdzz0.e)).ordinal()) {
                case 6: {
                    this.m = true;
                    break;
                }
                case 7: {
                    bxf0.add(Long.valueOf((hdzz0.c == 2 ? ((hdzy)hdzz0.d) : hdzy.a).b));
                    break;
                }
                case 11: {
                    hdzx hdzx0 = hdzz0.c == 3 ? ((hdzx)hdzz0.d) : hdzx.a;
                    if(gkwz.a(hdzx0.c) != 2) {
                        continue;
                    }
                    gayo0.b(hdzx0);
                }
            }
        }
    }

    public final void p(CharSequence charSequence0) {
        ContextWrapper contextWrapper0 = this.a.a.e;
        if(gavj.b(contextWrapper0)) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(0x4000);
            accessibilityEvent0.setEnabled(true);
            accessibilityEvent0.getText().add(charSequence0);
            accessibilityEvent0.setClassName(gavj.class.getName());
            accessibilityEvent0.setPackageName("com.google.android.gms");
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)contextWrapper0.getSystemService("accessibility");
            if(accessibilityManager0 != null) {
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
            }
        }
    }

    public final void q(hdul hdul0, Long long0) {
        gdqb gdqb0 = gayy.a("set_page");
        gast gast0 = this.a;
        gatj gatj0 = gast0.a;
        gayt gayt0 = gatj0.f;
        try {
            gdqs gdqs0 = gayt0.a("set_page");
            try {
                this.o = false;
                if(this.u == 3) {
                    this.aZ();
                    this.o = true;
                }
                hdul hdul1 = this.c;
                this.c = hdul0;
                this.o(hdul0);
                gasm gasm0 = gast0.e;
                gasm0.j(gatj0.j, (hdul0.c == null ? hdrl.a : hdul0.c), hdul0.d, long0);
                gasm0.f(hdul0.i);
                if(long0 != null) {
                    gasm0.h(gged_interceptors.l(long0));
                }
                gaxl.a();
                if(!hzlv.a.b().y() || hdul1 != null) {
                    gdqb gdqb1 = gayy.a("set_page_reset");
                    TWR.declareResource(gdqb1);
                    TWR.useResource$NT(gdqb1);
                    gdqs gdqs1 = gayt0.a("set_page_reset");
                    TWR.declareResource(gdqs1);
                    TWR.useResource$NT(gdqb1);
                    TWR.useResource$NT(gdqs1);
                    if(this.i != null) {
                        TWR.useResource$NT(gdqb1);
                        TWR.useResource$NT(gdqs1);
                        this.i = null;
                    }
                    TWR.useResource$NT(gdqb1);
                    TWR.useResource$NT(gdqs1);
                    gatc gatc0 = this.b;
                    ArrayList arrayList0 = gatc0.c;
                    int v = arrayList0.size();
                    for(int v1 = 0; true; ++v1) {
                        TWR.useResource$NT(gdqb1);
                        TWR.useResource$NT(gdqs1);
                        if(v1 >= v) {
                            break;
                        }
                        TWR.useResource$NT(gdqb1);
                        TWR.useResource$NT(gdqs1);
                        ((gatb)arrayList0.get(v1)).f.F();
                    }
                    TWR.useResource$NT(gdqb1);
                    TWR.useResource$NT(gdqs1);
                    gatc0.b();
                    gast0.g.a.g();
                    gast0.g.d.clear();
                    gast0.g.c.g();
                    gast0.g.e.clear();
                    garw garw0 = gast0.b;
                    gbfv gbfv0 = garw0.b;
                    gbfv0.b.clear();
                    gbfv0.c.clear();
                    gbfv0.d.clear();
                    garw0.d.g();
                    garw0.f.clear();
                    if(garw0.w != null) {
                        while(true) {
                            TWR.useResource$NT(gdqb1);
                            TWR.useResource$NT(gdqs1);
                            if(garw0.w.k()) {
                                break;
                            }
                            TWR.useResource$NT(gdqb1);
                            TWR.useResource$NT(gdqs1);
                            garw0.bf(garw0.w.c(0));
                        }
                        TWR.useResource$NT(gdqb1);
                        TWR.useResource$NT(gdqs1);
                        garw0.w.g();
                        garw0.x = true;
                    }
                    TWR.useResource$NT(gdqb1);
                    TWR.useResource$NT(gdqs1);
                    this.l = null;
                    TWR.useResource$NT(gdqb1);
                }
                this.a.g.d((hdul0.f == null ? hdus.a : hdul0.f));
                gdqb gdqb2 = gayy.a("set_page_data");
                try(gdqs gdqs2 = gayt0.a("set_page_data")) {
                    this.a.b.o(hdul0.e);
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(gdqb2, throwable2);
                    throw throwable2;
                }
                gdqb2.close();
                try(gdqb gdqb3 = gayy.a("set_page_node"); gdqs gdqs3 = gayt0.a("set_page_node")) {
                    this.i(hdul0);
                    if(this.o) {
                        this.bb();
                        this.o = false;
                    }
                    gaxl.a();
                    if((hdul0.b & 4) != 0) {
                        gaxl.a();
                        if(hzih.c()) {
                            String s = hdul0.g;
                            if(!TextUtils.equals(this.d, s)) {
                                this.a.a.b.setTitle(s);
                                this.d = s;
                            }
                        }
                        else {
                            gavj.a(this.a.a.e, hdul0.g);
                        }
                    }
                    this.n.c();
                    if(hdul0.e.size() > 0) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hdul0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)hdul0));
                        if(!((hduk)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((hduk)hftp0))).ensureMutable();
                        }
                        ((hdul)((hduk)hftp0).b_message).e = hfvv.a;
                        this.c = (hdul)((ProtoLiteBuilder)(((hduk)hftp0))).N_build();
                    }
                }
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(gdqs0, throwable1);
                throw throwable1;
            }
            gdqs0.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
        gdqb0.close();
        if(this.m) {
            this.j();
        }
        if(long0 != null) {
            this.a.e.c();
        }
    }
}


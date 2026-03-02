import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class garp extends gaxs implements ganu {
    private boolean B;
    private ProtoLiteBuilder C;
    private boolean VU;
    private Set VV;
    public final gast a;
    public hcnu b;
    hcos c;
    public final ArrayList d;
    public boolean e;
    byi f;
    byi g;
    public final bzt h;
    public String i;
    public LinkedHashMap j;
    public final gath k;
    public ganv l;
    public boolean m;
    public HashSet n;
    int o;
    private gged_interceptors p;
    private ArrayList q;
    private final HashMap r;
    private boolean s;

    protected garp(gast gast0) {
        this.d = new ArrayList(1);
        this.e = true;
        this.h = new bzt();
        this.i = "";
        this.k = new gath(true, "", false, false);
        this.r = new HashMap();
        this.o = 1;
        this.VV = new HashSet();
        this.B = false;
        this.n = null;
        this.a = gast0;
    }

    protected final void A(List list0) {
        LinkedHashMap linkedHashMap0 = this.ni(list0.size());
        for(Object object0: list0) {
            linkedHashMap0.put(Integer.valueOf(((garo)object0).a()), ((garo)object0));
        }
    }

    public final void B(hcta hcta0) {
        if((hcta0.b & 1) != 0) {
            this = this.a.b.i(hcta0.c, "BE_DC_06");
        }
        this.an(hcta0);
    }

    protected void C(hcrz hcrz0) {
        hfta hfta0 = hcrs.f;
        hcrz0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcrz0.s.m(hftu0)) {
            hcrz0.f(hfta0);
            Object object0 = hcrz0.s.k(hftu0);
            Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
            hcrr hcrr0 = hcrr.b(((hcrs)object1).e);
            if(hcrr0 == null) {
                hcrr0 = hcrr.a;
            }
            int v = 1;
            switch(hcrr0.ordinal()) {
                case 1: {
                    goto label_19;
                }
                case 3: {
                    goto label_27;
                }
                case 5: {
                    goto label_31;
                }
                case 0: 
                case 2: 
                case 4: 
                case 6: {
                    goto label_13;
                }
                case 7: {
                    this.nj();
                    return;
                }
                case 8: {
                    goto label_61;
                }
            }
            return;
        label_13:
            Locale locale0 = Locale.US;
            hcrr hcrr1 = hcrr.b(((hcrs)object1).e);
            if(hcrr1 == null) {
                hcrr1 = hcrr.a;
            }
            this.K(String.format(locale0, "Unsupported ResultingAction: %s.", ((int)hcrr1.j)));
            return;
        label_19:
            if(((hcrs)object1).c == 2) {
                int v1 = hcoe.a(((Integer)((hcrs)object1).d).intValue());
                if(v1 != 0) {
                    v = v1;
                }
                this.aD(v);
                return;
            }
            this.K("ResultingAction with type ENABLEMENT_STATE_CHANGE does not contain new enablement");
            return;
        label_27:
            gged_interceptors gged0 = this.l();
            if(!gged0.isEmpty()) {
                ((garx)gged0.get(0)).m();
                return;
            label_31:
                hcrw hcrw0 = ((hcrs)object1).c == 6 ? ((hcrw)((hcrs)object1).d) : hcrw.a;
                if(!hcrw0.b.isEmpty()) {
                    hfuo hfuo0 = hcrw0.b;
                    HashSet hashSet0 = new HashSet();
                    HashSet hashSet1 = new HashSet();
                    boolean z = true;
                    for(Object object2: hfuo0) {
                        for(Object object3: ((hcrv)object2).b) {
                            this.a.b.i(((Long)object3).longValue(), "BE_DC_09").E(hashSet1);
                        }
                        if(z) {
                            hashSet0.addAll(hashSet1);
                        }
                        else {
                            hashSet0.retainAll(hashSet1);
                        }
                        hashSet1.clear();
                        z = false;
                    }
                    this.VV = hashSet0;
                    gaxl.a();
                    this.aq(hashSet0, true);
                    this.B = true;
                    return;
                }
                this.ar();
                return;
            label_61:
                this.aA();
            }
        }
    }

    protected final void D() {
        LinkedHashMap linkedHashMap0 = this.j;
        if(linkedHashMap0 != null) {
            linkedHashMap0.clear();
        }
    }

    final void E(Set set0) {
        if(!set0.contains(Long.valueOf(this.nz()))) {
            set0.add(Long.valueOf(this.nz()));
            for(Object object0: this.q()) {
                this.a.b.i(((Long)object0).longValue(), "BE_DC_10").E(set0);
            }
        }
    }

    public final void F(garx garx0) {
        int v = this.d.remove(garx0);
        this.e |= v;
        if(v != 0 && this.d.isEmpty()) {
            this.Q();
        }
    }

    protected void G() {
    }

    public final void H(String s, String s1) {
        gavs.e(s, this.a.a.g, new gayw(this.nz()), s1);
    }

    @Deprecated
    public final void K(String s) {
        gaxl.a();
        this.H("BE_DC_01", String.format(Locale.US, "reference: %d, err: %s", this.nz(), s));
    }

    protected final void L(String s) {
        throw new UnsupportedOperationException(String.format(Locale.US, "reference: %d, err: %s", this.nz(), s));
    }

    public final void M(gkwv gkwv0) {
        ArrayList arrayList0 = this.q;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                gcfi gcfi0 = (gcfi)arrayList0.get(v1);
                ((gcfj)gcfi0.t).t(gcfi0.a(), null, gkwv0);
            }
        }
    }

    protected final void N(bzs bzs0) {
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((garx)gged0.get(v1)).k(bzs0);
        }
    }

    protected final void O() {
        this.P(null);
    }

    protected final void P(garx garx0) {
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            garx garx1 = (garx)gged0.get(v1);
            if(garx1 != garx0) {
                garx1.h();
            }
        }
    }

    protected void Q() {
    }

    public void R(boolean z) {
        if(this.ao(z)) {
            this.ap();
        }
        if(this.aC()) {
            if(!z) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
                gkwx gkwx0 = gkwx.F;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gkxt)hftp1.b_message).g = gkwx0.G;
                ((gkxt)hftp1.b_message).b |= 4;
                long v1 = this.nz();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkxt gkxt0 = (gkxt)hftp1.b_message;
                gkxt0.b |= 0x20;
                gkxt0.l = v1;
                ProtoLiteBuilder hftp2 = this.C;
                gatj gatj0 = this.a.a;
                gavr.b(hftp2, "BE_DC_04", gatj0.g, new gayw(this.nz()), "InputEventData should not be null when losing focus.");
                long v2 = System.currentTimeMillis();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkxx gkxx1 = (gkxx)hftp2.b_message;
                gkxx1.b |= 2;
                gkxx1.d = v2;
                gkxx gkxx2 = (gkxx)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkxt gkxt1 = (gkxt)hftp1.b_message;
                gkxx2.getClass();
                gkxt1.d = gkxx2;
                gkxt1.c = 35;
                this.aw(hftp1);
                gatj0.g.f(hftp1);
                this.C = null;
            }
            else if(this.C == null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxx.a).v_newBuilder();
                long v = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkxx gkxx0 = (gkxx)hftp0.b_message;
                gkxx0.b |= 1;
                gkxx0.c = v;
                this.C = hftp0;
            }
        }
    }

    protected void S(hcnu hcnu0, Bundle bundle0) {
        if(bundle0 != null && bundle0.containsKey("dataValue")) {
            this.aB(hcnu0, ((hcos)gawi.j(bundle0, "dataValue", ((MessageLite)hcos.a))), false);
        }
        else {
            this.ae(hcnu0);
        }
        if(bundle0 != null) {
            Bundle bundle1 = garp.aQ(1L, bundle0);
            if(bundle1 != null) {
                this.l = this.nh(bundle1);
            }
            this.k.c = bundle0.getBoolean("isTerminal", false);
            this.k.d = bundle0.getBoolean("isOrWasDisplayed", false);
        }
    }

    protected void T(Bundle bundle0) {
        this.aa(new garz(this.a));
        if(bundle0 != null) {
            if(bundle0.containsKey("snapshotDataValue")) {
                this.c = (hcos)gawi.j(bundle0, "snapshotDataValue", ((MessageLite)hcos.a));
            }
            this.m = bundle0.getBoolean("isWaitingForResponse", false);
            if(bundle0.containsKey("input_event_data")) {
                gkxx gkxx0 = (gkxx)gawi.j(bundle0, "input_event_data", ((MessageLite)gkxx.a));
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxx0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gkxx0));
                this.C = hftp0;
            }
        }
    }

    protected void U() {
    }

    public final void V(hfta hfta0, int v) {
        int v1 = hfta0.a();
        gatg gatg0 = (gatg)bzu.a(this.h, v1);
        if(gatg0 != null) {
            gatg0.e(v);
        }
    }

    protected void W(hcnu hcnu0, hcnu hcnu1) {
    }

    protected void X(hcoj hcoj0, hcoj hcoj1) {
        this.aD((hcoe.a(hcoj1.c) == 0 ? 2 : hcoe.a(hcoj1.c)));
    }

    protected void Y(hcos hcos0, hcos hcos1, boolean z) {
        hcoj hcoj0;
        if(hcos0 == null) {
            hcoj0 = null;
        }
        else {
            hcoj0 = hcos0.d;
            if(hcoj0 == null) {
                hcoj0 = hcoj.a;
            }
        }
        this.X(hcoj0, (hcos1.d == null ? hcoj.a : hcos1.d));
        this.ay(hcos1);
    }

    protected void Z(int v) {
        if(!this.s) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkxt)hftp0.b_message).g = gkwx0.G;
        ((gkxt)hftp0.b_message).b |= 4;
        long v1 = this.nz();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkxt0.b |= 0x20;
        gkxt0.l = v1;
        this.aw(hftp0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkys.a).v_newBuilder();
        if(v != -1) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkys gkys0 = (gkys)hftp1.b_message;
            gkys0.b |= 1;
            gkys0.c = v;
        }
        gkys gkys1 = (gkys)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt1 = (gkxt)hftp0.b_message;
        gkys1.getClass();
        gkxt1.d = gkys1;
        gkxt1.c = 0x1F;
        this.a.a.g.f(hftp0);
    }

    private final void aA() {
        hcos hcos0 = this.c;
        if(hcos0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hcos0));
            this.ab(((hcos)((ProtoLiteBuilder)(((hftr)hftp0))).N_build()));
        }
        for(Object object0: this.p()) {
            this.a.b.i(((Long)object0).longValue(), "BE_DC_13").aA();
        }
        this.O();
    }

    private final void aB(hcnu hcnu0, hcos hcos0, boolean z) {
        hcos hcos1;
        hcnu hcnu1 = this.b;
        if(hcnu1 == null) {
            hcos1 = null;
        }
        else {
            hcos1 = hcnu1.c;
            if(hcos1 == null) {
                hcos1 = hcos.a;
            }
        }
        this.b = hcnu0;
        if(hcnu1 != null) {
            gatg.d(this.h);
            this.r.clear();
            this.D();
            this.f = null;
            this.g = null;
            this.n = null;
            this.U();
        }
        gatg.c(this.h, this.b.f);
        for(Object object0: this.b.k) {
            HashMap hashMap0 = this.r;
            gkwx gkwx0 = gkwx.b(((hdzz)object0).e);
            if(gkwx0 == null) {
                gkwx0 = gkwx.a;
            }
            hashMap0.put(gkwx0, ((hdzz)object0));
        }
        this.W(hcnu1, this.b);
        this.Y(hcos1, hcos0, z);
        switch((hcnw.a(this.b.m) == 0 ? 1 : hcnw.a(this.b.m)) - 1) {
            case 2: {
                this.c = (hcos)((ProtoLiteBuilder)this.aE()).N_build();
                break;
            }
            case 3: {
                if(this.c == null) {
                    this.c = (hcos)((ProtoLiteBuilder)this.aE()).N_build();
                }
                break;
            }
            default: {
                this.c = null;
            }
        }
        hcnu hcnu2 = this.b;
        if((hcnu2.b & 16) != 0) {
            String s = (hcnu2.j == null ? hcnr.a : hcnu2.j).c;
            if(!TextUtils.equals(this.i, s)) {
                this.i = s;
                gged_interceptors gged0 = this.l();
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((garx)gged0.get(v1)).nm();
                }
            }
        }
        this.s = this.al(gkwx.k);
        this.VU = this.al(gkwx.F);
    }

    private final boolean aC() {
        gaxl.a();
        return hzlv.a.b().q() && this.VU;
    }

    private final void aD(int v) {
        if(v != this.o) {
            this.o = v;
            gged_interceptors gged0 = this.l();
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((garx)gged0.get(v2)).j();
            }
        }
    }

    private final hftr aE() {
        return this.av(0);
    }

    protected final void aa(gatg gatg0) {
        int v = gatg0.b();
        this.h.h(v, gatg0);
    }

    protected void ab(hcos hcos0) {
        this.X(null, (hcos0.d == null ? hcoj.a : hcos0.d));
        this.ay(hcos0);
    }

    protected final void ac(String s) {
        this.ad(TextUtils.isEmpty(s), s);
    }

    public final void ad(boolean z, String s) {
        gath gath0 = this.k;
        if(gath0.a == z && TextUtils.equals(gath0.b, s)) {
            return;
        }
        gath0.a = z;
        gath0.b = s;
        this.nR();
    }

    public final void ae(hcnu hcnu0) {
        this.af(hcnu0, false);
    }

    public final void af(hcnu hcnu0, boolean z) {
        this.aB(hcnu0, (hcnu0.c == null ? hcos.a : hcnu0.c), z);
    }

    public final void ag(byi byi0) {
        if(!byi0.j(this.nz())) {
            byi0.h(this.nz(), ((hcos)((ProtoLiteBuilder)this.av(1)).N_build()));
            this.ah(byi0);
            for(Object object0: this.q()) {
                this.a.b.i(((Long)object0).longValue(), "BE_DC_05").ag(byi0);
            }
        }
    }

    protected void ah(byi byi0) {
    }

    public boolean ai() {
        return false;
    }

    protected boolean aj(hcqv hcqv0) {
        hfta hfta0 = hcrg.c;
        hcqv0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcqv0.s.m(hftu0)) {
            hcqv0.f(hfta0);
            Object object0 = hcqv0.s.k(hftu0);
            Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
            if(hcrf.a(((hcrg)object1).b) == 2) {
                return this.k.d;
            }
            Locale locale0 = Locale.US;
            int v = hcrf.a(((hcrg)object1).b);
            if(v == 0) {
                v = 1;
            }
            this.K(String.format(locale0, "Unsupported ErrorStateCondition type: %d.", ((int)(v - 1))));
            return true;
        }
        hfta hfta1 = hcrd.f;
        hcqv0.f(hfta1);
        hftu hftu1 = hfta1.d;
        if(hcqv0.s.m(hftu1)) {
            hcqv0.f(hfta1);
            Object object2 = hcqv0.s.k(hftu1);
            Object object3 = object2 == null ? hfta1.b : hfta1.d(object2);
            hcqz hcqz0 = hcqz.b(((hcrd)object3).e);
            if(hcqz0 == null) {
                hcqz0 = hcqz.a;
            }
            switch(hcqz0.ordinal()) {
                case 4: {
                    return ((hcrd)object3).c == 5 ? new hfuh(((hcrc)((hcrd)object3).d).c, hcrc.a).contains(this.m()) : new hfuh(hcrc.b.c, hcrc.a).contains(this.m());
                }
                case 5: {
                    hcra hcra0 = ((hcrd)object3).c == 6 ? ((hcra)((hcrd)object3).d) : hcra.a;
                    return (hcoe.a(hcra0.b) == 0 ? 1 : hcoe.a(hcra0.b)) == this.o;
                }
                default: {
                    Locale locale1 = Locale.US;
                    hcqz hcqz1 = hcqz.b(((hcrd)object3).e);
                    if(hcqz1 == null) {
                        hcqz1 = hcqz.a;
                    }
                    this.K(String.format(locale1, "Unsupported dataStateCondition type: %d.", ((int)hcqz1.h)));
                    return true;
                }
            }
        }
        return true;
    }

    public final boolean ak() {
        return this.o != 3;
    }

    protected final boolean al(gkwx gkwx0) {
        return this.r.containsKey(gkwx0);
    }

    public final boolean am() {
        return this.j(false, false).a;
    }

    public final boolean an(hcta hcta0) {
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            boolean z = ((garx)gged0.get(v1)).n(hcta0);
            ++v1;
            if(z) {
                return true;
            }
        }
        return false;
    }

    protected boolean ao(boolean z) {
        return !z;
    }

    public final boolean ap() {
        return this.j(true, false).a;
    }

    final boolean aq(Set set0, boolean z) {
        boolean z1;
        int v = 1;
        if(!set0.contains(Long.valueOf(this.nz()))) {
            for(Object object0: (z ? this.o() : this.q())) {
                v &= this.a.b.i(((Long)object0).longValue(), "BE_DC_08").aq(set0, false);
            }
            z1 = v;
        }
        else if(this.b.l) {
            z1 = this.k(true, true, false).a;
        }
        else {
            z1 = this.ar();
        }
        gath gath0 = new gath(z1, this.k.b, this.k.c, this.k.d);
        this.k.a(gath0);
        this.nR();
        return z1;
    }

    public final boolean ar() {
        return this.j(true, true).a;
    }

    public final void as(gcfi gcfi0) {
        if(this.q == null) {
            this.q = new ArrayList(1);
        }
        this.q.add(gcfi0);
    }

    public final void at(gcfi gcfi0) {
        ArrayList arrayList0 = this.q;
        if(arrayList0 != null) {
            arrayList0.remove(gcfi0);
        }
    }

    protected ProtoLiteBuilder au() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcoj.a).v_newBuilder();
        int v = this.o;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        ((hcoj)hftv0).c = v - 1;
        ((hcoj)hftv0).b |= 1;
        hcoi hcoi0 = this.k.a ? hcoi.b : hcoi.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcoj)hftp0.b_message).h = hcoi0.f;
        ((hcoj)hftp0.b_message).b |= 16;
        return hftp0;
    }

    public hftr av(int v) {
        hcos hcos0 = this.b.c == null ? hcos.a : this.b.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcos0));
        ProtoLiteBuilder hftp1 = this.au();
        if(!((hftr)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
        }
        hcos hcos1 = (hcos)((hftr)hftp0).b_message;
        hcoj hcoj0 = (hcoj)hftp1.N_build();
        hcoj0.getClass();
        hcos1.d = hcoj0;
        hcos1.b |= 4;
        gath gath0 = this.k;
        if(!TextUtils.isEmpty(gath0.b)) {
            String s = gath0.b;
            if(!((hftr)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
            }
            hcos hcos2 = (hcos)((hftr)hftp0).b_message;
            s.getClass();
            hcos2.b |= 8;
            hcos2.e = s;
        }
        return (hftr)hftp0;
    }

    protected final void aw(ProtoLiteBuilder hftp0) {
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            garx garx0 = (garx)gged0.get(v1);
            long v2 = garx0.no();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkxt gkxt0 = (gkxt)hftp0.b_message;
            hfui hfui0 = gkxt0.j;
            if(!hfui0.c()) {
                gkxt0.j = ProtoLiteMessage.D(hfui0);
            }
            gkxt0.j.g(v2);
            int v3 = garx0.nn();
            if(v3 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkxt gkxt1 = (gkxt)hftp0.b_message;
                hfuf hfuf0 = gkxt1.k;
                if(!hfuf0.c()) {
                    gkxt1.k = ProtoLiteMessage.C(hfuf0);
                }
                gkxt1.k.i(v3);
            }
        }
    }

    public int ax(int v) {
        throw new UnsupportedOperationException("getTagByFieldNumberAndSubFieldId is not supported by DataComponent.");
    }

    private final void ay(hcos hcos0) {
        boolean z = true;
        this.k.c = true;
        hcoj hcoj0 = hcos0.d == null ? hcoj.a : hcos0.d;
        if((hcoi.b(hcoj0.h) == null ? hcoi.e : hcoi.b(hcoj0.h)) == hcoi.c) {
            z = false;
        }
        this.ad(z, hcos0.e);
    }

    final gath j(boolean z, boolean z1) {
        return this.k(z, z1, true);
    }

    final gath k(boolean z, boolean z1, boolean z2) {
        int v1;
        int v;
        boolean z4;
        hcnu hcnu0 = this.b;
        boolean z3 = hcnu0.d;
        String s = "";
        if(this.ai()) {
            if(z3) {
                z4 = z1;
                v = 1;
            }
            else {
                s = hcnu0.e;
                z4 = z1;
                v = 0;
            }
            v1 = -1;
        }
        else {
            z4 = z1;
            v = 1;
            v1 = -1;
            for(Object object0: this.v()) {
                garo garo0 = (garo)object0;
                if(v != 0) {
                    v = garo0.d();
                    if(!v) {
                        s = garo0.b();
                        v1 = garo0.a();
                    }
                }
                if(!z4) {
                    z4 = garo0.c();
                }
            }
        }
        if(v == 0) {
            this.Z(v1);
        }
        if(z || v) {
            int v2 = 1;
            for(Object object1: (z2 ? this.o() : this.q())) {
                garp garp0 = this.a.b.i(((Long)object1).longValue(), "BE_DC_07");
                if(!this.B || this.VV.contains(((Long)object1))) {
                    v2 &= garp0.k(z, z1, false).a;
                    if(v2 == 0 && !z) {
                        break;
                    }
                }
            }
            v &= v2;
        }
        if(this.aC()) {
            ProtoLiteBuilder hftp0 = this.C;
            if(hftp0 != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkyt.a).v_newBuilder();
                hcoi hcoi0 = v ? hcoi.b : hcoi.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gkyt)hftv0).d = hcoi0.f;
                ((gkyt)hftv0).b |= 2;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gkyt)hftv1).b |= 4;
                ((gkyt)hftv1).e = z4;
                if(v == 0) {
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkyt gkyt0 = (gkyt)hftp1.b_message;
                    gkyt0.b |= 1;
                    gkyt0.c = v1;
                }
                gkyt gkyt1 = (gkyt)hftp1.N_build();
                if(((gkxx)hftp0.b_message).e.size() == 0 || !((ProtoLiteMessage)(((gkyt)((gkxx)hftp0.b_message).e.get(((gkxx)hftp0.b_message).e.size() - 1)))).equals(gkyt1)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkxx gkxx0 = (gkxx)hftp0.b_message;
                    gkyt1.getClass();
                    hfuo hfuo0 = gkxx0.e;
                    if(!hfuo0.c()) {
                        gkxx0.e = ProtoLiteMessage.E(hfuo0);
                    }
                    gkxx0.e.add(gkyt1);
                }
            }
        }
        gath gath0 = this.k;
        gath gath1 = new gath(((boolean)v), s, z4, gath0.d);
        if(z) {
            gath0.a(gath1);
            this.nR();
        }
        return gath1;
    }

    public final gged_interceptors l() {
        if(this.e) {
            this.p = gged_interceptors.i(this.d);
            this.e = false;
        }
        return this.p;
    }

    @Override  // gaxs
    protected void lx(Bundle bundle0) {
        gawi.p(bundle0, "dataValue", ((MessageLite)((ProtoLiteBuilder)this.aE()).N_build()));
        bundle0.putBoolean("isTerminal", this.k.c);
        bundle0.putBoolean("isOrWasDisplayed", this.k.d);
        bundle0.putBoolean("isWaitingForResponse", this.m);
        gawi.p(bundle0, "snapshotDataValue", ((MessageLite)this.c));
        ProtoLiteBuilder hftp0 = this.C;
        if(hftp0 != null) {
            gawi.p(bundle0, "input_event_data", ((MessageLite)hftp0.N_build()));
        }
    }

    public final hcoi m() {
        return this.am() ? hcoi.b : hcoi.c;
    }

    public final ganv nA() {
        if(this.l == null) {
            this.l = this.nh(null);
        }
        return this.l;
    }

    @Override  // ganu
    public void nH(int v, ganp ganp0) {
        if(v == 988) {
            this.m = false;
            if(gaqt.a(ganp0) == -1) {
                this.N(gaqt.b(ganp0));
                return;
            }
            this.N(new bzs());
        }
    }

    protected final hdzz nI(gkwx gkwx0) {
        hdzz hdzz0 = (hdzz)this.r.get(gkwx0);
        gavr.b(hdzz0, "BE_DC_02", this.a.a.g, new gayw(this.nz()), String.format(Locale.US, "LoggingConfiguration is null for event type: %s", ((int)gkwx0.G)));
        return hdzz0;
    }

    private final void nR() {
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((garx)gged0.get(v1)).l();
        }
        this.V(hcsf.d, 2);
    }

    public final Rect nf() {
        Rect rect0 = new Rect();
        gged_interceptors gged0 = this.l();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            rect0.union(((garx)gged0.get(v1)).nl());
        }
        return rect0;
    }

    private final ganv nh(Bundle bundle0) {
        ganv ganv0 = this.a.a.c(this, bundle0);
        this.aU(1L, ganv0);
        return ganv0;
    }

    private final LinkedHashMap ni(int v) {
        if(this.j == null) {
            this.j = ggkm.m(v);
        }
        return this.j;
    }

    private final void nj() {
        hcnu hcnu0 = this.b;
        if((hcnu0.b & 0x40) != 0) {
            switch((hcnw.a(hcnu0.m) == 0 ? 1 : hcnw.a(hcnu0.m))) {
                case 3: {
                    this.c = (hcos)((ProtoLiteBuilder)this.aE()).N_build();
                    break;
                }
                case 4: {
                    if(this.c == null) {
                        this.c = (hcos)((ProtoLiteBuilder)this.aE()).N_build();
                        break;
                    }
                }
            }
        }
        for(Object object0: this.p()) {
            this.a.b.i(((Long)object0).longValue(), "BE_DC_12").nj();
        }
    }

    public int nx() {
        throw new UnsupportedOperationException("getOptionTag is not supported by DataComponent.");
    }

    public final long nz() {
        return (this.b.c == null ? hcos.a : this.b.c).c;
    }

    protected Iterable o() {
        return ggna.a;
    }

    protected Iterable p() {
        return this.o();
    }

    protected final Iterable q() {
        return this.b.l ? ggna.a : this.o();
    }

    public Object r(List list0) {
        throw new UnsupportedOperationException("getValueByFieldReferenceList is not supported by DataComponent.");
    }

    public Object s(List list0) {
        throw new UnsupportedOperationException("getValueByNestedFieldList is not supported by DataComponent.");
    }

    public String t() {
        this.L("getDisplayText not supported");
        return "";
    }

    public final String u() {
        return this.k.b;
    }

    protected List v() {
        LinkedHashMap linkedHashMap0 = this.j;
        return linkedHashMap0 == null ? ggna.a : new ArrayList(linkedHashMap0.values());
    }

    public final List w(long v) {
        return this.f == null ? null : ((List)this.f.d(v));
    }

    public final List x(long v) {
        return this.g == null ? null : ((List)this.g.d(v));
    }

    public static void y(MessageLite hfvm0, List list0, byi byi0) {
        for(Object object0: list0) {
            long v = (long)(((Long)object0));
            List list1 = (List)byi0.d(v);
            if(list1 == null) {
                list1 = new ArrayList();
            }
            list1.add(hfvm0);
            byi0.h(v, list1);
        }
    }

    protected final void z(garo garo0) {
        this.ni(1).put(Integer.valueOf(((gawr)garo0).b), garo0);
    }
}


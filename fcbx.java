import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class fcbx extends gdak implements gcjs, gcpc, gczo, gdbp {
    public SelectorView a;
    fccr ag;
    ImageWithCaptionView ah;
    FrameLayout ai;
    TextView aj;
    FrameLayout ak;
    View al;
    public Object am;
    LogContext an;
    boolean ao;
    public final byi ap;
    final byi aq;
    public boolean ar;
    public boolean as;
    public final gamj at;
    private ConstraintLayout au;
    private final List av;
    private boolean aw;
    private final gdew ax;
    private String ay;
    fcbr b;
    public gdak c;
    fcab d;

    public fcbx() {
        this.ao = false;
        this.av = new ArrayList();
        this.ap = new byi();
        this.aq = new byi();
        this.ax = new gdew();
        this.at = new gamj(1730);
    }

    @Override  // gami
    public final gamj B() {
        return this.at;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)geyz.a).jf(7, null);
    }

    @Override  // gdak
    public final void K(gffq gffq0, List list0) {
        if((gfev.a(gffq0.e) == 0 ? 1 : gfev.a(gffq0.e)) - 1 != 17) {
            super.K(gffq0, list0);
            return;
        }
        SelectorView selectorView0 = this.a;
        gffl gffl0 = gffq0.c == 11 ? ((gffl)gffq0.d) : gffl.a;
        selectorView0.h((gffl0.b == 3 ? ((long)(((Long)gffl0.c))) : 0L));
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        ImageWithCaptionView imageWithCaptionView0 = this.ah;
        if(imageWithCaptionView0 != null) {
            imageWithCaptionView0.setEnabled(z);
        }
        SelectorView selectorView0 = this.a;
        if(selectorView0 != null) {
            selectorView0.setEnabled(z);
        }
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            fcbr0.ll(z);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.ll(z);
        }
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            fcab0.ll(z);
        }
    }

    public static fcbx Q(geyz geyz0, int v, String s, LogContext logContext0, BuyFlowConfig buyFlowConfig0) {
        fcbx fcbx0 = new fcbx();
        Bundle bundle0 = fcbx.al(v, ((MessageLite)geyz0), logContext0);
        bundle0.putString("analyticsSessionId", s);
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        fcbx0.setArguments(bundle0);
        return fcbx0;
    }

    public final fccr R() {
        if(this.ag == null) {
            this.ag = fccr.R(this);
        }
        return this.ag;
    }

    public final geza S(Bundle bundle0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geza.a).v_newBuilder();
        Object object0 = this.am;
        if((object0 instanceof geyw)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)geyx.a).v_newBuilder();
            String s = ((geyw)object0).d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            geyx geyx0 = (geyx)hftp1.b_message;
            s.getClass();
            geyx0.b |= 1;
            geyx0.c = s;
            if(((geyw)object0).e.size() > 0) {
                ByteString hfsf0 = ((geyw)object0).e;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                geyx geyx1 = (geyx)hftp1.b_message;
                hfsf0.getClass();
                geyx1.b |= 2;
                geyx1.d = hfsf0;
            }
            if(fbgn.J(((geyw)object0))) {
                fcbr fcbr0 = this.b;
                if(fcbr0 != null) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)geyr.a).v_newBuilder();
                    if((((geyq)fcbr0.aA).b & 4) != 0) {
                        gcwf gcwf0 = fcbr0.a;
                        if(gcwf0 != null) {
                            geuj geuj0 = gcwf0.J(Bundle.EMPTY);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            geyr geyr0 = (geyr)hftp2.b_message;
                            geuj0.getClass();
                            geyr0.c = geuj0;
                            geyr0.b |= 1;
                        }
                    }
                    if((((geyq)fcbr0.aA).b & 8) != 0) {
                        fcbm fcbm0 = fcbr0.b;
                        if(fcbm0 != null) {
                            gfar gfar0 = fcbm0.R();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            geyr geyr1 = (geyr)hftp2.b_message;
                            gfar0.getClass();
                            geyr1.d = gfar0;
                            geyr1.b |= 2;
                        }
                    }
                    if((((geyq)fcbr0.aA).b & 16) != 0) {
                        gdak gdak0 = fcbr0.c;
                        if(gdak0 != null) {
                            geyh geyh0 = fbgn.s(gdak0, Bundle.EMPTY);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            geyr geyr2 = (geyr)hftp2.b_message;
                            geyh0.getClass();
                            geyr2.e = geyh0;
                            geyr2.b |= 4;
                        }
                    }
                    geyr geyr3 = (geyr)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    geyx geyx2 = (geyx)hftp1.b_message;
                    geyr3.getClass();
                    geyx2.e = geyr3;
                    geyx2.b |= 4;
                }
            }
            gdak gdak1 = this.c;
            if(gdak1 != null) {
                geyh geyh1 = fbgn.s(gdak1, bundle0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                geyx geyx3 = (geyx)hftp1.b_message;
                geyh1.getClass();
                geyx3.f = geyh1;
                geyx3.b |= 8;
            }
            fccr fccr0 = this.ag;
            if(fccr0 != null && fccr0.la()) {
                gfdg gfdg0 = fccr0.ac();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                geyx geyx4 = (geyx)hftp1.b_message;
                gfdg0.getClass();
                geyx4.g = gfdg0;
                geyx4.b |= 16;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geza geza0 = (geza)hftp0.b_message;
            geyx geyx5 = (geyx)hftp1.N_build();
            geyx5.getClass();
            geza0.c = geyx5;
            geza0.b = 1;
        }
        else if((object0 instanceof geyp)) {
            gdak gdak2 = this.c;
            if(gdak2 != null) {
                geyh geyh2 = fbgn.s(gdak2, bundle0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geza geza1 = (geza)hftp0.b_message;
                geyh2.getClass();
                geza1.c = geyh2;
                geza1.b = 2;
            }
        }
        ArrayList arrayList0 = new ArrayList(5);
        ArrayList arrayList1 = new ArrayList(5);
        for(Object object1: ((geyz)this.aA).e) {
            geyw geyw0 = (geyw)object1;
            int v = geyw0.n;
            if(geyv.a(v) == 2) {
                arrayList0.add(Long.valueOf(geyw0.c));
            }
            else {
                if(geyv.a(v) != 6) {
                    continue;
                }
                arrayList1.add(Long.valueOf(geyw0.c));
            }
        }
        for(Object object2: ((geyz)this.aA).f) {
            geyp geyp0 = (geyp)object2;
            if(geyo.a(geyp0.j) == 2) {
                arrayList1.add(Long.valueOf(geyp0.c));
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geza geza2 = (geza)hftp0.b_message;
        hfui hfui0 = geza2.d;
        if(!hfui0.c()) {
            geza2.d = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(arrayList0, geza2.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geza geza3 = (geza)hftp0.b_message;
        hfui hfui1 = geza3.e;
        if(!hfui1.c()) {
            geza3.e = ProtoLiteMessage.D(hfui1);
        }
        hfrj.E(arrayList1, geza3.e);
        return (geza)hftp0.N_build();
    }

    @Override  // gdak, gczo
    public final void T(int v, Bundle bundle0) {
        if(v == 4) {
            if((this.am instanceof geyp) && ((geyp)this.am).h) {
                if(bundle0 == Bundle.EMPTY) {
                    bundle0 = new Bundle();
                }
                bundle0.putBoolean("EventListener.EXTRA_SHOULD_AUTO_SUBMIT", true);
            }
            v = 4;
        }
        super.T(v, bundle0);
        if(this.ao && v == 4 && gczs.j(this.lh())) {
            this.cb.e(false);
            this.ao = false;
        }
    }

    final void U(geyg geyg0, String s) {
        if(geyg0 != null) {
            gdak gdak0 = (gdak)this.getChildFragmentManager().g(0x7F0B174A);  // id:instrument_form_holder
            this.c = gdak0;
            if(gdak0 == null || !fbgn.H(gdak0, geyg0)) {
                gcjn gcjn0 = this.cb;
                if(gcjn0 != null && !gcjn0.h) {
                    this.ao = true;
                    gcjn0.e(true);
                }
                BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
                gdak gdak1 = fbgn.p(geyg0, this.bU, s, this.ay, gklu.b, this.an, buyFlowConfig0);
                this.c = gdak1;
                if((gdak1 instanceof gdfg)) {
                    ((gdfg)gdak1).ao = true;
                    long v = ((gdfg)gdak1).bs();
                    Bundle bundle0 = (Bundle)this.aq.d(v);
                    if(bundle0 != null) {
                        ((gdfg)gdak1).ap = bundle0.getBoolean("previouslyLaunchedAndAborted");
                    }
                }
                ca ca0 = new ca(this.getChildFragmentManager());
                ca0.G(0x7F0B174A, this.c);  // id:instrument_form_holder
                ca0.a();
                String s1 = this.ay;
                OrchestrationViewEvent.d(this.getContext(), s1, this.c.B());
            }
            gcjn gcjn1 = this.cb;
            if(gcjn1 != null) {
                this.c.cb = gcjn1;
            }
            this.ax.d(this.c);
        }
    }

    private static long V(Object object0) {
        long v;
        if((object0 instanceof geyw)) {
            v = ((geyw)object0).c;
        }
        else {
            v = (object0 instanceof geyp) ? ((geyp)object0).c : 0L;
        }
        if(object0 != null && v == 0L) {
            throw new IllegalStateException("UiReference is not set for option");
        }
        return v;
    }

    private final void W(Object object0) {
        fm fm0 = this.getChildFragmentManager();
        ca ca0 = new ca(fm0);
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            this.ax.p(fcab0);
            ca0.o(this.d);
            this.d = null;
        }
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            this.ax.p(fcbr0);
            ca0.o(this.b);
            this.b.lr();
            this.b = null;
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            if((gdak0 instanceof gdfg)) {
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("previouslyLaunchedAndAborted", ((gdfg)this.c).ap);
                long v = this.c.bs();
                this.aq.h(v, bundle0);
            }
            this.ax.p(this.c);
            ca0.o(this.c);
            this.c.lr();
            this.c = null;
        }
        ca0.a();
        fm0.aq();
        int v1 = 0;
        if((object0 instanceof geyw)) {
            if((((geyw)object0).b & 0x20) != 0) {
                fm fm1 = this.getChildFragmentManager();
                String s = ((geyw)object0).c + "descriptionTag";
                fcab fcab1 = (fcab)fm1.h(s);
                this.d = fcab1;
                if(fcab1 == null) {
                    gewu gewu0 = ((geyw)object0).i;
                    if(gewu0 == null) {
                        gewu0 = gewu.a;
                    }
                    this.d = fcab.H(gewu0, this.bU, this.ay, this.an);
                    ca ca1 = new ca(fm1);
                    ca1.z(0x7F0B10F1, this.d, s);  // id:description_form_holder
                    ca1.a();
                }
                this.ax.d(this.d);
            }
            if(fbgn.J(((geyw)object0))) {
                fm fm2 = this.getChildFragmentManager();
                batl.m((((geyw)object0).b & 0x800) != 0, "Editable instruments should have fixInfoForm");
                String s1 = ((geyw)object0).c + "fixInfoTag";
                fcbr fcbr1 = (fcbr)fm2.h(s1);
                this.b = fcbr1;
                if(fcbr1 == null) {
                    geyq geyq0 = ((geyw)object0).o;
                    if(geyq0 == null) {
                        geyq0 = geyq.a;
                    }
                    int v2 = this.bU;
                    String s2 = this.ay;
                    LogContext logContext0 = this.an;
                    fcbr fcbr2 = new fcbr();
                    Bundle bundle1 = fcbr.al(v2, ((MessageLite)geyq0), logContext0);
                    bundle1.putString("analyticsSessionId", s2);
                    fcbr2.setArguments(bundle1);
                    this.b = fcbr2;
                    ca ca2 = new ca(fm2);
                    ca2.z(0x7F0B13F6, this.b, s1);  // id:fix_info_form_holder
                    ca2.a();
                }
                gcjn gcjn0 = this.cb;
                if(gcjn0 != null) {
                    this.b.cb = gcjn0;
                }
                this.ax.d(this.b);
            }
            if((((geyw)object0).b & 0x40) != 0) {
                geyg geyg0 = ((geyw)object0).j;
                if(geyg0 == null) {
                    geyg0 = geyg.a;
                }
                this.U(geyg0, ((geyw)object0).f);
            }
        }
        else if((object0 instanceof geyp) && (((geyp)object0).b & 16) != 0) {
            geyg geyg1 = ((geyp)object0).f;
            if(geyg1 == null) {
                geyg1 = geyg.a;
            }
            this.U(geyg1, ((geyp)object0).d);
        }
        View view0 = this.al;
        if(this.aw || this.aC || this.li().isEmpty()) {
            v1 = 8;
        }
        view0.setVisibility(v1);
    }

    private final void Z(Object object0, boolean z) {
        if((object0 instanceof geyw) && (((geyw)object0).b & 0x1000) != 0) {
            if(z || this.R() == null) {
                BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
                gfdf gfdf0 = ((geyw)object0).p;
                if(gfdf0 == null) {
                    gfdf0 = gfdf.a;
                }
                fccr fccr0 = fccr.Z(this, gfdf0, this.cM(), buyFlowConfig0);
                this.ag = fccr0;
                fccr0.cb = this.cb;
            }
        }
        else if(this.R() != null) {
            fccr.S(this);
            this.ag = null;
        }
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        if(fcbx.V(object0) != fcbx.V(object1)) {
            if(this.am == null) {
                this.Z(object0, false);
            }
            else {
                String s = this.ay;
                OrchestrationViewEvent.c(this.getContext(), s, this.at);
                this.Z(object0, true);
            }
            if(fcbx.V(this.am) == fcbx.V(object0)) {
                this.W(object0);
            }
            else {
                if(hzny.c()) {
                    LogContext logContext0 = this.an;
                    if(logContext0 != null && logContext0 != this.cM()) {
                        gcfz.d(logContext0);
                    }
                }
                this.an = hzny.c() ? gcfz.a(this.cM(), fcbx.V(object0)) : this.cM();
                this.am = object0;
                this.W(object0);
                gcjn gcjn0 = this.cb;
                long v = fcbx.V(object0);
                gcjo.e(gcjn0, this.av, v);
            }
        }
        this.a.post(new fcbw(this));
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        int v = gfga0.e;
        int v1 = gffw.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 1) {
            case 3: 
            case 4: 
            case 18: {
                return gcjo.g(gfga0, fcbx.V(this.am));
            }
            case 23: {
                boolean z = this.a.d;
                if(gffw.a(v) == 24) {
                    return (gfga0.b == 9 ? ((gfft)gfga0.c) : gfft.a).b == z;
                }
                int v4 = gffw.a(v);
                if(v4 != 0) {
                    v2 = v4;
                }
                throw new IllegalArgumentException(String.format("Unsupported trigger type: %d", ((int)(v2 - 1))));
            }
            default: {
                Locale locale0 = Locale.US;
                int v3 = gffw.a(gfga0.e);
                if(v3 != 0) {
                    v2 = v3;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v2 - 1))));
            }
        }
    }

    @Override  // gcpc
    public final void aq(Intent intent0) {
        if(hzob.a.b().a()) {
            gdak gdak0 = this.c;
            if((gdak0 instanceof gcpc)) {
                ((gcpc)gdak0).aq(intent0);
            }
        }
        else {
            gdak gdak1 = this.c;
            if((gdak1 instanceof fcbh)) {
                ((fcbh)gdak1).aq(intent0);
            }
        }
    }

    @Override  // gdbp
    public final void ar(View view0) {
        if(this.ah != null) {
            bb bb0 = new bb();
            bb0.c(this.au);
            bb0.d(0x7F0B1756, 3, 0x7F0B1656, 3);  // id:instrument_selector_view
            bb0.a(this.au);
        }
        FrameLayout frameLayout0 = this.ak;
        if(frameLayout0 != null) {
            frameLayout0.setVisibility(8);
        }
    }

    @Override  // gdbp
    public final void as(View view0) {
        if(this.ah != null) {
            bb bb0 = new bb();
            bb0.c(this.au);
            bb0.d(0x7F0B1756, 3, 0x7F0B1755, 4);  // id:instrument_selector_view
            bb0.a(this.au);
        }
        FrameLayout frameLayout0 = this.ak;
        if(frameLayout0 != null) {
            frameLayout0.setVisibility(0);
        }
    }

    @Override  // gdbp
    public final void av() {
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            fcab0.ai(false);
        }
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            fcbr0.ai(false);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.ai(false);
        }
    }

    @Override  // gdbp
    public final boolean aw() {
        if(this.ar) {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", false);
            this.T(18, bundle0);
            this.as = true;
            return false;
        }
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            fcab0.ai(true);
        }
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            fcbr0.ai(true);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.ai(true);
        }
        int v = this.a.getChildCount();
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B4, v, new Object[]{v}));  // plurals:wallet_expanding_instrument_selector
        return true;
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((geyz)this.aA).c;
    }

    @Override  // gdak
    public final hbzg lK() {
        Object object0 = this.am;
        if((object0 instanceof geyw) && (((geyw)object0).b & 0x4000) != 0) {
            hbzg hbzg0 = ((geyw)object0).r;
            return hbzg0 == null ? hbzg.a : hbzg0;
        }
        return null;
    }

    @Override  // gdak
    public final String lL(String s) {
        Object object0 = this.am;
        if((object0 instanceof geyw)) {
            return ((geyw)object0).f;
        }
        return (object0 instanceof geyp) ? this.c.aX(s) : "";
    }

    @Override  // gdaa
    public final boolean la() {
        if(!(this.am instanceof geyw) && this.c == null) {
            return false;
        }
        return this.b == null || this.b.la() ? this.c == null || this.c.la() : false;
    }

    @Override  // gczu
    public final ArrayList lh() {
        ArrayList arrayList0 = new ArrayList(2);
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            arrayList0.add(new gczs(fcbr0));
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            arrayList0.add(new gczs(gdak0));
        }
        return arrayList0;
    }

    @Override  // gami
    public final List li() {
        List list0 = new ArrayList(3);
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            ((ArrayList)list0).add(fcab0);
        }
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            ((ArrayList)list0).add(fcbr0);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            ((ArrayList)list0).add(gdak0);
        }
        return list0;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            gfga gfga0 = gcjm0.a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            switch(v2 - 1) {
                case 1: 
                case 4: 
                case 18: {
                    this.av.add(gcjm0);
                    break;
                }
                case 3: 
                case 23: {
                    break;
                }
                default: {
                    Locale locale0 = Locale.US;
                    int v4 = gffw.a(gfga0.e);
                    if(v4 != 0) {
                        v3 = v4;
                    }
                    throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
                }
            }
        }
    }

    @Override  // gdak
    public final void lr() {
        super.lr();
        fcbr fcbr0 = this.b;
        if(fcbr0 != null) {
            fcbr0.lr();
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.lr();
        }
        for(Object object0: ((geyz)this.aA).e) {
            geyw geyw0 = (geyw)object0;
            geyg geyg0 = geyw0.j == null ? geyg.a : geyw0.j;
            if(((geyg0.i == null ? gfcw.a : geyg0.i).b & 1) != 0) {
                geyg geyg1 = geyw0.j == null ? geyg.a : geyw0.j;
                gfcw gfcw0 = geyg1.i == null ? gfcw.a : geyg1.i;
                gcjo.c(this, (gfcw0.c == null ? gewg.a : gfcw0.c).d, this.cb);
            }
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return this.b == null || !this.b.ly(getg0) ? this.c != null && this.c.ly(getg0) : true;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ax;
    }

    @Override  // gcyg
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.ay = this.getArguments().getString("analyticsSessionId");
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        Object object0 = this.am;
        if((object0 instanceof geyw)) {
            gciq.j(bundle0, "selectedInstrument", ((MessageLite)(((geyw)object0))));
        }
        else if((object0 instanceof geyp)) {
            gciq.j(bundle0, "selectedAdditionalOption", ((MessageLite)(((geyp)object0))));
        }
        bundle0.putBoolean("isUpdatingInstrumentSelectorRequired", this.ar);
        bundle0.putBoolean("isWaitingForUpdatedInstrumentSelector", this.as);
        byi byi0 = this.aq;
        int v = byi0.b();
        long[] arr_v = new long[v];
        Bundle[] arr_bundle = new Bundle[v];
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = byi0.c(v1);
            arr_v[v1] = v2;
            arr_bundle[v1] = (Bundle)byi0.d(v2);
        }
        bundle0.putLongArray("redirectFormSavedStateKeys", arr_v);
        bundle0.putParcelableArray("redirectFormSavedStateValues", arr_bundle);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gewg gewg1;
        Object object0;
        gfgo gfgo0;
        Bundle bundle1 = bundle0;
        if(bundle1 != null) {
            long[] arr_v = bundle1.getLongArray("redirectFormSavedStateKeys");
            Parcelable[] arr_parcelable = bundle1.getParcelableArray("redirectFormSavedStateValues");
            if(arr_v != null && arr_parcelable != null && arr_v.length == arr_parcelable.length) {
                for(int v = 0; v < arr_v.length; ++v) {
                    this.aq.h(arr_v[v], ((Bundle)arr_parcelable[v]));
                }
            }
        }
        ConstraintLayout constraintLayout0 = (ConstraintLayout)layoutInflater0.inflate(0x7F0E0D3C, null, false);  // layout:wallet_fragment_instrument_selector
        this.au = constraintLayout0;
        SelectorView selectorView0 = (SelectorView)constraintLayout0.findViewById(0x7F0B1756);  // id:instrument_selector_view
        this.a = selectorView0;
        this.ax.d(selectorView0);
        SelectorView selectorView1 = this.a;
        selectorView1.e = this;
        selectorView1.f = this;
        selectorView1.h = this.cM();
        selectorView1.g = this.bs();
        if(bundle1 == null) {
            this.ar = fbds.a(((geyz)this.aA)) == 2;
            bundle1 = null;
        }
        else {
            this.ar = bundle1.getBoolean("isUpdatingInstrumentSelectorRequired");
            this.as = bundle1.getBoolean("isWaitingForUpdatedInstrumentSelector");
        }
        this.al = this.au.findViewById(0x7F0B1752);  // id:instrument_selector_form_separator
        if((((geyz)this.aA).b & 0x200) != 0) {
            this.ah = (ImageWithCaptionView)this.au.findViewById(0x7F0B1655);  // id:header_icon
            this.ai = (FrameLayout)this.au.findViewById(0x7F0B1656);  // id:header_icon_container
            ImageWithCaptionView imageWithCaptionView0 = this.ah;
            geyz geyz0 = (geyz)this.aA;
            if((geyz0.b & 0x200) == 0) {
                gfgo0 = null;
            }
            else {
                gfgo0 = geyz0.o;
                if(gfgo0 == null) {
                    gfgo0 = gfgo.a;
                }
            }
            imageWithCaptionView0.o(gfgo0, fbgn.o(this.getContext()));
            this.ai.setVisibility(0);
        }
        if(!((geyz)this.aA).d.isEmpty()) {
            this.aj = (TextView)this.au.findViewById(0x7F0B1754);  // id:instrument_selector_header
            this.ak = (FrameLayout)this.au.findViewById(0x7F0B1755);  // id:instrument_selector_header_container
            this.aj.setText(((geyz)this.aA).d);
            this.aj.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        }
        if(bundle1 == null) {
            object0 = null;
        }
        else if(bundle1.containsKey("selectedInstrument")) {
            object0 = gciq.a(bundle1, "selectedInstrument", ((Parser)((ProtoLiteMessage)geyw.a).jf(7, null)));
        }
        else if(bundle1.containsKey("selectedAdditionalOption")) {
            object0 = gciq.a(bundle1, "selectedAdditionalOption", ((Parser)((ProtoLiteMessage)geyp.a).jf(7, null)));
        }
        else {
            object0 = null;
        }
        if(object0 == null) {
            object0 = fbdd.d(((geyz)this.aA));
        }
        this.a.removeAllViews();
        byi byi0 = this.ap;
        byi0.g();
        Context context0 = this.getContext();
        for(Object object1: ((geyz)this.aA).e) {
            byi0.h(((geyw)object1).c, ((geyw)object1));
        }
        for(Object object2: ((geyz)this.aA).f) {
            byi0.h(((geyp)object2).c, ((geyp)object2));
        }
        geyt[] arr_geyt = (geyt[])((geyz)this.aA).g.toArray(new geyt[0]);
        if(arr_geyt.length == 0) {
            arr_geyt = new geyt[1];
            geys geys0 = (geys)((ProtoLiteMessage)geyt.a).v_newBuilder();
            for(Object object3: ((geyz)this.aA).e) {
                geys0.a(((geyw)object3).c);
            }
            for(Object object4: ((geyz)this.aA).f) {
                geys0.a(((geyp)object4).c);
            }
            arr_geyt[0] = (geyt)((ProtoLiteBuilder)geys0).N_build();
        }
        int v1 = 0;
        while(v1 < arr_geyt.length) {
            geyt geyt0 = arr_geyt[v1];
            if((geyt0.b & 1) != 0) {
                gfgr gfgr0 = geyt0.c == null ? gfgr.a : geyt0.c;
                fcbs fcbs0 = new fcbs(this.bV);
                fcbs0.p = gfgr0;
                fcbs0.a.p(gfgr0);
                this.a.addView(fcbs0);
            }
            Iterator iterator4 = geyt0.d.iterator();
            while(iterator4.hasNext()) {
                Object object5 = iterator4.next();
                Object object6 = byi0.d(((Long)object5).longValue());
                if((object6 instanceof geyw)) {
                    if(geyv.a(((geyw)object6).n) != 6) {
                        fcbt fcbt0 = new fcbt(context0);
                        fcbt0.g(((geyw)object6));
                        fcbt0.q(((geyw)object6).c);
                        fcbt0.n = this.aC;
                        this.a.addView(fcbt0);
                    }
                    bundle1 = bundle1;
                    iterator4 = iterator4;
                    continue;
                }
                if(!(object6 instanceof geyp)) {
                    throw new IllegalStateException("Unknown option type");
                }
                if(geyo.a(((geyp)object6).j) != 2) {
                    if((((geyp)object6).b & 16) != 0) {
                        fcbq fcbq0 = fcbq.e(context0, ((geyp)object6));
                        fcbq0.n = this.aC;
                        this.a.addView(fcbq0);
                    }
                    else if(((geyp)object6).g.size() > 0) {
                        int v2 = fcbx.V(object0) == fcbx.V(((geyp)object6)) ? 1 : 0;
                        for(Object object7: ((geyp)object6).g) {
                            geyg geyg0 = (geyg)object7;
                            int v3 = geyg0.b;
                            if((v3 & 1) == 0) {
                                if((v3 & 4) != 0) {
                                    gewg gewg2 = (geyg0.e == null ? gfbn.a : geyg0.e).c;
                                    gewg1 = gewg2 == null ? gewg.a : gewg2;
                                    goto label_166;
                                }
                                if((v3 & 0x20) != 0) {
                                    gewg gewg3 = (geyg0.h == null ? gezu.c : geyg0.h).e;
                                    gewg1 = gewg3 == null ? gewg.a : gewg3;
                                    goto label_166;
                                }
                                if((v3 & 16) != 0) {
                                    gewg gewg4 = (geyg0.g == null ? gezb.a : geyg0.g).c;
                                    gewg1 = gewg4 == null ? gewg.a : gewg4;
                                    goto label_166;
                                }
                                if((v3 & 8) != 0) {
                                    gewg gewg5 = (geyg0.f == null ? gewu.a : geyg0.f).c;
                                    gewg1 = gewg5 == null ? gewg.a : gewg5;
                                    goto label_166;
                                }
                                if((v3 & 2) != 0) {
                                    gewg gewg6 = (geyg0.d == null ? gfax.a : geyg0.d).c;
                                    gewg1 = gewg6 == null ? gewg.a : gewg6;
                                    goto label_166;
                                }
                                if((v3 & 0x40) == 0) {
                                    throw new IllegalArgumentException("Unknown Instrument Form");
                                }
                                gewg gewg7 = (geyg0.i == null ? gfcw.a : geyg0.i).c;
                                gewg1 = gewg7 == null ? gewg.a : gewg7;
                            }
                            else {
                                gewg gewg0 = (geyg0.c == null ? gfak.d : geyg0.c).f;
                                gewg1 = gewg0 == null ? gewg.a : gewg0;
                            }
                        label_166:
                            String s = gewg1 == null || (gewg1.b & 8) == 0 ? null : gewg1.f;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geyp.a).v_newBuilder();
                            if(TextUtils.isEmpty(s)) {
                                s = ((geyp)object6).d;
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            geyp geyp0 = (geyp)hftp0.b_message;
                            s.getClass();
                            geyp0.b |= 2;
                            geyp0.d = s;
                            gfgo gfgo1 = ((geyp)object6).e;
                            if(gfgo1 == null) {
                                gfgo1 = gfgo.a;
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            gfgo1.getClass();
                            ((geyp)hftv0).e = gfgo1;
                            ((geyp)hftv0).b |= 4;
                            long v4 = ((geyp)object6).c;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp0.b_message;
                            ((geyp)hftv1).b |= 1;
                            ((geyp)hftv1).c = v4;
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            geyp geyp1 = (geyp)hftp0.b_message;
                            geyg0.getClass();
                            geyp1.f = geyg0;
                            geyp1.b |= 16;
                            geyp geyp2 = (geyp)hftp0.N_build();
                            fcbq fcbq1 = fcbq.e(context0, geyp2);
                            fcbq1.n = this.aC;
                            this.a.addView(fcbq1);
                            if(1 == v2) {
                                object0 = geyp2;
                            }
                            bundle1 = bundle1;
                            iterator4 = iterator4;
                            v2 = 0;
                            continue;
                        }
                        continue;
                    }
                }
                bundle1 = bundle1;
                iterator4 = iterator4;
                continue;
            }
            ++v1;
        }
        this.aw = this.a.getChildCount() == 1 && ((geyz)this.aA).n;
        if(object0 == null) {
            SelectorView selectorView2 = this.a;
            ArrayList arrayList0 = new ArrayList();
            int v5 = selectorView2.getChildCount();
            for(int v6 = 0; v6 < v5; ++v6) {
                arrayList0.add(((gdbk)selectorView2.d(v6)).k());
            }
            int v7 = arrayList0.size();
            int v8 = 0;
            while(v8 < v7) {
                Object object8 = arrayList0.get(v8);
                if(!(object8 instanceof geyw) || fbgn.K(((geyw)object8))) {
                    object0 = object8;
                    goto label_235;
                }
                ++v8;
            }
            throw new IllegalStateException("No available options to display to the user.");
        }
    label_235:
        this.a.h(fcbx.V(object0));
        this.a.setVisibility((this.aw ? 8 : 0));
        if(this.ah != null) {
            if(this.aw) {
                this.ai.setVisibility(8);
            }
            else {
                this.ai.setVisibility(0);
                gfgo gfgo2 = ((geyz)this.aA).o;
                if(gfgo2 == null) {
                    gfgo2 = gfgo.a;
                }
                if(gcio.k(gfgo2.d)) {
                    this.ah.post(new fcbu(this));
                }
                else {
                    ImageWithCaptionView imageWithCaptionView1 = this.ah;
                    imageWithCaptionView1.b = new fcbv(this);
                }
            }
        }
        if(bundle1 == null && ((geyz)this.aA).j) {
            this.a.a.v(1);
        }
        if(this.ar) {
            this.T(26, Bundle.EMPTY);
        }
        return this.au;
    }
}


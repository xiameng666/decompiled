import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.timelineview.TimelineViewFragment.TimelineViewPageDetails;
import com.google.android.gms.wallet.ui.common.PageDetails;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.ui.component.alert.AlertView;
import com.google.android.wallet.ui.document.DownloadedDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fbyr extends fbzl implements gdeg, gdej {
    gddz a;
    AlertView ag;
    gdek ah;
    final fbnw ai;
    private final gamj aj;
    private byte[] ak;
    gexo b;
    boolean c;
    LinearLayout d;

    public fbyr() {
        this.aj = new gamj(25);
        this.ai = new fbyp(this);
    }

    @Override  // fbzp
    protected final PageDetails A() {
        return new TimelineViewFragment.TimelineViewPageDetails();
    }

    @Override  // gami
    public final gamj B() {
        throw null;
    }

    @Override  // fbzp
    protected final gfet C() {
        Object object0 = this.bx;
        if(object0 != null && (((hchp)object0).b & 8) != 0) {
            gfet gfet0 = ((hchp)object0).i;
            return gfet0 == null ? gfet.a : gfet0;
        }
        return null;
    }

    @Override  // fbzp
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)hchn.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Parser E() {
        return (Parser)((ProtoLiteMessage)hchp.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Parser F() {
        return (Parser)((ProtoLiteMessage)hchr.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Object G(Object object0) {
        Object object1 = ((ProtoLiteMessage)hchr.a).v_newBuilder();
        gesx gesx0 = this.cs(this.by.n.f.toByteArray());
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        ProtoLiteMessage hftv0 = object1.b_message;
        gesx0.getClass();
        ((hchr)hftv0).c = gesx0;
        ((hchr)hftv0).b |= 1;
        if(((hchq)object0) != null) {
            if(!hftv0.isImmutable()) {
                ((ProtoLiteBuilder)object1).ensureMutable();
            }
            hchr hchr0 = (hchr)object1.b_message;
            hchr0.d = (hchq)object0;
            hchr0.b |= 2;
        }
        this.bx().b.C(((hchr)((ProtoLiteBuilder)object1).N_build()), this.by.p);
        return object1;
    }

    @Override  // fbzp
    protected final Object H(Bundle bundle0, byte[] arr_b, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hchq.a).v_newBuilder();
        if(this.ag != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcek.a).v_newBuilder();
            hcej hcej0 = ((hchp)this.bx).r;
            if(hcej0 == null) {
                hcej0 = hcej.a;
            }
            long v = hcej0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hcek)hftv0).b |= 1;
            ((hcek)hftv0).c = v;
            hcej hcej1 = ((hchp)this.bx).r;
            if(hcej1 == null) {
                hcej1 = hcej.a;
            }
            ByteString hfsf0 = hcej1.f;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcek hcek0 = (hcek)hftp1.b_message;
            hfsf0.getClass();
            hcek0.b |= 2;
            hcek0.d = hfsf0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hchq hchq0 = (hchq)hftp0.b_message;
            hcek hcek1 = (hcek)hftp1.N_build();
            hcek1.getClass();
            hchq0.e = hcek1;
            hchq0.b |= 4;
        }
        if(this.bP != null && this.bP.x() != null) {
            hceu hceu0 = this.bP.x();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hchq hchq1 = (hchq)hftp0.b_message;
            hceu0.getClass();
            hchq1.d = hceu0;
            hchq1.b |= 2;
        }
        return (hchq)hftp0.N_build();
    }

    @Override  // fbzl
    protected final List I() {
        return null;
    }

    @Override  // fbzp
    public final void K(gffq gffq0, List list0) {
        if((gfev.a(gffq0.e) == 0 ? 1 : gfev.a(gffq0.e)) - 1 != 3) {
            super.K(gffq0, list0);
            return;
        }
        gffk gffk0 = gffq0.c == 4 ? ((gffk)gffq0.d) : gffk.a;
        if(this.ld((gffk0.c ? null : gffk0.b))) {
            byte[] arr_b = gffk0.e.toByteArray();
            hchq hchq0 = (hchq)this.bD(Bundle.EMPTY, null, null);
            if(arr_b != null && arr_b.length > 0) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchq0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hchq0));
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hchq hchq1 = (hchq)hftp0.b_message;
                hchq1.b |= 1;
                hchq1.c = hfsf0;
                hchq0 = (hchq)hftp0.N_build();
            }
            this.bT(hchq0);
        }
    }

    @Override  // fbzp
    protected final void L(boolean z) {
        this.ba = ((hchp)this.bx).d;
        this.cc(z);
        this.d.removeAllViews();
        if(z) {
            this.aJ.setVisibility(8);
        }
        hchp hchp0 = (hchp)this.bx;
        if((hchp0.b & 0x200) != 0 && (hchp0.r == null ? hcej.a : hchp0.r).c.size() > 0) {
            AlertView alertView0 = (AlertView)this.bW.inflate(0x7F0E0E05, this.d, false);  // layout:wallet_view_alert
            this.ag = alertView0;
            alertView0.q = this.cb;
            alertView0.setId(this.cH().a());
            AlertView alertView1 = this.ag;
            hcej hcej0 = ((hchp)this.bx).r;
            if(hcej0 == null) {
                hcej0 = hcej.a;
            }
            alertView1.i(hcej0, ((Activity)this.getContext()), this.cI(alertView1.getId()), this);
            this.d.addView(this.ag);
        }
        hchp hchp1 = (hchp)this.bx;
        if((hchp1.b & 0x80) != 0) {
            this.bG((hchp1.p == null ? hcer.a : hchp1.p).b, 33, 0);
        }
        int v1 = ((hchp)this.bx).f.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.bG(((hcfj)((hchp)this.bx).f.get(v2)).d, 28, v2);
        }
        int v3 = ((hchp)this.bx).j.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            this.bG(((gexi)((hchp)this.bx).j.get(v4)).e, 25, v4);
        }
        int v5 = ((hchp)this.bx).k.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            this.bG(((gfgr)((hchp)this.bx).k.get(v6)).c, 0, v6);
        }
        int v7 = ((hchp)this.bx).g.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            gewg gewg0 = ((gewu)((hchp)this.bx).g.get(v8)).c;
            if(gewg0 == null) {
                gewg0 = gewg.a;
            }
            this.bG(gewg0.d, 6, v8);
        }
        hchp hchp2 = (hchp)this.bx;
        if((hchp2.b & 4) != 0) {
            this.bG((hchp2.e == null ? gfgo.a : hchp2.e).c, 11, 0);
        }
        this.bM(((hchp)this.bx).h, this.d, z);
        if(this.C() != null && this.cb != null) {
            ArrayList arrayList0 = this.bR;
            int v9 = arrayList0.size();
            for(int v = 0; v < v9; ++v) {
                Object object0 = ((gczs)arrayList0.get(v)).e;
                if((object0 instanceof gdak)) {
                    ((gdak)object0).cb = this.cb;
                }
            }
            this.bZ();
            gcjo.b(this, 1L, this.cb);
            gcjo.b(this, 2L, this.cb);
        }
        this.aP.v(3);
    }

    @Override  // fbzl
    public final void M() {
        super.M();
        boolean z = this.ca;
        AlertView alertView0 = this.ag;
        if(alertView0 != null) {
            alertView0.setEnabled(z);
        }
    }

    @Override  // fbzl
    protected final void Q(gesr gesr0) {
        throw new UnsupportedOperationException("Refreshes are not supported by Timeline view");
    }

    @Override  // fbzp
    protected final void R() {
        this.bT(null);
    }

    @Override  // fbzl
    public final void T(int v, Bundle bundle0) {
        super.T(v, bundle0);
        if(v == 16 && this.ah != null) {
            this.au();
            this.ah = null;
            this.b = null;
        }
    }

    @Override  // fbzp
    protected final void V() {
    }

    @Override  // fbzl
    public final void W(int v) {
        super.W(v);
        this.aJ.setVisibility(0);
        this.aP.D(true);
    }

    @Override  // fbzl
    protected final void Y() {
        throw new UnsupportedOperationException("Timeline view doesn\'t support auto submit.");
    }

    @Override  // fbzp
    protected final void Z(Object object0) {
        if((object0 instanceof hchn)) {
            this.cC(2);
            this.bx().b.B(((hchn)object0));
            this.ll(false);
            return;
        }
        if((object0 instanceof hchr)) {
            this.cC(3);
            this.bx().b.C(((hchr)object0), this.by.p);
            this.ll(false);
        }
    }

    @Override  // fbzp
    protected final boolean aa(PageDetails pageDetails0) {
        hchp hchp0 = (hchp)pageDetails0.i;
        if((hchp0.b & 16) != 0) {
            gexo gexo0 = hchp0.l == null ? gexo.a : hchp0.l;
            this.b = gexo0;
            gdek gdek0 = this.ah;
            if(gdek0 != null) {
                gdek0.ai = null;
                ca ca0 = new ca(this.getFragmentManager());
                ca0.o(this.ah);
                ca0.a();
            }
            gdek gdek1 = gdek.D(null, gexo0.e, this.bU);
            this.ah = gdek1;
            gdek1.ai = this;
            gdek1.ag = this;
            gdek1.show(this.getFragmentManager(), "tagDocumentDownloadDialog");
            this.av();
            return true;
        }
        this.cj(pageDetails0, 6);
        return false;
    }

    public final void ac(gete gete0, hcdu hcdu0, getf getf0, hchp hchp0, List list0, getj getj0, boolean z, String s) {
        this.cy(getj0, gete0);
        TimelineViewFragment.TimelineViewPageDetails timelineViewFragment$TimelineViewPageDetails0 = new TimelineViewFragment.TimelineViewPageDetails();
        timelineViewFragment$TimelineViewPageDetails0.i = hchp0;
        if(hchp0 != null && (hchp0.b & 0x100) != 0) {
            timelineViewFragment$TimelineViewPageDetails0.l = hchp0.q == null ? gfdq.a : hchp0.q;
        }
        timelineViewFragment$TimelineViewPageDetails0.f = list0;
        timelineViewFragment$TimelineViewPageDetails0.q = getj0;
        timelineViewFragment$TimelineViewPageDetails0.c = hcdu0;
        timelineViewFragment$TimelineViewPageDetails0.n = gete0;
        timelineViewFragment$TimelineViewPageDetails0.p = getf0;
        this.kZ(timelineViewFragment$TimelineViewPageDetails0, z, s);
    }

    final void ah() {
        this.ll(false);
        this.c = false;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hchn.a).v_newBuilder();
        gesx gesx0 = this.cs(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchn hchn0 = (hchn)hftp0.b_message;
        gesx0.getClass();
        hchn0.c = gesx0;
        hchn0.b |= 1;
        ByteString hfsf0 = ByteString.copyFrom(this.ak);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchn hchn1 = (hchn)hftp0.b_message;
        hchn1.b |= 2;
        hchn1.d = hfsf0;
        hchn hchn2 = (hchn)hftp0.N_build();
        this.cp(hchn2, 2);
        this.ce(new fbyo(this, hchn2));
    }

    @Override  // fbzp
    protected final hcdu ak(PageDetails pageDetails0) {
        return pageDetails0.i == null || (((hchp)pageDetails0.i).b & 16) == 0 ? super.ak(pageDetails0) : hcdu.l;
    }

    @Override  // fbzp
    protected final MessageLite al(long v) {
        int v1 = (int)(((Integer)this.bc.d(v)));
        switch(((int)(((Integer)this.bb.d(v))))) {
            case 0: {
                return (gfgr)((hchp)this.bx).k.get(v1);
            }
            case 6: {
                return (gewu)((hchp)this.bx).g.get(v1);
            }
            case 11: {
                MessageLite hfvm0 = ((hchp)this.bx).e;
                return hfvm0 == null ? gfgo.a : hfvm0;
            }
            case 25: {
                return (gexi)((hchp)this.bx).j.get(v1);
            }
            case 28: {
                return (hcfj)((hchp)this.bx).f.get(v1);
            }
            case 33: {
                MessageLite hfvm1 = ((hchp)this.bx).p;
                return hfvm1 == null ? hcer.a : hfvm1;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // fbzp
    protected final Object an(Object object0) {
        gfet gfet0 = this.C();
        if(gfet0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hchp)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((hchp)object0))));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hchp)hftp0.b_message).i = gfet0;
            ((hchp)hftp0.b_message).b |= 8;
            return (hchp)hftp0.N_build();
        }
        return (hchp)object0;
    }

    @Override  // fbzp
    protected final List ao() {
        Object object0 = this.bx;
        if(object0 != null && (((hchp)object0).b & 0x40) != 0) {
            gfhd gfhd0 = ((hchp)object0).o;
            if(gfhd0 == null) {
                gfhd0 = gfhd.a;
            }
            return gfhd0.b;
        }
        return null;
    }

    @Override  // gdeg
    public final void ar(gddz gddz0) {
        gdek gdek0 = this.ah;
        if(gdek0 != null) {
            gdek0.E(gddz0.e);
        }
    }

    @Override  // gdej
    public final void as() {
        if(this.b != null && (this.a != null && this.a.e != null)) {
            this.av();
        }
    }

    @Override  // gdeg
    public final void at() {
        gdek gdek0 = this.ah;
        if(gdek0 != null) {
            DownloadedDocument downloadedDocument0 = new DownloadedDocument("", "");
            this.a.e = downloadedDocument0;
            gdek0.E(downloadedDocument0);
        }
    }

    private final void au() {
        if(this.a != null) {
            gcio.e(this.getContext().getApplicationContext()).c(this.a);
            this.a = null;
        }
    }

    private final void av() {
        this.a = gcio.e(this.getContext().getApplicationContext()).a(this.bV, this.b.c, this.b.d, this, this.oc(), this.t());
    }

    @Override  // fbzp
    protected final long lf(Object object0) {
        return ((hchp)object0) == null ? 0L : ((hchp)object0).c;
    }

    @Override  // fbzp
    protected final List lj() {
        Object object0 = this.bx;
        if(object0 != null && (((hchp)object0).b & 0x20) != 0) {
            hcex hcex0 = ((hchp)object0).n;
            if(hcex0 == null) {
                hcex0 = hcex.a;
            }
            if(hcew.a(hcex0.c) == 3) {
                hcex hcex1 = ((hchp)this.bx).n;
                if(hcex1 == null) {
                    hcex1 = hcex.a;
                }
                return hcex1.b;
            }
        }
        return null;
    }

    @Override  // fbzp
    protected final void lm(Object object0) {
        for(Object object1: ((hchp)object0).m) {
            hcdx hcdx0 = (hcdx)object1;
            long v = hcdx0.b;
            hcej hcej0 = ((hchp)this.bx).r;
            if(hcej0 == null) {
                hcej0 = hcej.a;
            }
            if(v != hcej0.b) {
                throw new UnsupportedOperationException(String.format(Locale.US, "Can not handle partialUpdateData: %s", ((long)hcdx0.b)));
            }
            AlertView alertView0 = this.ag;
            hcej hcej1 = ((hchp)object0).r;
            if(hcej1 == null) {
                hcej1 = hcej.a;
            }
            alertView0.j(hcdx0, hcej1);
            if(hcej1 == null) {
                continue;
            }
            hchp hchp0 = (hchp)this.bx;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchp0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hchp0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hchp)hftp0.b_message).r = hcej1;
            ((hchp)hftp0.b_message).b |= 0x200;
            this.bx = hftp0.N_build();
            continue;
        }
    }

    @Override  // fbzp
    protected final void lz(hceu hceu0, byte[] arr_b) {
        hchq hchq0 = (hchq)this.bD(Bundle.EMPTY, null, null);
        if(hceu0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchq0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hchq0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hchq)hftp0.b_message).d = hceu0;
            ((hchq)hftp0.b_message).b |= 2;
            hchq0 = (hchq)hftp0.N_build();
        }
        if(arr_b != null && arr_b.length > 0) {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hchq0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hchq0));
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hchq hchq1 = (hchq)hftp1.b_message;
            hchq1.b |= 1;
            hchq1.c = hfsf0;
            hchq0 = (hchq)hftp1.N_build();
        }
        this.bT(hchq0);
    }

    @Override  // fbzp
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(intent0 != null && intent0.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", false)) {
            this.ah();
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // fbzl
    public final void onCreate(Bundle bundle0) {
        getj getj0;
        gete gete0;
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.ak = bundle1.getByteArray("parameters");
        getf getf0 = null;
        if(bundle0 == null) {
            if(this.aY) {
                this.aU = 1;
            }
            else if(bundle1.containsKey("initializeToken")) {
                this.aU = 1;
                hcho hcho0 = (hcho)gciq.a(bundle1, "initializeToken", ((Parser)((ProtoLiteMessage)hcho.a).jf(7, null)));
                TimelineViewFragment.TimelineViewPageDetails timelineViewFragment$TimelineViewPageDetails0 = new TimelineViewFragment.TimelineViewPageDetails();
                timelineViewFragment$TimelineViewPageDetails0.i = hcho0.f == null ? hchp.a : hcho0.f;
                hchp hchp0 = hcho0.f;
                if(((hchp0 == null ? hchp.a : hchp0).b & 0x100) != 0) {
                    if(hchp0 == null) {
                        hchp0 = hchp.a;
                    }
                    timelineViewFragment$TimelineViewPageDetails0.l = hchp0.q == null ? gfdq.a : hchp0.q;
                }
                timelineViewFragment$TimelineViewPageDetails0.f = hcho0.g;
                if((hcho0.b & 2) == 0) {
                    gete0 = null;
                }
                else {
                    gete0 = hcho0.d;
                    if(gete0 == null) {
                        gete0 = gete.c;
                    }
                }
                timelineViewFragment$TimelineViewPageDetails0.n = gete0;
                if((hcho0.b & 1) == 0) {
                    getj0 = null;
                }
                else {
                    getj0 = hcho0.c;
                    if(getj0 == null) {
                        getj0 = getj.a;
                    }
                }
                timelineViewFragment$TimelineViewPageDetails0.q = getj0;
                if((hcho0.b & 4) != 0) {
                    getf0 = hcho0.e;
                    if(getf0 == null) {
                        getf0 = getf.a;
                    }
                }
                timelineViewFragment$TimelineViewPageDetails0.p = getf0;
                this.bz = timelineViewFragment$TimelineViewPageDetails0;
            }
            else {
                this.c = true;
            }
            String s = this.aL;
            OrchestrationViewEvent.d(this.getContext(), s, this.aj);
            return;
        }
        this.c = bundle0.getBoolean("shouldMakeInitializeRequest", false);
        if(bundle0.containsKey("downloadDocument")) {
            this.b = (gexo)gciq.a(bundle0, "downloadDocument", ((Parser)((ProtoLiteMessage)gexo.a).jf(7, null)));
        }
    }

    @Override  // fbzp
    public final void onPause() {
        super.onPause();
        this.au();
    }

    @Override  // fbzp
    public final void onResume() {
        super.onResume();
        if(this.b != null && this.a == null) {
            this.av();
        }
    }

    @Override  // fbzl
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        gexo gexo0 = this.b;
        if(gexo0 != null) {
            gciq.j(bundle0, "downloadDocument", ((MessageLite)gexo0));
        }
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.aJ = layoutInflater0.inflate(0x7F0E0D48, viewGroup0, false);  // layout:wallet_fragment_timeline_view
        this.cg(((ProgressSpinnerView)this.aJ.findViewById(0x7F0B1D4C)));  // id:progress_spinner_container
        this.d = (LinearLayout)this.aJ.findViewById(0x7F0B0FCE);  // id:container
        if(this.c) {
            this.ah();
        }
        else if(this.aU == 1) {
            this.cx();
        }
        gdek gdek0 = (gdek)this.getFragmentManager().h("tagDocumentDownloadDialog");
        this.ah = gdek0;
        if(gdek0 != null) {
            gdek0.ai = this;
            gdek0.ag = this;
        }
        return this.aJ;
    }

    @Override  // fbzp
    protected final fbnw z() {
        return this.ai;
    }
}


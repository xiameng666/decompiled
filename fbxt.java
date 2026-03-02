import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardChimeraActivity;
import com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails;
import com.google.android.gms.wallet.setupwizard.WalletGlifLayout;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.PageDetails;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fbxt extends fbzl implements View.OnClickListener, gczn, gdbp, gdev {
    fbxm a;
    gafh ag;
    long ah;
    boolean ai;
    boolean aj;
    hcdd ak;
    int al;
    gahu am;
    fbxv an;
    WalletGlifLayout ao;
    final fbnw ap;
    etgl aq;
    private final gamj ar;
    private String as;
    private boolean at;
    private gcuh au;
    SelectorView b;
    TextView c;
    fcab d;

    public fbxt() {
        this.ar = new gamj(23);
        this.aj = false;
        this.ak = null;
        this.at = false;
        this.ap = new fbxr(this);
    }

    @Override  // fbzp
    protected final PageDetails A() {
        return new PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails();
    }

    @Override  // gami
    public final gamj B() {
        throw null;
    }

    @Override  // fbzp
    protected final gfet C() {
        return null;
    }

    @Override  // fbzp
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)hcdf.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Parser E() {
        return (Parser)((ProtoLiteMessage)hcdj.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Parser F() {
        return (Parser)((ProtoLiteMessage)hcdl.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Object G(Object object0) {
        hcdk hcdk0 = (hcdk)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdl.a).v_newBuilder();
        gesx gesx0 = this.cs(this.by.n.f.toByteArray());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdl hcdl0 = (hcdl)hftp0.b_message;
        gesx0.getClass();
        hcdl0.c = gesx0;
        hcdl0.b |= 1;
        if(hcdk0 == null) {
            hcdk0 = hcdk.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdl hcdl1 = (hcdl)hftp0.b_message;
        hcdk0.getClass();
        hcdl1.d = hcdk0;
        hcdl1.b |= 2;
        Object object1 = (hcdl)hftp0.N_build();
        this.bx().b.A(((hcdl)object1), this.by.p);
        return object1;
    }

    @Override  // fbzp
    protected final Object H(Bundle bundle0, byte[] arr_b, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdk.a).v_newBuilder();
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            geww geww0 = fcab0.ao(bundle0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdk hcdk0 = (hcdk)hftp0.b_message;
            geww0.getClass();
            hcdk0.c = geww0;
            hcdk0.b |= 1;
        }
        return (hcdk)hftp0.N_build();
    }

    @Override  // fbzl
    protected final List I() {
        return null;
    }

    @Override  // fbzp
    protected final void L(boolean z) {
        boolean z2;
        gfgr gfgr0;
        if(z) {
            this.aJ.setVisibility(4);
        }
        hcdj hcdj0 = (hcdj)this.bx;
        this.ba = (hcdj0.b & 4) == 0 ? null : hcdj0.f;
        gahu gahu0 = this.am;
        if((hcdj0.b & 8) == 0) {
            gfgr0 = null;
        }
        else {
            gfgr0 = hcdj0.g;
            if(gfgr0 == null) {
                gfgr0 = gfgr.a;
            }
        }
        fbxo.b(gahu0, gfgr0, this.cN());
        if((((hcdj)this.bx).b & 0x20) == 0) {
            this.a.setVisibility(8);
        }
        else {
            this.a.setVisibility(0);
            fbxm fbxm0 = this.a;
            gevs gevs0 = ((hcdj)this.bx).i;
            if(gevs0 == null) {
                gevs0 = gevs.a;
            }
            fbxm0.i(gevs0);
        }
        hcdj hcdj1 = (hcdj)this.bx;
        if(hcdj1.c == 11 && ((ByteString)hcdj1.d).size() > 0) {
            if(this.aq == null) {
                this.aq = new etgl(this.getContext().getApplicationContext());
            }
            etgl etgl0 = this.aq;
            hcdj hcdj2 = (hcdj)this.bx;
            byte[] arr_b = (hcdj2.c == 11 ? ((ByteString)hcdj2.d) : ByteString.b).toByteArray();
            azzc azzc0 = new azzc();
            azzc0.a = new etcs(arr_b);
            azzc0.d = 2140;
            etgl0.jn(azzc0.a());
        }
        ArrayList arrayList0 = this.bR;
        arrayList0.clear();
        ArrayList arrayList1 = this.bS;
        arrayList1.clear();
        gdew gdew0 = this.aP;
        gdew0.j();
        gdew0.x(false);
        this.b.removeAllViews();
        hcdj hcdj3 = (hcdj)this.bx;
        if((hcdj3.b & 1) != 0) {
            Context context0 = this.getContext();
            if((context0 instanceof PaymentsSetupWizardChimeraActivity)) {
                gfgo gfgo0 = hcdj3.e == null ? gfgo.a : hcdj3.e;
                ((PaymentsSetupWizardChimeraActivity)context0).ag(ImageWithCaptionView.j(gfgo0, ((PaymentsSetupWizardChimeraActivity)context0)));
                ((PaymentsSetupWizardChimeraActivity)context0).ah(gfgo0.k);
            }
        }
        hcdj hcdj4 = (hcdj)this.bx;
        if((hcdj4.b & 0x40) != 0) {
            if(this.d == null || z) {
                this.d = fcab.J((hcdj4.j == null ? gewu.a : hcdj4.j), this.bU, true, this.aL, false, this.cM(), null);
                ca ca0 = new ca(this.getChildFragmentManager());
                ca0.G(0x7F0B14C8, this.d);  // id:fragment_holder
                ca0.a();
            }
            gdew0.d(this.d);
            gdew0.v(3);
            gdew0.u(this);
        }
        else if(this.d != null) {
            ca ca1 = new ca(this.getChildFragmentManager());
            ca1.o(this.d);
            ca1.a();
            this.d = null;
        }
        hcdj hcdj5 = (hcdj)this.bx;
        boolean z1 = hcdj5.c == 11 && ((ByteString)hcdj5.d).size() > 0;
        this.at = z1;
        if(z1) {
        label_77:
            if(!this.at && ((hcdj)this.bx).h.size() > 0) {
                if(!this.aP() && z) {
                    this.ak = (hcdd)((hcdj)this.bx).h.get(0);
                }
                this.aL();
            }
            z2 = false;
        }
        else {
            hcdj hcdj6 = (hcdj)this.bx;
            if(hcdj6.c == 12 && ((hcde)hcdj6.d).c.size() > 0) {
                hcdj hcdj7 = (hcdj)this.bx;
                int v = (hcdj7.c == 12 ? ((hcde)hcdj7.d) : hcde.a).d;
                z2 = v < 0;
                if(!this.aP() && z && v >= 0) {
                    hcdj hcdj8 = (hcdj)this.bx;
                    this.ak = (hcdd)(hcdj8.c == 12 ? ((hcde)hcdj8.d) : hcde.a).c.get(v);
                }
                this.aL();
                goto label_82;
            }
            goto label_77;
        }
    label_82:
        fcab fcab0 = this.d;
        if(fcab0 != null) {
            arrayList0.add(new gczs(fcab0));
            arrayList1.add(this.d);
        }
        if(!this.at && !z2) {
            this.aj = true;
            this.ag.f(0);
            return;
        }
        this.aj = false;
        this.ag.f(8);
    }

    @Override  // fbzl
    protected final void M() {
        super.M();
        ArrayList arrayList0 = this.bR;
        boolean z = this.ca;
        int v = arrayList0.size();
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = ((gczs)arrayList0.get(v2)).e;
            if((object0 instanceof gdbw)) {
                ((gdbw)object0).ll(z);
            }
            else if((object0 instanceof View)) {
                ((View)object0).setEnabled(z);
            }
        }
        if(this.a != null) {
            if(hzrg.f()) {
                this.a.setVisibility((this.bx == null || (((hcdj)this.bx).b & 0x20) == 0 || !z ? 8 : 0));
            }
            this.a.setEnabled(z && this.la());
        }
        SelectorView selectorView0 = this.b;
        if(selectorView0 != null) {
            selectorView0.setEnabled(z);
        }
        if(this.ag != null) {
            if(hzrg.f()) {
                int v3 = this.b.getChildCount();
                gafh gafh0 = this.ag;
                if(1 != (!this.ai || !z || v3 != 0 && !this.aj ? 0 : 1)) {
                    v1 = 8;
                }
                gafh0.f(v1);
            }
            this.ag.c(z);
        }
    }

    @Override  // fbzl
    protected final void Q(gesr gesr0) {
        throw new UnsupportedOperationException("Refreshes are not supported by setupwizard");
    }

    @Override  // fbzp
    protected final void R() {
        this.bT(null);
    }

    @Override  // gczn
    public final CharSequence U() {
        return "";
    }

    @Override  // fbzp
    protected final void V() {
        boolean z = false;
        boolean z1 = hzsp.j() || gdcb.Q(this.getContext(), getd.c);
        if((hzsp.j() || gdcb.Q(this.getContext(), getd.d)) && gdcb.S(this.getContext())) {
            z = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView0 = (FocusedViewToTopScrollView)this.bz();
        if(focusedViewToTopScrollView0 != null) {
            focusedViewToTopScrollView0.r = z1;
            focusedViewToTopScrollView0.m(z);
        }
    }

    @Override  // fbzl
    public final void W(int v) {
        super.W(v);
        if(v == 1) {
            this.aJ.setVisibility(0);
        }
        WalletGlifLayout walletGlifLayout0 = this.ao;
        if(walletGlifLayout0 != null) {
            walletGlifLayout0.c();
        }
        this.aP.D(true);
    }

    @Override  // fbzl
    protected final void Y() {
        throw new UnsupportedOperationException("SetupWizard doesn\'t support auto submit.");
    }

    @Override  // fbzp
    protected final void Z(Object object0) {
        if((object0 instanceof hcdf)) {
            this.cC(2);
            this.bx().b.z(((hcdf)object0));
            this.ll(false);
            return;
        }
        if((object0 instanceof hcdl)) {
            this.cC(3);
            this.bx().b.A(((hcdl)object0), this.by.p);
            this.ll(false);
        }
    }

    public static fbxt aA(BuyFlowConfig buyFlowConfig0, String s, hcdi hcdi0, String s1, boolean z, int v, LogContext logContext0) {
        batl.r(s, "analyticsSessionId must be valid");
        fbxt fbxt0 = new fbxt();
        Bundle bundle0 = fbxt.cr(buyFlowConfig0, s, logContext0);
        gciq.j(bundle0, "initializeResponse", ((MessageLite)hcdi0));
        bundle0.putString("glifThemeStyle", s1);
        bundle0.putBoolean("showSkipButton", z);
        bundle0.putInt("initializeType", v);
        fbxt0.setArguments(bundle0);
        return fbxt0;
    }

    @Override  // fbzp
    public final void aD(int v, int v1) {
        if(v1 == 1000) {
            if(v != 3) {
                v1 = 1000;
                goto label_6;
            }
            this.cu(1, 6);
            return;
        }
    label_6:
        if(v == 2 && v1 == 3) {
            fbzu fbzu0 = WalletExitResult.b();
            fbzu0.c(1);
            fbzu0.d(404);
            fbzu0.a(3);
            this.bP(fbzu0.a);
            return;
        }
        super.aD(v, v1);
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        hcdd hcdd0 = (hcdd)object1;
        if(this.ak != ((hcdd)object0)) {
            this.ak = (hcdd)object0;
            if(this.aP()) {
                this.ll(false);
                this.au(this.oc(), this.ak.d.toByteArray(), this.as);
            }
        }
    }

    private static int aG(int v) {
        return v + 1;
    }

    private static int aH(hcdd hcdd0, List list0) {
        if(hcdd0 != null) {
            int v = list0.size();
            int v1 = 0;
            while(v1 < v) {
                if(!((ProtoLiteMessage)hcdd0).equals(list0.get(v1))) {
                    ++v1;
                    continue;
                }
                return v1;
            }
        }
        return -1;
    }

    private final void aL() {
        int v3;
        ibns ibns0;
        Drawable drawable0;
        hcdd hcdd0;
        boolean z;
        int v = ((hcdj)this.bx).h.size();
        hcdj hcdj0 = (hcdj)this.bx;
        if(hcdj0.c == 12 && ((hcde)hcdj0.d).c.size() > 0) {
            hcdj hcdj1 = (hcdj)this.bx;
            v = (hcdj1.c == 12 ? ((hcde)hcdj1.d) : hcde.a).c.size();
            z = true;
        }
        else {
            z = false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(z) {
                hcdj hcdj2 = (hcdj)this.bx;
                hcdd0 = (hcdd)(hcdj2.c == 12 ? ((hcde)hcdj2.d) : hcde.a).c.get(v1);
            }
            else {
                hcdd0 = (hcdd)((hcdj)this.bx).h.get(v1);
            }
            gcqy gcqy0 = this.bd;
            fcal fcal0 = new fcal(this.getContext());
            fcal0.c = gcqy0;
            fcal0.p = hcdd0;
            gftb.r(hcdd0.c.size() > 0, "There is no info message provided in creatable instrument.");
            gftb.r(hcdd0.c.size() <= 2, "There is more than 2 info messages provided in creatable instrument.");
            fcal0.setTag(hcdd0);
            int v2 = fcal0.c.a();
            fcal0.a.setId(v2);
            InfoMessageView infoMessageView0 = fcal0.b;
            infoMessageView0.setId(fcal0.c.a());
            fcal0.k.setId(fcal0.c.a());
            fcal0.a.e = false;
            gfgr gfgr0 = (gfgr)hcdd0.c.get(0);
            fcal0.a.q(gfgr0, false);
            if(hcdd0.c.size() == 2) {
                infoMessageView0.e = false;
                infoMessageView0.q(((gfgr)hcdd0.c.get(1)), false);
                infoMessageView0.setVisibility(0);
            }
            fcal0.q(((long)(v1 + 1)));
            gcuh gcuh0 = this.au;
            if(gcuh0 != null) {
                View view0 = fcal0.findViewById(0x7F0B1F99);  // id:selectable_item_container
                ibuq.f(view0, "view");
                if(v == 1) {
                    drawable0 = gcuh0.c(0x7F040C06);  // attr:sudItemBackgroundSingle
                }
                else if(v1 == 0) {
                    drawable0 = gcuh0.c(0x7F040C02);  // attr:sudItemBackgroundFirst
                }
                else {
                    drawable0 = v1 == v - 1 ? gcuh0.c(0x7F040C03) : gcuh0.c(0x7F040C00);  // attr:sudItemBackgroundLast
                }
                if((drawable0 instanceof GradientDrawable)) {
                    if(v == 1) {
                        ibns0 = new ibns(gcuh0.b(), gcuh0.b());
                    }
                    else if(v1 == 0) {
                        ibns0 = new ibns(gcuh0.b(), gcuh0.a());
                    }
                    else {
                        ibns0 = v1 == v - 1 ? new ibns(gcuh0.a(), gcuh0.b()) : new ibns(gcuh0.a(), gcuh0.a());
                    }
                    float f = ((Number)ibns0.a).floatValue();
                    float f1 = ((Number)ibns0.b).floatValue();
                    ((GradientDrawable)drawable0).setCornerRadii(new float[]{f, f, f, f, f1, f1, f1, f1});
                    TypedArray typedArray0 = gcuh0.a.getTheme().obtainStyledAttributes(gcue.a);
                    ibuq.e(typedArray0, "obtainStyledAttributes(...)");
                    Drawable drawable1 = typedArray0.getDrawable(1);
                    if(drawable1 == null) {
                        drawable1 = typedArray0.getDrawable(0);
                    }
                    typedArray0.recycle();
                    view0.setBackground(new LayerDrawable(new Drawable[]{drawable0, drawable1}));
                }
            }
            this.b.addView(fcal0);
        }
        if(z) {
            hcdd hcdd1 = this.ak;
            hcdj hcdj3 = (hcdj)this.bx;
            v3 = fbxt.aH(hcdd1, (hcdj3.c == 12 ? ((hcde)hcdj3.d) : hcde.a).c);
        }
        else {
            v3 = fbxt.aH(this.ak, ((hcdj)this.bx).h);
        }
        this.b.h(((long)(v3 + 1)));
    }

    private final void aM(hcfx hcfx0) {
        byte[] arr_b1;
        int v = hcfz.a(hcfx0.c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 9) {
            Locale locale0 = Locale.US;
            int v2 = hcfz.a(hcfx0.c);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "SetupWizard doesn\'t support this widget type yet: %d", ((int)(v1 - 1))));
        }
        int v3 = hcfx0.b;
        if((v3 & 4) == 0) {
            throw new IllegalArgumentException("SetupWizard WidgetReference doesn\'t have InitializeResponseToken nor O2ActionToken");
        }
        if((v3 & 8) != 0 && hcfw.a(hcfx0.f) == 3) {
            try {
                byte[] arr_b = hcfx0.e.toByteArray();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gflj.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                arr_b1 = ((gflj)hftv0).f.toByteArray();
            }
            catch(hfur unused_ex) {
                throw new IllegalArgumentException("InitializeResponseToken for API_VERSION_O2 isn\'t of type O1 ActionToken.");
            }
            Context context0 = this.requireContext();
            String s = this.as;
            Intent intent0 = fbae.h(context0, 0, this.aK, 0L);
            fbcn.g(intent0, arr_b1);
            gcuj.i(intent0, s);
            this.startActivityForResult(intent0, 2000);
            return;
        }
        this.au(this.oc(), hcfx0.e.toByteArray(), this.as);
    }

    private final boolean aP() {
        return ((hcdj)this.bx).h.size() > 0 && (((hcdj)this.bx).b & 0x20) == 0;
    }

    @Override  // gdev
    public final void ac() {
        gdcb.ai(this.getContext().getApplicationContext(), this.aJ);
        fbxm fbxm0 = this.a;
        if(fbxm0 != null && fbxm0.getVisibility() == 0) {
            this.an.b(fbxm0.b).requestFocus();
        }
    }

    public final void ah(gete gete0, hcdu hcdu0, getf getf0, hcdj hcdj0, List list0, getj getj0, boolean z, String s) {
        this.cy(getj0, gete0);
        this.ah = 0L;
        PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0 = new PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails();
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.i = hcdj0;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.f = list0;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.q = getj0;
        batl.s(hcdu0);
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.c = hcdu0;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.n = gete0;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.p = getf0;
        this.kZ(paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0, z, s);
    }

    // Detected as a lambda impl.
    final void aj(long v) {
        this.ll(false);
        ((Activity)this.requireContext()).setTitle(0x7F15355D);  // string:wallet_spinner_visible "Loading, please wait."
        new fbxu(this.getContext()).c();
        this.ah = v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdf.a).v_newBuilder();
        gesx gesx0 = this.cs(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdf hcdf0 = (hcdf)hftp0.b_message;
        gesx0.getClass();
        hcdf0.c = gesx0;
        hcdf0.b |= 1;
        long v1 = gcuk.a(this.requireContext().getApplicationContext());
        if(gcuk.c(v1)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcaq.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hbzl.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hbzl hbzl0 = (hbzl)hftp3.b_message;
            hbzl0.b |= 1;
            hbzl0.c = v1;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hcaq hcaq0 = (hcaq)hftp2.b_message;
            hbzl hbzl1 = (hbzl)hftp3.N_build();
            hbzl1.getClass();
            hcaq0.f = hbzl1;
            hcaq0.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcdc hcdc0 = (hcdc)hftp1.b_message;
            hcaq hcaq1 = (hcaq)hftp2.N_build();
            hcaq1.getClass();
            hcdc0.c = hcaq1;
            hcdc0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdf hcdf1 = (hcdf)hftp0.b_message;
            hcdc hcdc1 = (hcdc)hftp1.N_build();
            hcdc1.getClass();
            hcdf1.d = hcdc1;
            hcdf1.b |= 4;
        }
        if(v != 0x7FFFFFFFL) {
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hcdc hcdc2 = (hcdc)hftp4.b_message;
            hcdc2.b |= 2;
            hcdc2.d = v;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdf hcdf2 = (hcdf)hftp0.b_message;
            hcdc hcdc3 = (hcdc)hftp4.N_build();
            hcdc3.getClass();
            hcdf2.d = hcdc3;
            hcdf2.b |= 4;
        }
        hcdf hcdf3 = (hcdf)hftp0.N_build();
        this.cp(hcdf3, 2);
        this.cC(2);
        this.bx().b.z(hcdf3);
    }

    @Override  // fbzp
    protected final Object an(Object object0) {
        return (hcdj)object0;
    }

    @Override  // gdbp
    public final void ar(View view0) {
    }

    @Override  // gdbp
    public final void as(View view0) {
    }

    @Override  // gczn
    public final void at(CharSequence charSequence0) {
        if(TextUtils.isEmpty(charSequence0)) {
            this.c.setVisibility(8);
        }
        else {
            this.c.setVisibility(0);
            hcdj hcdj0 = (hcdj)this.bx;
            if(hcdj0.c == 12) {
                hcde hcde0 = (hcde)hcdj0.d;
                if((hcde0.b & 2) != 0) {
                    charSequence0 = hcde0.e;
                }
            }
            this.c.setText(charSequence0);
        }
        this.c.sendAccessibilityEvent(0x800);
    }

    final void au(Account account0, byte[] arr_b, String s) {
        if(bbmq.a(this.getContext().getApplicationContext(), "com.google.android.gms.wallet.im.SetupWizardImRootActivity") != 1) {
            bbmq.G(this.getContext().getApplicationContext(), "com.google.android.gms.wallet.im.SetupWizardImRootActivity", true);
        }
        fbjy fbjy0 = new fbjy();
        fbjy0.a = account0;
        fbjy0.b = arr_b;
        fbjy0.c = this.aK;
        fbjy0.d = s;
        hcdj hcdj0 = (hcdj)this.bx;
        if((hcdj0.b & 1) != 0) {
            fbjy0.e = (hcdj0.e == null ? gfgo.a : hcdj0.e).toBytesArray();
        }
        this.startActivityForResult(fbxo.a(this.getContext(), fbjy0.a()), 1000);
    }

    @Override  // gdbp
    public final void av() {
    }

    @Override  // gdbp
    public final boolean aw() {
        return true;
    }

    @Override  // fbzl
    public final void kZ(PageDetails pageDetails0, boolean z, String s) {
        hcdj hcdj0 = (hcdj)pageDetails0.i;
        if(z && hcdj0 != null && hcdj0.c != 10 && hcdj0.h.size() == 0 && (hcdj0.c != 12 || ((hcde)hcdj0.d).c.size() == 0) && (hcdj0.b & 0x40) == 0) {
            this.cu(1, 1);
        }
        super.kZ(pageDetails0, z, s);
    }

    @Override  // fbzp
    public final void onActivityResult(int v, int v1, Intent intent0) {
        batl.m(v != 1004, "WebViewComponent is not supported yet.");
        if(v == 1000) {
            this.ll(true);
            if(v1 == -1) {
                if(this.aP()) {
                    this.ag.f(8);
                    long v2 = intent0.getLongExtra("com.google.android.gms.wallet.f1InstrumentId", 0L);
                    if(v2 != 0L) {
                        this.aj(v2);
                        return;
                    }
                    this.bQ();
                    return;
                }
                this.bQ();
                return;
            }
            if(this.aP()) {
                this.b.h(0L);
                this.ak = null;
            }
            return;
        }
        if(v == 2000) {
            if(hzrg.a.d().m()) {
                hddw hddw0 = (hddw)gciq.b(intent0, "com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", ((Parser)((ProtoLiteMessage)hddw.a).jf(7, null)));
                if(hddw0 != null) {
                    switch((hddv.a(hddw0.b) == 0 ? 1 : hddv.a(hddw0.b)) - 1) {
                        case 1: {
                            this.bQ();
                            return;
                        }
                        case 2: {
                            this.aj(0x7FFFFFFFL);
                            return;
                        }
                        case 3: {
                            this.cu(101, 5);
                            return;
                        }
                        case 4: {
                            this.bO(-1);
                            return;
                        }
                    }
                }
            }
            if(v1 == -1) {
                this.bQ();
                return;
            }
            this.ll(true);
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        int v;
        fbxv fbxv0 = this.an;
        if(view0 == fbxv0.a) {
            v = 4;
        }
        else {
            v = view0 == fbxv0.b ? 7 : 0;
        }
        if(v == 4) {
            if(((hcdj)this.bx).h.size() <= 0) {
                hcdj hcdj0 = (hcdj)this.bx;
                if(hcdj0.c != 12 || ((hcde)hcdj0.d).c.size() <= 0) {
                    hcdj hcdj1 = (hcdj)this.bx;
                    if(hcdj1.c == 10) {
                        this.aM(((hcfx)hcdj1.d));
                        return;
                    }
                    if(this.at) {
                        this.bQ();
                        return;
                    }
                    List list0 = this.by.f;
                    if(list0 != null) {
                        int v1 = this.bk + 1;
                        if(list0.size() > v1) {
                            this.ck(v1);
                            return;
                        }
                    }
                    String s = this.aL;
                    OrchestrationViewEvent.a(this.getContext(), s, new gamj(0x655));
                    if(this.ld(null)) {
                        this.bT(((hcdk)this.bD(Bundle.EMPTY, null, null)));
                        return;
                    }
                }
                else {
                    goto label_27;
                }
            }
            else {
            label_27:
                if(this.b.nY()) {
                    hcdd hcdd0 = this.ak;
                    if(hcdd0 != null) {
                        if((hcdd0.b & 2) != 0) {
                            this.aM((hcdd0.e == null ? hcfx.a : hcdd0.e));
                            return;
                        }
                        this.au(this.oc(), this.ak.d.toByteArray(), this.as);
                    }
                }
            }
            return;
        }
        if(v != 7) {
            throw new IllegalArgumentException("Unexpected click event");
        }
        this.cu(101, 5);
    }

    @Override  // fbzl
    public final void onCreate(Bundle bundle0) {
        getj getj0;
        gete gete0;
        hcdu hcdu0;
        hcdj hcdj0;
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.as = bundle1.getString("glifThemeStyle");
        this.ai = bundle1.getBoolean("showSkipButton");
        int v = bundle1.getInt("initializeType");
        this.al = v;
        if(bundle0 == null) {
            this.aU = 1;
            switch(v) {
                case 1: {
                    if(bundle1.getByteArray("initializeResponse") != null) {
                        goto label_11;
                    }
                    break;
                }
                case 2: {
                label_11:
                    getf getf0 = null;
                    hcdi hcdi0 = (hcdi)gciq.a(bundle1, "initializeResponse", ((Parser)((ProtoLiteMessage)hcdi.a).jf(7, null)));
                    PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0 = new PaymentsSetupWizardFragment.AndroidSetupWizardPageDetails();
                    if((hcdi0.b & 16) == 0) {
                        hcdj0 = null;
                    }
                    else {
                        hcdj0 = hcdi0.g;
                        if(hcdj0 == null) {
                            hcdj0 = hcdj.a;
                        }
                    }
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.i = hcdj0;
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.f = hcdi0.h;
                    if((hcdi0.b & 0x20) == 0) {
                        hcdu0 = null;
                    }
                    else {
                        hcdu0 = hcdu.b(hcdi0.i);
                        if(hcdu0 == null) {
                            hcdu0 = hcdu.a;
                        }
                    }
                    batl.s(hcdu0);
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.c = hcdu0;
                    if((hcdi0.b & 2) == 0) {
                        gete0 = null;
                    }
                    else {
                        gete0 = hcdi0.d;
                        if(gete0 == null) {
                            gete0 = gete.c;
                        }
                    }
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.n = gete0;
                    if((1 & hcdi0.b) == 0) {
                        getj0 = null;
                    }
                    else {
                        getj0 = hcdi0.c;
                        if(getj0 == null) {
                            getj0 = getj.a;
                        }
                    }
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.q = getj0;
                    if((hcdi0.b & 4) != 0) {
                        getf0 = hcdi0.e;
                        if(getf0 == null) {
                            getf0 = getf.a;
                        }
                    }
                    paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0.p = getf0;
                    this.bz = paymentsSetupWizardFragment$AndroidSetupWizardPageDetails0;
                }
            }
            String s = this.aL;
            OrchestrationViewEvent.d(this.getContext(), s, this.ar);
            return;
        }
        this.ah = bundle0.getLong("initializeRequestInstrumentId", 0L);
        int v1 = bundle0.getInt("selectedCreatableInstrumentIndex", -1);
        if(v1 != -1) {
            hcdj hcdj1 = (hcdj)this.bx;
            if(hcdj1.c == 12 && ((hcde)hcdj1.d).c.size() > 0) {
                hcdj hcdj2 = (hcdj)this.bx;
                this.ak = (hcdd)(hcdj2.c == 12 ? ((hcde)hcdj2.d) : hcde.a).c.get(v1);
                return;
            }
            this.ak = (hcdd)((hcdj)this.bx).h.get(v1);
        }
    }

    @Override  // fbzl
    public final void onSaveInstanceState(Bundle bundle0) {
        int v;
        super.onSaveInstanceState(bundle0);
        bundle0.putLong("initializeRequestInstrumentId", this.ah);
        Object object0 = this.bx;
        if(object0 != null) {
            if(((hcdj)object0).c == 12 && ((hcde)((hcdj)object0).d).c.size() > 0) {
                hcdd hcdd0 = this.ak;
                hcdj hcdj0 = (hcdj)this.bx;
                v = fbxt.aH(hcdd0, (hcdj0.c == 12 ? ((hcde)hcdj0.d) : hcde.a).c);
            }
            else {
                v = fbxt.aH(this.ak, ((hcdj)this.bx).h);
            }
            bundle0.putInt("selectedCreatableInstrumentIndex", v);
        }
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.aJ = layoutInflater0.inflate(0x7F0E0D46, viewGroup0, false);  // layout:wallet_fragment_setupwizard
        this.cg(((fbgo)this.getContext()));
        this.d = (fcab)this.getChildFragmentManager().g(0x7F0B14C8);  // id:fragment_holder
        SelectorView selectorView0 = (SelectorView)this.aJ.findViewById(0x7F0B1018);  // id:creatable_list
        this.b = selectorView0;
        selectorView0.a.s(true);
        this.b.h = this.cM();
        this.b.c = this;
        this.b.e = this;
        this.b.f = this;
        this.c = (TextView)this.aJ.findViewById(0x7F0B1273);  // id:error
        WalletGlifLayout walletGlifLayout0 = (WalletGlifLayout)((Activity)this.getContext()).findViewById(0x7F0B2009);  // id:setup_wizard_layout
        this.ao = walletGlifLayout0;
        this.am = (gahu)walletGlifLayout0.t(gahu.class);
        this.an = (fbxv)this.ao.t(gaff.class);
        gafg gafg0 = new gafg(this.bV);
        gafg0.b(0x7F1508E0);  // string:common_skip "Skip"
        gafg0.b = this;
        gafg0.c = 7;
        gafg0.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
        gafh gafh0 = gafg0.a();
        this.ag = gafh0;
        this.an.d(gafh0);
        if(this.ai) {
            this.ag.f(0);
        }
        else {
            this.ag.f(8);
        }
        gafg gafg1 = new gafg(this.bV);
        gafg1.c = 4;
        gafg1.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafh gafh1 = gafg1.a();
        this.an.c(gafh1);
        fbxm fbxm0 = new fbxm(this, this.bV, gafh1, this.an);
        this.a = fbxm0;
        fbxm0.m(this.cM());
        this.a.setEnabled(this.la());
        this.a.setVisibility(8);
        this.an.k.f = this.a;
        this.an.c = this.a;
        if(this.aU != 1) {
            if(this.ah != 0L) {
                this.ce(() -> {
                    this.ll(false);
                    ((Activity)this.requireContext()).setTitle(0x7F15355D);  // string:wallet_spinner_visible "Loading, please wait."
                    new fbxu(this.getContext()).c();
                    this.ah = this.a.ah;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdf.a).v_newBuilder();
                    gesx gesx0 = this.cs(null);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcdf hcdf0 = (hcdf)hftp0.b_message;
                    gesx0.getClass();
                    hcdf0.c = gesx0;
                    hcdf0.b |= 1;
                    long v1 = gcuk.a(this.requireContext().getApplicationContext());
                    if(gcuk.c(v1)) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcaq.a).v_newBuilder();
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hbzl.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        hbzl hbzl0 = (hbzl)hftp3.b_message;
                        hbzl0.b |= 1;
                        hbzl0.c = v1;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hcaq hcaq0 = (hcaq)hftp2.b_message;
                        hbzl hbzl1 = (hbzl)hftp3.N_build();
                        hbzl1.getClass();
                        hcaq0.f = hbzl1;
                        hcaq0.b |= 2;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hcdc hcdc0 = (hcdc)hftp1.b_message;
                        hcaq hcaq1 = (hcaq)hftp2.N_build();
                        hcaq1.getClass();
                        hcdc0.c = hcaq1;
                        hcdc0.b |= 1;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hcdf hcdf1 = (hcdf)hftp0.b_message;
                        hcdc hcdc1 = (hcdc)hftp1.N_build();
                        hcdc1.getClass();
                        hcdf1.d = hcdc1;
                        hcdf1.b |= 4;
                    }
                    if(this.a.ah != 0x7FFFFFFFL) {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hcdc hcdc2 = (hcdc)hftp4.b_message;
                        hcdc2.b |= 2;
                        hcdc2.d = this.a.ah;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hcdf hcdf2 = (hcdf)hftp0.b_message;
                        hcdc hcdc3 = (hcdc)hftp4.N_build();
                        hcdc3.getClass();
                        hcdf2.d = hcdc3;
                        hcdf2.b |= 4;
                    }
                    hcdf hcdf3 = (hcdf)hftp0.N_build();
                    this.cp(hcdf3, 2);
                    this.cC(2);
                    this.bx().b.z(hcdf3);
                });
            }
        }
        else if(!(this.al == 1 ? this.bz != null : this.al != 3)) {
            this.ce(() -> {
                this.ll(false);
                ((Activity)this.requireContext()).setTitle(0x7F15355D);  // string:wallet_spinner_visible "Loading, please wait."
                new fbxu(this.getContext()).c();
                this.ah = 0x7FFFFFFFL;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdf.a).v_newBuilder();
                gesx gesx0 = this.cs(null);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hcdf hcdf0 = (hcdf)hftp0.b_message;
                gesx0.getClass();
                hcdf0.c = gesx0;
                hcdf0.b |= 1;
                long v1 = gcuk.a(this.requireContext().getApplicationContext());
                if(gcuk.c(v1)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcaq.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hbzl.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hbzl hbzl0 = (hbzl)hftp3.b_message;
                    hbzl0.b |= 1;
                    hbzl0.c = v1;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hcaq hcaq0 = (hcaq)hftp2.b_message;
                    hbzl hbzl1 = (hbzl)hftp3.N_build();
                    hbzl1.getClass();
                    hcaq0.f = hbzl1;
                    hcaq0.b |= 2;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hcdc hcdc0 = (hcdc)hftp1.b_message;
                    hcaq hcaq1 = (hcaq)hftp2.N_build();
                    hcaq1.getClass();
                    hcdc0.c = hcaq1;
                    hcdc0.b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcdf hcdf1 = (hcdf)hftp0.b_message;
                    hcdc hcdc1 = (hcdc)hftp1.N_build();
                    hcdc1.getClass();
                    hcdf1.d = hcdc1;
                    hcdf1.b |= 4;
                }
                if(0x7FFFFFFFL != 0x7FFFFFFFL) {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hcdc hcdc2 = (hcdc)hftp4.b_message;
                    hcdc2.b |= 2;
                    hcdc2.d = 0x7FFFFFFFL;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcdf hcdf2 = (hcdf)hftp0.b_message;
                    hcdc hcdc3 = (hcdc)hftp4.N_build();
                    hcdc3.getClass();
                    hcdf2.d = hcdc3;
                    hcdf2.b |= 4;
                }
                hcdf hcdf3 = (hcdf)hftp0.N_build();
                this.cp(hcdf3, 2);
                this.cC(2);
                this.bx().b.z(hcdf3);
            });
        }
        else {
            this.cx();
        }
        if(hzrg.a.d().r()) {
            this.au = new gcuh(this.bV);
        }
        return this.aJ;
    }

    @Override  // fbzp
    protected final fbnw z() {
        return this.ap;
    }
}


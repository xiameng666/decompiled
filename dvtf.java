import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.pass.common.barcode.BarcodeView;
import com.google.android.gms.pay.pass.common.template.barcode.BarcodeCardTemplate;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableInfo;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.internal.Preconditions;

public final class dvtf extends dokz implements doky, ednc, eflx, fshb {
    public static final bboh a;
    dxda ag;
    dsiu ah;
    dxcz ai;
    dspv aj;
    edrp ak;
    public edqf al;
    BarcodeView am;
    final gfsx an;
    azts ao;
    private BarcodeCardTemplate ap;
    private TextView aq;
    private gfsx ar;
    private gfsx as;
    private gfsx at;
    private Account au;
    private boolean av;
    private gfsx aw;
    fhwk b;
    fhvw c;
    dvfw d;

    static {
        dvtf.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvtf() {
        this.an = gfqx.a;
        this.ar = gfqx.a;
        this.as = gfqx.a;
        this.at = gfqx.a;
        this.av = true;
        this.aw = gfqx.a;
    }

    public final void A(gged_interceptors gged0, boolean z) {
        if(this.av) {
            gfsx gfsx0 = gfqx.a;
            int v = gged0.size();
            int v1 = 0;
            while(v1 < v) {
                ValuableGroup valuableGroup0 = (ValuableGroup)gged0.get(v1);
                if(this.as.i()) {
                    gfsx0 = valuableGroup0.b(((String)this.as.d()));
                }
                else if(this.at.i()) {
                    gfsx0 = valuableGroup0.c(((String)this.at.d()));
                }
                ++v1;
                if(gfsx0.i()) {
                    gfsx gfsx1 = gfsx.m(((Valuable)valuableGroup0.a.get(((Integer)gfsx0.d()).intValue())));
                    this.ar = gfsx1;
                    this.D(((Valuable)gfsx1.d()));
                    return;
                }
            }
            ((ggtj)dvtf.a.j()).R("No group found with matching ID. Valuable ID: %s; External Object ID: %s", this.as.f("<null>"), this.at.f("<null>"));
            if(!this.ar.i() && z) {
                this.y();
            }
        }
    }

    private final void B() {
        ((ggtj)dvtf.a.h()).x("Finishing the activity.");
        xob xob0 = this.an();
        if(xob0 != null) {
            xob0.setResult(0);
            this.ar();
        }
    }

    private final void D(Valuable valuable0) {
        gubi gubi3;
        Valuable valuable1;
        if(this.aw.i() && ((ValuableInfo)this.aw.d()).equals(valuable0)) {
            ((ggtj)dvtf.a.h()).x("Valuables are the same, skipping rendering new valuable.");
            this.ai.b(valuable0.b);
            return;
        }
        guvv guvv0 = valuable0.o;
        if(guvv0 != null) {
            if((guvv0.b & 2) == 0) {
            label_12:
                if((guvv0.b & 1) != 0) {
                    guut guut0 = guvv0.d == null ? guut.a : guvv0.d;
                    if((guuv.b(guut0.b) == null ? guuv.p : guuv.b(guut0.b)) != guuv.o && !guvv0.g || !(guvv0.d == null ? guut.a : guvv0.d).e.isEmpty() || !(guvv0.d == null ? guut.a : guvv0.d).c.isEmpty()) {
                        goto label_17;
                    }
                }
                else if(!guvv0.c.isEmpty()) {
                label_17:
                    BarcodeCardTemplate barcodeCardTemplate0 = this.ap;
                    gucl gucl0 = valuable0.q.e == null ? gucl.a : valuable0.q.e;
                    dspv dspv0 = this.aj;
                    Context context0 = barcodeCardTemplate0.getContext();
                    if(context0 == null) {
                        valuable1 = valuable0;
                    }
                    else {
                        if(barcodeCardTemplate0.a == null) {
                            hjie hjie0 = efky.c(context0, 0x7F060814);  // color:google_white
                            hjie hjie1 = efky.c(context0, 0x7F0607A8);  // color:google_grey900
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gubi.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            hjie0.getClass();
                            ((gubi)hftv0).d = hjie0;
                            ((gubi)hftv0).b |= 2;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp0.b_message;
                            hjie1.getClass();
                            ((gubi)hftv1).f = hjie1;
                            ((gubi)hftv1).b |= 8;
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gubi gubi0 = (gubi)hftp0.b_message;
                            hjie1.getClass();
                            gubi0.g = hjie1;
                            gubi0.b |= 16;
                            barcodeCardTemplate0.a = (gubi)hftp0.N_build();
                        }
                        if(barcodeCardTemplate0.b == null) {
                            hjie hjie2 = efky.c(context0, 0x7F0607A8);  // color:google_grey900
                            hjie hjie3 = efky.c(context0, 0x7F06079A);  // color:google_grey200
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gubi.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp1.b_message;
                            hjie2.getClass();
                            ((gubi)hftv2).d = hjie2;
                            ((gubi)hftv2).b |= 2;
                            if(!hftv2.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp1.b_message;
                            hjie3.getClass();
                            ((gubi)hftv3).f = hjie3;
                            ((gubi)hftv3).b |= 8;
                            if(!hftv3.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gubi gubi1 = (gubi)hftp1.b_message;
                            hjie3.getClass();
                            gubi1.g = hjie3;
                            gubi1.b |= 16;
                            barcodeCardTemplate0.b = (gubi)hftp1.N_build();
                        }
                        hjie hjie4 = efky.c(context0, 0x7F060814);  // color:google_white
                        hjie hjie5 = efky.c(context0, 0x7F0606BF);  // color:google_black
                        if(hwev.c()) {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gubi.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp2.b_message;
                            hjie4.getClass();
                            ((gubi)hftv4).d = hjie4;
                            ((gubi)hftv4).b |= 2;
                            if(!hftv4.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv5 = hftp2.b_message;
                            hjie5.getClass();
                            ((gubi)hftv5).f = hjie5;
                            ((gubi)hftv5).b |= 8;
                            if(!hftv5.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gubi gubi2 = (gubi)hftp2.b_message;
                            hjie5.getClass();
                            gubi2.g = hjie5;
                            gubi2.b |= 16;
                            gubi3 = (gubi)hftp2.N_build();
                        }
                        else {
                            gubi3 = fsce.a(barcodeCardTemplate0.getContext()) ? barcodeCardTemplate0.b : barcodeCardTemplate0.a;
                            batl.s(gubi3);
                        }
                        gfsx gfsx0 = (gucl0.b & 1) == 0 ? gfqx.a : gfsx.m((gucl0.c == null ? guag.a : gucl0.c));
                        gged_interceptors gged0 = ggna.a;
                        gfsx gfsx1 = (gucl0.b & 2) == 0 ? gfqx.a : gfsx.m((gucl0.e == null ? guck.a : gucl0.e));
                        valuable1 = valuable0;
                        barcodeCardTemplate0.s(gfsx0, gged0, gfsx1, gfqx.a, gubi3, valuable1, dspv0, false, gfqx.a);
                    }
                    dxda dxda0 = this.ag;
                    BarcodeView barcodeView0 = this.am;
                    TextView textView0 = this.aq;
                    barcodeView0.setVisibility(8);
                    textView0.setVisibility(8);
                    if((guvv0.b & 2) == 0) {
                    label_133:
                        if((guvv0.b & 1) == 0) {
                            if(!guvv0.c.isEmpty()) {
                                textView0.setText(guvv0.c);
                                textView0.setVisibility(0);
                            }
                        }
                        else if(!guvv0.g) {
                            barcodeView0.h(dxda0.b.a(valuable1), false);
                            barcodeView0.l(dxda.a(valuable1));
                            barcodeView0.setVisibility(0);
                        }
                        else if(!(guvv0.d == null ? guut.a : guvv0.d).c.isEmpty()) {
                            textView0.setText((guvv0.d == null ? guut.a : guvv0.d).c);
                            textView0.setVisibility(0);
                        }
                        else if(!(guvv0.d == null ? guut.a : guvv0.d).e.isEmpty()) {
                            textView0.setText((guvv0.d == null ? guut.a : guvv0.d).e);
                            textView0.setVisibility(0);
                        }
                    }
                    else {
                        guwa guwa2 = guvv0.e == null ? guwa.a : guvv0.e;
                        if((guuv.b(guwa2.d) == null ? guuv.p : guuv.b(guwa2.d)) == guuv.a) {
                            goto label_133;
                        }
                        else {
                            guwa guwa3 = guvv0.e == null ? guwa.a : guvv0.e;
                            if((guuv.b(guwa3.d) == null ? guuv.p : guuv.b(guwa3.d)) != guuv.o && !guvv0.g) {
                                barcodeView0.k(valuable1, dxda0.b.b(valuable1), false);
                                barcodeView0.l(dxda.a(valuable1));
                                barcodeView0.setVisibility(0);
                            }
                            else if(!(guvv0.d == null ? guut.a : guvv0.d).c.isEmpty()) {
                                textView0.setText((guvv0.d == null ? guut.a : guvv0.d).c);
                                textView0.setVisibility(0);
                            }
                            else if(!(guvv0.d == null ? guut.a : guvv0.d).e.isEmpty()) {
                                textView0.setText((guvv0.d == null ? guut.a : guvv0.d).e);
                                textView0.setVisibility(0);
                            }
                        }
                    }
                    if(valuable1.z() && (!dxda0.c.m() || dxda0.a.a() != 3) && barcodeView0.getVisibility() == 8) {
                        textView0.getVisibility();
                    }
                    this.ah.b();
                    this.am.setClickable(false);
                    if(gfta.c(this.am.a())) {
                        this.am.setLongClickable(false);
                    }
                    else {
                        this.am.setOnLongClickListener(new dvte(this));
                    }
                    if(this.ak.b) {
                        Context context1 = this.getContext();
                        if(context1 != null && new edot(context1).a() == 3 && valuable1.F && valuable1.z()) {
                            BarcodeView barcodeView1 = this.am;
                            if(!barcodeView1.x) {
                                Context context2 = barcodeView1.getContext();
                                if(context2 != null) {
                                    dsik dsik0 = new dsik("nfc_education_bulletin");
                                    barcodeView1.g.c(context2, dsik0, new dsgz(barcodeView1, context2, valuable1, dsik0));
                                }
                            }
                            BarcodeView barcodeView2 = this.am;
                            Context context3 = barcodeView2.getContext();
                            if(context3 != null && !barcodeView2.x) {
                                TextView textView1 = barcodeView2.t;
                                textView1.setVisibility(0);
                                Spanned spanned0 = barcodeView2.w;
                                Annotation[] arr_annotation = (Annotation[])spanned0.getSpans(0, spanned0.length(), Annotation.class);
                                if(arr_annotation.length > 0) {
                                    boolean z = hwev.c();
                                    Annotation annotation0 = arr_annotation[0];
                                    dshi dshi0 = new dshi(barcodeView2, context3, z);
                                    SpannableString spannableString0 = new SpannableString(spanned0);
                                    spannableString0.setSpan(dshi0, spanned0.getSpanStart(annotation0), spanned0.getSpanEnd(annotation0), spanned0.getSpanFlags(dshi0));
                                    textView1.setText(spannableString0);
                                    textView1.setMovementMethod(LinkMovementMethod.getInstance());
                                }
                            }
                        }
                    }
                    this.aw = gfsx.m(valuable1);
                    this.ai.b(valuable1.b);
                    return;
                }
            }
            else {
                guwa guwa0 = guvv0.e == null ? guwa.a : guvv0.e;
                if((guuv.b(guwa0.d) == null ? guuv.p : guuv.b(guwa0.d)) == guuv.a) {
                    goto label_12;
                }
                else {
                    guwa guwa1 = guvv0.e == null ? guwa.a : guvv0.e;
                    if((guuv.b(guwa1.d) == null ? guuv.p : guuv.b(guwa1.d)) != guuv.o && !guvv0.g || !(guvv0.d == null ? guut.a : guvv0.d).e.isEmpty()) {
                        goto label_17;
                    }
                }
            }
        }
        xob xob0 = this.an();
        if(xob0 != null) {
            xob0.startActivity(dlnf.be(xob0, valuable0.b, dlnd.d));
            this.B();
        }
    }

    @Override  // ednc
    public final boolean F() {
        return hwfk.a.b().C();
    }

    @Override  // doky
    public final boolean G() {
        this.ai.a();
        return false;
    }

    @Override  // eflx
    public final void g(int v, int v1, Parcelable parcelable0) {
        if(v1 != 1000) {
            ((ggtj)dvtf.a.i()).z("Received unexpected request code: %d", v1);
            return;
        }
        this.B();
    }

    @Override  // dokz
    public final void jO() {
        this.ai.a();
    }

    @Override  // fshb
    public final int kd() {
        return 2;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.au = this.ap().a();
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dxed dxed0 = dxee.a(doly0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dvqi dvqi0 = new dvqi(dolg0, dxed0, new done(), doly0, domv0, new edop());
        this.an.f(dvqi0);
        dvqi0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.onCreate(bundle0);
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E0DE0 : 0x7F0E0DE1), viewGroup0, false);  // layout:wallet_valuable_barcode_fragment
        this.b.a(view0, 206901);
        BarcodeView barcodeView0 = (BarcodeView)view0.findViewById(0x7F0B00C8);  // id:BarcodeLayout
        this.am = barcodeView0;
        barcodeView0.d(this);
        this.aq = (TextView)view0.findViewById(0x7F0B0593);  // id:MemberId
        BarcodeCardTemplate barcodeCardTemplate0 = (BarcodeCardTemplate)view0.findViewById(0x7F0B00C1);  // id:BarcodeCardTemplate
        this.ap = barcodeCardTemplate0;
        barcodeCardTemplate0.k(this);
        ((MaterialToolbar)view0.findViewById(0x7F0B08D8)).x(new dvsz(this));  // id:Toolbar
        this.ap.i(null);
        this.av = true;
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        this.av = false;
        super.onDestroyView();
    }

    @Override  // du
    public final void onPause() {
        if(this.aw()) {
            this.ai.a();
        }
        else {
            this.ai.c();
        }
        super.onPause();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        xob xob0 = this.an();
        if(xob0 != null) {
            xob0.getWindow().setFlags(0x2000, 0x2000);
        }
        if(!this.ar.i()) {
            Bundle bundle0 = this.getArguments();
            if(bundle0 == null) {
                ((ggtj)dvtf.a.i()).x("No arguments for valuable barcode fragment.");
            }
            else {
                this.ar = gfsx.l(((Valuable)bundle0.getParcelable("VALUABLE")));
                this.as = gfsx.l(bundle0.getString("VALUABLE_ID"));
                this.at = gfsx.l(bundle0.getString("VALUABLE_EXT_OBJECT_ID"));
                if(this.ar.i()) {
                    Valuable valuable0 = (Valuable)this.ar.d();
                    this.D(((Valuable)this.ar.d()));
                    return;
                }
                this.as.f("<null>");
                this.at.f("<null>");
                if(!this.as.i() && !this.at.i()) {
                    ((ggtj)dvtf.a.i()).x("No valuable present in intent, and no ID present to fetch valuable.");
                }
                else {
                    xob xob1 = this.an();
                    if(xob1 != null) {
                        azts azts0 = this.ao;
                        PassFilter passFilter0 = new PassFilter();
                        if(this.as.i()) {
                            passFilter0.c = dsih.a(new String[]{((String)this.as.d())});
                        }
                        if(this.at.i()) {
                            passFilter0.d = new String[]{((String)this.at.d())};
                        }
                        GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
                        getValuablesRequest0.a = this.au;
                        getValuablesRequest0.b = passFilter0;
                        evql evql0 = azts0.aR(getValuablesRequest0);
                        evql0.x(xob1, new dvta(this));
                        evql0.u(xob1, new dvtb());
                        evql evql1 = this.ao.aS(this.au);
                        evql1.x(xob1, new dvtc(this));
                        evql1.u(xob1, new dvtd(this));
                        return;
                    }
                }
            }
            this.y();
            return;
        }
        this.D(((Valuable)this.ar.d()));
        this.am.g();
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        this.d.a("VALUABLE_BARCODE", this.ap().d());
    }

    public final void y() {
        ((ggtj)dvtf.a.h()).x("Showing error dialog.");
        fm fm0 = this.getFragmentManager();
        if(fm0 == null) {
            return;
        }
        eflw eflw0 = new eflw();
        eflw0.b = this.getString(0x7F15233B);  // string:pay_valuable_not_found_title "Unable to load this pass"
        eflw0.c = this.getString(0x7F15233A);  // string:pay_valuable_not_found_message "It might have been deleted, or changes may 
                                               // have been made by the issuer"
        eflw0.d = this.getString(0x7F1508A8);  // string:common_ok "OK"
        eflw0.a = 1000;
        eflz eflz0 = eflw0.a();
        eflz0.setTargetFragment(this, 1000);
        eflz0.I(fm0, "pay_error_dialog");
    }
}


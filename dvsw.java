import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dagger.internal.Preconditions;

public final class dvsw extends dokz implements doky {
    public static final bboh a;
    dvfu ag;
    fhwk ah;
    fhxi ai;
    fhvw aj;
    final gfsx ak;
    azts al;
    private gfsx am;
    private MaterialToolbar an;
    private ComposeViewHeader ao;
    private ImageView ap;
    private TextView aq;
    private TextView ar;
    private ComposeActionBar as;
    private Button at;
    private TextInputEditText au;
    private TextInputLayout av;
    private gfsx aw;
    private Account ax;
    private String ay;
    dspe b;
    dsor c;
    dvgv d;

    static {
        dvsw.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvsw() {
        this.am = gfqx.a;
        this.ak = gfqx.a;
    }

    public final void A(boolean z) {
        if(hwev.c()) {
            ComposeActionBar composeActionBar0 = this.as;
            if(composeActionBar0 != null) {
                ftuw ftuw0 = composeActionBar0.b();
                ftts ftts0 = ftuw0.a;
                if(ftts0 != null) {
                    ftux ftux0 = new ftux(ftts0);
                    ftux0.h(z);
                    ftts ftts1 = ftux0.a();
                    ComposeActionBar composeActionBar1 = this.as;
                    ftuy ftuy0 = new ftuy(ftuw0);
                    ftuy0.h(ftts1);
                    composeActionBar1.d(ftuy0.a());
                }
            }
        }
        else {
            Button button0 = this.at;
            if(button0 != null) {
                button0.setEnabled(z);
            }
        }
    }

    public final boolean B() {
        return ((Valuable)this.am.d()).q().booleanValue();
    }

    private final void D() {
        xob xob0 = this.an();
        if(xob0 == null) {
            return;
        }
        xob0.setResult(0);
        this.ar();
    }

    private final void E() {
        if(this.av != null && this.au != null) {
            if(this.B()) {
                this.au.setText(((CharSequence)((Valuable)this.am.d()).g().d()));
                this.A(true);
            }
            else {
                this.A(false);
            }
            this.au.addTextChangedListener(new dvsu(this));
            this.av.setVisibility(0);
            return;
        }
        this.D();
    }

    private static final gfsx F(Context context0, gukv gukv0, gfsx gfsx0) {
        if(!bbqr.d(gukv0.d)) {
            String s = efmo.c(new String[]{gukv0.d});
            if(!bbqr.d(s)) {
                efmj efmj0 = new efmj(context0.getResources(), s);
                int v = context0.getResources().getDimensionPixelSize(0x7F070E3F);  // dimen:pay_wallet_header_logo_size
                Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                efmj0.setBounds(0, 0, v, v);
                efmj0.draw(canvas0);
                frxu frxu0 = new frxu(bitmap0);
                fryv fryv0 = (fryv)gfsx0.g();
                frxp frxp0 = new frxp(0);
                return gfsx.m(new fugt(frxu0, fryv0, null, fugw.c, frxp0));
            }
        }
        return gfqx.a;
    }

    // Detected as a lambda impl.
    @Override  // doky
    public final boolean G() {
        xob xob0 = this.an();
        if(xob0 != null) {
            xob0.setResult(-1);
        }
        this.ar();
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.ax = this.ap().a();
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dxed dxed0 = dxee.a(doly0);
        done done0 = new done();
        edop edop0 = new edop();
        domv domv0 = domu.a(context0);
        Preconditions.b(domv0);
        dvqg dvqg0 = new dvqg(dolg0, dxed0, done0, edop0, domv0);
        this.ak.f(dvqg0);
        dvqg0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfsx gfsx2;
        gfsx gfsx1;
        gfsx gfsx0;
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null && !bundle1.isEmpty()) {
            ClassLoader classLoader0 = Valuable.class.getClassLoader();
            if(classLoader0 == null) {
                gfsx0 = gfqx.a;
            }
            else {
                bundle1.setClassLoader(classLoader0);
                gfsx0 = gfsx.l((Build.VERSION.SDK_INT >= 33 ? ((Valuable)bundle1.getParcelable("VALUABLE", Valuable.class)) : ((Valuable)bundle1.getParcelable("VALUABLE"))));
            }
            this.am = gfsx0;
            if(gfsx0.i()) {
                this.ay = bundle1.getString("VALUABLE_TITLE");
            }
            else {
                ((ggtj)dvsw.a.i()).x("No valuable argument for UpdateNicknameFragment");
                this.D();
            }
        }
        else {
            ((ggtj)dvsw.a.i()).x("No arguments for UpdateNicknameFragment");
            this.D();
        }
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E0DF9 : 0x7F0E0DFA), viewGroup0, false);  // layout:wallet_valuable_update_nickname_fragment
        if(this.am.i()) {
            gucv gucv0 = ((Valuable)this.am.d()).q.j;
            if(gucv0 == null) {
                gucv0 = gucv.a;
            }
            for(Object object0: gucv0.c) {
                gucn gucn0 = (gucn)object0;
                if(gucn0.b != 1) {
                    continue;
                }
                gfsx1 = gfsx.m(((gucl)gucn0.c));
                goto label_30;
            }
            gfsx1 = gfqx.a;
        label_30:
            this.aw = gfsx1;
            if(!gfsx1.i()) {
                ((ggtj)dvsw.a.i()).x("CardTemplateInfo is not present for UpdateNicknameFragment");
                this.D();
                return view0;
            }
            this.an = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            if(hwev.c()) {
                this.ao = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
            }
            else {
                this.ap = (ImageView)view0.findViewById(0x7F0B04E1);  // id:IssuerLogo
                this.aq = (TextView)view0.findViewById(0x7F0B0962);  // id:UpdateNicknameTitle
                this.ar = (TextView)view0.findViewById(0x7F0B0961);  // id:UpdateNicknameSubtitle
            }
            this.av = (TextInputLayout)view0.findViewById(0x7F0B095F);  // id:UpdateNicknameInputLayout
            this.au = (TextInputEditText)view0.findViewById(0x7F0B0960);  // id:UpdateNicknameInputText
            if(hwev.c()) {
                this.as = (ComposeActionBar)view0.findViewById(0x7F0B074A);  // id:SaveActionBar
            }
            else {
                this.at = (Button)view0.findViewById(0x7F0B074D);  // id:SaveButton
            }
            MaterialToolbar materialToolbar0 = this.an;
            if(materialToolbar0 == null) {
                this.D();
            }
            else {
                materialToolbar0.t(0x7F151C03);  // string:pay_back "Back"
                this.an.x((/* MISSING LAMBDA PARAMETER */) -> {
                    xob xob0 = this.an();
                    if(xob0 != null) {
                        xob0.setResult(-1);
                    }
                    this.ar();
                    return true;
                });
                this.an.setVisibility(0);
            }
            int v = 0x7F1522EF;  // string:pay_update_valuable_add_nickname "Add a nickname"
            if(!hwev.c()) {
                if(this.ap == null) {
                    this.D();
                }
                else {
                    guag guag1 = ((gucl)this.aw.d()).c;
                    if(guag1 == null) {
                        guag1 = guag.a;
                    }
                    gukv gukv1 = guag1.c == null ? gukv.a : guag1.c;
                    if((gukv1.b & 1) != 0) {
                        dsoy dsoy0 = this.b.b(new fsda(this.ap), gukv1);
                        dsoy0.i = false;
                        this.b.d(dsoy0);
                        this.ap.setVisibility(0);
                    }
                }
                TextView textView0 = this.aq;
                if(textView0 != null && this.ar != null) {
                    if(this.B()) {
                        v = 0x7F1522F0;  // string:pay_update_valuable_edit_nickname "Edit nickname"
                    }
                    textView0.setText(this.getString(v));
                    this.ar.setText((this.ay == null || bbqr.d(this.ay) ? this.getString(0x7F1522F2) : this.getString(0x7F1522F3, new Object[]{this.ay})));  // string:pay_update_valuable_nickname_subtitle_no_issuer_name "Make it easier to identify 
                                                                                                                                                             // your pass on the Wallet home screen"
                    this.aq.setVisibility(0);
                    this.ar.setVisibility(0);
                }
                else {
                    this.D();
                }
            }
            else if(this.ao == null) {
                this.D();
            }
            else {
                if(this.B()) {
                    v = 0x7F1522F0;  // string:pay_update_valuable_edit_nickname "Edit nickname"
                }
                fryu fryu0 = new fryu(this.getString(v));
                fryu fryu1 = new fryu((this.ay == null || bbqr.d(this.ay) ? this.getString(0x7F1522F2) : this.getString(0x7F1522F3, new Object[]{this.ay})));  // string:pay_update_valuable_nickname_subtitle_no_issuer_name "Make it easier to identify 
                                                                                                                                                               // your pass on the Wallet home screen"
                ComposeViewHeader composeViewHeader0 = this.ao;
                Context context0 = this.getContext();
                if(context0 == null) {
                    gfsx2 = gfqx.a;
                }
                else {
                    guag guag0 = ((gucl)this.aw.d()).c;
                    if(guag0 == null) {
                        guag0 = guag.a;
                    }
                    gukv gukv0 = guag0.c == null ? gukv.a : guag0.c;
                    if((1 & gukv0.b) == 0) {
                        gfsx gfsx4 = bbqr.d(gukv0.e) ? gfqx.a : gfsx.m(new fryu(gukv0.e));
                        gfsx2 = dvsw.F(context0, gukv0, gfsx4);
                    }
                    else {
                        guez guez0 = gukv0.f == null ? guez.a : gukv0.f;
                        gfsx gfsx3 = bbqr.d(guez0.e) ? gfqx.a : gfsx.m(new fryu(guez0.e));
                        dsop dsop0 = this.c.a(guez0, context0, new dsoo());
                        fryk fryk0 = dsop0.a;
                        if(fryk0 == new fryh(0)) {
                            gfsx2 = dvsw.F(context0, gukv0, gfsx3);
                        }
                        else {
                            fryv fryv0 = (fryv)gfsx3.g();
                            frxp frxp0 = new frxp(-1);
                            gfsx2 = gfsx.m(new fugt(fryk0, fryv0, dsop0.b, fugw.c, frxp0));
                        }
                    }
                }
                composeViewHeader0.b(new fuhm(((fugv)gfsx2.g()), fryu0, fryu1));
                this.ao.setVisibility(0);
            }
            if(hwev.c()) {
                if(this.as == null) {
                    this.D();
                }
                else {
                    ftux ftux0 = ftts.a(new fryr(0x7F151C1C), new dvsv(this));  // string:pay_button_save "Save"
                    ftux0.f(0x409FD);
                    ftts ftts0 = ftux0.a();
                    ComposeActionBar composeActionBar0 = this.as;
                    ftuy ftuy0 = new ftuy();
                    ftuy0.h(ftts0);
                    composeActionBar0.d(ftuy0.a());
                    this.as.e(new fufz(this.ai, this.aj));
                    this.as.setVisibility(0);
                }
                this.E();
            }
            else {
                this.E();
                Button button0 = this.at;
                if(button0 == null) {
                    this.D();
                }
                else {
                    button0.setVisibility(0);
                    this.at.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                        if(this.au != null && this.au.getText() != null) {
                            String s = String.valueOf(this.au.getText()).replace('\n', ' ');
                            if(!this.am.i()) {
                                return;
                            }
                            Valuable valuable0 = (Valuable)this.am.d();
                            azts azts0 = this.al;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjq.a).v_newBuilder();
                            String s1 = this.ax.name;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ftjq ftjq0 = (ftjq)hftp0.b_message;
                            s1.getClass();
                            ftjq0.d = s1;
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftdl.a).v_newBuilder();
                            String s2 = valuable0.b;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            s2.getClass();
                            ((ftdl)hftv0).b = s2;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ftdl ftdl0 = (ftdl)hftp1.b_message;
                            s.getClass();
                            ftdl0.c = s;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ftjq ftjq1 = (ftjq)hftp0.b_message;
                            ftdl ftdl1 = (ftdl)hftp1.N_build();
                            ftdl1.getClass();
                            ftjq1.c = ftdl1;
                            ftjq1.b = 15;
                            evql evql0 = azts0.bf(((ftjq)hftp0.N_build()).toBytesArray());
                            evql0.b(new dvsq(this));
                            evql0.A((Exception exception0) -> {
                                a.ae(dvsw.a.i(), "Failed to update valuable nickname.", exception0);
                                Toast.makeText(this.requireContext(), 0x7F1522F4, 1).show();  // string:pay_update_valuable_nickname_toast_error "Could not save nickname"
                            });
                            if(s.isEmpty()) {
                                this.ag.h(36, valuable0.R);
                                return;
                            }
                            this.ag.h((valuable0.q().booleanValue() ? 35 : 34), valuable0.R);
                            return;
                        }
                        this.y(new Exception("Nickname input text is null"));
                        this.D();
                    });
                    if(hwfk.aF()) {
                        this.ah.f(this.at, this.ah.a.a(0x409FD));
                    }
                }
            }
            if(hwfk.aF()) {
                this.ah.f(view0, this.ah.a.a(0x409FC));
            }
            return view0;
        }
        ((ggtj)dvsw.a.i()).x("Valuable does not exist for UpdateNicknameFragment");
        this.D();
        return view0;
    }

    // Detected as a lambda impl.
    public final void y(Exception exception0) {
        a.ae(dvsw.a.i(), "Failed to update valuable nickname.", exception0);
        Toast.makeText(this.requireContext(), 0x7F1522F4, 1).show();  // string:pay_update_valuable_nickname_toast_error "Could not save nickname"
    }

    // Detected as a lambda impl.
    public final void z() {
        if(this.au != null && this.au.getText() != null) {
            String s = String.valueOf(this.au.getText()).replace('\n', ' ');
            if(!this.am.i()) {
                return;
            }
            Valuable valuable0 = (Valuable)this.am.d();
            azts azts0 = this.al;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjq.a).v_newBuilder();
            String s1 = this.ax.name;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftjq ftjq0 = (ftjq)hftp0.b_message;
            s1.getClass();
            ftjq0.d = s1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftdl.a).v_newBuilder();
            String s2 = valuable0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s2.getClass();
            ((ftdl)hftv0).b = s2;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ftdl ftdl0 = (ftdl)hftp1.b_message;
            s.getClass();
            ftdl0.c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftjq ftjq1 = (ftjq)hftp0.b_message;
            ftdl ftdl1 = (ftdl)hftp1.N_build();
            ftdl1.getClass();
            ftjq1.c = ftdl1;
            ftjq1.b = 15;
            evql evql0 = azts0.bf(((ftjq)hftp0.N_build()).toBytesArray());
            evql0.b(new dvsq(this));
            evql0.A((Exception exception0) -> {
                a.ae(dvsw.a.i(), "Failed to update valuable nickname.", exception0);
                Toast.makeText(this.requireContext(), 0x7F1522F4, 1).show();  // string:pay_update_valuable_nickname_toast_error "Could not save nickname"
            });
            if(s.isEmpty()) {
                this.ag.h(36, valuable0.R);
                return;
            }
            this.ag.h((valuable0.q().booleanValue() ? 35 : 34), valuable0.R);
            return;
        }
        this.y(new Exception("Nickname input text is null"));
        this.D();
    }
}


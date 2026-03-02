import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.SetWalletItemSurfacingEnabledRequest;
import com.google.android.gms.pay.pass.valuable.view.detail.template.ValuableDetailTemplate;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;

public final class dvts extends dokz implements dskk, fshg, fshi {
    public static final bboh a;
    private boolean aA;
    private FrameLayout aB;
    private View aC;
    private boolean aD;
    private boolean aE;
    efma ag;
    edse ah;
    dmgi ai;
    dvfu aj;
    edoq ak;
    dvlr al;
    public gfsx am;
    public gfsx an;
    ValuableDetailTemplate ao;
    public ImageView ap;
    final gfsx aq;
    azts ar;
    private gucj as;
    private gubi at;
    private boolean au;
    private RelativeLayout av;
    private Button aw;
    private FrameLayout ax;
    private View ay;
    private View az;
    Account b;
    fshk c;
    edon d;

    static {
        dvts.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvts() {
        this.am = gfqx.a;
        this.an = gfqx.a;
        this.aA = false;
        this.aD = false;
        this.aE = false;
        this.aq = gfqx.a;
    }

    @Override  // dskk
    public final void I() {
    }

    @Override  // dskk
    public final void J(View view0, gtzk gtzk0) {
        dskj.n(this);
    }

    @Override  // dskk
    public final void K() {
    }

    @Override  // dskk
    public final void M() {
    }

    @Override  // dskk
    public final void P(View view0, int v) {
    }

    @Override  // dskk
    public final void Q() {
    }

    @Override  // dskk
    public final void Y() {
    }

    @Override  // dskk
    public final void aC(View view0) {
    }

    @Override  // dskk
    public final void aE() {
    }

    @Override  // dskk
    public final void aF() {
    }

    @Override  // fshi
    public final boolean aI() {
        return false;
    }

    @Override  // fshi
    public final boolean aJ() {
        return false;
    }

    @Override  // fshi
    public final boolean aK() {
        return this.am.i() && ((Valuable)this.am.d()).m;
    }

    @Override  // fshi
    public final boolean aL() {
        return this.am.i() && ((Valuable)this.am.d()).n;
    }

    @Override  // dskk
    public final void aM() {
    }

    @Override  // dskk
    public final void aN() {
        if((this.getParentFragment() instanceof dvub)) {
            dvub dvub0 = (dvub)this.getParentFragment();
            if(dvub0 != null) {
                dvub0.dismiss();
            }
        }
    }

    @Override  // dskk
    public final void aO() {
    }

    @Override  // dskk
    public final void aP() {
    }

    @Override  // dskk
    public final void aQ() {
    }

    @Override  // dskk
    public final void aR() {
    }

    @Override  // dskk
    public final void aS() {
    }

    @Override  // dskk
    public final void aU() {
    }

    @Override  // dskk
    public final void aV(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void aW() {
    }

    @Override  // dskk
    public final void aY(Parcelable parcelable0) {
    }

    @Override  // dskk
    public final void aZ() {
    }

    @Override  // dskk
    public final void aa(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void ab() {
    }

    @Override  // dskk
    public final void ac(View view0, gtzk gtzk0) {
        dskj.o(this);
    }

    @Override  // dskk
    public final void ad(View view0, gtzk gtzk0) {
    }

    @Override  // fshi
    public final void af(boolean z, fshh fshh0) {
    }

    @Override  // dskk
    public final void ag() {
    }

    @Override  // fshi
    public final void ah(boolean z, fshh fshh0) {
        if(!this.am.i()) {
            ((ggtj)dvts.a.i()).x("Attempted to set wallet surfacing state when no valuable is present.");
            return;
        }
        if(!this.d.a()) {
            xob xob0 = this.an();
            if(xob0 != null) {
                this.ag.d(xob0.getSupportFragmentManager());
            }
            ((ggtj)dvts.a.h()).x("Attempted to set wallet surfacing state with no network connection");
            return;
        }
        Valuable valuable0 = (Valuable)this.am.d();
        if(!valuable0.n) {
            ((ggtj)dvts.a.i()).x("Attempted to set wallet surfacing state when it\'s not supported, this shouldn\'t happen!");
            return;
        }
        boolean z1 = valuable0.m;
        SetWalletItemSurfacingEnabledRequest setWalletItemSurfacingEnabledRequest0 = new SetWalletItemSurfacingEnabledRequest();
        setWalletItemSurfacingEnabledRequest0.a = this.b;
        setWalletItemSurfacingEnabledRequest0.b = z;
        setWalletItemSurfacingEnabledRequest0.c = valuable0.b;
        valuable0.m = z;
        fshh0.f(z);
        this.ar.bu(setWalletItemSurfacingEnabledRequest0).A(new dvtn(this, valuable0, z1, fshh0));
    }

    @Override  // dskk
    public final void ai() {
    }

    @Override  // dskk
    public final void aj() {
    }

    @Override  // dskk
    public final void ax(gtzk gtzk0) {
    }

    @Override  // fshg
    public final gfsx bA() {
        return this.am.i() ? gfsx.m(((Valuable)this.am.d()).c) : gfqx.a;
    }

    @Override  // fshi
    public final boolean bB() {
        ((ggtj)dvts.a.i()).x("requireAuthForTransitPurchaseSupported implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshi
    public final boolean bC() {
        return this.am.i() && ((Valuable)this.am.d()).F;
    }

    @Override  // fshi
    public final boolean bD() {
        return this.am.i() && ((Valuable)this.am.d()).z();
    }

    @Override  // fshi
    public final boolean bE() {
        ((ggtj)dvts.a.i()).x("unlockToTapEnabled implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshi
    public final boolean bF() {
        ((ggtj)dvts.a.i()).x("unlockToTapSupported implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return this.am.i() ? ((Valuable)this.am.d()).n() : ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return this.am.i() ? ((Valuable)this.am.d()).b : "";
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return false;
    }

    @Override  // fshg
    public final boolean bP() {
        return false;
    }

    @Override  // fshg
    public final boolean bQ() {
        return false;
    }

    @Override  // fshg
    public final boolean bR() {
        return this.am.i() && ((Valuable)this.am.d()).G;
    }

    @Override  // fshg
    public final boolean bS() {
        return this.am.i() && ((Valuable)this.am.d()).F;
    }

    @Override  // fshg
    public final boolean bT() {
        return this.am.i() && ((Valuable)this.am.d()).z();
    }

    @Override  // dskk
    public final void ba() {
    }

    @Override  // dskk
    public final void bb() {
    }

    @Override  // dskk
    public final void bc() {
    }

    @Override  // dskk
    public final void bd() {
    }

    @Override  // dskk
    public final void be() {
    }

    @Override  // dskk
    public final void bf() {
        dskj.a(this);
    }

    @Override  // dskk
    public final void bg(gtzk gtzk0) {
        dskj.b(this);
    }

    @Override  // dskk
    public final void bh() {
        dskj.c(this);
    }

    @Override  // dskk
    public final void bi() {
        dskj.d(this);
    }

    @Override  // dskk
    public final void bj() {
        dskj.e(this);
    }

    @Override  // dskk
    public final void bk(gtzk gtzk0) {
        dskj.f(this, gtzk0);
    }

    @Override  // dskk
    public final void bl() {
        dskj.g(this);
    }

    @Override  // dskk
    public final void bm() {
        dskj.h(this);
    }

    @Override  // dskk
    public final void bn() {
        dskj.i(this);
    }

    @Override  // dskk
    public final void bo() {
        dskj.j(this);
    }

    @Override  // dskk
    public final void bp(gtzk gtzk0) {
        dskj.k(this, gtzk0);
    }

    @Override  // dskk
    public final void bq() {
        xob xob0 = this.an();
        if(xob0 == null) {
            return;
        }
        this.aN();
        new clht(Looper.getMainLooper()).postDelayed(new dvtr(xob0), 350L);
    }

    @Override  // dskk
    public final void br() {
        dskj.l(this);
    }

    @Override  // dskk
    public final void bs() {
        dskj.m(this);
    }

    @Override  // fshg
    public final gfsx bt() {
        return this.am.i() ? ((Valuable)this.am.d()).bt() : gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return this.am.i() ? ((Valuable)this.am.d()).bu() : gfqx.a;
    }

    @Override  // fshi
    public final void bv(boolean z, fshh fshh0) {
        ((ggtj)dvts.a.i()).x("requireAuthForTransitPurchaseSupported implementation in valuable detail bottom sheet not supported, calling error callback");
        fshh0.g();
    }

    @Override  // fshi
    public final void bw(boolean z, fshh fshh0) {
        if(!this.am.i()) {
            ((ggtj)dvts.a.i()).x("Attempted to set smart tap enabled/disabled when no valuable is present.");
            fshh0.f(false);
            return;
        }
        Valuable valuable0 = (Valuable)this.am.d();
        boolean z1 = valuable0.F;
        evql evql0 = this.ar.bt(this.b, valuable0.b, z);
        evql0.b(new dvtl(valuable0, z, fshh0));
        evql0.A(new dvtm(valuable0, fshh0, z1));
    }

    @Override  // fshi
    public final void bx(boolean z, fshh fshh0) {
        ((ggtj)dvts.a.i()).x("setUnlockToTapEnabled implementation in valuable detail bottom sheet not supported, calling error callback");
        fshh0.g();
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        edop edop0 = new edop();
        dxed dxed0 = dxee.a(doly0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dvqj dvqj0 = new dvqj(dolg0, dxed0, edop0, domv0);
        this.aq.f(dvqj0);
        dvqj0.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            ((ggtj)dvts.a.i()).x("Valuable detail sheet args were null. Set template info and pass color profile");
            this.au = true;
            return;
        }
        if(bundle1.getParcelable("VALUABLE") != null) {
            this.am = gfsx.l(((Valuable)bundle1.getParcelable("VALUABLE")));
        }
        try {
            byte[] arr_b = bundle1.getByteArray("bottom_sheet_info");
            if(arr_b != null) {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gucj.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.as = (gucj)hftv0;
            }
            byte[] arr_b1 = bundle1.getByteArray("pass_color_profile");
            if(arr_b1 != null) {
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gubi.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                this.at = (gubi)hftv1;
            }
        }
        catch(hfur hfur0) {
            a.ae(dvts.a.i(), "Cannot parse bottom sheet info or pass color profile to show as bottom sheet fragment.", hfur0);
            this.au = true;
        }
        if(hwia.c()) {
            this.aA = bundle1.getBoolean("deviceHandoffEducationScreenShownArg", false);
        }
        this.aD = bundle1.getBoolean("nfcEducationScreenShownArg", false);
        this.aE = bundle1.getBoolean("shouldShowNfcEducationScreenArg", false);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0DE3, viewGroup0, false);  // layout:wallet_valuable_detail_bottom_sheet_account_aware_fragment
        View view1 = view0.findViewById(0x7F0B0274);  // id:DetailBackdrop
        view1.setPadding(view1.getPaddingLeft(), 0, view1.getPaddingRight(), view1.getPaddingBottom());
        view0.findViewById(0x7F0B0009).setVisibility(0);  // id:AccessibleHandle
        view0.findViewById(0x7F0B046A).setVisibility(8);  // id:Handle
        this.ao = (ValuableDetailTemplate)view0.findViewById(0x7F0B032C);  // id:DetailTemplate
        this.av = (RelativeLayout)view0.findViewById(0x7F0B03BB);  // id:ErrorLayout
        this.aw = (Button)view0.findViewById(0x7F0B03BD);  // id:ErrorPositiveButton
        this.ax = (FrameLayout)view0.findViewById(0x7F0B0334);  // id:DeviceHandoffEducationalScreen
        this.ay = view0.findViewById(0x7F0B008A);  // id:AppInstallBannerLayout
        this.az = view0.findViewById(0x7F0B09A5);  // id:WalletEducationalBanner
        this.aB = (FrameLayout)view0.findViewById(0x7F0B05E9);  // id:NfcEducationalScreen
        this.aC = view0.findViewById(0x7F0B05E8);  // id:NfcEducationalBanner
        this.ap = (ImageView)view0.findViewById(0x7F0B063F);  // id:PassImage
        return view0;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        if(this.au) {
            this.ao.setVisibility(8);
            this.av.setVisibility(0);
            this.aw.setOnClickListener(new dvto(this));
            return;
        }
        this.ao.i(this, gfqx.a);
        this.ao.l(gged_interceptors.i(this.as.c), this.at, this, this, this, this.c);
        if(hwia.c() && dvsp.a(this) == 12 && !this.aA) {
            this.ao.setVisibility(8);
            if(this.ah.c() == edsd.c) {
                this.ay.setVisibility(0);
                ((MaterialButton)this.ay.findViewById(0x7F0B008B)).setOnClickListener(new dvtk(this));  // id:AppInstallButton
            }
            else {
                this.az.setVisibility(0);
            }
            Context context0 = this.getContext();
            if(context0 != null) {
                String s = ((xob)context0).getIntent().getStringExtra("pass_notification_id_ext");
                if(!gfta.c(s)) {
                    dpwc.l(context0, s);
                }
                if(this.az.getVisibility() == 0) {
                    TextView textView0 = (TextView)this.az.findViewById(0x7F0B08C5);  // id:TitleText
                    TextView textView1 = (TextView)this.az.findViewById(0x7F0B0857);  // id:SubtitleText
                    String s1 = ((xob)context0).getIntent().getStringExtra("EDUCATION_SCREEN_TITLE");
                    if(!gfta.c(s1)) {
                        textView0.setText(s1);
                        if(hwfk.a.b().bp()) {
                            kfe.k(textView0, true);
                        }
                    }
                    String s2 = ((xob)context0).getIntent().getStringExtra("EDUCATION_SCREEN_BODY");
                    if(!gfta.c(s2)) {
                        textView1.setText(s2);
                    }
                    if(this.am.i()) {
                        this.aj.j(16, ((Valuable)this.am.d()).b, this.z(), gged_interceptors.l(((Valuable)this.am.d()).b));
                    }
                }
            }
        }
        else {
            this.ax.setVisibility(8);
        }
        if(dvsp.a(this) == 13 && this.z().equals(guwf.f) && this.getContext() != null && this.ak.a() == 3 && this.bS() && this.bT() && !this.aD && this.aE) {
            this.ao.setVisibility(8);
            this.aC.setVisibility(0);
            ((ImageView)this.aC.findViewById(0x7F0B0496)).setImageResource((hwev.c() ? 0x7F080966 : 0x7F080967));  // id:HowToUseYourPassImage
            if(this.am.i()) {
                this.aj.j(25, ((Valuable)this.am.d()).b, this.z(), gged_interceptors.l(((Valuable)this.am.d()).b));
            }
        }
        else {
            this.aB.setVisibility(8);
        }
        if(this.am.i() && dvkx.f(((Valuable)this.am.d())) && this.an.i() && !dvkx.f(((Valuable)this.am.d())) && this.getContext() != null && this.ap != null) {
            Object object0 = this.an.d();
            ((evql)object0).b(new dvtp(this));
            ((evql)object0).A(new dvtq(this));
        }
    }

    public static dvts y(Intent intent0) {
        dvts dvts0 = new dvts();
        dvts0.setArguments(intent0.getExtras());
        return dvts0;
    }

    public final guwf z() {
        if(!this.am.i()) {
            ((ggtj)dvts.a.i()).x("Attempted tp get valuable type without a valuable");
            return guwf.a;
        }
        return ((Valuable)this.am.d()).R;
    }
}


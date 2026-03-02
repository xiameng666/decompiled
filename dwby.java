import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.BulkImportUcpMetadata;
import com.google.android.gms.pay.FetchMode;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.UserCreatedPassVerticalMetadata;
import com.google.android.gms.pay.pass.common.template.detail.DetailCardTemplate;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.statusheader.StatusHeader;
import com.google.android.libraries.tapandpay.ui.wallettip.ComposeWalletTip;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class dwby extends dokz implements douk, dskk, ednc, fshb, fshg {
    public Context a;
    private Valuable aA;
    private NestedScrollView aB;
    private ComposeWalletTip aC;
    private int aD;
    private UserCreatedPassVerticalMetadata aE;
    public fhvw ag;
    public fhwk ah;
    public dvfy ai;
    public edse aj;
    public fuok ak;
    public fhxi al;
    public ActionBar am;
    public ComposeActionBar an;
    public Button ao;
    public Button ap;
    public MaterialToolbar aq;
    public azts ar;
    public static final int as;
    private static final bboh at;
    private acp au;
    private View av;
    private StatusHeader aw;
    private ImageView ax;
    private TextView ay;
    private DetailCardTemplate az;
    public String b;
    public Account c;
    public String d;

    static {
        dwby.at = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // douk
    public final douj A() {
        return douj.a;
    }

    public final dvfy B() {
        dvfy dvfy0 = this.ai;
        if(dvfy0 != null) {
            return dvfy0;
        }
        ibuq.j("barcodeExpander");
        return null;
    }

    public final fhvw D() {
        fhvw fhvw0 = this.ag;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk E() {
        fhwk fhwk0 = this.ah;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return hwik.n();
    }

    public final fhxi G() {
        fhxi fhxi0 = this.al;
        if(fhxi0 != null) {
            return fhxi0;
        }
        ibuq.j("composeVisualElements");
        return null;
    }

    public final Object H(ibrl ibrl0) {
        Object object2;
        dwbu dwbu0;
        if((ibrl0 instanceof dwbu)) {
            dwbu0 = (dwbu)ibrl0;
            int v = dwbu0.c;
            if((v & 0x80000000) == 0) {
                dwbu0 = new dwbu(this, ibrl0);
            }
            else {
                dwbu0.c = v - 0x80000000;
            }
        }
        else {
            dwbu0 = new dwbu(this, ibrl0);
        }
        Object object0 = dwbu0.a;
        Object object1 = ibrx.a;
        switch(dwbu0.c) {
            case 0: {
                ibnx.b(object0);
                GetSettingsRequest getSettingsRequest0 = new GetSettingsRequest();
                Account account0 = this.c;
                azts azts0 = null;
                if(account0 == null) {
                    ibuq.j("account");
                    account0 = null;
                }
                getSettingsRequest0.a = account0;
                FetchMode fetchMode0 = new FetchMode();
                fetchMode0.a = 3;
                getSettingsRequest0.c = fetchMode0;
                ftgl ftgl0 = (ftgl)((ProtoLiteMessage)ftgm.b).v_newBuilder();
                ftgl0.a(ftgk.s);
                getSettingsRequest0.b = ftqe.a(((MessageLite)((ProtoLiteBuilder)ftgl0).N_build()));
                azts azts1 = this.ar;
                if(azts1 == null) {
                    ibuq.j("firstPartyPayClient");
                }
                else {
                    azts0 = azts1;
                }
                evql evql0 = azts0.aO(getSettingsRequest0);
                dwbu0.c = 1;
                object2 = fsdk.a(evql0, dwbu0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object2);
        ibuq.c(((ProtoSafeParcelable)object2));
        ibuq.e(ftgg.a, "getDefaultInstance(...)");
        ftgg ftgg0 = (ftgg)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)ftgg.a));
        ftgf ftgf0 = ftgf.b(ftgg0.u) == null ? ftgf.e : ftgf.b(ftgg0.u);
        return Boolean.valueOf(ftgf.c.equals(ftgf0));
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

    public final Object L(ibrl ibrl0) {
        dwbx dwbx0;
        if((ibrl0 instanceof dwbx)) {
            dwbx0 = (dwbx)ibrl0;
            int v = dwbx0.c;
            if((v & 0x80000000) == 0) {
                dwbx0 = new dwbx(this, ibrl0);
            }
            else {
                dwbx0.c = v - 0x80000000;
            }
        }
        else {
            dwbx0 = new dwbx(this, ibrl0);
        }
        Object object0 = dwbx0.a;
        Object object1 = ibrx.a;
        switch(dwbx0.c) {
            case 0: {
                ibnx.b(object0);
                int v1 = this.aD;
                if(v1 != 0 && v1 != 3) {
                    edse edse0 = this.aj;
                    String s = null;
                    if(edse0 == null) {
                        ibuq.j("walletInstallManager");
                        edse0 = null;
                    }
                    edsd edsd0 = edse0.d(hwfn.a.b().a());
                    if(edsd0 != edsd.b) {
                        ((ggtj)dwby.at.h()).B("Don\'t show bulk import tip for install state: %s", edsd0);
                        return ibom.a;
                    }
                    String s1 = this.b;
                    if(s1 == null) {
                        ibuq.j("accountId");
                        s1 = null;
                    }
                    String s2 = this.d;
                    if(s2 == null) {
                        ibuq.j("environment");
                    }
                    else {
                        s = s2;
                    }
                    gmcd gmcd0 = new dxxt(s1, s).a.a();
                    ibuq.e(gmcd0, "getData(...)");
                    dwbx0.c = 1;
                    object0 = icpu.c(gmcd0, dwbx0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_43;
                }
                ((ggtj)dwby.at.h()).z("Don\'t show bulk import tip for origin: %d", v1);
                return ibom.a;
            }
            case 1: {
                ibnx.b(object0);
            label_43:
                if(!((dltz)object0).b) {
                    this.S();
                    return ibom.a;
                }
                try {
                    dwbx0.c = 2;
                    object0 = this.H(dwbx0);
                    if(object0 == object1) {
                        return object1;
                    label_50:
                        ibnx.b(object0);
                    }
                    if(!((Boolean)object0).booleanValue()) {
                        this.S();
                        return ibom.a;
                    }
                    return ibom.a;
                }
                catch(aztb aztb0) {
                    break;
                }
            }
            case 2: {
                goto label_50;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(dwby.at.j(), "Failed to get bulk import setting.", aztb0);
        return ibom.a;
    }

    @Override  // dskk
    public final void M() {
    }

    public final void N() {
        Context context0 = this.y();
        Valuable valuable0 = this.aA;
        acp acp0 = null;
        if(valuable0 == null) {
            ibuq.j("valuable");
            valuable0 = null;
        }
        Intent intent0 = dlnf.bd(context0, valuable0.p.c, dlnd.f);
        acp acp1 = this.au;
        if(acp1 == null) {
            ibuq.j("viewSavedPassLauncher");
        }
        else {
            acp0 = acp1;
        }
        ibuq.c(intent0);
        acp0.b(intent0);
    }

    public final void O() {
        this.startActivity(dlnf.aY(2, 5, false).addFlags(0x4000000));
    }

    @Override  // dskk
    public final void P(View view0, int v) {
    }

    @Override  // dskk
    public final void Q() {
    }

    public final void R() {
        List list0;
        Intent intent0 = new Intent();
        intent0.putExtra("BULK_IMPORT_ADD_PASS_RESULT_TYPE", 1);
        UserCreatedPassVerticalMetadata userCreatedPassVerticalMetadata0 = this.aE;
        if(userCreatedPassVerticalMetadata0 == null) {
            list0 = ibps.a;
        }
        else {
            BulkImportUcpMetadata bulkImportUcpMetadata0 = userCreatedPassVerticalMetadata0.a;
            if(bulkImportUcpMetadata0 == null) {
                list0 = ibps.a;
            }
            else {
                String[] arr_s = bulkImportUcpMetadata0.b;
                if(arr_s == null) {
                    list0 = ibps.a;
                }
                else {
                    list0 = ibpg.N(arr_s);
                    if(list0 == null) {
                        list0 = ibps.a;
                    }
                }
            }
        }
        intent0.putExtra("BULK_IMPORT_ORIGINAL_IMAGE_IDS", new ArrayList(list0));
        xob xob0 = this.an();
        if(xob0 != null) {
            xob0.setResult(-1, intent0);
        }
        xob xob1 = this.an();
        if(xob1 != null) {
            xob1.finishAndRemoveTask();
        }
    }

    private final void S() {
        ComposeWalletTip composeWalletTip0 = this.aC;
        if(composeWalletTip0 == null) {
            ibuq.j("bulkImportTip");
            composeWalletTip0 = null;
        }
        composeWalletTip0.setVisibility(0);
        fryh fryh0 = new fryh(0x7F08028D);  // drawable:bulk_import_tip_image
        String s = composeWalletTip0.getContext().getString(0x7F151BD0, new Object[]{"<br>", "</br>"});  // string:pay_added_to_wallet_bulk_import_tip_title "Automatically add %1$spasses, 
                                                                                                         // tickets%2$s, and %1$smore%2$s from your device"
        ibuq.e(s, "getString(...)");
        fryq fryq0 = new fryq(iwx.b(s, null, 6));
        fryr fryr0 = new fryr(0x7F150834);  // string:common_get_started "Get started"
        dwbs dwbs0 = new dwbs(this);
        frxo frxo0 = new frxo(0x7F040339);  // attr:colorSurfaceContainer
        composeWalletTip0.b(new fula(fulb.b, fryh0, fryq0, null, fryr0, false, null, 0x3D5E9, 0x3D5EB, 0L, dwbs0, frxo0, null, false, 120040));
        composeWalletTip0.c(new fufz(this.G(), this.D()));
    }

    private final boolean T() {
        return hwfn.c() && this.aD == 3 && (this.aE != null && (this.aE.a != null && this.aE.a.a));
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

    @Override  // dskk
    public final void aM() {
    }

    @Override  // dskk
    public final void aN() {
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

    @Override  // dskk
    public final void ag() {
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
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        dvfy dvfy0 = this.B();
        Valuable valuable0 = this.aA;
        if(valuable0 == null) {
            ibuq.j("valuable");
            valuable0 = null;
        }
        return gfsx.l(dvfy0.b(valuable0));
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        dvfy dvfy0 = this.B();
        Valuable valuable0 = this.aA;
        if(valuable0 == null) {
            ibuq.j("valuable");
            valuable0 = null;
        }
        return dvfy0.a(valuable0);
    }

    @Override  // fshg
    public final String bL() {
        return "";
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
        return false;
    }

    @Override  // fshg
    public final boolean bS() {
        return false;
    }

    @Override  // fshg
    public final boolean bT() {
        return false;
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
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dxed dxed0 = dxee.a(dolz.a(this));
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dwce(dolg0, dxed0, domv0).inject(this);
        this.au = this.registerForActivityResult(new adt(), new dwbv(this));
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        Valuable valuable0;
        super.onCreate(bundle0);
        Bundle bundle1 = this.am();
        if(bbqa.c()) {
            valuable0 = (Valuable)bundle1.getParcelable("VALUABLE", Valuable.class);
            if(valuable0 == null) {
                ((ggtj)dwby.at.i()).x("valuable is missing.");
                this.ar();
                return;
            }
        }
        else {
            valuable0 = (Valuable)bundle1.getParcelable("VALUABLE");
            if(valuable0 == null) {
                ((ggtj)dwby.at.i()).x("valuable is missing.");
                this.ar();
                return;
            }
        }
        this.aA = valuable0;
        if(hwfk.v()) {
            this.aD = bundle1.getInt("USER_CREATED_PASS_ORIGIN", 0);
        }
        if(hwfk.z()) {
            byte[] arr_b = bundle1.getByteArray("UCP_VERTICAL_METADATA");
            this.aE = arr_b == null ? null : ((UserCreatedPassVerticalMetadata)bauc.a(arr_b, UserCreatedPassVerticalMetadata.CREATOR));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ftts ftts2;
        ftuw ftuw0;
        gfsx gfsx0;
        DetailCardTemplate detailCardTemplate0;
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate(0x7F0E0C9C, viewGroup0, false);  // layout:wallet_added_to_wallet_layout
        this.av = view0;
        if(view0 == null) {
            ibuq.j("rootView");
            view0 = null;
        }
        this.aq = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
        if(hwfk.av()) {
            View view1 = this.av;
            if(view1 == null) {
                ibuq.j("rootView");
                view1 = null;
            }
            detailCardTemplate0 = (DetailCardTemplate)view1.findViewById(0x7F0B097B);  // id:ValuableDetailCardTemplate
        }
        else {
            View view2 = this.av;
            if(view2 == null) {
                ibuq.j("rootView");
                view2 = null;
            }
            detailCardTemplate0 = (DetailCardTemplate)view2.findViewById(0x7F0B029B);  // id:DetailCardTemplate
        }
        this.az = detailCardTemplate0;
        View view3 = this.av;
        if(view3 == null) {
            ibuq.j("rootView");
            view3 = null;
        }
        this.am = (ActionBar)view3.findViewById(0x7F0B0012);  // id:ActionBar
        View view4 = this.av;
        if(view4 == null) {
            ibuq.j("rootView");
            view4 = null;
        }
        this.an = (ComposeActionBar)view4.findViewById(0x7F0B020A);  // id:ComposeActionBar
        ActionBar actionBar0 = this.am;
        if(actionBar0 == null) {
            ibuq.j("actionBar");
            actionBar0 = null;
        }
        this.ao = (Button)actionBar0.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        ActionBar actionBar1 = this.am;
        if(actionBar1 == null) {
            ibuq.j("actionBar");
            actionBar1 = null;
        }
        this.ap = (Button)actionBar1.findViewById(0x7F0B07C8);  // id:SecondaryActionButton
        View view5 = this.av;
        if(view5 == null) {
            ibuq.j("rootView");
            view5 = null;
        }
        this.aB = (NestedScrollView)view5.findViewById(0x7F0B0560);  // id:MainContent
        View view6 = this.av;
        if(view6 == null) {
            ibuq.j("rootView");
            view6 = null;
        }
        this.aC = (ComposeWalletTip)view6.findViewById(0x7F0B011B);  // id:BulkImportTip
        View view7 = this.av;
        if(view7 == null) {
            ibuq.j("rootView");
            view7 = null;
        }
        this.aw = (StatusHeader)view7.findViewById(0x7F0B0839);  // id:StatusHeader
        View view8 = this.av;
        if(view8 == null) {
            ibuq.j("rootView");
            view8 = null;
        }
        this.ax = (ImageView)view8.findViewById(0x7F0B01C6);  // id:Checkmark
        View view9 = this.av;
        if(view9 == null) {
            ibuq.j("rootView");
            view9 = null;
        }
        this.ay = (TextView)view9.findViewById(0x7F0B08BD);  // id:Title
        MaterialToolbar materialToolbar0 = this.aq;
        if(materialToolbar0 == null) {
            ibuq.j("toolbar");
            materialToolbar0 = null;
        }
        materialToolbar0.x(new dwbr(this));
        DetailCardTemplate detailCardTemplate1 = this.az;
        if(detailCardTemplate1 == null) {
            ibuq.j("detailCardTemplate");
            detailCardTemplate1 = null;
        }
        detailCardTemplate1.setVisibility(0);
        DetailCardTemplate detailCardTemplate2 = this.az;
        if(detailCardTemplate2 == null) {
            ibuq.j("detailCardTemplate");
            detailCardTemplate2 = null;
        }
        detailCardTemplate2.k(this);
        Valuable valuable0 = this.aA;
        if(valuable0 == null) {
            ibuq.j("valuable");
            valuable0 = null;
        }
        gumi gumi0 = valuable0.q;
        ibuq.e(gumi0, "templateInfo");
        if((gumi0.b & 0x80) == 0) {
        label_98:
            if((gumi0.b & 4) == 0) {
                ((ggtj)dwby.at.j()).x("Can\'t find card template info.");
                gfsx0 = gfqx.a;
            }
            else {
                gfsx0 = gfsx.l((gumi0.e == null ? gucl.a : gumi0.e));
            }
        }
        else {
            hfuo hfuo0 = (gumi0.j == null ? gucv.a : gumi0.j).c;
            ibuq.e(hfuo0, "getDetailItemInfoList(...)");
            for(Object object0: hfuo0) {
                if(((gucn)object0).b != 1) {
                    continue;
                }
                goto label_95;
            }
            object0 = null;
        label_95:
            if(((gucn)object0) != null) {
                gfsx0 = gfsx.l((((gucn)object0).b == 1 ? ((gucl)((gucn)object0).c) : gucl.a));
                goto label_103;
            }
            goto label_98;
        }
    label_103:
        if(gfsx0.i()) {
            DetailCardTemplate detailCardTemplate3 = this.az;
            if(detailCardTemplate3 == null) {
                ibuq.j("detailCardTemplate");
                detailCardTemplate3 = null;
            }
            gucl gucl0 = (gucl)gfsx0.d();
            Valuable valuable1 = this.aA;
            if(valuable1 == null) {
                ibuq.j("valuable");
                valuable1 = null;
            }
            detailCardTemplate3.p(gucl0, (valuable1.q.c == null ? gubi.a : valuable1.q.c), this, this);
            if(hwfk.av()) {
                TextView textView0 = this.ay;
                if(textView0 == null) {
                    ibuq.j("title");
                    textView0 = null;
                }
                textView0.setVisibility(8);
                ImageView imageView0 = this.ax;
                if(imageView0 == null) {
                    ibuq.j("imageCheckMark");
                    imageView0 = null;
                }
                imageView0.setVisibility(8);
                StatusHeader statusHeader0 = this.aw;
                if(statusHeader0 == null) {
                    ibuq.j("statusHeader");
                    statusHeader0 = null;
                }
                statusHeader0.setVisibility(0);
                statusHeader0.a(new fucf(new frxv(new fryn(fuqq.a, 0, 6)), new fryr(0x7F152070), false, null, 26));  // string:pay_preview_added_to_wallet_title "Added to Wallet"
            }
            else {
                TextView textView1 = this.ay;
                if(textView1 == null) {
                    ibuq.j("title");
                    textView1 = null;
                }
                textView1.setVisibility(0);
                ImageView imageView1 = this.ax;
                if(imageView1 == null) {
                    ibuq.j("imageCheckMark");
                    imageView1 = null;
                }
                imageView1.setVisibility(0);
                StatusHeader statusHeader1 = this.aw;
                if(statusHeader1 == null) {
                    ibuq.j("statusHeader");
                    statusHeader1 = null;
                }
                statusHeader1.setVisibility(8);
            }
            boolean z = this.T();
            if(hwfk.av()) {
                ActionBar actionBar2 = this.am;
                if(actionBar2 == null) {
                    ibuq.j("actionBar");
                    actionBar2 = null;
                }
                actionBar2.setVisibility(8);
                ComposeActionBar composeActionBar0 = this.an;
                if(composeActionBar0 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar0 = null;
                }
                composeActionBar0.setVisibility(0);
                ComposeActionBar composeActionBar1 = this.an;
                if(composeActionBar1 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar1 = null;
                }
                if(z) {
                    ftts ftts0 = new ftts(new fryr(0x7F15089B), null, false, null, null, null, 0x3FB11, null, null, new dwbg(this), 446);  // string:common_next "Next"
                    fryr fryr0 = new fryr(0x7F151BD2);  // string:pay_added_to_wallet_view_button "View"
                    dwbk dwbk0 = new dwbk(this);
                    ftuw0 = new ftuw(ftts0, new ftts(fryr0, null, false, ftvc.a, null, null, 0x39417, null, null, dwbk0, 438), false, null, null, null, null, hwik.n(), 0x7C);
                }
                else {
                    ftts ftts1 = new ftts(new fryr(0x7F151BD2), null, false, null, null, null, 0x39417, null, null, new dwbl(this), 446);  // string:pay_added_to_wallet_view_button "View"
                    if(hwvc.c()) {
                        fryr fryr1 = new fryr(0x7F15206F);  // string:pay_preview_add_another_to_wallet_button_label "Add another"
                        dwbm dwbm0 = new dwbm(this);
                        ftts2 = new ftts(fryr1, null, false, ftvc.a, null, null, 0x3FFD7, null, null, dwbm0, 438);
                    }
                    else {
                        ftts2 = null;
                    }
                    ftuw0 = new ftuw(ftts1, ftts2, false, null, null, null, null, hwik.n(), 0x7C);
                }
                composeActionBar1.d(ftuw0);
                composeActionBar1.setVisibility(0);
                composeActionBar1.e(new fufz(this.G(), this.D()));
            }
            else {
                ActionBar actionBar3 = this.am;
                if(actionBar3 == null) {
                    ibuq.j("actionBar");
                    actionBar3 = null;
                }
                actionBar3.setVisibility(0);
                ComposeActionBar composeActionBar2 = this.an;
                if(composeActionBar2 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar2 = null;
                }
                composeActionBar2.setVisibility(8);
                if(z) {
                    ActionBar actionBar4 = this.am;
                    if(actionBar4 == null) {
                        ibuq.j("actionBar");
                        actionBar4 = null;
                    }
                    CharSequence charSequence0 = this.getText(0x7F15089B);  // string:common_next "Next"
                    ibuq.e(charSequence0, "getText(...)");
                    actionBar4.m(new ftrz(charSequence0, new dwbn(this)));
                    CharSequence charSequence1 = this.getText(0x7F151BD2);  // string:pay_added_to_wallet_view_button "View"
                    ibuq.e(charSequence1, "getText(...)");
                    actionBar4.n(new ftrz(charSequence1, new dwbo(this)));
                    actionBar4.o();
                }
                else {
                    ActionBar actionBar5 = this.am;
                    if(actionBar5 == null) {
                        ibuq.j("actionBar");
                        actionBar5 = null;
                    }
                    CharSequence charSequence2 = this.getText(0x7F151BD2);  // string:pay_added_to_wallet_view_button "View"
                    ibuq.e(charSequence2, "getText(...)");
                    actionBar5.m(new ftrz(charSequence2, new dwbp(this)));
                    if(hwvc.c()) {
                        ActionBar actionBar6 = this.am;
                        if(actionBar6 == null) {
                            ibuq.j("actionBar");
                            actionBar6 = null;
                        }
                        CharSequence charSequence3 = this.getText(0x7F15206F);  // string:pay_preview_add_another_to_wallet_button_label "Add another"
                        ibuq.e(charSequence3, "getText(...)");
                        actionBar6.n(new ftrz(charSequence3, new dwbq(this)));
                        actionBar6.o();
                    }
                    else {
                        ActionBar actionBar7 = this.am;
                        if(actionBar7 == null) {
                            ibuq.j("actionBar");
                            actionBar7 = null;
                        }
                        actionBar7.n(null);
                        actionBar7.h();
                    }
                }
                if(hwik.n()) {
                    fuok fuok0 = this.ak;
                    if(fuok0 == null) {
                        ibuq.j("edgeToEdgeStyler");
                        fuok0 = null;
                    }
                    ActionBar actionBar8 = this.am;
                    if(actionBar8 == null) {
                        ibuq.j("actionBar");
                        actionBar8 = null;
                    }
                    fuop.h(fuok0, actionBar8);
                }
            }
            dwbh dwbh0 = new dwbh(this);
            NestedScrollView nestedScrollView0 = this.aB;
            if(nestedScrollView0 == null) {
                ibuq.j("mainContent");
                nestedScrollView0 = null;
            }
            nestedScrollView0.e = new dwbi(dwbh0);
            NestedScrollView nestedScrollView1 = this.aB;
            if(nestedScrollView1 == null) {
                ibuq.j("mainContent");
                nestedScrollView1 = null;
            }
            nestedScrollView1.addOnLayoutChangeListener(new dwbj(dwbh0));
            if(hwfn.c() && hwfn.a.b().b()) {
                icbb.b(lpt.a(this.getViewLifecycleOwner()), null, null, new dwbw(this, null), 3);
            }
        }
        else {
            ((ggtj)dwby.at.i()).x("Card Template info is missing, unable to render the view.");
            this.ar();
        }
        fhwk fhwk0 = this.E();
        View view10 = this.av;
        if(view10 == null) {
            ibuq.j("rootView");
            view10 = null;
        }
        fhwk0.f(view10, this.E().a.a(0x39416));
        fhwk fhwk1 = this.E();
        MaterialToolbar materialToolbar1 = this.aq;
        if(materialToolbar1 == null) {
            ibuq.j("toolbar");
            materialToolbar1 = null;
        }
        fhwk1.f(materialToolbar1, this.E().a.a(234520));
        if(!hwfk.av()) {
            if(this.T()) {
                fhwk fhwk2 = this.E();
                Button button0 = this.ao;
                if(button0 == null) {
                    ibuq.j("ctaButton");
                    button0 = null;
                }
                fhwk2.f(button0, this.E().a.a(0x3FB11));
                fhwk fhwk3 = this.E();
                Button button1 = this.ap;
                if(button1 == null) {
                    ibuq.j("secondaryButton");
                    button1 = null;
                }
                fhwk3.f(button1, this.E().a.a(0x39417));
            }
            else {
                fhwk fhwk4 = this.E();
                Button button2 = this.ao;
                if(button2 == null) {
                    ibuq.j("ctaButton");
                    button2 = null;
                }
                fhwk4.f(button2, this.E().a.a(0x39417));
                if(hwvc.c()) {
                    fhwk fhwk5 = this.E();
                    Button button3 = this.ap;
                    if(button3 == null) {
                        ibuq.j("secondaryButton");
                        button3 = null;
                    }
                    fhwk5.f(button3, this.E().a.a(0x3FFD7));
                }
            }
        }
        View view11 = this.av;
        if(view11 == null) {
            ibuq.j("rootView");
            return null;
        }
        return view11;
    }

    public final Context y() {
        Context context0 = this.a;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("applicationContext");
        return null;
    }
}


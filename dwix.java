import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.internal.Preconditions;
import java.nio.charset.StandardCharsets;

public final class dwix extends dokz implements douk, ednc, fshb {
    public fuok a;
    public domj ag;
    public ActionBar ah;
    public ComposeActionBar ai;
    public Button aj;
    public Button ak;
    public static final int al;
    private static final bboh am;
    private MaterialToolbar an;
    private RecyclerView ao;
    private LinearLayout ap;
    private TextView aq;
    private ComposeViewHeader ar;
    private gvbz as;
    private gvby at;
    private dwip au;
    private dwiz av;
    private boolean aw;
    private int ax;
    public fhxi b;
    public fhwk c;
    public fhvw d;

    static {
        dwix.am = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // douk
    public final douj A() {
        return douj.c;
    }

    // Detected as a lambda impl.
    public final fhvu B() {
        dwip dwip0 = this.au;
        gvby gvby0 = null;
        if(dwip0 == null) {
            ibuq.j("editPassCategoryAdapter");
            dwip0 = null;
        }
        gvby gvby1 = dwip0.f();
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkab.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gvby gvby2 = this.at;
        if(gvby2 == null) {
            ibuq.j("initialCheckedCategoryInfo");
        }
        else {
            gvby0 = gvby2;
        }
        int v = gvby0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkab)hftv0).b |= 1;
        ((gkab)hftv0).c = v;
        int v1 = gvby1 == null ? 0 : gvby1.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkab gkab0 = (gkab)hftp0.b_message;
        gkab0.b |= 2;
        gkab0.d = v1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gkab)hftv1), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp1.b_message;
        ((gkab)hftv1).getClass();
        gkbe0.d = (gkab)hftv1;
        gkbe0.b |= 2;
        gjca0.f(gjzs0.a());
        String s = this.y().a();
        gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        return douc.a(gjca0.a());
    }

    public final fhvw D() {
        fhvw fhvw0 = this.d;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk E() {
        fhwk fhwk0 = this.c;
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

    public final void G() {
        this.at(0, null);
        this.ar();
    }

    public final void H() {
        dwip dwip0 = this.au;
        if(dwip0 == null) {
            ibuq.j("editPassCategoryAdapter");
            dwip0 = null;
        }
        gvby gvby0 = dwip0.f();
        if(gvby0 == null) {
            this.at(0, null);
            this.ar();
            return;
        }
        Intent intent0 = new Intent();
        intent0.putExtra("CHECKED_CATEGORY_INFO", gvby0.toBytesArray());
        this.at(-1, intent0);
        this.ar();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dwhr(domv0).inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.av = (dwiz)new lso(this).a(dwiz.class);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfsx gfsx1;
        gfsx gfsx0;
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate(0x7F0E0CF9, viewGroup0, false);  // layout:wallet_edit_pass_category_layout
        Bundle bundle1 = this.am();
        byte[] arr_b = bundle1.getByteArray("CATEGORY_OPTIONS");
        if(arr_b == null) {
            gfsx0 = gfqx.a;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvbz.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gfsx0 = gfsx.l(((gvbz)hftv0));
            }
            catch(hfur hfur0) {
                a.ae(dwix.am.i(), "Unable to de-serialize UcpCategoryOptions", hfur0);
                gfsx0 = gfqx.a;
            }
        }
        if(!gfsx0.i()) {
            ((ggtj)dwix.am.i()).x("No category options argument for EditPassCategoryFragment");
            this.ar();
            return view0;
        }
        this.as = (gvbz)gfsx0.d();
        byte[] arr_b1 = bundle1.getByteArray("CHECKED_CATEGORY_INFO");
        if(arr_b1 == null) {
            gfsx1 = gfqx.a;
        }
        else {
            try {
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvby.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                gfsx1 = gfsx.l(((gvby)hftv1));
            }
            catch(hfur hfur1) {
                a.ae(dwix.am.i(), "Unable to de-serialize UcpCategoryInfo", hfur1);
                gfsx1 = gfqx.a;
            }
        }
        if(!gfsx1.i()) {
            ((ggtj)dwix.am.i()).x("No checked category info argument for EditPassCategoryFragment");
            this.ar();
            return view0;
        }
        this.at = (gvby)gfsx1.d();
        this.aw = bundle1.getBoolean("IS_USER_STARTING_FLOW", false);
        if(hwfk.w()) {
            this.ax = bundle1.getInt("USER_CREATED_PASS_ORIGIN", 0);
        }
        this.an = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
        this.ao = (RecyclerView)view0.findViewById(0x7F0B01BA);  // id:CategoriesContainer
        this.ap = (LinearLayout)view0.findViewById(0x7F0B00EC);  // id:BottomActionBarContainer
        this.ah = (ActionBar)view0.findViewById(0x7F0B0012);  // id:ActionBar
        this.ai = (ComposeActionBar)view0.findViewById(0x7F0B020A);  // id:ComposeActionBar
        ActionBar actionBar0 = this.ah;
        gvby gvby0 = null;
        if(actionBar0 == null) {
            ibuq.j("actionBar");
            actionBar0 = null;
        }
        this.aj = (Button)actionBar0.findViewById(0x7F0B07C8);  // id:SecondaryActionButton
        ActionBar actionBar1 = this.ah;
        if(actionBar1 == null) {
            ibuq.j("actionBar");
            actionBar1 = null;
        }
        this.ak = (Button)actionBar1.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        this.aq = (TextView)view0.findViewById(0x7F0B08BD);  // id:Title
        this.ar = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
        if(hwfk.av()) {
            ComposeViewHeader composeViewHeader0 = this.ar;
            if(composeViewHeader0 == null) {
                ibuq.j("viewHeader");
                composeViewHeader0 = null;
            }
            composeViewHeader0.setVisibility(0);
            TextView textView0 = this.aq;
            if(textView0 == null) {
                ibuq.j("title");
                textView0 = null;
            }
            textView0.setVisibility(8);
        }
        else {
            ComposeViewHeader composeViewHeader1 = this.ar;
            if(composeViewHeader1 == null) {
                ibuq.j("viewHeader");
                composeViewHeader1 = null;
            }
            composeViewHeader1.setVisibility(8);
            TextView textView1 = this.aq;
            if(textView1 == null) {
                ibuq.j("title");
                textView1 = null;
            }
            textView1.setVisibility(0);
        }
        MaterialToolbar materialToolbar0 = this.an;
        if(materialToolbar0 == null) {
            ibuq.j("toolbar");
            materialToolbar0 = null;
        }
        materialToolbar0.x(new dwiv(this));
        int v = 0x7F1508CC;  // string:common_save "Save"
        if(hwfk.av()) {
            ActionBar actionBar2 = this.ah;
            if(actionBar2 == null) {
                ibuq.j("actionBar");
                actionBar2 = null;
            }
            actionBar2.setVisibility(8);
            ComposeActionBar composeActionBar0 = this.ai;
            if(composeActionBar0 == null) {
                ibuq.j("composeActionBar");
                composeActionBar0 = null;
            }
            composeActionBar0.setVisibility(0);
            ComposeActionBar composeActionBar1 = this.ai;
            if(composeActionBar1 == null) {
                ibuq.j("composeActionBar");
                composeActionBar1 = null;
            }
            fhxi fhxi0 = this.b;
            if(fhxi0 == null) {
                ibuq.j("composeVisualElements");
                fhxi0 = null;
            }
            composeActionBar1.e(new fufz(fhxi0, this.D()));
            ComposeActionBar composeActionBar2 = this.ai;
            if(composeActionBar2 == null) {
                ibuq.j("composeActionBar");
                composeActionBar2 = null;
            }
            ComposeActionBar composeActionBar3 = this.ai;
            if(composeActionBar3 == null) {
                ibuq.j("composeActionBar");
                composeActionBar3 = null;
            }
            ftuw ftuw0 = composeActionBar3.b();
            if(this.aw) {
                v = 0x7F15089B;  // string:common_next "Next"
            }
            ftts ftts0 = new ftts(new fryr(v), null, false, null, null, null, 205668, null, () -> {
                dwip dwip0 = this.au;
                gvby gvby0 = null;
                if(dwip0 == null) {
                    ibuq.j("editPassCategoryAdapter");
                    dwip0 = null;
                }
                gvby gvby1 = dwip0.f();
                gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkab.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                gvby gvby2 = this.at;
                if(gvby2 == null) {
                    ibuq.j("initialCheckedCategoryInfo");
                }
                else {
                    gvby0 = gvby2;
                }
                int v = gvby0.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gkab)hftv0).b |= 1;
                ((gkab)hftv0).c = v;
                int v1 = gvby1 == null ? 0 : gvby1.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkab gkab0 = (gkab)hftp0.b_message;
                gkab0.b |= 2;
                gkab0.d = v1;
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                ibuq.f(((gkab)hftv1), "value");
                ProtoLiteBuilder hftp1 = gjzs0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkbe gkbe0 = (gkbe)hftp1.b_message;
                ((gkab)hftv1).getClass();
                gkbe0.d = (gkab)hftv1;
                gkbe0.b |= 2;
                gjca0.f(gjzs0.a());
                String s = this.y().a();
                gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
                return douc.a(gjca0.a());
            }, new dwit(this), 190);
            fryr fryr0 = new fryr(0x7F1507F2);  // string:common_cancel "Cancel"
            dwiu dwiu0 = new dwiu(this);
            composeActionBar2.d(ftuw.a(ftuw0, ftts0, new ftts(fryr0, null, false, ftvc.a, null, null, 208491, null, null, dwiu0, 438), false, null, null, hwik.n(), 0x7C));
        }
        else {
            ActionBar actionBar3 = this.ah;
            if(actionBar3 == null) {
                ibuq.j("actionBar");
                actionBar3 = null;
            }
            actionBar3.setVisibility(0);
            ComposeActionBar composeActionBar4 = this.ai;
            if(composeActionBar4 == null) {
                ibuq.j("composeActionBar");
                composeActionBar4 = null;
            }
            composeActionBar4.setVisibility(8);
            ActionBar actionBar4 = this.ah;
            if(actionBar4 == null) {
                ibuq.j("actionBar");
                actionBar4 = null;
            }
            CharSequence charSequence0 = this.getText(0x7F1508CC);  // string:common_save "Save"
            ibuq.e(charSequence0, "getText(...)");
            ftrz ftrz0 = new ftrz(charSequence0, new dwiq(this));
            CharSequence charSequence1 = this.getText(0x7F1507F2);  // string:common_cancel "Cancel"
            ibuq.e(charSequence1, "getText(...)");
            actionBar4.l(ftrz0, new ftrz(charSequence1, new dwir(this)));
            actionBar4.o();
            fhwk fhwk0 = this.E();
            Button button0 = this.ak;
            if(button0 == null) {
                ibuq.j("saveButton");
                button0 = null;
            }
            fhwk0.f(button0, this.E().a.a(205668));
            fhwk fhwk1 = this.E();
            Button button1 = this.aj;
            if(button1 == null) {
                ibuq.j("cancelButton");
                button1 = null;
            }
            fhwk1.f(button1, this.E().a.a(208491));
            if(hwik.n()) {
                fuok fuok0 = this.a;
                if(fuok0 == null) {
                    ibuq.j("edgeToEdgeStyler");
                    fuok0 = null;
                }
                LinearLayout linearLayout0 = this.ap;
                if(linearLayout0 == null) {
                    ibuq.j("actionBarContainer");
                    linearLayout0 = null;
                }
                fuop.h(fuok0, linearLayout0);
            }
        }
        gvbz gvbz0 = this.as;
        if(gvbz0 == null) {
            ibuq.j("categoryOptions");
            gvbz0 = null;
        }
        gvby gvby1 = this.at;
        if(gvby1 == null) {
            ibuq.j("initialCheckedCategoryInfo");
            gvby1 = null;
        }
        dwiz dwiz0 = this.av;
        if(dwiz0 == null) {
            ibuq.j("viewModel");
            dwiz0 = null;
        }
        this.au = new dwip(gvbz0, gvby1, dwiz0);
        RecyclerView recyclerView0 = this.ao;
        if(recyclerView0 == null) {
            ibuq.j("categoriesContainer");
            recyclerView0 = null;
        }
        dwip dwip0 = this.au;
        if(dwip0 == null) {
            ibuq.j("editPassCategoryAdapter");
            dwip0 = null;
        }
        recyclerView0.an(dwip0);
        RecyclerView recyclerView1 = this.ao;
        if(recyclerView1 == null) {
            ibuq.j("categoriesContainer");
            recyclerView1 = null;
        }
        recyclerView1.ap(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.ao;
        if(recyclerView2 == null) {
            ibuq.j("categoriesContainer");
            recyclerView2 = null;
        }
        recyclerView2.A(new dwiy(this.requireContext()));
        RecyclerView recyclerView3 = this.ao;
        if(recyclerView3 == null) {
            ibuq.j("categoriesContainer");
            recyclerView3 = null;
        }
        recyclerView3.D(new dwiw(this));
        ibuq.c(view0);
        fhwk fhwk2 = this.E();
        fhvo fhvo0 = this.E().a.a(205667);
        gjdt gjdt0 = gjds.a(((ProtoLiteMessage)gjdw.a).v_newBuilder());
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        if(hwfk.w()) {
            gjzn gjzn0 = gjzm.a(((ProtoLiteMessage)gkbd.a).v_newBuilder());
            gjzn0.c(this.ax);
            gjzs0.e(gjzn0.a());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkaa.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gvby gvby2 = this.at;
        if(gvby2 == null) {
            ibuq.j("initialCheckedCategoryInfo");
        }
        else {
            gvby0 = gvby2;
        }
        int v1 = gvby0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaa gkaa0 = (gkaa)hftp0.b_message;
        gkaa0.b |= 1;
        gkaa0.c = v1;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((gkaa)hftv2), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp1.b_message;
        ((gkaa)hftv2).getClass();
        gkbe0.c = (gkaa)hftv2;
        gkbe0.b |= 1;
        gjdt0.f(gjzs0.a());
        String s = this.y().a();
        gjdt0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        fhvo0.d(douf.b(gjdt0.a()));
        fhwk2.f(view0, fhvo0);
        return view0;
    }

    public final domj y() {
        domj domj0 = this.ag;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }
}


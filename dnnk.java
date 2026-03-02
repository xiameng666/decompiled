import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dagger.internal.Preconditions;

public final class dnnk extends dokz implements ednc, fshb {
    public static final ibzd a;
    public View ag;
    public Button ah;
    public ComposeActionBar ai;
    public CardView aj;
    public ImageView ak;
    public dnmu al;
    private AppBarLayout am;
    private MaterialToolbar an;
    private NestedScrollView ao;
    private final ibnn ap;
    public dmet b;
    public fuok c;
    public TextInputEditText d;

    static {
        dnnk.a = new ibzd(".*\\d+.*");
    }

    public dnnk() {
        dnng dnng0 = new dnng(new dnnf(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dnng0);
        ibuk ibuk0 = new ibuk(dnnl.class);
        dnnh dnnh0 = new dnnh(ibnn0);
        dnni dnni0 = new dnni(ibnn0);
        this.ap = new lsd(ibuk0, dnnh0, new dnnj(this, ibnn0), dnni0);
    }

    public static final dnnk A(Intent intent0) {
        ibuq.f(intent0, "intent");
        dnnk dnnk0 = new dnnk();
        dnnk0.setArguments(intent0.getExtras());
        return dnnk0;
    }

    public final dnnl B() {
        return (dnnl)this.ap.a();
    }

    public final fuok D() {
        fuok fuok0 = this.c;
        if(fuok0 != null) {
            return fuok0;
        }
        ibuq.j("edgeToEdgeStyler");
        return null;
    }

    // Detected as a lambda impl.
    public final void E() {
        NestedScrollView nestedScrollView0 = this.ao;
        View view0 = null;
        if(nestedScrollView0 == null) {
            ibuq.j("contentScrollView");
            nestedScrollView0 = null;
        }
        if(nestedScrollView0.canScrollVertically(-1)) {
            Context context0 = this.requireContext();
            int v = fipw.c.a(context0);
            xob xob0 = this.an();
            if(xob0 != null) {
                Window window0 = xob0.getWindow();
                if(window0 != null) {
                    window0.setStatusBarColor(v);
                }
            }
            MaterialToolbar materialToolbar0 = this.an;
            if(materialToolbar0 == null) {
                ibuq.j("toolbar");
                materialToolbar0 = null;
            }
            materialToolbar0.setBackgroundColor(v);
        }
        else {
            AppBarLayout appBarLayout0 = this.am;
            if(appBarLayout0 == null) {
                ibuq.j("appBarLayout");
                appBarLayout0 = null;
            }
            appBarLayout0.setBackgroundColor(0);
            MaterialToolbar materialToolbar1 = this.an;
            if(materialToolbar1 == null) {
                ibuq.j("toolbar");
                materialToolbar1 = null;
            }
            materialToolbar1.setBackgroundColor(0);
            xob xob1 = this.an();
            if(xob1 != null) {
                Window window1 = xob1.getWindow();
                if(window1 != null) {
                    window1.setStatusBarColor(0);
                }
            }
        }
        NestedScrollView nestedScrollView1 = this.ao;
        if(nestedScrollView1 == null) {
            ibuq.j("contentScrollView");
            nestedScrollView1 = null;
        }
        if(nestedScrollView1.canScrollVertically(1)) {
            if(hwev.c()) {
                View view1 = this.ag;
                if(view1 == null) {
                    ibuq.j("bottomActionBar");
                    view1 = null;
                }
                view1.setBackgroundColor(fipx.a(this.requireContext(), 0x7F04033A));  // attr:colorSurfaceContainerHigh
                ComposeActionBar composeActionBar0 = this.ai;
                if(composeActionBar0 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar0 = null;
                }
                ComposeActionBar composeActionBar1 = this.ai;
                if(composeActionBar1 == null) {
                    ibuq.j("saveActionBar");
                }
                else {
                    view0 = composeActionBar1;
                }
                composeActionBar0.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, true, null, null, false, 0xFB));
                return;
            }
            View view2 = this.ag;
            if(view2 == null) {
                ibuq.j("bottomActionBar");
            }
            else {
                view0 = view2;
            }
            Context context1 = this.requireContext();
            view0.setBackgroundColor(fipw.c.a(context1));
            return;
        }
        View view3 = this.ag;
        if(view3 == null) {
            ibuq.j("bottomActionBar");
            view3 = null;
        }
        view3.setBackgroundColor(0);
        if(hwev.c()) {
            ComposeActionBar composeActionBar2 = this.ai;
            if(composeActionBar2 == null) {
                ibuq.j("saveActionBar");
                composeActionBar2 = null;
            }
            ComposeActionBar composeActionBar3 = this.ai;
            if(composeActionBar3 == null) {
                ibuq.j("saveActionBar");
            }
            else {
                view0 = composeActionBar3;
            }
            composeActionBar2.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, false, null, null, false, 0xFB));
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G(String s) {
        if(this.getParentFragmentManager().b() > 0) {
            fm fm0 = this.getParentFragmentManager();
            Bundle bundle0 = new Bundle();
            bundle0.putString("fop_nickname", s);
            fm0.ae("nickname", bundle0);
            this.getParentFragmentManager().U();
            return;
        }
        this.at(-1, new Intent().putExtra("fop_nickname", s));
        this.ar();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.al == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            this.al = new dnmu(dolg0, new done());
        }
        dnmu dnmu0 = this.al;
        dmew dmew0 = null;
        if(dnmu0 == null) {
            ibuq.j("injector");
            dnmu0 = null;
        }
        dnmu0.inject(this);
        if(bundle0 == null) {
            dnnl dnnl0 = this.B();
            byte[] arr_b = this.am().getByteArray("fop_payment_method");
            hkhr hkhr0 = null;
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkhr.b), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hkhr0 = (hkhr)hftv0;
                }
                catch(hfur unused_ex) {
                }
            }
            if(hkhr0 != null) {
                dmew0 = dmev.c(hkhr0);
            }
            if(dmew0 != null) {
                dnnl0.a.ii(dmew0);
            }
            String s = this.am().getString("fop_nickname");
            if(s == null) {
                s = "";
            }
            dnnl0.a(s);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E041C : 0x7F0E041B), viewGroup0, false);  // layout:fragment_fop_nickname_foldable_exp
        ibuq.e(view0, "inflate(...)");
        this.ag = view0.findViewById(0x7F0B00EB);  // id:BottomActionBar
        View view1 = view0.findViewById(0x7F0B0239);  // id:Coordinator
        ibuq.e(view1, "findViewById(...)");
        fuop.i(this.D(), view1);
        ComposeActionBar composeActionBar0 = null;
        if(!hwev.c()) {
            int v = this.getResources().getDimensionPixelSize(0x7F070DD3);  // dimen:pay_default_spacing
            fuok fuok0 = this.D();
            View view2 = this.ag;
            if(view2 == null) {
                ibuq.j("bottomActionBar");
                view2 = null;
            }
            fuop.c(fuok0, view2, v);
        }
        this.am = (AppBarLayout)view0.findViewById(0x7F0B0081);  // id:AppBarLayout
        this.an = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
        xni xni0 = (xni)this.requireContext();
        MaterialToolbar materialToolbar0 = this.an;
        if(materialToolbar0 == null) {
            ibuq.j("toolbar");
            materialToolbar0 = null;
        }
        xni0.hG(materialToolbar0);
        im im0 = xni0.hL();
        if(im0 != null) {
            im0.o(true);
            im0.s(false);
            im0.w(0x7F080B26);  // drawable:quantum_gm_ic_close_vd_theme_24
            im0.u(0x7F151C6D);  // string:pay_close_label "Close"
        }
        this.aj = (CardView)view0.findViewById(0x7F0B0198);  // id:CardView
        this.ak = (ImageView)view0.findViewById(0x7F0B0149);  // id:CardArt
        this.B().a.g(this, new dnnd(new dnmv(this, view0)));
        NestedScrollView nestedScrollView0 = (NestedScrollView)view0.findViewById(0x7F0B022A);  // id:ContentScrollView
        this.ao = nestedScrollView0;
        if(nestedScrollView0 == null) {
            ibuq.j("contentScrollView");
            nestedScrollView0 = null;
        }
        nestedScrollView0.setOnScrollChangeListener((/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            NestedScrollView nestedScrollView0 = this.ao;
            View view0 = null;
            if(nestedScrollView0 == null) {
                ibuq.j("contentScrollView");
                nestedScrollView0 = null;
            }
            if(nestedScrollView0.canScrollVertically(-1)) {
                Context context0 = this.requireContext();
                int v = fipw.c.a(context0);
                xob xob0 = this.an();
                if(xob0 != null) {
                    Window window0 = xob0.getWindow();
                    if(window0 != null) {
                        window0.setStatusBarColor(v);
                    }
                }
                MaterialToolbar materialToolbar0 = this.an;
                if(materialToolbar0 == null) {
                    ibuq.j("toolbar");
                    materialToolbar0 = null;
                }
                materialToolbar0.setBackgroundColor(v);
            }
            else {
                AppBarLayout appBarLayout0 = this.am;
                if(appBarLayout0 == null) {
                    ibuq.j("appBarLayout");
                    appBarLayout0 = null;
                }
                appBarLayout0.setBackgroundColor(0);
                MaterialToolbar materialToolbar1 = this.an;
                if(materialToolbar1 == null) {
                    ibuq.j("toolbar");
                    materialToolbar1 = null;
                }
                materialToolbar1.setBackgroundColor(0);
                xob xob1 = this.an();
                if(xob1 != null) {
                    Window window1 = xob1.getWindow();
                    if(window1 != null) {
                        window1.setStatusBarColor(0);
                    }
                }
            }
            NestedScrollView nestedScrollView1 = this.ao;
            if(nestedScrollView1 == null) {
                ibuq.j("contentScrollView");
                nestedScrollView1 = null;
            }
            if(nestedScrollView1.canScrollVertically(1)) {
                if(hwev.c()) {
                    View view1 = this.ag;
                    if(view1 == null) {
                        ibuq.j("bottomActionBar");
                        view1 = null;
                    }
                    view1.setBackgroundColor(fipx.a(this.requireContext(), 0x7F04033A));  // attr:colorSurfaceContainerHigh
                    ComposeActionBar composeActionBar0 = this.ai;
                    if(composeActionBar0 == null) {
                        ibuq.j("saveActionBar");
                        composeActionBar0 = null;
                    }
                    ComposeActionBar composeActionBar1 = this.ai;
                    if(composeActionBar1 == null) {
                        ibuq.j("saveActionBar");
                    }
                    else {
                        view0 = composeActionBar1;
                    }
                    composeActionBar0.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, true, null, null, false, 0xFB));
                    return;
                }
                View view2 = this.ag;
                if(view2 == null) {
                    ibuq.j("bottomActionBar");
                }
                else {
                    view0 = view2;
                }
                Context context1 = this.requireContext();
                view0.setBackgroundColor(fipw.c.a(context1));
                return;
            }
            View view3 = this.ag;
            if(view3 == null) {
                ibuq.j("bottomActionBar");
                view3 = null;
            }
            view3.setBackgroundColor(0);
            if(hwev.c()) {
                ComposeActionBar composeActionBar2 = this.ai;
                if(composeActionBar2 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar2 = null;
                }
                ComposeActionBar composeActionBar3 = this.ai;
                if(composeActionBar3 == null) {
                    ibuq.j("saveActionBar");
                }
                else {
                    view0 = composeActionBar3;
                }
                composeActionBar2.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, false, null, null, false, 0xFB));
            }
        });
        NestedScrollView nestedScrollView1 = this.ao;
        if(nestedScrollView1 == null) {
            ibuq.j("contentScrollView");
            nestedScrollView1 = null;
        }
        nestedScrollView1.addOnLayoutChangeListener((/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            NestedScrollView nestedScrollView0 = this.ao;
            View view0 = null;
            if(nestedScrollView0 == null) {
                ibuq.j("contentScrollView");
                nestedScrollView0 = null;
            }
            if(nestedScrollView0.canScrollVertically(-1)) {
                Context context0 = this.requireContext();
                int v = fipw.c.a(context0);
                xob xob0 = this.an();
                if(xob0 != null) {
                    Window window0 = xob0.getWindow();
                    if(window0 != null) {
                        window0.setStatusBarColor(v);
                    }
                }
                MaterialToolbar materialToolbar0 = this.an;
                if(materialToolbar0 == null) {
                    ibuq.j("toolbar");
                    materialToolbar0 = null;
                }
                materialToolbar0.setBackgroundColor(v);
            }
            else {
                AppBarLayout appBarLayout0 = this.am;
                if(appBarLayout0 == null) {
                    ibuq.j("appBarLayout");
                    appBarLayout0 = null;
                }
                appBarLayout0.setBackgroundColor(0);
                MaterialToolbar materialToolbar1 = this.an;
                if(materialToolbar1 == null) {
                    ibuq.j("toolbar");
                    materialToolbar1 = null;
                }
                materialToolbar1.setBackgroundColor(0);
                xob xob1 = this.an();
                if(xob1 != null) {
                    Window window1 = xob1.getWindow();
                    if(window1 != null) {
                        window1.setStatusBarColor(0);
                    }
                }
            }
            NestedScrollView nestedScrollView1 = this.ao;
            if(nestedScrollView1 == null) {
                ibuq.j("contentScrollView");
                nestedScrollView1 = null;
            }
            if(nestedScrollView1.canScrollVertically(1)) {
                if(hwev.c()) {
                    View view1 = this.ag;
                    if(view1 == null) {
                        ibuq.j("bottomActionBar");
                        view1 = null;
                    }
                    view1.setBackgroundColor(fipx.a(this.requireContext(), 0x7F04033A));  // attr:colorSurfaceContainerHigh
                    ComposeActionBar composeActionBar0 = this.ai;
                    if(composeActionBar0 == null) {
                        ibuq.j("saveActionBar");
                        composeActionBar0 = null;
                    }
                    ComposeActionBar composeActionBar1 = this.ai;
                    if(composeActionBar1 == null) {
                        ibuq.j("saveActionBar");
                    }
                    else {
                        view0 = composeActionBar1;
                    }
                    composeActionBar0.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, true, null, null, false, 0xFB));
                    return;
                }
                View view2 = this.ag;
                if(view2 == null) {
                    ibuq.j("bottomActionBar");
                }
                else {
                    view0 = view2;
                }
                Context context1 = this.requireContext();
                view0.setBackgroundColor(fipw.c.a(context1));
                return;
            }
            View view3 = this.ag;
            if(view3 == null) {
                ibuq.j("bottomActionBar");
                view3 = null;
            }
            view3.setBackgroundColor(0);
            if(hwev.c()) {
                ComposeActionBar composeActionBar2 = this.ai;
                if(composeActionBar2 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar2 = null;
                }
                ComposeActionBar composeActionBar3 = this.ai;
                if(composeActionBar3 == null) {
                    ibuq.j("saveActionBar");
                }
                else {
                    view0 = composeActionBar3;
                }
                composeActionBar2.d(ftuw.a(((ComposeActionBar)view0).b(), null, null, false, null, null, false, 0xFB));
            }
        });
        View view3 = view0.findViewById(0x7F0B05F3);  // id:NicknameLayout
        ibuq.e(view3, "findViewById(...)");
        ((TextInputLayout)view3).B(25);
        ((TextInputLayout)view3).A(true);
        TextInputEditText textInputEditText0 = (TextInputEditText)view0.findViewById(0x7F0B05EC);  // id:Nickname
        this.d = textInputEditText0;
        if(textInputEditText0 == null) {
            ibuq.j("nicknameView");
            textInputEditText0 = null;
        }
        textInputEditText0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(25)});
        textInputEditText0.addTextChangedListener(new dnne(this, ((TextInputLayout)view3), textInputEditText0));
        this.B().b.g(this.getViewLifecycleOwner(), new dnnd(new dnmx(this)));
        if(hwev.c()) {
            this.ai = (ComposeActionBar)view0.findViewById(0x7F0B074A);  // id:SaveActionBar
            ftuw ftuw0 = new ftuw(new ftts(new fryr(0x7F151C1C), null, false, null, null, null, 0, null, null, new dnnb(this), 510), null, false, null, null, null, null, false, 0xFE);  // string:pay_button_save "Save"
            ComposeActionBar composeActionBar1 = this.ai;
            if(composeActionBar1 == null) {
                ibuq.j("saveActionBar");
                composeActionBar1 = null;
            }
            composeActionBar1.d(ftuw0);
            ComposeActionBar composeActionBar2 = this.ai;
            if(composeActionBar2 == null) {
                ibuq.j("saveActionBar");
            }
            else {
                composeActionBar0 = composeActionBar2;
            }
            composeActionBar0.setVisibility(0);
        }
        else {
            Button button0 = (Button)view0.findViewById(0x7F0B0749);  // id:Save
            this.ah = button0;
            if(button0 == null) {
                ibuq.j("saveButton");
                button0 = null;
            }
            button0.setOnClickListener(new dnmw(this));
            Button button1 = this.ah;
            if(button1 == null) {
                ibuq.j("saveButton");
            }
            else {
                composeActionBar0 = button1;
            }
            ((Button)composeActionBar0).setVisibility(0);
        }
        if(hwev.c()) {
            kex.b(view0, new dnmy(this));
        }
        return view0;
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.at(0, null);
            this.ar();
        }
        return false;
    }

    public final dmet y() {
        dmet dmet0 = this.b;
        if(dmet0 != null) {
            return dmet0;
        }
        ibuq.j("cardArtLoader");
        return null;
    }
}


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public final class aafw extends aalc {
    public aary a;
    public aanx ag;
    public AppBarLayout ah;
    public ProductLockupToolbar ai;
    public TextView aj;
    public TextView ak;
    public AppBarBehavior al;
    private CollapsingToolbarLayout am;
    private final aafn an;
    public aahe b;
    public fnle c;
    public fntt d;

    public aafw() {
        this.an = new aafn(this);
    }

    public final fnle A() {
        fnle fnle0 = this.c;
        if(fnle0 != null) {
            return fnle0;
        }
        ibuq.j("accountMenuManager");
        return null;
    }

    @Override  // aakz
    public final void B(aanx aanx0) {
        if(this.D((aanx0 == null ? null : aanx0.a))) {
            aakz aakz0 = this.y();
            if(aakz0 != null) {
                aakz0.B(aanx0);
            }
        }
    }

    public final void C(boolean z) {
        AppBarLayout appBarLayout0 = this.ah;
        CollapsingToolbarLayout collapsingToolbarLayout0 = null;
        if(appBarLayout0 == null) {
            ibuq.j("appbarLayout");
            appBarLayout0 = null;
        }
        appBarLayout0.m(z, false);
        CollapsingToolbarLayout collapsingToolbarLayout1 = this.am;
        if(collapsingToolbarLayout1 == null) {
            ibuq.j("collapsingToolbar");
            collapsingToolbarLayout1 = null;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = collapsingToolbarLayout1.getLayoutParams();
        ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        viewGroup$LayoutParams0.height = z ? -2 : this.getResources().getDimensionPixelSize(0x7F07018F);  // dimen:as_collapsing_toolbar_layout_collapsed_height
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.am;
        if(collapsingToolbarLayout2 == null) {
            ibuq.j("collapsingToolbar");
            collapsingToolbarLayout2 = null;
        }
        collapsingToolbarLayout2.setLayoutParams(viewGroup$LayoutParams0);
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.am;
        if(collapsingToolbarLayout3 == null) {
            ibuq.j("collapsingToolbar");
        }
        else {
            collapsingToolbarLayout0 = collapsingToolbarLayout3;
        }
        collapsingToolbarLayout0.requestLayout();
    }

    @Override  // aakz
    public final boolean D(zho zho0) {
        this.z();
        if(zho0 != null) {
            grul grul0 = zho0.a();
            if(grul0 != null && ((grul0.g == null ? grvg.a : grul0.g).b & 0x800) != 0) {
                aakz aakz0 = this.y();
                return aakz0 != null && aakz0.D(zho0);
            }
        }
        return false;
    }

    public final void E() {
        if(this.b != null) {
            return;
        }
        ibuq.j("fragmentFactory");
    }

    private static final void F(ViewGroup viewGroup0) {
        viewGroup0.setTouchscreenBlocksFocus(false);
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 10 && v1 == -1 && intent0 != null) {
            String s = intent0.getStringExtra("authAccount");
            if(s != null) {
                this.z().a(s);
            }
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        ((aafo)zgm.a(aafo.class, this)).a(this);
        super.onAttach(context0);
        if(hoju.k()) {
            lpg lpg0 = this.getLifecycle();
            fntt fntt0 = this.d;
            if(fntt0 == null) {
                ibuq.j("accountsModelUpdater");
                fntt0 = null;
            }
            lpg0.c(fntt0);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        aakz aakz0;
        ibuq.f(layoutInflater0, "layoutInflater");
        Window window0 = ((xob)this.requireContext()).getWindow();
        if(window0 != null) {
            window0.setStatusBarColor(0);
        }
        View view0 = layoutInflater0.inflate(0x7F0E00B7, viewGroup0, false);  // layout:as_appbar_fragment
        if(hoju.a.b().p()) {
            View view1 = view0.findViewById(0x7F0B188A);  // id:main_content
            ibuq.e(view1, "findViewById(...)");
            if(this.requireContext().getResources().getConfiguration().orientation == 2) {
                kex.b(view1, new aafk());
            }
        }
        AppBarLayout appBarLayout0 = (AppBarLayout)view0.findViewById(0x7F0B0BD1);  // id:appbar
        this.ah = appBarLayout0;
        ProductLockupToolbar productLockupToolbar0 = null;
        if(appBarLayout0 == null) {
            ibuq.j("appbarLayout");
            appBarLayout0 = null;
        }
        AppBarLayout appBarLayout1 = this.ah;
        if(appBarLayout1 == null) {
            ibuq.j("appbarLayout");
            appBarLayout1 = null;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = appBarLayout1.getLayoutParams();
        ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        jtl jtl0 = ((jto)viewGroup$LayoutParams0).a;
        ibuq.d(jtl0, "null cannot be cast to non-null type com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior");
        this.al = (AppBarBehavior)jtl0;
        AppBarLayout appBarLayout2 = this.ah;
        if(appBarLayout2 == null) {
            ibuq.j("appbarLayout");
            appBarLayout2 = null;
        }
        this.am = (CollapsingToolbarLayout)appBarLayout2.findViewById(0x7F0B0F34);  // id:collapsing_toolbar
        ProductLockupToolbar productLockupToolbar1 = (ProductLockupToolbar)appBarLayout0.findViewById(0x7F0B22D9);  // id:toolbar
        this.ai = productLockupToolbar1;
        if(productLockupToolbar1 == null) {
            ibuq.j("toolbar");
            productLockupToolbar1 = null;
        }
        aafw.F(productLockupToolbar1);
        AppBarLayout appBarLayout3 = this.ah;
        if(appBarLayout3 == null) {
            ibuq.j("appbarLayout");
            appBarLayout3 = null;
        }
        appBarLayout3.i(new aafh(this));
        ProductLockupToolbar productLockupToolbar2 = this.ai;
        if(productLockupToolbar2 == null) {
            ibuq.j("toolbar");
            productLockupToolbar2 = null;
        }
        productLockupToolbar2.z = new aafi(this);
        ProductLockupToolbar productLockupToolbar3 = this.ai;
        if(productLockupToolbar3 == null) {
            ibuq.j("toolbar");
            productLockupToolbar3 = null;
        }
        productLockupToolbar3.R(new aafj(this));
        ProductLockupToolbar productLockupToolbar4 = this.ai;
        if(productLockupToolbar4 == null) {
            ibuq.j("toolbar");
            productLockupToolbar4 = null;
        }
        productLockupToolbar4.V(true, true);
        Context context0 = this.requireContext();
        iz iz0 = (context0 instanceof iz) ? ((iz)context0) : null;
        if(iz0 != null) {
            ProductLockupToolbar productLockupToolbar5 = this.ai;
            if(productLockupToolbar5 == null) {
                ibuq.j("toolbar");
                productLockupToolbar5 = null;
            }
            iz0.f(productLockupToolbar5);
        }
        this.aj = (TextView)appBarLayout0.findViewById(0x7F0B1345);  // id:expanded_title
        this.ak = (TextView)appBarLayout0.findViewById(0x7F0B0F30);  // id:collapsed_title
        AppBarLayout appBarLayout4 = this.ah;
        if(appBarLayout4 == null) {
            ibuq.j("appbarLayout");
            appBarLayout4 = null;
        }
        aafw.F(appBarLayout4);
        if(bundle0 == null) {
            this.z();
            aanx aanx0 = this.ag;
            if(aanx0 == null) {
                ibuq.j("initialNavStackHead");
                aanx0 = null;
            }
            ibuq.f(aanx0, "navStackHead");
            grxw grxw0 = aanx0.a.a.e == null ? grxw.a : aanx0.a.a.e;
            ibuq.e(grxw0, "getResourceKey(...)");
            aasb aasb0 = (aanx0.a.a().b & 0x20) == 0 ? new aasc(grxw0) : new aasb(grxw0);
            if((aasb0 instanceof aasb)) {
                this.E();
                aakz0 = aahe.a(aasb0.a);
                goto label_91;
            }
            else {
                if(!(aasb0 instanceof aasc)) {
                    throw new ibnq();
                }
                this.E();
                aakz0 = aahe.b(((aasc)aasb0).a);
            label_91:
                if(this.ao) {
                    aakz0.G(this.ap);
                }
                aakv.d(this, aakz0, "inner_fragment", aaku.a);
            }
        }
        if(hoju.k()) {
            ProductLockupToolbar productLockupToolbar6 = this.ai;
            if(productLockupToolbar6 == null) {
                ibuq.j("toolbar");
            }
            else {
                productLockupToolbar0 = productLockupToolbar6;
            }
            SelectedAccountDisc selectedAccountDisc0 = (SelectedAccountDisc)productLockupToolbar0.findViewById(0x7F0B1F9E);  // id:selected_account_disc
            selectedAccountDisc0.setOnClickListener(new aafm(this));
            fnma.a(this, this.A(), selectedAccountDisc0);
        }
        ibuq.c(view0);
        return view0;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        if(hoju.k()) {
            this.A().b.d(this.an);
        }
    }

    @Override  // aakz
    public final void onResume() {
        super.onResume();
        if(hoju.k()) {
            this.A().b.c(this.an);
            gged_interceptors gged0 = this.A().b.f();
            this.an.a(gged0);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        lsa.a(this.z().g).g(this.getViewLifecycleOwner(), new aafv(new aafp(this)));
        lsa.a(this.z().h).g(this.getViewLifecycleOwner(), new aafv(new aafq(this)));
        lsa.a(this.z().j).g(this.getViewLifecycleOwner(), new aafv(new aafr(this)));
        lsa.a(this.z().i).g(this.getViewLifecycleOwner(), new aafv(new aafs(this)));
        lsa.a(this.z().k).g(this.getViewLifecycleOwner(), new aafv(new aaft(this)));
        fhrx.b(this.z().l, this.getViewLifecycleOwner(), new aafu(this));
    }

    @Override  // aalc
    protected final aakz y() {
        du du0 = this.getChildFragmentManager().h("inner_fragment");
        return (du0 instanceof aakz) ? ((aakz)du0) : null;
    }

    public final aary z() {
        aary aary0 = this.a;
        if(aary0 != null) {
            return aary0;
        }
        ibuq.j("viewModel");
        return null;
    }
}


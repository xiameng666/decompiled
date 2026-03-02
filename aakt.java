import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.gms.accountsettings.widget.WelcomeHeaderCollapsingView;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.AppBarLayout;

public final class aakt extends aalc {
    public aarm a;
    public aanx ag;
    public AppBarLayout ah;
    public ProductLockupToolbar ai;
    public WelcomeHeaderCollapsingView aj;
    public aald ak;
    private final aakk al;
    public aahe b;
    public fnle c;
    public fntt d;

    public aakt() {
        this.al = new aakk(this);
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

    @Override  // aakz
    public final boolean D(zho zho0) {
        aarm aarm0 = this.z();
        if(zho0 != null) {
            grul grul0 = zho0.a();
            if(grul0 != null && ((ibuq.m(zhp.e(grul0), aarm0.c.a) || ibuq.m(zhp.c(grul0), aarm0.c.b)) && (zhp.l(grul0) || zhp.k(grul0)) == aarm0.c.e)) {
                aakz aakz0 = this.y();
                return aakz0 != null && aakz0.D(zho0);
            }
        }
        return false;
    }

    // Detected as a lambda impl.
    public final void E() {
        this.z().m.e();
    }

    public final void F() {
        if(this.b != null) {
            return;
        }
        ibuq.j("fragmentFactory");
    }

    private static final void H(ViewGroup viewGroup0) {
        viewGroup0.setTouchscreenBlocksFocus(false);
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 10 && v1 == -1 && intent0 != null) {
            String s = intent0.getStringExtra("authAccount");
            if(s != null) {
                this.z().c(s);
            }
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        ((aakl)zgm.a(aakl.class, this)).j(this);
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
        aaqx aaqx0;
        ibuq.f(layoutInflater0, "layoutInflater");
        Window window0 = ((xob)this.requireContext()).getWindow();
        if(window0 != null) {
            window0.setStatusBarColor(0);
        }
        View view0 = layoutInflater0.inflate((hoju.j() ? 0x7F0E00EE : 0x7F0E00EF), viewGroup0, false);  // layout:as_welcome_header_fragment
        AppBarLayout appBarLayout0 = (AppBarLayout)view0.findViewById(0x7F0B0BD1);  // id:appbar
        this.ah = appBarLayout0;
        ProductLockupToolbar productLockupToolbar0 = null;
        if(appBarLayout0 == null) {
            ibuq.j("appbarLayout");
            appBarLayout0 = null;
        }
        appBarLayout0.e = true;
        AppBarLayout appBarLayout1 = this.ah;
        if(appBarLayout1 == null) {
            ibuq.j("appbarLayout");
            appBarLayout1 = null;
        }
        if(this.ak == null) {
            ibuq.j("windowManagerHelper");
        }
        View view1 = layoutInflater0.inflate((aald.b(this.requireContext()) || !aabu.q(this.requireContext()) || this.z().c.a == null ? 0x7F0E00ED : 0x7F0E00EC), appBarLayout1, false);  // layout:as_welcome_header_compact_layout
        appBarLayout1.addView(view1);
        ccho.b(view1);
        ProductLockupToolbar productLockupToolbar1 = (ProductLockupToolbar)appBarLayout1.findViewById(0x7F0B22D9);  // id:toolbar
        this.ai = productLockupToolbar1;
        if(productLockupToolbar1 == null) {
            ibuq.j("toolbar");
            productLockupToolbar1 = null;
        }
        aakt.H(productLockupToolbar1);
        WelcomeHeaderCollapsingView welcomeHeaderCollapsingView0 = (WelcomeHeaderCollapsingView)appBarLayout1.findViewById(0x7F0B0F33);  // id:collapsing_content
        this.aj = welcomeHeaderCollapsingView0;
        if(welcomeHeaderCollapsingView0 != null) {
            aake aake0 = new aake(this);
            welcomeHeaderCollapsingView0.e.setOnClickListener(aake0);
        }
        if(!hoju.k()) {
            WelcomeHeaderCollapsingView welcomeHeaderCollapsingView1 = this.aj;
            if(welcomeHeaderCollapsingView1 != null) {
                aakf aakf0 = new aakf(this);
                welcomeHeaderCollapsingView1.b.setOnClickListener(aakf0);
            }
        }
        AppBarLayout appBarLayout2 = this.ah;
        if(appBarLayout2 == null) {
            ibuq.j("appbarLayout");
            appBarLayout2 = null;
        }
        appBarLayout2.i(this.aj);
        AppBarLayout appBarLayout3 = this.ah;
        if(appBarLayout3 == null) {
            ibuq.j("appbarLayout");
            appBarLayout3 = null;
        }
        ProductLockupToolbar productLockupToolbar2 = this.ai;
        if(productLockupToolbar2 == null) {
            ibuq.j("toolbar");
            productLockupToolbar2 = null;
        }
        appBarLayout3.i(productLockupToolbar2);
        ProductLockupToolbar productLockupToolbar3 = this.ai;
        if(productLockupToolbar3 == null) {
            ibuq.j("toolbar");
            productLockupToolbar3 = null;
        }
        productLockupToolbar3.z = new aakg(this);
        ProductLockupToolbar productLockupToolbar4 = this.ai;
        if(productLockupToolbar4 == null) {
            ibuq.j("toolbar");
            productLockupToolbar4 = null;
        }
        productLockupToolbar4.R(new aakh(this));
        AppBarLayout appBarLayout4 = this.ah;
        if(appBarLayout4 == null) {
            ibuq.j("appbarLayout");
            appBarLayout4 = null;
        }
        appBarLayout4.h(new aaki(this));
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
        AppBarLayout appBarLayout5 = this.ah;
        if(appBarLayout5 == null) {
            ibuq.j("appbarLayout");
            appBarLayout5 = null;
        }
        aakt.H(appBarLayout5);
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
            grul grul0 = aanx0.a.a();
            grxw grxw1 = zhp.d(grul0);
            grxw grxw2 = zhp.a(grul0);
            if(grxw1 != null && grxw2 != null) {
                aaqx0 = new aaqx(grxw1, grxw2, aanx0);
            }
            else if((grul0.b & 0x20) == 0) {
                aaqx0 = new aaqw(grxw0);
            }
            else {
                aaqx0 = new aaqv(grxw0);
            }
            if((aaqx0 instanceof aaqx)) {
                this.F();
                aapa aapa0 = aapa.a(aaqx0.a, aaqx0.b);
                aakz0 = new aaiu();
                aakz0.c = aaqx0.c;
                Bundle bundle1 = new Bundle();
                bundle1.putByteArray("topNavKey", aapa0.a.toBytesArray());
                bundle1.putByteArray("leftNavKey", aapa0.b.toBytesArray());
                aakz0.setArguments(bundle1);
                goto label_115;
            }
            else if((aaqx0 instanceof aaqv)) {
                this.F();
                aakz0 = aahe.a(((aaqv)aaqx0).a);
                goto label_115;
            }
            else {
                if(!(aaqx0 instanceof aaqw)) {
                    throw new ibnq();
                }
                this.F();
                aakz0 = aahe.b(((aaqw)aaqx0).a);
            label_115:
                if(this.ao) {
                    aakz0.G(this.ap);
                }
                aanx aanx1 = this.ag;
                if(aanx1 == null) {
                    ibuq.j("initialNavStackHead");
                    aanx1 = null;
                }
                aakv.a(aakz0, aanx1.b);
                aakv.d(this, aakz0, "inner_fragment", aaku.a);
            }
        }
        if(hoju.k()) {
            ViewGroup viewGroup1 = this.aj == null ? null : ((ViewGroup)this.aj.findViewById(0x7F0B0A57));  // id:accountSwitchContainer
            if(viewGroup1 != null) {
                fnlw fnlw0 = fnlw.a(this, this.A(), viewGroup1);
                fnlw0.c = () -> this.z().m.e();
                fnlw0.b();
            }
            ProductLockupToolbar productLockupToolbar6 = this.ai;
            if(productLockupToolbar6 == null) {
                ibuq.j("toolbar");
            }
            else {
                productLockupToolbar0 = productLockupToolbar6;
            }
            SelectedAccountDisc selectedAccountDisc0 = (SelectedAccountDisc)productLockupToolbar0.findViewById(0x7F0B1F9E);  // id:selected_account_disc
            selectedAccountDisc0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> this.z().m.e());
            fnma.a(this, this.A(), selectedAccountDisc0);
        }
        ibuq.c(view0);
        return view0;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        if(hoju.k()) {
            this.A().b.d(this.al);
        }
    }

    @Override  // aakz
    public final void onResume() {
        super.onResume();
        if(hoju.k()) {
            this.A().b.c(this.al);
            gged_interceptors gged0 = this.A().b.f();
            this.al.a(gged0);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.z().f.g(this.getViewLifecycleOwner(), new aaks(new aakm(this)));
        this.z().g.g(this.getViewLifecycleOwner(), new aaks(new aakn(this)));
        this.z().i.g(this.getViewLifecycleOwner(), new aaks(new aako(this)));
        this.z().h.g(this.getViewLifecycleOwner(), new aaks(new aakp(this)));
        this.z().j.g(this.getViewLifecycleOwner(), new aaks(new aakq(this)));
        fhrx.b(this.z().k, this.getViewLifecycleOwner(), new aakr(this));
    }

    @Override  // aalc
    protected final aakz y() {
        du du0 = this.getChildFragmentManager().h("inner_fragment");
        return (du0 instanceof aakz) ? ((aakz)du0) : null;
    }

    public final aarm z() {
        aarm aarm0 = this.a;
        if(aarm0 != null) {
            return aarm0;
        }
        ibuq.j("viewModel");
        return null;
    }
}


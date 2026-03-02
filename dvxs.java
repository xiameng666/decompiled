import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.material.appbar.AppBarLayout;
import dagger.internal.Preconditions;
import java.util.ArrayList;

public final class dvxs extends dokz implements douk {
    final gfsx a;
    public int ag;
    public int ah;
    public boolean ai;
    public boolean aj;
    azts ak;
    private static final bboh al;
    private View am;
    private SlidingPaneLayout an;
    private Intent ao;
    private dvth ap;
    private dvsx aq;
    private gged_interceptors ar;
    private AppBarLayout as;
    private View at;
    private ValuableDetailUnifiedFragment au;
    gfsx b;
    Account c;
    edrp d;

    static {
        dvxs.al = bboh.b("Pay", bbcu.cZ);
    }

    public dvxs() {
        this.a = gfqx.a;
        this.ag = 0;
        this.ah = 0;
        this.ai = true;
        this.aj = true;
    }

    @Override  // douk
    public final douj A() {
        return douj.c;
    }

    final void B(gged_interceptors gged0, dvth dvth0, AppBarLayout appBarLayout0, View view0, dvsx dvsx0) {
        this.ap = dvth0;
        this.ar = gged0;
        this.as = appBarLayout0;
        this.at = view0;
        this.aq = dvsx0;
    }

    private final void D() {
        dvxj dvxj0 = dvxj.B(this.ao);
        Context context0 = this.getContext();
        dvxq dvxq0 = new dvxq(this, context0);
        dvxr dvxr0 = new dvxr(this, context0);
        dvuz dvuz0 = new dvuz(this.requireContext());
        dvuz0.a(this, this.ap, dvxj0, dvxj0, dvxj0, dvxj0, dvxq0, this.aq);
        dvuz0.e(((Valuable)this.b.d()), this.ar);
        dvuz0.setTag(((Valuable)this.b.d()).b);
        this.am.setVisibility(8);
        this.an.setVisibility(0);
        ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0 = ValuableDetailUnifiedFragment.y(this.ar, ((Valuable)this.b.d()), false);
        this.au = valuableDetailUnifiedFragment0;
        valuableDetailUnifiedFragment0.E((this.d.b ? ((Valuable)this.b.d()).n() : ggna.a), this.ap, this.aq, dvxr0, dvuz0);
        View view0 = this.getView();
        if(view0 != null) {
            FrameLayout frameLayout0 = (FrameLayout)view0.findViewById(0x7F0B097C);  // id:ValuableDetailPage
            frameLayout0.removeAllViews();
            frameLayout0.addView(dvuz0);
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.C();
            ca0.G(0x7F0B097D, this.au);  // id:ValuableDetailUnifiedFragment
            ca0.j = 0x1003;
            ca0.a();
            if(this.at != null && hwvp.c()) {
                Context context1 = this.at.getContext();
                int v = fipw.c.a(context1);
                this.at.setBackgroundColor(v);
                if(context0 != null) {
                    ((xob)context0).getWindow().setNavigationBarColor(v);
                }
            }
        }
    }

    @Override  // dokz
    public final void au(du du0) {
        ca ca0 = new ca(this.getParentFragmentManager());
        ca0.t(0x7F0B03E8, du0);  // id:FoldableView
        ca0.n(this);
        ca0.w(null);
        ca0.b();
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dvrb dvrb0 = new dvrb(dolg0, dxee.a(doly0));
        this.a.f(dvrb0);
        dvrb0.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null && bundle0.containsKey("valuable_ids")) {
            this.ar = gged_interceptors.i(bundle0.getStringArrayList("valuable_ids"));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0DF6, viewGroup0, false);  // layout:wallet_valuable_multipane_layout
        View view1 = view0.findViewById(0x7F0B06DA);  // id:ProgressBarContainer
        this.am = view1;
        view1.setVisibility(0);
        this.an = (SlidingPaneLayout)view0.findViewById(0x7F0B05C5);  // id:MultipaneView
        return view0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            ((ggtj)dvxs.al.i()).x("Null arguments for new fragment");
        }
        else {
            this.b = gfsx.l(((Valuable)bundle0.getParcelable("VALUABLE")));
            this.ao = (Intent)bundle0.getParcelable("ORIGINAL_INTENT");
            this.ar = gged_interceptors.i(bundle0.getStringArrayList("valuable_ids"));
            if(this.ao == null) {
                ((ggtj)dvxs.al.i()).x("No arguments for fragment.");
            }
            this.D();
        }
        if(this.b.i()) {
            this.D();
        }
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putStringArrayList("valuable_ids", new ArrayList(this.ar));
    }

    public static dvxs y(Intent intent0) {
        dvxs dvxs0 = new dvxs();
        dvxs0.setArguments(intent0.getExtras());
        return dvxs0;
    }

    public final void z(Context context0, int v, int v1) {
        int v2 = fipw.a.a(context0);
        int v3 = fipw.c.a(context0);
        int v4 = v != 0 || v1 != 0 ? v3 : v2;
        AppBarLayout appBarLayout0 = this.as;
        if(appBarLayout0 != null) {
            appBarLayout0.setBackgroundColor(v4);
        }
        ((xob)context0).getWindow().setStatusBarColor(v4);
        View view0 = this.at;
        if(view0 != null) {
            if(this.ai || this.aj) {
                v2 = v3;
            }
            view0.setBackgroundColor(v2);
            ((xob)context0).getWindow().setNavigationBarColor(v2);
        }
    }
}


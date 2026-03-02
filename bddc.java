import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public final class bddc extends bdeb {
    public beug a;
    private final ibnn ag;
    public bgnm b;
    public bfom c;
    public bfnb d;

    public bddc() {
        bdcy bdcy0 = new bdcy(new bdcx(this));
        ibnn ibnn0 = ibno.a(ibnp.c, bdcy0);
        ibuk ibuk0 = new ibuk(bddm.class);
        bdcz bdcz0 = new bdcz(ibnn0);
        bdda bdda0 = new bdda(ibnn0);
        this.ag = new lsd(ibuk0, bdcz0, new bddb(this, ibnn0), bdda0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setHasOptionsMenu(true);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0872, viewGroup0, false);  // layout:pwm_move_passwords_screen
        if(hsam.f()) {
            ibuq.c(view0);
            ((LinearLayout)view0.findViewById(0x7F0B1941)).setFitsSystemWindows(true);  // id:move_passwords_screen_root
        }
        Resources resources0 = this.getResources();
        ibuq.e(resources0, "getResources(...)");
        List list0 = this.y().e;
        bfom bfom0 = null;
        bdea bdea0 = new bdea(new bdcv(this.y()));
        this.y().g.g(this.getViewLifecycleOwner(), new bdcw(new bdcu(bdea0)));
        ((RecyclerView)view0.findViewById(0x7F0B1BEF)).an(new qq(new tk[]{new bddr(resources0, (list0.size() == 1 ? ((String)list0.get(0)) : null)), bdea0}));  // id:password_move_recycler_view
        MaterialButton materialButton0 = (MaterialButton)view0.findViewById(0x7F0B193D);  // id:move_passwords_confirmation_button
        materialButton0.setOnClickListener(new bdch(this));
        this.y().m.g(this.getViewLifecycleOwner(), new bdcw(new bdco(materialButton0)));
        this.y().o.g(this.getViewLifecycleOwner(), new bdcw(new bdcp(materialButton0)));
        this.y().q.g(this.getViewLifecycleOwner(), new bdcw(new bdcq(materialButton0)));
        this.y().k.g(this.getViewLifecycleOwner(), new bdcw(new bdcr(this)));
        this.getChildFragmentManager().af("account_selection_dialog_request_key", this, new bdcs(this));
        this.y().i.g(this.getViewLifecycleOwner(), new bdcw(new bdct(materialButton0, this)));
        this.y().u.g(this.getViewLifecycleOwner(), new bdcw(new bdci(this)));
        this.y().s.g(this.getViewLifecycleOwner(), new bdcw(new bdcj(this)));
        this.y().w.g(this.getViewLifecycleOwner(), new bdcw(new bdck(this)));
        this.y().y.g(this.getViewLifecycleOwner(), new bdcw(new bdcl(this)));
        ((MaterialToolbar)view0.findViewById(0x7F0B1942)).x(new bdcm(this));  // id:move_passwords_screen_toolbar
        view0.findViewById(0x7F0B1940).setVisibility(0);  // id:move_passwords_screen_appbar
        bfom bfom1 = this.c;
        if(bfom1 == null) {
            ibuq.j("screenLockAuthentication");
        }
        else {
            bfom0 = bfom1;
        }
        this.d = bfom0.a("resume", new bdcn(this));
        ibuq.c(view0);
        return view0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        bfnb bfnb0 = this.d;
        if(bfnb0 == null) {
            ibuq.j("resumeScreenLockAuthenticationLauncher");
            bfnb0 = null;
        }
        bfnb0.a();
    }

    public final bddm y() {
        return (bddm)this.ag.a();
    }

    public final beug z() {
        beug beug0 = this.a;
        if(beug0 != null) {
            return beug0;
        }
        ibuq.j("navigationController");
        return null;
    }
}


import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.romanesco.ui.restore.promo.FastScroller;
import com.google.android.gms.romanesco.ui.restore.util.FastScrollbar;

public final class ekia extends du {
    public ekhr a;
    lqd ag;
    public FastScrollbar ah;
    fyxp ai;
    private FastScroller aj;
    public ekjq b;
    public ejyv c;
    public SwipeRefreshLayout d;

    final void A() {
        fyxp.s(((xob)this.getContext()).findViewById(0x1020002), 0x7F1508E3, -2).i();  // string:common_something_went_wrong "Something went wrong"
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.b = (ekjq)new lso(((xob)this.getContext()), ekjr.d(this.getContext())).a(ekjq.class);
        String s = this.c.i();
        String s1 = this.c.j();
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(this.c.b() == 0) {
                ejze.a().d("CRCF.restorable_contact_count_not_populated");
                this.A();
                this.y();
            }
            lqd lqd0 = this.b.a(s, s1, this.b.j());
            this.ag = lqd0;
            lqd0.g(this, new ekhs(this));
            return;
        }
        ejze.a().d("CRCF.restore_account_or_backup_not_populated");
    }

    @Override  // du
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.ah.onConfigurationChanged(configuration0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08C3, viewGroup0, false);  // layout:romanesco_contacts_restore_contacts_fragment
        Context context0 = this.getContext().getApplicationContext();
        this.c = ejyv.d(context0);
        xni xni0 = (xni)this.getContext();
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
        xni0.hG(toolbar0);
        xni0.hL().B(this.c.k());
        xni0.hL().o(true);
        toolbar0.e().setAutoMirrored(true);
        toolbar0.x(new ekht(this));
        view0.findViewById(0x7F0B166C).setVisibility(4);  // id:help_and_feedback
        if(this.c.c) {
            Button button0 = (Button)view0.findViewById(0x7F0B1E68);  // id:restore_button
            button0.setVisibility(0);
            button0.setOnClickListener(new ekhu(this));
        }
        this.a = new ekhr(this, context0);
        this.aj = (FastScroller)view0.findViewById(0x7F0B1388);  // id:fast_scroller
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1E20);  // id:recycler_view
        this.aj.setVisibility(8);
        this.ah = (FastScrollbar)view0.findViewById(0x7F0B1386);  // id:fast_scrollbar
        ekhw ekhw0 = new ekhw(this, recyclerView0);
        this.ah.a(new ekhv(this), ekhw0);
        recyclerView0.an(this.a);
        recyclerView0.ap(ekhw0);
        recyclerView0.setOnScrollChangeListener(new ekhx(this, recyclerView0));
        SwipeRefreshLayout swipeRefreshLayout0 = (SwipeRefreshLayout)view0.findViewById(0x7F0B0FBC);  // id:contact_list_swipe_layout
        this.d = swipeRefreshLayout0;
        swipeRefreshLayout0.a = new ekhz(this);
        this.z(true);
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
        lqd lqd0 = this.ag;
        if(lqd0 != null) {
            lqd0.k(this);
            this.ag = null;
        }
    }

    final void y() {
        this.b.f();
    }

    final void z(boolean z) {
        this.d.k(z);
        if(!z) {
            this.d.setEnabled(false);
        }
    }
}


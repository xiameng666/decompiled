import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.romanesco.ui.restore.util.FastScrollbar;

public final class eklg extends du {
    lqd a;
    public FastScrollbar ag;
    private AppCompatTextView ah;
    ejyv b;
    public eklz c;
    public ekkz d;

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            xob0.setTitle(this.b.k());
            super.onActivityCreated(bundle0);
        }
        String s = this.b.i();
        String s1 = this.b.j();
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            eklz eklz0 = (eklz)new lso(((xob)this.requireContext()), ekma.d(this.requireContext())).a(eklz.class);
            this.c = eklz0;
            lqd lqd0 = eklz0.g.a(s, s1, this.b.b);
            this.a = lqd0;
            lqd0.g(this, new ekla(this));
            this.ah.setText(this.requireContext().getApplicationContext().getResources().getQuantityString(0x7F13006E, this.b.b(), new Object[]{this.b.b()}));  // plurals:romanesco_restore_settings_num_contacts_to_restore
            return;
        }
        ejze.a().d("CRCF.restore_account_or_backup_not_populated");
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v1 == -1 && intent0 != null) {
            if(v == 1) {
                String s = intent0.getStringExtra("authAccount");
                if(s != null && !bbqr.d(s)) {
                    this.c.f(s);
                }
                v = 1;
            }
            super.onActivityResult(v, -1, intent0);
        }
    }

    @Override  // du
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.ag.onConfigurationChanged(configuration0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08C9, viewGroup0, false);  // layout:romanesco_contacts_restore_settings_contacts_fragment
        xni xni0 = (xni)this.getContext();
        if(xni0 != null) {
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
            xni0.hG(toolbar0);
            im im0 = xni0.hL();
            if(im0 != null) {
                im0.o(true);
            }
            Drawable drawable0 = toolbar0.e();
            if(drawable0 != null) {
                drawable0.setAutoMirrored(true);
            }
            toolbar0.x(new eklb(this));
            ((Button)view0.findViewById(0x7F0B1E68)).setOnClickListener(new eklc(this));  // id:restore_button
            this.ah = (AppCompatTextView)view0.findViewById(0x7F0B1E72);  // id:restoreable_contacts
            Context context0 = xni0.getApplicationContext();
            if(this.b == null) {
                this.b = ejyv.d(context0);
            }
            this.d = new ekkz();
            RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1E20);  // id:recycler_view
            recyclerView0.an(this.d);
            FastScrollbar fastScrollbar0 = (FastScrollbar)view0.findViewById(0x7F0B1386);  // id:fast_scrollbar
            this.ag = fastScrollbar0;
            fastScrollbar0.setVisibility(0);
            eklf eklf0 = new eklf(this, recyclerView0);
            this.ag.a(new ekld(this), eklf0);
            recyclerView0.ap(eklf0);
            recyclerView0.setOnScrollChangeListener(new ekle(this, recyclerView0));
        }
        return view0;
    }
}


import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.romanesco.ui.restore.settings.ContactsRestoreSettingsChimeraActivity;

public final class ekki extends du {
    ejyv a;
    eklz b;
    public ekke c;

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        Account account0;
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            super.onActivityCreated(bundle0);
        }
        this.b = (eklz)new lso(((xob)this.requireContext()), ekma.d(this.requireContext())).a(eklz.class);
        if(xob0 != null) {
            super.onActivityCreated(bundle0);
            Context context0 = xob0.getApplicationContext();
            if(context0 != null) {
                String s = this.a.i();
                Account[] arr_account = ejyr.b(context0);
                for(int v = 0; true; ++v) {
                    account0 = null;
                    if(v >= arr_account.length) {
                        break;
                    }
                    Account account1 = arr_account[v];
                    if(s.equals(account1.name)) {
                        account0 = account1;
                        break;
                    }
                }
                if(account0 != null) {
                    ekke ekke0 = this.c;
                    ekke0.a.add(s);
                    ekke0.f = new fntm[1];
                    this.b.i.a(account0).g(this, new ekkf(this));
                }
            }
        }
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v1 == -1 && intent0 != null) {
            super.onActivityResult(v, -1, intent0);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08D1, viewGroup0, false);  // layout:romanesco_restore_settings_account_menu_fragment
        xni xni0 = (xni)this.getContext();
        if(xni0 != null) {
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
            xni0.hG(toolbar0);
            xni0.setTitle(0x7F152886);  // string:romanesco_account_menu_title "Save contacts to"
            if(toolbar0 != null) {
                im im0 = xni0.hL();
                if(im0 != null) {
                    im0.o(true);
                    toolbar0.x(new ekkg(this));
                }
            }
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B166C);  // id:help_and_feedback
            imageView0.setImageResource(0x7F080D45);  // drawable:quantum_ic_help_outline_vd_theme_24
            imageView0.setOnClickListener(new ekkh(this));
            Context context0 = xni0.getApplicationContext();
            if(this.a == null) {
                this.a = ejyv.d(context0);
            }
            this.c = new ekke(this, ((ContactsRestoreSettingsChimeraActivity)xni0), this.a);
            RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1E20);  // id:recycler_view
            recyclerView0.an(this.c);
            recyclerView0.ap(new LinearLayoutManager());
        }
        return view0;
    }

    public final void y(String s) {
        if(s == null) {
            this.a.r(true);
        }
        else {
            this.a.t(s);
            this.a.r(false);
        }
        ejze.a().r(21, this.a.g(), this.a.c, this.a.b);
        this.b.a.l(Integer.valueOf(3));
    }
}


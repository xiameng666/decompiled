import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.romanesco.ui.restore.settings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.List;

final class ekke extends tk {
    public final List a;
    public final ekki e;
    public fntm[] f;
    private final ejyv g;
    private final ContactsRestoreSettingsChimeraActivity h;

    public ekke(ekki ekki0, ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity0, ejyv ejyv0) {
        this.a = new ArrayList();
        this.f = new fntm[0];
        this.e = ekki0;
        this.g = ejyv0;
        this.h = contactsRestoreSettingsChimeraActivity0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size() + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return v >= this.a.size() ? 0 : 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        return v == 1 ? new ekkd(layoutInflater0.inflate(0x7F0E08D4, viewGroup0, false)) : new ekkc(layoutInflater0.inflate(0x7F0E08D3, viewGroup0, false));  // layout:romanesco_restore_settings_google_account_item
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if(v < this.b()) {
            switch(this.dx(v)) {
                case 0: {
                    goto label_3;
                }
                case 1: {
                    goto label_23;
                }
            }
            return;
        label_3:
            TextView textView0 = ((ekkc)uq0).t;
            textView0.setText(0x7F152883);  // string:romanesco_account_menu_device_account_name "This device only"
            if(this.e.getContext() != null) {
                if(this.g.d) {
                    textView0.setText(0x7F152884);  // string:romanesco_account_menu_device_account_name_unavailable "This device only 
                                                    // (unavailable)"
                    textView0.setAlpha(0.62f);
                    ((ekkc)uq0).u.setAlpha(0.38f);
                    ((ekkc)uq0).x.setAlpha(0.38f);
                    ((ekkc)uq0).w.setEnabled(false);
                    ((ekkc)uq0).w.setClickable(false);
                    ((ekkc)uq0).v.setVisibility(0);
                    ekka ekka0 = new ekka(this);
                    ((ekkc)uq0).v.setOnClickListener(ekka0);
                    return;
                }
                ekkb ekkb0 = new ekkb(this);
                ((ekkc)uq0).w.setOnClickListener(ekkb0);
                ((ekkc)uq0).v.setEnabled(false);
                ((ekkc)uq0).v.setClickable(false);
                ((ekkc)uq0).v.setVisibility(8);
                return;
            label_23:
                String s = (String)this.a.get(v);
                ((ekkd)uq0).t.setText(s);
                fngs fngs0 = this.h.j;
                fntn fntn0 = new fntn();
                ((ekkd)uq0).u.h(fngs0, fntn0);
                ((ekkd)uq0).u.l(this.f[v]);
                ekjz ekjz0 = new ekjz(this, s);
                ((ekkd)uq0).v.setOnClickListener(ekjz0);
            }
        }
    }
}


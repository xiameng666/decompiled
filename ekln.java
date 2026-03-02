import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.romanesco.ui.restore.settings.ContactsRestoreSettingsChimeraActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j..util.Objects;

public final class ekln extends du {
    Account a;
    public AppCompatTextView ag;
    public AccountParticleDisc ah;
    public eklz ai;
    private RecyclerView aj;
    private lqd ak;
    private lqd al;
    private lqd am;
    private lqd an;
    private ejze ao;
    ekku b;
    ejyv c;
    eklt d;

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            xob0.setTitle(0x7F1528A0);  // string:romanesco_contacts_restore_title "Restore contacts"
            super.onActivityCreated(bundle0);
        }
        this.ai = (eklz)new lso(((xob)this.requireContext()), ekma.d(this.requireContext())).a(eklz.class);
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity0 = (ContactsRestoreSettingsChimeraActivity)this.requireContext();
        ekmc ekmc0 = this.ai.b;
        eghw eghw0 = this.ai.i;
        Objects.requireNonNull(eghw0);
        lqd lqd0 = lsa.c(ekmc0, new eklv(eghw0));
        this.ak = lqd0;
        lqd0.g(this, new eklj(this));
        this.ah.h(contactsRestoreSettingsChimeraActivity0.j, new fntn());
        ekmc ekmc1 = this.ai.b;
        ekmp ekmp0 = this.ai.h;
        Objects.requireNonNull(ekmp0);
        this.al = lsa.c(ekmc1, new ekly(ekmp0));
        ekmc ekmc2 = this.ai.b;
        ekmp ekmp1 = this.ai.h;
        Objects.requireNonNull(ekmp1);
        this.am = lsa.c(ekmc2, new eklw(ekmp1));
        lqd lqd1 = this.al;
        ekku ekku0 = this.b;
        Objects.requireNonNull(ekku0);
        lqd1.g(this, new eklk(ekku0));
        lqd lqd2 = this.am;
        ekku ekku1 = this.b;
        Objects.requireNonNull(ekku1);
        lqd2.g(this, new ekll(ekku1));
        ekmf ekmf0 = this.ai.j;
        if(ekmf0.a == null) {
            ekmf0.a = new ekme(ekmf0.b);
        }
        this.an = ekmf0.a;
        ekmf0.a.g(this, new eklm(this));
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        aqfl aqfl0;
        int v2 = 1;
        if(v1 != -1) {
            return;
        }
        if(v != 1) {
        label_10:
            switch(v) {
                case 2: {
                    v2 = 2;
                    break;
                }
                case 3: {
                    v2 = 3;
                    break;
                }
                default: {
                    v2 = v;
                    goto label_43;
                }
            }
            ejze.a().p(3);
            String s1 = this.c.i();
            ejyy ejyy0 = this.b.f();
            eklt eklt0 = this.d;
            Context context0 = this.getContext();
            byte[] arr_b = ejyy0.k.toBytesArray();
            ekku ekku0 = this.b;
            if(ekku0.j == null) {
                ejze.a().d("CRSA.no_backup_item_holder_set");
            }
            ekkr ekkr0 = ekku0.j;
            aqgg aqgg0 = new aqgg(this.getContext());
            ejyn ejyn0 = new ejyn(this.getContext());
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfl.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                aqfl0 = (aqfl)hftv0;
            }
            catch(hfur unused_ex) {
                Log.e("ContactsGmsRestore", "Exception while parsing device");
                eklt0.a.y();
                goto label_43;
            }
            evqp evqp0 = new evqp();
            ekls ekls0 = new ekls(context0, s1, evqp0);
            eklt0.d.execute(ekls0);
            eklo eklo0 = new eklo(eklt0, context0, aqgg0, aqfl0);
            evql evql0 = evqp0.a.g(eklo0).g(new eklp(ejyn0, s1, aqfl0));
            evql0.b(new eklq(eklt0, context0, aqfl0, ekkr0, v2));
            evql0.A(new eklr(eklt0, context0));
        }
        else if(intent0 != null) {
            String s = intent0.getStringExtra("authAccount");
            if(s != null && !bbqr.d(s)) {
                this.ai.f(s);
            }
        }
        else {
            v = 1;
            goto label_10;
        }
    label_43:
        super.onActivityResult(v2, -1, intent0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08CB, viewGroup0, false);  // layout:romanesco_contacts_restore_settings_fragment
        xni xni0 = (xni)this.getContext();
        if(xni0 != null) {
            xni0.hG(((Toolbar)view0.findViewById(0x7F0B22D9)));  // id:toolbar
            im im0 = xni0.hL();
            if(im0 != null) {
                im0.o(true);
            }
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B166C);  // id:help_and_feedback
            imageView0.setImageResource(0x7F080D45);  // drawable:quantum_ic_help_outline_vd_theme_24
            imageView0.setOnClickListener(new eklh(this));
            ekmx.b(imageView0, imageView0.getContext().getResources().getDimensionPixelSize(0x7F070076));  // dimen:accessibility_required_min_touch_target_height
            NestedScrollView nestedScrollView0 = (NestedScrollView)view0.findViewById(0x7F0B0FEA);  // id:content_scroll_view
            if(nestedScrollView0 != null) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = nestedScrollView0.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
                }
                else {
                    viewGroup$LayoutParams0.height = -2;
                }
                nestedScrollView0.setLayoutParams(viewGroup$LayoutParams0);
            }
            this.ag = (AppCompatTextView)view0.findViewById(0x7F0B0C85);  // id:backups_banner
            AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view0.findViewById(0x7F0B0A83);  // id:account_particle_disc
            this.ah = accountParticleDisc0;
            accountParticleDisc0.setOnClickListener(new ekli(this));
            String s = this.getString(0x7F1507CF);  // string:common_account_spinner_a11y_tap_action "change account"
            AccountParticleDisc accountParticleDisc1 = this.ah;
            accountParticleDisc1.setClickable(true);
            accountParticleDisc1.setImportantForAccessibility(1);
            kfe.j(accountParticleDisc1, new ekmv(s));
            Context context0 = xni0.getApplicationContext();
            if(this.c == null) {
                this.c = ejyv.d(context0);
            }
            this.aj = (RecyclerView)view0.findViewById(0x7F0B1E20);  // id:recycler_view
            if(this.b == null) {
                this.b = new ekku(this, context0, this.c);
            }
            this.aj.an(this.b);
            this.aj.ap(new LinearLayoutManager());
        }
        ejze ejze0 = ejze.a();
        this.ao = ejze0;
        if(this.d == null) {
            this.d = eklt.b(this, this.b, ejze0);
        }
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.ak.k(this);
        this.al.k(this);
    }

    final void y() {
        Context context0 = this.getContext();
        if(context0 != null) {
            Toast.makeText(context0, 0x7F1528C1, 0).show();  // string:romanesco_restore_key_recovery_explanation_unknown_error "Could not retrieve 
                                                             // contacts to restore at this time"
        }
    }
}


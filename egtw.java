import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class egtw extends egsx {
    Account a;
    final boolean ag;
    final boolean ah;
    final boolean ai;
    final boolean aj;
    final boolean ak;
    final boolean al;
    private static final bboh am;
    private final lqj an;
    private lqd ao;
    private lqd ap;
    private lqd aq;
    private lqd ar;
    private lqd as;
    private lqd at;
    eguv b;
    public AccountParticleDisc c;
    egwu d;

    static {
        egtw.am = bboh.b("ContactSyncFragment", bbcu.f);
    }

    public egtw() {
        this.an = new egtu(this);
        this.ag = hwyp.g();
        this.ah = hwyp.f();
        this.ai = hwyp.q();
        this.aj = hwyp.k();
        this.ak = true;
        this.al = true;
    }

    public static Intent A(String s, gged_interceptors gged0, boolean z) {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.romanesco.restore.CONTACTS_RESTORE");
        intent0.putExtra("romanesco_restore_referrer_id", "SYNC_CORE");
        intent0.putExtra("romanesco_restore_is_gms_backup", z);
        if(!gged0.isEmpty()) {
            intent0.putStringArrayListExtra("romanesco_restore_contacts_restore_selected_backup_device_id", new ArrayList(gged0));
        }
        intent0.setPackage("com.google.android.gms");
        if(!TextUtils.isEmpty(s)) {
            intent0.putExtra((hwyp.m() ? "authAccount" : "people_ui_contacts_restore_account_name"), s);
        }
        return intent0;
    }

    @Override  // egsx
    public final int D() {
        return 3;
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        egqy egqy0 = (egqy)this.J();
        eguv eguv0 = (eguv)new lso(this.J(), this.K()).a(eguv.class);
        this.b = eguv0;
        this.ap = eguv0.c;
        eguv0.c.g(this, this.an);
        this.c.h(egqy0.b(), new fntn());
        this.ao = this.b.d;
        this.b.d.g(this, new egte(this));
        lqh lqh0 = this.b.b;
        this.aq = lqh0;
        egwu egwu0 = this.d;
        Objects.requireNonNull(egwu0);
        lqh0.g(this, new egtn(egwu0));
        lqd lqd0 = this.b.k;
        this.ar = lqd0;
        egwu egwu1 = this.d;
        Objects.requireNonNull(egwu1);
        lqd0.g(this, new egto(egwu1));
        lqh lqh1 = this.b.l;
        this.as = lqh1;
        egwu egwu2 = this.d;
        Objects.requireNonNull(egwu2);
        lqh1.g(this, new egtp(egwu2));
        this.at = this.b.n;
        this.b.n.g(this, new egtq(this, bundle0 == null));
        if(!hwyp.a.c().B()) {
            if(bundle0 == null) {
                this.L();
            }
        }
        else if(!this.b.s) {
            this.L();
            this.b.s = true;
        }
        this.b.w.g(this.getViewLifecycleOwner(), new egtr(this));
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v1 == -1 && intent0 != null) {
            if(v == 1) {
                String s = intent0.getStringExtra("authAccount");
                if(!bbqr.d(s)) {
                    this.z(5);
                    this.b.r(s);
                }
                v = 1;
            }
            super.onActivityResult(v, -1, intent0);
        }
    }

    @Override  // egsx
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(hwzg.g()) {
            this.getChildFragmentManager().af("v1_to_v2_sheepdog_opt_in", this, new egtv(this));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0245, viewGroup0, false);  // layout:contacts_sync_core_fragment_gm3
        AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view0.findViewById(0x7F0B0A83);  // id:account_particle_disc
        this.c = accountParticleDisc0;
        accountParticleDisc0.setOnClickListener(new egtf(this));
        egxj.k(this.getString(0x7F1507CF), this.c);  // string:common_account_spinner_a11y_tap_action "change account"
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
        ((xni)this.J()).hG(toolbar0);
        ((xni)this.J()).hL().o(true);
        toolbar0.C(0x7F152566);  // string:people_google_contacts_sync_title "Google Contacts sync"
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B166C);  // id:help_and_feedback
        imageView0.setImageResource(0x7F080D45);  // drawable:quantum_ic_help_outline_vd_theme_24
        imageView0.setOnClickListener(new egtg(this));
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x102000A);
        Resources resources0 = this.getContext().getResources();
        SparseIntArray sparseIntArray0 = new SparseIntArray(10);
        sparseIntArray0.put(2, 0x7F0E01C8);  // layout:card_layout_3_gm3
        if(hwyp.q()) {
            sparseIntArray0.put(8, 0x7F0E01C8);  // layout:card_layout_3_gm3
        }
        egwu egwu0 = new egwu(resources0, sparseIntArray0);
        egwu0.B(true);
        this.d = egwu0;
        egwu0.n(2, new egth(this));
        this.d.n(3, new egti(this));
        TextView textView0 = (TextView)view0.findViewById(0x7F0B165C);  // id:header_text
        egxj.i(imageView0, imageView0.getContext().getResources().getDimensionPixelSize(0x7F070076));  // dimen:accessibility_required_min_touch_target_height
        egxj.i(textView0, textView0.getContext().getResources().getDimensionPixelSize(0x7F070076));  // dimen:accessibility_required_min_touch_target_height
        egxj.j(((NestedScrollView)view0.findViewById(0x7F0B0FEA)));  // id:content_scroll_view
        this.d.n(4, (/* MISSING LAMBDA PARAMETER */) -> {
            Intent intent0;
            gged_interceptors gged0;
            if(this.as != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ((List)this.as.ij())) {
                    egux egux0 = (egux)object0;
                    if(false == egux0.d) {
                        arrayList0.add(egux0);
                    }
                }
                if(this.ag && arrayList0.size() == 1) {
                    this.av.a(this.a.name, true);
                    if(this.ak) {
                        this.startActivity(egtw.A(this.a.name, gged_interceptors.l(((egux)arrayList0.get(0)).c), false));
                        return;
                    }
                    Bundle bundle0 = (Bundle)this.b.m.ij();
                    if(bundle0 != null && bundle0.getString("device_id").equals(((egux)arrayList0.get(0)).c)) {
                        this.startActivity(new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms").putExtra("people_ui_contacts_restore_dialog_extras", bundle0));
                        return;
                    }
                    ((ggtj)egtw.am.i()).B("Backup entity bundle not found for Single backup suggestion %s", ((egux)arrayList0.get(0)).c);
                    return;
                }
                if(this.ah && !arrayList0.isEmpty()) {
                    if(this.ak) {
                        String s = this.a.name;
                        if(this.al) {
                            ggdy ggdy0 = new ggdy();
                            for(Object object1: arrayList0) {
                                ggdy0.i(((egux)object1).c);
                            }
                            gged0 = ggdy0.h();
                        }
                        else {
                            gged0 = ggna.a;
                        }
                        intent0 = egtw.A(s, gged0, false);
                    }
                    else {
                        intent0 = new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms");
                    }
                    this.av.a(this.a.name, false);
                    this.startActivity(intent0);
                }
            }
        });
        if(this.aj) {
            this.d.n(5, (/* MISSING LAMBDA PARAMETER */) -> {
                Intent intent0;
                gged_interceptors gged0;
                if(this.as != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: ((List)this.as.ij())) {
                        egux egux0 = (egux)object0;
                        if(true == egux0.d) {
                            arrayList0.add(egux0);
                        }
                    }
                    if(this.ag && arrayList0.size() == 1) {
                        this.av.a(this.a.name, true);
                        if(this.ak) {
                            this.startActivity(egtw.A(this.a.name, gged_interceptors.l(((egux)arrayList0.get(0)).c), true));
                            return;
                        }
                        Bundle bundle0 = (Bundle)this.b.m.ij();
                        if(bundle0 != null && bundle0.getString("device_id").equals(((egux)arrayList0.get(0)).c)) {
                            this.startActivity(new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms").putExtra("people_ui_contacts_restore_dialog_extras", bundle0));
                            return;
                        }
                        ((ggtj)egtw.am.i()).B("Backup entity bundle not found for Single backup suggestion %s", ((egux)arrayList0.get(0)).c);
                        return;
                    }
                    if(this.ah && !arrayList0.isEmpty()) {
                        if(this.ak) {
                            String s = this.a.name;
                            if(this.al) {
                                ggdy ggdy0 = new ggdy();
                                for(Object object1: arrayList0) {
                                    ggdy0.i(((egux)object1).c);
                                }
                                gged0 = ggdy0.h();
                            }
                            else {
                                gged0 = ggna.a;
                            }
                            intent0 = egtw.A(s, gged0, true);
                        }
                        else {
                            intent0 = new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms");
                        }
                        this.av.a(this.a.name, false);
                        this.startActivity(intent0);
                    }
                }
            });
        }
        if(this.ai) {
            this.d.n(8, new egtl(this));
        }
        this.d.n(6, new egtm(this));
        recyclerView0.an(this.d);
        this.J();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager();
        recyclerView0.ap(linearLayoutManager0);
        fyjw fyjw0 = new fyjw(recyclerView0.getContext(), linearLayoutManager0.k);
        Context context0 = this.getContext();
        Context context1 = this.getContext();
        TypedValue typedValue0 = new TypedValue();
        context1.getTheme().resolveAttribute(0x7F040307, typedValue0, true);  // attr:colorOutline
        fyjw0.c(jxm.g(context0.getColor(typedValue0.resourceId), 51));
        fyjw0.d();
        recyclerView0.A(fyjw0);
        Activity activity0 = this.J().getContainerActivity();
        if(activity0 != null) {
            String s = hwyp.a.c().g();
            boolean z = hwyp.a.c().j();
            cmks.a(activity0, bbcu.dj, s, z);
        }
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
        this.d = null;
        this.ao.k(this);
        this.ao = null;
        this.aq.k(this);
        this.aq = null;
        this.ar.k(this);
        this.ar = null;
        this.as.k(this);
        this.as = null;
        this.ap.k(this);
        this.ap = null;
        lqd lqd0 = this.at;
        if(lqd0 != null) {
            lqd0.k(this);
            this.at = null;
        }
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.b.l();
    }

    // Detected as a lambda impl.
    public final void y(boolean z) {
        Intent intent0;
        gged_interceptors gged0;
        if(this.as != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((List)this.as.ij())) {
                egux egux0 = (egux)object0;
                if(z == egux0.d) {
                    arrayList0.add(egux0);
                }
            }
            if(this.ag && arrayList0.size() == 1) {
                this.av.a(this.a.name, true);
                if(this.ak) {
                    this.startActivity(egtw.A(this.a.name, gged_interceptors.l(((egux)arrayList0.get(0)).c), z));
                    return;
                }
                Bundle bundle0 = (Bundle)this.b.m.ij();
                if(bundle0 != null && bundle0.getString("device_id").equals(((egux)arrayList0.get(0)).c)) {
                    this.startActivity(new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms").putExtra("people_ui_contacts_restore_dialog_extras", bundle0));
                    return;
                }
                ((ggtj)egtw.am.i()).B("Backup entity bundle not found for Single backup suggestion %s", ((egux)arrayList0.get(0)).c);
                return;
            }
            if(this.ah && !arrayList0.isEmpty()) {
                if(this.ak) {
                    String s = this.a.name;
                    if(this.al) {
                        ggdy ggdy0 = new ggdy();
                        for(Object object1: arrayList0) {
                            ggdy0.i(((egux)object1).c);
                        }
                        gged0 = ggdy0.h();
                    }
                    else {
                        gged0 = ggna.a;
                    }
                    intent0 = egtw.A(s, gged0, z);
                }
                else {
                    intent0 = new Intent().setAction("com.google.android.gms.romanesco.settings.CONTACTS_RESTORE_SETTINGS").setPackage("com.google.android.gms");
                }
                this.av.a(this.a.name, false);
                this.startActivity(intent0);
            }
        }
    }

    public final void z(int v) {
        this.av.f(v, 3, egxj.g(this.a));
    }
}


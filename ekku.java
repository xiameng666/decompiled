import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class ekku extends tk {
    public final ejyv a;
    public final ekln e;
    public List f;
    public List g;
    public boolean h;
    public boolean i;
    public ekkr j;
    public static final int k;
    private static final bboh l;
    private final Context m;
    private eklt n;
    private List o;
    private boolean p;
    private int q;

    static {
        ekku.l = bboh.b("CBR_CRSAdapter", bbcu.bN);
    }

    public ekku(ekln ekln0, Context context0, ejyv ejyv0) {
        this.a = ejyv0;
        this.m = context0;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.o = new ArrayList();
        this.i = true;
        this.h = true;
        this.p = true;
        this.e = ekln0;
        this.q = -1;
    }

    public final void G() {
        ArrayList arrayList0 = new ArrayList(this.f);
        arrayList0.addAll(this.g);
        Collections.sort(arrayList0, new ekkq());
        this.o = arrayList0;
        this.p = this.i || this.h || !arrayList0.isEmpty();
    }

    // Detected as a lambda impl.
    public final void H(uq uq0, boolean z) {
        this.O(uq0.fq(), z);
        this.e.ai.a();
    }

    // Detected as a lambda impl.
    public final void I(uq uq0, boolean z) {
        int v = uq0.fq();
        if(this.dx(v) != 1) {
            return;
        }
        this.O(v, z);
        this.e.ai.a.l(Integer.valueOf(1));
    }

    public final void J(uq uq0, byte[] arr_b, int v) {
        ejyv ejyv0 = this.a;
        if(!ejyv0.e) {
            int v1 = uq0.fq();
            this.q = v1;
            this.j = (ekkr)uq0;
            try {
                gmcd gmcd0 = ejyv0.g.b.b(new ejzx(v1), ejyv0.g.a);
                ekaq.e(gmcd0);
                ((glyq)gmcd0).u();
            }
            catch(InterruptedException | ExecutionException unused_ex) {
            }
            ekln ekln0 = this.e;
            String s = ekln0.c.i();
            if(((xni)ekln0.getContext()) != null) {
                Context context0 = ekln0.getContext();
                String s1 = asdb.a(context0);
                int v2 = -1;
                try {
                    PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(s1, 0);
                    if(packageInfo0 != null) {
                        v2 = packageInfo0.versionCode;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                if(((long)v2) >= hqjw.a.b().b()) {
                    ekln0.startActivityForResult(asda.a(ekln0.getContext(), new Account(s, "com.google"), arr_b), v);
                }
            }
        }
    }

    private final void K(ekkr ekkr0, View.OnClickListener view$OnClickListener0) {
        ekkr0.w.setVisibility(0);
        ekkr0.x.setVisibility(0);
        Drawable drawable0 = ekkr0.z.getDrawable();
        int v = this.P();
        drawable0.setTint(this.m.getColor(v));
        ekkr0.B.setText(0x7F1508C8);  // string:common_restore "Restore"
        ekkr0.B.setOnClickListener(view$OnClickListener0);
        ekkr0.F();
        ekkr0.H();
    }

    private final void L(ekkr ekkr0, String s) {
        ekkr0.u.setText("All contacts are on this device");
        ekkr0.v.setText("Restored just now");
        String s1 = this.m.getResources().getQuantityString(0x7F130072, this.a.a(s), new Object[]{this.a.a(s)});  // plurals:romanesco_restored_contacts_count_toast
        ekkr0.y.setText(s1);
        ekkr0.E();
        ekkr0.G();
        ekkr0.w.setVisibility(8);
        ekkr0.x.setVisibility(8);
    }

    private final void M(ekkr ekkr0) {
        ekkr0.u.setText("All contacts are on this device");
        ekkr0.y.setText(0x7F1508C8);  // string:common_restore "Restore"
        ekkr0.y.setContentDescription("Restore button disabled");
        ekkr0.w.setVisibility(8);
        ekkr0.x.setVisibility(8);
        ekkr0.E();
        ekkr0.G();
    }

    private final void N(ekkr ekkr0, String s, String s1) {
        this.M(ekkr0);
        ekkr0.z.getDrawable().setTint(this.m.getColor(0x7F0607A2));  // color:google_grey600
        long v = (long)this.a.f(s, s1);
        String s2 = ekmu.c(this.m, v);
        String s3 = this.m.getResources().getString(0x7F1528B1, new Object[]{s2});  // string:romanesco_last_restore_date "Restored %1$s"
        ekkr0.v.setText(s3);
    }

    private final void O(int v, boolean z) {
        ejyy ejyy0 = (ejyy)this.o.get(v);
        String s = ejyy0.a;
        if(z) {
            s = Long.toString(ejyy0.b.longValue());
            ejyy0 = this.n().a(s);
        }
        ejyy0.h.addAll(ejyy0.i);
        String[] arr_s = new String[ejyy0.h.size()];
        ejyy0.h.toArray(arr_s);
        this.a.x(arr_s);
        this.a.y(s);
        this.a.z(ejyy0.j);
        this.a.A(ejyy0.d);
        this.a.b = z;
        eklz eklz0 = this.e.ai;
        ArrayList arrayList0 = new ArrayList();
        if(ejyy0 != null) {
            arrayList0.add(ejyy0);
        }
        eklz0.e.l(arrayList0);
    }

    private final int P() {
        TypedValue typedValue0 = new TypedValue();
        Resources.Theme resources$Theme0 = this.m.getTheme();
        return resources$Theme0 == null || !resources$Theme0.resolveAttribute(0x7F0402FC, typedValue0, true) ? 0x7F060765 : typedValue0.resourceId;  // attr:colorOnSurfaceVariant
    }

    @Override  // tk
    public final int b() {
        return this.o.isEmpty() ? 1 : this.o.size();
    }

    @Override  // tk
    public final int dx(int v) {
        if(this.o.isEmpty()) {
            return this.p ? 2 : 0;
        }
        return 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 2) {
            return new ekkt(layoutInflater0.inflate(0x7F0E08CC, viewGroup0, false));  // layout:romanesco_contacts_restore_settings_loading_backup_item
        }
        return v == 0 ? new ekks(layoutInflater0.inflate(0x7F0E08CA, viewGroup0, false)) : new ekkr(layoutInflater0.inflate(0x7F0E08C8, viewGroup0, false));  // layout:romanesco_contacts_restore_settings_empty_backup_item
    }

    public final ejyy f() {
        if(this.q == -1 || this.q > this.o.size() - 1) {
            ejze.a().d("CRSA.no_backup_position_set");
        }
        try {
            return (ejyy)this.o.get(this.q);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            Log.e("CBR_CRSAdapter", "Previous selected backup index out of bound. Previously selected index: " + this.q + "; Backup source size: " + this.o.size());
            return (ejyy)this.o.get(0);
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if(v >= this.b()) {
            ((ggtj)ekku.l.i()).z("Attempt to bind Contacts list item whose position is out of bound: %d", v);
            return;
        }
        Context context0 = this.m;
        int v1 = context0.getResources().getDimensionPixelSize(0x7F070076);  // dimen:accessibility_required_min_touch_target_height
        ejyv ejyv0 = this.a;
        String s = ejyv0.i();
        if(this.dx(v) == 0) {
            Context context1 = ((ekks)uq0).w.getContext();
            int v2 = fipw.b.a(context1);
            ((ekks)uq0).w.d(v2);
            String s1 = context0.getResources().getString(0x7F15289B, new Object[]{s});  // string:romanesco_contacts_restore_settings_no_backup "No contacts to restore to 
                                                                                         // this account %1$s"
            ((ekks)uq0).t.setText(s1);
            ((ekks)uq0).v.getDrawable().setTint(fyho.e(((ekks)uq0).v.getContext(), context0.getColor(0x7F060FC2)));  // color:restore_settings_no_backup_ok
            ekkl ekkl0 = new ekkl(this);
            ((ekks)uq0).u.setOnClickListener(ekkl0);
            return;
        }
        if(this.dx(v) == 2) {
            Context context2 = ((ekkt)uq0).t.getContext();
            int v3 = fipw.b.a(context2);
            ((ekkt)uq0).t.d(v3);
            return;
        }
        ejyy ejyy0 = (ejyy)this.o.get(v);
        ((ekkr)uq0).t.setText(ejyy0.j);
        Context context3 = ((ekkr)uq0).C.getContext();
        int v4 = fipw.b.a(context3);
        ((ekkr)uq0).C.d(v4);
        if(ejyy.a(ejyy0.k)) {
            String s2 = Long.toString(ejyy0.b.longValue());
            if(ejyv0.C(s2)) {
                this.L(((ekkr)uq0), s2);
                return;
            }
            long v5 = (long)ejyv0.f(s, s2);
            long v6 = ejyy0.c;
            if(v5 > v6) {
                this.N(((ekkr)uq0), s, s2);
                return;
            }
            if(ejyv0.D(s2)) {
                ejyy ejyy1 = this.n().a(s2);
                if(ejyy1 != null) {
                    int v7 = ejyy1.d;
                    if(v7 != 0) {
                        Resources resources0 = context0.getResources();
                        ((ekkr)uq0).u.setText(resources0.getQuantityString(0x7F13006E, v7, new Object[]{v7}));  // plurals:romanesco_restore_settings_num_contacts_to_restore
                        ekkj ekkj0 = (/* MISSING LAMBDA PARAMETER */) -> {
                            int v = ((ekkr)uq0).fq();
                            if(this.dx(v) != 1) {
                                return;
                            }
                            this.O(v, true);
                            this.e.ai.a.l(Integer.valueOf(1));
                        };
                        ((ekkr)uq0).w.setOnClickListener(ekkj0);
                        String s3 = context0.getResources().getQuantityString(0x7F13006F, v7);  // plurals:romanesco_restore_settings_view_contacts
                        ((ekkr)uq0).w.setText(s3);
                        ((ekkr)uq0).w.setVisibility(0);
                        ((ekkr)uq0).x.setVisibility(0);
                        String s4 = ekmu.b(context0, ejyy1.c);
                        ((ekkr)uq0).v.setText(s4);
                        ((ekkr)uq0).y.setText(0x7F1508C8);  // string:common_restore "Restore"
                        ((ekkr)uq0).z.getDrawable().setTint(context0.getColor(this.P()));
                        ((ekkr)uq0).H();
                        ((ekkr)uq0).F();
                        ekkk ekkk0 = (/* MISSING LAMBDA PARAMETER */) -> {
                            this.O(((ekkr)uq0).fq(), true);
                            this.e.ai.a();
                        };
                        ((ekkr)uq0).B.setOnClickListener(ekkk0);
                        ((ekkr)uq0).D(v1);
                        return;
                    }
                }
                this.M(((ekkr)uq0));
                return;
            }
            ((ekkr)uq0).u.setText(0x7F152899);  // string:romanesco_contacts_restore_settings_encrypted_backups_label "Encrypted"
            String s5 = ekmu.b(context0, v6);
            ((ekkr)uq0).v.setText(s5);
            ekkm ekkm0 = new ekkm(this, uq0, ejyy0);
            ((ekkr)uq0).w.setOnClickListener(ekkm0);
            String s6 = context0.getResources().getQuantityString(0x7F13006F, 100);  // plurals:romanesco_restore_settings_view_contacts
            ((ekkr)uq0).w.setText(s6);
            ((ekkr)uq0).D(v1);
            this.K(((ekkr)uq0), new ekkn(this, uq0, ejyy0));
            return;
        }
        String s7 = ejyy0.a;
        if(ejyv0.C(s7)) {
            this.L(((ekkr)uq0), s7);
            return;
        }
        long v8 = (long)ejyv0.f(s, s7);
        long v9 = ejyy0.c;
        if(v8 <= v9) {
            int v10 = ejyy0.d;
            if(v10 == 0) {
                this.M(((ekkr)uq0));
            }
            else {
                Resources resources1 = context0.getResources();
                ((ekkr)uq0).u.setText(resources1.getQuantityString(0x7F13006E, v10, new Object[]{v10}));  // plurals:romanesco_restore_settings_num_contacts_to_restore
                ekko ekko0 = new ekko(this, uq0);
                ((ekkr)uq0).w.setOnClickListener(ekko0);
                String s8 = context0.getResources().getQuantityString(0x7F13006F, v10);  // plurals:romanesco_restore_settings_view_contacts
                ((ekkr)uq0).w.setText(s8);
                ((ekkr)uq0).D(v1);
                this.K(((ekkr)uq0), new ekkp(this, uq0));
            }
            String s9 = ekmu.b(context0, v9);
            ((ekkr)uq0).v.setText(s9);
            return;
        }
        this.N(((ekkr)uq0), s, s7);
    }

    public final eklt n() {
        if(this.n == null) {
            ejze ejze0 = ejze.a();
            this.n = eklt.b(this.e, this, ejze0);
        }
        return this.n;
    }
}


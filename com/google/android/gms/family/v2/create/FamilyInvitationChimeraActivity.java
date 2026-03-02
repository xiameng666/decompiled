package com.google.android.gms.family.v2.create;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import azql;
import bbdg;
import bbmq;
import bkcy;
import bkda;
import bkdd;
import bkde;
import bkdf;
import bkdi;
import bkdt;
import bkeu;
import bkjn;
import bkks;
import bkkw;
import bklo;
import bklp;
import bkma;
import bkmb;
import ca;
import cchj;
import ccmq;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import de;
import fm;
import gftb;
import ggfp;
import ggoh;
import gogk;
import hgfj;
import hsig;
import hsiv;
import java.util.ArrayList;
import xni;

@GmsCoreVeId(0x3F3AD)
public final class FamilyInvitationChimeraActivity extends xni implements bkks, bklo, bkma {
    private static final ggfp j;
    private String k;
    private bkda l;
    private PageDataMap m;
    private ContactPickerOptionsData n;
    private bkcy o;
    private boolean p;
    private int q;
    private int r;
    private bkeu s;
    private bkdf t;
    private bkdt u;

    static {
        FamilyInvitationChimeraActivity.j = new ggoh("yt-tandem");
    }

    public FamilyInvitationChimeraActivity() {
        this.p = false;
        this.q = 0;
    }

    @Override  // bkks
    public final void A(int v) {
        if(v <= 0) {
            bkdd bkdd0 = new bkdd(this);
            bkdd0.j(0x7F151236);  // string:fm_family_is_full "Your family is full"
            bkdd0.m(0x7F15122D);  // string:fm_cant_invite_more_members "You can\'t invite anymore members"
            bkdd0.setPositiveButton(0x7F150815, new bkjn(this));  // string:common_continue "Continue"
            bkdd0.a();
            return;
        }
        this.getWindow().addFlags(0x2000);
        String s = this.k;
        gftb.check(s);
        bkmb.y(s, v, this.r).show(this.getSupportFragmentManager(), "invite-preconditions");
    }

    @Override  // bkks
    public final void B() {
        if(this.m != null && !this.m.c(7)) {
            this.F();
            return;
        }
        this.G(false, null);
    }

    private final Intent C() {
        Intent intent0 = new Intent().putExtra("accountName", this.k);
        intent0.putExtra("familyChanged", this.p);
        this.l.b();
        if(!this.l.b().isEmpty()) {
            intent0.putExtra("consistencyToken", this.l.b()).putExtra("tokenExpirationTimeSecs", this.l.a());
        }
        return intent0;
    }

    private static String D(String s) {
        return s == null ? "" : s;
    }

    private final void E() {
        de de0 = (de)this.getSupportFragmentManager().h("invite-preconditions");
        if(de0 != null) {
            de0.dismissAllowingStateLoss();
        }
        this.getWindow().clearFlags(0x2000);
    }

    private final void F() {
        this.setResult(3, this.C());
        this.finish();
        if(this.getIntent().getBooleanExtra("fromCreate", false)) {
            this.overridePendingTransition(0, 0);
        }
    }

    private final void G(boolean z, ArrayList arrayList0) {
        this.q();
        String s = this.k;
        gftb.check(s);
        PageDataMap pageDataMap0 = this.m;
        gftb.check(pageDataMap0);
        bklp bklp0 = bklp.y(s, pageDataMap0.a((z ? 6 : 7)), arrayList0);
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B143D, bklp0);  // id:fm_family_invitation_fragment_container
        ca0.w("backStackTagSuccessFragment");
        ca0.a();
    }

    private final boolean H() {
        return this.getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final void I(int v) {
        this.setResult(4, new Intent().putExtra("accountName", this.k).putExtra("errorCode", v));
        this.finish();
    }

    @Override  // bkks
    public final int g() {
        return this.q;
    }

    @Override  // bkks, bkma, bklo
    public final bkeu hO() {
        return this.s;
    }

    @Override  // bkks, bkma
    public final bkcy l() {
        return this.o;
    }

    @Override  // bkks, bkma
    public final bkda m() {
        return this.l;
    }

    @Override  // bkks
    public final ProfileData n() {
        return (ProfileData)this.getIntent().getParcelableExtra("profileData");
    }

    @Override  // bkma
    public final void o() {
        bkde.b(this).show();
        this.E();
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        boolean z = true;
        switch(v) {
            case 1: {
                if(intent0 != null && intent0.getStringExtra("consistencyToken") != null) {
                    this.l.c(intent0.getStringExtra("consistencyToken"), intent0.getLongExtra("tokenExpirationTimeSecs", 0L));
                }
                gftb.check(intent0);
                int v2 = intent0.getIntExtra("num-invitations-created", 0);
                int v3 = this.q + v2;
                this.q = v3;
                if(v3 > 0) {
                    this.p = true;
                }
                if(v1 != 0) {
                    if(this.m != null && !this.m.c(6) && !this.m.c(7)) {
                        this.r();
                        return;
                    }
                    if(this.H()) {
                        gftb.check(intent0);
                        ArrayList arrayList0 = intent0.getParcelableArrayListExtra("direct-add-contacts-list");
                        if(arrayList0 == null || arrayList0.isEmpty()) {
                            z = false;
                        }
                        this.p = z;
                        this.G(z, arrayList0);
                        return;
                    }
                    gftb.check(intent0);
                    if(intent0.getIntExtra("num-invitations-sent", 0) == 0) {
                        z = false;
                    }
                    this.G(z, null);
                    return;
                }
                if(this.H() && (this.m != null && this.m.c(7))) {
                    this.G(false, new ArrayList());
                    return;
                }
                if(this.m != null && !this.m.c(5)) {
                    this.F();
                    return;
                }
                this.q();
                return;
            }
            case 2: {
                this.t.b(this.u.c, v1);
                bkdt bkdt0 = this.u;
                gftb.check(intent0);
                bkdt0.e(intent0);
                if(v1 == -1) {
                    this.p = true;
                    this.r();
                    return;
                }
                this.F();
            }
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.getSupportFragmentManager().b() == 0) {
            this.F();
            return;
        }
        String s = this.getSupportFragmentManager().az(0).m;
        gftb.check(s);
        if(s.equals("backStackTagSuccessFragment")) {
            this.r();
            return;
        }
        super.onBackPressed();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.dn);
        super.onCreate(bundle0);
        this.s = new bkeu(this);
        String s = bbmq.p(this);
        if(!azql.c(this).g(s)) {
            this.s.e(4, 8);
            this.I(-3);
            return;
        }
        bkdi.e(this, this.getIntent(), s);
        String s1 = this.getIntent().getStringExtra("accountName");
        this.k = s1;
        if(s1 == null) {
            this.s.e(4, 13);
            this.I(-2);
            return;
        }
        Account[] arr_account = cchj.b(this).p("com.google");
        PageDataMap pageDataMap0 = null;
        Account account0 = null;
        for(int v = 0; v < arr_account.length; ++v) {
            Account account1 = arr_account[v];
            if(account1.name.equals(this.k)) {
                account0 = account1;
            }
        }
        if(account0 == null) {
            this.s.e(4, 14);
            this.I(-2);
            return;
        }
        String s2 = this.k;
        gftb.check(s2);
        this.t = new bkdf(this, s2);
        String s3 = FamilyInvitationChimeraActivity.D(this.getIntent().getStringExtra("appId"));
        this.o = new bkcy(s3, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        bkeu bkeu0 = this.s;
        String s4 = this.k;
        gftb.check(s4);
        bkeu0.d(s4, this.o.b, this.o.a);
        this.r = this.getIntent().getIntExtra("inviteeRole", 3);
        this.l = new bkda();
        boolean z = hsig.l();
        if(!z) {
            this.s.a();
        }
        hgfj hgfj0 = hsiv.b();
        String s5 = bkdt.d(s3);
        if(!this.H() && z && (hgfj0.b.contains(s5) || FamilyInvitationChimeraActivity.j.contains(s5))) {
            String s6 = this.k;
            gftb.check(s6);
            bkdt bkdt0 = new bkdt(s6, s5, this.l, s);
            this.u = bkdt0;
            int v1 = bkdt0.f();
            this.t.c(v1, ModuleManager.get(this).getCurrentModule().moduleVersion, this.u.c);
            this.startActivityForResult(this.u.a("family_module_first_party"), 2);
            return;
        }
        if(bundle0 != null && bundle0.getString("consistencyToken") != null) {
            this.l.c(bundle0.getString("consistencyToken"), bundle0.getLong("tokenExpirationTimeSecs", 0L));
        }
        else if(this.getIntent().getStringExtra("consistencyToken") != null) {
            this.l.c(this.getIntent().getStringExtra("consistencyToken"), this.getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        if(bundle0 != null) {
            pageDataMap0 = (PageDataMap)bundle0.getParcelable("pageDataMap");
        }
        this.m = pageDataMap0;
        this.p = bundle0 == null ? this.getIntent().getBooleanExtra("familyChanged", false) : bundle0.getBoolean("familyChanged");
        this.setContentView(0x7F0E03BF);  // layout:fm_activity_family_invitation_v2
        this.q();
        fm fm0 = this.getSupportFragmentManager();
        if(fm0.g(0x7F0B143D) == null) {  // id:fm_family_invitation_fragment_container
            ca ca0 = new ca(fm0);
            String s7 = this.k;
            gftb.check(s7);
            int v2 = this.r;
            boolean z1 = this.H();
            bkkw bkkw0 = new bkkw();
            Bundle bundle1 = new Bundle(3);
            bundle1.putString("accountName", s7);
            bundle1.putInt("inviteeRole", v2);
            bundle1.putBoolean("isDirectAddInvitations", z1);
            bkkw0.setArguments(bundle1);
            ca0.t(0x7F0B143D, bkkw0);  // id:fm_family_invitation_fragment_container
            ca0.a();
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("pageDataMap", this.m);
        this.l.b();
        if(!this.l.b().isEmpty()) {
            bundle0.putString("consistencyToken", this.l.b());
            bundle0.putLong("tokenExpirationTimeSecs", this.l.a());
        }
        bundle0.putBoolean("familyChanged", this.p);
    }

    @Override  // bkma
    public final void p() {
        this.E();
    }

    @Override  // bkks
    public final void q() {
        this.findViewById(0x7F0B143E).setVisibility(8);  // id:fm_family_invitation_loading_screen
    }

    @Override  // bkks
    public final void r() {
        this.setResult(1, this.C());
        this.finish();
    }

    @Override  // bkks
    public final void s() {
        this.F();
    }

    @Override  // bkks
    public final void t() {
        this.findViewById(0x7F0B143E).setVisibility(0);  // id:fm_family_invitation_loading_screen
    }

    @Override  // bkks, bkma
    public final void u(int v, int v1) {
        Intent intent0 = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.k).putExtra("consistencyToken", this.l.b()).putExtra("tokenExpirationTimeSecs", this.l.a()).putExtra("max-available-slots", v).putExtra("appId", this.o.a).putExtra("customTheme", this.getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", FamilyInvitationChimeraActivity.D(this.getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", bbmq.p(this)).putExtra("isOnboardInvitations", this.z()).putExtra("inviteeRole", this.r).putExtra("invitesSendingPagedata", (this.m == null || !this.m.c(23) ? new PageData(gogk.a) : this.m.a(23))).putExtra("invitesRetryPagedata", (this.m == null || !this.m.c(24) ? new PageData(gogk.a) : this.m.a(24))).putExtra("invitesRetryLaterPagedata", (this.m == null || !this.m.c(25) ? new PageData(gogk.a) : this.m.a(25)));
        intent0.putExtra("isDirectAddInvitations", this.H());
        intent0.putExtra("contactPickerOptions", this.n);
        this.startActivityForResult(intent0, 1);
        this.E();
    }

    @Override  // bkks
    public final void v(ContactPickerOptionsData contactPickerOptionsData0) {
        this.n = contactPickerOptionsData0;
    }

    @Override  // bkks
    public final void w(PageDataMap pageDataMap0) {
        this.m = pageDataMap0;
    }

    @Override  // bklo
    public final void x() {
        this.r();
    }

    @Override  // bkks
    public final void y() {
        this.s.f(4, 8, "updaterequired");
        this.I(-3);
    }

    @Override  // bkma
    public final boolean z() {
        return this.getIntent().getBooleanExtra("isOnboardInvitations", true);
    }
}


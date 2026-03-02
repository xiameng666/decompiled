package com.google.android.gms.romanesco.ui.restore.settings;

import android.os.Build.VERSION;
import android.os.Bundle;
import bbdg;
import bblp;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ejyv;
import ekjw;
import ekkv;
import ekkw;
import ekkx;
import ekln;
import eklu;
import eklz;
import ekma;
import fngs;
import fntn;
import fnub;
import fofa;
import fyhn;
import j..util.Objects;
import kex;
import lsa;
import lso;
import xni;

@GmsCoreVeId(0x3FCAB)
public class ContactsRestoreSettingsChimeraActivity extends xni {
    public fngs j;
    private ekln k;

    @Override  // xnb
    public final void onBackPressed() {
        if(this.getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT") != null && this.getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT").isVisible()) {
            this.finish();
            return;
        }
        ekjw ekjw0 = (ekjw)this.getSupportFragmentManager().h("TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
        if(ekjw0 != null && ekjw0.isVisible()) {
            ekjw0.a.c();
            return;
        }
        super.onBackPressed();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.eS);
        super.onCreate(bundle0);
        this.setTheme(0x7F16030A);  // style:ContactsRestoreUiTheme3
        fyhn.b(this.getContainerActivity());
        this.setContentView(0x7F0E08C7);  // layout:romanesco_contacts_restore_settings_activity
        eklz eklz0 = (eklz)new lso(this, ekma.d(this)).a(eklz.class);
        if(bundle0 == null && this.getIntent().hasExtra("authAccount")) {
            String s = this.getIntent().getStringExtra("authAccount");
            if(s == null) {
                s = "";
            }
            eklz0.b.i = s;
            eklz0.c.p();
            String s1 = "GOOGLE_SETTINGS_UI";
            if(this.getIntent().hasExtra("romanesco_restore_referrer_id")) {
                String s2 = this.getIntent().getStringExtra("romanesco_restore_referrer_id") == null ? "UNKNOWN_ENTRY_POINT" : this.getIntent().getStringExtra("romanesco_restore_referrer_id");
                if(!Objects.equals(s2, "UNKNOWN_ENTRY_POINT")) {
                    s1 = s2;
                }
                eklz0.e(s1);
            }
            else {
                eklz0.e("GOOGLE_SETTINGS_UI");
            }
        }
        this.j = new fngs(this, new bblp(0x7FFFFFFF, 9), new fntn(), new fnub(this.getApplicationContext(), fofa.a()));
        ejyv.d(this.getApplicationContext()).e = false;
        ekkv ekkv0 = new ekkv(this);
        eklz0.a.g(this, ekkv0);
        eklu eklu0 = new eklu(eklz0);
        lsa.c(eklz0.b, eklu0).g(this, new ekkw(this));
        if(bundle0 == null || this.getSupportFragmentManager().o().isEmpty()) {
            if(bundle0 == null) {
                this.k = new ekln();
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.u(0x7F0B1E9F, this.k, "TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");  // id:root
                ca0.b();
            }
            else {
                this.k = (ekln)this.getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
            }
            if(Build.VERSION.SDK_INT >= 35) {
                kex.b(this.findViewById(0x7F0B1E9F), new ekkx());  // id:root
            }
        }
    }
}


package com.google.android.gms.auth.proximity.multidevice;

import akwr;
import akws;
import alfr;
import alis;
import aliu;
import alje;
import aljf;
import aljh;
import alji;
import aljj;
import aljk;
import aljl;
import aljm;
import aljn;
import aljo;
import aljp;
import aljq;
import aljs;
import aljt;
import allr;
import almp;
import alol;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import bblp;
import bboh;
import bbru;
import bbrv;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cpje;
import fhra;
import ggtj;
import glzd;
import gmap;
import gmbu;
import gmcd;
import gmcn;
import gqus;
import hpzm;
import hpzt;
import im;
import jwe;
import xni;

@GmsCoreVeId(0x3EDC4)
public class SettingsChimeraActivity extends xni {
    public static final bboh j;
    public gmcd k;
    public gmcd l;
    public akws m;
    public bbrv n;
    private SettingsChimeraActivity.FeatureEnabledReceiver o;

    static {
        SettingsChimeraActivity.j = alis.a("BetterTogetherSettings");
    }

    public final void a(Account account0) {
        gmcd gmcd0 = gmcn.a(new bblp(1, 9)).e(new aljh(this, account0));
        gmcd gmcd1 = gmcn.a(new bblp(1, 9)).e(new alji(this, account0));
        boolean z = hpzt.e();
        Boolean boolean0 = Boolean.valueOf(false);
        gmcd gmcd2 = gmbu.i(boolean0);
        gmcd gmcd3 = gmbu.i(boolean0);
        gmcd gmcd4 = gmbu.i(boolean0);
        if(z) {
            if(cpje.c()) {
                gmcd4 = fhra.b(cpje.a());
                gmcd2 = glzd.f(gmcd4, new aljj(this, account0), gmcn.a(new bblp(1, 9)));
                gmcd3 = glzd.f(gmcd4, new aljk(this, account0), gmcn.a(new bblp(1, 9)));
            }
            else {
                gmcd2 = gmcn.a(new bblp(1, 9)).e(new aljl(this, account0));
                gmcd3 = gmcn.a(new bblp(1, 9)).e(new aljm(this, account0));
            }
        }
        gmcd gmcd5 = hpzm.i() ? gmcn.a(new bblp(1, 9)).e(new aljn(this, account0)) : gmbu.i(Boolean.valueOf(true));
        gmcd gmcd6 = gmbu.i(boolean0);
        if(account0 != null) {
            gmcd6 = glzd.f((hpzm.R() ? alol.a(account0.name).c() : almp.a(account0.name).b()), new aljo(), gmap.a);
        }
        gmcd gmcd7 = gmbu.i(boolean0);
        if(hpzm.y() && account0 != null) {
            gmcd7 = gmbu.m(new aljp(account0), new bblp(1, 9));
        }
        gmcd gmcd8 = gmbu.i(boolean0);
        if(hpzm.A() && account0 != null) {
            gmcd8 = glzd.f(alol.a(account0.name).e(), new aljf(), gmap.a);
        }
        gmcd gmcd9 = gmbu.f(new gmcd[]{gmcd0, gmcd1, gmcd2, gmcd3, gmcd5, gmcd6, gmcd7, gmcd8, gmcd4});
        this.k = gmcd9;
        gmbu.t(gmcd9, new aljs(this, z, account0), new bblp(1, 9));
    }

    public final boolean g(Account account0) {
        if(account0 == null) {
            return false;
        }
        return hpzt.f() ? this.m.e(account0, gqus.l) : this.m.d(account0, gqus.l);
    }

    public final boolean l(Account account0) {
        if(account0 == null) {
            return false;
        }
        SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(this, account0.name);
        return syncedCryptauthDevice0 != null && syncedCryptauthDevice0.l.contains(gqus.l.name());
    }

    private final boolean m() {
        Intent intent0 = this.getIntent();
        return intent0 != null && intent0.getBooleanExtra("FROM_PHONE_HUB_NOTIFICATION", false);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(allr.c()) {
            Intent intent0 = new Intent();
            intent0.setClassName(this, "com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextActivity");
            this.startActivity(intent0);
            this.finish();
            return;
        }
        this.m = akwr.a(this);
        SettingsChimeraActivity.FeatureEnabledReceiver settingsChimeraActivity$FeatureEnabledReceiver0 = new SettingsChimeraActivity.FeatureEnabledReceiver(this);
        this.o = settingsChimeraActivity$FeatureEnabledReceiver0;
        jwe.b(this, settingsChimeraActivity$FeatureEnabledReceiver0, new IntentFilter("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE"), 2);
        this.setContentView(0x7F0E018F);  // layout:better_together_settings_activity
        im im0 = this.hL();
        im0.o(true);
        bbru bbru0 = new bbru(im0);
        bbru0.b = new aljq(this);
        bbru0.b(0x7F15030A);  // string:auth_settings_activity_title "Chromebook"
        this.n = bbru0.a();
        gmcd gmcd0 = gmcn.a(new bblp(1, 9)).e(new alje(this));
        this.l = gmcd0;
        gmbu.t(gmcd0, new aljt(this), new bblp(1, 9));
        if(!this.m()) {
            return;
        }
        new aliu().I();
    }

    @Override  // xni
    public final void onDestroy() {
        gmcd gmcd0 = this.k;
        if(gmcd0 != null) {
            gmcd0.cancel(true);
            this.k = null;
        }
        SettingsChimeraActivity.FeatureEnabledReceiver settingsChimeraActivity$FeatureEnabledReceiver0 = this.o;
        if(settingsChimeraActivity$FeatureEnabledReceiver0 != null) {
            this.unregisterReceiver(settingsChimeraActivity$FeatureEnabledReceiver0);
            this.o = null;
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            if(hpzt.a.b().v()) {
                Intent intent0 = this.getIntent();
                if((intent0 == null || !intent0.getBooleanExtra("FROM_BETTER_TOGETHER_NOTIFICATION", false)) && !this.m()) {
                    this.onBackPressed();
                    this.finish();
                    return true;
                }
            }
            Intent intent1 = new Intent();
            intent1.setAction("com.android.settings.ADVANCED_CONNECTED_DEVICE_SETTINGS");
            intent1.addFlags(0x21000000);
            try {
                this.startActivity(intent1);
            }
            catch(ActivityNotFoundException unused_ex) {
                this.onBackPressed();
            }
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        String s = this.n.d();
        this.n.g(s);
        if(this.n.d() == null) {
            ((ggtj)SettingsChimeraActivity.j.j()).x("The account spinner was not able to select a new account after refresh.");
            this.a(null);
        }
    }
}


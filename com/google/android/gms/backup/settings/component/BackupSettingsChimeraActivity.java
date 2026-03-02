package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import androidx.preference.Preference;
import aqql;
import ashk;
import ashl;
import ashm;
import asic;
import aspm;
import atad;
import baun;
import bbdg;
import bthl;
import ca;
import ccmq;
import fm;
import fpxr;
import hgwl;
import hqje;
import hqky;
import hqlh;
import hqmo;
import hqmr;
import im;
import ohs;
import ohv;
import xni;

public class BackupSettingsChimeraActivity extends xni implements asic, ohs {
    public String j;
    public String k;
    public bthl l;
    private static final baun m;
    private boolean n;
    private fm o;
    private boolean p;
    private boolean q;
    private aspm r;

    static {
        BackupSettingsChimeraActivity.m = aqql.a("BackupSettingsChimeraActivity");
    }

    @Override  // ohs
    public final boolean a(ohv ohv0, Preference preference0) {
        String s = preference0.u;
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsActivity");
        if(s != null) {
            intent0.putExtra("show_fragment", s);
            intent0.putExtra("backup_services_available", this.n);
        }
        this.startActivity(intent0);
        return true;
    }

    @Override  // asic
    public final void g(boolean z, boolean z1) {
        BackupSettingsChimeraActivity.m.j("Showing opt-in with isMissingDollyConsent: %s isFromTurnOffToggle %s ", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
        if(this.q) {
            return;
        }
        Intent intent0 = ashk.a(this.getPackageManager(), z, this.n, this.getIntent());
        if(z1) {
            fpxr.d(intent0, hgwl.k);
        }
        this.startActivityForResult(intent0, 10005);
        this.q = true;
    }

    private final void l(Intent intent0) {
        atad atad0 = ashk.i(this.getIntent(), intent0);
        String s = atad0.M();
        if(s == null) {
            s = "android_backup";
        }
        this.j = s;
        String s1 = atad0.L();
        if(s1 == null) {
            s1 = "https://support.google.com/mobile/?p=settings_backup";
        }
        this.k = s1;
        Class class0 = atad0.getClass();
        BackupSettingsChimeraActivity.m.j("Displaying fragment: " + class0.getSimpleName(), new Object[0]);
        ca ca0 = new ca(this.o);
        ca0.z(0x7F0B188A, atad0, atad0.getClass().getName());  // id:main_content
        ca0.a();
    }

    private final void m(MenuItem menuItem0, int v, MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        menuItem0.setOnMenuItemClickListener(menuItem$OnMenuItemClickListener0);
        menuItem0.setIcon(v);
        if(hqmr.a.b().c()) {
            menuItem0.getIcon().setColorFilter(this.getColor(0x7F060FDE), PorterDuff.Mode.SRC_IN);  // color:settings_action_bar_icon_color
        }
        menuItem0.setShowAsAction(1);
        menuItem0.setVisible(true);
    }

    private static final boolean n(Bundle bundle0) {
        return hqje.F() && bundle0 == null;
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        BackupSettingsChimeraActivity.m.j("onActivityResult requestCode=%d resultCode=%d launchedFromPromotionalNotification=%b", new Object[]{v, v1, Boolean.valueOf(this.p)});
        if(v == 10005) {
            this.q = false;
            if(v1 == 0) {
                if(this.p) {
                    this.finishAndRemoveTask();
                    return;
                }
                this.onBackPressed();
                return;
            }
            this.l(intent0);
        }
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.mj);
        this.setTheme(0x7F1600A6);  // style:BackupSettingsTheme.ActionBar
        super.onCreate(bundle0);
        if(!hqky.c()) {
            if(!hqlh.c()) {
                this.setContentView(0x7F0E017E);  // layout:backup_settings_activity_main
                im im0 = this.hL();
                if(im0 != null) {
                    im0.o(true);
                }
                this.q = ashk.g(bundle0);
                this.n = ashk.e(this.getIntent());
                this.p = ashk.h(this.getIntent());
                if(this.o == null) {
                    this.o = this.getSupportFragmentManager();
                }
                this.l = new bthl(this);
                if(this.r == null && hqje.F()) {
                    this.r = new aspm(this);
                }
                if(ashk.f(this)) {
                    this.l(null);
                    if(BackupSettingsChimeraActivity.n(bundle0)) {
                        this.r.b(fpxr.a(this.getIntent()), false, this.n);
                    }
                }
                else {
                    this.g(false, false);
                    if(BackupSettingsChimeraActivity.n(bundle0)) {
                        this.r.b(fpxr.a(this.getIntent()), true, this.n);
                        return;
                    }
                }
                return;
            }
            BackupSettingsChimeraActivity.m.j("Launching BackupSettingsCollapsingActivity", new Object[0]);
            Intent intent0 = new Intent(this.getIntent());
            intent0.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsCollapsingActivity");
            this.startActivity(intent0);
            this.finish();
            return;
        }
        BackupSettingsChimeraActivity.m.j("Launching BackupSettingsNavRootActivity", new Object[0]);
        this.startActivity(ashk.b());
        this.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        hqmo hqmo0 = hqmo.a;
        if(hqmo0.b().d()) {
            this.m(menu0.add(0, 102, 0, 0x7F1529DE), 0x7F080DCA, new ashl(this));  // string:search_label "Search in settings"
        }
        this.m(menu0.add(0, 101, 1, 0x7F15087C), (hqmo0.b().c() ? 0x7F080D43 : 0x7F080D47), new ashm(this));  // string:common_list_apps_menu_help_and_feedback "Help & feedback"
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() != 0x102002C) {
            return super.onOptionsItemSelected(menuItem0);
        }
        this.finish();
        return true;
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        ashk.d(this.q, bundle0);
        super.onSaveInstanceState(bundle0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.hL().B(charSequence0);
    }
}


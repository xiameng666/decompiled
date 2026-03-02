package com.google.android.gms.kids.settings;

import ProtoLiteMessage;
import adt;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bbnp;
import bboh;
import cbfz;
import cbgq;
import cbok;
import cbol;
import cczb;
import cfvm;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gaec;
import gagb;
import gajp;
import gajq;
import gftb;
import ggeo;
import gvij;
import gvil;
import gvkq;
import gvku;
import gvkw;
import hukf;
import hula;
import j..util.Objects;
import lso;
import xni;

@GmsCoreVeId(0x3FADB)
public class KidsSettingsChimeraActivity extends xni {
    public static final bboh j;
    static final ComponentName k;
    public cbol l;
    private static final gajq m;
    private static final ggeo n;
    private DevicePolicyManager o;

    static {
        KidsSettingsChimeraActivity.m = new gajq(0x7F16095B, true);  // style:SudThemeGlifV3.DayNight
        KidsSettingsChimeraActivity.j = bboh.b("KidsSettingsChimeraActivity", bbcu.ac);
        KidsSettingsChimeraActivity.k = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
        KidsSettingsChimeraActivity.n = ggeo.q(gvkw.x, gvku.b, gvkw.y, gvku.c, gvkw.z, gvku.d, gvkw.B, gvku.f, gvkw.v, gvku.g, gvkw.Y, gvku.h);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        String s1;
        gvkw gvkw0;
        super.onCreate(bundle0);
        Object object0 = this.getSystemService("device_policy");
        gftb.check(object0);
        this.o = (DevicePolicyManager)object0;
        Intent intent0 = this.getIntent();
        this.setTheme(KidsSettingsChimeraActivity.m.a(intent0));
        if(gaec.y(this)) {
            this.setTheme(gajp.a(this));
        }
        this.l = (cbol)new lso(this).a(cbol.class);
        if("com.google.android.gms.kids.settings.GOLD_FROM_FL".equals(this.getIntent().getAction())) {
            gvkw0 = gvkw.x;
        }
        else if("com.google.android.gms.kids.settings.GOLD_FROM_SUNSHINE".equals(this.getIntent().getAction())) {
            gvkw0 = gvkw.y;
        }
        else if("com.google.android.gms.kids.settings.GOLD_FROM_FI".equals(this.getIntent().getAction())) {
            gvkw0 = gvkw.B;
        }
        else if(!Objects.equals(this.getIntent().getAction(), "android.settings.SUPERVISION_UPGRADE")) {
            if("com.google.android.gms.kids.settings.GOLD_FROM_PLAY_STORE".equals(this.getIntent().getAction())) {
                gvkw0 = gvkw.a;
                String s = this.getIntent().getStringExtra("play_store_entry_point");
                if(s != null && s.hashCode() == 0xCD6B6E31 && s.equals("play_store_family_home")) {
                    gvkw0 = gvkw.z;
                }
            }
            else if(this.getIntent().hasCategory("com.android.settings.suggested.category.PARENTAL_CONTROLS")) {
                gvkw0 = gvkw.w;
            }
            else {
                ComponentName componentName0 = this.getIntent().getComponent();
                gvkw0 = componentName0 == null || !"com.google.android.gms.kids.settings.KidsSettingsActivity".equals(componentName0.getClassName()) ? gvkw.u : gvkw.v;
            }
        }
        else if(hukf.i() && cbgq.a()) {
            gvkw0 = gvkw.Y;
        }
        else {
            gvkw0 = gvkw.a;
        }
        if(bundle0 == null) {
            if(!hula.c()) {
                if(this.o.isAdminActive(KidsSettingsChimeraActivity.k) && this.o.isProfileOwnerApp(KidsSettingsChimeraActivity.k.getPackageName()) || this.o.isProfileOwnerApp("com.google.android.gms.supervision")) {
                label_40:
                    cczb cczb0 = cfvm.v().c(((ProtoLiteMessage)gvij.a));
                    cczb0.c = (int)gvkq.bB.er;
                    cczb0.a();
                    if(!this.getPackageManager().queryIntentActivities(new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS"), 0).isEmpty() && !bbnp.e(this)) {
                        if(hula.c()) {
                            s1 = cbfz.a(this).a();
                        }
                        else {
                            ComponentName componentName1 = this.o.getProfileOwner();
                            gftb.check(componentName1);
                            s1 = componentName1.getPackageName();
                        }
                        Intent intent1 = new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS");
                        gftb.check(s1);
                        Intent intent2 = intent1.setComponent(new ComponentName(s1, "com.google.android.gms.kids.TransparencyActivity"));
                        Bundle bundle1 = this.getIntent().getExtras();
                        if(bundle1 != null) {
                            intent2.putExtras(bundle1);
                        }
                        intent2.putExtra("caller", gvil.d);
                        this.startActivityForResult(intent2, 0);
                    }
                    else {
                        cbol cbol0 = this.l;
                        Intent intent3 = this.getIntent();
                        Intent intent4 = new Intent("com.google.android.gms.kids.CONTINUE_FROM_SETTINGS").setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.kids.KidSetupActivity")).putExtra("session_id", cbol0.a);
                        gagb.a(intent3, intent4);
                        if(!intent4.hasExtra("theme")) {
                            intent4.putExtra("theme", "glif_v3_light");
                        }
                        this.startActivity(intent4);
                    }
                    this.finish();
                    return;
                }
            }
            else if(cbfz.a(this).c()) {
                goto label_40;
            }
            if(gvkw0.ordinal() != 0) {
                String s2 = hukf.j() ? "com.google.android.gms.kids.auth.KidsAuthDeviceSupervisionOptInActivity" : "com.google.android.gms.kids.settings.DeviceSupervisionOptInActivity";
                this.registerForActivityResult(new adt(), new cbok()).b(new Intent(this.getIntent()).setAction((hukf.j() ? "com.google.android.gms.kids.auth.DEVICE_SUPERVISION_OPT_IN" : this.getIntent().getAction())).setClassName("com.google.android.gms", s2).putExtra("entry_point", ((gvku)KidsSettingsChimeraActivity.n.getOrDefault(gvkw0, gvku.a)).i));
                this.setResult(-1);
                this.finish();
                return;
            }
            this.finish();
            return;
        }
        cbol cbol1 = this.l;
        String s3 = bundle0.getString("session-id");
        if(s3 != null) {
            cbol1.a = s3;
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("session-id", this.l.a);
    }
}


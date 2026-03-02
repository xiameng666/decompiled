package com.google.android.gms.auth.proximity.phonehub;

import aliu;
import alqn;
import alqr;
import alqu;
import alrs;
import altq;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import baun;
import ca;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import du;
import fm;
import hpzm;
import xni;

@GmsCoreVeId(0x3EDC3)
public final class PhoneHubFeatureSetupChimeraActivity extends xni {
    public String j;
    public altq k;
    public altq l;
    public boolean m;
    public alrs n;
    public aliu o;
    public static final int p;
    private static final baun q;
    private String r;
    private boolean s;
    private boolean t;

    static {
        PhoneHubFeatureSetupChimeraActivity.q = new baun("ProximityAuth", new String[]{"PhoneHubFeatureSetupChimeraActivity"});
    }

    public PhoneHubFeatureSetupChimeraActivity() {
        super(0x7F0E07C0);  // layout:phone_hub_feature_setup_activity
        this.k = altq.a;
        this.l = altq.a;
        this.m = false;
    }

    public final void a(boolean z) {
        this.k = z ? altq.b : altq.c;
        if(this.t) {
            fm fm0 = this.getSupportFragmentManager();
            du du0 = fm0.h("CameraRollSetupFragment");
            if(du0 != null) {
                ca ca0 = new ca(fm0);
                ca0.o(du0);
                ca0.j = 0x2002;
                ca0.a();
            }
            this.l = altq.g;
            this.l();
            return;
        }
        this.m = true;
        this.finish();
    }

    // Detected as a lambda impl.
    public final void g(boolean z) {
        if(z) {
            Intent intent0 = hpzm.R() ? UpdateLocalFeatureStateIntentOperation.a(this.getApplicationContext(), this.r, true) : UpdateCameraRollAccessStateIntentOperation.a(this.getApplicationContext(), this.r, true);
            if(intent0 != null) {
                this.startService(intent0);
                this.a(true);
                this.o.G(0);
            }
            return;
        }
        this.a(false);
        this.o.G(2);
    }

    private final void l() {
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.u(0x7F0B1FFB, new alqu(), "NotificationSetupFragment");  // id:setup_card
        ca0.j = 0x1001;
        ca0.a();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = intent0.getStringExtra("accountName");
        if(s == null) {
            PhoneHubFeatureSetupChimeraActivity.q.m("No accountName was provided in the Intent to PhoneHubFeatureSetupChimeraActivity", new Object[0]);
            this.finish();
            return;
        }
        this.r = s;
        this.s = intent0.getBooleanExtra("cameraRollSetupRequested", false);
        this.t = intent0.getBooleanExtra("notificationSetupRequested", false);
        String s1 = intent0.getStringExtra("deviceId");
        if(s1 == null && hpzm.z()) {
            PhoneHubFeatureSetupChimeraActivity.q.m("No deviceId was provided in the Intent to PhoneHubFeatureSetupChimeraActivity", new Object[0]);
            this.finish();
            return;
        }
        this.j = s1;
        this.n = alrs.a(this, this, (boolean z) -> {
            if(z) {
                Intent intent0 = hpzm.R() ? UpdateLocalFeatureStateIntentOperation.a(this.getApplicationContext(), this.r, true) : UpdateCameraRollAccessStateIntentOperation.a(this.getApplicationContext(), this.r, true);
                if(intent0 != null) {
                    this.startService(intent0);
                    this.a(true);
                    this.o.G(0);
                }
                return;
            }
            this.a(false);
            this.o.G(2);
        });
        this.o = new aliu();
        this.findViewById(0x7F0B1FFB).setOnClickListener(null);  // id:setup_card
        this.findViewById(0x7F0B0C44).setOnClickListener(new alqn(this));  // id:background
        if(bundle0 != null) {
            return;
        }
        if(this.s) {
            this.k = altq.g;
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.u(0x7F0B1FFB, new alqr(), "CameraRollSetupFragment");  // id:setup_card
            ca0.j = 0x1001;
            ca0.a();
            return;
        }
        if(this.t) {
            this.l = altq.g;
            this.l();
            return;
        }
        PhoneHubFeatureSetupChimeraActivity.q.m("No feature was requested to be set up.", new Object[0]);
        this.finish();
    }

    @Override  // xni
    protected final void onDestroy() {
        if(hpzm.z()) {
            altq altq0 = altq.g;
            if(this.k == altq0) {
                this.k = altq.e;
                this.m = true;
            }
            if(this.t && this.l == altq.a || this.l == altq0) {
                this.m = true;
                this.l = altq.e;
            }
        }
        if(hpzm.z()) {
            Context context0 = this.getApplicationContext();
            String s = this.r;
            int v = this.k.a();
            int v1 = this.l.a();
            String s1 = this.j;
            boolean z = this.m;
            Intent intent0 = IntentOperation.getStartIntent(context0, PhoneHubUpdateSetupResultIntentOperation.class, "com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_PHONEHUB_SETUP_RESULT");
            Intent intent1 = intent0 == null ? null : intent0.putExtras(PhoneHubUpdateSetupResultIntentOperation.a(s, v, v1, s1, z, null));
            if(intent1 != null) {
                this.startService(intent1);
            }
        }
        super.onDestroy();
    }
}


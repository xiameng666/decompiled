package com.google.android.gms.auth.uiflows.addaccount;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import adhx;
import ajcn;
import ajco;
import amef;
import amez;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import avyl;
import bagx;
import com.google.android.chimera.config.FeatureRequestExtras.RequestBuilder;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gagb;
import ghon;
import ghpj;
import ghpw;
import hoxf;
import java.util.Locale;

@GmsCoreVeId(257095)
public class WrapperControlledChimeraActivity extends amef {
    static final ajcn h;
    private boolean i;

    static {
        WrapperControlledChimeraActivity.h = new ajcn("intent");
    }

    public WrapperControlledChimeraActivity() {
        this.i = false;
    }

    public static Intent b(Context context0, boolean z, bagx bagx0, Intent intent0) {
        Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.auth.uiflows.addaccount.WrapperControlledActivity");
        ajco ajco0 = amef.C(bagx0, z);
        ajco0.d(WrapperControlledChimeraActivity.h, intent0);
        return intent1.putExtras(ajco0.a);
    }

    @Override  // amdx
    protected final String gQ() {
        return "WrapperControlledActivity";
    }

    @Override  // amdx
    protected final void gR() {
        if(adhx.a.a(this)) {
            adhx.c(this, ((Intent)this.x().a(WrapperControlledChimeraActivity.h)));
            return;
        }
        super.gR();
    }

    private final void k(Intent intent0, boolean z) {
        if(!hoxf.a.b().i()) {
            return;
        }
        ghpw ghpw0 = ghpw.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghpw0).v_newBuilder();
        if((((ghon)this.B().b_message).b & 0x2000) != 0) {
            ghpw ghpw1 = ((ghon)this.B().b_message).p;
            if(ghpw1 != null) {
                ghpw0 = ghpw1;
            }
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghpw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ghpw0));
        }
        ComponentName componentName0 = this.getCallingActivity();
        String s = componentName0 == null ? "" : componentName0.flattenToShortString();
        String s1 = intent0.toString();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghpj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s1.getClass();
        ((ghpj)hftv0).b |= 1;
        ((ghpj)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((ghpj)hftv1).b |= 2;
        ((ghpj)hftv1).d = z;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghpj ghpj0 = (ghpj)hftp1.b_message;
        s.getClass();
        ghpj0.b |= 4;
        ghpj0.e = s;
        ghpj ghpj1 = (ghpj)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghpw ghpw2 = (ghpw)hftp0.b_message;
        ghpj1.getClass();
        ghpw2.l = ghpj1;
        ghpw2.b |= 0x200;
        ProtoLiteBuilder hftp2 = this.B();
        ghpw ghpw3 = (ghpw)hftp0.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp2.b_message;
        ghpw3.getClass();
        ghon0.p = ghpw3;
        ghon0.b |= 0x2000;
    }

    @Override  // xnz
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.gN(v1, intent0);
    }

    @Override  // amef
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            boolean z = bundle0.getBoolean("activity_started", false);
            this.i = z;
            if(z) {
                return;
            }
        }
        Intent intent0 = (Intent)this.x().a(WrapperControlledChimeraActivity.h);
        gagb.a(this.getIntent(), intent0);
        if(intent0 != null && intent0.getBooleanExtra("is_unicorn_account", false)) {
            ajco ajco0 = new ajco();
            Integer integer0 = (Integer)this.x().b(amez.w, Integer.valueOf(0));
            ajco0.d(amez.w, integer0);
            ajcn ajcn0 = amez.v;
            ajco0.d(ajcn0, ((String)this.x().a(ajcn0)));
            Bundle bundle1 = ajco0.a;
            if(avyl.a() >= 107) {
                FeatureRequestExtras.RequestBuilder featureRequestExtras$RequestBuilder0 = new FeatureRequestExtras.RequestBuilder();
                featureRequestExtras$RequestBuilder0.setSessionId(((String)this.x().a(ajcn0)));
                featureRequestExtras$RequestBuilder0.addToBundle(bundle1);
            }
            intent0.putExtras(bundle1);
        }
        if(adhx.a.a(this)) {
            adhx.b(this);
        }
        if(this.getPackageManager().resolveActivity(intent0, 0) == null) {
            Log.e("Auth", String.format(Locale.US, "[AddAccount, WrapperControlledChimeraActivity] Could not resolve intent: " + intent0));
            this.k(intent0, false);
            this.gN(0, null);
            return;
        }
        if(hoxf.a.b().d()) {
            try {
                this.startActivityForResult(intent0, 0);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("Auth", String.format(Locale.US, a.ad(intent0, activityNotFoundException0, "[AddAccount, WrapperControlledChimeraActivity] Could not start intent: ", "\n")));
                this.k(intent0, true);
                this.gN(0, null);
                return;
            }
        }
        else {
            this.startActivityForResult(intent0, 0);
        }
        this.i = true;
    }

    @Override  // amdx
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("activity_started", this.i);
    }
}


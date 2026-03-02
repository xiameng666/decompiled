package com.google.firebase.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import batl;
import bauc;
import clht;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import ea;
import gozl;
import gozn;
import gozo;
import gozr;
import lvj;

public class FederatedSignInActivity extends ea {
    public static Runnable k;
    private static long l;
    private static final gozo m;
    private static Handler n;
    private boolean o;

    static {
        FederatedSignInActivity.m = gozo.a;
    }

    public FederatedSignInActivity() {
        this.o = false;
    }

    public final void c() {
        FederatedSignInActivity.l = 0L;
        this.o = false;
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent0.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if(lvj.a(this).e(intent0)) {
            FederatedSignInActivity.m.a(this);
        }
        else {
            Status status0 = gozl.a("WEB_CONTEXT_CANCELED");
            FederatedSignInActivity.m.b(this, status0);
        }
        this.finish();
    }

    private final void d(Status status0) {
        FederatedSignInActivity.l = 0L;
        this.o = false;
        Intent intent0 = new Intent();
        gozr.a(intent0, status0);
        intent0.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if(lvj.a(this).e(intent0)) {
            FederatedSignInActivity.m.a(this);
        }
        else {
            Context context0 = this.getApplicationContext();
            FederatedSignInActivity.m.b(context0, status0);
        }
        this.finish();
    }

    private final void e() {
        Intent intent0 = new Intent("com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtras(this.getIntent().getExtras());
        intent0.putExtra("com.google.firebase.auth.internal.OPERATION", this.getIntent().getAction());
        try {
            this.startActivityForResult(intent0, 0xA003);
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.w("IdpSignInActivity", "Could not launch web sign-in Intent. Google Play service is unavailable");
            this.d(new Status(0x445B, "Could not launch web sign-in Intent. Google Play service is unavailable"));
        }
    }

    @Override  // ea
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        String s = this.getIntent().getAction();
        if(!"com.google.firebase.auth.internal.SIGN_IN".equals(s) && !"com.google.firebase.auth.internal.LINK".equals(s) && !"com.google.firebase.auth.internal.REAUTHENTICATE".equals(s)) {
            Log.e("IdpSignInActivity", "Could not do operation - unknown action: " + s);
            this.c();
            return;
        }
        long v = System.currentTimeMillis();
        if(v - FederatedSignInActivity.l < 30000L) {
            Log.e("IdpSignInActivity", "Could not start operation - already in progress");
            return;
        }
        FederatedSignInActivity.l = v;
        if(bundle0 != null) {
            this.o = bundle0.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override  // aao
    public final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        Handler handler0 = FederatedSignInActivity.n;
        if(handler0 != null) {
            Runnable runnable0 = FederatedSignInActivity.k;
            if(runnable0 != null) {
                handler0.removeCallbacks(runnable0);
                FederatedSignInActivity.k = null;
            }
        }
        this.setIntent(intent0);
    }

    @Override  // ea
    protected final void onResume() {
        super.onResume();
        Intent intent0 = this.getIntent();
        if("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED".equals(intent0.getAction())) {
            Log.e("IdpSignInActivity", "Web sign-in failed, finishing");
            if(gozr.b(intent0)) {
                batl.s(intent0);
                batl.b(gozr.b(intent0));
                this.d(((Status)bauc.b(intent0, "com.google.firebase.auth.internal.STATUS", Status.CREATOR)));
                return;
            }
            this.c();
            return;
        }
        if(intent0.hasExtra("com.google.firebase.auth.internal.OPERATION") && intent0.hasExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST")) {
            String s = intent0.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if("com.google.firebase.auth.internal.SIGN_IN".equals(s) || "com.google.firebase.auth.internal.LINK".equals(s) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(s)) {
                VerifyAssertionRequest verifyAssertionRequest0 = (VerifyAssertionRequest)bauc.b(intent0, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", VerifyAssertionRequest.CREATOR);
                String s1 = intent0.getStringExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID");
                verifyAssertionRequest0.n = s1;
                FederatedSignInActivity.l = 0L;
                this.o = false;
                Intent intent1 = new Intent();
                bauc.l(verifyAssertionRequest0, intent1, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                intent1.putExtra("com.google.firebase.auth.internal.OPERATION", s);
                intent1.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if(lvj.a(this).e(intent1)) {
                    FederatedSignInActivity.m.a(this);
                }
                else {
                    SharedPreferences.Editor sharedPreferences$Editor0 = this.getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    sharedPreferences$Editor0.putString("verifyAssertionRequest", bauc.d(verifyAssertionRequest0));
                    sharedPreferences$Editor0.putString("operation", s);
                    sharedPreferences$Editor0.putString("tenantId", s1);
                    sharedPreferences$Editor0.putLong("timestamp", System.currentTimeMillis());
                    sharedPreferences$Editor0.commit();
                }
                this.finish();
                return;
            }
        }
        if(this.o) {
            FederatedSignInActivity.k = new gozn(this);
            if(FederatedSignInActivity.n == null) {
                FederatedSignInActivity.n = new clht();
            }
            FederatedSignInActivity.n.postDelayed(FederatedSignInActivity.k, 800L);
            return;
        }
        this.e();
        this.o = true;
    }

    @Override  // aao
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.o);
    }
}


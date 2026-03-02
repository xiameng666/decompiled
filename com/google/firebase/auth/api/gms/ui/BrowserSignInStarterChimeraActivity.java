package com.google.firebase.auth.api.gms.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ank;
import anl;
import bblp;
import bbmq;
import bbqu;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import gmcg;
import goxd;
import goxe;
import goxf;
import gozj;
import gozr;
import hsyg;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import xob;

@GmsCoreVeId(0x3F3E0)
public class BrowserSignInStarterChimeraActivity extends xob implements goxf {
    private final gmcg j;

    public BrowserSignInStarterChimeraActivity() {
        this.j = new bblp(1, 9);
    }

    @Override  // goxf
    public final Uri.Builder a(Intent intent0, String s, String s1) {
        CharSequence charSequence0;
        String s2 = intent0.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String s3 = intent0.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String s4 = intent0.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        ArrayList arrayList0 = intent0.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String s5 = arrayList0 == null || arrayList0.isEmpty() ? null : TextUtils.join(",", arrayList0);
        Bundle bundle0 = intent0.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if(bundle0 == null) {
            charSequence0 = null;
        }
        else {
            JSONObject jSONObject0 = new JSONObject();
            try {
                for(Object object0: bundle0.keySet()) {
                    String s6 = (String)object0;
                    String s7 = bundle0.getString(s6);
                    if(!TextUtils.isEmpty(s7)) {
                        jSONObject0.put(s6, s7);
                    }
                }
            }
            catch(JSONException unused_ex) {
                BrowserSignInStarterChimeraActivity.VZ.f("Unexpected JSON exception when serializing developer specified custom params", new Object[0]);
            }
            charSequence0 = jSONObject0.toString();
        }
        String s8 = UUID.randomUUID().toString();
        String s9 = goxe.b(UUID.randomUUID().toString());
        String s10 = intent0.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        String s11 = intent0.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        Context context0 = this.getApplicationContext();
        gozj.a.b(context0, s, s8, s9, s10, s3, s4);
        if(s9 == null) {
            return null;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("eid", "p").appendQueryParameter("v", s11).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", s2).appendQueryParameter("providerId", s3).appendQueryParameter("sessionId", s9).appendQueryParameter("eventId", s8).appendQueryParameter("apn", s).appendQueryParameter("sha1Cert", s1);
        if(!TextUtils.isEmpty(s5)) {
            uri$Builder0.appendQueryParameter("scopes", s5);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            uri$Builder0.appendQueryParameter("customParameters", ((String)charSequence0));
        }
        if(!TextUtils.isEmpty(s4)) {
            uri$Builder0.appendQueryParameter("tid", s4);
        }
        return uri$Builder0;
    }

    @Override  // goxf
    public final String b() {
        return hsyg.c();
    }

    @Override  // goxf
    public final HttpURLConnection c(URL uRL0) {
        try {
            return (HttpURLConnection)bbqu.a(uRL0, 0x5000);
        }
        catch(IOException unused_ex) {
            BrowserSignInStarterChimeraActivity.VZ.f("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override  // goxf
    public final void f(String s, Status status0) {
        if(!TextUtils.isEmpty(s)) {
            Intent intent0 = new Intent(this, FederatedSignInActivity.class);
            intent0.setPackage(s);
            intent0.setClassName(s, FederatedSignInActivity.class.getName());
            intent0.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
            intent0.addFlags(0x24000000);
            if(status0 != null) {
                gozr.a(intent0, status0);
            }
            this.startActivity(intent0);
        }
        this.finish();
    }

    @Override  // goxf
    public final void g(Uri uri0, String s) {
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        intent0.setPackage("com.android.chrome");
        List list0 = this.getPackageManager().queryIntentServices(intent0, 0);
        if(list0 != null && !list0.isEmpty()) {
            anl anl0 = new ank().a();
            anl0.a.addFlags(0x40000000);
            anl0.a.addFlags(0x10000000);
            anl0.a(this, uri0);
            this.finish();
            return;
        }
        Intent intent1 = new Intent("android.intent.action.VIEW", uri0);
        ResolveInfo resolveInfo0 = this.getPackageManager().resolveActivity(intent1, 0);
        intent1.addFlags(0x40000000);
        intent1.addFlags(0x10000000);
        if(resolveInfo0 != null) {
            this.startActivity(intent1);
            this.finish();
            return;
        }
        BrowserSignInStarterChimeraActivity.VZ.f("SignInStartActivity", new Object[]{"Device cannot resolve intent for: android.intent.action.VIEW"});
        goxe.a(this, s);
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        String s1;
        super.onCreate(bundle0);
        String s = bbmq.p(this);
        if(TextUtils.isEmpty(s)) {
            BrowserSignInStarterChimeraActivity.VZ.o("Could not identify calling package", new Object[0]);
            goxe.a(this, s);
            return;
        }
        try {
            s1 = bbmq.u(this, s).toLowerCase(Locale.US);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            BrowserSignInStarterChimeraActivity.VZ.o("Could not get package signature: " + s, new Object[0]);
            goxe.a(this, s);
            return;
        }
        new goxd(s, s1, this.getIntent(), this).executeOnExecutor(this.j, new Void[0]);
    }
}


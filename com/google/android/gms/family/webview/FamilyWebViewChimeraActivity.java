package com.google.android.gms.family.webview;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import batl;
import bkqd;
import bkqe;
import bkqf;
import bkqg;
import bkqh;
import bkqj;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import evql;
import evrg;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import xob;

@GmsCoreVeId(0x3F3B2)
public class FamilyWebViewChimeraActivity extends xob {
    public String j;
    public WebView k;
    private Account l;
    private bkqj m;
    private View n;

    public final void a() {
        this.setResult(0);
        this.finish();
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.k.canGoBack()) {
            this.k.goBack();
            return;
        }
        this.setResult(-1);
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        int v;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            Log.i("Family", String.format(Locale.US, "[FamilyWebViewChimeraActivity] FamilyWebViewChimeraActivity called with no intent"));
            this.a();
            return;
        }
        this.setContentView(0x7F0E03FB);  // layout:fm_webview
        this.k = (WebView)this.findViewById(0x7F0B24EE);  // id:webview
        this.n = this.findViewById(0x7F0B1A1F);  // id:no_connection
        this.m = bkqj.a();
        String s = intent0.getStringExtra("accountName");
        if(s == null) {
            this.a();
            return;
        }
        this.l = new Account(s, "com.google");
        String s1 = intent0.getStringExtra("webviewUrl");
        this.j = s1;
        if(s1 == null) {
            this.a();
            return;
        }
        this.k.clearCache(true);
        this.k.setWebViewClient(new bkqg(this.getContainerActivity()));
        WebSettings webSettings0 = this.k.getSettings();
        String s2 = webSettings0.getUserAgentString();
        ModuleManager moduleManager0 = ModuleManager.get(this);
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONObject jSONObject1 = jSONObject0.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                v = moduleManager0.getCurrentModule().moduleVersion;
            }
            catch(Exception exception0) {
                Log.e("Family", String.format(Locale.US, "[UserAgentHelper] Unable to determine module version."), exception0);
                v = 0;
            }
            jSONObject1.put("appVersion", String.valueOf(v));
        }
        catch(JSONException unused_ex) {
        }
        webSettings0.setUserAgentString(s2 + " " + String.format(Locale.US, "FmIdWebView (%s)", jSONObject0.toString().replaceAll("\\(|\\)", "_")));
        webSettings0.setJavaScriptEnabled(true);
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getSystemService("connectivity");
        if(connectivityManager0 != null) {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnectedOrConnecting() && this.j != null) {
                this.n.setVisibility(8);
                Account account0 = this.l;
                String s3 = this.j;
                batl.s(s3);
                evql evql0 = evrg.a(this.m.b, new bkqh(this.m, account0, s3));
                evql0.A(new bkqf());
                evql0.w(this.getContainerActivity(), new bkqd(this));
                evql0.t(this.getContainerActivity(), new bkqe(this));
                return;
            }
        }
        this.k.setVisibility(8);
        this.findViewById(0x7F0B14A4).setVisibility(8);  // id:fm_webview_loading_screen
        this.n.setVisibility(0);
    }
}


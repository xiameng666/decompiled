package com.google.android.gms.googlehelp.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bbcu;
import bboh;
import btiw;
import btjk;
import btjz;
import btke;
import btnq;
import btnt;
import btob;
import btti;
import buai;
import buak;
import com.google.android.chimera.WebView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyhn;
import ggtj;
import htqo;
import htra;
import htrm;

@GmsCoreVeId(0x3F427)
public class GoogleHelpWebViewChimeraActivity extends Activity implements btiw {
    public static final String a;
    private static final bboh b;
    private HelpConfig c;
    private btti d;

    static {
        GoogleHelpWebViewChimeraActivity.b = bboh.b("gH_WebViewActivity", bbcu.aw);
        GoogleHelpWebViewChimeraActivity.a = "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity";
    }

    @Override  // btiw
    public final Context a() {
        return this;
    }

    @Override  // btiw
    public final btjz d() {
        throw null;
    }

    @Override  // btiw
    public final btnq e() {
        throw null;
    }

    @Override  // btiw
    public final HelpConfig ia() {
        return this.c;
    }

    @Override  // btiw
    public final btti ib() {
        return this.d;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        if((!btnt.a(htrm.e()) || this.c != null) && this.c.P && fyhn.c() && !btke.d(this)) {
            btob.b(this, this.c);
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onCreate(Bundle bundle0) {
        Intent intent1;
        String s1;
        Uri uri1;
        this.c = HelpConfig.e(this, bundle0, this.getIntent());
        this.d = new btti(this);
        if(btnt.a(htrm.e()) && this.c != null) {
            if(btnt.a(htra.c())) {
                btjk.d(this.c.Q);
            }
            if(btnt.a(htqo.a.b().b())) {
                ThemeSettings themeSettings0 = this.c.z;
                if(themeSettings0 != null && themeSettings0.a == 2) {
                    this.setTheme(0x7F16162B);  // style:gh_NoActionBarDarkActivityStyleMaterial3
                }
                else {
                    this.setTheme(0x7F16162D);  // style:gh_NoActionBarLightActivityStyleMaterial3
                }
            }
            HelpConfig helpConfig0 = this.c;
            if(helpConfig0.P) {
                btob.b(this, helpConfig0);
            }
        }
        Intent intent0 = this.getIntent();
        buak buak0 = new buak(this);
        Uri uri0 = null;
        if(bundle0 == null) {
            intent1 = intent0;
        label_24:
            if(intent1 == null) {
                uri1 = null;
                s1 = null;
            }
            else {
                uri1 = intent1.getData();
                s1 = uri1 == null ? "" : uri1.toString();
            }
            if(buak.b(uri1) && buak.c(uri1.toString(), true)) {
                super.onCreate(bundle0);
                WebView webView0 = new WebView(this);
                this.setContentView(webView0);
                if(intent0 != null) {
                    uri0 = intent0.getData();
                }
                if(uri0 != null) {
                    webView0.loadUrl(uri0.toString());
                }
                webView0.setWebViewClient(new buai(this));
                this.setResult(-1);
                return;
            }
            if(!TextUtils.isEmpty(s1)) {
                buak.e(this, uri1, buak0.a);
            }
        }
        else {
            intent1 = new Intent();
            String s = bundle0.getString("saved_instance_state_key_url");
            if(!TextUtils.isEmpty(s)) {
                intent1.setData(Uri.parse(s));
                goto label_24;
            }
        }
        ((ggtj)GoogleHelpWebViewChimeraActivity.b.j()).x("URL not whitelisted or Intent not processable.");
        this.getIntent().setData(null);
        super.onCreate(null);
        this.setResult(0);
        this.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onDestroy() {
        btti btti0 = this.d;
        if(btti0 != null) {
            btti0.close();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onRestart() {
        super.onRestart();
        if((!btnt.a(htrm.e()) || this.c != null) && btnt.a(htra.c())) {
            btjk.d(this.c.Q);
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        if(this.getIntent() != null && this.getIntent().getData() != null) {
            bundle0.putParcelable("EXTRA_HELP_CONFIG", this.c);
            bundle0.putString("saved_instance_state_key_url", this.getIntent().getData().toString());
        }
        super.onSaveInstanceState(bundle0);
    }
}


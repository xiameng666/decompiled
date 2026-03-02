package com.google.android.gms.googlehelp.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import bbcu;
import bblp;
import bbmq;
import bboh;
import btjd;
import btjk;
import btjz;
import btnq;
import btnt;
import btoa;
import btob;
import btrg;
import btwt;
import btye;
import btza;
import buai;
import buak;
import buas;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ggtj;
import gmcg;
import htls;
import im;
import j..util.Optional;
import java.lang.ref.WeakReference;

@GmsCoreVeId(0x3F428)
public class GoogleHelpRenderingApiWebViewChimeraActivity extends btrg {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity";
    public String k;
    public String l;
    public boolean m;
    public LinearLayout n;
    private static final bboh o;
    private String p;
    private boolean q;
    private btjd r;
    private boolean s;
    private gmcg t;

    static {
        GoogleHelpRenderingApiWebViewChimeraActivity.o = bboh.b("gH_RndrApiWebViewActvty", bbcu.aw);
    }

    @Override  // btiw
    public final btjz d() {
        throw null;
    }

    @Override  // btiw
    public final btnq e() {
        throw null;
    }

    public final void g() {
        btjd btjd0 = this.r;
        boolean z = this.q;
        if(this.t == null) {
            this.t = new bblp(0x7FFFFFFF, 9);
        }
        gmcg gmcg0 = this.t;
        new btye(new WeakReference(this), btjd0, z, gmcg0).executeOnExecutor(gmcg0, new Void[0]);
    }

    public final void l() {
        WebView webView0 = new WebView(this);
        webView0.setWebViewClient(new buai(this));
        buas.i(this, webView0);
        webView0.addJavascriptInterface(new btza(this), "activity");
        buas.v(webView0, this.p, this.l, this.k, btwt.a(this.W), this.s);
        this.setContentView(webView0);
    }

    private final void m(Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(uri0);
        if(bbmq.ae(this, intent0)) {
            this.startActivity(intent0);
            this.finish();
            return;
        }
        ((ggtj)GoogleHelpRenderingApiWebViewChimeraActivity.o.j()).B("No activity can handle this URL: %s", uri0);
        this.n();
    }

    private final void n() {
        this.setResult(0);
        this.finish();
    }

    @Override  // btrg
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            ((ggtj)GoogleHelpRenderingApiWebViewChimeraActivity.o.j()).x("The intent that started the Activity is null.");
            this.n();
            return;
        }
        Uri uri0 = intent0.getData();
        if(uri0 == null) {
            ((ggtj)GoogleHelpRenderingApiWebViewChimeraActivity.o.j()).x("The intent data is null.");
            this.n();
            return;
        }
        if(!buak.d(uri0, true)) {
            ((ggtj)GoogleHelpRenderingApiWebViewChimeraActivity.o.j()).B("The URL is not whitelisted to be shown: %s", uri0);
            this.m(uri0);
            return;
        }
        HelpConfig helpConfig0 = this.W;
        if(helpConfig0 != null) {
            btob.d(this, helpConfig0, 0x7F161624, 0x7F16161A, 0x7F16161B);  // style:gh_LightActivityStyle
            im im0 = this.hL();
            if(im0 != null) {
                im0.x(btoa.b(this.getDrawable(0x7F080C86), this, btob.a(this, 0x7F0405C1)));  // attr:ghf_greyIconColor
                im0.u((this.m ? 0x7F151428 : 0x7F150783));  // string:gh_switch_back_to_chat_button_description "Switch back to chat"
                im0.o(true);
                im0.s(true);
            }
        }
        this.m = intent0.getBooleanExtra("extra_is_from_chat", false);
        this.s = intent0.getBooleanExtra("extra_is_from_sj", false);
        String s = uri0.toString();
        this.p = s;
        int v = this.m ? 2 : 1;
        Optional optional0 = btjd.V(s, btjk.a(), this.W, this.m, v);
        if(optional0.isEmpty()) {
            ((ggtj)GoogleHelpRenderingApiWebViewChimeraActivity.o.j()).B("Not a recognized support URL: %s", this.p);
            this.m(uri0);
            return;
        }
        this.r = (btjd)optional0.get();
        if(!btnt.b(htls.c()) && (this.getApplicationContext().getResources().getConfiguration().screenLayout & 15) < 3) {
            this.setRequestedOrientation(1);
        }
        this.q = intent0.getBooleanExtra("requireGcmToken", false);
        if(bundle0 == null) {
            if(this.r.G()) {
                this.l = "Survey";
            }
            else if(this.s) {
                this.l = "Support";
            }
            else {
                this.l = "Help";
            }
            this.g();
        }
        else {
            this.k = bundle0.getString("saved_instance_state_content_url");
            this.l = bundle0.getString("saved_instance_state_page_title");
            this.l();
        }
        this.setTitle(this.l);
        this.hL().B(this.l);
        this.setResult(-1);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        if(this.r != null && this.r.G()) {
            if(this.W == null) {
                this.getMenuInflater().inflate(0x7F100019, menu0);  // menu:gh_rendering_api_activity_menu
            }
            else {
                this.getMenuInflater().inflate(0x7F10001A, menu0);  // menu:gh_rendering_api_webview_activity_menu
            }
            btoa.r(menu0.findItem(0x7F0B15D1), this, btob.a(this, 0x7F0405C1));  // id:gh_rendering_api_activity_menu_close
            return true;
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // btrg
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        if(v == 0x102002C) {
            this.finish();
            return true;
        }
        if(v == 0x7F0B15D1) {  // id:gh_rendering_api_activity_menu_close
            this.setResult(1);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // btrg
    public final void onSaveInstanceState(Bundle bundle0) {
        if(this.getIntent() != null && this.getIntent().getData() != null) {
            bundle0.putParcelable("EXTRA_HELP_CONFIG", this.W);
            bundle0.putString("saved_instance_state_content_url", this.k);
            bundle0.putString("saved_instance_state_page_title", this.l);
        }
        super.onSaveInstanceState(bundle0);
    }
}


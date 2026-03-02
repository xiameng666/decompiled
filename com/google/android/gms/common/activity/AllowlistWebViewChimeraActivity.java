package com.google.android.gms.common.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import azsm;
import azsn;
import bbdg;
import ccmq;
import com.google.android.chimera.WebView;
import com.google.android.chimera.android.Activity;

public final class AllowlistWebViewChimeraActivity extends Activity {
    @Override  // com.google.android.chimera.android.Activity
    public final void onCreate(Bundle bundle0) {
        String s;
        super.onCreate(bundle0);
        azsm azsm0 = new azsm();
        Intent intent0 = this.getIntent();
        Uri uri0 = null;
        if(intent0 == null) {
            s = null;
        }
        else {
            Uri uri1 = intent0.getData();
            s = uri1 == null ? "" : uri1.toString();
        }
        if(s != null && !azsm0.a(s)) {
            this.setResult(0);
            this.finish();
            return;
        }
        WebView webView0 = new WebView(this);
        this.setContentView(webView0);
        Intent intent1 = this.getIntent();
        if(intent1 != null) {
            uri0 = intent1.getData();
        }
        if(uri0 != null) {
            webView0.loadUrl(uri0.toString());
        }
        webView0.setWebViewClient(new azsn());
        this.setResult(-1);
    }

    @Override  // com.google.android.chimera.android.Activity
    protected final void onStart() {
        ccmq.a().a(bbdg.vq);
        super.onStart();
    }
}


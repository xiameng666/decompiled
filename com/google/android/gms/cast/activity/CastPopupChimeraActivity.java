package com.google.android.gms.cast.activity;

import android.content.Intent;
import android.os.Bundle;
import atug;
import atuh;
import atui;
import atut;
import atuu;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import java.util.HashMap;
import xob;

@GmsCoreVeId(0x3F0C3)
public class CastPopupChimeraActivity extends xob {
    static final HashMap j;
    atuu k;

    static {
        HashMap hashMap0 = new HashMap();
        CastPopupChimeraActivity.j = hashMap0;
        hashMap0.put("consent", new atug());
        hashMap0.put("com.google.android.gms.cast.activity.CAST_CONNECTION_NOTIFY", new atuh());
        hashMap0.put("com.google.android.gms.cast.activity.CAST_TERMS_OF_SERVICE", new atui());
    }

    @Override  // xoi
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        atuu atuu0 = this.k;
        if(atuu0 != null) {
            atuu0.q(v, v1, intent0);
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.k = null;
        Intent intent0 = this.getIntent();
        String s = intent0.getStringExtra("ACTIVITY_TYPE");
        if(s == null) {
            s = intent0.getAction();
        }
        if(s != null) {
            HashMap hashMap0 = CastPopupChimeraActivity.j;
            if(hashMap0.containsKey(s)) {
                atuu atuu0 = ((atut)hashMap0.get(s)).a(this);
                this.k = atuu0;
                atuu0.g(bundle0);
            }
        }
    }

    @Override  // xoi
    protected final void onDestroy() {
        super.onDestroy();
        atuu atuu0 = this.k;
        if(atuu0 != null) {
            atuu0.h();
        }
    }

    @Override  // xnb
    public final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        atuu atuu0 = this.k;
        if(atuu0 != null) {
            atuu0.i(intent0);
        }
    }

    @Override  // xoi
    protected final void onStart() {
        super.onStart();
        atuu atuu0 = this.k;
        if(atuu0 != null) {
            atuu0.j();
        }
    }

    @Override  // xoi
    protected final void onStop() {
        super.onStop();
        atuu atuu0 = this.k;
        if(atuu0 != null) {
            atuu0.k();
        }
    }
}


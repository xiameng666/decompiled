package com.google.android.gms.wallet.activity;

import ProtoLiteBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import batl;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import faya;
import fayb;
import fbhn;
import fcdh;
import hccp;
import java.util.Locale;

public class OrchestrationDelegatorChimeraActivity extends fayb {
    private faya q;

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        if(!this.q.h(parcelable0, z)) {
            super.E(parcelable0, z);
        }
    }

    @Override  // fayb
    protected final ProtoLiteBuilder ad() {
        ProtoLiteBuilder hftp0 = super.ad();
        int v = this.getIntent().getIntExtra("entryWidgetType", -1);
        if(v != -1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hccp hccp0 = (hccp)hftp0.b_message;
            hccp0.b |= 0x80;
            hccp0.j = v;
        }
        return hftp0;
    }

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        batl.s(buyFlowConfig0);
        batl.s(buyFlowConfig0.b);
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.activity.OrchestrationDelegatorActivity");
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.putExtra("com.google.android.gms.wallet.account", buyFlowConfig0.b.b);
        if(intent0.getExtras() != null) {
            intent1.putExtras(intent0.getExtras());
        }
        return intent1;
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        String s = this.getIntent().getAction();
        batl.t(s, "Intent action must not be null");
        switch(s) {
            case "com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE": {
                this.q = new fbhn(this);
                break;
            }
            case "com.google.android.gms.wallet.firstparty.ACTION_WEB_VIEW_WIDGET": {
                this.q = new fcdh(this);
            }
        }
        faya faya0 = this.q;
        if(faya0 == null) {
            throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported intent action: %s", s));
        }
        faya0.a(bundle0);
        super.onCreate(bundle0);
        this.q.b(bundle0);
    }

    @Override  // fayb
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        this.q.g(menuItem0);
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
        this.q.c();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        this.q.d();
    }

    @Override  // fayb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.q.e(bundle0);
    }
}


package com.google.android.gms.wallet.timelineview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import batl;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import fayb;
import fayc;
import fbgn;
import fbyr;
import fcdh;
import gklu;
import hzmn;
import hzna;

public class TimelineViewChimeraActivity extends fayb {
    private byte[] q;
    private byte[] r;

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        if(hzna.c()) {
            Intent intent1 = new Intent();
            intent1.setClassName(context0, "com.google.android.gms.wallet.timelineview.TimeLineViewActivity");
            intent1.putExtras(intent0.getExtras());
            intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
            intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_TIME_LINE_VIEW");
            return intent1;
        }
        return fcdh.i(context0, intent0, buyFlowConfig0, 24);
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        boolean z = true;
        fbgn.D(this, this.q(), fbgn.j, true);
        this.v(bundle0, hzmn.a.b().k(), 13, gklu.n);
        super.onCreate(bundle0);
        fayc.c(this);
        this.setContentView(0x7F0E0C88);  // layout:wallet_activity_common
        Intent intent0 = this.getIntent();
        this.q = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.r = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        this.hG(((Toolbar)this.findViewById(0x7F0B22D9)));  // id:toolbar
        this.hL().o(true);
        if(((fbyr)this.r()) == null) {
            byte[] arr_b = this.q;
            byte[] arr_b1 = this.r;
            BuyFlowConfig buyFlowConfig0 = this.q();
            String s = this.j;
            LogContext logContext0 = this.k;
            if((arr_b == null || arr_b.length <= 0) && (arr_b1 == null || arr_b1.length <= 0)) {
                z = false;
            }
            batl.c(z, "Parameters or initializeToken is required to launch TimelineView.");
            fbyr fbyr0 = new fbyr();
            Bundle bundle1 = fbyr.cr(buyFlowConfig0, s, logContext0);
            if(arr_b != null) {
                bundle1.putByteArray("parameters", arr_b);
            }
            if(arr_b1 != null) {
                bundle1.putByteArray("initializeToken", arr_b1);
            }
            fbyr0.setArguments(bundle1);
            this.G(fbyr0, 0x7F0B14C8);  // id:fragment_holder
        }
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view0);
        fbgn.B(view0);
    }
}


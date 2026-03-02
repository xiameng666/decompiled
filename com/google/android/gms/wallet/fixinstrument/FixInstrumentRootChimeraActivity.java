package com.google.android.gms.wallet.fixinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import batl;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import fayb;
import fbcn;
import fbgn;
import fbkj;
import gdcb;
import gklu;

public class FixInstrumentRootChimeraActivity extends fayb implements View.OnFocusChangeListener {
    private Toolbar q;
    private View r;
    private byte[] s;
    private byte[] t;
    private byte[] u;

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.fixinstrument.FixInstrumentRootActivity");
        intent1.putExtras(intent0.getExtras());
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT");
        return intent1;
    }

    @Override  // fayb
    public final Intent n() {
        return fbcn.b(this, this.getIntent());
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        Intent intent0 = this.getIntent();
        boolean z = true;
        fbgn.D(this, this.q(), fbgn.e, true);
        this.v(bundle0, true, 8, gklu.j);
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0C89);  // layout:wallet_activity_common_with_focus_stealer
        this.s = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.t = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        this.u = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B22D9);  // id:toolbar
        this.q = toolbar0;
        this.hG(toolbar0);
        this.hL().o(true);
        View view0 = this.findViewById(0x7F0B14A6);  // id:focus_stealer
        this.r = view0;
        view0.setOnFocusChangeListener(this);
        if(((fbkj)this.r()) == null) {
            BuyFlowConfig buyFlowConfig0 = this.q();
            String s = this.j;
            byte[] arr_b = this.s;
            byte[] arr_b1 = this.t;
            byte[] arr_b2 = this.u;
            LogContext logContext0 = this.k;
            boolean z1 = arr_b != null && arr_b.length > 0;
            boolean z2 = arr_b1 != null && arr_b1.length > 0;
            batl.c(z1 || z2, "Parameters or initializeToken is required to launch FixInstrument.");
            if(z1 && z2) {
                z = false;
            }
            batl.c(z, "Only parameters or initializeToken should be set when launching FixInstrument.");
            fbkj fbkj0 = new fbkj();
            Bundle bundle1 = fbkj.cr(buyFlowConfig0, s, logContext0);
            if(arr_b != null) {
                bundle1.putByteArray("parameters", arr_b);
            }
            if(arr_b1 != null) {
                bundle1.putByteArray("initializeToken", arr_b1);
            }
            if(arr_b2 != null) {
                bundle1.putByteArray("productAuthToken", arr_b2);
            }
            fbkj0.setArguments(bundle1);
            this.G(fbkj0, 0x7F0B14C8);  // id:fragment_holder
        }
        View view1 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view1);
        fbgn.B(view1);
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if(z && view0 == this.r) {
            gdcb.ai(this, view0);
        }
    }
}


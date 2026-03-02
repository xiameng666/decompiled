package com.google.android.gms.wallet.addinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import batl;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.wallet.clientlog.LogContext;
import fayb;
import fayg;
import fbgn;
import gklu;

public class AddInstrumentRootChimeraActivity extends fayb {
    private Toolbar q;
    private byte[] r;
    private byte[] s;

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.addinstrument.AddInstrumentRootActivity");
        intent1.putExtras(intent0.getExtras());
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET");
        return intent1;
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        Intent intent0 = this.getIntent();
        boolean z = true;
        fbgn.D(this, this.q(), fbgn.e, true);
        this.v(bundle0, true, 7, gklu.e);
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0C84);  // layout:wallet_activity_add_instrument_widget
        if(intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
            this.r = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        }
        else {
            if(!intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                throw new IllegalArgumentException("AddInstrumentRootChimeraActivity requires AddInstrumentParameters");
            }
            this.r = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        }
        this.s = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B0B1B);  // id:add_instrument_toolbar
        this.q = toolbar0;
        this.hG(toolbar0);
        this.hL().o(true);
        this.m = (ProgressSpinnerView)this.findViewById(0x7F0B1D4C);  // id:progress_spinner_container
        if(((fayg)this.r()) == null) {
            BuyFlowConfig buyFlowConfig0 = this.q();
            String s = this.j;
            byte[] arr_b = this.r;
            byte[] arr_b1 = this.s;
            LogContext logContext0 = this.k;
            if(arr_b == null || arr_b.length <= 0) {
                z = false;
            }
            batl.c(z, "Parameters is required to lauch AddInstrument.");
            fayg fayg0 = new fayg();
            Bundle bundle1 = fayg.cr(buyFlowConfig0, s, logContext0);
            bundle1.putByteArray("parameters", arr_b);
            if(arr_b1 != null) {
                bundle1.putByteArray("productAuthToken", arr_b1);
            }
            fayg0.setArguments(bundle1);
            this.G(fayg0, 0x7F0B0B1A);  // id:add_instrument_container
        }
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view0);
        fbgn.B(view0);
    }
}


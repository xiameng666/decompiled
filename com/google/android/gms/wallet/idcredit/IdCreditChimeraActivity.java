package com.google.android.gms.wallet.idcredit;

import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import fayb;
import fayc;
import fbae;
import fbgn;
import fbkv;
import gaxl;
import gciq;
import gklu;
import hcbc;
import hckt;
import hzji;
import hzlv;

public class IdCreditChimeraActivity extends fayb {
    private final boolean q;

    public IdCreditChimeraActivity() {
        gaxl.a();
        this.q = hzlv.a.b().p();
    }

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        Intent intent0 = IdCreditChimeraActivity.Y(z);
        if(((IdCreditResult)parcelable0) != null) {
            byte[] arr_b = ((IdCreditResult)parcelable0).a;
            if(arr_b != null && arr_b.length > 0) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", arr_b);
            }
        }
        this.M(-1, intent0);
    }

    @Override  // fayb
    protected final boolean S() {
        hcbc hcbc0 = this.getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS") ? ((hcbc)gciq.b(this.getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ((Parser)((ProtoLiteMessage)hcbc.a).jf(7, null)))) : null;
        return hcbc0 != null && hzji.a.d().g().b.contains(Integer.valueOf(hcbc0.e)) || this.af();
    }

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.idcredit.IdCreditActivity");
        intent1.putExtras(intent0.getExtras());
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY");
        return intent1;
    }

    private final boolean af() {
        return this.q ? ((hckt)gciq.b(this.getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", ((Parser)((ProtoLiteMessage)hckt.a).jf(7, null)))) != null : false;
    }

    @Override  // fayb
    protected final Intent n() {
        return this.af() ? fbae.i(this, 7, this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), this.q(), this.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L)) : fbae.k(this, 7, this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), this.q(), this.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        if(this.V()) {
            this.v(bundle0, true, 5, gklu.i);
            super.onCreate(bundle0);
            return;
        }
        Intent intent0 = this.getIntent();
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)intent0.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        fbgn.D(this, buyFlowConfig0, fbgn.e, true);
        this.v(bundle0, true, 5, gklu.i);
        super.onCreate(bundle0);
        fayc.c(this);
        this.setContentView(0x7F0E0C89);  // layout:wallet_activity_common_with_focus_stealer
        this.hG(((Toolbar)this.findViewById(0x7F0B22D9)));  // id:toolbar
        this.hL().o(true);
        if(((fbkv)this.r()) == null) {
            if(intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                String s = this.j;
                LogContext logContext0 = this.k;
                fbkv fbkv0 = new fbkv();
                Bundle bundle1 = fbkv.cr(buyFlowConfig0, s, logContext0);
                bundle1.putByteArray("initializeToken", arr_b);
                fbkv0.setArguments(bundle1);
                this.G(fbkv0, 0x7F0B14C8);  // id:fragment_holder
            }
            else {
                if(!intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                    throw new IllegalArgumentException("IdCreditChimeraActivity requires either encrypted parameters or initialization token");
                }
                byte[] arr_b1 = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                String s1 = this.j;
                LogContext logContext1 = this.k;
                fbkv fbkv1 = new fbkv();
                Bundle bundle2 = fbkv.cr(buyFlowConfig0, s1, logContext1);
                bundle2.putByteArray("encryptedParams", arr_b1);
                fbkv1.setArguments(bundle2);
                this.G(fbkv1, 0x7F0B14C8);  // id:fragment_holder
            }
        }
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view0);
        fbgn.B(view0);
    }
}


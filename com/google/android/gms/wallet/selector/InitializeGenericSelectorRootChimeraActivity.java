package com.google.android.gms.wallet.selector;

import ByteString;
import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import batl;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.clientlog.LogContext;
import fayb;
import fbdt;
import fbgn;
import fbno;
import gciq;
import gfkd;
import gfkg;
import gklu;
import hzmn;

public class InitializeGenericSelectorRootChimeraActivity extends fayb {
    private byte[] q;
    private int r;

    public InitializeGenericSelectorRootChimeraActivity() {
        this.r = 1;
    }

    @Override  // fayb
    public final void B(int v) {
        Intent intent0 = new Intent();
        intent0.putExtra("exitAction", 8);
        int v1 = this.r - 1;
        if(this.r != 0) {
            switch(v1) {
                case 1: {
                    intent0.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", v);
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
                case 3: {
                    intent0.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", v);
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
                default: {
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
            }
        }
        throw null;
    }

    @Override  // fayb
    public final void C(WalletExitResult walletExitResult0) {
        Intent intent0 = new Intent();
        intent0.putExtra("exitAction", 8);
        if(fbdt.a(this.q().c)) {
            walletExitResult0.a().b(intent0);
        }
        int v = walletExitResult0.e;
        int v1 = this.r - 1;
        if(this.r != 0) {
            switch(v1) {
                case 1: {
                    intent0.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", v);
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
                case 3: {
                    intent0.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", v);
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
                default: {
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
                    this.M(1, intent0);
                    return;
                }
            }
        }
        throw null;
    }

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        Intent intent0 = InitializeGenericSelectorRootChimeraActivity.Y(z);
        if(((GenericSelectorResult)parcelable0) != null) {
            if(((GenericSelectorResult)parcelable0).b()) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", ((GenericSelectorResult)parcelable0).f);
            }
            if(((GenericSelectorResult)parcelable0).c()) {
                intent0.putExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS", ((GenericSelectorResult)parcelable0).b);
            }
            if(!((GenericSelectorResult)parcelable0).c() && !((GenericSelectorResult)parcelable0).b()) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", ((GenericSelectorResult)parcelable0).c);
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", ((GenericSelectorResult)parcelable0).d);
                ByteString hfsf0 = ((GenericSelectorResult)parcelable0).e;
                if(hfsf0 != null) {
                    intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_OPTION_TOKEN", hfsf0.toByteArray());
                }
            }
        }
        this.M(-1, intent0);
    }

    public static Intent ae(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        batl.s(buyFlowConfig0);
        batl.s(buyFlowConfig0.b);
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.selector.InitializeGenericSelectorRootActivity");
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.putExtra("com.google.android.gms.wallet.account", buyFlowConfig0.b.b);
        if(intent0.getExtras() != null) {
            intent1.putExtras(intent0.getExtras());
        }
        return intent1;
    }

    @Override  // fayb
    public final void onCreate(Bundle bundle0) {
        fbno fbno0;
        boolean z;
        fbgn.D(this, this.q(), fbgn.e, true);
        int v = this.r - 1;
        if(this.r == 0) {
            throw null;
        }
        if(v == 1 || v == 2) {
            z = true;
        }
        else if(v != 3) {
            z = hzmn.a.b().j();
        }
        else {
            z = hzmn.a.b().h();
        }
        this.v(bundle0, z, 10, gklu.k);
        super.onCreate(bundle0);
        this.r = gfkd.a(this.getIntent().getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_GENERIC_SELECTOR_SCENARIO", 2));
        this.q = this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if(fbgn.Y(this.r)) {
            batl.t(this.q, "GenericSelectorParameters are required.");
        }
        if(bundle0 == null) {
            batl.l(!this.getIntent().hasExtra("com.google.android.gms.identity.intents.EXTRA_REQUEST") || !this.getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_COUNTRY_CODE"));
        }
        this.setContentView(0x7F0E0C8B);  // layout:wallet_activity_initialize_generic_selector
        this.hG(((Toolbar)this.findViewById(0x7F0B22D8)));  // id:tool_bar
        this.hL().o(true);
        fbgn.B(this.findViewById(0x7F0B247C));  // id:wallet_root
        if(((fbno)this.r()) == null) {
            if(this.getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] arr_b = this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                BuyFlowConfig buyFlowConfig0 = this.q();
                byte[] arr_b1 = this.q;
                String s = this.j;
                LogContext logContext0 = this.k;
                if(fbgn.Y(this.r)) {
                    batl.s(arr_b1);
                }
                batl.s(arr_b);
                gfkg gfkg0 = (gfkg)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)gfkg.a).jf(7, null)));
                fbno0 = new fbno();
                Bundle bundle1 = fbno.cr(buyFlowConfig0, s, logContext0);
                bundle1.putByteArray("genericParameters", arr_b1);
                gciq.j(bundle1, "initializeToken", ((MessageLite)gfkg0));
                fbno0.setArguments(bundle1);
            }
            else {
                BuyFlowConfig buyFlowConfig1 = this.q();
                byte[] arr_b2 = this.q;
                String s1 = this.j;
                LogContext logContext1 = this.k;
                batl.s(arr_b2);
                fbno fbno1 = new fbno();
                Bundle bundle2 = fbno.cr(buyFlowConfig1, s1, logContext1);
                bundle2.putByteArray("genericParameters", arr_b2);
                fbno1.setArguments(bundle2);
                fbno0 = fbno1;
            }
            this.G(fbno0, 0x7F0B1FB1);  // id:selector_fragment_holder
        }
    }
}


package com.google.android.gms.tapandpay.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.os.Bundle;
import android.text.TextUtils;
import batl;
import bbcu;
import bboh;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import dydw;
import etmv;
import etsq;
import evgq;
import evhw;
import fshb;
import gjsj;
import gjzl;
import hypg;

@GmsCoreVeId(0x3FE21)
public class WarmWelcomeChimeraActivity extends etsq implements evgq, fshb {
    etmv j;
    boolean k;
    boolean l;
    boolean m;

    static {
        bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // evgq
    public final void a(gjsj gjsj0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjzl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjzl)hftp0.b_message).e = gjsj0.cW;
        ((gjzl)hftp0.b_message).b |= 1;
        gjzl gjzl0 = (gjzl)hftp0.N_build();
        this.j.l(gjzl0);
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // evgq
    public final void m(CardInfo cardInfo0, int v) {
        this.j.l(this.j.h(gjsj.cl, cardInfo0, v));
    }

    @Override  // etsq
    public final void onCreate(Bundle bundle0) {
        WarmWelcomeChimeraActivity warmWelcomeChimeraActivity0 = this;
        super.onCreate(bundle0);
        warmWelcomeChimeraActivity0.k = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("EXTRA_USE_WALLET_QR_UI", false);
        if(!hypg.c()) {
            warmWelcomeChimeraActivity0.setTheme(0x7F16106D);  // style:WalletTheme.NoActionBar
        }
        warmWelcomeChimeraActivity0.setContentView(0x7F0E0BD2);  // layout:tp_warm_welcome_activity
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(warmWelcomeChimeraActivity0.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        if(accountInfo0 == null) {
            warmWelcomeChimeraActivity0 = this;
        }
        else if(!TextUtils.isEmpty(accountInfo0.b)) {
            if(warmWelcomeChimeraActivity0.j == null) {
                warmWelcomeChimeraActivity0.j = new etmv(warmWelcomeChimeraActivity0, accountInfo0);
            }
            if(bundle0 != null) {
                return;
            }
            CardInfo cardInfo0 = (CardInfo)dydw.b(warmWelcomeChimeraActivity0.getIntent(), "extra_card_info", CardInfo.CREATOR);
            warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("extra_is_web_push_provisioning", false);
            warmWelcomeChimeraActivity0.l = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("extra_can_tokenize_to_another_device", false);
            warmWelcomeChimeraActivity0.m = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("card_already_added", false);
            boolean z = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("extra_is_client_side_push_provisioning", false);
            boolean z1 = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("extra_is_upp_account_linking", false);
            batl.s(cardInfo0);
            int v = warmWelcomeChimeraActivity0.getIntent().getIntExtra("EXTRA_TOKENIZATION_ENTRY_POINT", 0);
            boolean z2 = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("EXTRA_SAVE_TO_PLATFORM_SUCCESSFUL", false);
            boolean z3 = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("EXTRA_GOOGLE_OPC_SUPPORTED", false);
            boolean z4 = warmWelcomeChimeraActivity0.getIntent().getBooleanExtra("nfc_device", true);
            boolean z5 = warmWelcomeChimeraActivity0.k;
            boolean z6 = warmWelcomeChimeraActivity0.l;
            boolean z7 = warmWelcomeChimeraActivity0.m;
            evhw evhw0 = new evhw();
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("extra_account_info", accountInfo0);
            bundle1.putParcelable("extra_card_info", cardInfo0);
            bundle1.putInt("EXTRA_TOKENIZATION_ENTRY_POINT", v);
            bundle1.putBoolean("EXTRA_SAVE_TO_PLATFORM_SUCCESSFUL", z2);
            bundle1.putBoolean("EXTRA_GOOGLE_OPC_SUPPORTED", z3);
            bundle1.putBoolean("nfc_device", z4);
            bundle1.putBoolean("EXTRA_USE_WALLET_QR_UI", z5);
            bundle1.putBoolean("extra_can_tokenize_to_another_device", z6);
            bundle1.putBoolean("extra_is_client_side_push_provisioning", z);
            bundle1.putBoolean("extra_is_upp_account_linking", z1);
            bundle1.putBoolean("card_already_added", z7);
            evhw0.setArguments(bundle1);
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x7F0B0403, evhw0);  // id:FragmentContainer
            ca0.a();
            return;
        }
        warmWelcomeChimeraActivity0.setResult(0);
        warmWelcomeChimeraActivity0.finish();
    }
}


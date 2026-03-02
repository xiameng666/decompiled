package com.android.billingclient.api;

import aao;
import acp;
import acy;
import adu;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import rcz;
import rda;
import rdb;
import rdc;

public class ProxyBillingActivityV2 extends aao {
    public ResultReceiver a;
    public ResultReceiver b;
    public ResultReceiver c;
    public ResultReceiver d;
    private acp e;
    private acp k;
    private acp l;
    private acp m;

    @Override  // aao
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.e = this.registerForActivityResult(new adu(), new rcz(this));
        this.k = this.registerForActivityResult(new adu(), new rda(this));
        this.l = this.registerForActivityResult(new adu(), new rdb(this));
        this.m = this.registerForActivityResult(new adu(), new rdc(this));
        if(bundle0 == null) {
            if(this.getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.a = (ResultReceiver)this.getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.e.b(new acy(pendingIntent0).a());
                return;
            }
            if(this.getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent1 = (PendingIntent)this.getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.b = (ResultReceiver)this.getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.k.b(new acy(pendingIntent1).a());
                return;
            }
            if(this.getIntent().hasExtra("external_offer_flow_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent)this.getIntent().getParcelableExtra("external_offer_flow_pending_intent");
                this.c = (ResultReceiver)this.getIntent().getParcelableExtra("external_offer_flow_result_receiver");
                this.l.b(new acy(pendingIntent2).a());
                return;
            }
            if(this.getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
                PendingIntent pendingIntent3 = (PendingIntent)this.getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
                this.d = (ResultReceiver)this.getIntent().getParcelableExtra("launch_external_link_result_receiver");
                this.m.b(new acy(pendingIntent3).a());
            }
        }
        else {
            if(bundle0.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.a = (ResultReceiver)bundle0.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if(bundle0.containsKey("external_payment_dialog_result_receiver")) {
                this.b = (ResultReceiver)bundle0.getParcelable("external_payment_dialog_result_receiver");
            }
            if(bundle0.containsKey("external_offer_flow_result_receiver")) {
                this.c = (ResultReceiver)bundle0.getParcelable("external_offer_flow_result_receiver");
            }
            if(bundle0.containsKey("launch_external_link_result_receiver")) {
                this.d = (ResultReceiver)bundle0.getParcelable("launch_external_link_result_receiver");
            }
        }
    }

    @Override  // aao
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        ResultReceiver resultReceiver0 = this.a;
        if(resultReceiver0 != null) {
            bundle0.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver0);
        }
        ResultReceiver resultReceiver1 = this.b;
        if(resultReceiver1 != null) {
            bundle0.putParcelable("external_payment_dialog_result_receiver", resultReceiver1);
        }
        ResultReceiver resultReceiver2 = this.c;
        if(resultReceiver2 != null) {
            bundle0.putParcelable("external_offer_flow_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.d;
        if(resultReceiver3 != null) {
            bundle0.putParcelable("launch_external_link_result_receiver", resultReceiver3);
        }
    }
}


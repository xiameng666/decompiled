package com.google.android.gms.presencemanager.communal.activity;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bauc;
import bbcu;
import bboh;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ejfr;
import ejfs;
import ejfu;
import gfqx;
import gfsx;
import gftb;
import gmap;
import gmbu;
import gmcg;
import gmcn;
import grte;
import java.util.concurrent.Executors;
import xni;

@GmsCoreVeId(0x3FCA0)
public final class ConsentChimeraActivity extends xni implements View.OnClickListener {
    public ejfu j;
    private Account k;
    private String l;
    private String m;
    private String n;
    private gmcg o;

    static {
        bboh.b("ConsentChimeraActivity", bbcu.eJ);
    }

    public final void a(Status status0, gfsx gfsx0) {
        Intent intent0 = this.getIntent();
        bauc.l(status0, intent0, "status_key");
        if(gfsx0.i()) {
            intent0.putExtra("credential_key", ((String)gfsx0.d()));
        }
        this.setResult(-1, intent0);
        this.finish();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(view0.getId()) {
            case 0x7F0B0DA0: {  // id:button_accept
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grte.a).v_newBuilder();
                String s = this.l;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((grte)hftv0).b = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grte.b(((grte)hftp0.b_message));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grte.c(((grte)hftp0.b_message));
                String s1 = this.m;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grte grte0 = (grte)hftp0.b_message;
                s1.getClass();
                grte0.c = s1;
                grte grte1 = (grte)hftp0.N_build();
                gmbu.t(this.o.e(new ejfr(this, grte1)), new ejfs(this), gmap.a);
                return;
            }
            case 0x7F0B0DC0: {  // id:button_reject
                this.a(new Status(16), gfqx.a);
            }
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0237);  // layout:consent
        Bundle bundle1 = this.getIntent().getExtras();
        if(bundle1 != null) {
            this.k = (Account)bundle1.getParcelable("communal_account_key");
            this.l = bundle1.getString("communal_obfuscated_gaia_id_key");
            this.m = bundle1.getString("communal_consent_id_key");
            this.n = bundle1.getString("communal_consent_key");
            ((TextView)this.findViewById(0x7F0B226E)).setText(this.n);  // id:text_consent
        }
        ((Button)this.findViewById(0x7F0B0DA0)).setOnClickListener(this);  // id:button_accept
        ((Button)this.findViewById(0x7F0B0DC0)).setOnClickListener(this);  // id:button_reject
        Account account0 = this.k;
        gftb.check(account0);
        this.j = new ejfu(this, account0);
        this.o = gmcn.a(Executors.newCachedThreadPool());
    }
}


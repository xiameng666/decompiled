package com.google.android.gms.wearable.backup.wear;

import acn;
import acp;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import baun;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fcgf;
import fcoo;
import fcop;
import fcoq;
import fcor;
import fcsy;
import fcsz;
import fcta;
import xnb;
import xob;

@GmsCoreVeId(0x3FEB7)
public final class WearBackupConfirmationChimeraActivity extends xob {
    private static final baun j;
    private static final fcoo k;
    private static final fcoo l;
    private static final fcoo m;

    static {
        WearBackupConfirmationChimeraActivity.j = new fcgf(new String[]{"WearBackupConfirmation"});
        fcop fcop0 = new fcop();
        fcop0.d(0.125f);
        fcop0.b(0.208f);
        fcop0.c(0.0f);
        fcoq fcoq0 = fcop0.a();
        fcop fcop1 = new fcop();
        fcop1.d(0.122f);
        fcop1.b(0.208f);
        fcop1.c(0.0f);
        WearBackupConfirmationChimeraActivity.k = new fcoo(fcoq0, fcop1.a());
        fcop fcop2 = new fcop();
        fcop2.d(0.0f);
        fcop2.b(0.0f);
        fcop2.c(0.094f);
        fcoq fcoq1 = fcop2.a();
        fcop fcop3 = new fcop();
        fcop3.d(0.0f);
        fcop3.b(0.0f);
        fcop3.c(0.056f);
        WearBackupConfirmationChimeraActivity.l = new fcoo(fcoq1, fcop3.a());
        fcop fcop4 = new fcop();
        fcop4.d(0.0f);
        fcop4.b(0.0f);
        fcop4.c(0.052f);
        fcoq fcoq2 = fcop4.a();
        fcop fcop5 = new fcop();
        fcop5.d(0.0f);
        fcop5.b(0.0f);
        fcop5.c(0.028f);
        WearBackupConfirmationChimeraActivity.m = new fcoo(fcoq2, fcop5.a());
    }

    static acp a(xnb xnb0, acn acn0) {
        return xnb0.registerForActivityResult(new fcta(), acn0);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.nF);
        super.onCreate(bundle0);
        baun baun0 = WearBackupConfirmationChimeraActivity.j;
        baun0.j("onCreate", new Object[0]);
        this.setContentView(0x7F0E0E8A);  // layout:wear_backup_confirmation_activity
        fcor.b(this, this.findViewById(0x7F0B0FCE), WearBackupConfirmationChimeraActivity.k);  // id:container
        fcor.b(this, this.findViewById(0x7F0B226F), WearBackupConfirmationChimeraActivity.l);  // id:text_container
        fcor.b(this, this.findViewById(0x7F0B0EF0), WearBackupConfirmationChimeraActivity.m);  // id:chip_btn_container
        ((TextView)this.findViewById(0x7F0B0F8B)).setText(this.getIntent().getStringExtra("confirmation_title"));  // id:confirmation_title
        TextView textView0 = (TextView)this.findViewById(0x7F0B0F89);  // id:confirmation_content
        if(this.getIntent().hasExtra("confirmation_content")) {
            textView0.setText(this.getIntent().getStringExtra("confirmation_content"));
        }
        else {
            textView0.setVisibility(8);
        }
        fcsy fcsy0 = new fcsy(this);
        fcsz fcsz0 = new fcsz(this);
        switch(this.getIntent().getIntExtra("button_style", 0)) {
            case 0: {
                ((ImageButton)this.findViewById(0x7F0B1EA4)).setOnClickListener(fcsy0);  // id:round_cancel_btn
                ((ImageButton)this.findViewById(0x7F0B1EA5)).setOnClickListener(fcsz0);  // id:round_confirm_btn
                this.findViewById(0x7F0B1EA3).setVisibility(0);  // id:round_btn_container
                return;
            }
            case 1: {
                ((Button)this.findViewById(0x7F0B0EF4)).setOnClickListener(fcsz0);  // id:chip_confirm_btn
                ((Button)this.findViewById(0x7F0B0EF2)).setOnClickListener(fcsy0);  // id:chip_cancel_btn
                this.findViewById(0x7F0B0EF0).setVisibility(0);  // id:chip_btn_container
                return;
            }
            case 2: {
                ((ImageButton)this.findViewById(0x7F0B205B)).setOnClickListener(fcsy0);  // id:single_round_cancel_btn
                this.findViewById(0x7F0B205A).setVisibility(0);  // id:single_round_btn_container
                return;
            }
            default: {
                baun0.f("Unknown ButtonStyle", new Object[0]);
                this.finish();
            }
        }
    }
}


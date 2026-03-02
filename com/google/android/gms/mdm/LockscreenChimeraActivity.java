package com.google.android.gms.mdm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import bbmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cqhn;
import cqht;
import cqim;
import cqqg;
import cqqt;
import hxwi;
import jys;
import kex;
import lvj;
import pc;

@GmsCoreVeId(0x3FCCD)
public class LockscreenChimeraActivity extends cqhn {
    Button o;
    public static final int p;

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Intent intent0;
        if(view0 == this.k) {
            intent0 = new Intent("android.intent.action.CALL");
            intent0.setData(Uri.parse(String.format("tel:%1$s", this.l)));
            intent0.setFlags(0x800000);
        }
        else if(view0 == this.o) {
            intent0 = new Intent("com.android.phone.EmergencyDialer.DIAL");
            intent0.setFlags(0x800000);
        }
        else {
            intent0 = null;
        }
        String s = cqqg.c(this.getPackageManager(), intent0);
        if(s != null) {
            intent0.setPackage(s);
        }
        this.startActivity(intent0);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        String s = this.getIntent().getStringExtra("lock_message");
        if(TextUtils.isEmpty(s)) {
            cqqt.a("LockscreenActivity started without a lock message, closing.", new Object[0]);
            this.setResult(0);
            this.finish();
            return;
        }
        this.getWindow().addFlags(0x280000);
        this.setContentView(0x7F0E056E);  // layout:mdm_lockscreen_activity
        ((TextView)this.findViewById(0x7F0B185B)).setText(s);  // id:lock_message
        this.k = (ImageButton)this.findViewById(0x7F0B1C60);  // id:phone_number_call
        TextView textView0 = (TextView)this.findViewById(0x7F0B1C61);  // id:phone_number_call_label
        if(this.getIntent().hasExtra("phone_number")) {
            this.l = this.getIntent().getStringExtra("phone_number");
            this.k.setImageDrawable(pc.d().c(this, 0x7F0808F2));  // drawable:mdm_ic_call
            this.k.setOnClickListener(this);
        }
        else {
            this.k.setVisibility(8);
            textView0.setVisibility(8);
        }
        Button button0 = (Button)this.findViewById(0x7F0B11FB);  // id:emergency_call
        this.o = button0;
        button0.setOnClickListener(this);
        if(bbmq.O(this)) {
            this.setRequestedOrientation(1);
        }
        else {
            this.o.setVisibility(8);
        }
        this.m = lvj.a(this);
        this.m.c(this.n, LockscreenChimeraActivity.j);
        new cqim().a();
        if(hxwi.i() && jys.d()) {
            kex.b(this.getWindow().getDecorView(), new cqht());
            this.getWindow().setNavigationBarContrastEnforced(false);
            this.getWindow().setNavigationBarColor(0);
        }
    }

    @Override  // xoi
    public final void onDestroy() {
        this.m.d(this.n);
        super.onDestroy();
    }
}


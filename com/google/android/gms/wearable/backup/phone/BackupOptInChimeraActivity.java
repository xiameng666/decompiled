package com.google.android.gms.wearable.backup.phone;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import baun;
import bbdg;
import bbll;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.wearable.AppTheme;
import evql;
import fcfg;
import fcfy;
import fcgf;
import fcgl;
import fcgr;
import fcgs;
import fcgt;
import fcgu;
import fcgv;
import fcgw;
import fcgx;
import fchd;
import fchf;
import fchg;
import fchh;
import fchm;
import fciy;
import fexs;
import fext;
import fezd;
import feze;
import gged_interceptors;
import hfrj;
import hfuf;
import hfuo;
import j..util.Collection.-EL;
import j..util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import xni;

@GmsCoreVeId(0x3FEB2)
public class BackupOptInChimeraActivity extends xni {
    public static final baun j;
    public static final feze k;
    static final Optional l;
    static final Optional m;
    static final Optional n;
    static final Optional o;
    public final ScheduledExecutorService p;
    public String q;
    public String r;
    public fciy s;
    public fcfg t;
    public fcfy u;
    public Button v;
    public AppTheme w;
    public String x;

    static {
        BackupOptInChimeraActivity.j = new fcgf(new String[]{"BackupOptInActivity"});
        fezd fezd0 = (fezd)((ProtoLiteMessage)feze.a).v_newBuilder();
        if(!fezd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fezd0).ensureMutable();
        }
        feze.c(((feze)fezd0.b_message));
        fezd0.l(0x7F1504A8);  // string:backup_opt_in_title "Back up your watch with Google One"
        gged_interceptors gged0 = gged_interceptors.t(Integer.valueOf(0x7F1504A7), Integer.valueOf(0x7F1504A6), Integer.valueOf(0x7F150879), Integer.valueOf(0x7F1504A2), Integer.valueOf(0x7F1504A1), Integer.valueOf(0x7F1504A0), Integer.valueOf(0x7F15049F), Integer.valueOf(0x7F1504A4), Integer.valueOf(0x7F1504A3));  // string:backup_opt_in_storage_header "Use your %1$s of Google Account storage to 
                                                                                                                                                                                                                                                                                                                             // back up:"
        if(!fezd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fezd0).ensureMutable();
        }
        feze feze0 = (feze)fezd0.b_message;
        feze0.b();
        hfrj.E(gged0, feze0.d);
        fezd0.k(0x7F1508F4);  // string:common_turn_on "Turn on"
        fezd0.a(0x7F1508A4);  // string:common_not_now "Not now"
        gged_interceptors gged1 = gged_interceptors.n(Integer.valueOf(0x7F150910), Integer.valueOf(0x7F15090F), Integer.valueOf(0x7F150870));  // string:companion_backup_more_details_dialog_title "Back up with Google One"
        if(!fezd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fezd0).ensureMutable();
        }
        feze feze1 = (feze)fezd0.b_message;
        hfuf hfuf0 = feze1.g;
        if(!hfuf0.c()) {
            feze1.g = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(gged1, feze1.g);
        BackupOptInChimeraActivity.k = (feze)((ProtoLiteBuilder)fezd0).N_build();
        BackupOptInChimeraActivity.l = Optional.empty();
        BackupOptInChimeraActivity.m = Optional.empty();
        BackupOptInChimeraActivity.n = Optional.empty();
        BackupOptInChimeraActivity.o = Optional.empty();
    }

    public BackupOptInChimeraActivity() {
        this.p = new bbll(1, 9);
    }

    public static Intent a(String s, String s1, fext fext0, String s2) {
        Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.phone.BackupOptInActivity").putExtra("node_id", s);
        if(s1 != null) {
            intent0.putExtra("account_name", s1);
        }
        if(fext0 != null) {
            intent0.putExtra("backup_status", fext0.toBytesArray());
        }
        intent0.putExtra("calling_package", s2);
        return intent0;
    }

    public final void g(fext fext0) {
        hfuo hfuo0 = fext0.d;
        if(hfuo0.isEmpty()) {
            this.setResult(6);
            fcgr.a(this, 0x7F150913, 0x7F150912, true, this.w);  // string:companion_backup_no_accounts_dialog_title "Sign in to a Google Account"
            return;
        }
        fexs fexs0 = this.r == null ? ((fexs)hfuo0.get(0)) : ((fexs)Collection.-EL.stream(hfuo0).filter(new fcgs(this)).findFirst().orElse(((fexs)hfuo0.get(0))));
        BackupOptInChimeraActivity.j.j("Showing backup opt-in UI for account %s", new Object[]{baun.q(fexs0.c)});
        this.u.a(fexs0.c, ((ImageView)this.findViewById(0x7F0B0A72)));  // id:account_icon
        ((TextView)this.findViewById(0x7F0B0A81)).setText(fexs0.c);  // id:account_name
        Button button0 = (Button)this.findViewById(0x7F0B237F);  // id:turn_on_button
        button0.setEnabled(true);
        button0.setOnClickListener(new fchd(this, button0, fexs0));
        ((ConstraintLayout)this.findViewById(0x7F0B0AA3)).setOnClickListener(new fchf(this, hfuo0, fext0));  // id:account_touch_target
        evql evql0 = this.s.f(this.q, fexs0.c);
        evql0.b(new fchg(this));
        evql0.A(new fchh());
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        Optional optional0;
        ccmq.a().a(bbdg.nJ);
        super.onCreate(bundle0);
        if(bundle0 == null) {
            optional0 = Optional.ofNullable(this.getIntent().getStringExtra("node_id"));
            this.r = this.getIntent().getStringExtra("account_name");
            this.x = this.getIntent().getStringExtra("calling_package");
        }
        else {
            Optional optional1 = Optional.ofNullable(bundle0.getString("node_id"));
            this.r = bundle0.getString("account_name");
            this.x = bundle0.getString("calling_package");
            optional0 = optional1;
        }
        fchm fchm0 = new fchm(this);
        fcgl fcgl0 = (fcgl)BackupOptInChimeraActivity.o.orElseGet(fchm0);
        if(optional0.isEmpty()) {
            BackupOptInChimeraActivity.j.f("Provided node_id extra was null", new Object[0]);
            fcgl0.a(this.x, new fcgt(this));
            return;
        }
        String s = (String)optional0.get();
        this.q = s;
        BackupOptInChimeraActivity.j.j("onCreate. node_id=" + s, new Object[0]);
        fcgu fcgu0 = new fcgu(this);
        this.s = (fciy)BackupOptInChimeraActivity.l.orElseGet(fcgu0);
        fcgv fcgv0 = new fcgv(this);
        this.t = (fcfg)BackupOptInChimeraActivity.m.orElseGet(fcgv0);
        fcgw fcgw0 = new fcgw(this);
        this.u = (fcfy)BackupOptInChimeraActivity.n.orElseGet(fcgw0);
        fcgl0.a(this.x, new fcgx(this));
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putString("node_id", this.q);
        bundle0.putString("account_name", this.r);
        bundle0.putString("calling_package", this.x);
        super.onSaveInstanceState(bundle0);
    }
}


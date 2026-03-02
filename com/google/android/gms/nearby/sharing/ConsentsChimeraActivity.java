package com.google.android.gms.nearby.sharing;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.nearby.sharing.view.NavigationLayout;
import cutr;
import dbwq;
import dbxi;
import dbxj;
import dbxl;
import dbxm;
import dbxr;
import dbxs;
import dcow;
import dcpt;
import dcvz;
import dcww;
import ddki;
import dizg;
import evql;
import gyre;
import gysp;
import gzat;
import hvqs;
import hvqz;
import j..util.Objects;
import jwe;

@GmsCoreVeId(0x3FB95)
public class ConsentsChimeraActivity extends dbwq {
    public TextView A;
    public TextView B;
    public Button C;
    public Button D;
    public Button E;
    public int F;
    private ImageView G;
    private TextView H;
    private final BroadcastReceiver I;
    public ProgressBar w;
    public View x;
    public TextView y;
    public TextView z;

    public ConsentsChimeraActivity() {
        this.F = 3;
        this.I = new ConsentsChimeraActivity.1(this);
    }

    @Override  // dbwq
    protected final gzat l() {
        return gzat.b;
    }

    @Override  // dbwq
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.ConsentsActivity";
    }

    @Override  // dbwq
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        super.onCreate(bundle0);
        if(hvqs.bg()) {
            if(hvqz.d().isEmpty() && dcww.a(this) == null) {
                this.setTitle("Quick Share");
            }
            else {
                this.setTitle("Nearby Share");
            }
            this.setContentView(0x7F0E0993);  // layout:sharing_activity_consents
            this.findViewById(0x7F0B22E5).setVisibility(8);  // id:toolbar_wrapper
            this.w = (ProgressBar)this.findViewById(0x7F0B0FAD);  // id:consents_text_loading_progress_bar
            this.x = this.findViewById(0x7F0B0A75);  // id:account_info
            this.G = (ImageView)this.findViewById(0x7F0B0A72);  // id:account_icon
            this.H = (TextView)this.findViewById(0x7F0B0A6E);  // id:account_email
            this.y = (TextView)this.findViewById(0x7F0B0A70);  // id:account_full_name
            this.findViewById(0x7F0B0FAC).setVisibility(8);  // id:consents_introduction
            this.z = (TextView)this.findViewById(0x7F0B110F);  // id:device_contacts_title
            this.A = (TextView)this.findViewById(0x7F0B110D);  // id:device_contacts_description
            this.B = (TextView)this.findViewById(0x7F0B110E);  // id:device_contacts_footer
            NavigationLayout navigationLayout0 = (NavigationLayout)this.findViewById(0x7F0B19B2);  // id:nav_bar
            this.o(navigationLayout0);
            this.C = (Button)navigationLayout0.findViewById(0x7F0B2061);  // id:skip_button
            this.D = (Button)navigationLayout0.findViewById(0x7F0B19D5);  // id:negative_button
            this.E = (Button)navigationLayout0.findViewById(0x7F0B1CE5);  // id:positive_button
            this.C.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.setResult(0);
                Account account0 = this.a();
                if(account0 != null) {
                    this.k.H(account0, 1);
                }
                this.finishAfterTransition();
            });
            this.D.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.setResult(0);
                Account account0 = this.a();
                if(account0 != null) {
                    this.k.H(account0, 1);
                }
                this.finishAfterTransition();
            });
            this.E.setOnClickListener(new dbxl(this));
            return;
        }
        this.finish();
    }

    @Override  // dbwq
    public final void onDestroy() {
        super.onDestroy();
        int v = this.F;
        ProtoLiteBuilder hftp0 = dcpt.L(43);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyre.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyre)hftv0).c = 2;
        ((gyre)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyre gyre0 = (gyre)hftp1.b_message;
        if(v == 0) {
            throw null;
        }
        gyre0.d = v - 1;
        gyre0.b |= 2;
        gyre gyre1 = (gyre)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyre1.getClass();
        gysp0.P = gyre1;
        gysp0.c |= 0x2000;
        this.p(new dcow(((gysp)hftp0.N_build())));
    }

    @Override  // dbwq
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.t();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // dbwq
    public final void onPause() {
        super.onPause();
        cutr.f(this, this.I);
    }

    @Override  // dbwq
    public final void onResume() {
        super.onResume();
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        jwe.b(this, this.I, intentFilter0, 2);
    }

    @Override  // dbwq
    protected final void r() {
        this.u();
    }

    // Detected as a lambda impl.
    public final void t() {
        this.setResult(0);
        Account account0 = this.a();
        if(account0 != null) {
            this.k.H(account0, 1);
        }
        this.finishAfterTransition();
    }

    public final void u() {
        Account account0 = this.a();
        if(account0 == null) {
            dcvz.a.e().p("Unable to enable device contacts: account is null.", new Object[0]);
            this.v();
            return;
        }
        this.H.setText(account0.name);
        evql evql0 = dizg.c(this, account0);
        ImageView imageView0 = this.G;
        Objects.requireNonNull(imageView0);
        evql0.b(new dbxr(imageView0));
        evql0.A(new dbxs());
        evql evql1 = dizg.d(account0);
        evql1.b(new dbxi(this));
        evql1.A(new dbxj());
        evql evql2 = ddki.a(this).c(account0);
        evql2.b(new dbxm(this));
        evql2.A((/* MISSING LAMBDA PARAMETER */) -> Toast.makeText(this, "@com.google.android.gms:string/common_no_network", 0).show());
    }

    public final void v() {
        Toast.makeText(this, "@com.google.android.gms:string/sharing_no_account", 0).show();
    }

    // Detected as a lambda impl.
    public final void w() {
        Toast.makeText(this, "@com.google.android.gms:string/common_no_network", 0).show();
    }
}


package com.google.android.gms.wallet.ow;

import MessageLite;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import bata;
import batl;
import ca;
import com.google.android.gms.wallet.analytics.events.CreateWalletObjectsEvent;
import com.google.android.gms.wallet.common.ui.AccountSelector;
import com.google.android.gms.wallet.common.ui.ButtonBar;
import com.google.android.gms.wallet.common.ui.TopBarView;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import du;
import etgl;
import evql;
import fayi;
import fazx;
import fbdq;
import fbet;
import fbeu;
import fbfk;
import fbfm;
import fbfn;
import fbgn;
import fbmo;
import fbmq;
import fbnp;
import fbnw;
import fbxw;
import fbxy;
import fbya;
import fbyc;
import gciq;
import gczl;
import gczm;
import gkkk;
import guyp;
import java.util.ArrayList;
import java.util.HashSet;
import xni;

public class RootChimeraActivity extends xni implements View.OnClickListener, fayi, fbfk, gczl {
    private BuyFlowConfig A;
    private HashSet B;
    private final fbnw C;
    public static final String j;
    public boolean k;
    public boolean l;
    public ButtonBar m;
    public View n;
    public View o;
    public TopBarView p;
    public Account q;
    etgl r;
    private gczm s;
    private String t;
    private String u;
    private String v;
    private guyp w;
    private boolean x;
    private int y;
    private boolean z;

    static {
        RootChimeraActivity.j = "createWalletObjects:TransactionRetainerFragment";
    }

    public RootChimeraActivity() {
        this.y = -1;
        this.C = new fbmq(this);
    }

    // Detected as a lambda impl.
    public final void a() {
        fbet[] arr_fbet;
        if(!this.x) {
            this.n.setVisibility(8);
            this.o.setVisibility(0);
        }
        if(this.q == null) {
            this.q = this.A.b.b;
            this.p.a(this.A.b.b);
        }
        TopBarView topBarView0 = this.p;
        AccountSelector accountSelector0 = topBarView0.a;
        if(accountSelector0 != null) {
            fazx.a();
            Account[] arr_account = fazx.c(topBarView0.getContext());
            if(arr_account == null) {
                arr_fbet = null;
            }
            else {
                fbet[] arr_fbet1 = new fbet[arr_account.length];
                for(int v = 0; v < arr_account.length; ++v) {
                    arr_fbet1[v] = new fbet(arr_account[v]);
                }
                arr_fbet = arr_fbet1;
            }
            if(arr_fbet.length > 1) {
                accountSelector0.b.setAdapter(new fbeu(accountSelector0.getContext(), arr_fbet));
                accountSelector0.b.setVisibility(0);
            }
            else {
                if(arr_fbet.length == 1) {
                    accountSelector0.a = arr_fbet[0].a;
                }
                accountSelector0.b.setVisibility(8);
            }
            accountSelector0.b();
            if(arr_fbet.length == 1) {
                RootChimeraActivity rootChimeraActivity0 = accountSelector0.c;
                if(rootChimeraActivity0 != null) {
                    rootChimeraActivity0.l(accountSelector0.a);
                }
            }
            accountSelector0.c = this;
        }
        if(this.s() == null) {
            this.u();
        }
        this.x();
        if(!this.x && !this.k) {
            this.t();
        }
    }

    @Override  // gczl
    public final void aD(int v, int v1) {
        if(v1 == 1000) {
            if(v != 1) {
                this.w();
                return;
            }
            this.t();
            return;
        }
        Log.e("RootChimeraActivity", "Unknown error dialog error code: " + v1);
    }

    @Override  // fbfk
    public final void ah() {
        this.w();
    }

    @Override  // fbfk
    public final void ai(int v) {
        if(v == 3) {
            this.g(7);
            return;
        }
        this.g(411);
    }

    @Override  // fbfk
    public final void aj() {
        du du0 = this.getSupportFragmentManager().h("RetrieveAuthTokensFragment");
        if(du0 != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.o(du0);
            ca0.a();
        }
    }

    public final void g(int v) {
        Intent intent0 = new Intent();
        fbdq.b(this.A, intent0, v);
        this.r(5);
        this.n(1, intent0);
    }

    public final void l(Account account0) {
        if(!bata.b(account0, this.q)) {
            this.getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
            this.getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_INSTRUMENT_ID");
            this.getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_ADDRESS_ID");
            this.q = account0;
            this.y();
            fbfn fbfn0 = this.s();
            if(fbfn0 != null) {
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.o(fbfn0);
                ca0.a();
            }
            this.getSupportFragmentManager().aq();
            fbxy fbxy0 = BuyFlowConfig.b(this.A);
            fbxw fbxw0 = ApplicationParameters.b(this.A.b);
            fbxw0.d(account0);
            fbxy0.b(fbxw0.a);
            this.A = fbxy0.a();
            this.u();
            this.x();
            this.t();
        }
    }

    public final void n(int v, Intent intent0) {
        if(intent0 == null) {
            intent0 = new Intent();
        }
        this.setResult(v, intent0);
        this.finish();
    }

    public final void o() {
        if(this.s != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.o(this.s);
            ca0.a();
        }
        gczm gczm0 = gczm.B();
        this.s = gczm0;
        gczm0.ag = this;
        gczm0.show(this.getSupportFragmentManager(), "RootChimeraActivity.NETWORK_ERROR_DIALOG");
    }

    @Override  // gamd
    public final Account oc() {
        return this.q;
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.l) {
            this.n(-1, null);
            return;
        }
        this.w();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0.getId() == 0x7F0B1CE3) {  // id:positive_btn
            this.v();
            return;
        }
        if(this.l) {
            this.n(-1, new Intent());
            return;
        }
        this.w();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        String s1;
        String s;
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getIntent().getParcelableExtra("buyFlowConfig");
        this.A = buyFlowConfig0;
        batl.s(buyFlowConfig0);
        super.onCreate(bundle0);
        fbgn.D(this, this.A, fbgn.a, false);
        this.setContentView(0x7F0E0C95);  // layout:wallet_activity_simple_dialog
        if(this.r == null) {
            this.r = new etgl(this);
        }
        ButtonBar buttonBar0 = (ButtonBar)this.findViewById(0x7F0B0DA3);  // id:button_bar
        this.m = buttonBar0;
        buttonBar0.a.setOnClickListener(this);
        this.m.c.setOnClickListener(this);
        this.n = this.findViewById(0x7F0B1B8E);  // id:overlay_progress_spinner
        this.o = this.findViewById(0x7F0B1145);  // id:dialog_content
        this.p = (TopBarView)this.findViewById(0x7F0B22EB);  // id:top_bar
        this.z();
        this.setTitle(0x7F15083B);  // string:common_google_pay_icon_with_text_content_description "Google Pay"
        this.B = new HashSet();
        batl.s(this.A.b);
        batl.s(this.A.b.b);
        if(bundle0 != null) {
            this.y = bundle0.getInt("serviceConnectionSavePoint", -1);
            this.x = bundle0.getBoolean("remoteOperationInProgress", false);
            this.k = bundle0.getBoolean("immediateSaveFinished", false);
            this.q = (Account)bundle0.getParcelable("account");
            if(bundle0.containsKey("accountsThatHaveRequestedAuthTokens")) {
                ArrayList arrayList0 = bundle0.getParcelableArrayList("accountsThatHaveRequestedAuthTokens");
                this.B.addAll(arrayList0);
            }
        }
        this.w = (guyp)gciq.b(this.getIntent(), "com.google.android.gms.wallet.CREATE_WALLET_OBJECTS_REQUEST", ((Parser)((ProtoLiteMessage)guyp.a).jf(7, null)));
        this.u = this.getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        this.t = this.getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        this.v = this.getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_OBJECT_DESCRIPTION");
        int v = this.getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0);
        fazx.a();
        this.l = v == 1 && fazx.c(this).length == 1;
        TextView textView0 = (TextView)this.findViewById(0x7F0B0F8A);  // id:confirmation_text
        if(this.l) {
            this.m.c.setText("Got it");
            this.m.b.setVisibility(8);
            if(this.w.d.size() > 0) {
                s = this.getString(0x7F15354D, new Object[]{this.v});  // string:wallet_saved_loyalty_or_gift_card_wallet_object_message "Your %1$s card was 
                                                                       // saved to the Google Pay app"
                textView0.setText(s);
                goto label_63;
            }
            if(this.w.e.size() > 0) {
                s = this.getString(0x7F15354E, new Object[]{this.u});  // string:wallet_saved_offer_wallet_object_message "Your %1$s offer was saved to the 
                                                                       // Google Pay app"
                textView0.setText(s);
                goto label_63;
            }
            if(this.w.f.size() <= 0) {
                throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
            }
            s = this.getString(0x7F15354D, new Object[]{this.u});  // string:wallet_saved_loyalty_or_gift_card_wallet_object_message "Your %1$s card was 
                                                                   // saved to the Google Pay app"
            textView0.setText(s);
        }
        else {
            TypedArray typedArray0 = this.obtainStyledAttributes(new int[]{0x7F040360});  // attr:colorWalletNormalText
            int v1 = typedArray0.getColor(0, 0xFF000000);
            typedArray0.recycle();
            this.m.c.setTextColor(v1);
            if(this.w.d.size() > 0) {
                s1 = this.getString(0x7F153522, new Object[]{this.v});  // string:wallet_confirm_loyalty_or_gift_wallet_object_creation "Save your %1$s card 
                                                                        // to the Google Pay app?"
            }
            else {
                if(this.w.e.size() > 0) {
                    s1 = this.getString(0x7F153523, new Object[]{this.u});  // string:wallet_confirm_offer_wallet_object_creation "Save your %1$s offer to the 
                                                                            // Google Pay app?"
                    goto label_62;
                }
                if(this.w.f.size() <= 0) {
                    throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
                }
                s1 = this.getString(0x7F153522, new Object[]{this.u});  // string:wallet_confirm_loyalty_or_gift_wallet_object_creation "Save your %1$s card 
                                                                        // to the Google Pay app?"
            }
        label_62:
            textView0.setText(s1);
        }
    label_63:
        if(this.x && this.l) {
            this.o.setVisibility(8);
            this.n.setVisibility(0);
        }
        if(this.q == null) {
            this.n.setVisibility(0);
            evql evql0 = this.r.j();
            evql0.x(this, new fbmo(this));
            evql0.u(this, (/* MISSING LAMBDA PARAMETER */) -> {
                fbet[] arr_fbet;
                if(!this.x) {
                    this.n.setVisibility(8);
                    this.o.setVisibility(0);
                }
                if(this.q == null) {
                    this.q = this.A.b.b;
                    this.p.a(this.A.b.b);
                }
                TopBarView topBarView0 = this.p;
                AccountSelector accountSelector0 = topBarView0.a;
                if(accountSelector0 != null) {
                    fazx.a();
                    Account[] arr_account = fazx.c(topBarView0.getContext());
                    if(arr_account == null) {
                        arr_fbet = null;
                    }
                    else {
                        fbet[] arr_fbet1 = new fbet[arr_account.length];
                        for(int v = 0; v < arr_account.length; ++v) {
                            arr_fbet1[v] = new fbet(arr_account[v]);
                        }
                        arr_fbet = arr_fbet1;
                    }
                    if(arr_fbet.length > 1) {
                        accountSelector0.b.setAdapter(new fbeu(accountSelector0.getContext(), arr_fbet));
                        accountSelector0.b.setVisibility(0);
                    }
                    else {
                        if(arr_fbet.length == 1) {
                            accountSelector0.a = arr_fbet[0].a;
                        }
                        accountSelector0.b.setVisibility(8);
                    }
                    accountSelector0.b();
                    if(arr_fbet.length == 1) {
                        RootChimeraActivity rootChimeraActivity0 = accountSelector0.c;
                        if(rootChimeraActivity0 != null) {
                            rootChimeraActivity0.l(accountSelector0.a);
                        }
                    }
                    accountSelector0.c = this;
                }
                if(this.s() == null) {
                    this.u();
                }
                this.x();
                if(!this.x && !this.k) {
                    this.t();
                }
            });
            return;
        }
        this.a();
    }

    @Override  // xoi
    public final void onPause() {
        super.onPause();
        this.y();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        gczm gczm0 = (gczm)this.getSupportFragmentManager().h("RootChimeraActivity.NETWORK_ERROR_DIALOG");
        this.s = gczm0;
        if(gczm0 != null) {
            gczm0.ag = this;
        }
        this.x();
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("account", this.q);
        bundle0.putParcelableArrayList("accountsThatHaveRequestedAuthTokens", new ArrayList(this.B));
        this.y();
        bundle0.putInt("serviceConnectionSavePoint", this.y);
        bundle0.putBoolean("remoteOperationInProgress", this.x);
        bundle0.putBoolean("immediateSaveFinished", this.k);
    }

    public static void p(RootChimeraActivity rootChimeraActivity0) {
        rootChimeraActivity0.x = false;
    }

    @Override  // fayi
    public final BuyFlowConfig q() {
        return this.A;
    }

    public final void r(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkkk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkkk)hftv0).c = v - 1;
        ((gkkk)hftv0).b |= 1;
        String s = this.u;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        int v1 = 2;
        ((gkkk)hftv1).b |= 2;
        ((gkkk)hftv1).d = s;
        String s1 = this.t;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkkk gkkk0 = (gkkk)hftp0.b_message;
        s1.getClass();
        gkkk0.b |= 4;
        gkkk0.e = s1;
        int v2 = this.getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0) == 1 ? 3 : 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gkkk)hftv2).f = v2 - 1;
        ((gkkk)hftv2).b |= 8;
        if(v == 2) {
            if(this.l) {
                v1 = 3;
            }
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkkk)hftp0.b_message).g = v1 - 1;
            ((gkkk)hftp0.b_message).b |= 16;
        }
        CreateWalletObjectsEvent.b(this, this.A, ((gkkk)hftp0.N_build()));
    }

    private final fbfn s() {
        return (fbfn)this.getSupportFragmentManager().h(RootChimeraActivity.j);
    }

    private final void t() {
        if(fbyc.a(this)) {
            if(!this.B.contains(this.q)) {
                this.B.add(this.q);
                fbfm fbfm0 = fbfm.y(this.q, new String[]{fbya.e(this.A.b)});
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.v(fbfm0, "RetrieveAuthTokensFragment");
                ca0.a();
            }
            if(this.l) {
                this.o.setVisibility(8);
                this.n.setVisibility(0);
                this.v();
            }
            return;
        }
        this.o();
    }

    private final void u() {
        if(this.s() != null) {
            Log.e("RootChimeraActivity", "Creating a new TransactionRetainerFragment when one already exists.");
        }
        fbfn fbfn0 = fbfn.y(2, this.A, this.q);
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.v(fbfn0, RootChimeraActivity.j);
        ca0.a();
        this.getSupportFragmentManager().aq();
    }

    private final void v() {
        this.x = true;
        this.z();
        fbnp fbnp0 = this.s().b;
        guyp guyp0 = this.w;
        batl.m(fbnp0.G(), "Must specify connection to OwIntService!");
        if(!fbnp0.g(((MessageLite)guyp0))) {
            CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0 = new CreateWalletObjectsServiceRequest(fbnp0.b, guyp0);
            Message.obtain(fbnp0.u, 18, createWalletObjectsServiceRequest0).sendToTarget();
        }
    }

    private final void w() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkkk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkkk)hftp0.b_message).c = 3;
        ((gkkk)hftp0.b_message).b |= 1;
        String s = this.getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkkk gkkk0 = (gkkk)hftp0.b_message;
        s.getClass();
        gkkk0.b |= 2;
        gkkk0.d = s;
        String s1 = this.getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gkkk)hftv0).b |= 4;
        ((gkkk)hftv0).e = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkkk)hftv1).f = 1;
        ((gkkk)hftv1).b |= 8;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkkk)hftp0.b_message).g = 0;
        ((gkkk)hftp0.b_message).b |= 16;
        gkkk gkkk1 = (gkkk)hftp0.N_build();
        CreateWalletObjectsEvent.b(this, this.A, gkkk1);
        this.n(0, null);
    }

    private final void x() {
        if(this.s() != null && !this.z) {
            this.z = true;
            this.s().b.d(this.C, this.y);
            this.y = -1;
        }
    }

    private final void y() {
        if(this.y < 0 && this.s() != null) {
            this.z = false;
            this.y = this.s().b.a(this.C);
        }
    }

    private final void z() {
        this.m.a(((boolean)(this.x ^ 1)));
        this.p.b(((boolean)(this.x ^ 1)));
    }
}


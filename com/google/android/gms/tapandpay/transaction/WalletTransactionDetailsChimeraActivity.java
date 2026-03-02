package com.google.android.gms.tapandpay.transaction;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import batl;
import bauc;
import bbcu;
import bboh;
import bbpr;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import dlgw;
import dmrd;
import dydw;
import esge;
import esgi;
import etnr;
import etsq;
import eveu;
import evfc;
import evfd;
import evff;
import evfh;
import eviz;
import gfqx;
import gfsx;
import gfta;
import ggtj;
import guub;
import guuc;
import guud;
import guue;
import guui;
import guuk;
import hftc;
import hfur;
import hypg;
import im;

@GmsCoreVeId(0x3FE18)
public class WalletTransactionDetailsChimeraActivity extends etsq implements eveu, evff {
    public static final bboh j;
    public String k;
    public String l;
    public CardInfo m;
    public String n;
    public String o;
    final gfsx p;
    private boolean q;
    private evfd r;

    static {
        WalletTransactionDetailsChimeraActivity.j = bboh.b("TapAndPay", bbcu.aM);
    }

    public WalletTransactionDetailsChimeraActivity() {
        this.q = false;
        this.p = gfqx.a;
    }

    @Override  // eveu
    public final String a() {
        evfh evfh0 = this.r.c;
        batl.s(evfh0);
        return evfh0.c();
    }

    @Override  // eveu
    public final void b(boolean z, boolean z1) {
        guue guue0;
        evfd evfd0 = this.r;
        evfh evfh0 = evfd0.c;
        batl.s(evfh0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guuk.a).v_newBuilder();
        String s = evfh0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guuk guuk0 = (guuk)hftp0.b_message;
        s.getClass();
        guuk0.c = s;
        ProtoLiteBuilder hftp1 = evfh0.a;
        guui guui0 = (guui)hftp1.b_message;
        if((guui0.b & 4) != 0 && ((guui0.g == null ? guud.a : guui0.g).b & 4) != 0) {
            guud guud0 = ((guui)hftp1.b_message).g;
            if(guud0 == null) {
                guud0 = guud.a;
            }
            guue0 = guud0.g;
            if(guue0 == null) {
                guue0 = guue.a;
            }
        }
        else {
            guue0 = guue.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        guue0.getClass();
        ((guuk)hftv0).d = guue0;
        ((guuk)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((guuk)hftv1).e = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((guuk)hftv2).f = z1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((guuk)hftp0.b_message).g = 0;
        evfd0.a(((guuk)hftp0.N_build()));
        evfh0.n(3);
        evfh0.m(5);
        evfd0.b();
    }

    @Override  // evff
    public final String c() {
        return gfta.b(this.r.b.n);
    }

    @Override  // evff
    public final void d() {
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity0 = this.r.b;
        if(!TextUtils.isEmpty(walletTransactionDetailsChimeraActivity0.o)) {
            Intent intent0 = new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", walletTransactionDetailsChimeraActivity0.o)));
            if(bbpr.b(walletTransactionDetailsChimeraActivity0.getApplicationContext(), walletTransactionDetailsChimeraActivity0.o)) {
                walletTransactionDetailsChimeraActivity0.startActivity(intent0);
            }
        }
    }

    final void m() {
        Toast.makeText(this, 0x7F153396, 0).show();  // string:tp_transaction_unavailable "Transaction details unavailable. Please check 
                                                     // back later."
        this.finish();
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        im im0 = this.hL();
        if(im0 != null) {
            im0.h();
        }
        bboh bboh0 = WalletTransactionDetailsChimeraActivity.j;
        ((ggtj)bboh0.h()).x("Creating WalletTransactionDetailsActivity.");
        this.r = new evfd(this);
        Intent intent0 = this.getIntent();
        if(intent0.hasExtra("transaction")) {
            evfd evfd0 = this.r;
            byte[] arr_b = evfd0.b.getIntent().getByteArrayExtra("transaction");
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)guui.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    evfd0.c = new evfh(((guui)hftv0));
                }
                catch(hfur unused_ex) {
                    this.m();
                    return;
                }
                String s = intent0.getStringExtra("account_name");
                this.l = s;
                if(TextUtils.isEmpty(s)) {
                    this.m();
                    return;
                }
                String s1 = intent0.getStringExtra("account_id");
                this.k = s1;
                if(TextUtils.isEmpty(s1)) {
                    this.m();
                    return;
                }
                if(bundle0 != null) {
                    this.q = bundle0.getBoolean("sent_read_state", false);
                }
                CardInfo cardInfo0 = (CardInfo)dydw.b(intent0, "payment_card", CardInfo.CREATOR);
                this.m = cardInfo0;
                if(cardInfo0 == null) {
                    this.m();
                    return;
                }
                byte[] arr_b1 = intent0.getByteArrayExtra("coalesced_notification");
                if(arr_b1 != null && !this.q) {
                    this.startService(etnr.c(new esgi(s1, s, esge.d(), this), arr_b1, 3, cardInfo0));
                    this.q = true;
                }
                IssuerInfo issuerInfo0 = cardInfo0.l;
                if(issuerInfo0 != null) {
                    this.n = issuerInfo0.a;
                    this.o = issuerInfo0.b;
                }
                if(this.r.c()) {
                    evfd evfd1 = this.r;
                    evfh evfh0 = evfd1.c;
                    batl.s(evfh0);
                    if(bundle0 != null) {
                        int v = bundle0.getInt("transaction feedback status", -2);
                        if(v != -2) {
                            evfh0.n(guuc.b(v));
                        }
                        int v1 = bundle0.getInt("feedback state", -2);
                        if(v1 != -2) {
                            evfh0.m(guub.b(v1));
                        }
                    }
                    WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity0 = evfd1.b;
                    String s2 = walletTransactionDetailsChimeraActivity0.getIntent().getStringExtra("device_transaction_id");
                    long v2 = walletTransactionDetailsChimeraActivity0.getIntent().getLongExtra("mse_device_id", 0L);
                    Transaction transaction0 = (Transaction)bauc.b(walletTransactionDetailsChimeraActivity0.getIntent(), "core_transaction", Transaction.CREATOR);
                    if(!TextUtils.isEmpty(s2) || transaction0 != null) {
                        boolean z = dlgw.a(walletTransactionDetailsChimeraActivity0);
                        Boolean boolean0 = Boolean.valueOf(z);
                        walletTransactionDetailsChimeraActivity0.p.f(boolean0);
                        boolean0.getClass();
                        if(z) {
                            dmrd dmrd0 = new dmrd();
                            String s3 = walletTransactionDetailsChimeraActivity0.l;
                            batl.s(s3);
                            dmrd0.d(new Account(s3, "com.google"));
                            dmrd0.b.a.a = s2;
                            dmrd0.h(transaction0);
                            dmrd0.b.a.d = 1;
                            Intent intent1 = dmrd0.c();
                            if(v2 != 0L) {
                                intent1.putExtra("mse_device_id", v2);
                            }
                            walletTransactionDetailsChimeraActivity0.startActivity(intent1);
                            ((ggtj)bboh0.h()).x("Handed off transaction to first party app, finishing.");
                            this.finish();
                            return;
                        }
                    }
                    Intent intent2 = new Intent((evfh0.i() ? "com.google.android.apps.nbu.paisa.user.cards.transaction.DISPLAY_DECLINED_TRANSACTION_RECEIPT" : "com.google.android.apps.nbu.paisa.user.cards.transaction.DISPLAY_TRANSACTION_RECEIPT")).setPackage("com.google.android.apps.nbu.paisa.user").putExtra("account_name", walletTransactionDetailsChimeraActivity0.getIntent().getStringExtra("account_name")).putExtra("payment_card", walletTransactionDetailsChimeraActivity0.m);
                    intent2.putExtra("transaction", ((guui)evfh0.a.N_build()).toBytesArray());
                    if(eviz.e(walletTransactionDetailsChimeraActivity0, intent2)) {
                        walletTransactionDetailsChimeraActivity0.startActivity(intent2);
                        ((ggtj)bboh0.h()).x("Handed off transaction to first party app, finishing.");
                        this.finish();
                        return;
                    }
                    walletTransactionDetailsChimeraActivity0.setContentView(0x7F0E0B8C);  // layout:tp_activity_transaction_details_glide
                    walletTransactionDetailsChimeraActivity0.findViewById(0x7F0B01D6).setOnClickListener(new evfc(evfd1));  // id:CloseButton
                }
                if(!hypg.c()) {
                    this.setTheme(0x7F160F5A);  // style:TpActivityTheme
                }
                this.setTitle("Transaction details");
                return;
            }
            this.m();
            return;
        }
        this.m();
    }

    @Override  // etsq
    protected final void onResume() {
        super.onResume();
        if(this.r.c()) {
            this.r.b();
        }
    }

    @Override  // xnb
    public final void onSaveInstanceState(Bundle bundle0) {
        evfh evfh0 = this.r.c;
        if(evfh0 != null) {
            bundle0.putInt("transaction feedback status", guuc.a(evfh0.l()));
            bundle0.putInt("feedback state", guub.a(evfh0.k()));
        }
        bundle0.putBoolean("sent_read_state", this.q);
        super.onSaveInstanceState(bundle0);
    }
}


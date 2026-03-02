package com.google.android.gms.wallet.ib;

import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Message;
import ca;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.service.ib.LoadWebPaymentDataServiceRequest;
import com.google.android.gms.wallet.service.ib.LoadWebPaymentDataServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import faxv;
import fbfn;
import fbkn;
import fbko;
import fbnw;
import gftb;
import j..util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xob;

public class IbLoadWebPaymentDataWithPayIntentChimeraActivity extends xob {
    int j;
    BuyFlowConfig k;
    WebPaymentData l;
    private static final String m;
    private fbfn n;
    private int o;
    private final fbnw p;

    static {
        IbLoadWebPaymentDataWithPayIntentChimeraActivity.m = "ibPaymentRequestCompat:TransactionRetainerFragment";
    }

    public IbLoadWebPaymentDataWithPayIntentChimeraActivity() {
        this.j = 0;
        this.p = new fbkn(this);
    }

    final fbfn a() {
        if(this.n == null) {
            this.n = (fbfn)this.getSupportFragmentManager().h(IbLoadWebPaymentDataWithPayIntentChimeraActivity.m);
        }
        return this.n;
    }

    public final void b(LoadWebPaymentDataServiceResponse loadWebPaymentDataServiceResponse0) {
        Status status0 = loadWebPaymentDataServiceResponse0.c;
        if(status0.d()) {
            try {
                status0.c(this.getContainerActivity(), 1001);
            }
            catch(IntentSender.SendIntentException unused_ex) {
                this.f(8);
            }
            return;
        }
        this.f(loadWebPaymentDataServiceResponse0.c.i);
    }

    private final void c() {
        int v = this.j;
        int v1 = 3;
        switch(v) {
            case 0: {
                try {
                    this.j = 1;
                    Bundle bundle2 = this.getIntent().getExtras();
                    BuyFlowConfig buyFlowConfig0 = this.k;
                    Bundle bundle3 = new Bundle();
                    JSONObject jSONObject0 = fbko.a(bundle2);
                    if(!jSONObject0.has("environment") || !jSONObject0.getString("environment").equals("TEST")) {
                        v1 = 1;
                    }
                    bundle3.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", v1);
                    bundle3.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", true);
                    bundle3.putString("androidPackageName", buyFlowConfig0.c);
                    Account account0 = buyFlowConfig0.b.b;
                    if(account0 != null) {
                        bundle3.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", account0);
                    }
                    bundle3.putInt("com.google.android.gms.wallet.EXTRA_THEME", buyFlowConfig0.b.e);
                    gftb.check(bundle2);
                    faxv faxv0 = WebPaymentDataRequest.a();
                    faxv0.c(true);
                    Object object0 = bundle2.get("paymentRequestOrigin");
                    gftb.check(object0);
                    String s = object0.toString();
                    Object object1 = bundle2.get("topLevelOrigin");
                    gftb.check(object1);
                    String s1 = object1.toString();
                    Object object2 = bundle2.get("total");
                    gftb.check(object2);
                    JSONObject jSONObject1 = new JSONObject(object2.toString());
                    gftb.r(jSONObject1.has("currency") && jSONObject1.has("value"), "cartJsonObject should have currency and value.");
                    faxv0.d(fbko.a(bundle2).toString());
                    if(s.startsWith("about:")) {
                        s = s1;
                    }
                    faxv0.b(s);
                    Cart cart0 = new Cart();
                    Objects.requireNonNull(cart0);
                    cart0.b = jSONObject1.getString("currency");
                    cart0.a = jSONObject1.getString("value");
                    faxv0.a(cart0);
                    LoadWebPaymentDataServiceRequest loadWebPaymentDataServiceRequest0 = new LoadWebPaymentDataServiceRequest(bundle3, faxv0.a);
                    Message.obtain(this.a().b.u, 66, loadWebPaymentDataServiceRequest0).sendToTarget();
                }
                catch(IllegalStateException | NullPointerException | JSONException unused_ex) {
                    this.setResult(0);
                    this.finish();
                }
                return;
            }
            case 1: {
                return;
            }
            default: {
                if(v != 2) {
                    throw new IllegalStateException("Unknown processing state: " + v);
                }
                this.j = 3;
                Intent intent0 = new Intent();
                Bundle bundle0 = this.getIntent().getExtras();
                gftb.check(bundle0);
                Bundle bundle1 = bundle0.getBundle("methodData");
                gftb.check(bundle1);
                intent0.putExtra("methodName", (bundle1.containsKey("https://google.com/pay") || !bundle1.containsKey("https://pay.google.com/authentication") ? "https://google.com/pay" : "https://pay.google.com/authentication"));
                if(this.l != null && !this.l.a.isEmpty()) {
                    intent0.putExtra("details", this.l.a);
                }
                else {
                    intent0.putExtra("details", "{}");
                }
                this.setResult(-1, intent0);
                this.finish();
            }
        }
    }

    private final void f(int v) {
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", v);
        this.g(1, intent0);
    }

    private final void g(int v, Intent intent0) {
        this.setResult(v, intent0);
        this.finish();
    }

    private final void h() {
        if(this.o == -1) {
            this.o = this.a().b.a(this.p);
        }
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        if(v != 1001) {
            super.onActivityResult(v, v1, intent0);
            return;
        }
        switch(v1) {
            case -1: {
                this.l = WebPaymentData.b(intent0);
                this.j = 2;
                this.c();
                return;
            }
            case 0: {
                this.g(0, null);
                return;
            }
            default: {
                this.f(8);
            }
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.k = (BuyFlowConfig)this.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        if(bundle0 == null) {
            this.j = 0;
            this.o = -1;
        }
        else {
            this.j = bundle0.getInt("processingState");
            this.o = bundle0.getInt("serviceConnectionSavePoint");
            this.l = (WebPaymentData)bundle0.getParcelable("webPaymentDataFromResponse");
        }
        if(this.a() == null) {
            this.n = fbfn.y(8, this.k, this.k.b.b);
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.v(this.n, IbLoadWebPaymentDataWithPayIntentChimeraActivity.m);
            ca0.a();
        }
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
        this.h();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        this.a().b.d(this.p, this.o);
        this.o = -1;
        this.c();
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.h();
        bundle0.putInt("processingState", this.j);
        bundle0.putInt("serviceConnectionSavePoint", this.o);
        WebPaymentData webPaymentData0 = this.l;
        if(webPaymentData0 != null) {
            bundle0.putParcelable("webPaymentDataFromResponse", webPaymentData0);
        }
    }
}


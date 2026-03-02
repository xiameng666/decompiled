package com.google.android.gms.wallet.ib;

import ByteString;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import babh;
import batl;
import bbqr;
import ca;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwAccountChangedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.buyflow.BuyFlowResult;
import com.google.android.gms.wallet.common.ui.PopoverView;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.intentoperation.ib.PrefetchFullWalletIntentOperation;
import com.google.android.gms.wallet.intentoperation.ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.service.ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import du;
import fawh;
import faws;
import fayb;
import fbco;
import fbcz;
import fbdq;
import fbeg;
import fbez;
import fbfk;
import fbfm;
import fbfn;
import fbgn;
import fbhm;
import fbkl;
import fbnp;
import fbnw;
import fbon;
import fbpb;
import fbru;
import fbst;
import fbxw;
import fbxy;
import fbya;
import fbyf;
import fbyi;
import fbyj;
import fbyl;
import fbzu;
import gann;
import gany;
import gaou;
import gavr;
import gavs;
import gcfz;
import gciq;
import gcur;
import gerw;
import gerx;
import gesi;
import gkkz;
import gkli;
import gklj;
import gkll;
import gklm;
import gklu;
import hbzf;
import hbzg;
import hbzi;
import hbzj;
import hcbo;
import hcdq;
import hznp;
import hzow;
import hzoz;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class IbChimeraActivity extends fayb implements fbez, fbfk {
    int A;
    public fbyl B;
    public long C;
    boolean D;
    PopoverView E;
    public gany F;
    public fbcz G;
    int H;
    private static final String I;
    private fbfn J;
    public BuyFlowConfig q;
    public IbBuyFlowInput r;
    WidgetConfig s;
    public IbMerchantParameters t;
    fbnw u;
    Bundle v;
    public ProcessBuyFlowResultResponse w;
    String x;
    boolean y;
    boolean z;

    static {
        IbChimeraActivity.I = "ibActivity:TransactionRetainerFragment";
    }

    public IbChimeraActivity() {
        this.u = new fbkl(this);
        this.D = false;
        this.H = 1;
    }

    @Override  // fayb
    public final void A(WalletExitResult walletExitResult0) {
        this.aw(walletExitResult0);
    }

    @Override  // fayb
    public final void C(WalletExitResult walletExitResult0) {
        this.aG(9);
    }

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        gesi gesi0 = IbChimeraActivity.aq(((BuyFlowResult)parcelable0));
        if((gesi0.b & 1) != 0) {
            this.aB((gesi0.c == null ? gerx.a : gesi0.c));
            return;
        }
        this.z = true;
        fbnp fbnp0 = this.ag().b;
        ProcessBuyFlowResultRequest processBuyFlowResultRequest0 = new ProcessBuyFlowResultRequest(this.r, this.t, ((BuyFlowResult)parcelable0).e, ((BuyFlowResult)parcelable0).d, ((BuyFlowResult)parcelable0).f);
        Message.obtain(fbnp0.u, 35, processBuyFlowResultRequest0).sendToTarget();
    }

    @Override  // fayb
    public final void F(WalletExitResult walletExitResult0) {
        if(this.z) {
            this.aw(walletExitResult0);
            return;
        }
        super.F(walletExitResult0);
    }

    private final void aA(WalletExitResult walletExitResult0) {
        this.aI(walletExitResult0, 1);
    }

    private final void aB(gerx gerx0) {
        if(!bbqr.d(gerx0.d)) {
            fbru.P(this.r.l(), gerx0.d);
        }
        this.aC(fbru.ai((gerw.a(gerx0.b) == 0 ? 1 : gerw.a(gerx0.b))), gerx0.c);
    }

    private final void aC(int v, int v1) {
        this.aF(5, v, v1, 9);
        Intent intent0 = new Intent();
        switch(this.r.N() - 1) {
            case 1: 
            case 3: {
                faws faws0 = MaskedWallet.a();
                faws0.a(this.r.m());
                faws0.b(this.t.b);
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", faws0.a);
                break;
            }
            case 4: {
                fawh fawh0 = FullWallet.a();
                fawh0.a(this.r.m());
                fawh0.b(this.t.b);
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fawh0.a);
            }
        }
        fbdq.b(this.q, intent0, v);
        this.setResult(1, intent0);
        this.finish();
    }

    private final void aD() {
        if(this.A == -1) {
            this.A = this.ag().b.a(this.u);
        }
    }

    private final void aE() {
        if(this.ag() == null) {
            this.J = fbfn.y(8, this.q, this.oc());
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.v(this.J, IbChimeraActivity.I);
            ca0.a();
            this.getSupportFragmentManager().aq();
        }
    }

    private final void aF(int v, int v1, int v2, int v3) {
        int v7;
        String s1;
        BuyFlowConfig buyFlowConfig1;
        int v6;
        int v5;
        IbChimeraActivity ibChimeraActivity0;
        if(v2 != 0) {
            BuyFlowConfig buyFlowConfig0 = this.q;
            String s = this.r.m();
            int v4 = 3;
            switch(this.r.N() - 1) {
                case 1: {
                label_34:
                    ibChimeraActivity0 = this;
                    v5 = v1;
                    buyFlowConfig1 = buyFlowConfig0;
                    s1 = s;
                    v7 = v4;
                    v6 = v2;
                    break;
                }
                case 3: {
                    ibChimeraActivity0 = this;
                    v5 = v1;
                    v6 = v2;
                    buyFlowConfig1 = buyFlowConfig0;
                    s1 = s;
                    v7 = 4;
                    break;
                }
                case 4: {
                    ibChimeraActivity0 = this;
                    v5 = v1;
                    v6 = v2;
                    buyFlowConfig1 = buyFlowConfig0;
                    s1 = s;
                    v7 = 5;
                    break;
                }
                case 5: {
                    ibChimeraActivity0 = this;
                    v5 = v1;
                    v6 = v2;
                    buyFlowConfig1 = buyFlowConfig0;
                    s1 = s;
                    v7 = 6;
                    break;
                }
                case 6: {
                    v4 = 7;
                    goto label_34;
                }
                default: {
                    ibChimeraActivity0 = this;
                    v5 = v1;
                    v6 = v2;
                    buyFlowConfig1 = buyFlowConfig0;
                    s1 = s;
                    v7 = 1;
                }
            }
            ReportErrorChimeraIntentOperation.a(buyFlowConfig1, s1, v7, v5, v6, ibChimeraActivity0);
        }
        gcfz.r(this.k, fbeg.a(v), v1);
        AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(v, v1, v3, this.oc().name, this.j));
        int v8 = this.r.N() - 1;
        if(v8 != 4) {
            switch(v8) {
                case 5: {
                    BuyFlowConfig buyFlowConfig2 = this.q;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gklj.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gklj)hftv0).c = v - 1;
                    ((gklj)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gklj)hftv1).b |= 2;
                    ((gklj)hftv1).d = v1;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gklj gklj0 = (gklj)hftp0.b_message;
                    gklj0.b |= 4;
                    gklj0.e = v2;
                    if(this.r.m() != null) {
                        String s3 = this.r.m();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gklj gklj1 = (gklj)hftp0.b_message;
                        s3.getClass();
                        gklj1.b |= 8;
                        gklj1.f = s3;
                    }
                    int v11 = this.H;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gklj gklj2 = (gklj)hftp0.b_message;
                    if(v11 == 0) {
                        throw null;
                    }
                    gklj2.g = v11 - 1;
                    gklj2.b |= 16;
                    hcbo hcbo0 = fbru.y(((hcdq)this.r.e.b_message).e);
                    if(hcbo0 != null) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gklj)hftp0.b_message).i = hcbo0;
                        ((gklj)hftp0.b_message).b |= 0x40;
                    }
                    String s4 = fbhm.a(this.r.n());
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gklj gklj3 = (gklj)hftp0.b_message;
                    gklj3.b |= 0x20;
                    gklj3.h = s4;
                    LoadWebPaymentDataCallEvent.b(this, buyFlowConfig2, ((gklj)hftp0.N_build()), this.q.b.b.name, this.t.d);
                    return;
                }
                case 6: {
                    BuyFlowConfig buyFlowConfig3 = this.q;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkli.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((gkli)hftv2).c = v - 1;
                    ((gkli)hftv2).b |= 1;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp1.b_message;
                    ((gkli)hftv3).b |= 2;
                    ((gkli)hftv3).d = v1;
                    if(!hftv3.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkli gkli0 = (gkli)hftp1.b_message;
                    gkli0.b |= 4;
                    gkli0.e = v2;
                    if(this.r.m() != null) {
                        String s5 = this.r.m();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gkli gkli1 = (gkli)hftp1.b_message;
                        s5.getClass();
                        gkli1.b |= 8;
                        gkli1.f = s5;
                    }
                    hcbo hcbo1 = fbru.x(this.r);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkli gkli2 = (gkli)hftp1.b_message;
                    hcbo1.getClass();
                    gkli2.g = hcbo1;
                    gkli2.b |= 16;
                    LoadPaymentDataCallEvent.b(this, buyFlowConfig3, ((gkli)hftp1.N_build()), this.t.d);
                    return;
                }
                default: {
                    if(v3 == 2) {
                        int v9 = this.H - 1;
                        if(this.H == 0) {
                            throw null;
                        }
                        OwMaskedWalletReceivedEvent.b(this, v9, this.r.m(), this.x, -1);
                        return;
                    }
                    int v10 = this.H - 1;
                    if(this.H == 0) {
                        throw null;
                    }
                    String s2 = this.r.m();
                    OwMwUnsuccessfulEvent.b(this, v1, v, v2, v10, this.x, s2);
                    return;
                }
            }
        }
        String s6 = this.q.b.b.name;
        BuyFlowConfig buyFlowConfig4 = this.q;
        int v12 = this.H - 1;
        if(this.H == 0) {
            throw null;
        }
        OwFullWalletRequestedEvent.b(this, buyFlowConfig4, v, v1, v2, 0, 0L, v12, s6, this.r.m());
    }

    private final void aG(int v) {
        this.D = true;
        if(v == 7) {
            this.at(7);
            return;
        }
        if(this.r() != null && ((fbcz)this.r()).aP()) {
            byte[] arr_b = ((fbcz)this.r()).aR();
            if(arr_b.length == 0) {
                this.at(8);
                return;
            }
            this.aB(((gerx)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)gerx.a).jf(7, null)))));
            return;
        }
        if(v == 9) {
            this.av(8, 1061);
            return;
        }
        this.aH(v);
    }

    private final void aH(int v) {
        this.aF(4, -1, 0, v);
        this.setResult(0);
        this.finish();
    }

    private final void aI(WalletExitResult walletExitResult0, int v) {
        this.aC(walletExitResult0.e, v - 1);
    }

    @Override  // fayb
    public final void ac(int v) {
        this.E.p(v);
    }

    public static Intent ae(BuyFlowConfig buyFlowConfig0, byte[] arr_b, byte[] arr_b1, IbBuyFlowInput ibBuyFlowInput0, IbMerchantParameters ibMerchantParameters0, String s) {
        batl.t(buyFlowConfig0, "buyFlowConfig is required");
        batl.t(ibBuyFlowInput0, "buyFlowInput is required");
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        if(arr_b != null && arr_b.length > 0) {
            bundle0.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", arr_b);
        }
        bundle0.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN", arr_b1);
        bundle0.putParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", IbChimeraActivity.af(ibBuyFlowInput0, ibMerchantParameters0, s, null));
        Intent intent0 = new Intent("com.google.android.gms.wallet.ib.INSTANT_BUY");
        intent0.setClassName(babh.a(), "com.google.android.gms.wallet.ib.IbActivity");
        if(hzow.a.b().a()) {
            intent0.putExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras", fbst.c(bundle0));
        }
        else {
            intent0.putExtras(bundle0);
        }
        intent0.addFlags(0x10000);
        intent0.setPackage("com.google.android.gms");
        return intent0;
    }

    public static Bundle af(IbBuyFlowInput ibBuyFlowInput0, IbMerchantParameters ibMerchantParameters0, String s, gkkz gkkz0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory", ibBuyFlowInput0);
        bundle0.putParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters", ibMerchantParameters0);
        bundle0.putString("apiCallAnalyticsSessionId", s);
        if(hzoz.j() && gkkz0 != null) {
            bundle0.putByteArray("com.google.android.gms.wallet.ib.IbActivity.loggingInfo", gkkz0.toBytesArray());
        }
        return bundle0;
    }

    final fbfn ag() {
        if(this.J == null) {
            this.J = (fbfn)this.getSupportFragmentManager().h(IbChimeraActivity.I);
        }
        return this.J;
    }

    @Override  // fbfk
    public final void ah() {
        this.av(409, 0x40E);
    }

    @Override  // fbfk
    public final void ai(int v) {
        this.av(409, 0x40F);
    }

    @Override  // fbfk
    public final void aj() {
        this.ay();
    }

    @Override  // fbez
    public final void ak(WalletExitResult walletExitResult0) {
        this.D = true;
        if(walletExitResult0.c() == 7) {
            this.aA(walletExitResult0);
            return;
        }
        if(this.r() != null && ((fbcz)this.r()).aP()) {
            byte[] arr_b = ((fbcz)this.r()).aR();
            if(arr_b.length == 0) {
                this.aA(walletExitResult0);
                return;
            }
            this.aB(((gerx)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)gerx.a).jf(7, null)))));
            return;
        }
        if(walletExitResult0.c() == 9) {
            this.aI(walletExitResult0, 1061);
            return;
        }
        this.aF(4, -1, 0, walletExitResult0.c());
        this.setResult(0);
        this.finish();
    }

    @Override  // fbez
    public final void al() {
    }

    @Override  // fbez
    public final void am() {
        if(this.r() != null) {
            ((fbcz)this.r()).aE();
        }
    }

    @Override  // fbez
    public final void an() {
        fbzu fbzu0 = WalletExitResult.b();
        fbzu0.c(0);
        fbzu0.d(401);
        fbzu0.b(3);
        this.F(fbzu0.a);
    }

    public final WidgetConfig ao() {
        if(this.s == null) {
            this.s = fbco.a(this.q, this.getApplicationContext(), 2, null, Long.valueOf(UUID.randomUUID().getLeastSignificantBits()));
        }
        return this.s;
    }

    @Override  // fbez
    public final void ap(int v) {
        this.aG(v);
    }

    public static gesi aq(BuyFlowResult buyFlowResult0) {
        return buyFlowResult0.d == null ? gesi.a : ((gesi)gciq.c(buyFlowResult0.d, ((Parser)((ProtoLiteMessage)gesi.a).jf(7, null))));
    }

    public final void ar(gklm gklm0) {
        SimpleAnalyticsEvent.b(this.getApplicationContext(), this.q, gklm0, this.q.b.b);
    }

    public final void as(hbzj hbzj0) {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbyf.a).v_newBuilder();
            fbyi fbyi0 = fbyi.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fbyf fbyf0 = (fbyf)hftp0.b_message;
            fbyf0.b = fbyi0.a();
            JSONObject jSONObject0 = new JSONObject();
            Iterator iterator0 = hbzj0.c.iterator();
        alab1:
            while(true) {
            label_8:
                if(!iterator0.hasNext()) {
                    jSONObject0.put("callbackTrigger", (hbzi.b(hbzj0.d) == null ? hbzi.a : hbzi.b(hbzj0.d)).name());
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fbyj.a).v_newBuilder();
                    String s = jSONObject0.toString();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fbyj fbyj0 = (fbyj)hftp1.b_message;
                    s.getClass();
                    fbyj0.b = s;
                    Bundle bundle0 = this.r.a;
                    if(bundle0 != null) {
                        Parcel parcel0 = Parcel.obtain();
                        parcel0.writeBundle(bundle0);
                        byte[] arr_b = parcel0.marshall();
                        parcel0.recycle();
                        ByteString hfsf0 = ByteString.copyFrom(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((fbyj)hftp1.b_message).c = hfsf0;
                    }
                    ByteString hfsf1 = ((fbyj)hftp1.N_build()).getDefaultInstanceForType();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((fbyf)hftp0.b_message).c = hfsf1;
                    this.C = SystemClock.elapsedRealtime();
                    this.F.b(gaou.b(((fbyf)hftp0.N_build()), this.q.c, this.ao()));
                    return;
                }
                Object object0 = iterator0.next();
                JSONObject jSONObject1 = new JSONObject(((hbzg)object0).d);
                int v = hbzf.a(((hbzg)object0).c);
                if(v == 0) {
                    v = 1;
                }
                switch(v - 1) {
                    case 1: {
                        jSONObject0.put("shippingAddress", jSONObject1);
                        break alab1;
                    }
                    case 2: {
                        jSONObject0.put("shippingOptionData", jSONObject1);
                        break alab1;
                    }
                    case 3: {
                        jSONObject0.put("paymentMethodData", jSONObject1);
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "Callback failed while creating JSONObject for IntermediatePaymentData object for callback request: %s", jSONException0.getMessage()));
        }
        goto label_8;
    }

    public final void at(int v) {
        this.av(v, 1);
    }

    public final void au() {
        ProcessBuyFlowResultResponse processBuyFlowResultResponse0 = this.w;
        if(processBuyFlowResultResponse0.b == 1) {
            int v = fbdq.a(this.q, processBuyFlowResultResponse0.c);
            int v1 = this.w.e - 1;
            if(this.w.e == 0) {
                throw null;
            }
            this.aF(5, v, v1, 9);
        }
        else {
            this.aF(2, -1, 0, 2);
        }
        ProcessBuyFlowResultResponse processBuyFlowResultResponse1 = this.w;
        if(processBuyFlowResultResponse1.b == -1) {
            Intent intent0 = processBuyFlowResultResponse1.c;
            if(intent0 != null) {
                MaskedWallet maskedWallet0 = (MaskedWallet)intent0.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                if(maskedWallet0 != null) {
                    this.startService(PrefetchFullWalletIntentOperation.a(this, this.q, maskedWallet0.a, maskedWallet0.b));
                }
            }
        }
        this.setResult(this.w.b, this.w.c);
        this.finish();
    }

    public final void av(int v, int v1) {
        if(v1 == 0) {
            throw null;
        }
        this.aC(v, v1 - 1);
    }

    private final void aw(WalletExitResult walletExitResult0) {
        this.E.d(walletExitResult0);
    }

    private final void ax() {
        this.ag().b.d(this.u, this.A);
        this.A = -1;
    }

    private final void ay() {
        du du0 = this.getSupportFragmentManager().h("RetrieveAuthTokensFragment");
        if(du0 != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.o(du0);
            ca0.a();
        }
    }

    private final void az() {
        if(!this.y) {
            this.y = true;
            fbfm fbfm0 = fbfm.y(this.oc(), new String[]{fbya.e(this.q.b)});
            fbfm0.B(this);
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.v(fbfm0, "RetrieveAuthTokensFragment");
            ca0.a();
        }
    }

    @Override  // fayb
    public final void finish() {
        super.finish();
        if(hznp.a.b().a() && this.D) {
            this.overridePendingTransition(0, 0x10A0001);
        }
    }

    @Override  // fayb
    public final Account oc() {
        return this.q.b.b;
    }

    @Override  // fayb
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        if(v != 501) {
            super.onActivityResult(v, v1, intent0);
            return;
        }
        switch(v1) {
            case -1: {
                this.H = 4;
                this.au();
                return;
            }
            case 0: {
                this.H = 3;
                this.aH(3);
                return;
            }
            default: {
                this.H = 5;
                this.av(8, 0x3FF);
            }
        }
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        if(bundle0 == null) {
            Intent intent0 = this.getIntent();
            this.v = intent0.hasExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras") ? ((Bundle)fbst.b(Bundle.CREATOR, this.getIntent().getStringExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras"))) : intent0.getExtras();
        }
        else {
            this.v = (Bundle)bundle0.getParcelable("extras");
        }
        this.v.setClassLoader(IbChimeraActivity.class.getClassLoader());
        Bundle bundle1 = (Bundle)this.v.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS");
        batl.t(bundle1, "activityParams is required");
        if(bundle0 == null) {
            this.q = (BuyFlowConfig)gcur.b(this.v, "com.google.android.gms.wallet.buyFlowConfig");
            this.r = (IbBuyFlowInput)gcur.b(bundle1, "com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory");
            this.H = 2;
        }
        else {
            this.q = (BuyFlowConfig)gcur.b(bundle0, "buyFlowConfig");
            this.r = (IbBuyFlowInput)gcur.b(bundle0, "buyFlowInput");
            this.H = gkll.a(bundle0.getInt("lockscreenStatus"));
            this.s = (WidgetConfig)bundle0.getParcelable("widgetConfig");
        }
        this.t = (IbMerchantParameters)bundle1.getParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters");
        this.x = bundle1.getString("apiCallAnalyticsSessionId");
        this.v(bundle0, true, 4, gklu.b);
        fbgn.D(this, this.q, fbgn.d, true);
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0C85);  // layout:wallet_activity_checkout
        this.hL().o(true);
        PopoverView popoverView0 = (PopoverView)this.findViewById(0x7F0B1CDC);  // id:popover
        this.E = popoverView0;
        if(popoverView0 != null) {
            PopoverView.c(this);
            this.E.f = this;
            this.E.j(this.q.b.h, this.q.b.i);
        }
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view0);
        fbgn.B(view0);
        if(bundle0 == null) {
            this.w = null;
            this.A = -1;
            this.y = false;
            this.z = false;
            byte[] arr_b = this.v.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN");
            this.G = this.v.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") ? fbcz.aS(this.v.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), this.r.H(), this.r.I(), null, this.q, this.j, arr_b, this.k) : fbcz.aT(this.r.H(), this.r.I(), null, this.q, this.j, arr_b, this.k);
            this.az();
            this.G(this.G, 0x7F0B1CDD);  // id:popover_content_holder
        }
        else {
            this.w = (ProcessBuyFlowResultResponse)bundle0.getParcelable("processBuyFlowResultResponse");
            this.A = bundle0.getInt("serviceConnectionSavePoint");
            this.y = bundle0.getBoolean("hasAuthTokens");
            this.z = bundle0.getBoolean("processingBuyflowResult");
            this.D = bundle0.getBoolean("shouldOverrideExitAnimation");
            this.G = (fbcz)this.r();
        }
        this.aE();
        this.G.av = this;
        this.G.aw = this;
        gann gann0 = gann.B(this);
        if(gann0 == null) {
            fbon fbon0 = new fbon();
            gann.c.put(this, fbon0);
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.v(fbon0, "ActionExecutorFragment");
            ca0.a();
        }
        else {
            Class class0 = gann0.getClass();
            if(!fbon.class.equals(class0)) {
                throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
            }
        }
        gann gann1 = gann.B(this);
        gavr.b(gann1, "BE_AEFT_01", null, gavs.a, "Activity has no ActionExecutorFragment!");
        this.F = new gany(gann1, this, bundle0);
    }

    @Override  // fayb
    protected final void onDestroy() {
        super.onDestroy();
        this.F.aY();
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
        this.aD();
        this.F.aZ();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        fbfm fbfm0 = (fbfm)this.getSupportFragmentManager().h("RetrieveAuthTokensFragment");
        if(fbfm0 != null) {
            fbfm0.B(this);
        }
        this.ax();
        this.F.bb();
    }

    @Override  // fayb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.aD();
        this.F.lx(bundle0);
        bundle0.putParcelable("extras", this.v);
        bundle0.putParcelable("processBuyFlowResultResponse", this.w);
        bundle0.putBoolean("processingBuyflowResult", this.z);
        bundle0.putInt("serviceConnectionSavePoint", this.A);
        bundle0.putParcelable("buyFlowConfig", this.q);
        bundle0.putParcelable("buyFlowInput", this.r);
        int v = this.H - 1;
        if(this.H == 0) {
            throw null;
        }
        bundle0.putInt("lockscreenStatus", v);
        bundle0.putBoolean("shouldOverrideExitAnimation", this.D);
    }

    @Override  // fayb
    public final BuyFlowConfig q() {
        return this.q;
    }

    @Override  // fayb
    public final void y(Account account0) {
        this.aD();
        if(this.ag() != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.o(this.J);
            ca0.a();
            this.getSupportFragmentManager().aq();
            this.J = null;
        }
        this.ay();
        this.A = -1;
        this.u = new fbkl(this);
        fbxw fbxw0 = ApplicationParameters.b(this.q.b);
        fbxw0.d(account0);
        fbxy fbxy0 = BuyFlowConfig.b(this.q);
        fbxy0.b(fbxw0.a);
        this.q = fbxy0.a();
        fbpb.a(this, new OwMwAccountChangedEvent(this.x, account0.name));
        this.y = false;
        this.az();
        this.aE();
        this.ax();
        Message.obtain(this.ag().b.u, 38, this.r).sendToTarget();
    }
}


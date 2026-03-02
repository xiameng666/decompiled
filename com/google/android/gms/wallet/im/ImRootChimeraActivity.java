package com.google.android.gms.wallet.im;

import MessageLite;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import batl;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.wallet.clientlog.LogContext;
import dkhl;
import fayb;
import fayc;
import fbae;
import fbed;
import fbfq;
import fbfr;
import fbgn;
import fbla;
import fblo;
import fbzp;
import fbzu;
import fcan;
import fcbg;
import fcbh;
import fcbm;
import gcfz;
import gcio;
import gciq;
import gcuj;
import gdak;
import gdcb;
import gete;
import gexj;
import geyg;
import gezu;
import gezv;
import gfak;
import gfal;
import gfam;
import gfaw;
import gfdx;
import gfkz;
import gflb;
import gflj;
import gged_interceptors;
import ggna;
import gklu;
import hfuh;
import hfvv;
import hzns;
import hznv;
import hzph;
import hzpk;
import hzqo;

public class ImRootChimeraActivity extends fayb {
    private boolean A;
    protected gflj q;
    protected byte[] r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    private View w;
    private TextView x;
    private Intent y;
    private boolean z;

    public ImRootChimeraActivity() {
        this.u = true;
        this.v = true;
        this.z = false;
        this.A = false;
    }

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        int v1;
        String s1;
        Intent intent0 = ImRootChimeraActivity.Y(z);
        if(((InstrumentManagerResult)parcelable0) != null) {
            String s = ((InstrumentManagerResult)parcelable0).b;
            if(!TextUtils.isEmpty(s)) {
                intent0.putExtra("com.google.android.gms.wallet.instrumentId", s);
            }
            long v = ((InstrumentManagerResult)parcelable0).c;
            if(v > 0L) {
                intent0.putExtra("com.google.android.gms.wallet.f1InstrumentId", v);
            }
            byte[] arr_b = ((InstrumentManagerResult)parcelable0).d;
            if(arr_b != null && arr_b.length > 0) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", arr_b);
            }
            byte[] arr_b1 = ((InstrumentManagerResult)parcelable0).e;
            if(arr_b1 != null && arr_b1.length > 0) {
                intent0.putExtra("com.google.android.gms.wallet.instrumentToken", arr_b1);
            }
        }
        gdak gdak0 = ((fbla)this.r()).ak;
        if((gdak0 instanceof fcbh)) {
            s1 = ((fcbh)gdak0).R();
        }
        else if((gdak0 instanceof fcbm)) {
            fcbg fcbg0 = ((fcbm)gdak0).a;
            s1 = fcbg0 != null && fcbg0.Q() ? fcbg0.c.getText().toString() : null;
        }
        else if((gdak0 instanceof fcan)) {
            gdak gdak1 = ((fcan)gdak0).ah;
            s1 = (gdak1 instanceof fcbh) ? ((fcbh)gdak1).R() : null;
        }
        else {
            s1 = null;
        }
        if(s1 != null) {
            intent0.putExtra("com.google.android.gms.wallet.cvc", s1);
        }
        gdak gdak2 = ((fbla)this.r()).ak;
        if((gdak2 instanceof fcbh)) {
            v1 = ((fcbh)gdak2).Q();
        }
        else if((gdak2 instanceof fcan)) {
            gdak gdak3 = ((fcan)gdak2).ah;
            v1 = (gdak3 instanceof fcbh) ? ((fcbh)gdak3).Q() : 0;
        }
        else {
            v1 = 0;
        }
        if(v1 != 0) {
            intent0.putExtra("com.google.android.gms.wallet.cardColor", v1);
        }
        String s2 = ((fbla)this.r()).bw;
        if(!TextUtils.isEmpty(s2)) {
            intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SPINNER_CAPTION_TEXT", s2);
        }
        this.M(-1, intent0);
    }

    @Override  // fayb
    public final void P(boolean z) {
        super.P(z);
        if(this.A) {
            Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B174F);  // id:instrument_manager_toolbar
            BuyFlowConfig buyFlowConfig0 = this.q();
            if(z) {
                toolbar0.setPadding(0, 0, 0, 0);
                fbfr.e(toolbar0, this, buyFlowConfig0);
                return;
            }
            toolbar0.setPadding(this.getResources().getDimensionPixelSize(0x7F0715D9), 0, this.getResources().getDimensionPixelSize(0x7F0715DA), 0);  // dimen:wallet_uic_visdre_error_dialog_title_left_padding
        }
    }

    @Override  // fayb
    public void Q(boolean z) {
        if(this.A) {
            int v = z ? 8 : 0;
            this.w.setVisibility(v);
            this.findViewById(0x7F0B20E1).setVisibility(v);  // id:sticky_button_container
        }
        super.Q(z);
    }

    @Override  // fayb
    protected final boolean S() {
        this.ao();
        return this.q != null && this.q.f.size() > 0;
    }

    protected int ae() {
        return this.s ? (this.A ? 0x7F0E0C8E : 0x7F0E0C8D) : (this.A ? 0x7F0E0C8F : 0x7F0E0C8C);  // layout:wallet_activity_instrument_manager_dialog_visdre
    }

    public static Intent af(Context context0, Intent intent0) {
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.im.ImRootActivity");
        intent1.putExtras(intent0.getExtras());
        return intent1;
    }

    public static Intent ag(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0, String s) {
        Intent intent1 = ImRootChimeraActivity.af(context0, intent0);
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.setAction(s);
        return intent1;
    }

    protected fbla ah() {
        boolean z = true;
        if(this.q != null) {
            BuyFlowConfig buyFlowConfig0 = this.q();
            String s = this.j;
            gflj gflj0 = this.q;
            boolean z1 = this.s;
            boolean z2 = this.t;
            LogContext logContext0 = this.k;
            boolean z3 = this.u;
            boolean z4 = this.v;
            batl.m(gflj0 != null, "ActionToken must not be null.");
            if(((gflj0.d == null ? gfkz.a : gflj0.d).b & 2) == 0) {
                z = false;
            }
            batl.m(z, "ActionToken must have a ResponseContext.");
            fbla fbla0 = new fbla();
            Bundle bundle0 = fbzp.cr(buyFlowConfig0, s, logContext0);
            gciq.j(bundle0, "actionToken", ((MessageLite)gflj0));
            bundle0.putBoolean("isDialog", z1);
            bundle0.putBoolean("showCancelButton", z2);
            bundle0.putBoolean("showTitleInHeader", z3);
            bundle0.putBoolean("showHeaderSeparator", z4);
            fbla0.setArguments(bundle0);
            return fbla0;
        }
        BuyFlowConfig buyFlowConfig1 = this.q();
        String s1 = this.j;
        byte[] arr_b = this.r;
        boolean z5 = this.s;
        boolean z6 = this.t;
        LogContext logContext1 = this.k;
        if(arr_b == null) {
            z = false;
        }
        batl.m(z, "InstrumentManager parameters must not be null.");
        fbla fbla1 = new fbla();
        Bundle bundle1 = fbzp.cr(buyFlowConfig1, s1, logContext1);
        bundle1.putByteArray("instrumentManagerParams", arr_b);
        bundle1.putBoolean("isDialog", z5);
        bundle1.putBoolean("showCancelButton", z6);
        fbla1.setArguments(bundle1);
        return fbla1;
    }

    protected void ai() {
        this.m = (ProgressSpinnerView)this.findViewById(0x7F0B1D4C);  // id:progress_spinner_container
    }

    protected void aj() {
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B174F);  // id:instrument_manager_toolbar
        this.hG(toolbar0);
        if(this.s && !this.A) {
            if(this.z) {
                toolbar0.o();
                toolbar0.n.a(0, 0);
                this.x = gdcb.r(this);
            }
            else {
                this.x = (TextView)this.getLayoutInflater().inflate(0x7F0E0E23, null, false);  // layout:wallet_view_dialog_custom_title
            }
            this.hL().l(this.x);
            this.hL().p(16);
            this.x.setText(this.getTitle());
            return;
        }
        this.P(true);
    }

    protected boolean ak(gflb gflb0) {
        geyg geyg0 = ImRootChimeraActivity.am(gflb0);
        if(geyg0 == null) {
            return false;
        }
        boolean z = (geyg0.b & 1) != 0 && new hfuh((geyg0.c == null ? gfak.d : geyg0.c).r, gfak.a).contains(gfdx.e);
        return (geyg0.b & 0x20) == 0 || !new hfuh((geyg0.h == null ? gezu.c : geyg0.h).k, gezu.a).contains(gfdx.e) ? z : true;
    }

    public static boolean al(BuyFlowConfig buyFlowConfig0) {
        return buyFlowConfig0 != null && fbgn.O(buyFlowConfig0.b.f) && hznv.a.b().a();
    }

    private static geyg am(gflb gflb0) {
        int v = gflb0.c;
        if(v == 2) {
            return (geyg)gflb0.d;
        }
        if(((v == 1 ? ((gexj)gflb0.d) : gexj.a).b & 8) != 0) {
            geyg geyg0 = (gflb0.c == 1 ? ((gexj)gflb0.d) : gexj.a).f;
            return geyg0 == null ? geyg.a : geyg0;
        }
        return null;
    }

    private final void an() {
        fbla fbla0;
        this.setContentView(this.ae());
        this.aj();
        this.ai();
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        this.w = view0;
        fbgn.B(view0);
        boolean z = false;
        if(this.A) {
            boolean z1 = this.s;
            if(hzqo.a.b().d()) {
                this.getWindow().setFlags(0x400, 0x400);
                fbfq fbfq0 = new fbfq(this, z1);
                this.findViewById(0x7F0B16DF).getViewTreeObserver().addOnGlobalLayoutListener(fbfq0);  // id:im_activity_root
            }
            if(!this.s) {
                BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.v(this.findViewById(0x7F0B247C));  // id:wallet_root
                bottomSheetBehavior0.K(3);
                bottomSheetBehavior0.H(false);
                DisplayMetrics displayMetrics0 = new DisplayMetrics();
                this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics0);
                bottomSheetBehavior0.I(displayMetrics0.heightPixels);
            }
        }
        fbgn.A(this.w);
        if(((fbla)this.r()) == null) {
            if(!this.A) {
                fbla0 = this.ah();
            }
            else if(this.q != null) {
                BuyFlowConfig buyFlowConfig0 = this.q();
                String s = this.j;
                gflj gflj0 = this.q;
                boolean z2 = this.s;
                LogContext logContext0 = this.k;
                boolean z3 = this.u;
                boolean z4 = this.v;
                batl.m(gflj0 != null, "ActionToken must not be null.");
                if(((gflj0.d == null ? gfkz.a : gflj0.d).b & 2) != 0) {
                    z = true;
                }
                batl.m(z, "ActionToken must have a ResponseContext.");
                fbla0 = new fblo();
                Bundle bundle0 = fbzp.cr(buyFlowConfig0, s, logContext0);
                gciq.j(bundle0, "actionToken", ((MessageLite)gflj0));
                bundle0.putBoolean("isVisDreDialog", z2);
                bundle0.putBoolean("showTitleInHeader", z3);
                bundle0.putBoolean("showHeaderSeparator", z4);
                fbla0.setArguments(bundle0);
            }
            else {
                BuyFlowConfig buyFlowConfig1 = this.q();
                String s1 = this.j;
                byte[] arr_b = this.r;
                boolean z5 = this.s;
                LogContext logContext1 = this.k;
                if(arr_b != null) {
                    z = true;
                }
                batl.m(z, "InstrumentManager parameters must not be null.");
                fbla0 = new fblo();
                Bundle bundle1 = fbzp.cr(buyFlowConfig1, s1, logContext1);
                bundle1.putByteArray("instrumentManagerParams", arr_b);
                bundle1.putBoolean("isVisDreDialog", z5);
                fbla0.setArguments(bundle1);
            }
            this.G(fbla0, 0x7F0B174E);  // id:instrument_manager_container
        }
    }

    private final void ao() {
        if(this.q == null) {
            this.q = (gflj)gciq.b(this.getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", ((Parser)((ProtoLiteMessage)gflj.a).jf(7, null)));
        }
    }

    @Override  // fayb
    public final void finish() {
        super.finish();
        if(!this.V()) {
            this.overridePendingTransition(0, fbgn.c(this.q()));
        }
    }

    @Override  // fayb
    protected Intent n() {
        return fbae.i(this, 0, this.q.f.toByteArray(), this.q(), this.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override  // fayb
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        ProtoLiteBuilder hftp5;
        gfal gfal0;
        geyg geyg0;
        boolean z = false;
        super.onActivityResult(v, v1, intent0);
        if(v == 5001) {
            if(v1 == 0) {
                if(hzpk.a.b().a()) {
                    if(this.q != null && (this.q.b & 2) != 0) {
                        batl.s(this.k);
                        gfkz gfkz0 = this.q.d == null ? gfkz.a : this.q.d;
                        gcfz.f(this.k, (gfkz0.d == null ? gete.c : gfkz0.d), null);
                    }
                    fbzu fbzu0 = WalletExitResult.b();
                    fbzu0.c(0);
                    fbzu0.d(401);
                    fbzu0.b(2);
                    this.F(fbzu0.a);
                    return;
                }
                v1 = 0;
            }
            CreditCardOcrResult creditCardOcrResult0 = CreditCardOcrResult.b(intent0);
            gfaw gfaw0 = gcio.f(creditCardOcrResult0, v1);
            gflj gflj0 = this.q;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gflj0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gflj0));
            gfkz gfkz1 = this.q.d == null ? gfkz.a : this.q.d;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gfkz1).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gfkz1));
            gfkz gfkz2 = this.q.d == null ? gfkz.a : this.q.d;
            gflb gflb0 = gfkz2.f == null ? gflb.a : gfkz2.f;
            int v2 = gflb0.c;
            if(v2 == 2) {
                geyg0 = (geyg)gflb0.d;
                goto label_34;
            }
            else if(((v2 == 1 ? ((gexj)gflb0.d) : gexj.a).b & 8) != 0) {
                geyg0 = (gflb0.c == 1 ? ((gexj)gflb0.d) : gexj.a).f;
                if(geyg0 == null) {
                    geyg0 = geyg.a;
                }
            label_34:
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)geyg0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)geyg0));
                int v3 = geyg0.b;
                if((v3 & 1) != 0) {
                    if(((geyg0.c == null ? gfak.d : geyg0.c).e & 16) == 0) {
                        gfal0 = (gfal)((ProtoLiteMessage)gfam.a).v_newBuilder();
                    }
                    else {
                        gfak gfak0 = geyg0.c == null ? gfak.d : geyg0.c;
                        gfam gfam0 = gfak0.l == null ? gfam.a : gfak0.l;
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gfam0).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)gfam0));
                        gfal0 = (gfal)hftp3;
                    }
                    gfak gfak1 = geyg0.c == null ? gfak.d : geyg0.c;
                    if((gfak1.l == null ? gfam.a : gfak1.l).k.size() == 0) {
                        z = true;
                    }
                    batl.m(z, "Shouldn\'t overwrite existing input results from server");
                    gfak gfak2 = geyg0.c == null ? gfak.d : geyg0.c;
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)gfak2).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)gfak2));
                    if(!gfal0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gfal0).ensureMutable();
                    }
                    ((gfam)gfal0.b_message).k = hfvv.a;
                    gfal0.a(gfaw0);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gfak gfak3 = (gfak)hftp4.b_message;
                    gfam gfam1 = (gfam)((ProtoLiteBuilder)gfal0).N_build();
                    gfam1.getClass();
                    gfak3.l = gfam1;
                    gfak3.e |= 16;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    geyg geyg1 = (geyg)hftp2.b_message;
                    gfak gfak4 = (gfak)hftp4.N_build();
                    gfak4.getClass();
                    geyg1.c = gfak4;
                    geyg1.b |= 1;
                }
                else if((v3 & 0x20) != 0) {
                    if(((geyg0.h == null ? gezu.c : geyg0.h).d & 2) == 0) {
                        hftp5 = ((ProtoLiteMessage)gezv.a).v_newBuilder();
                    }
                    else {
                        gezu gezu0 = geyg0.h == null ? gezu.c : geyg0.h;
                        gezv gezv0 = gezu0.f == null ? gezv.a : gezu0.f;
                        hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)gezv0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)gezv0));
                    }
                    if(((gezv)hftp5.b_message).g.size() == 0) {
                        z = true;
                    }
                    batl.m(z, "Shouldn\'t overwrite existing input results from server");
                    gezu gezu1 = geyg0.h == null ? gezu.c : geyg0.h;
                    ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)gezu1).jf(5, null);
                    hftp6.X(((ProtoLiteMessage)gezu1));
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((gezv)hftp5.b_message).g = hfvv.a;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gezv gezv1 = (gezv)hftp5.b_message;
                    gfaw0.getClass();
                    gezv1.c();
                    gezv1.g.add(gfaw0);
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gezu gezu2 = (gezu)hftp6.b_message;
                    gezv gezv2 = (gezv)hftp5.N_build();
                    gezv2.getClass();
                    gezu2.f = gezv2;
                    gezu2.d |= 2;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    geyg geyg2 = (geyg)hftp2.b_message;
                    gezu gezu3 = (gezu)hftp6.N_build();
                    gezu3.getClass();
                    geyg2.h = gezu3;
                    geyg2.b |= 0x20;
                }
                ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)gflb0).jf(5, null);
                hftp7.X(((ProtoLiteMessage)gflb0));
                ProtoLiteMessage hftv0 = hftp7.b_message;
                int v4 = ((gflb)hftv0).c;
                if(v4 == 2) {
                    if(!hftv0.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gflb gflb1 = (gflb)hftp7.b_message;
                    geyg geyg3 = (geyg)hftp2.N_build();
                    geyg3.getClass();
                    gflb1.d = geyg3;
                    gflb1.c = 2;
                }
                else if(v4 == 1) {
                    gexj gexj0 = (gexj)((gflb)hftv0).d;
                    if((gexj0.b & 8) != 0) {
                        ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)gexj0).jf(5, null);
                        hftp8.X(((ProtoLiteMessage)gexj0));
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gexj gexj1 = (gexj)hftp8.b_message;
                        geyg geyg4 = (geyg)hftp2.N_build();
                        geyg4.getClass();
                        gexj1.f = geyg4;
                        gexj1.b |= 8;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gflb gflb2 = (gflb)hftp7.b_message;
                        gexj gexj2 = (gexj)hftp8.N_build();
                        gexj2.getClass();
                        gflb2.d = gexj2;
                        gflb2.c = 1;
                    }
                }
                gflb0 = (gflb)hftp7.N_build();
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gfkz gfkz3 = (gfkz)hftp1.b_message;
            gflb0.getClass();
            gfkz3.f = gflb0;
            gfkz3.b |= 8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gflj gflj1 = (gflj)hftp0.b_message;
            gfkz gfkz4 = (gfkz)hftp1.N_build();
            gfkz4.getClass();
            gflj1.d = gfkz4;
            gflj1.b |= 2;
            this.q = (gflj)hftp0.N_build();
            this.an();
            if(((fbla)this.r()).av()) {
                ((fbla)this.r()).ar = creditCardOcrResult0;
            }
        }
    }

    @Override  // fayb
    protected void onCreate(Bundle bundle0) {
        boolean z1;
        if(this.V()) {
            this.v(bundle0, true, 2, gklu.c);
            super.onCreate(bundle0);
            return;
        }
        Intent intent0 = this.getIntent();
        int[] arr_v = intent0.getIntArrayExtra("com.google.android.gms.themeResIds");
        this.s = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent0.getAction());
        this.t = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent0.getAction());
        if(arr_v != null && arr_v.length > 0) {
            this.setTheme(arr_v[0]);
            for(int v = 1; v < arr_v.length; ++v) {
                this.getTheme().applyStyle(arr_v[v], true);
            }
        }
        else if(this.s) {
            if(hzns.a.b().a()) {
                fbgn.D(this, this.q(), fbgn.f, false);
            }
            else {
                this.setTheme((fbgn.G(this, this.q()) ? 0x7F160F20 : 0x7F160F23));  // style:Theme_Wallet_Material_Dark_Alert_Dialog_Without_Action_Bar
            }
            this.z = ImRootChimeraActivity.al(this.q());
        }
        else {
            boolean z = fbgn.R(this.q());
            this.A = z;
            if(z) {
                BuyFlowConfig buyFlowConfig0 = this.q();
                if(buyFlowConfig0 == null) {
                    z1 = false;
                }
                else {
                    WalletCustomTheme walletCustomTheme0 = buyFlowConfig0.b.f;
                    z1 = walletCustomTheme0 != null && walletCustomTheme0.d().getInt("customLayout", 0) == 1;
                }
            }
            else {
                z1 = false;
            }
            this.s = z1;
            fbgn.D(this, this.q(), fbgn.e, true);
        }
        byte[] arr_b = new byte[0];
        this.ao();
        gflj gflj0 = this.q;
        if(gflj0 != null) {
            gfkz gfkz0 = gflj0.d == null ? gfkz.a : gflj0.d;
            arr_b = (gfkz0.d == null ? gete.c : gfkz0.d).g.toByteArray();
        }
        this.w(bundle0, true, 2, gklu.c, arr_b);
        super.onCreate(bundle0);
        fayc.c(this);
        this.r = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if(bundle0 == null) {
            gflj gflj1 = this.q;
            if(gflj1 != null) {
                gfkz gfkz1 = gflj1.d == null ? gfkz.a : gflj1.d;
                if(this.ak((gfkz1.f == null ? gflb.a : gfkz1.f))) {
                    dkhl dkhl0 = fbed.a(this);
                    dkhl0.c(this.oc().name);
                    String s = gcuj.h(this.getIntent());
                    if(s != null) {
                        dkhl0.h(4);
                    }
                    if(hzph.a.b().a()) {
                        gfdx gfdx0 = gfdx.e;
                        gfkz gfkz2 = this.q.d == null ? gfkz.a : this.q.d;
                        gged_interceptors gged0 = ggna.a;
                        geyg geyg0 = ImRootChimeraActivity.am((gfkz2.f == null ? gflb.a : gfkz2.f));
                        if(geyg0 != null) {
                            int v1 = geyg0.b;
                            if((v1 & 1) != 0) {
                                gged0 = (geyg0.c == null ? gfak.d : geyg0.c).u;
                            }
                            else if((v1 & 0x20) != 0) {
                                gged0 = (geyg0.h == null ? gezu.c : geyg0.h).r;
                            }
                        }
                        gcio.h(dkhl0, gfdx0, gged0);
                    }
                    Intent intent1 = dkhl0.a();
                    this.y = intent1;
                    if(intent1 != null && s != null) {
                        gcuj.i(intent1, s);
                    }
                    Intent intent2 = this.y;
                    if(intent2 != null) {
                        this.startActivityForResult(intent2, 5001);
                        return;
                    }
                }
            }
        }
        this.an();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        if(this.r() != null) {
            ((fbla)this.r()).aq(intent0);
        }
    }

    @Override  // xni
    protected void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        TextView textView0 = this.x;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }
}


package com.google.android.gms.wallet.buyflow;

import MessageLite;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import batl;
import ca;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.common.ui.BottomSheetView;
import com.google.android.gms.wallet.common.ui.PopoverView;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import du;
import fayb;
import fbae;
import fbcz;
import fbdt;
import fbeg;
import fbew;
import fbez;
import fbfk;
import fbfm;
import fbgm;
import fbgn;
import fbht;
import fbya;
import fbyc;
import fbzu;
import gcfz;
import gciq;
import gczl;
import gczm;
import gers;
import gkke;
import gkkh;
import gklm;
import gkln;
import gklu;
import hcao;
import hfui;
import hfuo;
import hzji;
import hzme;
import hzmh;
import hzmn;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jto;

public class CheckoutChimeraActivity extends fayb implements fbez, fbfk, gczl {
    int q;
    gczm r;
    PopoverView s;
    BottomSheetView t;
    Toolbar u;
    private boolean v;

    @Override  // fayb
    public final void A(WalletExitResult walletExitResult0) {
        if(this.s != null) {
            if(fbgn.L(this.getResources())) {
                this.av(walletExitResult0);
                return;
            }
            this.s.d(walletExitResult0);
            return;
        }
        if(this.t != null) {
            this.ag();
            this.findViewById(0x7F0B0D29).setVisibility(8);  // id:bottom_sticky_button_container
            this.t.f(walletExitResult0.c());
            return;
        }
        this.av(walletExitResult0);
    }

    @Override  // fayb
    public final void B(int v) {
        this.au(v);
    }

    @Override  // fayb
    public final void C(WalletExitResult walletExitResult0) {
        Intent intent0 = this.ay(5, walletExitResult0.e, 9, false);
        intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", walletExitResult0.e);
        if(fbdt.a(this.q().c)) {
            walletExitResult0.a().b(intent0);
        }
        this.setResult(1, intent0);
        this.finish();
    }

    @Override  // fayb
    public final void E(Parcelable parcelable0, boolean z) {
        Intent intent0 = this.ay(2, 0, 2, z);
        if(((BuyFlowResult)parcelable0) != null) {
            byte[] arr_b = ((BuyFlowResult)parcelable0).d;
            if(arr_b != null) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", arr_b);
            }
            if(!TextUtils.isEmpty(((BuyFlowResult)parcelable0).b)) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", ((BuyFlowResult)parcelable0).b);
            }
            if(!TextUtils.isEmpty(((BuyFlowResult)parcelable0).c)) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE", ((BuyFlowResult)parcelable0).c);
            }
            byte[] arr_b1 = ((BuyFlowResult)parcelable0).g;
            if(arr_b1 != null) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", arr_b1);
            }
        }
        this.setResult(-1, intent0);
        this.finish();
    }

    @Override  // fayb
    protected final boolean S() {
        if(this.q() != null) {
            gers gers0 = this.as();
            if(gers0 != null) {
                int v = CheckoutChimeraActivity.ar(gers0);
                int v1 = CheckoutChimeraActivity.aq(gers0);
                hfui hfui0 = (gers0.p == null ? hcao.a : gers0.p).e;
                hfuo hfuo0 = hzji.b().b;
                int v2 = hfuo0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    if(CheckoutChimeraActivity.aw(((fbht)hfuo0.get(v3)), v1, v, hfui0)) {
                        return this.getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                    }
                }
            }
        }
        return false;
    }

    @Override  // fayb
    protected final void Z() {
        if(hzmn.a.b().g()) {
            gers gers0 = this.as();
            if(gers0 != null) {
                int v = CheckoutChimeraActivity.ar(gers0);
                int v1 = CheckoutChimeraActivity.aq(gers0);
                hfui hfui0 = (gers0.p == null ? hcao.a : gers0.p).e;
                hfuo hfuo0 = hzji.b().b;
                int v2 = hfuo0.size();
                Integer[] arr_integer = new Integer[v2];
                for(int v3 = 0; v3 < v2; ++v3) {
                    fbht fbht0 = (fbht)hfuo0.get(v3);
                    arr_integer[v3] = CheckoutChimeraActivity.aw(fbht0, v1, v, hfui0) ? ((int)fbht0.e) : ((int)fbht0.f);
                }
                gcfz.h(this.k, 1L, arr_integer);
            }
        }
    }

    @Override  // fayb
    protected final int a() {
        return CheckoutChimeraActivity.aq(this.as());
    }

    @Override  // gczl
    public final void aD(int v, int v1) {
        if(v1 == 1000) {
            if(v != 1) {
                this.az(7);
                return;
            }
            this.at();
            return;
        }
        Log.e("CheckoutChimeraActivity", "Unknown error dialog error code: " + v1);
        this.au(-1);
    }

    @Override  // fayb
    public final void ac(int v) {
        if(this.s != null) {
            if(fbgn.L(this.getResources())) {
                this.az(v);
                return;
            }
            this.s.p(v);
            return;
        }
        if(this.t != null) {
            this.ag();
            this.findViewById(0x7F0B0D29).setVisibility(8);  // id:bottom_sticky_button_container
            this.t.f(v);
            return;
        }
        this.az(v);
    }

    static int ae(Context context0, BuyFlowConfig buyFlowConfig0) {
        WalletCustomTheme walletCustomTheme0 = buyFlowConfig0.b.f;
        boolean z = walletCustomTheme0 != null && walletCustomTheme0.d().getInt("windowTransitionsStyle", -1) == 4;
        boolean z1 = fbgn.L(context0.getResources()) && hzmh.c();
        boolean z2 = hzme.a.b().a();
        if(z && z1) {
            return 2;
        }
        if(z) {
            return 3;
        }
        if(z1) {
            return 1;
        }
        return z2 ? 4 : 0;
    }

    public static Intent af(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0) {
        batl.s(buyFlowConfig0);
        batl.s(buyFlowConfig0.b);
        batl.b(((boolean)(buyFlowConfig0.b.d ^ 1)));
        Intent intent1 = new Intent();
        intent1.setClassName(context0, "com.google.android.gms.wallet.buyflow.CheckoutActivity");
        intent1.putExtras(intent0.getExtras());
        intent1.setAction("com.google.android.gms.wallet.ACTION_CHECKOUT");
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        switch(CheckoutChimeraActivity.ae(context0, buyFlowConfig0)) {
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            default: {
                intent1.addFlags(0x10000);
            }
        }
        return intent1;
    }

    final void ag() {
        this.u.setVisibility(4);
        this.getWindow().getDecorView().setBackgroundColor(0);
        this.getWindow().setStatusBarColor(0);
    }

    @Override  // fbfk
    public final void ah() {
        this.az(8);
    }

    @Override  // fbfk
    public final void ai(int v) {
        this.au(-1);
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

    @Override  // fbez
    public final void ak(WalletExitResult walletExitResult0) {
        this.av(walletExitResult0);
    }

    @Override  // fbez
    public final void al() {
        if(this.t != null) {
            this.hL().D();
            int[] arr_v = {0x1010031, 0x7F04030E};  // attr:colorPrimaryDark
            Arrays.sort(arr_v);
            TypedArray typedArray0 = this.obtainStyledAttributes(arr_v);
            int v = typedArray0.getColor(Arrays.binarySearch(arr_v, 0x1010031), -1);
            int v1 = typedArray0.getColor(Arrays.binarySearch(arr_v, 0x7F04030E), 0xFF000000);  // attr:colorPrimaryDark
            typedArray0.recycle();
            this.getWindow().getDecorView().setBackgroundColor(v);
            this.getWindow().setStatusBarColor(v1);
        }
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

    public final void ao(boolean z) {
        if(this.ax()) {
            View view0 = this.findViewById(0x7F0B1725);  // id:initialize_progress_spinner
            if(view0 != null) {
                view0.setVisibility((z ? 0 : 8));
            }
        }
    }

    @Override  // fbez
    public final void ap(int v) {
        this.az(v);
    }

    private static int aq(gers gers0) {
        if(gers0 == null) {
            return -1;
        }
        if((gers0.c & 0x200) != 0) {
            return gers0.n;
        }
        return ((gers0.p == null ? hcao.a : gers0.p).b & 1) == 0 ? -1 : (gers0.p == null ? hcao.a : gers0.p).c;
    }

    private static int ar(gers gers0) {
        if(gers0 == null) {
            return -1;
        }
        if((gers0.c & 0x400) != 0) {
            return gers0.o;
        }
        return ((gers0.p == null ? hcao.a : gers0.p).b & 2) == 0 ? -1 : (gers0.p == null ? hcao.a : gers0.p).d;
    }

    private final gers as() {
        if(this.getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
            return (gers)gciq.b(this.getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ((Parser)((ProtoLiteMessage)gers.b).jf(7, null)));
        }
        return this.getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS") ? ((gers)gciq.b(this.getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", ((Parser)((ProtoLiteMessage)gers.b).jf(7, null)))) : null;
    }

    private final void at() {
        fbcz fbcz0;
        if(!fbyc.a(this)) {
            if(this.r != null) {
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.o(this.r);
                ca0.a();
            }
            gczm gczm0 = gczm.B();
            this.r = gczm0;
            gczm0.ag = this;
            gczm0.show(this.getSupportFragmentManager(), "CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
            return;
        }
        if(!this.v) {
            this.v = true;
            fbfm fbfm0 = fbfm.y(this.oc(), new String[]{fbya.e(this.q().b)});
            ca ca1 = new ca(this.getSupportFragmentManager());
            ca1.v(fbfm0, "RetrieveAuthTokensFragment");
            ca1.a();
        }
        Intent intent0 = this.getIntent();
        byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        if(intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
            fbcz0 = fbcz.aS(intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), null, null, arr_b, this.q(), this.j, null, this.k);
            this.G(fbcz0, 0x7F0B1CDD);  // id:popover_content_holder
            return;
        }
        if(!intent0.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
            throw new IllegalArgumentException("CheckoutChimeraActivity requires either buyflow params or InitializeResponse token");
        }
        fbcz0 = fbcz.aT(intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), arr_b, this.q(), this.j, null, this.k);
        this.G(fbcz0, 0x7F0B1CDD);  // id:popover_content_holder
    }

    private final void au(int v) {
        Intent intent0 = this.ay(5, v, 9, false);
        intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", v);
        this.setResult(1, intent0);
        this.finish();
    }

    private final void av(WalletExitResult walletExitResult0) {
        Intent intent0 = this.ay(4, 0, walletExitResult0.c(), false);
        if(fbdt.a(this.q().c)) {
            walletExitResult0.a().b(intent0);
        }
        this.setResult(0, intent0);
        this.finish();
    }

    private static boolean aw(fbht fbht0, int v, int v1, List list0) {
        if(!fbht0.b.isEmpty() && !fbht0.b.contains(Integer.valueOf(v))) {
            return false;
        }
        return fbht0.c.isEmpty() || fbht0.c.contains(Integer.valueOf(v1)) ? fbht0.d.isEmpty() || !Collections.disjoint(fbht0.d, list0) : false;
    }

    private final boolean ax() {
        return this.q().b.j == 1;
    }

    private final Intent ay(int v, int v1, int v2, boolean z) {
        Intent intent0 = CheckoutChimeraActivity.Y(z);
        gkln gkln0 = AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(v, v1, v2, (this.oc() == null ? "" : this.oc().name), this.j));
        if(gkln0 != null) {
            for(Object object0: gkln0.b) {
                gklm gklm0 = (gklm)object0;
                if((gklm0.i == null ? gkke.a : gklm0.i).e.size() != 0) {
                    for(Object object1: (gklm0.i == null ? gkke.a : gklm0.i).e) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gkkh)object1))).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)(((gkkh)object1))));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gkkh gkkh0 = (gkkh)hftp0.b_message;
                        gkkh0.b &= -9;
                        gkkh0.f = gkkh.a.f;
                        gkkh gkkh1 = (gkkh)hftp0.N_build();
                    }
                }
            }
        }
        gciq.k(intent0, "com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", ((MessageLite)gkln0));
        byte[] arr_b = this.l;
        if(arr_b != null && arr_b.length > 0) {
            intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", arr_b);
        }
        gcfz.r(this.k, fbeg.a(v), v1);
        return intent0;
    }

    private final void az(int v) {
        this.setResult(0, this.ay(4, 0, v, false));
        this.finish();
    }

    @Override  // fayb
    public final void finish() {
        super.finish();
        if(this.q == 3) {
            this.overridePendingTransition(0, fbgn.c(this.q()));
        }
    }

    @Override  // fayb
    protected final int l() {
        return CheckoutChimeraActivity.ar(this.as());
    }

    @Override  // fayb
    protected final Intent n() {
        return fbae.k(this, 1, this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), this.getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), this.q(), this.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        fbgm fbgm0;
        BuyFlowConfig buyFlowConfig0 = this.q();
        if(!this.V()) {
            int v = CheckoutChimeraActivity.ae(this, buyFlowConfig0);
            this.q = v;
            switch(v) {
                case 1: 
                case 2: 
                case 3: {
                    fbgm0 = fbgn.e;
                    break;
                }
                case 4: {
                    fbgm0 = fbgn.c;
                    break;
                }
                default: {
                    fbgm0 = fbgn.b;
                }
            }
            fbgn.D(this, buyFlowConfig0, fbgm0, true);
        }
        this.v(bundle0, true, 1, gklu.b);
        super.onCreate(bundle0);
        if(this.V()) {
            return;
        }
        switch(this.q) {
            case 1: 
            case 2: 
            case 3: {
                this.setContentView(0x7F0E0C87);  // layout:wallet_activity_checkout_fullscreen
                Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B0DD7);  // id:buyflow_toolbar
                this.u = toolbar0;
                this.hG(toolbar0);
                break;
            }
            case 4: {
                this.setContentView(0x7F0E0C86);  // layout:wallet_activity_checkout_bottom_sheet
                Toolbar toolbar1 = (Toolbar)this.findViewById(0x7F0B0DD7);  // id:buyflow_toolbar
                this.u = toolbar1;
                this.hG(toolbar1);
                this.ag();
                break;
            }
            default: {
                this.setContentView(0x7F0E0C85);  // layout:wallet_activity_checkout
                TypedArray typedArray0 = this.obtainStyledAttributes(new int[]{0x7F040359});  // attr:colorWalletActionBarForeground
                int v1 = typedArray0.getColor(0, 0);
                typedArray0.recycle();
                Drawable drawable0 = this.getResources().getDrawable(0x7F080CD4, this.getTheme());
                if(v1 != 0 && drawable0 != null) {
                    drawable0.setTint(v1);
                    this.hL().x(drawable0);
                    this.hL().u(0x7F150783);  // string:close_button_label "Close"
                }
            }
        }
        this.hL().o(true);
        BottomSheetView bottomSheetView0 = (BottomSheetView)this.findViewById(0x7F0B0CFD);  // id:bottom_sheet
        this.t = bottomSheetView0;
        if(bottomSheetView0 != null) {
            boolean z = this.ax();
            double f = buyFlowConfig0.b.h;
            if(z) {
                bottomSheetView0.setVisibility(8);
            }
            bottomSheetView0.f = f;
            bottomSheetView0.i = new BottomSheetBehavior();
            ((jto)bottomSheetView0.getLayoutParams()).b(bottomSheetView0.i);
            bottomSheetView0.i.C(new fbew(bottomSheetView0));
            bottomSheetView0.i.K(4);
            bottomSheetView0.i.H(false);
            this.t.k = this;
        }
        PopoverView popoverView0 = (PopoverView)this.findViewById(0x7F0B1CDC);  // id:popover
        this.s = popoverView0;
        if(popoverView0 != null) {
            if(this.ax()) {
                this.s.setVisibility(8);
            }
            PopoverView.c(this);
            this.s.f = this;
            this.s.j(buyFlowConfig0.b.h, buyFlowConfig0.b.i);
        }
        if(bundle0 == null) {
            this.at();
        }
        else {
            this.v = bundle0.getBoolean("hasAuthTokens");
            if(bundle0.getBoolean("initializeProgressSpinnerVisible")) {
                this.ao(true);
            }
        }
        View view0 = this.findViewById(0x7F0B247C);  // id:wallet_root
        fbgn.A(view0);
        fbgn.B(view0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        if(this.r() != null) {
            ((fbcz)this.r()).aq(intent0);
        }
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        gczm gczm0 = (gczm)this.getSupportFragmentManager().h("CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
        this.r = gczm0;
        if(gczm0 != null) {
            gczm0.ag = this;
        }
    }

    @Override  // fayb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("hasAuthTokens", this.v);
        View view0 = this.findViewById(0x7F0B1725);  // id:initialize_progress_spinner
        if(view0 != null) {
            bundle0.putBoolean("initializeProgressSpinnerVisible", view0.getVisibility() == 0);
        }
    }

    @Override  // fayb
    protected final String u() {
        gers gers0 = this.as();
        return gers0 == null || (gers0.c & 0x800) == 0 ? null : (gers0.p == null ? hcao.a : gers0.p).f;
    }
}


package com.google.android.gms.mobiledataplan.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.SubscriptionManager;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import aztb;
import azts;
import bbcu;
import bbdg;
import bblp;
import bboh;
import bkyf;
import ca;
import ccmq;
import cjqh;
import cmks;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.PurchasePlanActivation;
import crvw;
import crwa;
import crxn;
import crxu;
import crzb;
import crzc;
import csat;
import cscb;
import csdi;
import csdj;
import csef;
import cseg;
import cseh;
import csej;
import csek;
import csem;
import csff;
import csfg;
import csfi;
import csgm;
import csli;
import cslm;
import ggtj;
import gizm;
import gizn;
import gsnm;
import hhcr;
import hhct;
import hvjh;
import hvjk;
import hvjw;
import hvkh;
import hvkk;
import hvko;
import hvle;
import hvlq;
import hvly;
import im;
import j..time.Duration;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import jeb.synthetic.FIN;
import xni;

@GmsCoreVeId(0x3FB7F)
public class MobileDataPlanSettingsChimeraActivity extends xni {
    public static final bboh j;
    public float k;
    public csdj l;
    public boolean m;
    private static boolean n;
    private boolean o;
    private final int p;
    private csfg q;
    private boolean r;

    static {
        MobileDataPlanSettingsChimeraActivity.j = bboh.b("MobileDataPlan", bbcu.ck);
        MobileDataPlanSettingsChimeraActivity.n = false;
    }

    public MobileDataPlanSettingsChimeraActivity() {
        this.o = false;
        this.p = 0x7F0E092C;  // layout:settings_activity
        this.q = null;
        this.r = false;
    }

    public static gsnm a(Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsnm.a).v_newBuilder();
        String s = cslm.e(context0.getApplicationContext());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsnm gsnm0 = (gsnm)hftp0.b_message;
        s.getClass();
        gsnm0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsnm gsnm1 = (gsnm)hftp0.b_message;
        "Something went wrong while retrieving support page contents. Please refresh and retry.".getClass();
        gsnm1.b = "Something went wrong while retrieving support page contents. Please refresh and retry.";
        return (gsnm)hftp0.N_build();
    }

    public final void g(hhct hhct0, Bundle bundle0, String s) {
        cscb.A(this, bundle0, 0x7F0B0E66, hhct0, s);  // id:carrier_support_page_placeholder
        this.findViewById(0x7F0B0FE5).setVisibility(8);  // id:content_layout
    }

    public final void l() {
        crxn crxn0 = crxn.c();
        Integer integer0 = csfi.a();
        crxn0.Q(26, this.q.toString(), "R.id.error_layout", hhct.aV, System.currentTimeMillis(), integer0);
        this.findViewById(0x7F0B129B).setVisibility(8);  // id:error_screen_flipper
        this.findViewById(0x7F0B0FE5).setVisibility(0);  // id:content_layout
    }

    public final void m() {
        this.findViewById(0x7F0B2423).setVisibility(8);  // id:user_notice_card
    }

    final void n(boolean z, boolean z1) {
        hhct hhct0;
        crxn crxn0 = crxn.c();
        Intent intent0 = this.getIntent();
        String s = intent0 == null ? null : intent0.getAction();
        if(!z && !z1) {
            if(hvkk.e() && this.m) {
                return;
            }
            crxn0.Q(40, null, null, hhct.bo, System.currentTimeMillis(), csfi.a());
            return;
        }
        if(s != null) {
            if(s.equals("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                int v = gizn.b(intent0.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                if(v == 0) {
                    throw null;
                }
                if(v - 2 == 100) {
                    hhct0 = hhct.as;
                }
                else {
                    switch(v - 2) {
                        case 1: {
                            hhct0 = hhct.aj;
                            break;
                        }
                        case 2: {
                            hhct0 = hhct.ak;
                            break;
                        }
                        case 3: {
                            hhct0 = hvle.f() ? hhct.al : hhct.ai;
                            break;
                        }
                        case 4: {
                            hhct0 = hhct.am;
                            break;
                        }
                        case 5: {
                            hhct0 = hhct.an;
                            break;
                        }
                        case 6: {
                            hhct0 = hhct.ao;
                            break;
                        }
                        case 7: {
                            hhct0 = hhct.ap;
                            break;
                        }
                        case 8: {
                            hhct0 = hhct.ai;
                            break;
                        }
                        case 9: {
                            hhct0 = hhct.aq;
                            break;
                        }
                        case 10: {
                            hhct0 = hhct.ar;
                            break;
                        }
                        default: {
                            hhct0 = hhct.a;
                        }
                    }
                }
                if(z) {
                    if(intent0.getIntExtra("NOTIFICATION_ACTION_INDEX", -1) != -1) {
                        crxn0.z(intent0, gizm.x, "MDP_UiAction", hhct.cw);
                    }
                    crxn0.z(intent0, gizm.l, "MDP_UiAction", hhct0);
                }
                long v1 = intent0.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
                crxn0.P((z ? 17 : 41), Long.toString(v1), Long.toString(v1), Long.valueOf(v1), (z ? hhct.aH : hhct.bp), System.currentTimeMillis(), csfi.a());
                return;
            }
            if(s.equals("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY")) {
                crxn0.Q(16, null, null, hhct.aG, System.currentTimeMillis(), csfi.a());
                return;
            }
            if(s.equals("com.google.android.gms.mobiledataplan.ui.DETAIL_SETTINGS_TO_MAIN")) {
                crxn0.Q(73, null, null, hhct.cr, System.currentTimeMillis(), csfi.a());
            }
        }
        Uri uri0 = this.getReferrer();
        crxn0.Q((z ? 18 : 42), (uri0 == null ? "Unknown Calling Package" : uri0.toString()), null, (z ? hhct.aI : hhct.bq), System.currentTimeMillis(), csfi.a());
    }

    public final void o(csfg csfg0) {
        ImageView imageView1;
        ImageView imageView0;
        TextView textView1;
        TextView textView0;
        Button button0;
        this.invalidateOptionsMenu();
        ViewFlipper viewFlipper0 = (ViewFlipper)this.findViewById(0x7F0B129B);  // id:error_screen_flipper
        if(this.getResources().getConfiguration().orientation == 2) {
            viewFlipper0.setDisplayedChild(1);
        }
        else {
            viewFlipper0.setDisplayedChild(0);
        }
        if(this.findViewById(0x7F0B219B) != null) {  // id:support_channel_page_layout
            this.onBackPressed();
        }
        this.findViewById(0x7F0B0FE5).setVisibility(8);  // id:content_layout
        this.q = csfg0;
        viewFlipper0.setVisibility(0);
        this.l.t(false);
        csgm.a();
        if(this.getResources().getConfiguration().orientation == 2) {
            button0 = (Button)this.findViewById(0x7F0B1E26);  // id:refresh_button_landscape
            textView0 = (TextView)this.findViewById(0x7F0B12A5);  // id:error_title_landscape
            textView1 = (TextView)this.findViewById(0x7F0B1286);  // id:error_description_landscape
            imageView0 = (ImageView)this.findViewById(0x7F0B1298);  // id:error_picture_landscape
            imageView1 = (ImageView)this.findViewById(0x7F0B0E64);  // id:carrier_logo_landscape
        }
        else {
            button0 = (Button)this.findViewById(0x7F0B1E27);  // id:refresh_button_portrait
            textView0 = (TextView)this.findViewById(0x7F0B12A6);  // id:error_title_portrait
            textView1 = (TextView)this.findViewById(0x7F0B1287);  // id:error_description_portrait
            imageView0 = (ImageView)this.findViewById(0x7F0B1299);  // id:error_picture_portrait
            imageView1 = (ImageView)this.findViewById(0x7F0B0E65);  // id:carrier_logo_portrait
        }
        String s = this.l.g();
        textView0.setText(this.getString(csfg0.g, new Object[]{s}));
        if(hvlq.m() && csfg0 == csfg.d && s != null) {
            try {
                long v = cjqh.a(AppContextProvider.a(), "mobiledataplan", "ESIM_SHARED_PREFS", 0).b("ESIM_LAST_SUCCESS_TIMESTAMP", 0L);
                if(Duration.ofMillis(System.currentTimeMillis()).toSeconds() >= v + 86400L) {
                    ((ggtj)MobileDataPlanSettingsChimeraActivity.j.h()).B("Pending valid data plan response for eSIM subscriber of carrier: %s", s);
                }
                else {
                    goto label_35;
                }
            }
            catch(IOException iOException0) {
                a.ae(MobileDataPlanSettingsChimeraActivity.j.j(), "KeyValuePreferences failed to fetch eSIM status.", iOException0);
            }
            goto label_42;
        label_35:
            boolean z = Collection.-EL.stream(SubscriptionManager.from(this).getActiveSubscriptionInfoList()).anyMatch(new cseg(s));
            bboh bboh0 = MobileDataPlanSettingsChimeraActivity.j;
            ((ggtj)bboh0.h()).S("eSIM subscriber of valid carrier %s: %s", s, z);
            if(z) {
                ((ggtj)bboh0.j()).B("Unsupported plan error with eSIM carrier: %s", s);
                textView0.setText(this.getString(0x7F150F87, new Object[]{s}));  // string:esim_post_activation_message "Congratulations! %s Network Pass setup successful."
                imageView0.setImageResource(0x7F0802C5);  // drawable:check_circle
            }
        }
    label_42:
        if(csfg0 == csfg.f) {
            if(hvlq.v()) {
                textView0.setText("View your device plan details on this phone");
                textView1.setText(Html.fromHtml(this.getString(0x7F1530B2, new Object[]{s, hvjw.g(), hvjw.h(), hvjw.f(), hvjw.a.e().h(), hvjw.a.e().g()})));  // string:t_mobile_opted_out_text "Mobile networks like %1$s partner with Google so 
                                                                                                                                                              // you can manage your plan & balances. <br/> <a href=%2$s>Learn more</a> <br/> <br/> 
                                                                                                                                                              // <a href=%3$s>Google Terms of Service</a> & <a href=%4$s>Privacy Policy</a>. <br/> 
                                                                                                                                                              // <a href=%5$s>T-Mobile Terms of Service</a> & <a href=%6$s>Privacy Policy</a>."
            }
            else {
                Object[] arr_object = {s, hvjw.g(), hvjw.h(), hvjw.f()};
                textView1.setText(Html.fromHtml(this.getString(csfg0.h, arr_object)));
            }
            textView1.setMovementMethod(LinkMovementMethod.getInstance());
            button0.setVisibility(0);
            button0.setText(csfg0.i);
            button0.setOnClickListener(new csem(this.l));
            crvw crvw0 = crvw.c();
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = this.l.q;
            Bitmap bitmap0 = null;
            Long long0 = mdpCarrierPlanIdResponse0 == null ? null : ((long)mdpCarrierPlanIdResponse0.e);
            if(long0 == null) {
                long0 = crvw.c().p(csli.g(AppContextProvider.a()));
            }
            crwa crwa0 = crvw0.d.a(long0);
            if(crwa0 != null) {
                byte[] arr_b = crwa0.a.getAsByteArray("carrier_logo");
                if(arr_b != null) {
                    bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                }
            }
            if(bitmap0 == null) {
                imageView1.setVisibility(8);
            }
            else {
                imageView1.setImageBitmap(bitmap0);
                imageView1.setVisibility(0);
            }
            imageView0.setVisibility(8);
            crxn.c().Q(69, null, "R.id.error_layout", hhct.ck, System.currentTimeMillis(), csfi.a());
            crxn.c().Q(43, "handledError", null, hhct.br, System.currentTimeMillis(), csfi.a());
            return;
        }
        int v1 = csfg0.h;
        if(v1 == 0) {
            textView1.setVisibility(8);
        }
        else {
            textView1.setVisibility(0);
            if(TextUtils.isEmpty(s) && hvly.a.c().d()) {
                textView1.setText(csfg0.k);
            }
            else {
                textView1.setText(this.getString(v1, new Object[]{s}));
            }
        }
        imageView0.setVisibility((csfg0.l ? 0 : 8));
        imageView1.setVisibility(8);
        int v2 = csfg0.i;
        if(v2 == 0) {
            button0.setVisibility(8);
        }
        else {
            button0.setVisibility(0);
            button0.setText(v2);
            button0.setOnClickListener(new csdi(this.l));
        }
        this.m();
        crxn.c().Q(43, "handledError", null, hhct.br, System.currentTimeMillis(), csfi.a());
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x91D) {
            if(v1 == -1) {
                csff.c(this.l, true);
                return;
            }
            csff.c(this.l, false);
            this.p(new aztb(new Status(0x698F)));
            return;
        }
        if(v == 0x91E && v1 != -1) {
            this.l.q(true);
        }
    }

    @Override  // xni
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        if(!this.r() && this.getContainerActivity().isInMultiWindowMode()) {
            if(hvly.a.c().h()) {
                this.recreate();
                return;
            }
            this.finish();
            this.startActivity(this.getIntent());
            return;
        }
        if(this.r()) {
            this.o(this.q);
        }
        csdj csdj0 = this.l;
        if(csdj0.f == null) {
            return;
        }
        csdj0.m.q();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.pU);
        super.onCreate(bundle0);
        this.setTitle(0x7F1518A4);  // string:mobile_data_plan "Device Plans"
        this.setContentView(this.p);
        im im0 = this.hL();
        im0.q(4, 4);
        im0.o(true);
        if(hvly.j()) {
            im0.j(new ColorDrawable(this.getResources().getColor(0x7F060114)));  // color:carrier_header_background
        }
        else {
            im0.j(new ColorDrawable(this.getResources().getColor(0x7F06129C)));  // color:top_entry_grey
        }
        this.k = im0.a();
        im0.t(0.0f);
        if(hvlq.m() && !this.r) {
            this.setTheme(0x7F160D1A);  // style:Theme.MobileDataPlan.DefaultGoogleMaterial
            int v = this.q(this.getIntent());
            this.r = v ^ 1;
            if(v != 0) {
                goto label_18;
            }
            return;
        }
    label_18:
        if(!hvko.Q()) {
            ((ggtj)MobileDataPlanSettingsChimeraActivity.j.j()).x("Mobiledataplan\'s Settings is not enabled in this device yet.");
            this.finish();
            return;
        }
        if(cslm.i(this)) {
            this.finish();
            return;
        }
        RecyclerView recyclerView0 = (RecyclerView)this.findViewById(0x7F0B10A6);  // id:dataplan_recyclerview
        recyclerView0.ap(new LinearLayoutManager());
        recyclerView0.D(new csek(this, im0));
        this.m = false;
        MobileDataPlanSettingsChimeraActivity.n = false;
        if(hvly.g()) {
            try {
                csdj.d();
                ((ggtj)MobileDataPlanSettingsChimeraActivity.j.h()).x("GlobalStateHelper was NOT null, calling destroyInstance() first to create new GlobalStateHelper.");
                csdj.l();
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        csfi.b();
        Object object0 = csdj.c;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        csdj csdj0 = csdj.d;
        if(csdj0 == null) {
            csdj.d = new csdj(this);
            FIN.finallyCodeBegin$NT(v1);
            this.l = csdj.d;
            this.t(this.getIntent());
            this.n(true, this.o);
            if(hvlq.w()) {
                this.s(this.getIntent());
            }
            hvkh hvkh0 = hvkh.a;
            if(hvkh0.b().b()) {
                Activity activity0 = this.getContainerActivity();
                if(activity0 != null) {
                    String s = hvkh0.b().a();
                    boolean z = hvkh0.b().c();
                    cmks.a(activity0, bbcu.ck, s, z);
                }
            }
            return;
        }
        throw new IllegalStateException("createInstance called when instance != null! Instance: " + csdj0.toString());
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        if(this.findViewById(0x7F0B219B) != null) {  // id:support_channel_page_layout
            return false;
        }
        this.getMenuInflater().inflate(0x7F100020, menu0);  // menu:mobiledataplan_settings_menu
        return true;
    }

    @Override  // xni
    protected final void onDestroy() {
        if(this.l != null && (!hvly.g() || this.l == csdj.d())) {
            crxn.c().Q(37, null, null, hhct.bl, System.currentTimeMillis(), csfi.a());
            csdj.l();
            csfi.a = null;
        }
        hvjh.a.e().k();
        super.onDestroy();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.o = true;
        this.setIntent(intent0);
        if(hvlq.m()) {
            int v = this.q(intent0);
            this.r = v ^ 1;
            if(v == 0) {
                return;
            }
        }
        if(hvlq.w()) {
            this.s(intent0);
        }
        this.t(intent0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        Bitmap bitmap0 = null;
        int v = menuItem0.getItemId();
        if(v == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        if(v == 0x7F0B1391) {  // id:feedback
            azts azts0 = new azts(this, null);
            try {
                View view0 = this.getWindow().getDecorView().getRootView();
                Bitmap bitmap1 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                view0.draw(new Canvas(bitmap1));
                bitmap0 = bitmap1;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(MobileDataPlanSettingsChimeraActivity.j.j(), "MobileDataPlan feedback got screenshot failed!", illegalArgumentException0);
            }
            bkyf bkyf0 = new bkyf(this);
            bkyf0.a = bitmap0;
            bkyf0.d = "com.google.android.gms.mobiledataplan.USER_INITIATED_FEEDBACK_REPORT";
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = this.l.q;
            if(mdpCarrierPlanIdResponse0 == null) {
                azts0.ab(bkyf0.a());
                return true;
            }
            bkyf0.c("carrier ID", Long.toString(mdpCarrierPlanIdResponse0.e));
            String s = mdpCarrierPlanIdResponse0.a;
            if(!TextUtils.isEmpty(s)) {
                bkyf0.c("CPID", s);
            }
            azts0.ab(bkyf0.a());
            return true;
        }
        switch(v) {
            case 0x7F0B1E23: {  // id:refresh
                crxn.c().Q(13, "refresh_button", "R.id.refresh", hhct.aD, System.currentTimeMillis(), csfi.a());
                this.l.q(false);
                return true;
            }
            case 0x7F0B1FC7: {  // id:settings
                Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTINGS").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                if(hvkk.e() && csfi.a() != null) {
                    intent0.putExtra("EventFlowId", csfi.a());
                }
                intent0.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                this.startActivityForResult(intent0, 0x91E);
                return true;
            }
            case 0x7F0B20E4: {  // id:stop_syncing
                new AlertDialog.Builder(this).setTitle(0x7F152F60).setMessage(this.getString(0x7F152F5E, new Object[]{this.l.g()})).setPositiveButton(0x7F152F5F, new csef(this)).setNegativeButton(0x7F1507F2, null).create().show();  // string:stop_syncing_confirm_dialog_title "Stop sharing your plan info?"
                return true;
            }
            case 0x7F0B2197: {  // id:support
                String s1 = menuItem0.getTitle().toString();
                crxn.c().Q(33, s1, "R.id.support", hhct.bh, System.currentTimeMillis(), csfi.a());
                gsnm gsnm0 = crvw.c().e(csli.g(this.getApplicationContext()));
                if(!MobileDataPlanSettingsChimeraActivity.u(gsnm0)) {
                    ((ggtj)MobileDataPlanSettingsChimeraActivity.j.j()).x("Trying to launch support page when there is no support object!");
                    gsnm0 = MobileDataPlanSettingsChimeraActivity.a(this);
                }
                ca ca0 = new ca(this.getSupportFragmentManager());
                csat csat0 = new csat();
                csat0.a = gsnm0;
                ca0.G(0x7F0B0E66, csat0);  // id:carrier_support_page_placeholder
                ca0.j = 0x1003;
                ca0.w(null);
                ca0.a();
                this.getSupportFragmentManager().aq();
                this.findViewById(0x7F0B0FE5).setVisibility(8);  // id:content_layout
                this.setTitle(this.getString(0x7F152FCB, new Object[]{this.l.g()}));  // string:support_menu_item "%s support"
                this.invalidateOptionsMenu();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
        if(this.r) {
            Level level0 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level0).x("Skipping onPause after eSIM started.");
            return;
        }
        if(!hvkk.e() || !this.m) {
            crxn.c().Q(15, null, null, hhct.aF, System.currentTimeMillis(), csfi.a());
        }
        this.l.B = false;
        if(!this.m) {
            MobileDataPlanSettingsChimeraActivity.n = true;
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onPrepareOptionsMenu(Menu menu0) {
        if(this.r) {
            Level level0 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level0).x("Skipping onPrepareOptionsMenu after eSIM started.");
            return false;
        }
        String s = csli.g(this.getApplicationContext());
        this.r();
        crvw.c().F(s);
        hvjk.g();
        crvw.c().e(s);
        this.l.g();
        int v = 0;
        while(true) {
            boolean z = true;
            if(v >= menu0.size()) {
                break;
            }
            MenuItem menuItem0 = menu0.getItem(v);
            if(menuItem0.getTitle() == "Stop sharing plan") {
                if(this.r() || !crvw.c().F(s) || !hvko.C() || crvw.u()) {
                    z = false;
                }
                menuItem0.setVisible(z);
            }
            else if(menuItem0.getTitle() == "%s support") {
                if(!this.r()) {
                    if(crvw.c().F(s)) {
                    label_28:
                        if(hvjk.g() && MobileDataPlanSettingsChimeraActivity.u(crvw.c().e(s)) && !this.l.g().isEmpty()) {
                            menuItem0.setVisible(true);
                            menuItem0.setTitle(String.format("%s support", this.l.g()));
                            goto label_33;
                        }
                    }
                    else {
                        crvw crvw0 = crvw.c();
                        if(crvw.u() && crvw0.l() != null) {
                            hhcr hhcr0 = hhcr.b(crvw0.l().g);
                            if(hhcr0 == null) {
                                hhcr0 = hhcr.k;
                            }
                            if(hhcr0 == hhcr.i) {
                                goto label_28;
                            }
                        }
                    }
                }
                menuItem0.setVisible(false);
            }
        label_33:
            ++v;
        }
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    protected final void onRestart() {
        super.onRestart();
        if(this.r) {
            Level level0 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level0).x("Recreating activity in onRestart after eSIM started.");
            this.recreate();
            return;
        }
        if(MobileDataPlanSettingsChimeraActivity.n) {
            csfi.b();
            MobileDataPlanSettingsChimeraActivity.n = false;
        }
        this.n(false, this.o);
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(this.r) {
            Level level0 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level0).x("Skipping onResume after eSIM started.");
            return;
        }
        if(MobileDataPlanSettingsChimeraActivity.n) {
            csfi.b();
            MobileDataPlanSettingsChimeraActivity.n = false;
        }
        boolean z = true;
        this.l.B = true;
        this.o = false;
        new crxu().l();
        if(!this.m && !this.r()) {
            csdj csdj0 = this.l;
            if(this.findViewById(0x7F0B1D47).getVisibility() != 0) {  // id:progress_loader
                z = false;
            }
            csdj0.q(z);
        }
        this.m = false;
    }

    public final void p(Exception exception0) {
        crxn.c().Q(14, null, null, hhct.aE, System.currentTimeMillis(), csfi.a());
        csfg csfg0 = csfg.a(exception0);
        Level level0 = cslm.h();
        ((ggtj)MobileDataPlanSettingsChimeraActivity.j.g(level0).s(exception0)).B("Showing error page for error message %s", csfg0);
        crxn.c().Q(25, csfg0.toString(), "R.id.error_layout", hhct.aU, System.currentTimeMillis(), csfi.a());
        this.o(csfg0);
    }

    final boolean q(Intent intent0) {
        if(intent0 == null) {
            return true;
        }
        String s = intent0.getAction();
        if(!Objects.equals(s, "android.intent.action.VIEW")) {
            return true;
        }
        Uri uri0 = intent0.getData();
        bboh bboh0 = MobileDataPlanSettingsChimeraActivity.j;
        ((ggtj)bboh0.h()).B("uri %s", s);
        if(uri0 == null) {
            ((ggtj)bboh0.j()).x("No URI passed in through deeplink intent");
            return true;
        }
        List list0 = uri0.getPathSegments();
        if(list0.size() != 2) {
            ((ggtj)bboh0.h()).B("eSIM single path segment: %s", list0.get(0));
            return true;
        }
        String s1 = (String)list0.get(0);
        ((ggtj)bboh0.h()).B("eSIM subpath segment : %s", s1);
        if(!s1.equals("esim")) {
            return true;
        }
        try {
            long v = Long.parseLong(((String)list0.get(1)));
            Long long0 = v;
            hvlq hvlq0 = hvlq.a;
            if(!hvlq0.d().b().b.contains(long0)) {
                throw new IllegalArgumentException("Invalid carrier id passed into eSIM flow");
            }
            ((ggtj)bboh0.h()).B("eSIM flow launched with carrier: %d", long0);
            long0.getClass();
            Optional optional0 = Optional.ofNullable(uri0.getQuery());
            String s2 = UUID.randomUUID().toString();
            Intent intent1 = new Intent("com.google.android.gms.mobiledataplan.ui.ESIM").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity").addFlags(0x20000000);
            intent1.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
            intent1.putExtra("esim_carrier_id", v);
            Optional optional1 = Optional.empty();
            Optional optional2 = Optional.empty();
            if(optional0.isPresent()) {
                String s3 = (String)optional0.get();
                UrlQuerySanitizer urlQuerySanitizer0 = new UrlQuerySanitizer();
                urlQuerySanitizer0.registerParameters(((String[])Collection.-EL.stream(hvlq0.d().c().b).toArray(new csej())), UrlQuerySanitizer.getUrlLegal());
                urlQuerySanitizer0.setPreferFirstRepeatedParameter(true);
                urlQuerySanitizer0.parseQuery(s3);
                Bundle bundle0 = new Bundle();
                for(Object object0: urlQuerySanitizer0.getParameterList()) {
                    UrlQuerySanitizer.ParameterValuePair urlQuerySanitizer$ParameterValuePair0 = (UrlQuerySanitizer.ParameterValuePair)object0;
                    if(!bundle0.containsKey(urlQuerySanitizer$ParameterValuePair0.mParameter)) {
                        bundle0.putString(urlQuerySanitizer$ParameterValuePair0.mParameter, urlQuerySanitizer$ParameterValuePair0.mValue);
                    }
                }
                intent1.putExtra("esim_entry_tags", bundle0);
                if(hvlq.r()) {
                    optional1 = Optional.ofNullable(bundle0.getString("plan_segment_id"));
                    optional2 = Optional.ofNullable(bundle0.getString("plan_subsegment_id"));
                }
            }
            crxn.c().r(hhct.eg, s2, optional1, optional2, v);
            if(!hvlq.m()) {
                Bundle bundle1 = intent1.getExtras();
                this.g(hhct.dy, bundle1, s2);
                ((ggtj)bboh0.j()).x("Device does not have eSIM features enabled");
                return false;
            }
            Long long1 = v;
            if(s2 == null) {
                throw new IllegalArgumentException("Gcore eSIM Registration arguments are not set properly");
            }
            long1.getClass();
            crzc crzc0 = new crzc(this, v, s2);
            crxn.c().q(hhct.dO, s2, optional1, optional2, v, 0L);
            cseh cseh0 = new cseh(this, s2, optional1, optional2, v, intent1);
            new bblp(1, 9).execute(new crzb(crzc0, cseh0));
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Bundle bundle2 = new Bundle();
            this.g(hhct.dE, bundle2, "uninitialized");
            a.e(MobileDataPlanSettingsChimeraActivity.j.j(), "Invalid url for eSIM: %s", uri0, illegalArgumentException0);
        }
        return false;
    }

    public final boolean r() {
        return this.findViewById(0x7F0B129B).getVisibility() == 0;  // id:error_screen_flipper
    }

    final void s(Intent intent0) {
        int v2;
        hhct hhct0;
        if(intent0 == null) {
            return;
        }
        if(intent0.getExtras() == null) {
            ((ggtj)MobileDataPlanSettingsChimeraActivity.j.i()).x("Expected intent extras field is null.");
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            Level level0 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level0).x("handlePurchasePlanActivation did not find required action.");
            return;
        }
        if(!s.equals("com.google.android.gms.mobiledataplan.ui.PURCHASE_PLAN_ACTIVATION")) {
            Level level1 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level1).B("handlePurchasePlanActivation did not find the expected action. Received: %s", s);
            return;
        }
        PurchasePlanActivation purchasePlanActivation0 = (PurchasePlanActivation)intent0.getExtras().getParcelable("PURCHASE_PLAN_ACTIVATION");
        if(purchasePlanActivation0 == null) {
            Level level2 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level2).x("Optional PurchasePlanAction status is not present.");
            return;
        }
        List list0 = csdj.a;
        int v = list0.size() - 1;
        boolean z = false;
        while(v >= 0) {
            if(((PurchasePlanActivation)list0.get(v)).b.equals(purchasePlanActivation0.b)) {
                list0.remove(v);
                z = true;
            }
            --v;
        }
        if(z) {
            this.l.q(true);
            int v1 = purchasePlanActivation0.c;
            if(v1 == 2) {
                hhct0 = hhct.dq;
                v2 = 84;
                crxn.c().Q(v2, "refresh_button", "R.id.refresh", hhct0, System.currentTimeMillis(), csfi.a());
                return;
            }
            if(v1 == 3) {
                hhct0 = hhct.dr;
                v2 = 85;
                crxn.c().Q(v2, "refresh_button", "R.id.refresh", hhct0, System.currentTimeMillis(), csfi.a());
                return;
            }
            Level level3 = cslm.h();
            MobileDataPlanSettingsChimeraActivity.j.g(level3).X("purchasePlanActivation updated, but has an unexpected state. TransactionID: %s, PlanId: %s, state: %s", purchasePlanActivation0.a, purchasePlanActivation0.b, Integer.valueOf(purchasePlanActivation0.c));
            return;
        }
        Level level4 = cslm.h();
        MobileDataPlanSettingsChimeraActivity.j.g(level4).R("purchasePlanActivation is unknown. TransactionID: %s, PlanId: %s", purchasePlanActivation0.a, purchasePlanActivation0.b);
    }

    private final void t(Intent intent0) {
        Optional optional0;
        if(hvlq.j()) {
            if(intent0 == null) {
                optional0 = Optional.empty();
            }
            else if(intent0.getExtras() == null) {
                ((ggtj)MobileDataPlanSettingsChimeraActivity.j.i()).x("Expected intent extras field is null.");
                optional0 = Optional.empty();
            }
            else if(intent0.getExtras().containsKey("NOTIFICATION_LOGGING_CAMPAIGN_ID")) {
                String s = intent0.getExtras().getString("NOTIFICATION_LOGGING_CAMPAIGN_ID");
                optional0 = TextUtils.isEmpty(s) ? Optional.empty() : Optional.of(s);
            }
            else {
                optional0 = Optional.empty();
            }
            if(optional0.isPresent()) {
                Level level0 = cslm.h();
                MobileDataPlanSettingsChimeraActivity.j.g(level0).B("ChimeraActivity sets campaignId: %s", optional0.get());
                this.l.r(((String)optional0.get()));
            }
        }
    }

    private static final boolean u(gsnm gsnm0) {
        return gsnm0 == null ? false : !gsnm0.b.isEmpty() || gsnm0.d.size() != 0;
    }
}


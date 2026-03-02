package com.google.android.gms.nearby.discovery.fastpair;

import ProtoLiteMessage;
import android.accounts.Account;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bbll;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.libraries.bluetooth.fastpair.ProviderInfo;
import cust;
import cutr;
import cwfa;
import cwif;
import cwio;
import cwip;
import cwir;
import cwis;
import cwit;
import cwtr;
import cwtt;
import cwug;
import cwus;
import cwuy;
import cwvb;
import cwve;
import cwvg;
import cwvi;
import cwwy;
import cwza;
import cxdj;
import cxdk;
import cxfa;
import cxfb;
import cxgk;
import cxjs;
import cxlb;
import cxld;
import cxlk;
import cxlm;
import gfqz;
import gfta;
import gftb;
import ggtj;
import gzbc;
import hftc;
import hfur;
import hvpg;
import hvpp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jwh;
import kex;
import kfv;
import xni;

@GmsCoreVeId(0x3FB90)
public class HalfSheetChimeraActivity extends xni {
    public cxjs j;
    public cxdk k;
    private ScheduledExecutorService l;
    private ScheduledFuture m;
    private boolean n;
    private boolean o;

    public HalfSheetChimeraActivity() {
        this.n = false;
        this.o = false;
    }

    private final void A(boolean z) {
        Intent intent0 = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        if(this.k != null) {
            cxdk cxdk0 = this.k;
            gftb.check(cxdk0);
            String s = cxdk0.iQ().name();
            intent0.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", "").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", s);
        }
        cutr.d(this, intent0);
        if(this.j != null) {
            Intent intent1 = new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", gfqz.c(this.j.e)).putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", this.getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE")).putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_SHOULD_FORCE_BLOCK", z).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", this.getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", false)).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", this.getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false));
            cxjs cxjs0 = this.j;
            gftb.check(cxjs0);
            Intent intent2 = intent1.putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", cxjs0.l);
            if(this.k != null) {
                cxdk cxdk1 = this.k;
                gftb.check(cxdk1);
                String s1 = cxdk1.iQ().name();
                intent2.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", "").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", s1);
            }
            cutr.d(this, intent2);
        }
    }

    public static Intent a(Context context0, cxjs cxjs0, gzbc gzbc0) {
        return new Intent().setClassName(context0, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", "SPOT").putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", cxjs0.toBytesArray()).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SPOT_FRAGMENT_STATE", gzbc0.F);
    }

    public final Bundle g(byte[] arr_b, String s) {
        cxld cxld0 = HalfSheetChimeraActivity.y(this.getIntent());
        cxlb cxlb0 = HalfSheetChimeraActivity.x(this.getIntent());
        String s1 = gfta.b(HalfSheetChimeraActivity.m(this.getIntent()));
        Account account0 = (Account)this.getIntent().getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT");
        Bundle bundle0 = new Bundle();
        bundle0.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE", cxld0.name());
        bundle0.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", cxlb0.name());
        bundle0.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", s1);
        if(account0 != null) {
            bundle0.putParcelable("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT", account0);
        }
        bundle0.putByteArray("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY", arr_b);
        if(!gfta.c(s)) {
            bundle0.putString("com.google.android.gms.nearby.discovery.fastpair.BLUETOOTH_MAC_ADDRESS", s);
        }
        return bundle0;
    }

    public static cxjs l(Intent intent0) {
        byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cxjs.b), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (cxjs)hftv0;
        }
        catch(hfur hfur0) {
            ((ggtj)cwfa.a.g().s(hfur0)).x("HalfSheetActivity: error happens when pass info to half sheet");
            return null;
        }
    }

    public static String m(Intent intent0) {
        return intent0.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE");
    }

    public final void n() {
        Intent intent0 = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        this.z(intent0);
        cutr.d(this, intent0);
        this.finish();
    }

    // Detected as a lambda impl.
    public final void o() {
        this.A(false);
        this.finish();
    }

    @Override  // xnb
    public final void onBackPressed() {
        super.onBackPressed();
        this.A(false);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        cxdk cxdk1;
        int v1;
        cwug cwug0;
        HalfSheetChimeraActivity halfSheetChimeraActivity0 = this;
        super.onCreate(bundle0);
        cust cust0 = cwfa.a;
        cust0.d().x("HalfSheetActivity: onCreate");
        Intent intent0 = halfSheetChimeraActivity0.getIntent();
        if(intent0.hasExtra("com.google.android.gms.fastpair.spot_provisioned")) {
            boolean z = intent0.getBooleanExtra("com.google.android.gms.fastpair.spot_provisioned", false);
            cust0.d().B("HalfSheetActivity: spot provisioned: %s", Boolean.valueOf(z));
            intent0.putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FRAGMENT_STATE", (z ? cxdj.u : cxdj.v).name());
            if(z) {
                Intent intent1 = new Intent("com.google.android.gms.nearby.ACTION_SPOT_PROVISIONING_FINISHED");
                intent1.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY", halfSheetChimeraActivity0.getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY"));
                halfSheetChimeraActivity0.z(intent1);
                cutr.d(halfSheetChimeraActivity0, intent1);
            }
        }
        if(Build.VERSION.SDK_INT > 35) {
            halfSheetChimeraActivity0.getOnBackPressedDispatcher().c(halfSheetChimeraActivity0, new cwis(halfSheetChimeraActivity0));
        }
        Intent intent2 = halfSheetChimeraActivity0.getIntent();
        cxld cxld0 = HalfSheetChimeraActivity.y(intent2);
    alab1:
        switch(HalfSheetChimeraActivity.x(intent2).ordinal()) {
            case 1: {
                switch(cxld0.ordinal()) {
                    case 1: {
                        cwug0 = new cwug();
                        break alab1;
                    }
                    case 2: {
                        cwug0 = new cwuy();
                        break alab1;
                    }
                    case 3: {
                        cwug0 = new cwvb();
                        break alab1;
                    }
                    case 4: {
                        cwug0 = new cwvi();
                        break alab1;
                    }
                    case 5: {
                        cwug0 = new cwtt();
                        break alab1;
                    }
                    case 6: {
                        cwug0 = new cwtr();
                        break alab1;
                    }
                    case 7: {
                        cwug0 = new cwus();
                        break alab1;
                    }
                    default: {
                        cwug0 = null;
                        break alab1;
                    }
                }
            }
            case 2: {
                cwug0 = cxld0 == cxld.h ? new cwvg() : null;
                break;
            }
            case 3: {
                cwug0 = cxld0 == cxld.h ? new cwus() : null;
                break;
            }
            case 8: {
                cwug0 = cxld0.ordinal() == 1 ? new cwve() : null;
                break;
            }
            default: {
                cwug0 = null;
            }
        }
        if(cwug0 != null && cwug0.d()) {
            cwug0.a = halfSheetChimeraActivity0;
            cust0.d().R("HalfSheetActivityHandlerBase: scalable seeker onCreate %s %s", cwug0.f().name(), cwug0.c().name());
            String s = HalfSheetChimeraActivity.m(cwug0.a.getIntent());
            if(s == null) {
                cust0.d().x("HalfSheetActivityHandlerBase: exit do not have fragment.");
                cwug0.a.finish();
                return;
            }
            cxjs cxjs0 = HalfSheetChimeraActivity.l(cwug0.a.getIntent());
            if(cxjs0 == null) {
                cust0.d().x("HalfSheetActivityHandlerBase: exit do not have scan fast pair store item.");
                cwug0.a.finish();
                return;
            }
            cwug0.c = cwfa.a(cwfa.c(cxjs0.I, cwug0.f()), cxjs0.I);
            cwug0.a.j = cxjs0;
            cwug0.b = cxjs0;
            if(cwug0.e(s, bundle0)) {
                cxdk cxdk0 = cwug0.b(bundle0, s, cwug0.a);
                cwug0.a.k = cxdk0;
                if(cxdk0 == null) {
                    cwug0.c.d().x("HalfSheetActivityHandlerBase: exit since fragment is null.");
                    cwug0.a.finish();
                    return;
                }
            }
            cwug0.a.r();
            cwug0.a.t();
            cwug0.a.setContentView(cwug0.a());
            cwug0.a.q();
            return;
        }
        if(!hvpp.aQ()) {
            cust0.d().x("HalfSheetActivity: exit flag off.");
            halfSheetChimeraActivity0.finish();
            return;
        }
        String s1 = HalfSheetChimeraActivity.m(halfSheetChimeraActivity0.getIntent());
        if(s1 == null) {
            cust0.d().x("HalfSheetActivity: exit do not have fragment.");
            halfSheetChimeraActivity0.finish();
            return;
        }
        cxjs cxjs1 = HalfSheetChimeraActivity.l(halfSheetChimeraActivity0.getIntent());
        halfSheetChimeraActivity0.j = cxjs1;
        if(cxjs1 == null) {
            cust0.d().x("HalfSheetActivity: exit do not have scan fast pair store item.");
            halfSheetChimeraActivity0.finish();
            return;
        }
        switch(s1) {
            case "APP_LAUNCH": {
                halfSheetChimeraActivity0.k = cwwy.y(halfSheetChimeraActivity0.getIntent());
                break;
            }
            case "DEVICE_PAIRING": {
                Intent intent3 = halfSheetChimeraActivity0.getIntent();
                Bundle bundle1 = new Bundle();
                byte[] arr_b = intent3.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
                boolean z1 = intent3.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false);
                boolean z2 = intent3.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", false);
                boolean z3 = intent3.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PAIRING_RESURFACE", false);
                String s2 = intent3.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_TITLE");
                String s3 = intent3.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION");
                Account account0 = (Account)intent3.getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT");
                String s4 = intent3.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CONTENT");
                String s5 = intent3.getStringExtra("EXTRA_CLASSIC_MAC_ADDRESS");
                int v = intent3.getIntExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", 0);
                cust0.f().B("DevicePairingFragment: Half sheet is retroactive %s", Boolean.valueOf(z1));
                if(z1) {
                    Intent intent4 = (Intent)intent3.getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT");
                    if(intent4 != null && account0 != null) {
                        v1 = bundle0 == null ? 1 : 0;
                        bundle1.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT", intent4);
                        bundle1.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT", account0);
                        bundle1.putString("EXTRA_CLASSIC_MAC_ADDRESS", s5);
                        if(hvpg.by()) {
                            bundle1.putParcelable("com.google.android.gms.nearby.discovery.EXTRA_PROVIDER_INFO", ((Parcelable)jwh.a(intent3, "com.google.android.gms.nearby.discovery.EXTRA_PROVIDER_INFO", ProviderInfo.class)));
                        }
                        else {
                            bundle1.putByteArray("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY", intent3.getByteArrayExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY"));
                            bundle1.putString("com.google.android.gms.nearby.discovery.EXTRA_SPOT_PROVISIONING_STATE", intent3.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_SPOT_PROVISIONING_STATE"));
                        }
                        bundle1.putBoolean("com.google.android.gms.nearby.discovery.EXTRA_CONNECTED_OVER_LEA", intent3.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_CONNECTED_OVER_LEA", false));
                        goto label_130;
                    }
                    else {
                        cust0.d().x("HalfSheetActivity: retroactive pair does not have required info");
                        cxdk1 = null;
                    }
                }
                else {
                    v1 = bundle0 == null ? 1 : 0;
                label_130:
                    bundle1.putByteArray("com.google.android.gms.nearby.discovery.HALF_SHEET", arr_b);
                    bundle1.putBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", z1);
                    bundle1.putBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", z2);
                    bundle1.putBoolean("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PAIRING_RESURFACE", z3);
                    bundle1.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT", account0);
                    bundle1.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_TITLE", s2);
                    bundle1.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION", s3);
                    bundle1.putInt("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", v);
                    if(s4 == null) {
                        s4 = "";
                    }
                    bundle1.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_CONTENT", s4);
                    if(1 != v1) {
                        if(bundle0.containsKey("ARG_FRAGMENT_STATE")) {
                            bundle1.putSerializable("ARG_FRAGMENT_STATE", bundle0.getSerializable("ARG_FRAGMENT_STATE"));
                        }
                        if(bundle0.containsKey("android.bluetooth.device.extra.DEVICE")) {
                            bundle1.putParcelable("android.bluetooth.device.extra.DEVICE", bundle0.getParcelable("android.bluetooth.device.extra.DEVICE"));
                        }
                        if(bundle0.containsKey("android.bluetooth.device.extra.PAIRING_KEY")) {
                            bundle1.putInt("android.bluetooth.device.extra.PAIRING_KEY", bundle0.getInt("android.bluetooth.device.extra.PAIRING_KEY"));
                        }
                        if(bundle0.containsKey("SETUP_BUTTON_CLICKED")) {
                            bundle1.putBoolean("SETUP_BUTTON_CLICKED", bundle0.getBoolean("SETUP_BUTTON_CLICKED"));
                        }
                        if(bundle0.containsKey("PAIRING_RESULT")) {
                            bundle1.putBoolean("PAIRING_RESULT", bundle0.getBoolean("PAIRING_RESULT"));
                        }
                        if(bundle0.containsKey("ARG_ALLOW_RETRY")) {
                            bundle1.putBoolean("ARG_ALLOW_RETRY", bundle0.getBoolean("ARG_ALLOW_RETRY"));
                        }
                    }
                    String s6 = intent3.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FRAGMENT_STATE");
                    if(s6 != null) {
                        try {
                            bundle1.putSerializable("ARG_FRAGMENT_STATE", cxdj.a(s6));
                        }
                        catch(IllegalArgumentException | NullPointerException unused_ex) {
                        }
                    }
                    cxdk1 = new cwza();
                    cxdk1.setArguments(bundle1);
                }
                halfSheetChimeraActivity0 = this;
                halfSheetChimeraActivity0.k = cxdk1;
                if(cxdk1 == null) {
                    cwfa.a.d().x("HalfSheetActivity: device pairing fragment has error.");
                    halfSheetChimeraActivity0.finish();
                    return;
                }
                break;
            }
            case "SPOT": {
                if(bundle0 == null) {
                    halfSheetChimeraActivity0.k = cxgk.A(halfSheetChimeraActivity0, halfSheetChimeraActivity0.getIntent());
                }
                break;
            }
            case "WEAR_OS": {
                Intent intent5 = halfSheetChimeraActivity0.getIntent();
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("com.google.android.gms.nearby.discovery.HALF_SHEET", intent5.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET"));
                bundle2.putBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", intent5.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", true));
                bundle2.putBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", intent5.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", false));
                bundle2.putByteArray("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_MANUFACTURER_SPECIFIC_DATA", intent5.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_MANUFACTURER_SPECIFIC_DATA"));
                bundle2.putString("EXTRA_CLASSIC_MAC_ADDRESS", gfta.b(intent5.getStringExtra("EXTRA_CLASSIC_MAC_ADDRESS")));
                bundle2.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_CONTENT", gfta.b(intent5.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CONTENT")));
                bundle2.putString("FINISHED_STATE", intent5.getStringExtra("FINISHED_STATE"));
                bundle2.putInt("android.bluetooth.device.extra.PAIRING_KEY", intent5.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", 0));
                if(bundle0 == null) {
                    bundle2.putSerializable("ARG_FRAGMENT_STATE", cxdj.a);
                    bundle2.putSerializable("ARG_PAIRING_STATE", cxfa.a);
                }
                else {
                    bundle2.putSerializable("ARG_FRAGMENT_STATE", bundle0.getSerializable("ARG_FRAGMENT_STATE"));
                    bundle2.putInt("ARG_PIN_KEY", bundle0.getInt("ARG_PIN_KEY"));
                    bundle2.putSerializable("ARG_PAIRING_STATE", bundle0.getSerializable("ARG_PAIRING_STATE"));
                }
                cxfb cxfb0 = new cxfb();
                cxfb0.setArguments(bundle2);
                halfSheetChimeraActivity0.k = cxfb0;
                break;
            }
            default: {
                cwfa.a.d().x("HalfSheetActivity: there is no valid type for half sheet");
                halfSheetChimeraActivity0.finish();
                return;
            }
        }
        halfSheetChimeraActivity0.r();
        halfSheetChimeraActivity0.t();
        halfSheetChimeraActivity0.setContentView((cwif.F(halfSheetChimeraActivity0.j) ? 0x7F0E0371 : 0x7F0E036C));  // layout:fast_pair_quick_start_half_sheet
        halfSheetChimeraActivity0.q();
    }

    @Override  // xni
    public final void onDestroy() {
        ScheduledFuture scheduledFuture0 = this.m;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        super.onDestroy();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        String s = HalfSheetChimeraActivity.m(this.getIntent());
        if(s != null && s.equals("DEVICE_PAIRING")) {
            cxjs cxjs0 = HalfSheetChimeraActivity.l(intent0);
            if(cxjs0 != null && this.j != null && !cxjs0.l.equals(this.j.l) && cxjs0.e.equals(this.j.e)) {
                cwfa.a.d().x("HalfSheetActivity: possible factory reset happens");
                this.n();
            }
        }
    }

    @Override  // xoi
    public final void onResume() {
        super.onResume();
        this.n = false;
        this.o = false;
        cwfa.a.f().x("HalfSheetActivity: onResume, set userIsLeaving and setHalfSheetShouldResumeAfterLeaving to false.");
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        cxdk cxdk0 = this.k;
        if(cxdk0 != null) {
            cxdk0.onSaveInstanceState(bundle0);
        }
    }

    @Override  // xni
    protected final void onStart() {
        super.onStart();
        cutr.d(this, new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", true));
        PendingIntent pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PENDING_INTENT");
        if(pendingIntent0 != null) {
            cwfa.a.d().x("HalfSheetActivity: sending half sheet pending intent.");
            try {
                pendingIntent0.send();
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                ((ggtj)cwfa.a.e().s(pendingIntent$CanceledException0)).B("Error sending half sheet pending intent: %s", pendingIntent0);
            }
        }
    }

    @Override  // xni
    public final void onStop() {
        if(this.n && !this.o && this.m == null) {
            cwfa.a.f().x("HalfSheetActivity: onStop sendHalfSheetCancelBroadcast.");
            this.A(false);
            this.finish();
        }
        super.onStop();
    }

    @Override  // com.google.android.chimera.android.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.n = true;
        cwfa.a.f().x("HalfSheetActivity: onUserLeaveHint, set userIsLeaving to true.");
    }

    public final void p() {
        this.A(true);
        this.finish();
    }

    public final void q() {
        this.s(true);
        this.findViewById(0x7F0B0E03).setOnClickListener(new cwir());  // id:card
        this.findViewById(0x7F0B0E03).setAccessibilityDelegate(new cwit(this));  // id:card
        TextView textView0 = (TextView)this.findViewById(0x7F0B22E3);  // id:toolbar_title
        if(textView0 == null) {
            cwfa.a.g().x("Unable to configure title TextView.");
            return;
        }
        textView0.setMaxLines(3);
    }

    public final void r() {
        if(this.k == null) {
            return;
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        cxdk cxdk0 = this.k;
        gftb.check(cxdk0);
        ca0.G(0x7F0B14C5, cxdk0);  // id:fragment_container
        ca0.a();
    }

    public final void s(boolean z) {
        cwfa.a.d().B("HalfSheetActivity, enable dismiss by clicking background:%b", Boolean.valueOf(z));
        View view0 = this.findViewById(0x7F0B0C44);  // id:background
        if(z) {
            view0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.A(false);
                this.finish();
            });
        }
        else {
            view0.setOnClickListener(null);
        }
        view0.setClickable(z);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        ((TextView)this.findViewById(0x7F0B22E3)).setText(charSequence0);  // id:toolbar_title
    }

    public final void t() {
        kfv.a(this.getWindow(), false);
        kex.b(this.getWindow().getDecorView(), new cwip(this));
    }

    public final void u() {
        this.o = true;
        cwfa.a.d().x("HalfSheetActivity: setHalfSheetShouldResumeAfterLeaving, set halfSheetShouldResumeAfterLeaving to true.");
    }

    public final void v(int v) {
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B22DB);  // id:toolbar_image
        imageView0.setVisibility(0);
        imageView0.setImageResource(v);
    }

    public final void w(Intent intent0, String s) {
        this.startActivity(intent0);
        Intent intent1 = new Intent("com.google.android.gms.nearby.ACTION_SPOT_PROVISIONING_STARTED");
        intent1.putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", s);
        this.z(intent1);
        cutr.d(this, intent1);
        if(this.l == null) {
            this.l = new bbll(1, 9);
        }
        this.m = ((bbll)this.l).g(new cwio(this), hvpg.a.aY().bb(), TimeUnit.MILLISECONDS);
    }

    private static cxlb x(Intent intent0) {
        return cxlk.a(intent0.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE"));
    }

    private static cxld y(Intent intent0) {
        return cxlm.c(intent0.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE"));
    }

    private final void z(Intent intent0) {
        if(this.k != null) {
            cxdk cxdk0 = this.k;
            gftb.check(cxdk0);
            String s = cxdk0.iQ().name();
            intent0.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", "").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", s);
        }
    }
}


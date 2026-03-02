package com.google.android.gms.backup.d2d.component;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.hardware.usb.UsbAccessory;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import aqql;
import aqxl;
import arcc;
import arcd;
import arce;
import arcf;
import arcg;
import arch;
import arci;
import arcl;
import arfs;
import arrk;
import arrl;
import arrn;
import arro;
import arrp;
import arrq;
import arrt;
import arru;
import arrv;
import arrw;
import arrz;
import arsa;
import arsb;
import bbdg;
import bbic;
import ca;
import ccmq;
import cjmf;
import cliv;
import cliw;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import du;
import gaec;
import gaga;
import gajp;
import gajq;
import gful_cronetEngineProvider;
import gfus;
import ggdy;
import gged_interceptors;
import ggna;
import hkyj;
import hqgk;
import hqhq;
import hqmo;
import hqnd;
import j..util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.UUID;
import jwe;
import jys;
import xob;

@GmsCoreVeId(0x3EE12)
public class D2dSourceChimeraActivity extends xob implements arrk, arrn, arrt, arrz {
    public static final aqql j;
    static final gged_interceptors k;
    static final gged_interceptors l;
    static final gged_interceptors m;
    public arfs n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public arch s;
    public hkyj t;
    public hkyj u;
    public final gful_cronetEngineProvider v;
    private boolean w;
    private final arcl x;
    private final gful_cronetEngineProvider y;

    static {
        D2dSourceChimeraActivity.j = new aqql(new String[]{"D2dSourceChimeraActivity"});
        gged_interceptors gged0 = gged_interceptors.n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.READ_SMS");
        D2dSourceChimeraActivity.k = gged0;
        ggdy ggdy0 = new ggdy();
        ggdy0.k(gged0);
        ggdy0.i("android.permission.ACCESS_MEDIA_LOCATION");
        D2dSourceChimeraActivity.l = ggdy0.h();
        D2dSourceChimeraActivity.m = gged_interceptors.q("android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_CONTACTS", "android.permission.READ_SMS", "android.permission.ACCESS_MEDIA_LOCATION");
    }

    public D2dSourceChimeraActivity() {
        this.w = true;
        this.t = null;
        this.u = hkyj.a;
        this.x = new arcl(this);
        this.y = gfus.a(((gful_cronetEngineProvider)new arcf()));
        this.v = gfus.a(((gful_cronetEngineProvider)new arcg()));
    }

    private final void A() {
        try {
            D2dSourceChimeraActivity.j.j("Calling unregister callbacks.", new Object[0]);
            this.n.i(this.o);
            this.o = null;
        }
        catch(RemoteException unused_ex) {
            D2dSourceChimeraActivity.j.j("Remote exception while trying to unregister; ignoring.", new Object[0]);
        }
    }

    private final boolean B() {
        return Objects.equals(this.getIntent().getAction(), "com.google.android.gms.backup.ACTION_WIFI_D2D");
    }

    public final du a(arch arch0) {
        du du1;
        du du0 = this.getSupportFragmentManager().h(arch0.name());
        if(du0 != null) {
            D2dSourceChimeraActivity.j.j("%s already exists, reusing.", new Object[]{arch0});
            return du0;
        }
        switch(arch0.ordinal()) {
            case 0: {
                du1 = new arrq();
                break;
            }
            case 1: {
                du1 = new arrp();
                this.w(du1);
                break;
            }
            case 2: {
                du1 = new arro();
                break;
            }
            case 3: {
                du1 = new arru();
                this.w(du1);
                break;
            }
            case 4: {
                boolean z = this.s();
                du1 = new arsb();
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("isWifiD2d", z);
                du1.setArguments(bundle0);
                this.w(du1);
                break;
            }
            case 5: {
                boolean z1 = this.s();
                boolean z2 = hqnd.a.c().B();
                String s = this.p;
                arrv arrv0 = new arrv();
                Bundle bundle1 = new Bundle();
                bundle1.putBoolean("isWifiD2d", z1);
                bundle1.putBoolean("shouldUseNewSubText", z2);
                bundle1.putString("target_device_model", s);
                arrv0.setArguments(bundle1);
                du1 = arrv0;
                break;
            }
            case 6: {
                boolean z3 = this.s();
                du1 = new arsa();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isWifiD2d", z3);
                du1.setArguments(bundle2);
                this.w(du1);
                break;
            }
            case 7: {
                boolean z4 = this.s();
                du1 = new arrw();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("isWifiD2d", z4);
                du1.setArguments(bundle3);
                this.w(du1);
                break;
            }
            default: {
                throw new RuntimeException("Unknown fragment tag.");
            }
        }
        D2dSourceChimeraActivity.j.j("Created new %s", new Object[]{arch0});
        return du1;
    }

    public final void b() {
        this.n(new arce(this));
    }

    @Override  // arrk
    public final void c() {
        this.n(new arcc(this));
        this.p();
    }

    @Override  // arrt
    public final void f() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("is_transferring", false);
        arrl arrl0 = new arrl();
        arrl0.setArguments(bundle0);
        arrl0.show(this.getSupportFragmentManager(), "DIALOG");
    }

    @Override  // arrt
    public final void g() {
        this.o(arch.e);
        this.n(new arcd(this));
    }

    @Override  // arrn
    public final void h() {
    }

    @Override  // arrn
    public final void i() {
        D2dSourceChimeraActivity.j.f("The screen lock failed", new Object[0]);
    }

    @Override  // arrn
    public final void l() {
        if(this.n != null) {
            this.b();
            return;
        }
        D2dSourceChimeraActivity.j.j("onScreenUnlocked() was called before the service is bound,saving the unlocked state.", new Object[0]);
        this.r = true;
    }

    @Override  // arrz
    public final void m() {
        this.p();
    }

    public final void n(arci arci0) {
        try {
            if(this.n != null) {
                arci0.a();
                return;
            }
            D2dSourceChimeraActivity.j.f("Unable to call method because boundServiceInterface is null. Raise a bug.", new Object[0]);
        }
        catch(RemoteException remoteException0) {
            D2dSourceChimeraActivity.j.g("Unexpected remote exception; aborting migration: ", remoteException0, new Object[0]);
        }
        D2dSourceChimeraActivity.j.f("Unable to call service; killing activity.", new Object[0]);
        this.p();
    }

    public final void o(arch arch0) {
        this.s = arch0;
        du du0 = this.a(arch0);
        if(du0.isVisible()) {
            D2dSourceChimeraActivity.j.d(arch0 + " is already visible, reusing.", new Object[0]);
            return;
        }
        if(this.w) {
            D2dSourceChimeraActivity.j.m("Activity is paused; ignoring fragment change.", new Object[0]);
            return;
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.z(0x7F0B2082, du0, arch0.name());  // id:source_main_container
        ca0.a();
        D2dSourceChimeraActivity.j.j("Changing the visible fragment to %s", new Object[]{arch0});
    }

    @Override  // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme resources$Theme0, int v, boolean z) {
        if(gaec.x(this) && gaec.B(this)) {
            D2dSourceChimeraActivity.j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            resources$Theme0.applyStyle(0x7F160289, true);  // style:BcStyleThemeOverlay
        }
        else {
            D2dSourceChimeraActivity.j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            resources$Theme0.applyStyle(0x7F160440, true);  // style:HeavyThemeOverlay
        }
        super.onApplyThemeResource(resources$Theme0, v, z);
    }

    @Override  // xnb
    public final void onBackPressed() {
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.mj);
        aqql aqql0 = D2dSourceChimeraActivity.j;
        aqql0.j("onCreate", new Object[0]);
        super.onCreate(bundle0);
        if(hqgk.a.b().a()) {
            this.setTheme(gajp.b(this));
            boolean z = gaec.y(this);
            if(z) {
                int v = gajp.a(this);
                if(v == 0) {
                    aqxl.a.j("Error occurred on getting dynamic color theme.", new Object[0]);
                }
                else {
                    this.setTheme(v);
                }
            }
            aqxl.a.j("dynamicColorApplied: %s", new Object[]{Boolean.valueOf(z)});
        }
        else {
            int v1 = gaec.x(this);
            gajq.d();
            this.setTheme(new gajq(gajp.b(this), ((boolean)v1)).c(this.getIntent().getStringExtra("theme"), ((boolean)(v1 ^ 1))));
            if(gaec.y(this)) {
                this.setTheme(gajp.a(this));
            }
        }
        this.v();
        if(this.B() && !hqnd.d()) {
            aqql0.h("Launched for wifi d2d but feature is disabled by flag. Finishing.", new Object[0]);
            this.finish();
            return;
        }
        if(jys.c()) {
            aqql0.d("Not disabling NFC for Android U and above", new Object[0]);
        }
        else if(cjmf.b(this, "android.permission.NFC") == 0) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(this);
            if(nfcAdapter0 != null) {
                aqql0.d("Disabling NFC for d2d source device", new Object[0]);
                try {
                    cliv[] arr_cliv = new cliv[3];
                    arr_cliv[0] = new cliv(NdefMessage.class, null);
                    Activity activity0 = this.getContainerActivity();
                    arr_cliv[1] = new cliv(Activity.class, activity0);
                    arr_cliv[2] = new cliv(Activity[].class, new Activity[0]);
                    cliw.b(NfcAdapter.class, "setNdefPushMessage", nfcAdapter0, arr_cliv);
                }
                catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException exception0) {
                    D2dSourceChimeraActivity.j.d("Unable to disable NFC for d2d source device " + ((ReflectiveOperationException)exception0).toString(), new Object[0]);
                }
            }
        }
        else {
            aqql0.d("Unable to disable NFC for d2d source device because NFC permission is not granted.", new Object[0]);
        }
        this.setContentView(this.getLayoutInflater().inflate(0x7F0E09FC, null));  // layout:source_activity
        hqhq hqhq0 = hqhq.a;
        if(!hqhq0.j().ad()) {
            this.setRequestedOrientation(1);
        }
        gaga.f(this.getWindow(), false);
        this.getWindow().addFlags(0x80);
        this.p = "new device";
        if(bundle0 == null) {
            this.s = this.s() ? arch.e : arch.b;
        }
        else {
            this.s = (arch)Enum.valueOf(arch.class, bundle0.getString("current_fragment", arch.b.name()));
            if(bundle0.isEmpty()) {
                D2dSourceChimeraActivity.j.h("Activity is restored with an empty savedInstanceState bundle.", new Object[0]);
            }
        }
        if(bundle0 != null) {
            D2dSourceChimeraActivity.j.j("Activity is restored with non empty saved instance state.", new Object[0]);
            this.t = (hkyj)bundle0.getSerializable("connection_type");
        }
        else if((this.getIntent().getFlags() & 0x100000) != 0) {
            D2dSourceChimeraActivity.j.j("Activity is launched from history, not starting the protocol.", new Object[0]);
            this.t = null;
        }
        else if(!this.r()) {
            if(this.B()) {
                if(this.getIntent().getBooleanExtra("com.google.android.gms.backup.LAUNCHED_FROM_NOTIFICATION", false)) {
                    D2dSourceChimeraActivity.j.h("Activity is created by wifi d2d intent from notification", new Object[0]);
                }
                else {
                    D2dSourceChimeraActivity.j.h("Activity is created by wifi d2d intent.", new Object[0]);
                }
                this.t = hkyj.c;
            }
            else {
                D2dSourceChimeraActivity.j.h("Activity is launched by a general intent, not starting the protocol.", new Object[0]);
                this.t = null;
            }
        }
        else if(((Boolean)this.y.mr()).booleanValue()) {
            D2dSourceChimeraActivity.j.j("Activity is created via adb for e2e testing. Not Starting protocol yet.", new Object[0]);
            this.t = null;
        }
        else {
            D2dSourceChimeraActivity.j.h("Activity is created by attaching the cable.", new Object[0]);
            this.t = hkyj.b;
        }
        if(hqhq0.j().aS() && this.s != arch.g) {
            this.y();
        }
    }

    @Override  // xoi
    protected final void onDestroy() {
        D2dSourceChimeraActivity.j.j("onDestroy", new Object[0]);
        super.onDestroy();
        this.q();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        Object[] arr_object = {intent0.getAction()};
        D2dSourceChimeraActivity.j.j("onNewIntent. Action=%s", arr_object);
        this.q();
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        this.v();
        if(this.B()) {
            this.t = hkyj.c;
        }
        else if(this.r()) {
            this.t = hkyj.b;
        }
        this.y();
    }

    @Override  // xoi
    protected final void onPause() {
        D2dSourceChimeraActivity.j.j("onPause", new Object[0]);
        this.w = true;
        super.onPause();
    }

    @Override  // xoi
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        if(v != 0) {
            D2dSourceChimeraActivity.j.m("unhandled onRequestPermissionsResult() " + v, new Object[0]);
            return;
        }
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(arr_v[v1] == 0) {
                D2dSourceChimeraActivity.j.d("onRequestPermissionsResult() Permission granted: %s", new Object[]{arr_s[v1]});
            }
            else {
                D2dSourceChimeraActivity.j.d("onRequestPermissionsResult() Permission denied: %s", new Object[]{arr_s[v1]});
            }
        }
        this.x();
    }

    @Override  // xoi
    protected final void onResume() {
        D2dSourceChimeraActivity.j.j("onResume", new Object[0]);
        this.w = false;
        super.onResume();
        this.o(this.s);
    }

    @Override  // xnb
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putSerializable("connection_type", this.t);
        bundle0.putString("current_fragment", this.s.name());
        super.onSaveInstanceState(bundle0);
    }

    public final void p() {
        D2dSourceChimeraActivity.j.h("Stopping service.", new Object[0]);
        Intent intent0 = D2dSourceChimeraService.a(this);
        intent0.putExtra("stop_service", true);
        this.startService(intent0);
        this.finishAndRemoveTask();
    }

    public final void q() {
        if(hqhq.a.j().Z()) {
            if(this.n != null && this.q) {
                this.A();
            }
            if(this.q) {
                this.z();
            }
            this.q = false;
            return;
        }
        if(this.n == null) {
            D2dSourceChimeraActivity.j.d("mBoundServiceInterface already null; not unbinding.", new Object[0]);
            return;
        }
        this.A();
        this.z();
    }

    public final boolean r() {
        return !Objects.equals(this.getIntent().getAction(), "android.hardware.usb.action.USB_ACCESSORY_ATTACHED") || !this.getIntent().hasExtra("accessory") ? ((Boolean)this.y.mr()).booleanValue() && !Objects.equals(this.u, hkyj.c) : true;
    }

    public final boolean s() {
        return ((Boolean)this.v.mr()).booleanValue() ? this.u == hkyj.c : this.B();
    }

    public static void t(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        d2dSourceChimeraActivity0.t = null;
    }

    public static final boolean u(UsbAccessory usbAccessory0) {
        return usbAccessory0 != null && Objects.equals(usbAccessory0.getSerial(), hqhq.a.j().V());
    }

    private final void v() {
        if(!((Boolean)this.v.mr()).booleanValue()) {
            return;
        }
        if(this.B()) {
            this.u = hkyj.c;
            return;
        }
        if(this.r()) {
            if(D2dSourceChimeraActivity.u(((UsbAccessory)this.getIntent().getParcelableExtra("accessory")))) {
                this.u = hkyj.c;
                return;
            }
            this.u = hkyj.b;
            return;
        }
        D2dSourceChimeraActivity.j.m("Activity is launched by a general intent, flow type is set to unspecified.", new Object[0]);
        this.u = hkyj.a;
    }

    private final void w(du du0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("target_device_model", this.p);
        du0.setArguments(bundle0);
    }

    private final void x() {
        aqql aqql0 = D2dSourceChimeraActivity.j;
        aqql0.j("Starting the service and binding to it.", new Object[0]);
        if(this.o != null) {
            aqql0.m("uuidForServiceCallbacksRegister is not null. The service resources might have not been freed correctly!", new Object[0]);
        }
        this.o = UUID.randomUUID().toString();
        Intent intent0 = this.s() ? D2dSourceChimeraService.a(this).putExtra("is_wifi_d2d", true) : D2dSourceChimeraService.a(this);
        this.startService(intent0);
        bbic.a().d(this, intent0, this.x, 1);
        this.q = true;
    }

    private final void y() {
        if(hqmo.a.b().b()) {
            HashSet hashSet0 = new HashSet();
            gged_interceptors gged0 = Build.VERSION.SDK_INT < 33 || !hqhq.t() ? D2dSourceChimeraActivity.l : D2dSourceChimeraActivity.m;
            for(int v = 0; v < ((ggna)gged0).c; ++v) {
                String s = (String)gged0.get(v);
                if(cjmf.b(this, s) != 0) {
                    hashSet0.add(s);
                }
            }
            if(hashSet0.isEmpty()) {
                D2dSourceChimeraActivity.j.d("All required permissions granted, proceeding.", new Object[0]);
                this.x();
                return;
            }
            D2dSourceChimeraActivity.j.d("%s permissions not granted, requesting permissions.", new Object[]{hashSet0});
            jwe.e(this.getContainerActivity(), ((String[])hashSet0.toArray(new String[hashSet0.size()])), 0);
            return;
        }
        this.x();
    }

    private final void z() {
        D2dSourceChimeraActivity.j.d("Unbinding service", new Object[0]);
        try {
            bbic.a().b(this, this.x);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            D2dSourceChimeraActivity.j.l(exception0);
        }
    }
}


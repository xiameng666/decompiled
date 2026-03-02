package com.google.android.gms.trustagent.activeunlock.primary.data.proximity;

import android.content.Intent;
import bayn;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import evuh;
import exeg;
import exjm;
import exjx;
import exkh;
import exki;
import exod;
import exwm;
import exwo;
import exwp;
import exwv;
import exyg;
import eybb;
import eybg;
import eybh;
import eybi;
import eybk;
import eybm;
import ggtj;
import glyb;
import ibnx;
import ibom;
import ibrl;
import ibrx;
import ibuq;
import icbb;
import iccs;
import j..time.Duration;

public class ProximityIntentOperation extends IntentOperation {
    public static final Duration a;
    public static final Duration b;
    public Lazy c;
    public Lazy d;
    public exki e;
    public bboh f;
    private final bayn g;

    static {
        ProximityIntentOperation.a = glyb.f(2);
        ProximityIntentOperation.b = glyb.f(6);
    }

    public ProximityIntentOperation() {
        bayn bayn0 = bayn.f(AppContextProvider.a());
        ibuq.c(bayn0);
        this.g = bayn0;
    }

    public final bboh a() {
        bboh bboh0 = this.f;
        if(bboh0 != null) {
            return bboh0;
        }
        ibuq.j("logger");
        return null;
    }

    public final exki b() {
        exki exki0 = this.e;
        if(exki0 != null) {
            return exki0;
        }
        ibuq.j("rangingCapabilityRepository");
        return null;
    }

    public final Lazy c() {
        Lazy lazy0 = this.c;
        if(lazy0 != null) {
            return lazy0;
        }
        ibuq.j("enrolledDeviceRepositoryLazy");
        return null;
    }

    public final Object d(Intent intent0, ibrl ibrl0) {
        exyg exyg0;
        eybh eybh0;
        if((ibrl0 instanceof eybh)) {
            eybh0 = (eybh)ibrl0;
            int v = eybh0.d;
            if((v & 0x80000000) == 0) {
                eybh0 = new eybh(this, ibrl0);
            }
            else {
                eybh0.d = v - 0x80000000;
            }
        }
        else {
            eybh0 = new eybh(this, ibrl0);
        }
        Object object0 = eybh0.b;
        Object object1 = ibrx.a;
        switch(eybh0.d) {
            case 0: {
                ibnx.b(object0);
                String s = ProximityIntentOperation.f(intent0).b;
                if(s == null) {
                    ((ggtj)this.a().j()).x("Updated ConsentedToDowngradeRangingMethod failed for null device");
                    return ibom.a;
                }
                Object object2 = this.c().get();
                ibuq.e(object2, "get(...)");
                eybh0.a = (exyg)object2;
                eybh0.d = 1;
                Object object3 = ((exyg)object2).d(s, eybh0);
                if(object3 == object1) {
                    return object1;
                }
                object0 = object3;
                exyg0 = (exyg)object2;
                goto label_29;
            }
            case 1: {
                exyg0 = (exyg)eybh0.a;
                ibnx.b(object0);
            label_29:
                if(((exwv)object0) != null) {
                    eybh0.a = (exwv)object0;
                    eybh0.d = 2;
                    if(exyg0.l(((exwv)object0), true, eybh0) != object1) {
                        ((ggtj)this.a().h()).B("Updated ConsentedToDowngradeRangingMethod to true for device %s", ((exwv)object0).b);
                        return ibom.a;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                exwv exwv0 = (exwv)eybh0.a;
                ibnx.b(object0);
                ((ggtj)this.a().h()).B("Updated ConsentedToDowngradeRangingMethod to true for device %s", exwv0.b);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object e(Intent intent0, ibrl ibrl0) {
        exod exod1;
        exjx exjx3;
        exwo exwo1;
        exwo exwo0;
        exjx exjx2;
        exwv exwv2;
        exwv exwv1;
        exyg exyg2;
        exwv exwv0;
        exwm exwm0;
        String s1;
        exyg exyg0;
        exjx exjx1;
        eybi eybi0;
        if((ibrl0 instanceof eybi)) {
            eybi0 = (eybi)ibrl0;
            int v = eybi0.g;
            if((v & 0x80000000) == 0) {
                eybi0 = new eybi(this, ibrl0);
            }
            else {
                eybi0.g = v - 0x80000000;
            }
        }
        else {
            eybi0 = new eybi(this, ibrl0);
        }
        Object object0 = eybi0.e;
        Object object1 = ibrx.a;
        switch(eybi0.g) {
            case 0: {
                ibnx.b(object0);
                eybg eybg0 = ProximityIntentOperation.f(intent0);
                String s = eybg0.b;
                exjx exjx0 = eybg0.c;
                this.g.m(eybg0.a, evuh.cv);
                if(s == null) {
                    ((ggtj)this.a().j()).x("Enabling ranging method failed for null device");
                    return ibom.a;
                }
                if(exjx0 == exjx.c) {
                    ((ggtj)this.a().j()).x("Trying to enable unknown ranging method");
                    return ibom.a;
                }
                Object object2 = this.c().get();
                ibuq.e(object2, "get(...)");
                Lazy lazy0 = this.d;
                if(lazy0 == null) {
                    ibuq.j("enablementRepositoryLazy");
                    lazy0 = null;
                }
                Object object3 = lazy0.get();
                ibuq.e(object3, "get(...)");
                eybi0.a = s;
                eybi0.b = exjx0;
                eybi0.c = (exyg)object2;
                eybi0.d = (exwm)object3;
                eybi0.g = 1;
                Object object4 = ((exyg)object2).d(s, eybi0);
                if(object4 == object1) {
                    return object1;
                }
                exjx1 = exjx0;
                exyg0 = (exyg)object2;
                object0 = object4;
                s1 = s;
                exwm0 = (exwm)object3;
                goto label_52;
            }
            case 1: {
                exwm exwm1 = (exwm)eybi0.d;
                exyg exyg1 = (exyg)eybi0.c;
                exjx1 = (exjx)eybi0.b;
                s1 = (String)eybi0.a;
                ibnx.b(object0);
                exwm0 = exwm1;
                exyg0 = exyg1;
            label_52:
                exwv0 = (exwv)object0;
                ConnectionInfo connectionInfo0 = exwv0 == null ? null : exwv0.d;
                if(connectionInfo0 != null) {
                    eybi0.a = s1;
                    eybi0.b = exjx1;
                    eybi0.c = exyg0;
                    eybi0.d = exwm0;
                    eybi0.h = exwv0;
                    eybi0.g = 2;
                    Object object5 = exwm0.a(exjx1, connectionInfo0, exwp.b, eybi0);
                    if(object5 == object1) {
                        return object1;
                    }
                    exyg2 = exyg0;
                    exwv1 = exwv0;
                    object0 = object5;
                    goto label_73;
                }
                goto label_76;
            }
            case 2: {
                exwv1 = eybi0.h;
                exwm0 = (exwm)eybi0.d;
                exyg2 = (exyg)eybi0.c;
                exjx1 = (exjx)eybi0.b;
                s1 = (String)eybi0.a;
                ibnx.b(object0);
            label_73:
                ((ggtj)this.a().h()).R("Enabled %s on turn on clicked on notification, isEnabled %s", exjx1.name(), ((exjm)object0).name());
                exwv0 = exwv1;
                exyg0 = exyg2;
            label_76:
                if(exwv0 == null) {
                    ((ggtj)this.a().j()).R("Cannot find an enrolled device with address %s, do not enable %s", s1, exjx1.name());
                    return ibom.a;
                }
                iccs iccs0 = exwm0.b(exwv0.d, exjx1, exwp.b);
                eybi0.a = exjx1;
                eybi0.b = exyg0;
                eybi0.c = exwv0;
                eybi0.d = null;
                eybi0.h = null;
                eybi0.g = 3;
                Object object6 = iccs0.n(eybi0);
                if(object6 == object1) {
                    return object1;
                }
                exwv2 = exwv0;
                object0 = object6;
                exjx2 = exjx1;
                goto label_98;
            }
            case 3: {
                exwv exwv3 = (exwv)eybi0.c;
                exyg exyg3 = (exyg)eybi0.b;
                exjx2 = (exjx)eybi0.a;
                ibnx.b(object0);
                exwv2 = exwv3;
                exyg0 = exyg3;
            label_98:
                exwo0 = (exwo)object0;
                exod exod0 = exwo0.b;
                if(exod0 != null) {
                    eybi0.a = exjx2;
                    eybi0.b = exwv2;
                    eybi0.c = exwo0;
                    eybi0.d = exod0;
                    eybi0.g = 4;
                    if(exyg0.n(exwv2, exod0, eybi0) != object1) {
                        exwo1 = exwo0;
                        exjx3 = exjx2;
                        exod1 = exod0;
                        ((ggtj)this.a().h()).B("Enabled ranging method state is %s", exkh.c(exod1));
                        exjx2 = exjx3;
                        exwo0 = exwo1;
                        break;
                    }
                    return object1;
                }
                break;
            }
            case 4: {
                exod1 = (exod)eybi0.d;
                exwo1 = (exwo)eybi0.c;
                exwv2 = (exwv)eybi0.b;
                exjx3 = (exjx)eybi0.a;
                ibnx.b(object0);
                ((ggtj)this.a().h()).B("Enabled ranging method state is %s", exkh.c(exod1));
                exjx2 = exjx3;
                exwo0 = exwo1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ggtj)this.a().h()).X("Enabled ranging method %s for device %s, result %s", exjx2.name(), exwv2.b, exwo0.a.name());
        return ibom.a;
    }

    private static final eybg f(Intent intent0) {
        int v = intent0.getIntExtra("extra_enable_ranging_method_notification_id", -1);
        String s = intent0.getStringExtra("extra_device_address");
        exjx exjx0 = exjx.c;
        int v1 = intent0.getIntExtra("extra_device_ranging_method", exjx0.ordinal());
        exjx[] arr_exjx = exjx.values();
        if(v1 >= 0 && v1 < arr_exjx.length) {
            exjx0 = arr_exjx[v1];
        }
        return new eybg(v, s, exjx0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        eybb eybb0 = new eybb();
        this.c = DoubleCheck.a(eybb0.ac);
        this.d = DoubleCheck.a(eybb0.W);
        this.e = (exki)eybb0.V.get();
        this.f = exeg.a();
        this.b().c();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        this.b().d();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0xA122C918: {
                    if(s.equals("com.google.android.gms.trustagent.activeunlock.ACTION_CONFIRM_DOWNGRADE")) {
                        icbb.c(new eybk(this, intent0, null));
                        return;
                    }
                    break;
                }
                case 1225030404: {
                    if(s.equals("com.google.android.gms.trustagent.activeunlock.ACTION_ENABLE_RANGING_METHOD")) {
                        icbb.c(new eybm(this, intent0, null));
                        return;
                    }
                    break;
                }
            }
        }
    }
}


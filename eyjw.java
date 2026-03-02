import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.unlock.falsing.InPocketDetector.InPocketEventListener;
import j..time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class eyjw {
    public final exyg a;
    public final eycb b;
    public final icck c;
    public final bboh d;
    public ibns e;
    public boolean f;
    public final Context g;
    public eyiz h;
    public final eygm i;
    public final eyft j;
    private final gfuv k;
    private final Map l;
    private final eykb m;
    private final eydt n;
    private final eyec o;

    public eyjw(exyg exyg0, gfuv gfuv0, Map map0, eykb eykb0, eycb eycb0, eydt eydt0, eyec eyec0, eygm eygm0, eyft eyft0, icck icck0, bboh bboh0) {
        ibuq.f(eycb0, "proximityRepository");
        ibuq.f(eygm0, "unlockMetricsLoggerFactory");
        ibuq.f(eyft0, "rangingMetricsLoggerFactory");
        super();
        this.a = exyg0;
        this.k = gfuv0;
        this.l = map0;
        this.m = eykb0;
        this.b = eycb0;
        this.n = eydt0;
        this.o = eyec0;
        this.i = eygm0;
        this.j = eyft0;
        this.c = icck0;
        this.d = bboh0;
        this.g = AppContextProvider.a();
        this.h = eyiz.a;
    }

    public final Object a(eyja eyja0, iccs iccs0, eyfr eyfr0, eyce eyce0, exjx exjx0, ibrl ibrl0) {
        ibom ibom0;
        Object object3;
        ibuz ibuz1;
        eyjx eyjx2;
        eyja eyja2;
        eycd eycd0;
        exjx exjx1;
        eyfr eyfr1;
        eyja eyja1;
        eyce eyce1;
        eyjb eyjb0;
        if((ibrl0 instanceof eyjb)) {
            eyjb0 = (eyjb)ibrl0;
            int v = eyjb0.g;
            if((v & 0x80000000) == 0) {
                eyjb0 = new eyjb(this, ibrl0);
            }
            else {
                eyjb0.g = v - 0x80000000;
            }
        }
        else {
            eyjb0 = new eyjb(this, ibrl0);
        }
        Object object0 = eyjb0.e;
        Object object1 = ibrx.a;
        switch(eyjb0.g) {
            case 0: {
                ibnx.b(object0);
                eyjb0.a = eyja0;
                eyjb0.b = eyfr0;
                eyce1 = eyce0;
                eyjb0.c = eyce1;
                eyjb0.d = exjx0;
                eyjb0.g = 1;
                Object object2 = iccs0.n(eyjb0);
                if(object2 == object1) {
                    return object1;
                }
                eyja1 = eyja0;
                object0 = object2;
                eyfr1 = eyfr0;
                exjx1 = exjx0;
                goto label_32;
            }
            case 1: {
                exjx1 = (exjx)eyjb0.d;
                eyce1 = (eyce)eyjb0.c;
                eyfr1 = (eyfr)eyjb0.b;
                eyja1 = (eyja)eyjb0.a;
                ibnx.b(object0);
            label_32:
                eycd0 = (eycd)object0;
                ibuz ibuz0 = new ibuz();
                if(homc.a.j().A()) {
                    eyjx eyjx0 = eyjx.g;
                    if(eyja1.a == eyjx0) {
                        ((ggtj)this.d.h()).x("Logging FAILURE_RPC_TIMEOUT with ranging result");
                        switch(eycd0.ordinal()) {
                            case 0: {
                                eyjx0 = eyjx.aa;
                                break;
                            }
                            case 1: {
                                eyjx0 = eyjx.ab;
                                break;
                            }
                            case 2: {
                                eyjx0 = eyjx.ag;
                                break;
                            }
                            case 3: {
                                eyjx0 = eyjx.ac;
                            }
                        }
                        eyja2 = new eyja(eyjx0, eyja1.b, eyja1.h, eyja1.c, eyja1.d, eyja1.e, eyja1.f, eyja1.g);
                        goto label_81;
                    }
                    goto label_49;
                }
                else {
                label_49:
                    eyjx eyjx1 = eyjx.a;
                    if(eyja1.a == eyjx1) {
                        switch(eycd0.ordinal()) {
                            case 0: {
                                eyjx2 = eyjx1;
                                break;
                            }
                            case 1: {
                                eyjx2 = eyjx.j;
                                break;
                            }
                            case 2: {
                                eyjx2 = eyjx.ah;
                                break;
                            }
                            case 3: {
                                eyjx2 = eyjx.k;
                                break;
                            }
                            case 4: {
                                eyjx2 = eyjx.F;
                                break;
                            }
                            case 5: {
                                eyjx2 = eyjx.H;
                                break;
                            }
                            case 6: {
                                eyjx2 = eyjx.R;
                                break;
                            }
                            case 7: {
                                eyjx2 = eyjx.S;
                                break;
                            }
                            case 8: {
                                eyjx2 = eyjx.T;
                                break;
                            }
                            case 9: {
                                eyjx2 = eyjx.Z;
                                break;
                            }
                            case 10: {
                                eyjx2 = eyjx.U;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        if(eyjx2 == eyjx1) {
                            eyja2 = eyja1;
                        }
                        else {
                            ibuz0.a = true;
                            eyja2 = new eyja(eyjx2, eyja1.b, null, null, 0xFC);
                        }
                    }
                    else {
                        eyja2 = eyja1;
                    }
                }
            label_81:
                int v1 = eyja2.a.ordinal();
                if(v1 != 0) {
                    if(v1 == 39 || v1 == 40 || v1 == 41) {
                        eyjb0.a = eyce1;
                        eyjb0.b = eycd0;
                        eyjb0.c = ibuz0;
                        eyjb0.d = eyja2;
                        eyjb0.g = 2;
                        if(this.b.f(eyja1.b, exjx1, eyjb0) == object1) {
                            return object1;
                        }
                    }
                }
                else if(!eyfr1.d.a) {
                    Double double0 = eyfr1.e;
                    if(double0 != null) {
                        double f = (double)double0;
                        Duration duration0 = eyfr1.f;
                        if(duration0 != null) {
                            gzyj gzyj0 = eyfr1.c.e();
                            eyfl.g(eyfr1.a, gzyh.b, f, gzyj0, eyfr1.b, duration0, null, 0x20);
                        }
                    }
                }
                ibuz1 = ibuz0;
                object3 = eyja2;
                goto label_108;
            }
            case 2: {
                object3 = (eyja)eyjb0.d;
                ibuz1 = (ibuz)eyjb0.c;
                eycd eycd1 = (eycd)eyjb0.b;
                eyce1 = (eyce)eyjb0.a;
                ibnx.b(object0);
                eycd0 = eycd1;
            label_108:
                eycd eycd2 = eycd.a;
                boolean z = ibuz1.a;
                eyjb0.a = object3;
                eyjb0.b = null;
                eyjb0.c = null;
                eyjb0.d = null;
                eyjb0.g = 3;
                if((eyce1 instanceof eycp)) {
                    if(homc.l()) {
                        if(z) {
                            icbb.b(iccl.b(cclw.b), null, null, new eyco(eycd0 == eycd2, ((eycp)eyce1), null), 3);
                        }
                        else {
                            ((eycp)eyce1).e.a("Active_Unlock" + (eycd0 == eycd2 ? "_nearby" : "_true_negative"));
                            ((eycp)eyce1).e.c();
                        }
                    }
                    ibom0 = ibom.a;
                    if(ibom0 != object1) {
                        return ibom.a == object1 ? object1 : object3;
                    }
                }
                else {
                    ibom0 = ibom.a;
                }
                return ibom0 == object1 ? object1 : object3;
            }
            case 3: {
                Object object4 = (eyja)eyjb0.a;
                ibnx.b(object0);
                return object4;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(exwv exwv0, ibrl ibrl0) {
        Object object2;
        eyjc eyjc0;
        if((ibrl0 instanceof eyjc)) {
            eyjc0 = (eyjc)ibrl0;
            int v = eyjc0.c;
            if((v & 0x80000000) == 0) {
                eyjc0 = new eyjc(this, ibrl0);
            }
            else {
                eyjc0.c = v - 0x80000000;
            }
        }
        else {
            eyjc0 = new eyjc(this, ibrl0);
        }
        Object object0 = eyjc0.a;
        Object object1 = ibrx.a;
        switch(eyjc0.c) {
            case 0: {
                ibnx.b(object0);
                Context context0 = this.g;
                ibuq.e(context0, "context");
                switch(eyee.a(context0).ordinal()) {
                    case 0: {
                        object2 = eyjx.u;
                        break;
                    }
                    case 1: {
                        object2 = eyjx.v;
                        break;
                    }
                    case 2: {
                        object2 = eyjx.w;
                        break;
                    }
                    case 3: {
                        object2 = eyjx.x;
                        break;
                    }
                    case 4: {
                        object2 = eyjx.y;
                        break;
                    }
                    case 5: 
                    case 6: {
                        object2 = eyjx.a;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                if(object2 == eyjx.a) {
                    if(Settings.Secure.getInt(context0.getContentResolver(), "biometric_keyguard_enabled", 1) == 1) {
                        if(!((BluetoothManager)context0.getSystemService(BluetoothManager.class)).getAdapter().getRemoteDevice(exwv0.e).isConnected()) {
                            return eyjx.z;
                        }
                        eyjc0.c = 1;
                        object0 = this.a.b(exwv0, eyjc0);
                        if(object0 != object1) {
                            return ((Boolean)object0).booleanValue() ? eyjx.t : eyjx.a;
                        }
                        return object1;
                    }
                    return eyjx.B;
                }
                return object2;
            }
            case 1: {
                ibnx.b(object0);
                return ((Boolean)object0).booleanValue() ? eyjx.t : eyjx.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(exwv exwv0, eyja eyja0, ibrl ibrl0) {
        eyjd eyjd0;
        if((ibrl0 instanceof eyjd)) {
            eyjd0 = (eyjd)ibrl0;
            int v = eyjd0.c;
            if((v & 0x80000000) == 0) {
                eyjd0 = new eyjd(this, ibrl0);
            }
            else {
                eyjd0.c = v - 0x80000000;
            }
        }
        else {
            eyjd0 = new eyjd(this, ibrl0);
        }
        Object object0 = eyjd0.a;
        Object object1 = ibrx.a;
        switch(eyjd0.c) {
            case 0: {
                ibnx.b(object0);
                ibuq.e(this.g, "context");
                if(!eyef.a(this.g)) {
                    return ibom.a;
                }
                eyjd0.d = exwv0;
                eyjd0.e = eyja0;
                eyjd0.c = 1;
                object0 = this.a.d(exwv0.e, eyjd0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                eyja0 = eyjd0.e;
                exwv0 = eyjd0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        eyje eyje0 = new eyje(eyja0, ((exwv)object0), this, exwv0, null);
        icbb.b(this.c, null, null, eyje0, 3);
        return ibom.a;
    }

    public final Object d(ibrl ibrl0) {
        eyjh eyjh0;
        if((ibrl0 instanceof eyjh)) {
            eyjh0 = (eyjh)ibrl0;
            int v = eyjh0.c;
            if((v & 0x80000000) == 0) {
                eyjh0 = new eyjh(this, ibrl0);
            }
            else {
                eyjh0.c = v - 0x80000000;
            }
        }
        else {
            eyjh0 = new eyjh(this, ibrl0);
        }
        Object object0 = eyjh0.a;
        Object object1 = ibrx.a;
        switch(eyjh0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.a.p();
                eyjh0.c = 1;
                object0 = icll.a(icig0, eyjh0);
                return object0 == object1 ? object1 : ibpo.T(((List)object0));
            }
            case 1: {
                ibnx.b(object0);
                return ibpo.T(((List)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(exwv exwv0, eygi eygi0, eyce eyce0, exjx exjx0, eyjz eyjz0, ibrl ibrl0) {
        icbr icbr1;
        gfug gfug1;
        eygi eygi1;
        exwv exwv1;
        eyjj eyjj0;
        if((ibrl0 instanceof eyjj)) {
            eyjj0 = (eyjj)ibrl0;
            int v = eyjj0.c;
            if((v & 0x80000000) == 0) {
                eyjj0 = new eyjj(this, ibrl0);
            }
            else {
                eyjj0.c = v - 0x80000000;
            }
        }
        else {
            eyjj0 = new eyjj(this, ibrl0);
        }
        Object object0 = eyjj0.a;
        Object object1 = ibrx.a;
        switch(eyjj0.c) {
            case 0: {
                ibnx.b(object0);
                gfug gfug0 = gfug.c(this.k);
                icbr icbr0 = new icbr();
                icbr0.t(new eyiw(eyjz0, this));
                Duration duration0 = eyiy.a();
                exwv1 = exwv0;
                eygi1 = eygi0;
                eyjm eyjm0 = new eyjm(this, exwv1, eyce0, exjx0, eygi1, icbr0, eyjz0, null);
                eyjj0.d = exwv1;
                eyjj0.e = eygi1;
                eyjj0.f = gfug0;
                eyjj0.g = icbr0;
                eyjj0.c = 1;
                Object object2 = glya.c(duration0, eyjm0, eyjj0);
                if(object2 != object1) {
                    gfug1 = gfug0;
                    object0 = object2;
                    icbr1 = icbr0;
                    goto label_40;
                }
                return object1;
            }
            case 1: {
                icbr1 = eyjj0.g;
                gfug1 = eyjj0.f;
                eygi eygi2 = eyjj0.e;
                exwv exwv2 = eyjj0.d;
                ibnx.b(object0);
                eygi1 = eygi2;
                exwv1 = exwv2;
            label_40:
                Object object3 = (eyja)object0;
                if(object3 == null) {
                    object3 = new eyja(eyjx.l, exwv1, null, null, 0xFC);
                }
                if(object3.a == eyjx.a) {
                    eyjk eyjk0 = new eyjk(gfug1, icbr1, null);
                    icbb.b(this.c, null, null, eyjk0, 3);
                    return object3;
                }
                eyjj0.d = null;
                eyjj0.e = null;
                eyjj0.f = null;
                eyjj0.g = null;
                eyjj0.c = 2;
                Object object4 = this.l(((eyja)object3), icbr1, eygi1, eyjj0);
                return object4 == object1 ? object1 : object4;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object f(exwv exwv0, eygk eygk0, ibrl ibrl0) {
        eygi eygi2;
        eygi eygi1;
        exwv exwv1;
        Object object3;
        eyjn eyjn0;
        if((ibrl0 instanceof eyjn)) {
            eyjn0 = (eyjn)ibrl0;
            int v = eyjn0.e;
            if((v & 0x80000000) == 0) {
                eyjn0 = new eyjn(this, ibrl0);
            }
            else {
                eyjn0.e = v - 0x80000000;
            }
        }
        else {
            eyjn0 = new eyjn(this, ibrl0);
        }
        Object object0 = eyjn0.c;
        Object object1 = ibrx.a;
        switch(eyjn0.e) {
            case 0: {
                ibnx.b(object0);
                ibns ibns0 = this.e;
                if(ibns0 == null) {
                    eyjn0.e = 1;
                    Object object2 = this.h(exwv0, eygk0, eyjn0);
                    return object2 == object1 ? object1 : object2;
                }
                object3 = (iccs)ibns0.a;
                eygi eygi0 = (eygi)ibns0.b;
                if(((iccs)object3).oM()) {
                    eyjn0.a = exwv0;
                    eyjn0.f = eygk0;
                    eyjn0.b = object3;
                    eyjn0.g = eygi0;
                    eyjn0.e = 2;
                    Object object4 = ((iccs)object3).n(eyjn0);
                    if(object4 == object1) {
                        return object1;
                    }
                    exwv1 = exwv0;
                    eygi1 = eygi0;
                    object0 = object4;
                    goto label_44;
                }
                else {
                    eygi2 = eygi0;
                }
                goto label_54;
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                eygi1 = eyjn0.g;
                Object object5 = eyjn0.b;
                eygk eygk1 = eyjn0.f;
                exwv1 = (exwv)eyjn0.a;
                ibnx.b(object0);
                object3 = object5;
                eygk0 = eygk1;
            label_44:
                if(((eyja)object0).a != eyjx.a) {
                    ((ggtj)this.d.h()).x("getUnlockResult");
                    eyjn0.a = null;
                    eyjn0.f = null;
                    eyjn0.b = null;
                    eyjn0.g = null;
                    eyjn0.e = 3;
                    Object object6 = this.h(exwv1, eygk0, eyjn0);
                    return object6 == object1 ? object1 : object6;
                }
                eygi2 = eygi1;
            label_54:
                if(eygi2.e == null) {
                    eygi2.e = eygi2.d.d();
                }
                eyjn0.a = eygi2;
                eyjn0.f = null;
                eyjn0.b = null;
                eyjn0.g = null;
                eyjn0.e = 4;
                object0 = ((iccs)object3).n(eyjn0);
                return object0 == object1 ? object1 : new ibns(object0, eygi2);
            }
            case 3: {
                ibnx.b(object0);
                return object0;
            }
            case 4: {
                eygi2 = (eygi)eyjn0.a;
                ibnx.b(object0);
                return new ibns(object0, eygi2);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(ibrl ibrl0) {
        exwv exwv1;
        eygi eygi1;
        Boolean boolean0;
        eyez eyez1;
        exwv exwv0;
        eyjq eyjq0;
        if((ibrl0 instanceof eyjq)) {
            eyjq0 = (eyjq)ibrl0;
            int v = eyjq0.c;
            if((v & 0x80000000) == 0) {
                eyjq0 = new eyjq(this, ibrl0);
            }
            else {
                eyjq0.c = v - 0x80000000;
            }
        }
        else {
            eyjq0 = new eyjq(this, ibrl0);
        }
        Object object0 = eyjq0.a;
        Object object1 = ibrx.a;
        switch(eyjq0.c) {
            case 0: {
                ibnx.b(object0);
                eyjq0.c = 1;
                object0 = this.d(eyjq0);
                if(object0 != object1) {
                    goto label_19;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(((exwv)object0) == null) {
                    return new eyja(eyjx.m, null, null, null, 0xFE);
                }
                boolean z = this.f;
                if(z) {
                    ((ggtj)this.d.h()).V("requestUnlock responding with FAILURE_PENDING due to isRequesting=%b, distanceBasedRelockStatus=%s", z, this.h);
                    return new eyja(eyjx.n, null, null, null, 0xFE);
                }
                eyiz eyiz0 = this.h;
                eyiz eyiz1 = eyiz.c;
                if(eyiz0 == eyiz1) {
                    ((ggtj)this.d.h()).V("requestUnlock responding with FAILURE_PENDING due to isRequesting=%b, distanceBasedRelockStatus=%s", z, this.h);
                    return new eyja(eyjx.n, null, null, null, 0xFE);
                }
                this.f = true;
                if(eyiz0 == eyiz.b) {
                    this.h = eyiz1;
                }
                eygk eygk0 = this.i.a(((exwv)object0).d);
                eyfl.i(eygk0.a, gzyz.c, eygk0.d, null, null, 508);
                eygg eygg0 = new eygg(eygk0);
                eyez eyez0 = new eyez(eygk0.b, eygg0);
                eyjq0.d = (exwv)object0;
                eyjq0.e = eyez0;
                eyjq0.c = 2;
                Object object2 = this.f(((exwv)object0), eygk0, eyjq0);
                if(object2 != object1) {
                    exwv0 = (exwv)object0;
                    object0 = object2;
                    eyez1 = eyez0;
                    goto label_47;
                }
                return object1;
            }
            case 2: {
                eyez1 = eyjq0.e;
                exwv0 = eyjq0.d;
                ibnx.b(object0);
            label_47:
                eyja eyja0 = (eyja)((ibns)object0).a;
                eygi eygi0 = (eygi)((ibns)object0).b;
                eyjz eyjz0 = eyja0.f;
                if(eyjz0 == null) {
                    boolean0 = null;
                }
                else {
                    boolean0 = eyjz0.b;
                    eyjz0.a.a();
                }
                eyjq0.d = exwv0;
                eyjq0.e = eyez1;
                eyjq0.f = eygi0;
                eyjq0.c = 3;
                if(eyja0.a == eyjx.a && ibuq.m(boolean0, Boolean.valueOf(true))) {
                    icbr icbr0 = eyja0.h;
                    if(icbr0 != null) {
                        icbr0.V(exzh.b);
                    }
                    eyja0 = new eyja(eyjx.A, eyja0.b, null, null, 0xFC);
                }
                if(eyja0 != object1) {
                    eygi1 = eygi0;
                    exwv1 = exwv0;
                    object0 = eyja0;
                    break;
                }
                return object1;
            }
            case 3: {
                eygi1 = eyjq0.f;
                eyez1 = eyjq0.e;
                exwv1 = eyjq0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        eyez1.a(new ibns(((eyja)object0).a, eygi1));
        ((ggtj)this.d.h()).B("Unlock result code=%s", ((eyja)object0).a);
        if(honb.f()) {
            eyjr eyjr0 = new eyjr(this, exwv1, null);
            icbb.b(this.c, null, null, eyjr0, 3);
        }
        return (eyja)object0;
    }

    public final Object h(exwv exwv0, eygk eygk0, ibrl ibrl0) {
        eygi eygi1;
        exwv exwv1;
        eyjw eyjw0;
        eyjs eyjs0;
        if((ibrl0 instanceof eyjs)) {
            eyjs0 = (eyjs)ibrl0;
            int v = eyjs0.e;
            if((v & 0x80000000) == 0) {
                eyjs0 = new eyjs(this, ibrl0);
            }
            else {
                eyjs0.e = v - 0x80000000;
            }
        }
        else {
            eyjs0 = new eyjs(this, ibrl0);
        }
        Object object0 = eyjs0.c;
        Object object1 = ibrx.a;
        switch(eyjs0.e) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)this.d.h()).x("requestUnlockInternal");
                icbr icbr0 = new icbr();
                Duration duration0 = eyiy.a();
                ibuq.f(duration0, "maxRequestDuration");
                eygi eygi0 = new eygi(duration0, eygk0.b, eygk0.c, icbr0);
                eyjw0 = this;
                eyjt eyjt0 = new eyjt(eyjw0, exwv0, icbr0, eygi0, null);
                iccs iccs0 = icbb.a(this.c, null, null, eyjt0, 3);
                ((ggtj)this.d.h()).x("updating inFlightUnlockResult");
                eyjw0.e = new ibns(iccs0, eygi0);
                eyjs0.a = exwv0;
                eyjs0.b = eygi0;
                eyjs0.e = 1;
                object0 = iccs0.n(eyjs0);
                if(object0 != object1) {
                    exwv1 = exwv0;
                    eygi1 = eygi0;
                    eyjs0.a = eygi1;
                    eyjs0.b = (eyja)object0;
                    eyjs0.e = 2;
                    return eyjw0.c(exwv1, ((eyja)object0), eyjs0) != object1 ? new ibns(((eyja)object0), eygi1) : object1;
                }
                return object1;
            }
            case 1: {
                eygi1 = (eygi)eyjs0.b;
                exwv1 = (exwv)eyjs0.a;
                ibnx.b(object0);
                eyjw0 = this;
                eyjs0.a = eygi1;
                eyjs0.b = (eyja)object0;
                eyjs0.e = 2;
                return eyjw0.c(exwv1, ((eyja)object0), eyjs0) != object1 ? new ibns(((eyja)object0), eygi1) : object1;
            }
            case 2: {
                eyja eyja0 = (eyja)eyjs0.b;
                eygi1 = (eygi)eyjs0.a;
                ibnx.b(object0);
                return new ibns(eyja0, eygi1);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object i(exwv exwv0, ibrl ibrl0) {
        Map map0;
        eyjv eyjv0;
        if((ibrl0 instanceof eyjv)) {
            eyjv0 = (eyjv)ibrl0;
            int v = eyjv0.c;
            if((v & 0x80000000) == 0) {
                eyjv0 = new eyjv(this, ibrl0);
            }
            else {
                eyjv0.c = v - 0x80000000;
            }
        }
        else {
            eyjv0 = new eyjv(this, ibrl0);
        }
        Object object0 = eyjv0.a;
        Object object1 = ibrx.a;
        switch(eyjv0.c) {
            case 0: {
                ibnx.b(object0);
                eyjv0.d = exwv0;
                eyjv0.c = 1;
                object0 = this.n.a(exwv0.d, eyjv0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                exwv0 = eyjv0.d;
                ibnx.b(object0);
            label_21:
                if(((exlu)object0) == null) {
                    map0 = null;
                }
                else {
                    exlr exlr0 = ((exlu)object0).e;
                    if(exlr0 == null) {
                        exlr0 = exlr.a;
                    }
                    if(exlr0 == null) {
                        map0 = null;
                    }
                    else {
                        exmx exmx0 = exlr0.b == null ? exmx.a : exlr0.b;
                        if(exmx0 == null) {
                            map0 = null;
                        }
                        else {
                            hfuo hfuo0 = exmx0.b;
                            if(hfuo0 == null) {
                                map0 = null;
                            }
                            else {
                                map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
                                for(Object object2: hfuo0) {
                                    exog exog0 = exog.b(((exmw)object2).b);
                                    if(exog0 == null) {
                                        exog0 = exog.e;
                                    }
                                    ibuq.e(exog0, "getRangingMethod(...)");
                                    ibns ibns0 = new ibns(exjw.b(exog0), new Integer(((exmw)object2).c));
                                    map0.put(ibns0.a, ibns0.b);
                                }
                            }
                        }
                    }
                }
                if(map0 != null) {
                    eyjv0.d = null;
                    eyjv0.c = 2;
                    Object object3 = this.a.a.n(exwv0.a, map0, eyjv0);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                    if(object3 == object1) {
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void j() {
        ((ggtj)this.d.h()).x("onRequestComplete");
        this.e = null;
        this.f = false;
    }

    public final boolean k(exjv exjv0) {
        if(holo.e()) {
            Duration duration0 = exjv0.b();
            return ibzw.v(ibzw.l(ibzy.i(duration0.getSeconds(), ibzz.d), ibzy.h(duration0.getNano(), ibzz.a))) && this.o.e();
        }
        return false;
    }

    public final Object l(eyja eyja0, icbr icbr0, eygi eygi0, ibrl ibrl0) {
        eyjf eyjf0;
        if((ibrl0 instanceof eyjf)) {
            eyjf0 = (eyjf)ibrl0;
            int v = eyjf0.c;
            if((v & 0x80000000) == 0) {
                eyjf0 = new eyjf(this, ibrl0);
            }
            else {
                eyjf0.c = v - 0x80000000;
            }
        }
        else {
            eyjf0 = new eyjf(this, ibrl0);
        }
        Object object0 = eyjf0.a;
        Object object1 = ibrx.a;
        switch(eyjf0.c) {
            case 0: {
                ibnx.b(object0);
                holg holg0 = holg.a;
                hfuo hfuo0 = holg0.c().d().b;
                eyjx eyjx0 = eyja0.a;
                if(!hfuo0.contains(eyjx0.name())) {
                    icbr0.V(exzh.b);
                    eygi0.a(exjn.b);
                    return eyja0;
                }
                ((ggtj)this.d.h()).B("Requesting AD feedback for unlock result %s", eyjx0);
                icbr icbr1 = new icbr();
                icbr0.V(new exzh(false, icbr1));
                Duration duration0 = glyb.d(holg0.c().a());
                eyjg eyjg0 = new eyjg(icbr1, null);
                eyjf0.d = eyja0;
                eyjf0.e = eygi0;
                eyjf0.c = 1;
                object0 = glya.c(duration0, eyjg0, eyjf0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                eygi0 = eyjf0.e;
                eyja0 = eyjf0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((exzf)object0) != null) {
            eyjx eyjx1 = eyjw.n(((exzf)object0));
            if(eyjx1 == eyjx.a) {
                ((ggtj)this.d.h()).x("Response with AD feedback succeeded, no error, unlock result unchanged");
                eygi0.a(exjn.d);
                return eyja0;
            }
            ((ggtj)this.d.h()).B("Response with AD feedback succeeded, new unlock result = %s", eyjx1);
            eygi0.a(exjn.e);
            return new eyja(eyjx1, eyja0.b, null, null, 0xFC);
        }
        ((ggtj)this.d.j()).x(" Failed to get a valid response from AD feedback ");
        eygi0.a(exjn.c);
        return eyja0;
    }

    public final Object m(exwv exwv0, icbr icbr0, ibrl ibrl0) {
        eyjx eyjx3;
        eyjx eyjx0;
        icbr icbr3;
        exwv exwv3;
        Object object2;
        icbr icbr1;
        eyju eyju0;
        exwv exwv1 = exwv0;
        if((ibrl0 instanceof eyju)) {
            eyju0 = (eyju)ibrl0;
            int v = eyju0.c;
            if((v & 0x80000000) == 0) {
                eyju0 = new eyju(this, ibrl0);
            }
            else {
                eyju0.c = v - 0x80000000;
            }
        }
        else {
            eyju0 = new eyju(this, ibrl0);
        }
        Object object0 = eyju0.a;
        Object object1 = ibrx.a;
        switch(eyju0.c) {
            case 0: {
                ibnx.b(object0);
                eyju0.d = exwv1;
                icbr1 = icbr0;
                eyju0.f = icbr1;
                eyju0.c = 1;
                object2 = this.b(exwv1, eyju0);
                if(object2 != object1) {
                    goto label_28;
                }
                return object1;
            }
            case 1: {
                icbr icbr2 = eyju0.f;
                exwv exwv2 = eyju0.d;
                ibnx.b(object0);
                icbr1 = icbr2;
                exwv1 = exwv2;
                object2 = object0;
            label_28:
                eyju0.d = exwv1;
                eyju0.f = icbr1;
                eyju0.e = (eyjx)object2;
                eyju0.c = 2;
                Object object3 = this.b.h(exwv1, ((eyjx)object2) != eyjx.a, eyju0);
                if(object3 != object1) {
                    exwv3 = exwv1;
                    icbr3 = icbr1;
                    object0 = object3;
                    eyjx0 = (eyjx)object2;
                    break;
                }
                return object1;
            }
            case 2: {
                eyjx eyjx1 = eyju0.e;
                icbr3 = eyju0.f;
                exwv exwv4 = eyju0.d;
                ibnx.b(object0);
                eyjx0 = eyjx1;
                exwv3 = exwv4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        exjx exjx0 = ((eybs)object0).a;
        icbr3.V(exjx0);
        eyjx eyjx2 = eyjx.a;
        eyjz eyjz0 = null;
        if(eyjx0 == eyjx2) {
            int v1 = ((eybs)object0).b.ordinal();
            switch(v1) {
                case 0: {
                    eyjx3 = eyjx.q;
                    break;
                }
                case 1: {
                    eyjx3 = eyjx2;
                    break;
                }
                case 2: {
                    eyjx3 = eyjx.H;
                    break;
                }
                case 3: {
                    eyjx3 = eyjx.I;
                    break;
                }
                default: {
                    if(v1 != 4) {
                        throw new ibnq();
                    }
                    eyjx3 = eyjx.J;
                    break;
                }
            }
            if(eyjx3 == eyjx2) {
                ibnf ibnf0 = (ibnf)this.l.get(exjx0);
                eyce eyce0 = ibnf0 == null ? null : ((eyce)ibnf0.get());
                if(eyce0 == null) {
                    return new ibns(new eyja(eyjx.G, exwv3, null, null, 0xAC), null);
                }
                if(homc.a.j().s()) {
                    eykb eykb0 = this.m;
                    Duration duration0 = eyiy.a();
                    ibuq.f(duration0, "duration");
                    if(eykb0.e != null) {
                        ibuq.e(eykb0.c, "context");
                        ibuq.e(eykb0.d, "sensorManager");
                        InPocketDetector.InPocketEventListener inPocketDetector$InPocketEventListener0 = new InPocketDetector.InPocketEventListener(duration0, eykb0.c, eykb0.d, eykb0.a);
                        eyka eyka0 = new eyka(inPocketDetector$InPocketEventListener0, eykb0, duration0, null);
                        icbb.b(eykb0.b, null, null, eyka0, 3);
                        eyjz0 = inPocketDetector$InPocketEventListener0.c;
                    }
                }
                return new ibns(new eyja(eyjx2, exwv3, exjx0, eyjz0, 0xAC), eyce0);
            }
            ((ggtj)this.d.j()).B("Failed ranging precondition check: %s", eyjx3);
            this.j();
            return new ibns(new eyja(eyjx3, exwv3, exjx0, null, 0xAC), null);
        }
        ((ggtj)this.d.j()).B("Failed unlock precondition check: %s", eyjx0);
        this.j();
        return new ibns(new eyja(eyjx0, exwv3, exjx0, null, 0xAC), null);
    }

    public static final eyjx n(exzf exzf0) {
        switch(exzf0.ordinal()) {
            case 0: {
                return eyjx.a;
            }
            case 1: {
                return eyjx.b;
            }
            case 2: {
                return eyjx.c;
            }
            case 3: {
                return eyjx.d;
            }
            case 4: {
                return eyjx.e;
            }
            case 5: {
                return eyjx.f;
            }
            case 6: {
                return eyjx.g;
            }
            case 7: {
                return eyjx.h;
            }
            case 8: {
                return eyjx.i;
            }
            case 9: {
                return eyjx.m;
            }
            case 10: {
                return eyjx.p;
            }
            case 11: {
                return eyjx.q;
            }
            case 12: {
                return eyjx.o;
            }
            case 13: {
                return eyjx.n;
            }
            case 14: {
                return eyjx.r;
            }
            case 15: {
                return eyjx.s;
            }
            case 16: {
                return eyjx.C;
            }
            case 17: {
                return eyjx.D;
            }
            case 18: {
                return eyjx.E;
            }
            case 19: {
                return eyjx.K;
            }
            case 20: {
                return eyjx.L;
            }
            case 21: {
                return eyjx.M;
            }
            case 22: {
                return eyjx.N;
            }
            case 23: {
                return eyjx.O;
            }
            case 24: {
                return eyjx.P;
            }
            case 25: {
                return eyjx.Q;
            }
            case 26: {
                return eyjx.V;
            }
            case 27: {
                return eyjx.W;
            }
            case 28: {
                return eyjx.X;
            }
            case 29: {
                return eyjx.Y;
            }
            case 30: {
                return eyjx.ad;
            }
            case 0x1F: {
                return eyjx.ae;
            }
            case 0x20: {
                return eyjx.af;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}


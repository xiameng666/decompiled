import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;
import j..time.Duration;
import j..time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class eycb {
    public eybs a;
    private final bboh b;
    private final exyg c;
    private final exwm d;
    private final exwr e;
    private final exki f;
    private final eydt g;
    private final fced h;
    private final eyfp i;
    private final exdu j;
    private final eyec k;
    private final Context l;
    private final Map m;

    public eycb(bboh bboh0, exyg exyg0, exwm exwm0, exwr exwr0, exki exki0, eydt eydt0, fced fced0, eyfp eyfp0, exdu exdu0, eyec eyec0) {
        ibuq.f(exki0, "rangingCapabilityRepository");
        ibuq.f(exdu0, "airplaneModeState");
        super();
        this.b = bboh0;
        this.c = exyg0;
        this.d = exwm0;
        this.e = exwr0;
        this.f = exki0;
        this.g = eydt0;
        this.h = fced0;
        this.i = eyfp0;
        this.j = exdu0;
        this.k = eyec0;
        this.l = AppContextProvider.a();
        this.m = new LinkedHashMap();
    }

    public final Object a(exwv exwv0, Map map0, Map map1, ibrl ibrl0) {
        exjx exjx2;
        exjx exjx1;
        exjx exjx0;
        eybs eybs0;
        eybt eybt0;
        if((ibrl0 instanceof eybt)) {
            eybt0 = (eybt)ibrl0;
            int v = eybt0.c;
            if((v & 0x80000000) == 0) {
                eybt0 = new eybt(this, ibrl0);
            }
            else {
                eybt0.c = v - 0x80000000;
            }
        }
        else {
            eybt0 = new eybt(this, ibrl0);
        }
        Object object0 = eybt0.a;
        Object object1 = ibrx.a;
        switch(eybt0.c) {
            case 0: {
                ibnx.b(object0);
                if(map1 == null) {
                    map1 = exwv0.k;
                }
                eybs0 = eycb.o(map0, map1, exwv0.m, exwv0.l, exwv0.q);
                exjx0 = eybs0.a;
                if(exjx0 == exjx.d && homc.a.j().q()) {
                    eybt0.d = eybs0;
                    eybt0.e = exjx0;
                    eybt0.c = 1;
                    evql evql0 = this.h.g("com.google.android.gms.trustagent.activeunlock.common.capability.advertise_with_fixed_uuid", 0);
                    eybo eybo0 = new eybo(exwv0);
                    object0 = ictn.b(evql0.d(gmap.a, eybo0), eybt0);
                    if(object0 != object1) {
                        exjx1 = exjx0;
                        goto label_34;
                    }
                    return object1;
                }
                else {
                    exjx2 = exjx0;
                }
                break;
            }
            case 1: {
                exjx1 = eybt0.e;
                eybs0 = eybt0.d;
                ibnx.b(object0);
            label_34:
                if(((Boolean)object0).booleanValue()) {
                    exjx0 = exjx.e;
                    exjx2 = (this.a == null ? null : this.a.a) == exjx0 ? exjx1 : exjx0;
                }
                else {
                    exjx2 = exjx1;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.f(exjx2, "rangingMethod");
        ibuq.f(eybs0.b, "pdAvailability");
        ibuq.f(eybs0.c, "adAvailability");
        ibuq.f(eybs0.d, "adDefaultState");
        return new eybs(exjx2, eybs0.b, eybs0.c, eybs0.d, eybs0.e, eybs0.f);
    }

    public final Object b(exwv exwv0, exjx exjx0, Map map0, Map map1, boolean z, boolean z1, ibrl ibrl0) {
        eybu eybu0;
        if((ibrl0 instanceof eybu)) {
            eybu0 = (eybu)ibrl0;
            int v = eybu0.c;
            if((v & 0x80000000) == 0) {
                eybu0 = new eybu(this, ibrl0);
            }
            else {
                eybu0.c = v - 0x80000000;
            }
        }
        else {
            eybu0 = new eybu(this, ibrl0);
        }
        Object object0 = eybu0.a;
        Object object1 = ibrx.a;
        switch(eybu0.c) {
            case 0: {
                ibnx.b(object0);
                if(!z) {
                    return Boolean.valueOf(false);
                }
                if(map0.get(exjx0) != exjy.d && map1.get(exjx0) != exjy.d) {
                    if(!z1) {
                        return Boolean.valueOf(false);
                    }
                    iccs iccs0 = this.d.b(exwv0.d, exjx0, exwp.c);
                    eybu0.d = exwv0;
                    eybu0.c = 2;
                    object0 = iccs0.n(eybu0);
                    if(object0 != object1) {
                        goto label_33;
                    }
                }
                else {
                    ((ggtj)this.b.h()).x("The ranging method is restricted upon upgrading, downgrade the ranging method.");
                    eybu0.c = 1;
                    if(this.c.l(exwv0, true, eybu0) != object1) {
                        return Boolean.valueOf(true);
                    }
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            case 2: {
                exwv0 = eybu0.d;
                ibnx.b(object0);
            label_33:
                exod exod0 = ((exwo)object0).b;
                if(exod0 == null) {
                    return Boolean.valueOf(false);
                }
                eybu0.d = null;
                eybu0.c = 3;
                return this.c.n(exwv0, exod0, eybu0) != object1 ? Boolean.valueOf(true) : object1;
            }
            case 3: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(exwv exwv0, Map map0, exod exod0, ibrl ibrl0) {
        Object object5;
        Object object4;
        Object object3;
        exwv exwv1;
        eybv eybv0;
        if((ibrl0 instanceof eybv)) {
            eybv0 = (eybv)ibrl0;
            int v = eybv0.g;
            if((v & 0x80000000) == 0) {
                eybv0 = new eybv(this, ibrl0);
            }
            else {
                eybv0.g = v - 0x80000000;
            }
        }
        else {
            eybv0 = new eybv(this, ibrl0);
        }
        Object object0 = eybv0.e;
        Object object1 = ibrx.a;
        switch(eybv0.g) {
            case 0: {
                ibnx.b(object0);
                Map map1 = exkh.c(this.f.a());
                Map map2 = exkh.c(exod0);
                Map map3 = exkh.b(exod0);
                eybv0.h = exwv0;
                eybv0.a = map0;
                eybv0.b = map1;
                eybv0.c = map2;
                eybv0.d = map3;
                eybv0.g = 1;
                Object object2 = this.a(exwv0, map1, map2, eybv0);
                if(object2 == object1) {
                    return object1;
                }
                exwv1 = exwv0;
                object3 = map3;
                object4 = map1;
                object0 = object2;
                object5 = map2;
                goto label_41;
            }
            case 1: {
                object3 = eybv0.d;
                Object object6 = eybv0.c;
                Object object7 = eybv0.b;
                Object object8 = eybv0.a;
                exwv exwv2 = eybv0.h;
                ibnx.b(object0);
                object4 = object7;
                exwv1 = exwv2;
                object5 = object6;
                map0 = object8;
            label_41:
                exjx exjx0 = ((eybs)object0).a;
                boolean z = ((Map)object5).get(exjx0) == exjy.c && ((Map)object3).get(exjx0) == exjr.c;
                boolean z1 = exjx0.f(map0, ((Map)object5)) && exjx0.g(((Map)object4), ((Map)object5));
                eybv0.h = null;
                eybv0.a = null;
                eybv0.b = null;
                eybv0.c = null;
                eybv0.d = null;
                eybv0.g = 2;
                object0 = this.b(exwv1, exjx0, ((Map)object4), ((Map)object5), z1, z, eybv0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Boolean boolean0 = (Boolean)object0;
        return ibom.a;
    }

    public final Object d(DiscoveredDevice discoveredDevice0, exod exod0, ibrl ibrl0) {
        exod exod1;
        eybs eybs2;
        Object object2;
        DiscoveredDevice discoveredDevice1;
        eybw eybw0;
        if((ibrl0 instanceof eybw)) {
            eybw0 = (eybw)ibrl0;
            int v = eybw0.f;
            if((v & 0x80000000) == 0) {
                eybw0 = new eybw(this, ibrl0);
            }
            else {
                eybw0.f = v - 0x80000000;
            }
        }
        else {
            eybw0 = new eybw(this, ibrl0);
        }
        Object object0 = eybw0.d;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(eybw0.f) {
            case 0: {
                ibnx.b(object0);
                ibuq.e(this.l, "context");
                if(!eyef.a(this.l)) {
                    return new eybq(false, exod0, false);
                }
                Map map0 = exkh.c(this.f.a());
                eybw0.a = discoveredDevice0;
                eybw0.b = exod0;
                eybw0.c = map0;
                eybw0.f = 1;
                eybs eybs0 = eycb.o(map0, exkh.c(exod0), exkh.b(exod0), false, false);
                if(eybs0 == object1) {
                    return object1;
                }
                discoveredDevice1 = discoveredDevice0;
                object2 = map0;
                object0 = eybs0;
                goto label_33;
            }
            case 1: {
                object2 = eybw0.c;
                exod0 = (exod)eybw0.b;
                discoveredDevice1 = (DiscoveredDevice)eybw0.a;
                ibnx.b(object0);
            label_33:
                if(holo.g()) {
                    Map map1 = exkh.c(exod0);
                    if(exjx.f.g(((Map)object2), map1)) {
                        this.k.d();
                    }
                    else {
                        this.k.c();
                    }
                }
                boolean z1 = ((eybs)object0).e;
                if(!z1 && ((eybs)object0).c == exjy.c && ((eybs)object0).d == exjr.c) {
                    iccs iccs0 = this.d.b(discoveredDevice1.a, ((eybs)object0).a, exwp.c);
                    eybw0.a = exod0;
                    eybw0.b = (eybs)object0;
                    eybw0.c = null;
                    eybw0.f = 2;
                    Object object3 = iccs0.n(eybw0);
                    if(object3 != object1) {
                        eybs eybs1 = (eybs)object0;
                        object0 = object3;
                        eybs2 = eybs1;
                        exod1 = exod0;
                        break;
                    }
                    return object1;
                }
                if(((eybs)object0).c != exjy.c && ((eybs)object0).b != exjy.c || z1) {
                    z = false;
                }
                return new eybq(z, exod0, z1);
            }
            case 2: {
                eybs2 = (eybs)eybw0.b;
                exod1 = (exod)eybw0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        exod exod2 = ((exwo)object0).b;
        if(exod2 != null) {
            exod1 = exod2;
        }
        if(eybs2.b != exjy.c) {
            z = false;
        }
        return new eybq(z, exod1, false);
    }

    public final Object e(ConnectionInfo connectionInfo0, ibrl ibrl0) {
        eybx eybx0;
        if((ibrl0 instanceof eybx)) {
            eybx0 = (eybx)ibrl0;
            int v = eybx0.c;
            if((v & 0x80000000) == 0) {
                eybx0 = new eybx(this, ibrl0);
            }
            else {
                eybx0.c = v - 0x80000000;
            }
        }
        else {
            eybx0 = new eybx(this, ibrl0);
        }
        Object object0 = eybx0.a;
        Object object1 = ibrx.a;
        switch(eybx0.c) {
            case 0: {
                ibnx.b(object0);
                eybx0.c = 1;
                object0 = this.g.a(connectionInfo0, eybx0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = null;
        if(((exlu)object0) != null) {
            exnh exnh0 = ((exlu)object0).d;
            if(exnh0 == null) {
                exnh0 = exnh.a;
            }
            if((exnh0.b & 1) != 0) {
                exnh exnh1 = ((exlu)object0).d;
                if(exnh1 == null) {
                    exnh1 = exnh.a;
                }
                object2 = exnh1.c;
                if(object2 == null) {
                    return exlo.a;
                }
            }
        }
        return object2;
    }

    public final Object f(exwv exwv0, exjx exjx0, ibrl ibrl0) {
        Duration duration0;
        Map map1;
        Object object3;
        exwv exwv4;
        exwv exwv3;
        eyby eyby0;
        exwv exwv1 = exwv0;
        exjx exjx1 = exjx0;
        if((ibrl0 instanceof eyby)) {
            eyby0 = (eyby)ibrl0;
            int v = eyby0.c;
            if((v & 0x80000000) == 0) {
                eyby0 = new eyby(this, ibrl0);
            }
            else {
                eyby0.c = v - 0x80000000;
            }
        }
        else {
            eyby0 = new eyby(this, ibrl0);
        }
        Object object0 = eyby0.a;
        Object object1 = ibrx.a;
        switch(eyby0.c) {
            case 0: {
                ibnx.b(object0);
                if(exjx1 != exjx.c && exwv1 != null) {
                    eyby0.d = exwv1;
                    eyby0.e = exjx1;
                    eyby0.c = 1;
                    object0 = this.c.d(exwv1.e, eyby0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_28;
                }
                return ibom.a;
            }
            case 1: {
                exjx exjx2 = eyby0.e;
                exwv exwv2 = eyby0.d;
                ibnx.b(object0);
                exjx1 = exjx2;
                exwv1 = exwv2;
            label_28:
                if(((exwv)object0) != null) {
                    eyby0.d = exwv1;
                    eyby0.e = exjx1;
                    eyby0.f = (exwv)object0;
                    eyby0.c = 2;
                    Object object2 = this.e(((exwv)object0).d, eyby0);
                    if(object2 == object1) {
                        return object1;
                    }
                    exwv3 = exwv1;
                    exwv4 = (exwv)object0;
                    object0 = object2;
                    goto label_43;
                }
                return ibom.a;
            }
            case 2: {
                exwv4 = eyby0.f;
                exjx1 = eyby0.e;
                exwv3 = eyby0.d;
                ibnx.b(object0);
            label_43:
                boolean z = ((exlo)object0) != null && ((exlo)object0).c;
                bboh bboh0 = this.b;
                ggtj ggtj0 = (ggtj)bboh0.h();
                if(((exlo)object0) == null) {
                    object3 = null;
                }
                else {
                    hfwn hfwn0 = ((exlo)object0).d;
                    if(hfwn0 == null) {
                        hfwn0 = hfwn.a;
                    }
                    object3 = hfwn0 == null ? null : hfyo.d(hfwn0);
                }
                ggtj0.V("AD APM: state = %s, lastOffTime = %s", z, object3);
                Map map0 = exwv4.n;
                if(holx.c() && exwv4.k.get(exjx1) == exjy.e) {
                    ((ggtj)bboh0.h()).x("Airplane mode is on and user has not consented to downgrade the ranging method yet, show an Airplane mode notification.");
                    ibns ibns0 = this.k(exwv3);
                    map1 = (Map)ibns0.b;
                    if(((Boolean)ibns0.a).booleanValue()) {
                        int v1 = exjx1.a();
                        String s = this.l.getString(v1);
                        ibuq.e(s, "getString(...)");
                        this.e.c(s, exwv3.d);
                    }
                    else {
                        map1 = map0;
                    }
                }
                else {
                    Map map2 = exwv4.k;
                    if(map2.get(exjx1) != exjy.c) {
                        if(map2.get(exjx1) == exjy.d) {
                            if(((exlo)object0) != null && (((exlo)object0).b & 1) != 0) {
                                hfwn hfwn1 = ((exlo)object0).d;
                                if(hfwn1 == null) {
                                    hfwn1 = hfwn.a;
                                }
                                ibuq.e(hfwn1, "getLastOffTimestamp(...)");
                                duration0 = Duration.between(hfyo.d(hfwn1), Instant.now());
                            }
                            else {
                                duration0 = null;
                            }
                            if(duration0 != null && exjx1 == exjx.f && !z && duration0.compareTo(glyb.g(honb.c())) < 0) {
                                ((ggtj)bboh0.h()).R("Suppressing ranging method downgrade notification when duration after AD APM off %s < %s.", duration0, glyb.g(honb.c()));
                                map1 = map0;
                            }
                            else {
                                ibns ibns2 = this.l(map0);
                                Map map3 = (Map)ibns2.b;
                                if(((Boolean)ibns2.a).booleanValue()) {
                                    map1 = this.j(map3);
                                    int v2 = exjx1.a();
                                    String s1 = this.l.getString(v2);
                                    ibuq.e(s1, "getString(...)");
                                    this.e.d(s1, exwv4.d);
                                }
                                else {
                                    map1 = map0;
                                }
                            }
                        }
                        else {
                            map1 = map0;
                        }
                    }
                    else if(exjx1 == exjx.f && z) {
                        ((ggtj)bboh0.h()).x("Suppressing ranging method enablement notification when AD APM is on.");
                        map1 = map0;
                    }
                    else {
                        ibns ibns1 = this.m(map0);
                        map1 = (Map)ibns1.b;
                        if(((Boolean)ibns1.a).booleanValue()) {
                            this.e.e(exjx1, exwv4.e, exwv4.d);
                        }
                        else {
                            map1 = map0;
                        }
                    }
                }
                if(!ibuq.m(map1, map0)) {
                    eyby0.d = null;
                    eyby0.e = null;
                    eyby0.f = null;
                    eyby0.c = 3;
                    if(this.c.m(exwv4, map1, eyby0) == object1) {
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(exwv exwv0, exjx exjx0, Map map0, ibrl ibrl0) {
        gzyd gzyd0;
        exjx exjx1;
        eybz eybz0;
        if((ibrl0 instanceof eybz)) {
            eybz0 = (eybz)ibrl0;
            int v = eybz0.d;
            if((v & 0x80000000) == 0) {
                eybz0 = new eybz(this, ibrl0);
            }
            else {
                eybz0.d = v - 0x80000000;
            }
        }
        else {
            eybz0 = new eybz(this, ibrl0);
        }
        Object object0 = eybz0.b;
        Object object1 = ibrx.a;
        switch(eybz0.d) {
            case 0: {
                ibnx.b(object0);
                eybs eybs0 = this.a;
                if(eybs0 == null) {
                label_18:
                    eybz0.e = exwv0;
                    eybz0.f = exjx0;
                    eybz0.a = map0;
                    eybz0.d = 1;
                    object0 = eycb.i(this, exwv0, exwv0.o, eybz0);
                    if(object0 == object1) {
                        return object1;
                    }
                    exjx1 = ((eybs)object0).a;
                }
                else {
                    exjx1 = eybs0.a;
                    if(exjx1 == null) {
                        goto label_18;
                    }
                }
                break;
            }
            case 1: {
                map0 = eybz0.a;
                exjx0 = eybz0.f;
                exwv0 = eybz0.e;
                ibnx.b(object0);
                exjx1 = ((eybs)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        exjx exjx2 = exjw.a(exjx1);
        exjx exjx3 = exjw.a(exjx0);
        if(exjx2 != exjx3) {
            eyfp eyfp0 = this.i;
            Map map1 = (Map)this.m.get(new Long(exwv0.a));
            Map map2 = exwv0.k;
            Map map3 = exwv0.o;
            ConnectionInfo connectionInfo0 = exwv0.d;
            ibuq.f(exjx3, "currentRangingMethod");
            ibuq.f(map2, "currentAdStateMap");
            ibuq.f(map3, "lastPdStateMap");
            ibuq.f(map0, "currentPdStateMap");
            if(exjx2 != null) {
                exjy exjy0 = null;
                ibuq.f(exjx3, "<this>");
                if(exjx.a.indexOf(exjx3) <= exjx.a.indexOf(exjx2)) {
                    if(homc.n() && (map2.get(exjx2) == exjy.e || map0.get(exjx2) == exjy.e)) {
                        gzyd0 = gzyd.g;
                    }
                    else {
                        gzyd0 = map2.get(exjx2) == exjy.d || map0.get(exjx2) == exjy.d ? gzyd.e : gzyd.d;
                    }
                }
                else if(homc.n() && ((map1 == null ? null : ((exjy)map1.get(exjx3))) == exjy.e || map3.get(exjx3) == exjy.e)) {
                    gzyd0 = gzyd.f;
                }
                else {
                    if(map1 != null) {
                        exjy0 = (exjy)map1.get(exjx3);
                    }
                    gzyd0 = exjy0 != exjy.d && map3.get(exjx3) != exjy.d ? gzyd.b : gzyd.c;
                }
                gzyj gzyj0 = exjx2.e();
                gzyj gzyj1 = exjx3.e();
                ibuq.f(gzyd0, "event");
                ibuq.f(gzyj0, "oldRangingMethod");
                ibuq.f(gzyj1, "newRangingMethod");
                eyfd eyfd0 = new eyfd(gzyd0, gzyj0, gzyj1);
                eyfp0.a.b(connectionInfo0, eyfd0);
            }
        }
        return ibom.a;
    }

    public final Object h(exwv exwv0, boolean z, ibrl ibrl0) {
        exwv exwv7;
        eybs eybs3;
        Map map8;
        Object object4;
        Map map6;
        Map map5;
        boolean z5;
        exwv exwv5;
        Map map2;
        exwv exwv4;
        eybs eybs1;
        boolean z4;
        Map map1;
        exwv exwv3;
        eybs eybs0;
        boolean z1;
        Map map0;
        eyca eyca0;
        exwv exwv1 = exwv0;
        if((ibrl0 instanceof eyca)) {
            eyca0 = (eyca)ibrl0;
            int v = eyca0.e;
            if((v & 0x80000000) == 0) {
                eyca0 = new eyca(this, ibrl0);
            }
            else {
                eyca0.e = v - 0x80000000;
            }
        }
        else {
            eyca0 = new eyca(this, ibrl0);
        }
        Object object0 = eyca0.c;
        Object object1 = ibrx.a;
        switch(eyca0.e) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)this.b.h()).B("updateRangingMethod, AD ranging method states before unlock=%s", exwv1.k);
                map0 = exkh.c(this.f.a());
                eyca0.f = exwv1;
                eyca0.a = map0;
                eyca0.b = z;
                eyca0.e = 1;
                Object object2 = eycb.i(this, exwv1, map0, eyca0);
                if(object2 == object1) {
                    return object1;
                }
                z1 = z;
                object0 = object2;
                goto label_32;
            }
            case 1: {
                boolean z2 = eyca0.b;
                map0 = (Map)eyca0.a;
                exwv exwv2 = eyca0.f;
                ibnx.b(object0);
                z1 = z2;
                exwv1 = exwv2;
            label_32:
                bboh bboh0 = this.b;
                eybs0 = (eybs)object0;
                ((ggtj)bboh0.h()).x("enableRangingMethodMigration");
                ibuq.e(this.l, "context");
                if(eyef.a(this.l)) {
                    ((ggtj)bboh0.h()).x("enableEnablement");
                    eyca0.f = exwv1;
                    eyca0.a = map0;
                    eyca0.g = eybs0;
                    eyca0.b = z1;
                    eyca0.e = 2;
                    boolean z3 = exwv1.k.get(eybs0.a) == exjy.c && exwv1.m.get(eybs0.a) == exjr.c;
                    object0 = this.b(exwv1, eybs0.a, map0, exwv1.k, eybs0.a.f(exwv1.o, map0) && eybs0.a.g(map0, exwv1.k), z3, eyca0);
                    if(object0 == object1) {
                        return object1;
                    }
                    exwv3 = exwv1;
                    map1 = map0;
                    z4 = z1;
                    eybs1 = eybs0;
                    goto label_56;
                }
                else {
                    goto label_98;
                }
                goto label_99;
            }
            case 2: {
                z4 = eyca0.b;
                eybs1 = eyca0.g;
                map1 = (Map)eyca0.a;
                exwv3 = eyca0.f;
                ibnx.b(object0);
            label_56:
                if(((Boolean)object0).booleanValue()) {
                    ((ggtj)this.b.h()).x("enableRangingMethodImplicitlyOnPdUpgrade changed");
                    eyca0.f = exwv3;
                    eyca0.a = map1;
                    eyca0.g = eybs1;
                    eyca0.b = z4;
                    eyca0.e = 3;
                    object0 = this.c.d(exwv3.e, eyca0);
                    if(object0 == object1) {
                        return object1;
                    }
                    map0 = map1;
                    goto label_77;
                }
                else {
                    z1 = z4;
                    eybs0 = eybs1;
                    exwv1 = exwv3;
                }
                goto label_99;
            }
            case 3: {
                z4 = eyca0.b;
                eybs1 = eyca0.g;
                map1 = (Map)eyca0.a;
                exwv3 = eyca0.f;
                ibnx.b(object0);
                map0 = map1;
            label_77:
                if(((exwv)object0) == null) {
                    z1 = z4;
                    eybs0 = eybs1;
                    exwv1 = exwv3;
                }
                else {
                    eyca0.f = exwv3;
                    eyca0.a = map0;
                    eyca0.g = null;
                    eyca0.b = z4;
                    eyca0.e = 4;
                    object0 = eycb.i(this, ((exwv)object0), map0, eyca0);
                    if(object0 == object1) {
                        return object1;
                    }
                    exwv4 = exwv3;
                    goto label_95;
                }
                goto label_98;
            }
            case 4: {
                z4 = eyca0.b;
                map0 = (Map)eyca0.a;
                exwv4 = eyca0.f;
                ibnx.b(object0);
            label_95:
                eybs0 = (eybs)object0;
                z1 = z4;
                exwv1 = exwv4;
            label_98:
                map1 = map0;
            label_99:
                eyca0.f = exwv1;
                eyca0.a = map1;
                eyca0.g = eybs0;
                eyca0.b = z1;
                eyca0.e = 5;
                Object object3 = this.c.a.k(exwv1.a, map1, eyca0);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                if(object3 == object1) {
                    return object1;
                }
                map2 = map1;
                exwv5 = exwv1;
                z5 = z1;
                goto label_120;
            }
            case 5: {
                z5 = eyca0.b;
                eybs eybs2 = eyca0.g;
                Map map3 = (Map)eyca0.a;
                exwv exwv6 = eyca0.f;
                ibnx.b(object0);
                eybs0 = eybs2;
                map2 = map3;
                exwv5 = exwv6;
            label_120:
                if(holo.g() && exjx.f.g(map2, exwv5.k)) {
                    this.k.d();
                }
                else {
                    this.k.c();
                }
                bboh bboh1 = this.b;
                ((ggtj)bboh1.h()).B("RangingMethodDecision: %s", eybs0);
                if(!z5) {
                    eyca0.f = exwv5;
                    eyca0.a = map2;
                    eyca0.g = eybs0;
                    eyca0.e = 6;
                    exdu exdu0 = this.j;
                    exdu0.a();
                    Map map4 = exwv5.n;
                    if(holx.c() && (eybs0.b == exjy.e || eybs0.c == exjy.e)) {
                        ((ggtj)bboh1.h()).x("Airplane mode is on and user has not consented to downgrade the ranging method yet, show an Airplane mode notification.");
                        ibns ibns0 = this.k(exwv5);
                        map5 = (Map)ibns0.b;
                        if(((Boolean)ibns0.a).booleanValue()) {
                            int v1 = eybs0.a.a();
                            String s = this.l.getString(v1);
                            ibuq.e(s, "getString(...)");
                            this.e.c(s, exwv5.d);
                        }
                        else {
                            map5 = map4;
                        }
                    }
                    else {
                        boolean z6 = eybs0.e;
                        if(!z6 && (this.a == null || this.a.e)) {
                            ((ggtj)bboh1.h()).x("Reset downgrade notification since ranging method is not downgradable anymore.");
                            map6 = ibpz.j(map4, ibpo.g(new eyan[]{eyan.d, eyan.e}));
                        }
                        else {
                            map6 = map4;
                        }
                        exjy exjy0 = exjy.c;
                        if(eybs0.c != exjy0 && eybs0.b != exjy0 && (this.a == null || this.a.c == exjy0 || this.a.b == exjy0)) {
                            map6 = this.j(map6);
                        }
                        if(z6 && eybs0.b == exjy.d) {
                            Duration duration0 = exdu0.b == null ? null : Duration.between(exdu0.b, Instant.now());
                            if(duration0 != null && !exdu0.a && eybs0.a == exjx.f && duration0.compareTo(glyb.g(honb.c())) < 0) {
                                ((ggtj)bboh1.h()).R("Suppressing ranging method downgrade notification when duration after PD APM off %s < %s.", duration0, glyb.g(honb.c()));
                                map5 = map6;
                            }
                            else {
                                ibns ibns1 = this.l(map6);
                                Map map7 = (Map)ibns1.b;
                                if(((Boolean)ibns1.a).booleanValue()) {
                                    map5 = this.j(map7);
                                    int v2 = eybs0.a.a();
                                    String s1 = this.l.getString(v2);
                                    ibuq.e(s1, "getString(...)");
                                    this.e.d(s1, exwv5.d);
                                }
                                else {
                                    map5 = map6;
                                }
                            }
                        }
                        else if(eybs0.b != exjy0) {
                            map5 = map6;
                        }
                        else if(exdu0.a && eybs0.a == exjx.f) {
                            ((ggtj)bboh1.h()).x("Suppressing ranging method enablement notification when PD APM is on.");
                            map5 = map6;
                        }
                        else {
                            ibns ibns2 = this.m(map6);
                            map5 = (Map)ibns2.b;
                            if(((Boolean)ibns2.a).booleanValue()) {
                                this.e.e(eybs0.a, exwv5.e, exwv5.d);
                            }
                            else {
                                map5 = map6;
                            }
                        }
                    }
                    if(ibuq.m(map5, map4)) {
                        object4 = ibom.a;
                    }
                    else {
                        object4 = this.c.m(exwv5, map5, eyca0);
                        if(object4 != object1) {
                            object4 = ibom.a;
                        }
                    }
                    if(object4 != object1) {
                        map8 = map2;
                        eybs3 = eybs0;
                        goto label_199;
                    }
                    return object1;
                }
                map8 = map2;
                eybs3 = eybs0;
                goto label_199;
            }
            case 6: {
                eybs3 = eyca0.g;
                map8 = (Map)eyca0.a;
                exwv5 = eyca0.f;
                ibnx.b(object0);
            label_199:
                if(eybs3.f) {
                    ((ggtj)this.b.h()).x("RangingMethod is available again, should be upgraded.");
                    eyca0.f = exwv5;
                    eyca0.a = map8;
                    eyca0.g = eybs3;
                    eyca0.e = 7;
                    if(this.c.l(exwv5, false, eyca0) == object1) {
                        return object1;
                    }
                }
                goto label_211;
            }
            case 7: {
                eybs3 = eyca0.g;
                map8 = (Map)eyca0.a;
                exwv5 = eyca0.f;
                ibnx.b(object0);
            label_211:
                exwv7 = exwv5;
                ((ggtj)this.b.h()).B("AD ranging method states after unlock=%s", exwv7.k);
                eyca0.f = exwv7;
                eyca0.a = eybs3;
                eyca0.g = null;
                eyca0.e = 8;
                if(this.g(exwv7, eybs3.a, map8, eyca0) == object1) {
                    return object1;
                }
                break;
            }
            case 8: {
                eybs3 = (eybs)eyca0.a;
                exwv7 = eyca0.f;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.m.put(new Long(exwv7.a), exwv7.k);
        this.a = eybs3;
        return eybs3;
    }

    public static Object i(eycb eycb0, exwv exwv0, Map map0, ibrl ibrl0) {
        return eycb0.a(exwv0, map0, null, ibrl0);
    }

    private final Map j(Map map0) {
        ((ggtj)this.b.h()).x("Reset enablement notification since ranging method is not unavailable anymore.");
        return ibpz.j(map0, ibpo.g(new eyan[]{eyan.f, eyan.g}));
    }

    private final ibns k(exwv exwv0) {
        Boolean boolean0 = Boolean.valueOf(false);
        if(!exwv0.q && !exwv0.l) {
            Map map0 = exwv0.n;
            if(map0.containsKey(eyan.d)) {
                ((ggtj)this.b.h()).x("Restricted ranging method notification is already shown, do not send airplane mode notification");
                return new ibns(boolean0, map0);
            }
            return this.n(map0, eyan.h, null, null);
        }
        ((ggtj)this.b.h()).x("User already consented to downgrade the ranging method, do not send airplane mode notification");
        return new ibns(boolean0, exwv0.n);
    }

    private final ibns l(Map map0) {
        Duration duration0 = glyb.g(honb.a.e().d());
        return this.n(map0, eyan.d, eyan.e, duration0);
    }

    private final ibns m(Map map0) {
        Duration duration0 = glyb.g(honb.a.e().e());
        return this.n(map0, eyan.f, eyan.g, duration0);
    }

    private final ibns n(Map map0, eyan eyan0, eyan eyan1, Duration duration0) {
        Instant instant0 = (Instant)map0.get(eyan0);
        Instant instant1 = Instant.now();
        ibuq.e(instant1, "instant(...)");
        Boolean boolean0 = Boolean.valueOf(true);
        if(instant0 == null) {
            ((ggtj)this.b.h()).B("Notifying %s", eyan0.name());
            return new ibns(boolean0, ibpz.o(map0, new ibns(eyan0, instant1)));
        }
        if(eyan1 != null && duration0 != null) {
            Duration duration1 = Duration.between(instant0, instant1);
            ibuq.e(duration1, "between(...)");
            if(!map0.containsKey(eyan1) && duration1.compareTo(duration0) >= 0) {
                ((ggtj)this.b.h()).B("Notifying %s", eyan1.name());
                return new ibns(boolean0, ibpz.o(map0, new ibns(eyan1, instant1)));
            }
            ((ggtj)this.b.h()).X("Not notifying %s since duration %s < %s", eyan1.name(), duration1, duration0);
            return new ibns(Boolean.valueOf(false), map0);
        }
        return new ibns(Boolean.valueOf(false), map0);
    }

    private static final eybs o(Map map0, Map map1, Map map2, boolean z, boolean z1) {
        boolean z4;
        exjx exjx2;
        exjx exjx0 = exjx.d;
        List list0 = exjx.b;
        for(Object object0: list0) {
            exjx exjx1 = (exjx)object0;
            if(!homc.k() && exjx1 == exjx.g) {
                continue;
            }
            boolean z2 = exjx1.g(map0, map1) && (map1.get(exjx1) == exjy.d || map0.get(exjx1) == exjy.d);
            boolean z3 = holx.c() && exjx1.g(map0, map1) && (map1.get(exjx1) == exjy.e || map0.get(exjx1) == exjy.e);
            if(exkh.a(map1, exjx1) && exkh.a(map0, exjx1)) {
                exjx2 = exjx1;
                goto label_17;
            }
            if((!z3 || z || z1) && (!z2 || z)) {
                continue;
            }
            exjx2 = exjx1;
            z4 = true;
            goto label_18;
        }
        exjx2 = exjx0;
    label_17:
        z4 = false;
    label_18:
        exjy exjy0 = (exjy)map0.get(exjx2);
        if(exjy0 == null) {
            exjy0 = exjy.a;
        }
        exjy exjy1 = (exjy)map1.get(exjx2);
        if(exjy1 == null) {
            exjy1 = exjy.a;
        }
        exjr exjr0 = (exjr)map2.get(exjx2);
        if(exjr0 == null) {
            exjr0 = exjr.a;
        }
        if(z) {
            ibuq.f(map0, "pdStateMap");
            ibuq.f(map1, "adStateMap");
            for(Object object1: list0) {
                if(((exjx)object1).g(map0, map1)) {
                    return exjx2 == ((exjx)object1) ? new eybs(exjx2, exjy0, exjy1, exjr0, z4, true) : new eybs(exjx2, exjy0, exjy1, exjr0, z4, false);
                }
            }
            return exjx2 == null ? new eybs(exjx2, exjy0, exjy1, exjr0, z4, true) : new eybs(exjx2, exjy0, exjy1, exjr0, z4, false);
        }
        return new eybs(exjx2, exjy0, exjy1, exjr0, z4, false);
    }
}


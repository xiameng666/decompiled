import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class eysa extends lsb {
    static final ibxd[] a;
    public final eyec b;
    public final exyg c;
    public final exki d;
    public final bboh e;
    public final icck f;
    public final ibvv g;
    public final ibvv h;
    public final icnj i;
    public final icnl j;
    private final exwm k;
    private final eyny l;
    private final exur m;
    private final eycb n;
    private final ibvv o;
    private final ibvv p;
    private final ibvv q;
    private final ibvv r;
    private final ibvv s;

    static {
        eysa.a = new ibxd[]{new ibut(eysa.class, "enrolledDevices", "getEnrolledDevices()Ljava/util/List;", 0), new ibut(eysa.class, "syncingDevices", "getSyncingDevices()Ljava/util/Set;", 0), new ibut(eysa.class, "unenrolledDevices", "getUnenrolledDevices()Ljava/util/List;", 0), new ibut(eysa.class, "unknownStateDevices", "getUnknownStateDevices()Ljava/util/List;", 0), new ibut(eysa.class, "conflictEnrollmentDialog", "getConflictEnrollmentDialog()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/enrolleddevice/UserAcknowledgableDialogUiState;", 0), new ibut(eysa.class, "rangingMethodDialog", "getRangingMethodDialog()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/enrolleddevice/UserAcknowledgableDialogUiState;", 0), new ibut(eysa.class, "distanceBasedRelockReady", "getDistanceBasedRelockReady()Z", 0)};
    }

    public eysa(eyec eyec0, exyg exyg0, exwm exwm0, eyny eyny0, exur exur0, exki exki0, eycb eycb0, bboh bboh0, icck icck0) {
        ibuq.f(eyny0, "deeplinkArguments");
        ibuq.f(exki0, "rangingCapabilityRepository");
        ibuq.f(eycb0, "proximityRepository");
        super();
        this.b = eyec0;
        this.c = exyg0;
        this.k = exwm0;
        this.l = eyny0;
        this.m = exur0;
        this.d = exki0;
        this.n = eycb0;
        this.e = bboh0;
        this.f = icck0;
        this.g = new eyrn(ibps.a, this);
        this.o = new eyrn(ibpu.a, this);
        this.h = new eyrn(ibps.a, this);
        this.p = new eyrn(ibps.a, this);
        this.q = new eyrn(null, this);
        this.r = new eyrn(null, this);
        this.s = new eyrn(Boolean.valueOf(false), this);
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        eyed eyed0 = eyee.a(context0);
        icnl icnl0 = icnm.a(this.a(ibps.a, eyed0, null, null));
        this.j = icnl0;
        this.i = icnl0;
        icbb.b(lsc.a(this), null, null, new eyri(this, null), 3);
        icbb.b(lsc.a(this), null, null, new eyrk(this, null), 3);
    }

    private final eysx A() {
        return (eysx)this.r.a(this, eysa.a[5]);
    }

    private final List B() {
        return (List)this.h.a(this, eysa.a[2]);
    }

    public final eyqq a(List list0, eyed eyed0, eysx eysx0, eybs eybs0) {
        eysz eysz2;
        eysz eysz1;
        eysz eysz0 = null;
        boolean z = (eybs0 == null ? null : eybs0.b) == exjy.d || (eybs0 == null ? null : eybs0.c) == exjy.d;
        boolean z1 = (eybs0 == null ? null : eybs0.b) == exjy.c || (eybs0 == null ? null : eybs0.c) == exjy.c;
        boolean z2 = (eybs0 == null ? null : eybs0.b) == exjy.e || (eybs0 == null ? null : eybs0.c) == exjy.e;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            boolean z3 = this.l().contains(((exwv)object0));
            eyrc eyrc0 = new eyrc(this, ((exwv)object0));
            arrayList0.add(new eyqt(((exwv)object0).b, z3, eyrc0, eyed0.j && !z && !z1 && !z2));
        }
        switch(eyed0.ordinal()) {
            case 1: {
                eysz1 = new eysz(0x7F150F05);  // string:enrolled_devices_warning_blocked_by_device_policy "This feature was blocked 
                                               // by work policy. If you have questions, contact your IT admin."
                break;
            }
            case 2: {
                eysz1 = new eysz(0x7F150F08);  // string:enrolled_devices_warning_trust_agent_off "To use Watch Unlock, turn on the 
                                               // trust agent in Settings"
                break;
            }
            case 3: {
                Context context0 = AppContextProvider.a();
                ibuq.e(context0, "getApplicationContext(...)");
                eysz1 = new eysz(0x7F150F07, new eysy(0x7F1508FE, ads.d(context0, "android.permission.BLUETOOTH_CONNECT"), null, 4));  // string:enrolled_devices_warning_no_bluetooth_permission "To use Watch Unlock, update 
                                                                                                                                       // nearby devices permission"
                break;
            }
            case 4: {
                eysz1 = new eysz(0x7F150F06, new eysy(0x7F1508F4, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null, 4));  // string:enrolled_devices_warning_bluetooth_off "To use Watch Unlock, turn on Bluetooth"
                break;
            }
            default: {
                eysz1 = null;
            }
        }
        exwv exwv0 = (exwv)ibpo.T(list0);
        if(eysz1 == null && eybs0 != null && exwv0 != null) {
            if(holx.c() && z2 && eybs0.a == exjx.f) {
                eysz0 = new eysz(0x7F150F02, new eysy(0x7F15080A, null, new eyqu(this, exwv0), 2));  // string:enrolled_devices_restricted_ranging_method "To use Watch Unlock, confirm 
                                                                                                     // using it without Ultra-Wideband"
            }
            else if(z && eybs0.a == exjx.f) {
                eysz0 = new eysz(0x7F150F02, new eysy(0x7F15080A, null, new eyqv(this, exwv0), 2));  // string:enrolled_devices_restricted_ranging_method "To use Watch Unlock, confirm 
                                                                                                     // using it without Ultra-Wideband"
            }
            else if(z1) {
                exjx exjx0 = eybs0.a;
                if(exjx0 == exjx.f) {
                    eysz0 = new eysz(0x7F150F04, new eysy(0x7F1508F4, null, new eyrb(this, exwv0, exjx0), 2));  // string:enrolled_devices_unavailable_ranging_method "To use Watch Unlock, turn on 
                                                                                                                // Ultra-Wideband"
                }
            }
            eysz2 = eysz0;
        }
        else {
            eysz2 = eysz1;
        }
        boolean z4 = holo.g() ? this.b.f() : ((Boolean)this.s.a(this, eysa.a[6])).booleanValue();
        eypl eypl0 = new eypl(z4, z4 && eybs0 != null && eybs0.a == exjx.f && (eybs0.b == exjy.b && eybs0.c == exjy.b));
        return !eyed0.i || !arrayList0.isEmpty() ? new eyqq(arrayList0, eysx0, eysz2, eypl0, false) : new eyqq(arrayList0, eysx0, eysz2, eypl0, true);
    }

    public final Object b(ibrl ibrl0) {
        exwv exwv0;
        eyrl eyrl0;
        if((ibrl0 instanceof eyrl)) {
            eyrl0 = (eyrl)ibrl0;
            int v = eyrl0.c;
            if((v & 0x80000000) == 0) {
                eyrl0 = new eyrl(this, ibrl0);
            }
            else {
                eyrl0.c = v - 0x80000000;
            }
        }
        else {
            eyrl0 = new eyrl(this, ibrl0);
        }
        Object object0 = eyrl0.a;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(eyrl0.c) {
            case 0: {
                ibnx.b(object0);
                if(!this.j().isEmpty()) {
                    String s = ((exwv)this.j().get(0)).e;
                    eyrl0.c = 1;
                    object0 = this.c.d(s, eyrl0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_22;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_22:
                if(((exwv)object0) != null) {
                    eyrl0.d = (exwv)object0;
                    eyrl0.c = 2;
                    Object object2 = this.e(((exwv)object0), eyrl0);
                    if(object2 != object1) {
                        exwv0 = (exwv)object0;
                        object0 = object2;
                        goto label_33;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                exwv0 = eyrl0.d;
                ibnx.b(object0);
            label_33:
                if(((eybs)object0) != null) {
                    ((ggtj)this.e.h()).B("rangingMethodDecision: %s", ((eybs)object0));
                    exjy exjy0 = ((eybs)object0).b;
                    if((exjy0 == exjy.e || ((eybs)object0).c == exjy.e) && ((eybs)object0).e) {
                        z = true;
                    }
                    eysx eysx0 = null;
                    if(holx.c() && ((eybs)object0).a == exjx.f && z) {
                        eyrf eyrf0 = new eyrf(this, exwv0);
                        eyrg eyrg0 = new eyrg(this);
                        eysx0 = new eysx(eysw.g, null, eyrf0, eyrg0);
                    }
                    else {
                        exjx exjx0 = ((eybs)object0).a;
                        exjx exjx1 = exjx.f;
                        if(exjx0 != exjx1 || !((eybs)object0).e) {
                            if((exjy0 == exjy.c || ((eybs)object0).c == exjy.c) && exjx0 == exjx1) {
                                eyqy eyqy0 = new eyqy(this, exwv0, exjx0);
                                eyqz eyqz0 = new eyqz(this);
                                eysx0 = new eysx(eysw.f, null, eyqy0, eyqz0);
                            }
                        }
                        else if(this.A() == null) {
                            eyrd eyrd0 = new eyrd(this, exwv0);
                            eyre eyre0 = new eyre(this);
                            eysx0 = new eysx(eysw.e, null, eyrd0, eyre0);
                        }
                    }
                    this.v(eysx0);
                    return ibom.a;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object c(exwv exwv0, ibrl ibrl0) {
        eyrm eyrm0;
        if((ibrl0 instanceof eyrm)) {
            eyrm0 = (eyrm)ibrl0;
            int v = eyrm0.c;
            if((v & 0x80000000) == 0) {
                eyrm0 = new eyrm(this, ibrl0);
            }
            else {
                eyrm0.c = v - 0x80000000;
            }
        }
        else {
            eyrm0 = new eyrm(this, ibrl0);
        }
        Object object0 = eyrm0.a;
        Object object1 = ibrx.a;
        switch(eyrm0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.z() == null && !ibuq.m(this.l.a, exwv0.e)) {
                    eyrm0.c = 1;
                    object0 = this.f(eyrm0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_20;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                if(((String)object0) != null && !ibzk.D(((String)object0))) {
                    eyra eyra0 = new eyra(this);
                    this.q(new eysx(eysw.d, ((String)object0), eyra0));
                    return ibom.a;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object e(exwv exwv0, ibrl ibrl0) {
        Map map0 = exkh.c(this.d.a());
        return eycb.i(this.n, exwv0, map0, ibrl0);
    }

    public final Object f(ibrl ibrl0) {
        eyrv eyrv0;
        if((ibrl0 instanceof eyrv)) {
            eyrv0 = (eyrv)ibrl0;
            int v = eyrv0.c;
            if((v & 0x80000000) == 0) {
                eyrv0 = new eyrv(this, ibrl0);
            }
            else {
                eyrv0.c = v - 0x80000000;
            }
        }
        else {
            eyrv0 = new eyrv(this, ibrl0);
        }
        Object object0 = eyrv0.a;
        Object object1 = ibrx.a;
        switch(eyrv0.c) {
            case 0: {
                ibnx.b(object0);
                String s = this.l.a;
                if(s == null) {
                    return null;
                }
                eyrv0.c = 1;
                object0 = this.m.f(s, eyrv0);
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
        return ((DiscoveredDevice)object0) != null ? ((DiscoveredDevice)object0).b : null;
    }

    public final Object g(exwv exwv0, ibrl ibrl0) {
        Object object0 = this.c.l(exwv0, true, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object h(exwv exwv0, ibrl ibrl0) {
        Object object0 = this.c.a.p(exwv0.a, ibrl0);
        ibrx ibrx0 = ibrx.a;
        if(object0 != ibrx0) {
            object0 = ibom.a;
        }
        return object0 == ibrx0 ? object0 : ibom.a;
    }

    public final Object i(exwv exwv0, exjx exjx0, ibrl ibrl0) {
        eyrw eyrw0;
        if((ibrl0 instanceof eyrw)) {
            eyrw0 = (eyrw)ibrl0;
            int v = eyrw0.c;
            if((v & 0x80000000) == 0) {
                eyrw0 = new eyrw(this, ibrl0);
            }
            else {
                eyrw0.c = v - 0x80000000;
            }
        }
        else {
            eyrw0 = new eyrw(this, ibrl0);
        }
        Object object0 = eyrw0.a;
        Object object1 = ibrx.a;
        switch(eyrw0.c) {
            case 0: {
                ibnx.b(object0);
                eyrw0.d = exwv0;
                eyrw0.e = exjx0;
                eyrw0.c = 1;
                object0 = this.k.a(exjx0, exwv0.d, exwp.b, eyrw0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                exjx0 = eyrw0.e;
                exwv0 = eyrw0.d;
                ibnx.b(object0);
            label_23:
                exjm exjm0 = (exjm)object0;
                iccs iccs0 = this.k.b(exwv0.d, exjx0, exwp.b);
                eyrw0.d = exwv0;
                eyrw0.e = null;
                eyrw0.c = 2;
                object0 = iccs0.n(eyrw0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_33;
            }
            case 2: {
                exwv0 = eyrw0.d;
                ibnx.b(object0);
            label_33:
                exod exod0 = ((exwo)object0).b;
                if(exod0 != null) {
                    eyrw0.d = null;
                    eyrw0.c = 3;
                    if(this.c.n(exwv0, exod0, eyrw0) == object1) {
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

    public final List j() {
        return (List)this.g.a(this, eysa.a[0]);
    }

    public final List k() {
        return (List)this.p.a(this, eysa.a[3]);
    }

    public final Set l() {
        return (Set)this.o.a(this, eysa.a[1]);
    }

    public final void m() {
        this.b.a();
    }

    public final void n() {
        this.b.b();
    }

    public final void o() {
        this.w(ibpo.ay(this.j()));
        List list0 = this.j();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            linkedHashMap0.put(object0, this.c.o(((exwv)object0)));
        }
        for(Object object1: linkedHashMap0.entrySet()) {
            exwv exwv0 = (exwv)((Map.Entry)object1).getKey();
            iccs iccs0 = (iccs)((Map.Entry)object1).getValue();
            icbb.b(lsc.a(this), null, null, new eyrx(iccs0, this, exwv0, null), 3);
        }
    }

    public final void p() {
        eysx eysx0;
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        eyed eyed0 = eyee.a(context0);
        if(!this.B().isEmpty()) {
            exwv exwv0 = (exwv)ibpo.R(this.B());
            int v = exwv0.u;
            if(v == 0) {
                throw new IllegalStateException("Required value was null.");
            }
            eyqw eyqw0 = new eyqw(this, exwv0);
            eysx0 = new eysx((v - 1 == 1 ? eysw.a : eysw.b), exwv0.b, eyqw0);
        }
        else if(!this.k().isEmpty()) {
            exwv exwv1 = (exwv)ibpo.R(this.k());
            eyqx eyqx0 = new eyqx(this, exwv1);
            eysx0 = new eysx(eysw.c, exwv1.b, eyqx0);
        }
        else if(this.z() == null) {
            eysx0 = this.A() == null || eyed0 != eyed.g ? null : this.A();
        }
        else {
            eysx0 = this.z();
        }
        icbb.b(lsc.a(this), null, null, new eyry(this, eyed0, eysx0, null), 3);
    }

    public final void q(eysx eysx0) {
        this.q.c(eysa.a[4], eysx0);
    }

    public final void r(boolean z) {
        this.s.c(eysa.a[6], Boolean.valueOf(z));
    }

    public final void v(eysx eysx0) {
        this.r.c(eysa.a[5], eysx0);
    }

    public final void w(Set set0) {
        this.o.c(eysa.a[1], set0);
    }

    public final void x(List list0) {
        this.p.c(eysa.a[3], list0);
    }

    public final boolean y() {
        return this.b.e();
    }

    private final eysx z() {
        return (eysx)this.q.a(this, eysa.a[4]);
    }
}


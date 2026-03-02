import android.content.Context;
import com.google.android.gms.activeunlock.DeviceIdentifier;
import com.google.android.gms.activeunlock.SettingsTileState;
import java.util.List;
import java.util.Map;

public final class eyhy {
    private final exyg a;
    private final exki b;
    private final eycb c;
    private final exuv d;
    private final bboh e;

    public eyhy(exyg exyg0, exki exki0, eycb eycb0, exuv exuv0, bboh bboh0) {
        ibuq.f(exki0, "rangingCapabilityRepository");
        ibuq.f(eycb0, "proximityRepository");
        super();
        this.a = exyg0;
        this.b = exki0;
        this.c = eycb0;
        this.d = exuv0;
        this.e = bboh0;
    }

    public final Object a(ibrl ibrl0) {
        eyhw eyhw0;
        if((ibrl0 instanceof eyhw)) {
            eyhw0 = (eyhw)ibrl0;
            int v = eyhw0.c;
            if((v & 0x80000000) == 0) {
                eyhw0 = new eyhw(this, ibrl0);
            }
            else {
                eyhw0.c = v - 0x80000000;
            }
        }
        else {
            eyhw0 = new eyhw(this, ibrl0);
        }
        Object object0 = eyhw0.a;
        Object object1 = ibrx.a;
        switch(eyhw0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.a.p();
                eyhw0.c = 1;
                object0 = icll.a(icig0, eyhw0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_20;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                exwv exwv0 = (exwv)ibpo.T(((List)object0));
                if(exwv0 == null) {
                    return null;
                }
                Map map0 = exkh.c(this.b.a());
                eyhw0.c = 2;
                Object object2 = eycb.i(this.c, exwv0, map0, eyhw0);
                return object2 == object1 ? object1 : object2;
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

    public final Object b(Context context0, DeviceIdentifier deviceIdentifier0, ibrl ibrl0) {
        int v1;
        Object object6;
        String s2;
        Object object4;
        Object object3;
        eybs eybs0;
        String s;
        eyhx eyhx0;
        if((ibrl0 instanceof eyhx)) {
            eyhx0 = (eyhx)ibrl0;
            int v = eyhx0.e;
            if((v & 0x80000000) == 0) {
                eyhx0 = new eyhx(this, ibrl0);
            }
            else {
                eyhx0.e = v - 0x80000000;
            }
        }
        else {
            eyhx0 = new eyhx(this, ibrl0);
        }
        Object object0 = eyhx0.c;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(eyhx0.e) {
            case 0: {
                ibnx.b(object0);
                s = deviceIdentifier0.a;
                eyed eyed0 = eyee.a(context0);
                ((ggtj)this.e.h()).B("Active Unlock feature availability: %s", eyed0);
                if(!eyed0.h) {
                    return new SettingsTileState(false, "");
                }
                eyhx0.a = context0;
                eyhx0.f = s;
                eyhx0.e = 1;
                object0 = this.a(eyhx0);
                if(object0 != object1) {
                    goto label_31;
                }
                return object1;
            }
            case 1: {
                String s1 = eyhx0.f;
                Object object2 = eyhx0.a;
                ibnx.b(object0);
                s = s1;
                context0 = object2;
            label_31:
                eybs0 = (eybs)object0;
                eyhx0.a = context0;
                eyhx0.f = s;
                eyhx0.g = eybs0;
                eyhx0.e = 2;
                object3 = this.a.d(s, eyhx0);
                if(object3 != object1) {
                    object4 = context0;
                    s2 = s;
                    goto label_49;
                }
                return object1;
            }
            case 2: {
                eybs eybs1 = eyhx0.g;
                String s3 = eyhx0.f;
                Object object5 = eyhx0.a;
                ibnx.b(object0);
                eybs0 = eybs1;
                s2 = s3;
                object4 = object5;
                object3 = object0;
            label_49:
                if(((exwv)object3) != null) {
                    ((ggtj)this.e.h()).R("Active Unlock setting shown for device: %s with ranging method decision: %s", ((exwv)object3).b, String.valueOf(eybs0));
                    return new SettingsTileState(true, eyhv.a(((exwv)object3).b, ((Context)object4), true, eybs0));
                }
                eyhx0.a = object4;
                eyhx0.f = s2;
                eyhx0.g = null;
                eyhx0.e = 3;
                object0 = this.d.c(s2, eyhx0);
                if(object0 != object1) {
                    object6 = object4;
                    goto label_64;
                }
                return object1;
            }
            case 3: {
                s2 = eyhx0.f;
                object4 = eyhx0.a;
                ibnx.b(object0);
                object6 = object4;
            label_64:
                if(!((Boolean)object0).booleanValue()) {
                    ((ggtj)this.e.h()).x("Active Unlock setting not shown due ineligible AD");
                    return new SettingsTileState(false, "");
                }
                ((ggtj)this.e.h()).x("Active Unlock setting shown without enrolled device name and ranging method decision");
                eyhx0.a = object6;
                eyhx0.f = null;
                eyhx0.b = 1;
                eyhx0.e = 4;
                object0 = this.d.b(s2, eyhx0);
                if(object0 != object1) {
                    v1 = 1;
                    break;
                }
                return object1;
            }
            case 4: {
                v1 = eyhx0.b;
                object6 = eyhx0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s4 = ((Boolean)object0).booleanValue() ? eyhv.a(null, ((Context)object6), true, null) : "Connect to phone to set up";
        if(1 == v1) {
            z = true;
        }
        return new SettingsTileState(z, s4);
    }
}


import java.util.ArrayList;
import java.util.List;

public final class bewt {
    private static final bboh a;
    private final beye b;

    static {
        bewt.a = bboh.b("PWMImportConflictDetector", bbcu.cX);
    }

    public bewt(beye beye0) {
        this.b = beye0;
    }

    public final Object a(ibrl ibrl0) {
        bewr bewr0;
        if((ibrl0 instanceof bewr)) {
            bewr0 = (bewr)ibrl0;
            int v = bewr0.c;
            if((v & 0x80000000) == 0) {
                bewr0 = new bewr(this, ibrl0);
            }
            else {
                bewr0.c = v - 0x80000000;
            }
        }
        else {
            bewr0 = new bewr(this, ibrl0);
        }
        Object object0 = bewr0.a;
        Object object1 = ibrx.a;
        switch(bewr0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bewr0.c = 1;
                    object0 = this.b.a(bewr0);
                    if(object0 == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                    }
                    List list0 = (List)object0;
                    goto label_24;
                }
                catch(aztb aztb0) {
                }
                break;
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bewt.a.i(), "Unable to fetch existing passwords to check imported passwords for conflicts", aztb0);
        return null;
    label_24:
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: list0) {
            heqb heqb0 = (heqb)object2;
            String s = heqb0.e;
            ibuq.e(s, "getOrigin(...)");
            bedo bedo0 = bgmt.a(s);
            Object object3 = bedo0 == null ? null : new bewq(((heqb0.b & 0x20) == 0 ? null : heqb0.g), bedo0);
            if(object3 != null) {
                arrayList0.add(object3);
            }
        }
        return new bews(ibpo.ay(arrayList0));
    }
}


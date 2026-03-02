import com.google.android.gms.googleone.StorageQuotaInfo;
import j..time.Instant;
import j..time.temporal.ChronoUnit;
import java.util.Map;
import java.util.UUID;

public final class bufn {
    public final buea a;
    private final buez b;
    private final fgvt c;

    public bufn(buea buea0, buez buez0, buga buga0, fgvt fgvt0) {
        ibuq.f(buea0, "eligibilityDao");
        ibuq.f(buez0, "lastEligibleStorageCardDataStore");
        ibuq.f(buga0, "cooldownMappingProvider");
        ibuq.f(fgvt0, "clock");
        super();
        this.a = buea0;
        this.b = buez0;
        this.c = fgvt0;
    }

    public final Object a(buew buew0, ibrl ibrl0) {
        buds buds0;
        bucn bucn1;
        budu budu0;
        buco buco1;
        bucj bucj4;
        buew buew1;
        buco buco0;
        bucn bucn0;
        bufg bufg0;
        if((ibrl0 instanceof bufg)) {
            bufg0 = (bufg)ibrl0;
            int v = bufg0.c;
            if((v & 0x80000000) == 0) {
                bufg0 = new bufg(this, ibrl0);
            }
            else {
                bufg0.c = v - 0x80000000;
            }
        }
        else {
            bufg0 = new bufg(this, ibrl0);
        }
        Object object0 = bufg0.a;
        Object object1 = ibrx.a;
        switch(bufg0.c) {
            case 0: {
                ibnx.b(object0);
                bufg0.d = buew0;
                bufg0.c = 1;
                object0 = icll.c(((lcc)this.b.a).c, bufg0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                buew0 = bufg0.d;
                ibnx.b(object0);
            label_21:
                buez buez0 = this.b;
                bucl bucl0 = buck.a(((ProtoLiteMessage)bucj.a).v_newBuilder());
                String s = buew0.b;
                ibuq.f(s, "value");
                ProtoLiteBuilder hftp0 = bucl0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bucj bucj0 = (bucj)hftp0.b_message;
                s.getClass();
                bucj0.b = s;
                switch(buew0.d.ordinal()) {
                    case 0: {
                        bucn0 = bucn.a;
                        break;
                    }
                    case 1: {
                        bucn0 = bucn.b;
                        break;
                    }
                    case 2: {
                        bucn0 = bucn.c;
                        break;
                    }
                    case 3: {
                        bucn0 = bucn.d;
                        break;
                    }
                    case 4: {
                        bucn0 = bucn.e;
                        break;
                    }
                    case 5: {
                        bucn0 = bucn.f;
                        break;
                    }
                    case 6: {
                        bucn0 = bucn.g;
                        break;
                    }
                    case 7: {
                        bucn0 = bucn.h;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                ibuq.f(bucn0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bucj bucj1 = (bucj)hftp0.b_message;
                bucj1.c = bucn0.a();
                switch(buew0.c.ordinal()) {
                    case 0: {
                        buco0 = buco.a;
                        break;
                    }
                    case 1: {
                        buco0 = buco.b;
                        break;
                    }
                    case 2: {
                        buco0 = buco.c;
                        break;
                    }
                    case 3: {
                        buco0 = buco.d;
                        break;
                    }
                    case 4: {
                        buco0 = buco.e;
                        break;
                    }
                    case 5: {
                        buco0 = buco.f;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                ibuq.f(buco0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bucj bucj2 = (bucj)hftp0.b_message;
                bucj2.d = buco0.a();
                bucj bucj3 = bucl0.a();
                bufg0.d = buew0;
                bufg0.e = (bucj)object0;
                bufg0.c = 2;
                if(buez0.a(bucj3, bufg0) == object1) {
                    return object1;
                }
                buew1 = buew0;
                bucj4 = (bucj)object0;
                goto label_82;
            }
            case 2: {
                bucj4 = bufg0.e;
                buew1 = bufg0.d;
                ibnx.b(object0);
            label_82:
                if(bucj4 != null) {
                    String s1 = buew1.b;
                    if(ibuq.m(bucj4.b, s1)) {
                        switch(bucj4.d) {
                            case 0: {
                                buco1 = buco.a;
                                break;
                            }
                            case 1: {
                                buco1 = buco.b;
                                break;
                            }
                            case 2: {
                                buco1 = buco.c;
                                break;
                            }
                            case 3: {
                                buco1 = buco.d;
                                break;
                            }
                            case 4: {
                                buco1 = buco.e;
                                break;
                            }
                            case 5: {
                                buco1 = buco.f;
                                break;
                            }
                            default: {
                                buco1 = null;
                            }
                        }
                        if(buco1 == null) {
                            buco1 = buco.g;
                        }
                        ibuq.e(buco1, "getSubscriptionStatus(...)");
                        ibuq.f(buco1, "protoSubscriptionStatus");
                        switch(buco1.ordinal()) {
                            case 0: {
                                budu0 = budu.a;
                                break;
                            }
                            case 1: {
                                budu0 = budu.b;
                                break;
                            }
                            case 2: {
                                budu0 = budu.c;
                                break;
                            }
                            case 3: {
                                budu0 = budu.d;
                                break;
                            }
                            case 4: {
                                budu0 = budu.e;
                                break;
                            }
                            case 5: 
                            case 6: {
                                budu0 = budu.f;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        budu budu1 = buew1.c;
                        if(budu0 == budu1) {
                            switch(bucj4.c) {
                                case 0: {
                                    bucn1 = bucn.a;
                                    break;
                                }
                                case 1: {
                                    bucn1 = bucn.b;
                                    break;
                                }
                                case 2: {
                                    bucn1 = bucn.c;
                                    break;
                                }
                                case 3: {
                                    bucn1 = bucn.d;
                                    break;
                                }
                                case 4: {
                                    bucn1 = bucn.e;
                                    break;
                                }
                                case 5: {
                                    bucn1 = bucn.f;
                                    break;
                                }
                                case 6: {
                                    bucn1 = bucn.g;
                                    break;
                                }
                                case 7: {
                                    bucn1 = bucn.h;
                                    break;
                                }
                                default: {
                                    bucn1 = null;
                                }
                            }
                            if(bucn1 == null) {
                                bucn1 = bucn.i;
                            }
                            ibuq.e(bucn1, "getStorageConsumption(...)");
                            ibuq.f(bucn1, "protoStorageConsumption");
                            switch(bucn1.ordinal()) {
                                case 1: {
                                    buds0 = buds.b;
                                    break;
                                }
                                case 2: {
                                    buds0 = buds.c;
                                    break;
                                }
                                case 3: {
                                    buds0 = buds.d;
                                    break;
                                }
                                case 4: {
                                    buds0 = buds.e;
                                    break;
                                }
                                case 5: {
                                    buds0 = buds.f;
                                    break;
                                }
                                case 6: {
                                    buds0 = buds.g;
                                    break;
                                }
                                case 7: {
                                    buds0 = buds.h;
                                    break;
                                }
                                case 0: 
                                case 8: {
                                    buds0 = buds.a;
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            buds buds1 = buew1.d;
                            if(buds0.compareTo(buds1) > 0) {
                                bufg0.d = null;
                                bufg0.e = null;
                                bufg0.c = 4;
                                return this.a.e(s1, budu1, buds1, bufg0) != object1 ? new budk("Account is at a lower milestone") : object1;
                            }
                        }
                        else {
                            bufg0.d = null;
                            bufg0.e = null;
                            bufg0.c = 3;
                            if(this.a.e(s1, budu1, buew1.d, bufg0) == object1) {
                                return object1;
                            }
                        }
                    }
                }
                return budj.a;
            }
            case 3: {
                ibnx.b(object0);
                return budj.a;
            }
            case 4: {
                ibnx.b(object0);
                return new budk("Account is at a lower milestone");
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(UUID uUID0, ibrl ibrl0) {
        bufh bufh0;
        if((ibrl0 instanceof bufh)) {
            bufh0 = (bufh)ibrl0;
            int v = bufh0.c;
            if((v & 0x80000000) == 0) {
                bufh0 = new bufh(this, ibrl0);
            }
            else {
                bufh0.c = v - 0x80000000;
            }
        }
        else {
            bufh0 = new bufh(this, ibrl0);
        }
        Object object0 = bufh0.a;
        Object object1 = ibrx.a;
        switch(bufh0.c) {
            case 0: {
                ibnx.b(object0);
                bufh0.c = 1;
                object0 = this.a.b(uUID0, bufh0);
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
        return ((buew)object0) != null ? ((buew)object0).b : null;
    }

    public final Object c(budi budi0, ibrl ibrl0) {
        buew buew1;
        Instant instant1;
        budq budq0;
        bufi bufi0;
        if((ibrl0 instanceof bufi)) {
            bufi0 = (bufi)ibrl0;
            int v = bufi0.d;
            if((v & 0x80000000) == 0) {
                bufi0 = new bufi(this, ibrl0);
            }
            else {
                bufi0.d = v - 0x80000000;
            }
        }
        else {
            bufi0 = new bufi(this, ibrl0);
        }
        Object object0 = bufi0.b;
        Object object1 = ibrx.a;
        switch(bufi0.d) {
            case 0: {
                ibnx.b(object0);
                StorageQuotaInfo storageQuotaInfo0 = budi0.b;
                if(storageQuotaInfo0.b == 0L && storageQuotaInfo0.a == 0L && storageQuotaInfo0.c == 0.0) {
                    return new budk("No storage quota info");
                }
                buds buds0 = budr.a(budi0);
                budu budu0 = budt.a(budi0);
                ibuq.f(budu0, "subscriptionStatus");
                Object object2 = ((Map)buga.g.a()).get(budu0);
                if(object2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object object3 = ((Map)object2).get(buds0);
                if(object3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Instant instant0 = this.c.d();
                bufi0.a = (budq)object3;
                bufi0.e = instant0;
                bufi0.d = 1;
                object0 = this.a.a(budi0.a, budu0, buds0, bufi0);
                if(object0 == object1) {
                    return object1;
                }
                budq0 = (budq)object3;
                instant1 = instant0;
                goto label_40;
            }
            case 1: {
                instant1 = bufi0.e;
                budq0 = (budq)bufi0.a;
                ibnx.b(object0);
            label_40:
                Instant instant2 = ((buew)object0).f;
                if(instant2 == null) {
                    instant2 = instant1;
                }
                Instant instant3 = ((buew)object0).g;
                if(instant3 == null) {
                    instant3 = instant1;
                }
                boolean z = budq0.c != null && !ibuq.m(instant3, Instant.MAX) && instant1.minus(7L, ChronoUnit.DAYS).compareTo(instant3) > 0;
                if(((buew)object0).h) {
                    if(z) {
                        buew buew0 = buew.a(((buew)object0), 0, null, this.c.d(), false, 0xBF);
                        bufi0.a = (buew)object0;
                        bufi0.e = null;
                        bufi0.d = 2;
                        if(this.a.d(buew0, bufi0) != object1) {
                            buew1 = (buew)object0;
                            goto label_69;
                        }
                        return object1;
                    }
                    return new budk("Within cooldown");
                }
                if(instant2.plus(7L, ChronoUnit.DAYS).compareTo(instant1) <= 0 && !z) {
                    return new budk("Passive dismissal");
                }
                if(((buew)object0).e >= budq0.b) {
                    return new budk("Max times seen");
                }
                bufi0.a = null;
                bufi0.e = null;
                bufi0.d = 4;
                Object object4 = this.a(((buew)object0), bufi0);
                return object4 == object1 ? object1 : object4;
            }
            case 2: {
                buew1 = (buew)bufi0.a;
                ibnx.b(object0);
            label_69:
                bufi0.a = null;
                bufi0.d = 3;
                Object object5 = this.a(buew1, bufi0);
                return object5 == object1 ? object1 : object5;
            }
            case 3: {
                ibnx.b(object0);
                return object0;
            }
            case 4: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(budi budi0, ibrl ibrl0) {
        bufj bufj0;
        if((ibrl0 instanceof bufj)) {
            bufj0 = (bufj)ibrl0;
            int v = bufj0.c;
            if((v & 0x80000000) == 0) {
                bufj0 = new bufj(this, ibrl0);
            }
            else {
                bufj0.c = v - 0x80000000;
            }
        }
        else {
            bufj0 = new bufj(this, ibrl0);
        }
        Object object0 = bufj0.a;
        Object object1 = ibrx.a;
        switch(bufj0.c) {
            case 0: {
                ibnx.b(object0);
                budu budu0 = budt.a(budi0);
                buds buds0 = budr.a(budi0);
                bufj0.c = 1;
                object0 = this.a.a(budi0.a, budu0, buds0, bufj0);
                return object0 == object1 ? object1 : ((buew)object0).a;
            }
            case 1: {
                ibnx.b(object0);
                return ((buew)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(UUID uUID0, ibrl ibrl0) {
        bufk bufk0;
        if((ibrl0 instanceof bufk)) {
            bufk0 = (bufk)ibrl0;
            int v = bufk0.c;
            if((v & 0x80000000) == 0) {
                bufk0 = new bufk(this, ibrl0);
            }
            else {
                bufk0.c = v - 0x80000000;
            }
        }
        else {
            bufk0 = new bufk(this, ibrl0);
        }
        Object object0 = bufk0.a;
        Object object1 = ibrx.a;
        switch(bufk0.c) {
            case 0: {
                ibnx.b(object0);
                bufk0.c = 1;
                object0 = this.a.b(uUID0, bufk0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(((buew)object0) == null) {
                    throw new IllegalStateException("Invalid cooldown being dismissed");
                }
                Instant instant0 = this.c.d();
                buew buew0 = buew.a(((buew)object0), ((buew)object0).e + 1, null, instant0, true, 0x2F);
                bufk0.c = 2;
                return this.a.d(buew0, bufk0) != object1 ? ibom.a : object1;
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

    public final Object f(budi budi0, ibrl ibrl0) {
        bufl bufl0;
        if((ibrl0 instanceof bufl)) {
            bufl0 = (bufl)ibrl0;
            int v = bufl0.c;
            if((v & 0x80000000) == 0) {
                bufl0 = new bufl(this, ibrl0);
            }
            else {
                bufl0.c = v - 0x80000000;
            }
        }
        else {
            bufl0 = new bufl(this, ibrl0);
        }
        Object object0 = bufl0.a;
        Object object1 = ibrx.a;
        switch(bufl0.c) {
            case 0: {
                ibnx.b(object0);
                buds buds0 = budr.a(budi0);
                budu budu0 = budt.a(budi0);
                bufl0.c = 1;
                object0 = this.a.a(budi0.a, budu0, buds0, bufl0);
                if(object0 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_21:
                if(((buew)object0).f != null) {
                    buew buew0 = buew.a(((buew)object0), 0, null, this.c.d(), false, 0xBF);
                    bufl0.c = 2;
                    return this.a.d(buew0, bufl0) != object1 ? ibom.a : object1;
                }
                buew buew1 = buew.a(((buew)object0), 0, this.c.d(), this.c.d(), false, 0x1F);
                bufl0.c = 3;
                return this.a.d(buew1, bufl0) != object1 ? ibom.a : object1;
            }
            case 2: 
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(ibrl ibrl0) {
        bufm bufm0;
        if((ibrl0 instanceof bufm)) {
            bufm0 = (bufm)ibrl0;
            int v = bufm0.c;
            if((v & 0x80000000) == 0) {
                bufm0 = new bufm(this, ibrl0);
            }
            else {
                bufm0.c = v - 0x80000000;
            }
        }
        else {
            bufm0 = new bufm(this, ibrl0);
        }
        Object object0 = bufm0.a;
        Object object1 = ibrx.a;
        switch(bufm0.c) {
            case 0: {
                ibnx.b(object0);
                bufm0.c = 1;
                buec buec0 = new buec();
                if(oqj.d(((buer)this.a).a, false, true, buec0, bufm0) != object1) {
                    goto label_19;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                bucj bucj0 = buck.a(((ProtoLiteMessage)bucj.a).v_newBuilder()).a();
                bufm0.c = 2;
                return this.b.a(bucj0, bufm0) != object1 ? ibom.a : object1;
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
}


import com.google.android.gms.common.api.Status;
import java.util.Map;

final class ebte extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    long d;
    int e;
    final ebtm f;
    final dygm g;

    public ebte(ebtm ebtm0, dygm dygm0, ibrl ibrl0) {
        this.f = ebtm0;
        this.g = dygm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebte)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebte(this.f, this.g, ibrl0);
    }

    public static final Object d(dyna dyna0, ftgf ftgf0, dyzx dyzx0, dygm dygm0, ebtm ebtm0, long v, ibrl ibrl0) {
        gjlq gjlq2;
        gjlo gjlo2;
        gjlo gjlo1;
        gjlq gjlq1;
        gjly gjly0;
        gjlq gjlq0;
        gjlo gjlo0;
        ebtd ebtd0;
        if((ibrl0 instanceof ebtd)) {
            ebtd0 = (ebtd)ibrl0;
            int v1 = ebtd0.c;
            if((v1 & 0x80000000) == 0) {
                ebtd0 = new ebtd(ibrl0);
            }
            else {
                ebtd0.c = v1 - 0x80000000;
            }
        }
        else {
            ebtd0 = new ebtd(ibrl0);
        }
        Object object0 = ebtd0.b;
        Object object1 = ibrx.a;
        switch(ebtd0.c) {
            case 0: {
                ibnx.b(object0);
                gjlo0 = gjln.a(((ProtoLiteMessage)gjma.a).v_newBuilder());
                gtni gtni0 = dypl.h(dyna0);
                ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
                gjlo0.c(gtni0);
                gjlq0 = gjlp.a(((ProtoLiteMessage)gjlz.a).v_newBuilder());
                switch(ftgf0.ordinal()) {
                    case 2: {
                        gjly0 = gjly.c;
                        break;
                    }
                    case 3: {
                        gjly0 = gjly.d;
                        break;
                    }
                    default: {
                        gjly0 = gjly.a;
                    }
                }
                ibuq.f(gjly0, "value");
                ProtoLiteBuilder hftp0 = gjlq0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gjlz)hftv0).c = gjly0.e;
                ((gjlz)hftv0).b |= 2;
                boolean z = dyzx0.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gjlz)hftv1).b |= 4;
                ((gjlz)hftv1).e = z;
                boolean z1 = dygm0.i;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjlz gjlz0 = (gjlz)hftp0.b_message;
                gjlz0.b |= 8;
                gjlz0.f = z1;
                iccs iccs0 = (iccs)ebtm.b.getAndSet(null);
                if(iccs0 == null) {
                    gjlo1 = gjlo0;
                }
                else {
                    ebtd0.d = ebtm0;
                    ebtd0.e = gjlo0;
                    ebtd0.f = gjlq0;
                    ebtd0.g = gjlq0;
                    ebtd0.h = gjlo0;
                    ebtd0.a = v;
                    ebtd0.c = 1;
                    Object object2 = iccs0.n(ebtd0);
                    if(object2 != object1) {
                        gjlq1 = gjlq0;
                        gjlo1 = gjlo0;
                        object0 = object2;
                        gjlo2 = gjlo1;
                        gjlq2 = gjlq1;
                        goto label_71;
                    }
                    return object1;
                }
                break;
            }
            case 1: {
                v = ebtd0.a;
                gjlo2 = ebtd0.h;
                gjlq2 = ebtd0.g;
                gjlq1 = ebtd0.f;
                gjlo1 = ebtd0.e;
                ebtm0 = ebtd0.d;
                ibnx.b(object0);
            label_71:
                if(((ebuy)object0) != null) {
                    gjlq2.c();
                    gjls gjls0 = gjlr.a(((ProtoLiteMessage)gjlu.a).v_newBuilder());
                    gjls0.c(gjlw.b);
                    long v2 = ((ebuy)object0).a;
                    gjls0.b(((int)(((ebuy)object0).b - v2)));
                    gjlq2.b(gjls0.a());
                    gjlq2.c();
                    gjls gjls1 = gjlr.a(((ProtoLiteMessage)gjlu.a).v_newBuilder());
                    gjls1.c(gjlw.c);
                    gjls1.b(((int)(ebtm0.e - v2)));
                    gjlq2.b(gjls1.a());
                    gjlq2.c();
                    gjls gjls2 = gjlr.a(((ProtoLiteMessage)gjlu.a).v_newBuilder());
                    gjls2.c(gjlw.d);
                    gjls2.b(((int)(v - v2)));
                    gjlq2.b(gjls2.a());
                    if(hwrz.a.f().g()) {
                        if(ebtm0.g == null) {
                            ibuq.j("tapAndPayDataStoreProvider");
                        }
                        gjwt gjwt0 = new dyct().b();
                        if(gjwt0 == null) {
                            ((ggtj)ebtm.a.j()).x("Polling loop info is null");
                        }
                        else {
                            long v3 = v2 - gjwt0.e;
                            fhwb fhwb0 = ebtm0.b();
                            fhvz fhvz0 = fhwa.a(0x377E0);
                            fhvz0.c(fhwp.b(ebtm0.d.b));
                            fhvz0.b(ebss.c(v3, 0, 6));
                            fhwb0.a(fhvz0.a());
                        }
                    }
                }
                gjlo0 = gjlo2;
                gjlq0 = gjlq1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        gjlo0.d(gjlq0.a());
        return gjlo1.a();
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Status status0;
        Object object15;
        long v3;
        Object object14;
        Object object13;
        Object object12;
        Object object11;
        long v1;
        Object object10;
        Object object8;
        Object object7;
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                gmcg gmcg0 = this.f.c();
                dyjt dyjt0 = (gmcg0 instanceof dyjt) ? ((dyjt)gmcg0) : null;
                if(dyjt0 == null) {
                    ((ggtj)ebtm.a.j()).x("The global secure element executor cannot be resumed");
                }
                else {
                    dyjt0.d.lock();
                    try {
                        dyjt0.c = false;
                        dyjt0.e.signalAll();
                    }
                    finally {
                        dyjt0.d.unlock();
                    }
                }
                ebtm ebtm0 = this.f;
                if(new edse(ebtm0.c).c() != edsd.b) {
                    return Status.b;
                }
                dygm dygm0 = this.g;
                String s = dygm0.b;
                ibuq.e(s, "getServiceId(...)");
                switch(s) {
                    case "SV000006": {
                        object2 = dyna.f;
                        break;
                    }
                    case "SV000011": {
                        object2 = dyna.d;
                        break;
                    }
                    case "SV000013": {
                        object2 = dyna.b;
                        break;
                    }
                    case "SV000024": {
                        object2 = dyna.g;
                        break;
                    }
                    case "SV000027": {
                        object2 = dyna.e;
                        break;
                    }
                    case "SV000075": {
                        object2 = dyna.c;
                        break;
                    }
                    case "SV000253": {
                        object2 = dyna.h;
                        break;
                    }
                    default: {
                        object2 = dyna.a;
                    }
                }
                try {
                    Map map0 = ebtm0.p;
                    if(map0 == null) {
                        ibuq.j("cardIdMappers");
                        map0 = null;
                    }
                    ibnf ibnf0 = (ibnf)map0.get(object2);
                    if(ibnf0 == null) {
                        object5 = null;
                    }
                    else {
                        dyzy dyzy0 = (dyzy)ibnf0.get();
                        if(dyzy0 == null) {
                            object5 = null;
                        }
                        else {
                            byte[] arr_b = dygm0.c.toByteArray();
                            ibuq.e(arr_b, "toByteArray(...)");
                            byte[] arr_b1 = dygm0.d.toByteArray();
                            ibuq.e(arr_b1, "toByteArray(...)");
                            this.a = object2;
                            this.e = 1;
                            object3 = dyzy0.a(arr_b, arr_b1, this);
                            if(object3 != object1) {
                                object4 = object2;
                                object5 = (dyzx)object3;
                                goto label_73;
                            }
                            return object1;
                        }
                    }
                    goto label_74;
                }
                catch(Throwable throwable0) {
                    object4 = object2;
                    object5 = ibnx.a(throwable0);
                    goto label_73;
                }
                try {
                    object4 = object2;
                    object5 = (dyzx)object3;
                    goto label_73;
                }
                catch(Throwable throwable0) {
                    goto label_72;
                }
                try {
                    object5 = null;
                    goto label_74;
                }
                catch(Throwable throwable0) {
                    object4 = object2;
                    object5 = ibnx.a(throwable0);
                    goto label_73;
                }
            }
            case 1: {
                try {
                    object4 = this.a;
                    ibnx.b(object0);
                    object5 = (dyzx)object0;
                }
                catch(Throwable throwable0) {
                label_72:
                    object5 = ibnx.a(throwable0);
                }
            label_73:
                object2 = object4;
            label_74:
                Throwable throwable1 = ibnw.a(object5);
                if(throwable1 != null) {
                    a.ae(ebtm.a.j(), "Exception thrown during card id mapping", throwable1);
                    object5 = null;
                }
                object6 = (dyzx)object5;
                if(object6 == null) {
                    ((ggtj)ebtm.a.h()).x("The request does not map to an associated card");
                    return Status.b;
                }
                this.a = object2;
                this.b = object6;
                this.e = 2;
                object7 = this.f.g(this);
                if(object7 == object1) {
                    return object1;
                }
                object8 = object2;
                goto label_94;
            }
            case 2: {
                object6 = this.b;
                Object object9 = this.a;
                ibnx.b(object0);
                object8 = object9;
                object7 = object0;
            label_94:
                ebtm ebtm1 = this.f;
                object10 = (ftgf)object7;
                ebtm1.m();
                v1 = System.currentTimeMillis();
                if(new hfuh(hwrz.e().c, dync.a).contains(object8)) {
                    goto label_125;
                }
                else if(!hwrz.g()) {
                    if(object10 == ftgf.c) {
                    label_103:
                        this.a = object8;
                        this.b = object6;
                        this.c = object10;
                        this.d = v1;
                        this.e = 3;
                        object11 = ebtm1.e(v1, this);
                        if(object11 == object1) {
                            return object1;
                        }
                        object12 = object6;
                        object13 = object10;
                        goto label_120;
                    }
                    else {
                        goto label_125;
                    }
                }
                else if(object10 != ftgf.d) {
                    goto label_103;
                }
                else {
                    goto label_125;
                }
                goto label_128;
            }
            case 3: {
                long v2 = this.d;
                object13 = this.c;
                object12 = this.b;
                object8 = this.a;
                ibnx.b(object0);
                v1 = v2;
                object11 = object0;
            label_120:
                if(((Boolean)object11).booleanValue()) {
                    object10 = object13;
                    object6 = object12;
                label_125:
                    object14 = object6;
                    object13 = object10;
                    z = false;
                }
                else {
                    object14 = object12;
                }
            label_128:
                v3 = v1;
                if(z) {
                    this.a = object8;
                    this.b = object14;
                    this.c = object13;
                    this.d = v3;
                    this.e = 4;
                    object15 = this.f.h(this.g, ((dyna)object8), ((dyzx)object14).b, this);
                    if(object15 == object1) {
                        return object1;
                    }
                    status0 = (Status)object15;
                    break;
                }
                else {
                    status0 = Status.b;
                }
                break;
            }
            case 4: {
                v3 = this.d;
                object13 = this.c;
                Object object16 = this.b;
                Object object17 = this.a;
                ibnx.b(object0);
                object8 = object17;
                object14 = object16;
                object15 = object0;
                status0 = (Status)object15;
                break;
            }
            default: {
                ibnx.b(object0);
                return object0;
            }
        }
        ibrt ibrt0 = this.f.j();
        ebtc ebtc0 = new ebtc(this.f, this.g, ((dyna)object8), ((dyzx)object14), status0, ((ftgf)object13), v3, null);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = 5;
        Object object18 = icbd.a(ibrt0, ebtc0, this);
        return object18 == object1 ? object1 : object18;
    }
}


import java.util.concurrent.TimeUnit;

public final class dxfz implements dxfs {
    private static final long a;
    private static final long b;
    private static final bboh c;
    private final fgvt d;
    private final dyaj e;
    private final fhwb f;
    private final fzye g;

    static {
        dxfz.a = TimeUnit.MINUTES.toMillis(5L);
        dxfz.b = TimeUnit.HOURS.toMillis(23L);
        dxfz.c = bboh.b("Pay", bbcu.cZ);
    }

    public dxfz(fzye fzye0, fgvt fgvt0, dyaj dyaj0, fhwb fhwb0) {
        ibuq.f(fgvt0, "clock");
        super();
        this.g = fzye0;
        this.d = fgvt0;
        this.e = dyaj0;
        this.f = fhwb0;
    }

    @Override  // dxfs
    public final Object a(String s, ibrl ibrl0) {
        dxfw dxfw0;
        if((ibrl0 instanceof dxfw)) {
            dxfw0 = (dxfw)ibrl0;
            int v = dxfw0.c;
            if((v & 0x80000000) == 0) {
                dxfw0 = new dxfw(this, ibrl0);
            }
            else {
                dxfw0.c = v - 0x80000000;
            }
        }
        else {
            dxfw0 = new dxfw(this, ibrl0);
        }
        Object object0 = dxfw0.a;
        Object object1 = ibrx.a;
        switch(dxfw0.c) {
            case 0: {
                ibnx.b(object0);
                dxfw0.c = 1;
                Object object2 = this.f(s, dxfw0);
                return object2 == object1 ? object1 : object2;
            }
            case 1: {
                ibnx.b(object0);
                return ((ibnw)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // dxfs
    public final Object b(ibrl ibrl0) {
        dxfy dxfy0;
        if((ibrl0 instanceof dxfy)) {
            dxfy0 = (dxfy)ibrl0;
            int v = dxfy0.c;
            if((v & 0x80000000) == 0) {
                dxfy0 = new dxfy(this, ibrl0);
            }
            else {
                dxfy0.c = v - 0x80000000;
            }
        }
        else {
            dxfy0 = new dxfy(this, ibrl0);
        }
        Object object0 = dxfy0.a;
        Object object1 = ibrx.a;
        switch(dxfy0.c) {
            case 0: {
                ibnx.b(object0);
                dxfy0.c = 1;
                Object object2 = this.c(null, dxfy0);
                return object2 == object1 ? object1 : Boolean.valueOf(ibnw.b(object2));
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(ibnw.b(((ibnw)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(String s, ibrl ibrl0) {
        Object object4;
        Object object2;
        dxft dxft0;
        if((ibrl0 instanceof dxft)) {
            dxft0 = (dxft)ibrl0;
            int v = dxft0.d;
            if((v & 0x80000000) == 0) {
                dxft0 = new dxft(this, ibrl0);
            }
            else {
                dxft0.d = v - 0x80000000;
            }
        }
        else {
            dxft0 = new dxft(this, ibrl0);
        }
        Object object0 = dxft0.b;
        Object object1 = ibrx.a;
        switch(dxft0.d) {
            case 0: {
                ibnx.b(object0);
                fzxy fzxy0 = fzxz.a();
                fzxy0.b(0x36DE6E2435L);
                fzxy0.a = s;
                fzxz fzxz0 = fzxy0.a();
                evql evql0 = this.g.a(fzxz0);
                dxft0.a = s;
                dxft0.d = 1;
                object2 = fsdk.a(evql0, dxft0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 1: {
                s = (String)dxft0.a;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_27:
                if(ibnw.b(object2) && !ibuq.m(((fzys)object2).b(), s)) {
                    String s1 = ((fzys)object2).b();
                    ibuq.e(s1, "getSessionId(...)");
                    long v1 = dxfz.g(this.d);
                    dxft0.a = object2;
                    dxft0.d = 2;
                    dyaj dyaj0 = this.e;
                    dxfr dxfr0 = dxfq.a(((ProtoLiteMessage)dxfp.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxfn.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dxfn dxfn0 = (dxfn)hftp0.b_message;
                    dxfn0.b |= 1;
                    dxfn0.c = v1;
                    ibuq.f(s1, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dxfn dxfn1 = (dxfn)hftp0.b_message;
                    s1.getClass();
                    dxfn1.b |= 2;
                    dxfn1.d = s1;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((dxfn)hftv0), "value");
                    ProtoLiteBuilder hftp1 = dxfr0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dxfp dxfp0 = (dxfp)hftp1.b_message;
                    ((dxfn)hftv0).getClass();
                    dxfp0.c = (dxfn)hftv0;
                    dxfp0.b |= 1;
                    Object object3 = dyaj0.b(dxfr0.a(), dxft0);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                    if(object3 == object1) {
                        return object1;
                    }
                }
                object4 = object2;
                break;
            }
            case 2: {
                object4 = dxft0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object4);
        if(throwable0 != null) {
            ((ggtj)dxfz.c.i()).B("Error preparing PIA token", throwable0);
        }
        return object4;
    }

    public final Object d(ibrl ibrl0) {
        dxfu dxfu0;
        if((ibrl0 instanceof dxfu)) {
            dxfu0 = (dxfu)ibrl0;
            int v = dxfu0.c;
            if((v & 0x80000000) == 0) {
                dxfu0 = new dxfu(this, ibrl0);
            }
            else {
                dxfu0.c = v - 0x80000000;
            }
        }
        else {
            dxfu0 = new dxfu(this, ibrl0);
        }
        Object object0 = dxfu0.a;
        Object object1 = ibrx.a;
        switch(dxfu0.c) {
            case 0: {
                ibnx.b(object0);
                dxfu0.c = 1;
                object0 = this.e.a(dxfu0);
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
        Object object2 = ((dxfp)object0).c;
        if(object2 == null) {
            object2 = dxfn.a;
        }
        ibuq.e(object2, "getIntegrityApiSessionId(...)");
        return object2;
    }

    public final Object e(ibrl ibrl0) {
        dxfv dxfv0;
        if((ibrl0 instanceof dxfv)) {
            dxfv0 = (dxfv)ibrl0;
            int v = dxfv0.c;
            if((v & 0x80000000) == 0) {
                dxfv0 = new dxfv(this, ibrl0);
            }
            else {
                dxfv0.c = v - 0x80000000;
            }
        }
        else {
            dxfv0 = new dxfv(this, ibrl0);
        }
        Object object0 = dxfv0.a;
        Object object1 = ibrx.a;
        switch(dxfv0.c) {
            case 0: {
                ibnx.b(object0);
                dxfv0.c = 1;
                object0 = this.e.a(dxfv0);
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
        Object object2 = ((dxfp)object0).d;
        if(object2 == null) {
            object2 = dxfo.a;
        }
        ibuq.e(object2, "getIntegrityToken(...)");
        return object2;
    }

    public final Object f(String s, ibrl ibrl0) {
        Object object6;
        Object object4;
        Object object3;
        String s6;
        Object object1;
        String s1;
        dxfx dxfx0;
        if((ibrl0 instanceof dxfx)) {
            dxfx0 = (dxfx)ibrl0;
            int v = dxfx0.d;
            if((v & 0x80000000) == 0) {
                dxfx0 = new dxfx(this, ibrl0);
            }
            else {
                dxfx0.d = v - 0x80000000;
            }
        }
        else {
            dxfx0 = new dxfx(this, ibrl0);
        }
        Object object0 = dxfx0.b;
        ibrx ibrx0 = ibrx.a;
        switch(dxfx0.d) {
            case 0: {
                ibnx.b(object0);
                s1 = s;
                dxfx0.a = s1;
                dxfx0.d = 1;
                object1 = this.e(dxfx0);
                if(object1 == ibrx0) {
                    return ibrx0;
                }
                goto label_24;
            }
            case 1: {
                String s2 = (String)dxfx0.a;
                ibnx.b(object0);
                object1 = object0;
                s1 = s2;
            label_24:
                fgvt fgvt0 = this.d;
                long v1 = dxfz.g(fgvt0);
                String s3 = ((dxfo)object1).d;
                ibuq.e(s3, "getToken(...)");
                if(s3.length() > 0) {
                    long v2 = ((dxfo)object1).c;
                    if(v1 > v2 && v1 - v2 < dxfz.a && ibuq.m(((dxfo)object1).e, s1)) {
                        fhwb fhwb0 = this.f;
                        fhvz fhvz0 = fhwa.a(0x40BA1);
                        fhvz0.c(fhwp.c());
                        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                        gjir gjir0 = gjiq.a(((ProtoLiteMessage)gjcj.a).v_newBuilder());
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjcg.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        String s4 = ((dxfo)object1).d;
                        ibuq.e(s4, "getToken(...)");
                        ibuq.f(s4, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjcg gjcg0 = (gjcg)hftp0.b_message;
                        s4.getClass();
                        gjcg0.b |= 1;
                        gjcg0.c = s4;
                        String s5 = ((dxfo)object1).e;
                        ibuq.e(s5, "getRequestHash(...)");
                        ibuq.f(s5, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjcg gjcg1 = (gjcg)hftp0.b_message;
                        s5.getClass();
                        gjcg1.b |= 4;
                        gjcg1.e = s5;
                        long v3 = dxfz.g(fgvt0) - ((dxfo)object1).c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjcg gjcg2 = (gjcg)hftp0.b_message;
                        gjcg2.b |= 2;
                        gjcg2.d = v3;
                        ProtoLiteMessage hftv0 = hftp0.N_build();
                        ibuq.e(hftv0, "build(...)");
                        ibuq.f(((gjcg)hftv0), "value");
                        ProtoLiteBuilder hftp1 = gjir0.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjcj gjcj0 = (gjcj)hftp1.b_message;
                        ((gjcg)hftv0).getClass();
                        gjcj0.c = (gjcg)hftv0;
                        gjcj0.b = 3;
                        gjca0.e(gjir0.a());
                        fhvz0.b(fsdn.a(gjca0.a()));
                        fhwb0.a(fhvz0.a());
                        return ((dxfo)object1).d;
                    }
                }
                dxfx0.a = s1;
                dxfx0.d = 2;
                Object object2 = this.d(dxfx0);
                if(object2 == ibrx0) {
                    return ibrx0;
                }
                s6 = s1;
                object0 = object2;
                goto label_85;
            }
            case 2: {
                s6 = (String)dxfx0.a;
                ibnx.b(object0);
            label_85:
                long v4 = dxfz.g(this.d);
                String s7 = ((dxfn)object0).d;
                ibuq.e(s7, "getSessionId(...)");
                String s8 = null;
                if(s7.length() > 0) {
                    long v5 = ((dxfn)object0).c;
                    if(v5 > 0L && v4 > v5 && v4 - v5 <= dxfz.b) {
                        s8 = ((dxfn)object0).d;
                    }
                }
                dxfx0.a = s6;
                dxfx0.d = 3;
                object3 = this.c(s8, dxfx0);
                if(object3 == ibrx0) {
                    return ibrx0;
                }
                goto label_101;
            }
            case 3: {
                s6 = (String)dxfx0.a;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
            label_101:
                if((object3 instanceof ibnv)) {
                    Throwable throwable0 = ibnw.a(object3);
                    if(throwable0 == null) {
                        throwable0 = new IllegalStateException("Failed to prepare the integrity token");
                    }
                    return ibnx.a(throwable0);
                }
                if(((fzys)object3) == null) {
                    return ibnx.a(new IllegalStateException("Failed to prepare the integrity token"));
                }
                fzyb fzyb0 = fzyc.a();
                fzyb0.a = s6;
                evql evql0 = ((fzys)object3).a(fzyb0.a());
                dxfx0.a = s6;
                dxfx0.d = 4;
                object4 = fsdk.a(evql0, dxfx0);
                if(object4 == ibrx0) {
                    return ibrx0;
                }
                goto label_119;
            }
            case 4: {
                s6 = (String)dxfx0.a;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
            label_119:
                if(ibnw.b(object4)) {
                    String s9 = ((fzya)object4).a;
                    fhwb fhwb1 = this.f;
                    long v6 = dxfz.g(this.d);
                    fhvz fhvz1 = fhwa.a(0x40BA1);
                    fhvz1.c(fhwp.c());
                    ibuq.c(s9);
                    gjca gjca1 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                    gjir gjir1 = gjiq.a(((ProtoLiteMessage)gjcj.a).v_newBuilder());
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjch.a).v_newBuilder();
                    ibuq.f(hftp2, "builder");
                    ibuq.f(s9, "value");
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gjch gjch0 = (gjch)hftp2.b_message;
                    s9.getClass();
                    gjch0.b |= 1;
                    gjch0.c = s9;
                    ibuq.f(s6, "value");
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gjch gjch1 = (gjch)hftp2.b_message;
                    s6.getClass();
                    gjch1.b |= 2;
                    gjch1.d = s6;
                    ProtoLiteMessage hftv1 = hftp2.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ibuq.f(((gjch)hftv1), "value");
                    ProtoLiteBuilder hftp3 = gjir1.a;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gjcj gjcj1 = (gjcj)hftp3.b_message;
                    ((gjch)hftv1).getClass();
                    gjcj1.c = (gjch)hftv1;
                    gjcj1.b = 1;
                    gjca1.e(gjir1.a());
                    fhvz1.b(fsdn.a(gjca1.a()));
                    fhwb1.a(fhvz1.a());
                    dxfx0.a = object4;
                    dxfx0.d = 5;
                    dyaj dyaj0 = this.e;
                    dxfr dxfr0 = dxfq.a(((ProtoLiteMessage)dxfp.a).v_newBuilder());
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)dxfo.a).v_newBuilder();
                    ibuq.f(hftp4, "builder");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    dxfo dxfo0 = (dxfo)hftp4.b_message;
                    dxfo0.b |= 1;
                    dxfo0.c = v6;
                    ibuq.f(s9, "value");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    dxfo dxfo1 = (dxfo)hftp4.b_message;
                    s9.getClass();
                    dxfo1.b |= 2;
                    dxfo1.d = s9;
                    ibuq.f(s6, "value");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    dxfo dxfo2 = (dxfo)hftp4.b_message;
                    s6.getClass();
                    dxfo2.b |= 4;
                    dxfo2.e = s6;
                    ProtoLiteMessage hftv2 = hftp4.N_build();
                    ibuq.e(hftv2, "build(...)");
                    ibuq.f(((dxfo)hftv2), "value");
                    ProtoLiteBuilder hftp5 = dxfr0.a;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    dxfp dxfp0 = (dxfp)hftp5.b_message;
                    ((dxfo)hftv2).getClass();
                    dxfp0.d = (dxfo)hftv2;
                    dxfp0.b |= 2;
                    Object object5 = dyaj0.b(dxfr0.a(), dxfx0);
                    if(object5 != ibrx0) {
                        object5 = ibom.a;
                    }
                    if(object5 == ibrx0) {
                        return ibrx0;
                    }
                }
                object6 = object4;
                break;
            }
            case 5: {
                object6 = dxfx0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object6);
        if(throwable1 != null) {
            ((ggtj)dxfz.c.i()).B("Error requesting PIA token", throwable1);
        }
        if(ibnw.b(object6)) {
            try {
                return ((fzya)object6).a;
            }
            catch(Throwable throwable2) {
                return ibnx.a(throwable2);
            }
        }
        return object6;
    }

    private static final long g(fgvt fgvt0) {
        return fgvt0.d().toEpochMilli();
    }
}


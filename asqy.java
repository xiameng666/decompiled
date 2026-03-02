import android.content.Context;

public final class asqy {
    private final Context a;
    private final aqso b;
    private final asxf c;
    private final assq d;
    private final assd e;
    private final ibrt f;
    private final asrm g;

    public asqy(Context context0, aqso aqso0, asxf asxf0, assq assq0, assd assd0, ibrt ibrt0, asrm asrm0) {
        this.a = context0;
        this.b = aqso0;
        this.c = asxf0;
        this.d = assq0;
        this.e = assd0;
        this.f = ibrt0;
        this.g = asrm0;
    }

    public final Object a(ibrl ibrl0) {
        asqw asqw0;
        if((ibrl0 instanceof asqw)) {
            asqw0 = (asqw)ibrl0;
            int v = asqw0.c;
            if((v & 0x80000000) == 0) {
                asqw0 = new asqw(this, ibrl0);
            }
            else {
                asqw0.c = v - 0x80000000;
            }
        }
        else {
            asqw0 = new asqw(this, ibrl0);
        }
        Object object0 = asqw0.a;
        Object object1 = ibrx.a;
        switch(asqw0.c) {
            case 0: {
                ibnx.b(object0);
                asqw0.c = 1;
                object0 = this.g.a(asqw0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                hfwn hfwn0 = ((asrb)object0).c;
                if(hfwn0 == null) {
                    hfwn0 = hfwn.a;
                }
                if(((ProtoLiteMessage)hfwn0).isInitialized()) {
                    hfwn hfwn1 = ((asrb)object0).c;
                    if(hfwn1 == null) {
                        hfwn1 = hfwn.a;
                    }
                    if(!ibuq.m(hfwn1, hfwo.a(((ProtoLiteMessage)hfwn.a).v_newBuilder()).a())) {
                        return (asrb)object0;
                    }
                }
                asqw0.c = 2;
                asrj asrj0 = new asrj(new asri());
                Object object2 = icpu.c(this.g.b.b(asrj0, this.g.a), asqw0);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
                goto label_36;
            }
            case 2: {
                ibnx.b(object0);
            label_36:
                asqw0.c = 3;
                Object object3 = this.g.a(asqw0);
                return object3 == object1 ? object1 : object3;
            }
            case 3: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(ibrl ibrl0) {
        int v4;
        int v3;
        int v2;
        asqp asqp2;
        ProtoLiteBuilder hftp2;
        Object object3;
        asqp asqp0;
        ProtoLiteBuilder hftp0;
        asqx asqx0;
        if((ibrl0 instanceof asqx)) {
            asqx0 = (asqx)ibrl0;
            int v = asqx0.c;
            if((v & 0x80000000) == 0) {
                asqx0 = new asqx(this, ibrl0);
            }
            else {
                asqx0.c = v - 0x80000000;
            }
        }
        else {
            asqx0 = new asqx(this, ibrl0);
        }
        Object object0 = asqx0.a;
        Object object1 = ibrx.a;
        switch(asqx0.c) {
            case 0: {
                ibnx.b(object0);
                fpwv fpwv0 = aqru.a(this.a);
                hftp0 = ((ProtoLiteMessage)ghzy.a).v_newBuilder();
                ibuq.e(hftp0, "newBuilder(...)");
                asqx0.e = hftp0;
                asqx0.c = 1;
                asqk asqk0 = new asqk(this.a, this.b, fpwv0, this.c, this.f, null);
                object0 = icbd.a(this.f, asqk0, asqx0);
                if(object0 != object1) {
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                hftp0 = asqx0.e;
                ibnx.b(object0);
            label_25:
                asqx0.e = hftp0;
                asqx0.d = (asqp)object0;
                asqx0.c = 2;
                Object object2 = this.a(asqx0);
                if(object2 != object1) {
                    asqp0 = (asqp)object0;
                    object0 = object2;
                    goto label_38;
                }
                return object1;
            }
            case 2: {
                asqp asqp1 = asqx0.d;
                ProtoLiteBuilder hftp1 = asqx0.e;
                ibnx.b(object0);
                asqp0 = asqp1;
                hftp0 = hftp1;
            label_38:
                hfwn hfwn0 = ((asrb)object0).c;
                if(hfwn0 == null) {
                    hfwn0 = hfwn.a;
                }
                if(hfwn0 != null) {
                    long v1 = hfyn.b(hfwn0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghzy ghzy0 = (ghzy)hftp0.b_message;
                    ghzy0.b |= 1;
                    ghzy0.c = v1;
                }
                asqx0.e = hftp0;
                asqx0.d = asqp0;
                asqx0.c = 3;
                if(!hqgu.e()) {
                    object3 = this.e.c(asqp0, ((asrb)object0), hftp0, asqx0);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                }
                else if(asqp0.d != ghzs.c) {
                    object3 = this.d.d(asqp0, ((asrb)object0), hftp0, asqx0);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                }
                else {
                    object3 = ibom.a;
                }
                if(object3 != object1) {
                    hftp2 = hftp0;
                    asqp2 = asqp0;
                    break;
                }
                return object1;
            }
            case 3: {
                asqp2 = asqx0.d;
                hftp2 = asqx0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ggtj ggtj0 = (ggtj)asqp.a.h();
        boolean z = asqp2.b;
        fpwl fpwl0 = asqp2.c;
        ghzs ghzs0 = asqp2.d;
        ggtj0.aa("isAndroidBackupEnabled %s photosApkState %s photosBackupState %s gmsCoreNotificationState %s isPhotosOptInShownInSuw %s storageQuotaInfo %s", Boolean.valueOf(z), fpwl0, asqp2.e, ghzs0, asqp2.f, asqp2.g);
        ibuq.f(hftp2, "eventBuilder");
        aqvj aqvj0 = asqp2.e;
        if(aqvj0 == null) {
            v2 = 0;
        }
        else {
            switch(aqvj0.ordinal()) {
                case 0: {
                    v2 = 2;
                    break;
                }
                case 1: {
                    v2 = 3;
                    break;
                }
                case 2: {
                    v2 = 4;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        switch(fpwl0.ordinal()) {
            case 0: {
                v3 = 2;
                break;
            }
            case 1: {
                v3 = 3;
                break;
            }
            case 2: {
                v3 = 6;
                break;
            }
            case 3: {
                v3 = 4;
                break;
            }
            case 4: {
                v3 = 5;
                break;
            }
            case 5: {
                v3 = 7;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghzw.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((ghzw)hftv0).b |= 2;
        ((ghzw)hftv0).d = z;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((ghzw)hftv1).e = v3 - 1;
        ((ghzw)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((ghzw)hftv2).c = ghzs0.e;
        ((ghzw)hftv2).b |= 1;
        if(v2 != 0) {
            if(!hftv2.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((ghzw)hftp3.b_message).f = v2 - 1;
            ((ghzw)hftp3.b_message).b |= 8;
        }
        ghzu ghzu0 = asqp2.f;
        if(ghzu0 != null) {
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((ghzw)hftp3.b_message).g = ghzu0.e;
            ((ghzw)hftp3.b_message).b |= 16;
        }
        gfsx gfsx0 = asqp2.g;
        if(gfsx0 == null) {
            v4 = 0;
        }
        else if(gfsx0.i()) {
            arzs arzs0 = (arzs)gfsx0.d();
            long v5 = arzs0.c;
            if(v5 == -1L) {
                v4 = 5;
            }
            else {
                v4 = arzs0.d >= v5 ? 3 : 2;
            }
        }
        else {
            v4 = 4;
        }
        if(v4 != 0) {
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((ghzw)hftp3.b_message).h = v4 - 1;
            ((ghzw)hftp3.b_message).b |= 0x20;
        }
        ghzw ghzw0 = (ghzw)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghzy ghzy1 = (ghzy)hftp2.b_message;
        ghzw0.getClass();
        ghzy1.d = ghzw0;
        ghzy1.b |= 2;
        asqq asqq0 = new asqq(this.a);
        ProtoLiteMessage hftv3 = hftp2.N_build();
        ibuq.e(hftv3, "build(...)");
        ibuq.f(((ghzy)hftv3), "event");
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp4.b_message;
        ((ghzy)hftv3).getClass();
        ghys0.aw = (ghzy)hftv3;
        ghys0.d |= 0x2000000;
        ProtoLiteMessage hftv4 = hftp4.N_build();
        ibuq.e(hftv4, "build(...)");
        asqq0.a(((ghys)hftv4), ghyr.aK);
        return ibom.a;
    }
}


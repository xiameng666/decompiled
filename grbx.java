import java.util.Collection;

public final class grbx {
    public final bggs a;
    public final icta b;
    private final hfjo c;

    public grbx(bggs bggs0) {
        this.a = bggs0;
        this.c = hfjo.c(grcf.a);
        this.b = new icta();
    }

    public final Object a(String s, grdf grdf0, grck grck0, ibtw ibtw0, ibtw ibtw1, ibrl ibrl0) {
        grcx grcx1;
        grch grch1;
        grcm grcm1;
        ByteString hfsf0;
        grcm grcm0;
        String s2;
        grck grck1;
        ibtw ibtw2;
        grbt grbt0;
        grdf grdf1 = grdf0;
        if((ibrl0 instanceof grbt)) {
            grbt0 = (grbt)ibrl0;
            int v = grbt0.f;
            if((v & 0x80000000) == 0) {
                grbt0 = new grbt(this, ibrl0);
            }
            else {
                grbt0.f = v - 0x80000000;
            }
        }
        else {
            grbt0 = new grbt(this, ibrl0);
        }
        Object object0 = grbt0.d;
        Object object1 = ibrx.a;
        switch(grbt0.f) {
            case 0: {
                ibnx.b(object0);
                String s1 = grcj.a(s);
                if(grdf1.a.length() != 0) {
                    ibuq.c(s1);
                    if(s1.length() != 0) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grcl.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        grda grda0 = grcz.a(((ProtoLiteMessage)grcy.a).v_newBuilder());
                        grda0.c();
                        grda0.b(hfxt.a(grcj.c(s1)));
                        grcy grcy0 = grda0.a();
                        ibuq.f(grcy0, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        grcl grcl0 = (grcl)hftp0.b_message;
                        grcy0.getClass();
                        grcl0.c = grcy0;
                        grcl0.b |= 1;
                        ibuq.f(grck0, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        grcl grcl1 = (grcl)hftp0.b_message;
                        grcl1.d = grck0.a();
                        ProtoLiteMessage hftv0 = hftp0.N_build();
                        ibuq.e(hftv0, "build(...)");
                        grbt0.a = grdf1;
                        grbt0.b = grck0;
                        grbt0.c = ibtw1;
                        grbt0.g = s1;
                        grbt0.f = 1;
                        object0 = iccl.a(new grbw(this, this.a.a, ((grcl)hftv0), ibtw0, null), grbt0);
                        if(object0 == object1) {
                            return object1;
                        }
                        ibtw2 = ibtw1;
                        grck1 = grck0;
                        s2 = s1;
                        goto label_56;
                    }
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                s2 = grbt0.g;
                ibtw2 = (ibtw)grbt0.c;
                grck1 = (grck)grbt0.b;
                grdf1 = (grdf)grbt0.a;
                ibnx.b(object0);
            label_56:
                grcm0 = (grcm)object0;
                ibuq.c(s2);
                grch grch0 = grcg.a(s2, grdf1);
                grbs grbs0 = (grbs)this.a.b.d(grch0);
                grcx grcx0 = grcm0.c == null ? grcx.a : grcm0.c;
                ibuq.e(grcx0, "getServerCryptoContext(...)");
                if(grbs0 != null && ibuq.m(grbs0.b, grcx0.b)) {
                    hfsf0 = grbs0.a;
                }
                else {
                    byte[] arr_b = grcj.d(s2, grdf1);
                    ibuq.e(arr_b, "hashUsernamePasswordPair(...)");
                    ByteString hfsf1 = hfxt.a(arr_b);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grcv.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    grda grda1 = grcz.a(((ProtoLiteMessage)grcy.a).v_newBuilder());
                    grda1.c();
                    grda1.b(hfxt.a(grcj.c(s2)));
                    grcy grcy1 = grda1.a();
                    ibuq.f(grcy1, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grcv grcv0 = (grcv)hftp1.b_message;
                    grcy1.getClass();
                    grcv0.d = grcy1;
                    grcv0.b |= 1;
                    byte[] arr_b1 = hfsf1.toByteArray();
                    ByteString hfsf2 = hfxt.a(this.c.b(arr_b1));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((grcv)hftp1.b_message).c = hfsf2;
                    ibuq.f(grcx0, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grcv grcv1 = (grcv)hftp1.b_message;
                    grcx0.getClass();
                    grcv1.e = grcx0;
                    grcv1.b |= 2;
                    ibuq.f(grck1, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grcv grcv2 = (grcv)hftp1.b_message;
                    grcv2.f = grck1.a();
                    ProtoLiteMessage hftv1 = hftp1.N_build();
                    ibuq.e(hftv1, "build(...)");
                    grbt0.a = grcm0;
                    grbt0.b = grch0;
                    grbt0.c = grcx0;
                    grbt0.g = null;
                    grbt0.f = 2;
                    Object object2 = ibtw2.a(((grcv)hftv1), grbt0);
                    if(object2 != object1) {
                        grcm1 = grcm0;
                        object0 = object2;
                        grch1 = grch0;
                        grcx1 = grcx0;
                        goto label_117;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                grcx1 = (grcx)grbt0.c;
                grch1 = (grch)grbt0.b;
                grcm1 = (grcm)grbt0.a;
                ibnx.b(object0);
            label_117:
                byte[] arr_b2 = grcj.b(((grcw)object0).b.toByteArray(), this.c);
                ibuq.e(arr_b2, "decryptReencryptedLookupHash(...)");
                ByteString hfsf3 = hfxt.a(arr_b2);
                ByteString hfsf4 = grcx1.b;
                ibuq.e(hfsf4, "getServerCryptoContext(...)");
                grbs grbs1 = new grbs(hfsf3, hfsf4);
                this.a.b.h(grch1, grbs1);
                hfsf0 = hfsf3;
                grcm0 = grcm1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        hfuo hfuo0 = grcm0.b;
        ibuq.e(hfuo0, "getEncryptedLeakMatchPrefixList(...)");
        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
            for(Object object3: hfuo0) {
                if(hfsf0.L(((ByteString)object3))) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}


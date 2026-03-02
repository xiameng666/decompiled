public final class gbom {
    public static byte[] a(gboe gboe0, hddo hddo0) {
        int v1;
        ibuq.f(hddo0, "finishAction");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbcm.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if((hddn.b(hddo0.c) == null ? hddn.a : hddn.b(hddo0.c)).ordinal() == 1) {
            gaxl.a();
            if(hzlv.f()) {
                Long long0 = (long)-101L;
                if(gboe0.a.containsKey(long0)) {
                    Object object0 = gboe0.a.get(long0);
                    if(object0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ((hcos)object0).f(hcwn.f);
                    Object object1 = ((hcos)object0).s.k(hcwn.f.d);
                    Object object2 = object1 == null ? hcwn.f.b : hcwn.f.d(object1);
                    ibuq.e(object2, "getExtension(...)");
                    String s = ((hcwn)object2).c;
                    ibuq.e(s, "getCardNumber(...)");
                    fbcl.b(s, hftp0);
                    String s1 = ((hcwn)object2).e;
                    ibuq.e(s1, "getCardholderName(...)");
                    fbcl.a(s1, hftp0);
                    if((((hcwn)object2).b & 2) != 0) {
                        gepn gepn0 = ((hcwn)object2).d;
                        if(gepn0 == null) {
                            gepn0 = gepn.a;
                        }
                        fbcl.c(gepn0.d, hftp0);
                        gepn gepn1 = ((hcwn)object2).d;
                        if(gepn1 == null) {
                            gepn1 = gepn.a;
                        }
                        fbcl.d(gepn1.c, hftp0);
                    }
                    fbcl.f(fbcg.c.f, hftp0);
                    fbcl.e(-1, hftp0);
                    goto label_76;
                }
            }
            hcos hcos0 = (hcos)gboe0.a.get(Long.valueOf(-100L));
            if(hcos0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hcos0.f(hcuv.g);
            Object object3 = hcos0.s.k(hcuv.g.d);
            Object object4 = object3 == null ? hcuv.g.b : hcuv.g.d(object3);
            ibuq.e(object4, "getExtension(...)");
            String s2 = ((hcuv)object4).c;
            ibuq.e(s2, "getCardNumber(...)");
            fbcl.b(s2, hftp0);
            String s3 = ((hcuv)object4).e;
            ibuq.e(s3, "getCardholderName(...)");
            fbcl.a(s3, hftp0);
            if((((hcuv)object4).b & 2) != 0) {
                gepn gepn2 = ((hcuv)object4).d;
                if(gepn2 == null) {
                    gepn2 = gepn.a;
                }
                fbcl.c(gepn2.d, hftp0);
                gepn gepn3 = ((hcuv)object4).d;
                if(gepn3 == null) {
                    gepn3 = gepn.a;
                }
                fbcl.d(gepn3.c, hftp0);
            }
            fbcl.f(fbcg.b.f, hftp0);
            fbcl.e(-1, hftp0);
        }
        else {
            hcjo hcjo0 = hddo0.e == null ? hcjo.a : hddo0.e;
            fbck fbck0 = (fbck)gawi.h((hcjo0.b == 1 ? ((ByteString)hcjo0.c) : ByteString.b), ((Parser)((ProtoLiteMessage)fbck.a).jf(7, null)));
            if(fbck0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            fbcl.e(fbck0.c, hftp0);
            gaxl.a();
            if(hzlv.f()) {
                int v = fbck0.d;
                fbcg fbcg0 = fbcg.a;
                if((fbcg.b(v) == null ? fbcg.a : fbcg.b(v)) == fbcg0) {
                    v1 = fbcg.b.f;
                }
                else {
                    fbcg fbcg1 = fbcg.b(v);
                    if(fbcg1 != null) {
                        fbcg0 = fbcg1;
                    }
                    v1 = fbcg0.f;
                }
            }
            else {
                v1 = fbcg.b.f;
            }
            fbcl.f(v1, hftp0);
        }
    label_76:
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return ((fbcm)hftv0).toBytesArray();
    }
}


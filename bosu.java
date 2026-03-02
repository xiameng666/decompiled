public final class bosu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((fqzl)object0).e && (((fqzl)object0).c == 22 ? ((fqza)((fqzl)object0).d) : fqza.a).e) {
            return (fqzl)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzl)object0))));
        if(((fqzl)object0).e) {
            int v = ((fqzl)object0).c;
            if(v != 22) {
                int v1 = ((fqzl)object0).b;
                if((v1 & 0x20) != 0) {
                    fqza fqza1 = boul.d;
                    if(!((fqyg)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
                    }
                    fqzl fqzl2 = (fqzl)((fqyg)hftp0).b_message;
                    fqza1.getClass();
                    fqzl2.d = fqza1;
                    fqzl2.c = 22;
                }
                else if(v != 22 && (v1 & 0x1000) != 0) {
                    fqxr fqxr0 = ((fqzl)object0).t;
                    if(fqxr0 == null) {
                        fqxr0 = fqxr.a;
                    }
                    if(!fqxr0.d) {
                        fqza fqza2 = boul.e;
                        if(!((fqyg)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
                        }
                        fqzl fqzl3 = (fqzl)((fqyg)hftp0).b_message;
                        fqza2.getClass();
                        fqzl3.d = fqza2;
                        fqzl3.c = 22;
                    }
                }
            }
        }
        else if((((fqzl)object0).b & 1) != 0) {
            fqza fqza0 = boul.b();
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            fqzl fqzl0 = (fqzl)((fqyg)hftp0).b_message;
            fqza0.getClass();
            fqzl0.d = fqza0;
            fqzl0.c = 22;
        }
        else {
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            fqzl fqzl1 = (fqzl)((fqyg)hftp0).b_message;
            if(fqzl1.c == 22) {
                fqzl1.c = 0;
                fqzl1.d = null;
            }
        }
        if(!boul.u(((fqyg)hftp0))) {
            gtas gtas0 = gtas.a;
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            fqzl fqzl4 = (fqzl)((fqyg)hftp0).b_message;
            fqzl4.g = gtas0.a();
            fqzl4.b |= 4;
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            ((fqzl)((fqyg)hftp0).b_message).h = null;
            ((fqzl)((fqyg)hftp0).b_message).b &= -9;
            if(!((fqyg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
            }
            ((fqzl)((fqyg)hftp0).b_message).i = null;
            ((fqzl)((fqyg)hftp0).b_message).b &= -17;
        }
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp0))).N_build();
    }
}


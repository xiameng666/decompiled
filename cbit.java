final class cbit extends ibsl implements ibtw {
    int a;
    final gvmc b;
    final cbiu c;
    final long d;

    public cbit(gvmc gvmc0, cbiu cbiu0, long v, ibrl ibrl0) {
        this.b = gvmc0;
        this.c = cbiu0;
        this.d = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbit)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbit(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            gvmc gvmc0 = this.b;
            cbiu cbiu0 = this.c;
            gvlr gvlr0 = gvlr.b(gvmc0.c) == null ? gvlr.A : gvlr.b(gvmc0.c);
            cbiw cbiw0 = (cbiw)cbiu0.c.get(gvlr0);
            if(cbiw0 == null) {
                ((ggtj)cbiu.a.j()).B("No handler found for message type: %s", (gvlr.b(gvmc0.c) == null ? gvlr.A : gvlr.b(gvmc0.c)));
                String s = gvmc0.b;
                ibuq.e(s, "getRequestId(...)");
                gvlr gvlr1 = gvlr.b(gvmc0.c) == null ? gvlr.A : gvlr.b(gvmc0.c);
                ibuq.e(gvlr1, "getMessageType(...)");
                gvmg gvmg0 = gvmf.a(((ProtoLiteMessage)gvme.a).v_newBuilder());
                gvmg0.c(s);
                gvmg0.b(gvlr1);
                gvmg0.d(gvmd.c);
                cbiu0.a(gvmg0.a(), this.d);
                return ibom.a;
            }
            try {
                ByteString hfsf0 = gvmc0.d;
                ibuq.e(hfsf0, "getPayload(...)");
                this.a = 1;
                object0 = cbiw0.a(hfsf0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_27:
                cbiu cbiu1 = this.c;
                gvmg gvmg1 = gvmf.a(((ProtoLiteMessage)gvme.a).v_newBuilder());
                String s1 = this.b.b;
                ibuq.e(s1, "getRequestId(...)");
                gvmg1.c(s1);
                gvlr gvlr2 = gvlr.b(this.b.c) == null ? gvlr.A : gvlr.b(this.b.c);
                ibuq.e(gvlr2, "getMessageType(...)");
                gvmg1.b(gvlr2);
                gvmg1.d(gvmd.b);
                if(((ByteString)object0) != null && !((ByteString)object0).isEmpty()) {
                    ProtoLiteBuilder hftp0 = gvmg1.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gvme gvme0 = (gvme)hftp0.b_message;
                    gvme0.b |= 4;
                    gvme0.e = (ByteString)object0;
                }
                cbiu1.a(gvmg1.a(), this.d);
                return ibom.a;
            }
            catch(hfur hfur0) {
                goto label_46;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(hfur hfur0) {
                goto label_46;
            }
        }
        goto label_27;
    label_46:
        a.e(cbiu.a.j(), "Failed to handle message: %s", this.b, hfur0);
        String s2 = this.b.b;
        ibuq.e(s2, "getRequestId(...)");
        gvlr gvlr3 = gvlr.b(this.b.c) == null ? gvlr.A : gvlr.b(this.b.c);
        ibuq.e(gvlr3, "getMessageType(...)");
        gvmg gvmg2 = gvmf.a(((ProtoLiteMessage)gvme.a).v_newBuilder());
        gvmg2.c(s2);
        gvmg2.b(gvlr3);
        gvmg2.d(gvmd.e);
        this.c.a(gvmg2.a(), this.d);
        return ibom.a;
    }
}


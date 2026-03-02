import java.util.Collection;

public final class grce {
    public final hfjo a;
    private final gfvb b;
    private final gfvb c;

    public grce() {
        this.a = hfjo.c(grcf.a);
        gfvh gfvh0 = new gfvh();
        gfvh0.h(0L);
        this.b = gfvh0.b();
        gfvh gfvh1 = new gfvh();
        gfvh1.h(0L);
        this.c = gfvh1.b();
    }

    public final Object a(String s, grdf grdf0, grck grck0, ibtw ibtw0, ibrl ibrl0) {
        grcb grcb0;
        if((ibrl0 instanceof grcb)) {
            grcb0 = (grcb)ibrl0;
            int v = grcb0.c;
            if((v & 0x80000000) == 0) {
                grcb0 = new grcb(this, ibrl0);
            }
            else {
                grcb0.c = v - 0x80000000;
            }
        }
        else {
            grcb0 = new grcb(this, ibrl0);
        }
        Object object0 = grcb0.a;
        Object object1 = ibrx.a;
        switch(grcb0.c) {
            case 0: {
                ibnx.b(object0);
                String s1 = grcj.a(s);
                if(grdf0.a.length() == 0) {
                    return Boolean.valueOf(false);
                }
                ibuq.c(s1);
                if(s1.length() == 0) {
                    return Boolean.valueOf(false);
                }
                grca grca0 = new grca(s1, grdf0);
                grby grby0 = new grby(s1, grdf0, this);
                ByteString hfsf0 = (ByteString)this.b.c(grca0, grby0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grcn.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((grcn)hftp0.b_message).c = 26;
                ByteString hfsf1 = hfxt.a(grcj.c(s1));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((grcn)hftv0).b = hfsf1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((grcn)hftp0.b_message).d = hfsf0;
                ibuq.f(grck0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grcn grcn0 = (grcn)hftp0.b_message;
                grcn0.e = grck0.a();
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                grcb0.c = 1;
                object0 = ibtw0.a(((grcn)hftv1), grcb0);
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
        ByteString hfsf2 = ((grco)object0).c;
        grbz grbz0 = new grbz(((grco)object0), this);
        ByteString hfsf3 = (ByteString)this.c.c(hfsf2, grbz0);
        hfuo hfuo0 = ((grco)object0).b;
        ibuq.e(hfuo0, "getEncryptedLeakMatchPrefixList(...)");
        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
            for(Object object2: hfuo0) {
                if(hfsf3.L(((ByteString)object2))) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}


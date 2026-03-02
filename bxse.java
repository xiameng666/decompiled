import j..util.Optional;
import java.util.Collection;
import java.util.Map;

public final class bxse implements bxsf {
    private final bxnj a;
    private final String b;
    private final bxod c;
    private final bxme d;
    private long e;

    public bxse(bxnj bxnj0, String s, bxod bxod0, bxme bxme0) {
        this.a = bxnj0;
        this.c = bxod0;
        this.b = s;
        this.d = bxme0;
    }

    @Override  // bxsf
    public final void a(Object object0, Throwable throwable0) {
        bxma bxma0 = this.d.a(throwable0);
        this.e(bxma0.a, bxma0.getMessage(), null);
    }

    @Override  // bxsf
    public final void b(Object object0, Throwable throwable0, Object object1) {
        bxma bxma0 = this.d.a(throwable0);
        this.e(0, "[Fallback] " + bxma.k(bxma0.a, bxma0.getMessage()), object1);
    }

    @Override  // bxsf
    public final void c(Object object0) {
        this.e = System.currentTimeMillis();
    }

    @Override  // bxsf
    public final void d(Object object0, Object object1) {
        this.e(0, null, object1);
    }

    private final void e(int v, String s, Object object0) {
        gfsx gfsx0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixl)hftp0.b_message).c = this.a.bA;
        ((gixl)hftp0.b_message).b |= 1;
        long v1 = System.currentTimeMillis() - this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gixl)hftv0).b |= 2;
        ((gixl)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixl gixl0 = (gixl)hftp0.b_message;
        gixl0.b |= 4;
        gixl0.e = v;
        if((object0 instanceof Collection)) {
            gfsx0 = gfsx.m(Integer.valueOf(((Collection)object0).size()));
        }
        else if((object0 instanceof Map)) {
            gfsx0 = gfsx.m(Integer.valueOf(((Map)object0).size()));
        }
        else if((object0 instanceof gfsx)) {
            gfsx0 = gfsx.m((((gfsx)object0).i() ? ((int)1) : ((int)0)));
        }
        else if((object0 instanceof Optional)) {
            gfsx0 = gfsx.m((((Optional)object0).isPresent() ? ((int)1) : ((int)0)));
        }
        else if((object0 instanceof Boolean)) {
            gfsx0 = gfsx.m(Integer.valueOf(((int)((Boolean)object0).booleanValue())));
        }
        else {
            gfsx0 = gfqx.a;
        }
        if(gfsx0.i()) {
            int v2 = (int)(((Integer)gfsx0.d()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixl gixl1 = (gixl)hftp0.b_message;
            gixl1.b |= 16;
            gixl1.g = v2;
        }
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixl gixl2 = (gixl)hftp0.b_message;
            gixl2.b |= 8;
            gixl2.f = s;
        }
        bxod bxod0 = this.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gixr)hftv1).d = 2;
        ((gixr)hftv1).b |= 1;
        String s1 = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        s1.getClass();
        ((gixr)hftv2).b |= 2;
        ((gixr)hftv2).e = s1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        gixl gixl3 = (gixl)hftp0.N_build();
        gixl3.getClass();
        gixr0.f = gixl3;
        gixr0.b |= 4;
        bxod0.a(((gixr)hftp1.N_build()));
    }
}


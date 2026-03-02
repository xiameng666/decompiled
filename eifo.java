import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public final class eifo implements Function {
    public final eifs a;

    public eifo(eifs eifs0) {
        this.a = eifs0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Instant instant1;
        String s1;
        ehud ehud0 = this.a.i;
        gftb.check(ehud0);
        gxax gxax0 = ((gxbk)object0).b;
        if(gxax0 == null) {
            gxax0 = gxax.a;
        }
        String s = ehuf.a(gxax0);
        if(s == null) {
            return new ArrayList();
        }
        int v = (gxax0.b & 16) == 0 ? 0x80000000 : gxax0.d;
        byte[] arr_b = gxax0.f.toByteArray();
        eigg eigg0 = arr_b == null ? null : new eigg(new eige(arr_b, v));
        if(eigg0 == null) {
            ((ggtj)eicd.a.j()).B("Failed to parse scan record from advertising report for mac %s", eice.c(s));
            return new ArrayList();
        }
        eifu eifu0 = eifv.a(eigg0);
        int v1 = eifu0.b(eigg0);
        Object object1 = new ArrayList();
        Iterator iterator0 = ((gxbk)object0).c.iterator();
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            gxbj gxbj0 = (gxbj)object2;
            if(gxbj0 != null) {
                long v2 = eilw.b().plusMillis(((long)gxbj0.b)).toEpochMilli();
                Instant instant0 = eilw.b();
                switch((gxbi.a(gxbj0.e) == 0 ? 1 : gxbi.a(gxbj0.e)) - 1) {
                    case 1: {
                        instant1 = instant0.plusMillis(((long)gxbj0.c));
                        break;
                    }
                    case 2: {
                        if(ehud0.b == null) {
                            ((ggtj)eicd.a.i()).x("Attempting to estimate last found time, but activeConfig is null. Using flagged values instead which may not represent runtime values.");
                        }
                        gxbe gxbe0 = ehud0.b;
                        int v4 = gxbe0 == null ? ((int)hrtd.g()) : gxbe0.h;
                        gxbe gxbe1 = ehud0.b;
                        int v5 = gxbe1 == null ? ((int)hrtd.h()) : gxbe1.d;
                        instant1 = instant0.plusMillis(((long)Math.max(gxbj0.b, gxbj0.d - v4 - v5)));
                        break;
                    }
                    default: {
                        ggtj ggtj0 = (ggtj)eicd.a.i();
                        int v3 = gxbi.a(gxbj0.e);
                        if(v3 != 0) {
                            switch(v3) {
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    s1 = "PRESENT";
                                    goto label_34;
                                }
                                default: {
                                    s1 = "ABSENT";
                                    goto label_34;
                                }
                            }
                        }
                        s1 = "UNSPECIFIED";
                    label_34:
                        ggtj0.B("Unsupported tracker state: %s", s1);
                        instant1 = null;
                    }
                }
                if(instant1 == null) {
                    ((ggtj)eicd.a.j()).B("Failed to estimate last found time for mac %s", eice.c(s));
                }
                else {
                    long v6 = instant1.toEpochMilli();
                    gwgx gwgx0 = gwgx.a;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwgx0).v_newBuilder();
                    gwgu gwgu0 = gwgu.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    int v7 = gwgu0.g;
                    ((gwgx)hftv0).g = v7;
                    ((gwgx)hftv0).b |= 16;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gwgx)hftv1).b |= 1;
                    ((gwgx)hftv1).c = s;
                    int v8 = gxax0.e;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((gwgx)hftv2).b |= 2;
                    ((gwgx)hftv2).d = v8;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((gwgx)hftv3).b |= 0x40;
                    ((gwgx)hftv3).i = 101;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    ((gwgx)hftv4).b |= 0x20;
                    ((gwgx)hftv4).h = v1;
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwgx gwgx1 = (gwgx)hftp0.b_message;
                    gwgx1.b |= 8;
                    gwgx1.f = v2;
                    eifu0.h(hftp0, eigg0);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwgx0).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp1.b_message;
                    ((gwgx)hftv5).g = v7;
                    ((gwgx)hftv5).b |= 16;
                    if(!hftv5.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp1.b_message;
                    ((gwgx)hftv6).b |= 1;
                    ((gwgx)hftv6).c = s;
                    int v9 = gxax0.e;
                    if(!hftv6.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp1.b_message;
                    ((gwgx)hftv7).b |= 2;
                    ((gwgx)hftv7).d = v9;
                    if(!hftv7.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp1.b_message;
                    ((gwgx)hftv8).b |= 0x40;
                    ((gwgx)hftv8).i = 101;
                    if(!hftv8.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp1.b_message;
                    ((gwgx)hftv9).b |= 0x20;
                    ((gwgx)hftv9).h = v1;
                    if(!hftv9.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwgx gwgx2 = (gwgx)hftp1.b_message;
                    gwgx2.b |= 8;
                    gwgx2.f = v6;
                    eifu0.h(hftp1, eigg0);
                    int v10 = gxbi.a(gxbj0.e);
                    ((List)object1).add(new eigo(eigg0, (v10 == 0 ? 1 : v10), ((gwgx)hftp0.N_build()), ((gwgx)hftp1.N_build())));
                    ehud0 = ehud0;
                    iterator0 = iterator0;
                }
            }
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}


import java.util.concurrent.atomic.AtomicReference;

public final class boxu implements gfsi {
    public final boxz a;
    public final gfsx b;
    public final boolean c;
    public final gfsx d;
    public final AtomicReference e;
    public final int f;
    public final int g;

    public boxu(boxz boxz0, int v, gfsx gfsx0, boolean z, int v1, gfsx gfsx1, AtomicReference atomicReference0) {
        this.a = boxz0;
        this.f = v;
        this.b = gfsx0;
        this.c = z;
        this.g = v1;
        this.d = gfsx1;
        this.e = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx2;
        boolean z1;
        fqyp fqyp0 = ((fqzl)object0).f;
        if(fqyp0 == null) {
            fqyp0 = fqyp.b;
        }
        int v = fqyo.a(fqyp0.e) == 0 ? 1 : fqyo.a(fqyp0.e);
        int v1 = this.f;
        AtomicReference atomicReference0 = this.e;
        gfsx gfsx0 = this.d;
        int v2 = this.g;
        boolean z = this.c;
        gfsx gfsx1 = this.b;
        boxz boxz0 = this.a;
        if(v1 == 2 && (v == 2 || v == 4)) {
            if((!gfsx1.i() || fqyp0.f.isEmpty() || ((String)gfsx1.d()).equals(fqyp0.f)) && fqyp0.h == z && ((fqyk.a(fqyp0.g) == 0 ? 1 : fqyk.a(fqyp0.g)) == v2 && ggfp.G(new hfuh(fqyp0.i, fqyp.a)).equals(gfsx0.f(ggnj.a)))) {
                int v3 = fqyp0.e;
                if(fqyo.a(v3) == 2) {
                    z1 = true;
                }
                else {
                    switch(fqyo.a(v3)) {
                        case 0: {
                            z1 = false;
                            break;
                        }
                        case 4: {
                            z1 = true;
                            break;
                        }
                        default: {
                            z1 = false;
                        }
                    }
                }
                gftb.checkTrue(z1);
                if(fqyo.a(fqyp0.e) == 2) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)(((fqzl)object0))));
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqyp0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)fqyp0));
                    hfwn hfwn0 = hfyg.b(boxz0.c.d());
                    if(!((fqym)hftp1).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fqym)hftp1))).ensureMutable();
                    }
                    fqyp fqyp1 = (fqyp)((fqym)hftp1).b_message;
                    hfwn0.getClass();
                    fqyp1.d = hfwn0;
                    fqyp1.c |= 1;
                    if(gfsx1.i()) {
                        Object object1 = gfsx1.d();
                        if(!((fqym)hftp1).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((fqym)hftp1))).ensureMutable();
                        }
                        fqyp fqyp2 = (fqyp)((fqym)hftp1).b_message;
                        fqyp2.c |= 4;
                        fqyp2.f = (String)object1;
                    }
                    fqyp fqyp3 = (fqyp)((ProtoLiteBuilder)(((fqym)hftp1))).N_build();
                    if(!((fqyg)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
                    }
                    fqzl fqzl0 = (fqzl)((fqyg)hftp0).b_message;
                    fqyp3.getClass();
                    fqzl0.f = fqyp3;
                    fqzl0.b |= 2;
                    gfsx2 = gfsx.m(((fqzl)((ProtoLiteBuilder)(((fqyg)hftp0))).N_build()));
                }
                else if(hfyg.d((fqyp0.d == null ? hfwn.a : fqyp0.d)).plus(boxz.a).isAfter(boxz0.c.d())) {
                    gfsx2 = gfsx.m(((fqzl)object0));
                }
                else {
                    gfsx2 = gfqx.a;
                }
                if(gfsx2.i()) {
                    atomicReference0.set(new boxy(false, gfqx.a));
                    return gfsx2.d();
                }
            }
            atomicReference0.set(new boxy(true, gfsx.m(fqyp0)));
        }
        else if(v1 != 4) {
            atomicReference0.set(new boxy(true, gfqx.a));
        }
        else if(v == 4) {
            atomicReference0.set(new boxy(false, gfqx.a));
        }
        else {
            v1 = 4;
            atomicReference0.set(new boxy(true, gfqx.a));
        }
        fqym fqym0 = (fqym)((ProtoLiteMessage)fqyp.b).v_newBuilder();
        if(!fqym0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqym0).ensureMutable();
        }
        ((fqyp)fqym0.b_message).e = v1 - 1;
        ((fqyp)fqym0.b_message).c |= 2;
        hfwn hfwn1 = hfyg.b(boxz0.c.d());
        if(!fqym0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqym0).ensureMutable();
        }
        fqyp fqyp4 = (fqyp)fqym0.b_message;
        hfwn1.getClass();
        fqyp4.d = hfwn1;
        fqyp4.c |= 1;
        if(!fqym0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqym0).ensureMutable();
        }
        fqyp fqyp5 = (fqyp)fqym0.b_message;
        if(v2 == 0) {
            throw null;
        }
        fqyp5.g = v2 - 1;
        fqyp5.c |= 8;
        if(!fqym0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqym0).ensureMutable();
        }
        ((fqyp)fqym0.b_message).c |= 16;
        ((fqyp)fqym0.b_message).h = z;
        fqym0.a(((Iterable)gfsx0.f(ggnj.a)));
        if(gfsx1.i()) {
            Object object2 = gfsx1.d();
            if(!fqym0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqym0).ensureMutable();
            }
            fqyp fqyp6 = (fqyp)fqym0.b_message;
            fqyp6.c |= 4;
            fqyp6.f = (String)object2;
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((fqzl)object0))));
        fqyp fqyp7 = (fqyp)((ProtoLiteBuilder)fqym0).N_build();
        if(!((fqyg)hftp2).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp2))).ensureMutable();
        }
        fqzl fqzl1 = (fqzl)((fqyg)hftp2).b_message;
        fqyp7.getClass();
        fqzl1.f = fqyp7;
        fqzl1.b |= 2;
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp2))).N_build();
    }
}


import java.net.SocketAddress;
import java.util.Map;

public final class ibcg implements iane {
    public final ibcr a;
    public final ibcq b;

    public ibcg(ibcr ibcr0, ibcq ibcq0) {
        this.a = ibcr0;
        this.b = ibcq0;
    }

    @Override  // iane
    public final void a(ialm ialm0) {
        ibcr ibcr0 = this.a;
        Map map0 = ibcr0.h;
        ibcq ibcq0 = this.b;
        ianc ianc0 = ibcq0.a;
        if(ibcq0 == map0.get(ibcr.j(ianc0))) {
            iall iall0 = ialm0.a;
            if(iall0 != iall.e) {
                iall iall1 = iall.d;
                if(iall0 == iall1 && ibcq0.b == iall.b) {
                    ibcr0.g.e();
                }
                ibcq0.b(iall0);
                iall iall2 = iall.c;
                if(ibcr0.m != iall2 && ibcr0.n != iall2) {
                label_17:
                    switch(iall0.ordinal()) {
                        case 0: {
                            ibcr0.m = iall.a;
                            ibcn ibcn0 = new ibcn(iamz.a);
                            ibcr0.g(iall.a, ibcn0);
                            return;
                        }
                        case 1: {
                            iapr iapr0 = ibcr0.p;
                            if(iapr0 != null) {
                                iapr0.a();
                                ibcr0.p = null;
                            }
                            ibcr0.q = null;
                            ibcr0.e();
                            for(Object object0: map0.values()) {
                                ianc ianc1 = ((ibcq)object0).a;
                                if(!ianc1.equals(ianc0)) {
                                    ianc1.b();
                                }
                            }
                            map0.clear();
                            ibcq0.b(iall.b);
                            map0.put(ibcr.j(ianc0), ibcq0);
                            SocketAddress socketAddress0 = ibcr.j(ianc0);
                            ibcr0.i.g(socketAddress0);
                            ibcr0.m = iall.b;
                            ibcr0.h(ibcq0);
                            return;
                        }
                        case 2: {
                            ibcl ibcl0 = ibcr0.i;
                            if(ibcl0.f() && map0.get(ibcl0.b()) == ibcq0) {
                                if(ibcl0.e()) {
                                    ibcr0.e();
                                    ibcr0.c();
                                }
                                else if(map0.size() >= ibcl0.a()) {
                                    ibcr0.f();
                                }
                                else {
                                    ibcl0.c();
                                    ibcr0.c();
                                }
                            }
                            if(map0.size() >= ibcl0.a()) {
                                for(Object object1: map0.values()) {
                                    if(!((ibcq)object1).c) {
                                        return;
                                    }
                                }
                                ibcr0.m = iall2;
                                ibcr0.g(iall2, new ibcn(iamz.b(ialm0.b)));
                                int v = ibcr0.j + 1;
                                ibcr0.j = v;
                                if(v >= ibcl0.a() || ibcr0.k) {
                                    ibcr0.k = false;
                                    ibcr0.j = 0;
                                    ibcr0.g.e();
                                    return;
                                }
                            }
                            return;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unsupported state:" + iall0.toString());
                        }
                    }
                    ibcr0.i.c();
                    ibcr0.m = iall1;
                    ibcr0.g(iall1, new ibcp(ibcr0, ibcr0));
                }
                else if(iall0 != iall.a) {
                    if(iall0 == iall1) {
                        ibcr0.c();
                        return;
                    }
                    goto label_17;
                }
            }
        }
    }
}


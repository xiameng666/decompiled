import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import j..util.Objects;

final class eqyy extends cuvg {
    final eqza a;

    public eqyy(eqza eqza0) {
        Objects.requireNonNull(eqza0);
        this.a = eqza0;
        super();
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        eqza eqza0 = this.a;
        String s1 = eqza0.m;
        if(s1 != null) {
            eqza.a.m("Connection to %s already in progress", new Object[]{s1});
            eqza0.g.f(s);
            return;
        }
        eqtn eqtn0 = eqza0.d;
        if(eqtn0 != null) {
            eqtn0.a();
        }
        eqza0.c = eqnf.b(cuvf0.a);
        eqnf eqnf0 = eqza0.c;
        boolean z = false;
        if(eqnf0 != null) {
            baun baun0 = eqza.a;
            baun0.h("Incoming connection request from endpoint %s with name: %s", new Object[]{s, eqnf0});
            eqnf eqnf1 = eqza0.c;
            if(eqnf1 != null) {
                eray eray0 = eqza0.t;
                if(eray0 != null) {
                    if(eqnf1.h()) {
                        eray0.o(gjjm.F);
                    }
                    else {
                        int v = 6;
                        int v1 = eqza0.c.a();
                        if(v1 == 5) {
                            v = 3;
                        }
                        else {
                            switch(v1) {
                                case 6: {
                                    v = 2;
                                    break;
                                }
                                case 11: {
                                    break;
                                }
                                default: {
                                    v = 1;
                                }
                            }
                        }
                        gjjm gjjm0 = gjjm.h;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjje.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gjje)hftp0.b_message).c = v - 1;
                        ((gjje)hftp0.b_message).b |= 1;
                        gjje gjje0 = (gjje)hftp0.N_build();
                        ProtoLiteBuilder hftp1 = eray0.y(gjjm0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjle gjle0 = (gjle)hftp1.b_message;
                        gjje0.getClass();
                        gjle0.q = gjje0;
                        gjle0.b |= 0x20000;
                        eray0.k(((gjle)hftp1.N_build()));
                    }
                }
            }
            if(eqza0.c.a() == 11) {
                baun0.d("Incoming connection request from iOS, auto-accepting...", new Object[0]);
                eqza0.m = s;
                eqmu eqmu0 = new eqmu(eqza0.s, eqza0.u);
                eqza0.g.c(s, eqmu0);
                eqzj eqzj0 = eqza0.b;
                if(eqza0.c.a() == 11) {
                    eqzj0.a.n = true;
                    return;
                }
            }
            else {
                eqmz eqmz0 = eqza0.n;
                eqzj eqzj1 = eqza0.b;
                if(eqzj1 != null && eqmz0 != null) {
                    eqza0.m = s;
                    String s2 = cuvf0.b;
                    eqza0.l = cuvf0.a();
                    eqza0.h = false;
                    eqza.c(eqza0);
                    gjpi gjpi0 = eqmz0.a().d();
                    if(gjpi0 == gjpi.g && eqza0.c.a() == 5 && !eqza0.c.h()) {
                        z = true;
                    }
                    eqza0.j = z;
                    String s3 = eqng.a(s2, gjpi0);
                    if(eqza0.c.a() == 5) {
                        eqzj1.e(new VerificationInfo(s3, gjpi0.h));
                    }
                    String s4 = eqza0.o;
                    if(s4 != null) {
                        eqza0.e = eqhi.a(1, s2, bbmu.d(s4));
                        if(!eqza0.j) {
                            eqza0.f = new epwf(eqza0.e, eqzj1, eqza0.g);
                        }
                    }
                    eqmu eqmu1 = new eqmu(eqza0.s, eqza0.u);
                    eqza0.g.c(s, eqmu1);
                }
            }
            return;
        }
        eqza.a.m("Failed to parse endpoint info", new Object[0]);
        eqza0.g.f(s);
    }

    @Override  // cuvg
    public final void c(String s, cuvl cuvl0) {
        eqza eqza0 = this.a;
        if(!s.equals(eqza0.m)) {
            eqza.a.m("Unexpected endpoint (%s) result %s", new Object[]{s, cuvl0.a});
            return;
        }
        eqzj eqzj0 = eqza0.b;
        if(eqzj0 != null) {
            Status status0 = cuvl0.a;
            if(!status0.e()) {
                int v = status0.i;
                eqza.a.m("Connection to %s rejected (%d)", new Object[]{s, v});
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((eqoc)hftv0).c = 1;
                ((eqoc)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqoc eqoc0 = (eqoc)hftp0.b_message;
                eqoc0.b |= 2;
                eqoc0.d = v;
                eqzj0.d(v, ((eqoc)hftp0.N_build()));
                eqza0.m = null;
                return;
            }
            baun baun0 = eqza.a;
            baun0.h("NC connected to source device %s, there may be out-of-band authentication pending", new Object[]{s});
            if(!hyis.v()) {
                eqza0.i = true;
            }
            cuvm cuvm0 = eqza0.g;
            cuvm0.s();
            if(eqza0.j || eqza0.c.a() == 11) {
                goto label_36;
            }
            baun0.h("Attempting to authenticate connection to source with out-of-band", new Object[0]);
            epwf epwf0 = eqza0.f;
            if(epwf0 != null) {
                eqza0.h = epwf0.b(s);
                return;
            label_36:
                if(hyis.v()) {
                    eqza0.i = true;
                }
                eqzj0.a(new eqgo(cuvm0, s), new TargetConnectionArgs());
            }
        }
    }

    @Override  // cuvg
    public final void d(String s) {
        eqza eqza0 = this.a;
        eqzj eqzj0 = eqza0.b;
        if(eqza0.m != null && eqzj0 != null) {
            baun baun0 = eqza.a;
            baun0.d("Disconnected from source device %s", new Object[]{s});
            eqza0.m = null;
            eqzj0.c();
            eqza0.i = false;
            if(eqza0.h) {
                eray eray0 = eqza0.t;
                if(eray0 != null) {
                    eray0.n(10807, null);
                }
            }
            if(hyis.w() && eqza0.h && (eqza0.r != null && eqsh.w(eqza0.r))) {
                baun0.m("Auth token mismatched on source, start advertising again.", new Object[0]);
                AdvertisingInfo advertisingInfo0 = eqza0.p;
                if(advertisingInfo0 != null) {
                    eqza0.d(eqza0.q, advertisingInfo0);
                }
                eqza0.h = false;
                return;
            }
            eqza0.b = null;
        }
    }
}


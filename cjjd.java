import android.content.Context;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;

public final class cjjd {
    private final Context a;
    private final ibts b;
    private final ConcurrentHashMap c;

    static {
        bboh.b("GmsNetworkEngineMDD", bbcu.ce);
    }

    public cjjd(Context context0, ibts ibts0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = ibts0;
        this.c = new ConcurrentHashMap();
    }

    public final ckcq a(String s) {
        ibuq.f(s, "url");
        return (ckcq)this.c.get(s);
    }

    public final Object b(fjhg fjhg0, ibtw ibtw0, ibrl ibrl0) {
        ibns ibns2;
        String s1;
        ibns ibns1;
        cjjc cjjc0;
        if((ibrl0 instanceof cjjc)) {
            cjjc0 = (cjjc)ibrl0;
            int v = cjjc0.c;
            if((v & 0x80000000) == 0) {
                cjjc0 = new cjjc(this, ibrl0);
            }
            else {
                cjjc0.c = v - 0x80000000;
            }
        }
        else {
            cjjc0 = new cjjc(this, ibrl0);
        }
        Object object0 = cjjc0.a;
        Object object1 = ibrx.a;
        switch(cjjc0.c) {
            case 0: {
                ibnx.b(object0);
                String s = fjhg0.b;
                ibvd ibvd0 = new ibvd();
                ibvd0.a = fjhg0;
                fjhg fjhg1 = (fjhg)ibvd0.a;
                hfrn hfrn0 = fjhg1.g;
                ibns ibns0 = null;
                switch(hfrn0.b) {
                    case "type.googleapis.com/com.google.android.gms.libs.mobiledatadownload.uns.DataCollectionWithNetworkTag": {
                        hfsl hfsl0 = fjhg1.g.c.k();
                        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)cjjb.a).x_newMutableInstance();
                        try {
                            hfwc hfwc0 = hfvu.a.c(hftv0);
                            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                            hfwc0.g(hftv0);
                        }
                        catch(hfur hfur0) {
                            hfur hfur1 = hfur0.b ? new hfur(hfur0) : hfur0;
                            hfur1.a = hftv0;
                            throw hfur1;
                        }
                        catch(hfwr hfwr0) {
                            hfur hfur2 = hfwr0.a();
                            hfur2.a = hftv0;
                            throw hfur2;
                        }
                        catch(IOException iOException0) {
                            if((iOException0.getCause() instanceof hfur)) {
                                throw (hfur)iOException0.getCause();
                            }
                            hfur hfur3 = new hfur(iOException0);
                            hfur3.a = hftv0;
                            throw hfur3;
                        }
                        catch(RuntimeException runtimeException0) {
                            if((runtimeException0.getCause() instanceof hfur)) {
                                throw (hfur)runtimeException0.getCause();
                            }
                            throw runtimeException0;
                        }
                        try {
                            hfsl0.z(0);
                        }
                        catch(hfur hfur4) {
                            hfur4.a = hftv0;
                            throw hfur4;
                        }
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        ibts ibts0 = this.b;
                        bbdv bbdv0 = ((cjjb)hftv0).b;
                        if(bbdv0 == null) {
                            bbdv0 = bbdv.a;
                        }
                        ibuq.e(bbdv0, "getDataCollection(...)");
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bbdv0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bbdv0));
                        bbdx bbdx0 = bbdw.a(hftp0);
                        bbdx0.b(bbdz.c);
                        ibns1 = new ibns(ibts0.a(bbdx0.a()), ((int)((cjjb)hftv0).c));
                        break;
                    }
                    case "type.googleapis.com/gmscore.facets.datacollection.DataCollectionIdentifier": {
                        ibts ibts1 = this.b;
                        hfsl hfsl1 = hfrn0.c.k();
                        ProtoLiteMessage hftv1 = ((ProtoLiteMessage)bbdv.a).x_newMutableInstance();
                        try {
                            hfwc hfwc1 = hfvu.a.c(hftv1);
                            hfwc1.l(hftv1, hfsm.p(hfsl1), hftc.a);
                            hfwc1.g(hftv1);
                        }
                        catch(hfur hfur5) {
                            hfur hfur6 = hfur5.b ? new hfur(hfur5) : hfur5;
                            hfur6.a = hftv1;
                            throw hfur6;
                        }
                        catch(hfwr hfwr1) {
                            hfur hfur7 = hfwr1.a();
                            hfur7.a = hftv1;
                            throw hfur7;
                        }
                        catch(IOException iOException1) {
                            if((iOException1.getCause() instanceof hfur)) {
                                throw (hfur)iOException1.getCause();
                            }
                            hfur hfur8 = new hfur(iOException1);
                            hfur8.a = hftv1;
                            throw hfur8;
                        }
                        catch(RuntimeException runtimeException1) {
                            if((runtimeException1.getCause() instanceof hfur)) {
                                throw (hfur)runtimeException1.getCause();
                            }
                            throw runtimeException1;
                        }
                        try {
                            hfsl1.z(0);
                        }
                        catch(hfur hfur9) {
                            hfur9.a = hftv1;
                            throw hfur9;
                        }
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        ibuq.e(((bbdv)hftv1), "parseFrom(...)");
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((bbdv)hftv1))).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)(((bbdv)hftv1))));
                        bbdx bbdx1 = bbdw.a(hftp1);
                        bbdx1.b(bbdz.c);
                        ibns1 = new ibns(ibts1.a(bbdx1.a()), null);
                        break;
                    }
                    default: {
                        ibns1 = hrmn.a.b().h() ? new ibns(new ckzm(this.a, bbdu.g), null) : null;
                    }
                }
                if(ibns1 != null) {
                    Integer integer0 = (Integer)ibns1.b;
                    this.c.put(s, ((ckcq)ibns1.a));
                    if(integer0 != null) {
                        fjhf fjhf0 = new fjhf(((fjhg)ibvd0.a));
                        fjhf0.f(integer0.intValue());
                        ibvd0.a = fjhf0.a();
                    }
                    ibns0 = ibns1;
                }
                try {
                    cjjc0.d = s;
                    cjjc0.e = ibns0;
                    cjjc0.c = 1;
                    if(ibtw0.a(ibvd0.a, cjjc0) != object1) {
                        s1 = s;
                        ibns2 = ibns0;
                        break;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    s1 = s;
                    ibns2 = ibns0;
                    goto label_129;
                }
                s1 = s;
                ibns2 = ibns0;
                break;
            }
            case 1: {
                try {
                    ibns2 = cjjc0.e;
                    s1 = cjjc0.d;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_129:
                if(ibns2 != null) {
                    this.c.remove(s1);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibns2 != null) {
            this.c.remove(s1);
        }
        return ibom.a;
    }
}


import java.util.ArrayList;

public final class eswy {
    public static final eswt a;
    public static final bboh b;
    public static volatile eswy c;
    public long d;
    public long e;
    public long f;
    public final ArrayList g;
    public final ArrayList h;
    public final gmcg i;
    public final esxe j;
    private final etmv k;
    private final dyct l;

    static {
        eswy.a = new eswt();
        eswy.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public eswy(etmv etmv0, dyct dyct0) {
        this.k = etmv0;
        this.l = dyct0;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new bblp(1, 9);
        esxe esxe0 = new esxe(eswv.a);
        esxe0.a(eswv.a, eswu.a, eswv.b);
        esxe0.a(eswv.a, eswu.g, eswv.a);
        esxe0.a(eswv.b, eswu.a, eswv.b);
        esxe0.a(eswv.b, eswu.c, eswv.c);
        esxe0.a(eswv.c, eswu.e, eswv.e);
        esxe0.a(eswv.c, eswu.f, eswv.d);
        esxe0.a(eswv.c, eswu.d, eswv.b);
        esxe0.a(eswv.d, eswu.a, eswv.d);
        esxe0.a(eswv.d, eswu.i, eswv.e);
        esxe0.a(eswv.d, eswu.g, eswv.a);
        esxe0.a(eswv.d, eswu.b, eswv.a);
        esxe0.a(eswv.d, eswu.h, eswv.a);
        esxe0.a(eswv.e, eswu.a, eswv.e);
        esxe0.a(eswv.e, eswu.b, eswv.a);
        esxe0.a(eswv.e, eswu.g, eswv.a);
        esxe0.a(eswv.c, eswu.j, eswv.f);
        esxe0.a(eswv.f, eswu.k, eswv.e);
        esxe0.a(eswv.f, eswu.i, eswv.e);
        esxe0.a(eswv.f, eswu.g, eswv.a);
        esxe0.a(eswv.f, eswu.b, eswv.a);
        esxe0.a(eswv.f, eswu.h, eswv.a);
        esxe0.b = new eswq(this);
        this.j = esxe0;
    }

    public static final eswy a() {
        return eswy.a.a();
    }

    public final void b(gjwt gjwt0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjwt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gjwt0));
        ibuq.e(hftp0, "toBuilder(...)");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        gjwt gjwt1 = (gjwt)hftv0;
        try {
            if(hysx.a.f().r()) {
                this.k.y(gjwt1);
            }
            else {
                etmv etmv0 = this.k;
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gjwt1).jf(5, null);
                hftp1.X(((ProtoLiteMessage)gjwt1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gjwt)hftp1.b_message).d = hfvv.a;
                etmv0.y(((gjwt)hftp1.N_build()));
            }
        }
        catch(eshj eshj0) {
            a.ae(eswy.b.i(), "Error creating TapAndPayEventLogger in PollingFrameHandler", eshj0);
        }
        dycm dycm0 = new dycm(gjwt1);
        this.l.a.b(dycm0, gmap.a);
    }

    public final void c(eswu eswu0) {
        ibuq.f(eswu0, "event");
        ((ggtj)eswy.b.h()).R("Processing event: %s, startState = %s", eswu0, this.j.c);
        eswr eswr0 = new eswr(this, eswu0);
        this.i.execute(eswr0);
    }

    public static final gjws d(esww esww0) {
        boolean z = esww0.e;
        switch(esww0.a) {
            case 65: {
                gjqj gjqj0 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                gjqj0.b(esww0.c);
                gjqj0.c(esww0.d);
                gjqj0.d(z);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjwo.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((gjwo)hftv0), "value");
                ProtoLiteBuilder hftp1 = gjqj0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjws gjws0 = (gjws)hftp1.b_message;
                ((gjwo)hftv0).getClass();
                gjws0.d = (gjwo)hftv0;
                gjws0.c = 2;
                return gjqj0.a();
            }
            case 66: {
                String s = esxg.b(esww0.b);
                gjqj gjqj1 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                gjqj1.b(esww0.c);
                gjqj1.c(esww0.d);
                gjqj1.d(z);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjwp.a).v_newBuilder();
                ibuq.f(hftp2, "builder");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gjwp gjwp0 = (gjwp)hftp2.b_message;
                gjwp0.b |= 1;
                gjwp0.c = s;
                ProtoLiteMessage hftv1 = hftp2.N_build();
                ibuq.e(hftv1, "build(...)");
                ibuq.f(((gjwp)hftv1), "value");
                ProtoLiteBuilder hftp3 = gjqj1.a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gjws gjws1 = (gjws)hftp3.b_message;
                ((gjwp)hftv1).getClass();
                gjws1.d = (gjwp)hftv1;
                gjws1.c = 3;
                return gjqj1.a();
            }
            case 70: {
                String s1 = esxg.b(esww0.b);
                gjqj gjqj2 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                gjqj2.b(esww0.c);
                gjqj2.c(esww0.d);
                gjqj2.d(z);
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gjwq.a).v_newBuilder();
                ibuq.f(hftp4, "builder");
                if(hysx.k()) {
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gjwq gjwq0 = (gjwq)hftp4.b_message;
                    gjwq0.b |= 1;
                    gjwq0.c = s1;
                }
                ProtoLiteMessage hftv2 = hftp4.N_build();
                ibuq.e(hftv2, "build(...)");
                ibuq.f(((gjwq)hftv2), "value");
                ProtoLiteBuilder hftp5 = gjqj2.a;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gjws gjws2 = (gjws)hftp5.b_message;
                ((gjwq)hftv2).getClass();
                gjws2.d = (gjwq)hftv2;
                gjws2.c = 7;
                return gjqj2.a();
            }
            case 85: {
                byte[] arr_b = esww0.b;
                if(arr_b.length >= 2 && arr_b[0] == 106) {
                    int v = arr_b[1];
                    if(v == 1) {
                        String s2 = esxg.b(ibpg.h(arr_b, 2, arr_b.length));
                        gjqj gjqj3 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                        gjqj3.b(esww0.c);
                        gjqj3.c(esww0.d);
                        gjqj3.d(z);
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gjwm.a).v_newBuilder();
                        ibuq.f(hftp6, "builder");
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gjwm gjwm0 = (gjwm)hftp6.b_message;
                        gjwm0.b |= 1;
                        gjwm0.c = s2;
                        ProtoLiteMessage hftv3 = hftp6.N_build();
                        ibuq.e(hftv3, "build(...)");
                        ibuq.f(((gjwm)hftv3), "value");
                        ProtoLiteBuilder hftp7 = gjqj3.a;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gjws gjws3 = (gjws)hftp7.b_message;
                        ((gjwm)hftv3).getClass();
                        gjws3.d = (gjwm)hftv3;
                        gjws3.c = 4;
                        return gjqj3.a();
                    }
                    if(v == 2) {
                        String s3 = esxg.b(ibpg.h(arr_b, 2, arr_b.length));
                        gjqj gjqj4 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                        gjqj4.b(esww0.c);
                        gjqj4.c(esww0.d);
                        gjqj4.d(z);
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gjwn.a).v_newBuilder();
                        ibuq.f(hftp8, "builder");
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gjwn gjwn0 = (gjwn)hftp8.b_message;
                        gjwn0.b |= 1;
                        gjwn0.c = s3;
                        ProtoLiteMessage hftv4 = hftp8.N_build();
                        ibuq.e(hftv4, "build(...)");
                        ibuq.f(((gjwn)hftv4), "value");
                        ProtoLiteBuilder hftp9 = gjqj4.a;
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gjws gjws4 = (gjws)hftp9.b_message;
                        ((gjwn)hftv4).getClass();
                        gjws4.d = (gjwn)hftv4;
                        gjws4.c = 5;
                        return gjqj4.a();
                    }
                    String s4 = esxg.b(arr_b);
                    gjqj gjqj5 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                    gjqj5.b(esww0.c);
                    gjqj5.c(esww0.d);
                    gjqj5.d(z);
                    gjql gjql0 = gjqk.a(((ProtoLiteMessage)gjwr.a).v_newBuilder());
                    if(hysx.k()) {
                        gjql0.b(s4);
                    }
                    gjqj5.e(gjql0.a());
                    return gjqj5.a();
                }
                String s5 = esxg.b(arr_b);
                gjqj gjqj6 = gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder());
                gjqj6.b(esww0.c);
                gjqj6.c(esww0.d);
                gjqj6.d(z);
                gjql gjql1 = gjqk.a(((ProtoLiteMessage)gjwr.a).v_newBuilder());
                if(hysx.k()) {
                    gjql1.b(s5);
                }
                gjqj6.e(gjql1.a());
                return gjqj6.a();
            }
            default: {
                return gjqi.a(((ProtoLiteMessage)gjws.a).v_newBuilder()).a();
            }
        }
    }
}


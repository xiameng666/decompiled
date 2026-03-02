import java.io.IOException;

public class cbjm implements cbiw {
    private final xob a;
    private final String b;
    private final int c;
    private final Integer d;

    public cbjm(xob xob0, int v, Integer integer0) {
        this.a = xob0;
        this.b = "time_picker";
        this.c = v;
        this.d = integer0;
    }

    @Override  // cbiw
    public Object a(ByteString hfsf0, ibrl ibrl0) {
        throw null;
    }

    static Object b(cbjm cbjm0, ByteString hfsf0, ibrl ibrl0) {
        cbji cbji0;
        if((ibrl0 instanceof cbji)) {
            cbji0 = (cbji)ibrl0;
            int v = cbji0.c;
            if((v & 0x80000000) == 0) {
                cbji0 = new cbji(cbjm0, ibrl0);
            }
            else {
                cbji0.c = v - 0x80000000;
            }
        }
        else {
            cbji0 = new cbji(cbjm0, ibrl0);
        }
        Object object0 = cbji0.a;
        Object object1 = ibrx.a;
        switch(cbji0.c) {
            case 0: {
                ibnx.b(object0);
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gvly.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv0;
                    throw hfur2;
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
                catch(hfur hfur3) {
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((gvly)hftv0), "parseFrom(...)");
                cbji0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(cbji0), 1);
                icbk0.z();
                String s = ((gvly)hftv0).b;
                ibuq.e(s, "getTitle(...)");
                int v1 = ((gvly)hftv0).c;
                int v2 = ((gvly)hftv0).d;
                fzbe fzbe0 = new fzbe();
                fzbe0.c = s;
                fzbe0.b();
                fzbe0.a(v1);
                fzbe0.c(v2);
                fzbe0.d(cbjm0.c);
                fzbe0.d = cbjm0.d.intValue();
                fzbf fzbf0 = fzbf.A(fzbe0);
                fzbf0.E(new cbjj(icbk0, fzbf0));
                fzbf0.D(new cbjk(icbk0));
                fzbf0.C(new cbjl(icbk0));
                fzbf0.show(cbjm0.a.getSupportFragmentManager(), cbjm0.b);
                object0 = icbk0.k();
                if(object0 == ibrx.a) {
                    ibsi.b(cbji0);
                }
                return object0 == object1 ? object1 : ((gvlz)object0).getDefaultInstanceForType();
            }
            case 1: {
                ibnx.b(object0);
                return ((gvlz)object0).getDefaultInstanceForType();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


import java.io.IOException;

public final class emfu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        ggdy ggdy1 = new ggdy();
        for(Object object1: ((hgcg)object0).b) {
            hggu hggu0 = (hggu)object1;
            try {
                ByteString hfsf0 = (hggu0.e == null ? hfrn.a : hggu0.e).c;
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)emjz.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur1) {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
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
                ggdy0.i(((emjz)hftv0));
            }
            catch(hfur hfur0) {
                a.ae(emge.a.i(), "Skip invalid entry for DevicePersonalizedPlaces", hfur0);
            }
            ggdy1.i((hggu0.c == null ? hgcv.a : hggu0.c));
        }
        emgc emgc0 = new emgc();
        emgc0.a(ggna.a);
        gged_interceptors gged0 = ggdy0.h();
        if(gged0 == null) {
            throw new NullPointerException("Null devicePersonalizedPlaces");
        }
        emgc0.a = gged0;
        emgc0.a(ggdy1.h());
        gged_interceptors gged1 = emgc0.a;
        if(gged1 != null) {
            gged_interceptors gged2 = emgc0.b;
            if(gged2 != null) {
                return new emgd(gged1, gged2);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(emgc0.a == null) {
            stringBuilder0.append(" devicePersonalizedPlaces");
        }
        if(emgc0.b == null) {
            stringBuilder0.append(" gellerEventIds");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}


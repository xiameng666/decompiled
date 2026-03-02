import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

public final class flwt {
    public static gfsx a(Map map0) {
        byte[] arr_b = (byte[])map0.get("Lighter");
        if(arr_b != null) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfrn.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ByteString hfsf0 = ((hfrn)hftv0).c;
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv1 = ((ProtoLiteMessage)hnrv.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv1);
                }
                catch(hfur hfur1) {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
                    hfur1.a = hftv1;
                    throw hfur1;
                }
                catch(hfwr hfwr0) {
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv1;
                    throw hfur2;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur3 = new hfur(iOException0);
                    hfur3.a = hftv1;
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
                    hfur4.a = hftv1;
                    throw hfur4;
                }
                ProtoLiteMessage.P_makeImmutable(hftv1);
                HashSet hashSet0 = new HashSet();
                for(Object object0: ((hnrv)hftv1).e) {
                    hashSet0.add(flxa.a(((hnry)object0)));
                }
                String s = ((hnrv)hftv1).b;
                if(s != null) {
                    return gfsx.m(new flto(s, ((hnrv)hftv1).c, ((hnrv)hftv1).d, hashSet0));
                }
                throw new NullPointerException("Null handlerId");
            }
            catch(hfur hfur0) {
                flbj.d("GroupMetadataProtos", "Conversation had invalid lighter app data", hfur0);
                return gfqx.a;
            }
        }
        return gfqx.a;
    }
}


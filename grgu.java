import java.io.IOException;

public final class grgu {
    private static final fnaa a;

    static {
        grgu.a = fmzv.a("FedSqlQueryHandler");
    }

    public static hfrn a(byte[] arr_b) {
        grhn grhn0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfrn.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((hfrn)hftv0).b.equals("type.googleapis.com/fedsql.SelectionCriteria")) {
                ByteString hfsf0 = ((hfrn)hftv0).c;
                hftc hftc1 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv1 = ((ProtoLiteMessage)grhn.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc1);
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
                grhn0 = (grhn)hftv1;
                grgu.a.g("Parsed selection criteria: %s", new Object[]{grhn0});
            }
            else {
                goto label_44;
            }
        }
        catch(hfur hfur0) {
            grgu.a.j(hfur0, "Could not parse SQL selection criteria.");
            grhn0 = null;
        }
        goto label_45;
    label_44:
        grhn0 = null;
    label_45:
        if(grhn0 == null) {
            return null;
        }
        return grhn0.b == null ? hfrn.a : grhn0.b;
    }
}


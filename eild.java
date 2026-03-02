import java.util.ArrayList;
import java.util.List;

public final class eild implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        gwhf gwhf1;
        byte[] arr_b1;
        gwgx gwgx1;
        int v11;
        int v10;
        byte[] arr_b;
        int v9;
        int v8;
        String s;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM Scan order by creationTimestampMillis")) {
            int v = oqn.b(owg0, "macAddress");
            int v1 = oqn.b(owg0, "creationTimestampMillis");
            int v2 = oqn.b(owg0, "lastUpdatedTimestampMillis");
            int v3 = oqn.b(owg0, "state");
            int v4 = oqn.b(owg0, "bleScan");
            int v5 = oqn.b(owg0, "locationScan");
            Object object1 = new ArrayList();
            while(true) {
                if(!owg0.k()) {
                    return object1;
                }
                s = owg0.j(v) ? null : owg0.d(v);
                long v6 = owg0.b(v1);
                long v7 = owg0.b(v2);
                if(owg0.j(v3)) {
                    v8 = 0;
                }
                else {
                    String s1 = owg0.d(v3);
                    switch(s1) {
                        case "STATE_MOVING": {
                            v9 = 3;
                            break;
                        }
                        case "STATE_OFF": {
                            v9 = 4;
                            break;
                        }
                        case "STATE_STILL": {
                            v9 = 2;
                            break;
                        }
                        case "UNKNOWN": {
                            v9 = 1;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s1);
                        }
                    }
                    v8 = v9;
                }
                arr_b = owg0.j(v4) ? null : owg0.l(v4);
                gwgx gwgx0 = gwgx.a;
                try {
                    v10 = v;
                    v11 = v1;
                    hftc hftc0 = hftc.a();
                    v10 = v;
                    v11 = v1;
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gwgx0), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gwgx1 = (gwgx)hftv0;
                }
                catch(hfur hfur0) {
                    a.ae(eicd.a.j(), "RDB: Cannot convert from BLS.", hfur0);
                    gwgx1 = gwgx0;
                }
                arr_b1 = owg0.j(v5) ? null : owg0.l(v5);
                gwhf gwhf0 = gwhf.a;
                try {
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gwhf0), arr_b1, 0, arr_b1.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    gwhf1 = (gwhf)hftv1;
                }
                catch(hfur hfur1) {
                    a.ae(eicd.a.j(), "RDB: Cannot convert from LS.", hfur1);
                    gwhf1 = gwhf0;
                }
                ((List)object1).add(new eikw(s, v6, v7, v8, gwgx1, gwhf1));
                v = v10;
                v1 = v11;
            }
        }
    }
}


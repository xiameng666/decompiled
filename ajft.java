import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class ajft {
    static List a(byte[] arr_b) {
        hfsl hfsl0;
        int v1;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        gmju gmju0;
        if(arr_b == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        List list0 = new ArrayList();
        while(true) {
            try {
            label_4:
                gmju0 = gmju.a;
                hftc0 = hftc.a;
            }
            catch(EOFException unused_ex) {
                return list0;
            }
            try {
                int v = byteArrayInputStream0.read();
                if(v == -1) {
                    hftv0 = null;
                }
                else {
                    v1 = hfsl.L(v, byteArrayInputStream0);
                    goto label_16;
                }
                goto label_46;
            }
            catch(hfur hfur0) {
            }
            catch(IOException iOException0) {
                throw new hfur(iOException0);
            }
            try {
                throw hfur0.b ? new hfur(hfur0) : hfur0;
            label_16:
                hfsl0 = hfsl.N(new hfri(byteArrayInputStream0, v1));
                hftv0 = ((ProtoLiteMessage)gmju0).x_newMutableInstance();
            }
            catch(EOFException unused_ex) {
                return list0;
            }
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
                goto label_41;
            }
            catch(hfur hfur1) {
            }
            catch(hfwr hfwr0) {
                goto label_28;
            }
            catch(IOException iOException1) {
                goto label_32;
            }
            catch(RuntimeException runtimeException0) {
                goto label_38;
            }
            try {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            label_28:
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            label_32:
                if((iOException1.getCause() instanceof hfur)) {
                    throw (hfur)iOException1.getCause();
                }
                hfur hfur3 = new hfur(iOException1);
                hfur3.a = hftv0;
                throw hfur3;
            label_38:
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
                try {
                label_41:
                    hfsl0.z(0);
                }
                catch(hfur hfur4) {
                    hfur4.a = hftv0;
                    throw hfur4;
                }
            label_46:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(((gmju)hftv0) != null) {
                    list0.add(((gmju)hftv0));
                    goto label_4;
                }
            }
            catch(EOFException unused_ex) {
            }
            return list0;
        }
    }

    static List b(byte[] arr_b) {
        hfsl hfsl0;
        int v1;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        gmjv gmjv0;
        if(arr_b == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        List list0 = new ArrayList();
        while(true) {
            try {
            label_4:
                gmjv0 = gmjv.a;
                hftc0 = hftc.a;
            }
            catch(EOFException unused_ex) {
                return list0;
            }
            try {
                int v = byteArrayInputStream0.read();
                if(v == -1) {
                    hftv0 = null;
                }
                else {
                    v1 = hfsl.L(v, byteArrayInputStream0);
                    goto label_16;
                }
                goto label_46;
            }
            catch(hfur hfur0) {
            }
            catch(IOException iOException0) {
                throw new hfur(iOException0);
            }
            try {
                throw hfur0.b ? new hfur(hfur0) : hfur0;
            label_16:
                hfsl0 = hfsl.N(new hfri(byteArrayInputStream0, v1));
                hftv0 = ((ProtoLiteMessage)gmjv0).x_newMutableInstance();
            }
            catch(EOFException unused_ex) {
                return list0;
            }
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
                goto label_41;
            }
            catch(hfur hfur1) {
            }
            catch(hfwr hfwr0) {
                goto label_28;
            }
            catch(IOException iOException1) {
                goto label_32;
            }
            catch(RuntimeException runtimeException0) {
                goto label_38;
            }
            try {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            label_28:
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            label_32:
                if((iOException1.getCause() instanceof hfur)) {
                    throw (hfur)iOException1.getCause();
                }
                hfur hfur3 = new hfur(iOException1);
                hfur3.a = hftv0;
                throw hfur3;
            label_38:
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
                try {
                label_41:
                    hfsl0.z(0);
                }
                catch(hfur hfur4) {
                    hfur4.a = hftv0;
                    throw hfur4;
                }
            label_46:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(((gmjv)hftv0) != null) {
                    list0.add(((gmjv)hftv0));
                    goto label_4;
                }
            }
            catch(EOFException unused_ex) {
            }
            return list0;
        }
    }
}


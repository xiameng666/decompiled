import java.io.IOException;

public final class aqzu {
    private static final baun a;

    static {
        aqzu.a = aqql.a("UploadBackupBatchResponseParser");
    }

    public static hkzp a(hjjd hjjd0) {
        hkzr hkzr0;
        byte[] arr_b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkzp)hftp0.b_message).c = 2;
        ((hkzp)hftp0.b_message).b |= 1;
        hkzp hkzp0 = (hkzp)hftp0.N_build();
        try {
            arr_b = ghjj.g(hjjd0.c);
        }
        catch(IOException iOException0) {
            aqzu.a.n("Failed to read error body response", iOException0, new Object[0]);
            return hkzp0;
        }
        try {
            if(hqhn.f()) {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkzr.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hkzr0 = (hkzr)hftv0;
            }
            else {
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkzr.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hkzr0 = (hkzr)hftv1;
            }
        }
        catch(IOException unused_ex) {
            return hkzp0;
        }
        hkzp hkzp1 = hkzr0.c;
        hkzp hkzp2 = hkzp1 == null ? hkzp.a : hkzp1;
        if(hkzo.a(hkzp2.c) != 0 && hkzo.a(hkzp2.c) != 1) {
            baun baun0 = aqzu.a;
            if(hkzp1 == null) {
                hkzp1 = hkzp.a;
            }
            baun0.d("Non-OK response message: " + hkzp1.d, new Object[0]);
            return hkzr0.c == null ? hkzp.a : hkzr0.c;
        }
        for(Object object0: hkzr0.d) {
            hkzq hkzq0 = (hkzq)object0;
            hkzp hkzp3 = hkzq0.b;
            hkzp hkzp4 = hkzp3 == null ? hkzp.a : hkzp3;
            if(hkzo.a(hkzp4.c) != 0 && hkzo.a(hkzp4.c) != 1) {
                baun baun1 = aqzu.a;
                if(hkzp3 == null) {
                    hkzp3 = hkzp.a;
                }
                baun1.d("Non-OK result response message: " + hkzp3.d, new Object[0]);
                return hkzq0.b == null ? hkzp.a : hkzq0.b;
            }
        }
        if((hkzr0.b & 1) != 0) {
            return hkzr0.c == null ? hkzp.a : hkzr0.c;
        }
        return hkzp0;
    }
}


import java.security.GeneralSecurityException;

public final class azjo {
    public final gmmn a;
    public final int b;
    public final gmmn c;
    public final int d;

    public azjo(byte[] arr_b, int v, byte[] arr_b1, int v1) {
        this.a = azjo.b(arr_b, v);
        this.b = v;
        this.c = azjo.b(arr_b1, v1);
        this.d = v1;
    }

    public static gemm a(MessageLite hfvm0, int v, gmmn gmmn0, byte[] arr_b, ByteString hfsf0) {
        byte[] arr_b1;
        try {
            arr_b1 = gmmn0.a(hfvm0.toBytesArray(), arr_b);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new azjj(String.format("Failed to encrypt object with key index: %d", v), generalSecurityException0);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gemm.a).v_newBuilder();
        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gemm)hftv0).d = hfsf1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gemm)hftv1).b = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gemm gemm0 = (gemm)hftp0.b_message;
        hfsf0.getClass();
        gemm0.c = hfsf0;
        return (gemm)hftp0.N_build();
    }

    private static gmmn b(byte[] arr_b, int v) {
        try {
            return (gmmn)gmnb.k(arr_b).o(gmwv.a(), gmmn.class);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new azjj(String.format("Failed to initialize key with index: %d", v), generalSecurityException0);
        }
    }
}


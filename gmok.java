import java.security.GeneralSecurityException;

public final class gmok implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        int v = ((gmoq)gmni0).a;
        if(v != 16 && v != 0x20) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        return gmof.a(((gmoq)gmni0), gnsl.b(v), gnsl.b(((gmoq)gmni0).b), integer0);
    }
}


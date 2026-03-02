import java.security.GeneralSecurityException;

public final class gmov implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        int v = ((gmpa)gmni0).a;
        if(v != 24) {
            return gmor.a(((gmpa)gmni0), gnsl.b(v), integer0);
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}


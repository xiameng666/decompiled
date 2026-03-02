import java.security.InvalidAlgorithmParameterException;

public final class gmur implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        int v = ((gmuh)gmmp0).a.a;
        if(v == 0x40) {
            return gnqb.c(((gmuh)gmmp0));
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + v + ". Valid keys must have 64 bytes.");
    }
}


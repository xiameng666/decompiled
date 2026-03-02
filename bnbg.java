import java.security.interfaces.ECPublicKey;

public final class bnbg {
    public final ECPublicKey a;
    public final byte[] b;
    public final boolean c;
    public final gfsx d;
    private final int e;
    private final long f;

    public bnbg(ECPublicKey eCPublicKey0, byte[] arr_b, int v, long v1, boolean z, gfsx gfsx0) {
        this.a = eCPublicKey0;
        this.b = arr_b;
        this.e = v;
        this.f = v1;
        this.c = z;
        this.d = gfsx0;
    }

    @Override
    public final String toString() {
        return "QrCodeComponents{publicKey=" + this.a + ", numOfAssignedDomains=" + this.e + ", currentTimeInSecond=" + this.f + ", supportStateAssistedTransactions=" + this.c + ", hint=" + this.d.toString() + "}";
    }
}


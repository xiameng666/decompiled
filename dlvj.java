import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.nio.charset.StandardCharsets;

public final class dlvj {
    public static final bboh a;
    public final cqxc b;
    public final cjlv c;
    private static final byte[] d;

    static {
        dlvj.a = bboh.b("Pay", bbcu.cZ);
        dlvj.d = "challenge".getBytes(StandardCharsets.UTF_8);
    }

    public dlvj(cqxc cqxc0, cjlv cjlv0) {
        this.b = cqxc0;
        this.c = cjlv0;
    }

    public final void a(gtxe gtxe0, gtvs gtvs0) {
        for(Object object0: gtxe0.b) {
            gtxg gtxg0 = (gtxg)object0;
            gtvs gtvs1 = gtvs.b(dtnn.b(gtxg0).c);
            if(gtvs1 == null) {
                gtvs1 = gtvs.m;
            }
            if(gtvs1.equals(gtvs0)) {
                String s = gtxg0.b;
                ProvisioningId provisioningId0 = new ProvisioningId(s);
                evql evql0 = this.b.d(provisioningId0, dlvj.d);
                evql0.b(new dlvf(this, s, gtvs1));
                evql0.A(new dlvg(gtxg0));
            }
        }
    }
}


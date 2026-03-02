import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import jeb.synthetic.FIN;

public final class tka implements twj {
    public final tjx a;
    public byte[] b;

    static {
    }

    public tka() {
        this.a = new tjx();
        new tjv();
    }

    @Override  // twj
    public final void a(syd syd0) {
        this.a.c = syd0.c();
    }

    public final ttl b() {
        tnm tnm0;
        int v = FIN.finallyOpen$NT();
        byte[] arr_b = this.b;
        if(arr_b != null) {
            try {
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                tnm0 = new tnm();
                ttp.a(byteArrayInputStream0, tnm0.a);
                tnm0.b = ttp.c(byteArrayInputStream0);
                ttp.c(byteArrayInputStream0);
            }
            catch(IOException iOException0) {
                throw twp.b(iOException0);
            }
            ttl ttl0 = new ttl(tnm0, new Date());
            FIN.finallyCodeBegin$NT(v);
            return ttl0;
        }
        throw new IllegalStateException();
    }
}


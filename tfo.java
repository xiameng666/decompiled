import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import jeb.synthetic.FIN;

public final class tfo implements tjb {
    public final tfl a;
    public byte[] b;
    private static final String c = "tfo";

    static {
    }

    public tfo() {
        this.a = new tfl();
        new tfj();
    }

    @Override  // tjb
    public final void a(tfe tfe0) {
        this.a.c = tfe0.c();
    }

    public final tgd b() {
        tql tql0;
        int v = FIN.finallyOpen$NT();
        tjk.f("generateKeyBundle() - {}", new Object[]{this.b});
        byte[] arr_b = this.b;
        if(arr_b != null) {
            try {
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                tql0 = new tql();
                tgh.a(byteArrayInputStream0, tql0.a);
                tql0.b = tgh.c(byteArrayInputStream0);
                tgh.c(byteArrayInputStream0);
            }
            catch(IOException iOException0) {
                throw tjh.b(iOException0);
            }
            tgd tgd0 = new tgd(tql0, new Date());
            FIN.finallyCodeBegin$NT(v);
            return tgd0;
        }
        throw new IllegalStateException();
    }
}


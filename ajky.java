import j..util.Objects;
import javax.crypto.SecretKey;

final class ajky implements gmbg {
    final hhvf a;
    final byte[] b;
    final gmcu c;

    public ajky(ajla ajla0, hhvf hhvf0, byte[] arr_b, gmcu gmcu0) {
        this.a = hhvf0;
        this.b = arr_b;
        this.c = gmcu0;
        Objects.requireNonNull(ajla0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c.r(throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        SecretKey secretKey0 = (SecretKey)object0;
        try {
            ((ggtj)ajla.a.h()).x("Decrypting challenge with symmetric key...");
            byte[] arr_b = ajla.b(this.a, secretKey0, this.b);
            this.c.q(arr_b);
        }
        catch(ajku ajku0) {
            this.c.r(ajku0);
        }
    }
}


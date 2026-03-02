import j..util.Objects;
import java.io.IOException;

final class eipf {
    fpky a;
    byte[] b;
    byte[] c;
    long d;

    public eipf() {
        this.a = new fpky(2);
        this.d = -1L;
    }

    final void a(fple fple0) {
        try {
            fpky fpky0 = this.a;
            gftb.check(fpky0);
            fpkx fpkx0 = fpky0.a();
            Objects.requireNonNull(fpkx0);
            this.b = fple0.a(new eipe(fpkx0));
            this.a = null;
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }
}


import j..util.Objects;
import java.io.IOException;

public final class tyf {
    public final tyg a;
    public final boolean[] b;
    public boolean c;
    public final tyi d;

    public tyf(tyi tyi0, tyg tyg0) {
        Objects.requireNonNull(tyi0);
        this.d = tyi0;
        super();
        this.a = tyg0;
        this.b = tyg0.e ? null : new boolean[tyi0.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if(!this.c) {
            try {
                this.a();
            }
            catch(IOException unused_ex) {
            }
        }
    }
}


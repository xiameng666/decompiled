import j..util.Objects;
import java.io.IOException;
import org.webrtc.DataChannel;

final class czne implements czyp {
    final czyv a;
    final cznf b;

    public czne(cznf cznf0, czyv czyv0) {
        this.a = czyv0;
        Objects.requireNonNull(cznf0);
        this.b = cznf0;
        super();
    }

    @Override  // czyp
    public final czle a(DataChannel dataChannel0) {
        try {
            return new czle(new czze(this.a.toString(), dataChannel0), gyxo.b);
        }
        catch(IOException iOException0) {
            czke.b(new cvae(this.b.a, 4, this.b.c), gymt.f, gymd.ar, iOException0.getMessage());
            return new czle(gyxo.cN);
        }
    }

    @Override  // czyp
    public final void b(czze czze0) {
        cznc cznc0 = new cznc(this, czze0, this.a);
        this.b.b(cznc0);
    }

    @Override  // czyp
    public final void c(czze czze0) {
        cznd cznd0 = new cznd(this, czze0);
        this.b.b(cznd0);
    }
}


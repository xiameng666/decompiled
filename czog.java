import j..util.Objects;
import java.io.IOException;
import org.webrtc.DataChannel;

final class czog implements czyp {
    final czyv a;
    final czoi b;

    public czog(czoi czoi0, czyv czyv0) {
        this.a = czyv0;
        Objects.requireNonNull(czoi0);
        this.b = czoi0;
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
        czoe czoe0 = new czoe(this, czze0, this.a);
        this.b.b(czoe0);
    }

    @Override  // czyp
    public final void c(czze czze0) {
        czof czof0 = new czof(this, czze0);
        this.b.b(czof0);
    }
}


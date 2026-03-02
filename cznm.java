import j..util.Objects;
import java.io.IOException;
import org.webrtc.DataChannel;

final class cznm implements czyp {
    final cznn a;

    public cznm(cznn cznn0) {
        Objects.requireNonNull(cznn0);
        this.a = cznn0;
        super();
    }

    @Override  // czyp
    public final czle a(DataChannel dataChannel0) {
        try {
            return new czle(new czze(this.a.b.toString(), dataChannel0), gyxo.b);
        }
        catch(IOException iOException0) {
            cznn cznn0 = this.a;
            czke.b(new cvae(cznn0.a, 8, cznn0.g), gymb.j, gymd.ar, iOException0.getMessage());
            czyb czyb0 = cznn0.e;
            if(czyb0 != null) {
                czyb0.k();
            }
            czzk czzk0 = cznn0.m;
            if(czzk0 != null) {
                czzk0.f();
            }
            return new czle(gyxo.cd);
        }
    }

    @Override  // czyp
    public final void b(czze czze0) {
        cznl cznl0 = new cznl(this, czze0);
        this.a.b(cznl0);
    }

    @Override  // czyp
    public final void c(czze czze0) {
        this.a.f = czze0;
        this.a.d.countDown();
    }
}


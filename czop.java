import j..util.Objects;
import java.io.IOException;
import org.webrtc.DataChannel;

final class czop implements czyp {
    final czor a;

    public czop(czor czor0) {
        Objects.requireNonNull(czor0);
        this.a = czor0;
        super();
    }

    @Override  // czyp
    public final czle a(DataChannel dataChannel0) {
        try {
            return new czle(new czze(this.a.b.toString(), dataChannel0), gyxo.b);
        }
        catch(IOException iOException0) {
            czor czor0 = this.a;
            czke.b(new cvae(czor0.a, 8, czor0.g), gymb.j, gymd.ar, iOException0.getMessage());
            czyo czyo0 = czor0.e;
            if(czyo0 != null) {
                czyo0.f();
            }
            czzk czzk0 = czor0.m;
            if(czzk0 != null) {
                czzk0.f();
            }
            return new czle(gyxo.cd);
        }
    }

    @Override  // czyp
    public final void b(czze czze0) {
        czoo czoo0 = new czoo(this, czze0);
        this.a.b(czoo0);
    }

    @Override  // czyp
    public final void c(czze czze0) {
        this.a.f = czze0;
        this.a.d.countDown();
    }
}


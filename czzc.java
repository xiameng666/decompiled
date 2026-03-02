import java.io.IOException;

public final class czzc implements Runnable {
    public final czze a;
    public final byte[] b;

    public czzc(czze czze0, byte[] arr_b) {
        this.a = czze0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        czze czze0;
        try {
            czze0 = this.a;
            czze0.l.a(this.b);
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).p("Unable to write to WebRtcSocket pipe.", new Object[0]);
            czze0.h();
        }
    }
}


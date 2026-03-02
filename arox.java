import java.io.IOException;
import java.io.InputStream;

public final class arox implements Runnable {
    public final arpn a;
    public final InputStream b;
    public final long c;
    public final arli d;

    public arox(arpn arpn0, InputStream inputStream0, long v, arli arli0) {
        this.a = arpn0;
        this.b = inputStream0;
        this.c = v;
        this.d = arli0;
    }

    @Override
    public final void run() {
        arli arli0;
        long v;
        arpn arpn0;
        try {
            arpn0 = this.a;
            v = this.c;
            InputStream inputStream0 = this.b;
            arli0 = this.d;
            int v1 = inputStream0.read();
            if(arpn0.h.get()) {
                arpn.d.m("This WifiTransport has already shut down. Abandoning sending a stream after reading its first byte: %d.", new Object[]{v1});
                return;
            }
            arpn0.b.execute(new arpf(arpn0, v1, v, inputStream0, arli0));
        }
        catch(IOException iOException0) {
            arpn.d.g("IOException from sendStream. Sending stream error packet.", iOException0, new Object[0]);
            arpn0.b.execute(new arpg(arpn0, v, arli0));
        }
    }
}


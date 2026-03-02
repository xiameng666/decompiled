import java.io.IOException;
import java.io.InputStream;

public final class arow implements Runnable {
    public final arpn a;
    public final InputStream b;
    public final arli c;

    public arow(arpn arpn0, InputStream inputStream0, arli arli0) {
        this.a = arpn0;
        this.b = inputStream0;
        this.c = arli0;
    }

    @Override
    public final void run() {
        arpn arpn0;
        try {
            InputStream inputStream0 = this.b;
            arpn0 = this.a;
            arli arli0 = this.c;
            int v = inputStream0.read();
            if(arpn0.h.get()) {
                arpn.d.m("This WifiTransport has already shut down. Abandoning sending a stream after reading its first byte: %d.", new Object[]{v});
                return;
            }
            arpn0.b.execute(new arpc(arpn0, v, inputStream0, arli0));
        }
        catch(IOException unused_ex) {
            arpn.d.f("IOException from sendStream. Sending stream error packet.", new Object[0]);
            arpn0.b.execute(new arpd(arpn0));
        }
    }
}


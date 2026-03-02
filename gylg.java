import j..util.Objects;
import java.io.IOException;

final class gylg implements gyjk {
    final gylh a;

    public gylg(gylh gylh0) {
        Objects.requireNonNull(gylh0);
        this.a = gylh0;
        super();
    }

    @Override  // gyjk
    public final void a() {
    }

    @Override
    public final void run() {
        try {
            this.a.b.e((this.a.a.d == null ? gyhk.a : this.a.a.d).c.toByteArray());
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Error sending payload.", iOException0);
        }
    }
}


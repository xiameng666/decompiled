import java.io.Closeable;

public final class fozu implements Closeable {
    public final fpai a;

    public fozu(fpai fpai0) {
        this.a = fpai0;
    }

    @Override
    public final void close() {
        fpai fpai0 = this.a;
        if(fpai0.f == null) {
            fpai0.f = foty.b();
        }
    }
}


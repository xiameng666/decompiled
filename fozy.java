import java.io.Closeable;

public final class fozy implements Closeable {
    public final fpai a;

    public fozy(fpai fpai0) {
        this.a = fpai0;
    }

    @Override
    public final void close() {
        fpai fpai0 = this.a;
        if(fpai0.d == null) {
            fpai0.d = foty.b();
        }
    }
}


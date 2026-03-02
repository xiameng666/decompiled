import android.content.Context;

public final class bosg implements AutoCloseable {
    public final Context a;
    public final azox b;

    public bosg(Context context0, azox azox0) {
        this.a = context0;
        this.b = azox0;
    }

    @Override
    public final void close() {
        bbic.a().b(this.a, this.b);
    }
}


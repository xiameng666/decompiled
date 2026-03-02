import android.net.Uri;

public final class dcxt extends clid {
    final ichm a;

    public dcxt(ichm ichm0) {
        this.a = ichm0;
        super("nearby", "RadioStatusRepositoryBleObserver", null);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        Object object0 = this.a.b(ibom.a);
        if(!icha.c(object0) && !(object0 instanceof icgy)) {
            throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
        }
    }
}


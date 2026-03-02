import com.android.volley.AsyncCache.OnWriteCompleteCallback;
import j..util.Objects;

final class sph implements AsyncCache.OnWriteCompleteCallback {
    final spi a;

    public sph(spi spi0) {
        Objects.requireNonNull(spi0);
        this.a = spi0;
        super();
    }

    @Override  // com.android.volley.AsyncCache$OnWriteCompleteCallback
    public final void onWriteComplete() {
        this.a.b.b(this.a.d, this.a.a, true);
    }
}


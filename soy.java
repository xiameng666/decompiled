import com.android.volley.AsyncCache.OnWriteCompleteCallback;
import j..util.Objects;

final class soy implements AsyncCache.OnWriteCompleteCallback {
    final soz a;

    public soy(soz soz0) {
        Objects.requireNonNull(soz0);
        this.a = soz0;
        super();
    }

    @Override  // com.android.volley.AsyncCache$OnWriteCompleteCallback
    public final void onWriteComplete() {
        this.a.a.d();
    }
}


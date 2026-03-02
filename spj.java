import com.android.volley.AsyncCache.OnGetCompleteCallback;
import com.android.volley.Cache.Entry;
import j..util.Objects;

final class spj implements AsyncCache.OnGetCompleteCallback {
    final spk a;

    public spj(spk spk0) {
        Objects.requireNonNull(spk0);
        this.a = spk0;
        super();
    }

    @Override  // com.android.volley.AsyncCache$OnGetCompleteCallback
    public final void onGetComplete(Cache.Entry cache$Entry0) {
        this.a.a.c(cache$Entry0, this.a.d);
    }
}


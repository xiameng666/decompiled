import android.util.Log;

public abstract class gguy extends ggtx {
    private final String a;

    protected gguy(String s) {
        this.a = s;
    }

    @Override  // ggtx
    public void a(RuntimeException runtimeException0, ggtu ggtu0) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException0);
    }

    @Override  // ggtx
    public String d() {
        return this.a;
    }
}


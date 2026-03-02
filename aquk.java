import android.content.Context;

public final class aquk implements gful_cronetEngineProvider {
    public final Context a;

    public aquk(Context context0) {
        this.a = context0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return new aquw(this.a).a();
    }
}


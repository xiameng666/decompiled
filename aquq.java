import android.content.Context;

public final class aquq implements gful_cronetEngineProvider {
    public final Context a;
    public final aquw b;

    public aquq(Context context0, aquw aquw0) {
        this.a = context0;
        this.b = aquw0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return new aqvq(this.a, this.b);
    }
}


import android.content.Context;

public final class azhl implements gful_cronetEngineProvider {
    public final Context a;

    public azhl(Context context0) {
        this.a = context0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return new eint(new einq(this.a), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", this.a);
    }
}


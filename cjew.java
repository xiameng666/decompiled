import android.net.Uri;

public final class cjew implements cjgb {
    private cjfz a;

    static {
        Uri.parse("content://com.google.android.wearable.settings/location_config");
    }

    @Override  // cjgb
    public final Object a() {
        return Boolean.valueOf(false);
    }

    @Override  // cjgb
    public final void b(cjga cjga0) {
        if(this.a != null) {
            throw new IllegalStateException();
        }
        this.a = cjfz.a;
    }

    @Override  // cjgb
    public final void c() {
        if(this.a == null) {
            throw new IllegalStateException();
        }
        this.a = null;
    }
}


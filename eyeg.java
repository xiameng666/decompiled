import android.content.ContentResolver;
import android.provider.Settings.Secure;

final class eyeg extends eyei {
    private final String a;

    public eyeg(String s) {
        this.a = s;
    }

    @Override  // eyei
    public final void a(ContentResolver contentResolver0) {
        ibuq.f(contentResolver0, "contentResolver");
        Settings.Secure.putInt(contentResolver0, this.a, 0);
    }

    @Override  // eyei
    public final void b(ContentResolver contentResolver0) {
        ibuq.f(contentResolver0, "contentResolver");
        Settings.Secure.putInt(contentResolver0, this.a, 1);
    }

    @Override
    public final String toString() {
        return this.a;
    }
}


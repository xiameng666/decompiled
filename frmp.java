import android.content.Context;
import android.net.Uri.Builder;

public final class frmp implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("file").authority("").path("/");
        ggdy ggdy0 = new ggdy();
        frcp.b(((Context)object0).getFilesDir(), uri$Builder0);
        uri$Builder0.appendPath("mobstore_salt.pb");
        return frcp.a(uri$Builder0, ggdy0);
    }
}


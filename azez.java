import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

public final class azez {
    public final frli a;
    private static volatile azez b;
    private final Executor c;

    private azez(Context context0) {
        this.c = new bblp(0x7FFFFFFF, 9);
        frbx frbx0 = new frbx(gged_interceptors.l(new frcr(cjsw.a)));
        frij frij0 = new frij();
        frij0.a = new bblp(0x7FFFFFFF, 10);
        frij0.b = frbx0;
        frij0.b(frhu.a);
        frii frii0 = frij0.a();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("file").authority("").path("/");
        ggdy ggdy0 = new ggdy();
        frcp.b(new File(context0.getFilesDir(), "clearcut"), uri$Builder0);
        uri$Builder0.appendPath("UploadLogResult.pb");
        Uri uri0 = frcp.a(uri$Builder0, ggdy0);
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)hlso.a));
        frie0.h(frhj.a);
        this.a = frii0.a(frie0.a());
    }

    public static azez a(Context context0) {
        azez azez1;
        azez azez0 = azez.b;
        if(azez0 == null) {
            synchronized(azez.class) {
                azez1 = new azez(context0);
                azez.b = azez1;
            }
            return azez1;
        }
        return azez0;
    }

    public final gmcd b(hlso hlso0) {
        azey azey0 = new azey(hlso0);
        return this.a.b(azey0, this.c);
    }
}


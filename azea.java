import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class azea {
    public static volatile azea a;
    public final Executor b;
    public final frli c;

    public azea(Context context0) {
        this.b = new bblp(0x7FFFFFFF, 9);
        frbx frbx0 = new frbx(gged_interceptors.l(new frcr(cjsw.a)));
        frij frij0 = new frij();
        frij0.a = new bblp(0x7FFFFFFF, 10);
        frij0.b = frbx0;
        frij0.b(frks.a);
        frii frii0 = frij0.a();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("file").authority("").path("/");
        ggdy ggdy0 = new ggdy();
        frcp.b(new File(context0.getFilesDir(), "clearcut"), uri$Builder0);
        uri$Builder0.appendPath("SamplePopulationIds.pb");
        Uri uri0 = frcp.a(uri$Builder0, ggdy0);
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ayvv.a));
        this.c = frii0.a(frie0.a());
    }

    public final ayvu a(String s) {
        try {
            gmcd gmcd0 = glzd.f(gmbt.h(this.c.a()), new azdx(s), gmap.a);
            azdy azdy0 = new azdy();
            return (ayvu)gmde.a(glyi.f(gmcd0, Throwable.class, azdy0, gmap.a));
        }
        catch(ExecutionException executionException0) {
            Log.e("CCTRandomNumberStore", "Reading from the ProtoDataStore failed", executionException0);
            return null;
        }
    }

    public static final boolean b(ayvu ayvu0) {
        return ayvu0.d > 0L && ayvu0.d <= System.currentTimeMillis();
    }
}


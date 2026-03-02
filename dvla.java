import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;

public final class dvla {
    public static final gged_interceptors a(Context context0, gged_interceptors gged0, boolean z) {
        byte[] arr_b;
        ibuq.f(context0, "context");
        ibuq.f(gged0, "uris");
        if(z) {
            ((ggtj)dvlb.a.h()).x("Creating cached uris for internal");
        }
        else {
            ((ggtj)dvlb.a.h()).x("Creating cached uris for external");
        }
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = gged0.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            Uri uri0 = (Uri)ggqk0.next();
            ibuq.f(context0, "context");
            File file0 = File.createTempFile("ucp-", ".temp", context0.getCacheDir());
            ibuq.e(file0, "createTempFile(...)");
            ibuq.c(uri0);
            if(z) {
                InputStream inputStream0 = dvlx.b(context0, uri0);
                try {
                    arr_b = ghjj.g(inputStream0);
                }
                catch(Throwable throwable0) {
                    ibsx.a(inputStream0, throwable0);
                    throw throwable0;
                }
                ibsx.a(inputStream0, null);
            }
            else {
                InputStream inputStream1 = fqbf.d(context0, uri0, fqbe.a);
                try {
                    arr_b = ghjj.g(inputStream1);
                }
                catch(Throwable throwable1) {
                    ibsx.a(inputStream1, throwable1);
                    throw throwable1;
                }
                ibsx.a(inputStream1, null);
            }
            ibuq.c(arr_b);
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                fileOutputStream0.write(arr_b);
            }
            catch(Throwable throwable2) {
                ibsx.a(fileOutputStream0, throwable2);
                throw throwable2;
            }
            ibsx.a(fileOutputStream0, null);
            ggdy0.i(Uri.fromFile(file0));
        }
        gged_interceptors gged1 = ggdy0.h();
        ibuq.e(gged1, "build(...)");
        return gged1;
    }

    public static final boolean b(Context context0, Uri uri0) {
        ibuq.f(context0, "context");
        ibuq.f(uri0, "uri");
        if(uri0.getPath() == null) {
            ((ggtj)dvlb.a.j()).x("Uri path is null");
        }
        String s = uri0.getPath();
        if(s != null) {
            String s1 = context0.getCacheDir().getPath();
            ibuq.e(s1, "getPath(...)");
            if(ibzk.W(s, s1)) {
                String s2 = uri0.getLastPathSegment();
                return s2 == null || !ibzk.W(s2, "ucp-") || !ibzk.J(s2, ".temp") ? false : new File(new URI(uri0.toString())).exists();
            }
        }
        ((ggtj)dvlb.a.h()).x("Uri doesn\'t match the cached directory, so this is not a cached resource");
        return false;
    }
}


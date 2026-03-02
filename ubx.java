import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class ubx implements ubl {
    protected final boolean a;
    private final Uri b;
    private final ContentResolver c;
    private Object d;

    public ubx(ContentResolver contentResolver0, Uri uri0, boolean z) {
        this.c = contentResolver0;
        this.b = uri0;
        this.a = z;
    }

    protected abstract Object b(Uri arg1, ContentResolver arg2);

    protected abstract void c(Object arg1);

    @Override  // ubl
    public final void d() {
    }

    @Override  // ubl
    public final void e() {
        Object object0 = this.d;
        if(object0 != null) {
            try {
                this.c(object0);
            }
            catch(IOException unused_ex) {
            }
        }
    }

    protected final AssetFileDescriptor f(Uri uri0) {
        return !this.a || !ucc.c(uri0) || !ucc.b() ? this.c.openAssetFileDescriptor(uri0, "r") : ucc.a(uri0, this.c);
    }

    @Override  // ubl
    public final uag fw() {
        return uag.a;
    }

    @Override  // ubl
    public final void g(txn txn0, ubk ubk0) {
        try {
            Object object0 = this.b(this.b, this.c);
            this.d = object0;
            ubk0.c(object0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            ubk0.f(fileNotFoundException0);
        }
    }
}


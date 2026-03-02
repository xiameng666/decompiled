import android.content.Context;
import android.os.Environment;
import java.io.File;

public final class dgll {
    public final Context a;
    public final File b;

    public dgll(Context context0, String s) {
        ibuq.f(context0, "context");
        File file0;
        super();
        this.a = context0;
        if(s == null) {
            dcvz.a.b().p("Using public downloads directory.", new Object[0]);
            file0 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        else if(hrnt.i()) {
            file0 = new File(ccsb.a.b(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), s));
        }
        else {
            file0 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), s);
        }
        this.b = file0;
    }

    public final long a(long v, boolean z) {
        Context context0 = this.a;
        gged_interceptors gged0 = djbh.a(context0, v);
        if(gged0 == null) {
            return 0L;
        }
        long v1 = djas.a(gged0, djas.b(dglk.b(context0, z), gged0));
        return v1 == -1L ? 0L : v1;
    }
}


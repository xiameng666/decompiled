import android.content.Context;
import java.io.File;

public final class aqyv {
    public File a;
    public File b;
    private final Context c;

    public aqyv(Context context0) {
        this.c = context0;
        this.c();
    }

    public final File a(String s) {
        Context context0 = this.c;
        if(aqxa.n(context0)) {
            return aqxa.c(context0, s);
        }
        return hrnt.i() ? new File(ccsb.a.b(this.a, s + "_temp")) : new File(this.a, s + "_temp");
    }

    public final File b(String s) {
        Context context0 = this.c;
        if(aqxa.n(context0)) {
            return aqxa.c(context0, s);
        }
        return hrnt.i() ? new File(ccsb.a.b(this.b, s)) : new File(this.b, s);
    }

    public final void c() {
        synchronized(this) {
            this.a = aqze.b(this.c, "d2d_backup_data");
            this.b = hrnt.i() ? new File(ccsb.a.b(this.c.getFilesDir(), "d2d_restore_data")) : new File(this.c.getFilesDir(), "d2d_restore_data");
            this.a.mkdirs();
            this.b.mkdirs();
        }
    }
}


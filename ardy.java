import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.FIN;

public final class ardy {
    public final aqyv a;
    private static final aqql b;
    private final Context c;
    private final Map d;

    static {
        ardy.b = new aqql(new String[]{"D2dFileWriteTracker"});
    }

    public ardy(Context context0) {
        aqyv aqyv0 = new aqyv(context0);
        super();
        this.d = new HashMap();
        this.c = context0;
        this.a = aqyv0;
    }

    public final void a(String s) {
        synchronized(this) {
            this.d(s, false);
        }
    }

    public final void b(String s, InputStream inputStream0) {
        ardz ardz0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(((ardz)this.d.get(s)) == null) {
            try {
                ardz0 = new ardz(aqze.b(this.c, "backupdata_tmp." + s), inputStream0);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                throw new asdg("Unable to open d2d file for write: " + s, fileNotFoundException0);
            }
            ardz0.b.start();
            this.d.put(s, ardz0);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new asdg("Package already open for write: " + s);
    }

    public final void c(String s) {
        synchronized(this) {
            this.d(s, true);
        }
    }

    private final void d(String s, boolean z) {
        boolean z1;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ardz ardz0 = (ardz)this.d.remove(s);
        if(ardz0 != null) {
            try {
                ardz0.b.join(5000L);
                z1 = ardz0.b.a();
            }
            catch(InterruptedException interruptedException0) {
                throw new asdg("Timeout while waiting for write thread to finish for package: " + s, interruptedException0);
            }
            finally {
                ardz0.a();
                ardz0.a.delete();
            }
            if(z && z1) {
                aqql aqql0 = ardy.b;
                aqql0.d("Transfer success for package: %s; now renaming temp file", new Object[]{s});
                File file0 = ardz0.a;
                if(file0.renameTo(this.a.b(s))) {
                    FIN.finallyCodeBegin$NT(v);
                    return;
                }
                aqql0.f("Couldn\'t move temp file to restore dir %s for package %s", new Object[]{file0.getPath(), s});
                throw new asdg("Couldn\'t move temp file to restore directory, package: " + s);
            }
            throw new asdg(String.format("For package %s  localSuccess=%s  remoteSuccess=%s ; calling onFailure()", s, Boolean.valueOf(z1), Boolean.valueOf(z)));
        }
        throw new asdg("Complete called on unexpected package: " + s);
    }
}


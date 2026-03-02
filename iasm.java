import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public abstract class iasm {
    public static final Logger a;
    protected final IBinder b;
    public static final iasi c;

    static {
        iasm.a = Logger.getLogger(iasm.class.getName());
        iasm.c = new iasi();
    }

    protected iasm(IBinder iBinder0) {
        this.b = iBinder0;
    }

    public abstract void a(int arg1, iasp arg2);

    public static iasm b(IBinder iBinder0, Executor executor0) {
        return (iBinder0 instanceof Binder) ? new iask(iBinder0, executor0) : new iasl(iBinder0);
    }

    protected final boolean c(int v, Parcel parcel0) {
        boolean z;
        try {
            z = this.b.transact(v, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
        return z;
    }
}


import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class azuz extends azvh {
    public final SparseArray a;

    public azuz(azxy azxy0) {
        super(azxy0, azpm.a);
        this.a = new SparseArray();
        this.e.c("AutoManageHelper", this);
    }

    @Override  // azxx
    public final void a(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        for(int v = 0; v < this.a.size(); ++v) {
            azuy azuy0 = this.l(v);
            if(azuy0 != null) {
                printWriter0.append(s).append("GoogleApiClient #").print(azuy0.a);
                printWriter0.println(":");
                azuy0.b.h(s + "  ", fileDescriptor0, printWriter0, arr_s);
            }
        }
    }

    @Override  // azvh
    protected final void b(ConnectionResult connectionResult0, int v) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if(v < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray sparseArray0 = this.a;
        azuy azuy0 = (azuy)sparseArray0.get(v);
        if(azuy0 != null) {
            azuy azuy1 = (azuy)sparseArray0.get(v);
            sparseArray0.remove(v);
            if(azuy1 != null) {
                synchronized(((azww)azuy1.b).c.i) {
                    if(!((azww)azuy1.b).c.d.remove(azuy1)) {
                        Log.w("GmsClientEvents", a.b(azuy1, "unregisterConnectionFailedListener(): listener ", " not found"));
                    }
                }
                azuy1.b.g();
            }
            aztv aztv0 = azuy0.c;
            if(aztv0 != null) {
                aztv0.onConnectionFailed(connectionResult0);
            }
        }
    }

    @Override  // azvh
    protected final void c() {
        for(int v = 0; v < this.a.size(); ++v) {
            azuy azuy0 = this.l(v);
            if(azuy0 != null) {
                azuy0.b.f();
            }
        }
    }

    @Override  // azvh
    public final void d() {
        super.d();
        SparseArray sparseArray0 = this.a;
        if(this.c.get() == null) {
            for(int v = 0; v < sparseArray0.size(); ++v) {
                azuy azuy0 = this.l(v);
                if(azuy0 != null) {
                    azuy0.b.f();
                }
            }
        }
    }

    @Override  // azvh
    public final void e() {
        super.e();
        for(int v = 0; v < this.a.size(); ++v) {
            azuy azuy0 = this.l(v);
            if(azuy0 != null) {
                azuy0.b.g();
            }
        }
    }

    private final azuy l(int v) {
        return this.a.size() > v ? ((azuy)this.a.get(this.a.keyAt(v))) : null;
    }
}


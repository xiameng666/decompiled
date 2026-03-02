import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class eqis extends wby implements eqit {
    public final eqda a;
    protected Handler b;

    public eqis() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
    }

    public eqis(eqda eqda0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
        this.b = new eqkq(this, Looper.getMainLooper());
        this.a = eqda0;
    }

    @Override  // eqit
    public final void a(BootstrapCompletionResult bootstrapCompletionResult0) {
        this.b.sendMessage(this.b.obtainMessage(2, bootstrapCompletionResult0));
    }

    @Override  // eqit
    public final void b(TargetConnectionArgs targetConnectionArgs0) {
        this.b.sendMessage(this.b.obtainMessage(0, targetConnectionArgs0));
    }

    @Override  // eqit
    public final void c() {
        this.b.sendEmptyMessage(1);
    }

    @Override  // eqit
    public final void d(int v) {
        this.b.sendMessage(this.b.obtainMessage(5, Integer.valueOf(v)));
    }

    @Override  // eqit
    public final void e(String s) {
        this.b.sendMessage(this.b.obtainMessage(3, s));
    }

    @Override  // eqit
    public final void f(String s) {
        this.b.sendMessage(this.b.obtainMessage(4, s));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                TargetConnectionArgs targetConnectionArgs0 = (TargetConnectionArgs)wbz.a(parcel0, TargetConnectionArgs.CREATOR);
                eqis.gr(parcel0);
                this.b(targetConnectionArgs0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.c();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                BootstrapProgressResult bootstrapProgressResult0 = (BootstrapProgressResult)wbz.a(parcel0, BootstrapProgressResult.CREATOR);
                eqis.gr(parcel0);
                boolean z = this.g(bootstrapProgressResult0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                this.b.sendEmptyMessage(2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                eqis.gr(parcel0);
                this.e(s);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s1 = parcel0.readString();
                eqis.gr(parcel0);
                this.f(s1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                int v1 = parcel0.readInt();
                eqis.gr(parcel0);
                this.d(v1);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                BootstrapCompletionResult bootstrapCompletionResult0 = (BootstrapCompletionResult)wbz.a(parcel0, BootstrapCompletionResult.CREATOR);
                eqis.gr(parcel0);
                this.a(bootstrapCompletionResult0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqit
    public final boolean g(BootstrapProgressResult bootstrapProgressResult0) {
        boolean z;
        FutureTask futureTask0 = new FutureTask(new eqkr(this, bootstrapProgressResult0));
        this.b.post(futureTask0);
        try {
            Log.v("SmartDevice", "Waiting on client onProgress() response.");
            z = ((Boolean)futureTask0.get()).booleanValue();
            Log.v("SmartDevice", "Client returned onProgress(): " + z);
        }
        catch(ExecutionException | InterruptedException exception0) {
            Log.e("SmartDevice", "Failed while waiting for TargetBootstrapListener.onProgress()", exception0);
            z = false;
        }
        finally {
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
        }
        return z;
    }
}


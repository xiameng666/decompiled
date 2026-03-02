import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class azox implements ServiceConnection {
    boolean a;
    private final BlockingQueue b;

    public azox() {
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }

    public final IBinder a() {
        batl.k("BlockingServiceConnection.getService() called on main thread");
        if(this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        return (IBinder)this.b.take();
    }

    public final IBinder b(long v, TimeUnit timeUnit0) {
        batl.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if(this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        IBinder iBinder0 = (IBinder)this.b.poll(v, timeUnit0);
        if(iBinder0 != null) {
            return iBinder0;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.b.add(iBinder0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}


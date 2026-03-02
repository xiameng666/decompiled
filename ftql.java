import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ftql implements ServiceConnection {
    final ftqm a;

    public ftql(ftqm ftqm0) {
        Objects.requireNonNull(ftqm0);
        this.a = ftqm0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        this.a.n();
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        this.a.n();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        ftqf ftqf0;
        if(iBinder0 == null) {
            ftqf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.libraries.tapandpay.protoservice.IProtoService");
            ftqf0 = (iInterface0 instanceof ftqf) ? ((ftqf)iInterface0) : new ftqf(iBinder0);
        }
        gftb.check(this.a.i);
        ftqk ftqk0 = new ftqk(this, ftqf0);
        this.a.i.execute(ftqk0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.a.m(Status.d);
    }
}


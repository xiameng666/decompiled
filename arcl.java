import android.content.ComponentName;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;
import j..util.Objects;

public final class arcl extends clil {
    final D2dSourceChimeraActivity a;
    private final IBinder.DeathRecipient b;
    private boolean c;

    public arcl(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        Objects.requireNonNull(d2dSourceChimeraActivity0);
        this.a = d2dSourceChimeraActivity0;
        super("backup");
        this.b = new arcj(this);
        this.c = false;
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        arfs arfs0;
        aqql aqql0 = D2dSourceChimeraActivity.j;
        aqql0.d("#doServiceConnected", new Object[0]);
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.a;
        if(!d2dSourceChimeraActivity0.q) {
            aqql0.m("doServiceConnected called without an active connection, returning.", new Object[0]);
            return;
        }
        if(iBinder0 == null) {
            arfs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
            arfs0 = (iInterface0 instanceof arfs) ? ((arfs)iInterface0) : new arfq(iBinder0);
        }
        d2dSourceChimeraActivity0.n = arfs0;
        synchronized(this) {
            if(this.c) {
                D2dSourceChimeraActivity.j.d("Death recipient already linked", new Object[0]);
            }
            else {
                try {
                    aqql0.d(a.Y(this.a.n, String.valueOf(this.b), "Death recipient: ", " linked to: "), new Object[0]);
                    this.a.n.asBinder().linkToDeath(this.b, 0);
                    this.c = true;
                }
                catch(RemoteException unused_ex) {
                    D2dSourceChimeraActivity.j.f(a.Y(this.a.n, String.valueOf(this.b), "Death recipient: ", " could not be linked to: "), new Object[0]);
                }
            }
        }
        arck arck0 = new arck(this);
        this.a.n(arck0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        D2dSourceChimeraActivity.j.d("#doServiceDisconnected", new Object[0]);
        this.c();
        this.a.n = null;
    }

    public final void c() {
        synchronized(this) {
            if(this.c) {
                D2dSourceChimeraActivity.j.d(a.Y(this.a.n, String.valueOf(this.b), "Death recipient: ", " unlinked from: "), new Object[0]);
                this.a.n.asBinder().unlinkToDeath(this.b, 0);
                this.c = false;
            }
            else {
                D2dSourceChimeraActivity.j.d("Death recipient not linked", new Object[0]);
            }
        }
    }
}


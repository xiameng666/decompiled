import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity;
import j..util.Objects;

public final class ercn extends clil {
    public final SourceQuickStartChimeraActivity a;

    public ercn(SourceQuickStartChimeraActivity sourceQuickStartChimeraActivity0) {
        Objects.requireNonNull(sourceQuickStartChimeraActivity0);
        this.a = sourceQuickStartChimeraActivity0;
        super("SmartDevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        eqwl eqwl0;
        erqc erqc0 = SourceQuickStartChimeraActivity.h;
        erqc0.d("doServiceConnected()", new Object[0]);
        if(iBinder0 == null) {
            eqwl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ISourceQuickStartService");
            eqwl0 = (iInterface0 instanceof eqwl) ? ((eqwl)iInterface0) : new eqwj(iBinder0);
        }
        SourceQuickStartChimeraActivity sourceQuickStartChimeraActivity0 = this.a;
        sourceQuickStartChimeraActivity0.i = eqwl0;
        if(sourceQuickStartChimeraActivity0.i == null) {
            erqc0.f("Failed to start service", new Object[0]);
            return;
        }
        sourceQuickStartChimeraActivity0.j = new eqwh(this);
        erqc0.d("startWithTriggerState() at state: %d", new Object[]{((int)sourceQuickStartChimeraActivity0.t)});
        try {
            sourceQuickStartChimeraActivity0.i.k(sourceQuickStartChimeraActivity0.j);
            int v = sourceQuickStartChimeraActivity0.t;
            switch(v) {
                case 101: {
                    if(sourceQuickStartChimeraActivity0.l.i()) {
                        sourceQuickStartChimeraActivity0.i.b(((ConnectionRequest)sourceQuickStartChimeraActivity0.l.d()), sourceQuickStartChimeraActivity0.j);
                        return;
                    }
                    return;
                }
                case 200: 
                case 201: {
                    String s = bbmu.a(new eqrm(sourceQuickStartChimeraActivity0).d());
                    if(s != null) {
                        ConnectionRequest connectionRequest0 = new ConnectionRequest(null, null, sourceQuickStartChimeraActivity0.n, null, s, 0, true, true, false, 0, sourceQuickStartChimeraActivity0.r);
                        sourceQuickStartChimeraActivity0.i.n((sourceQuickStartChimeraActivity0.k.d ? sourceQuickStartChimeraActivity0.k.c : -1L));
                        sourceQuickStartChimeraActivity0.i.b(connectionRequest0, sourceQuickStartChimeraActivity0.j);
                        return;
                    }
                    erqc0.m("Unable to start from state: %d", new Object[]{((int)sourceQuickStartChimeraActivity0.t)});
                    return;
                }
                case 202: {
                    return;
                }
                case 203: {
                    sourceQuickStartChimeraActivity0.G();
                    return;
                }
                case 301: {
                    byte[] arr_b = sourceQuickStartChimeraActivity0.getIntent().getByteArrayExtra("bootstrap_options");
                    batl.s(arr_b);
                    BootstrapOptions bootstrapOptions0 = (BootstrapOptions)bauc.a(arr_b, BootstrapOptions.CREATOR);
                    if(bootstrapOptions0 != null) {
                        sourceQuickStartChimeraActivity0.H(bootstrapOptions0);
                        return;
                    }
                    return;
                }
                case 302: {
                    int v1 = sourceQuickStartChimeraActivity0.i.a();
                    Integer integer0 = v1;
                    erqc0.d("handleNotificationRelaunch() at connection status: %d", new Object[]{integer0});
                    switch(v1) {
                        case 1000: {
                            erqc0.d("Unexpected connection status %d when notification is clicked", new Object[]{integer0});
                            sourceQuickStartChimeraActivity0.t = 101;
                            return;
                        }
                        case 1001: {
                            erqc0.d("Unexpected connection status %d when notification is clicked", new Object[]{integer0});
                            sourceQuickStartChimeraActivity0.t = 200;
                            return;
                        }
                        case 1002: {
                            sourceQuickStartChimeraActivity0.t = 201;
                            return;
                        }
                        case 1003: {
                            sourceQuickStartChimeraActivity0.t = 202;
                            return;
                        }
                        default: {
                            erqc0.d("Unexpected connection status %d", new Object[]{integer0});
                            return;
                        }
                    }
                }
                default: {
                    erqc0.m("Unexpected state: %d", new Object[]{v});
                }
            }
        }
        catch(RemoteException remoteException0) {
            SourceQuickStartChimeraActivity.h.n("Bind to service failed.", remoteException0, new Object[0]);
            sourceQuickStartChimeraActivity0.F();
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        SourceQuickStartChimeraActivity.h.j("Service disconnected %s", new Object[]{componentName0});
    }
}


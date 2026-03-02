import android.os.Process;
import jeb.synthetic.TWR;

public final class alos implements Runnable {
    public final aloz a;

    public alos(aloz aloz0) {
        this.a = aloz0;
    }

    @Override
    public final void run() {
        alrv alrv0 = alrv.c(this.a.b);
        alnb alnb0 = alrv0.b;
        if(!alnb0.k().d()) {
            try {
                ywg ywg1 = alna.a(alrv0.b);
                try {
                    if(alrv0.b.i() && !alrv0.d.d().k()) {
                        Object[] arr_object = {Process.myUserHandle().getIdentifier()};
                        alrv.a.h("XPF-Calling maybeUnbindListenerService() locally on user=%s", arr_object);
                        alrv0.c.h();
                    }
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(ywg1, throwable1);
                    throw throwable1;
                }
                if(ywg1 != null) {
                    ywg1.close();
                }
            }
            catch(ywm | IllegalStateException exception1) {
                alrv.a.g("Profile unavailable", exception1, new Object[0]);
            }
        }
        else if(alpa.b().d().isEmpty()) {
            try {
                ywg ywg0 = alna.a(alnb0);
                try {
                    alrv.a.h("XPF-Calling maybeUnbindListenerService() on personal profile remotely.", new Object[0]);
                    alrv0.d.b().g();
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(ywg0, throwable0);
                    throw throwable0;
                }
                if(ywg0 != null) {
                    ywg0.close();
                }
            }
            catch(ywm | IllegalStateException exception0) {
                alrv.a.g("Profile unavailable", exception0, new Object[0]);
            }
        }
    }
}


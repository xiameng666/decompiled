import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import java.util.concurrent.ExecutionException;

public final class eqax implements Runnable {
    public final eqay a;

    public eqax(eqay eqay0) {
        this.a = eqay0;
    }

    @Override
    public final void run() {
        Status status0;
        eqbv eqbv0 = this.a.b;
        batl.e(eqbv0.c);
        int v = 2;
        eqbv0.b.t(2);
        eqlz.a(eqbv0.b, 21);
        ConnectParams connectParams0 = this.a.a;
        eqik eqik0 = connectParams0.a;
        if(eqik0 == null) {
            eqbv.a.m("connect2 received null device callbacks", new Object[0]);
            return;
        }
        eqao eqao0 = eqbv0.d;
        ConnectionRequest connectionRequest0 = connectParams0.b;
        eqao0.h = connectParams0.c;
        if(connectionRequest0 != null && eqao0.h != null) {
            D2DDevice d2DDevice0 = connectionRequest0.a;
            if(!hyig.e()) {
                if(d2DDevice0 == null) {
                    d2DDevice0 = null;
                }
                else if(d2DDevice0.b != 2) {
                    eqao.h(eqik0, new Status(13));
                    return;
                }
                eqao0.c.u(4);
            }
            else if(d2DDevice0 != null) {
                eqlx eqlx0 = eqao0.c;
                switch(d2DDevice0.b) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        v = 4;
                        break;
                    }
                    default: {
                        v = 1;
                    }
                }
                eqlx0.u(v);
            }
            else {
                eqao0.c.u(4);
                d2DDevice0 = null;
            }
            if(!eqao0.s()) {
                if(hyim.j()) {
                    eqao0.e.d();
                }
                eqao0.j = d2DDevice0;
                eqmj eqmj0 = eqao0.e(eqao0.h);
                evql evql0 = eqao0.f.a(connectionRequest0, eqmj0);
                try {
                    evrg.n(evql0);
                }
                catch(InterruptedException | ExecutionException exception0) {
                    eqao.a.l(exception0);
                }
                if(evql0.n()) {
                    status0 = Status.b;
                }
                else {
                    Exception exception1 = evql0.i();
                    status0 = (exception1 instanceof aztb) ? new Status(((aztb)exception1).b()) : new Status(13);
                }
                if(!status0.e()) {
                    eqao.a.f("Connection to device failed (%s)", new Object[]{status0});
                    eqao0.c.c(status0.i);
                    eqao0.r();
                }
                eqao.h(eqik0, status0);
                return;
            }
            eqao.a.f("Connection already in progress.", new Object[0]);
            eqao.h(eqik0, new Status(10566));
            return;
        }
        eqao.h(eqik0, new Status(10594));
    }
}


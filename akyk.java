import android.os.ParcelFileDescriptor;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.io.ByteArrayInputStream;
import java.security.SignatureException;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class akyk implements akzu {
    public aliv a;
    private static final baun b;
    private final Set c;
    private final Object d;
    private final String e;
    private final cuvm f;
    private final aliu g;
    private final akyf h;
    private final Queue i;
    private final AtomicInteger j;
    private akty k;
    private akzp l;
    private int m;
    private alit n;

    static {
        akyk.b = new baun("ProximityAuth", new String[]{"NearbySecureChannel"});
    }

    public akyk(String s) {
        cuvm cuvm0 = akxm.a();
        akyf akyf0 = akyf.c(AppContextProvider.a());
        super();
        this.c = new HashSet();
        this.d = new Object();
        this.f = cuvm0;
        this.e = s;
        this.h = akyf0;
        this.g = new aliu();
        this.i = new PriorityBlockingQueue();
        this.j = new AtomicInteger(0);
        if(hpzm.B()) {
            this.a = aliv.a();
        }
    }

    @Override  // akzu
    public final int a() {
        return 5;
    }

    @Override  // akzu
    public final int b() {
        return this.m;
    }

    @Override  // akzu
    public final String c() {
        String s;
        synchronized(this.d) {
            akty akty0 = this.k;
            s = null;
            if(akty0 == null) {
                return null;
            }
            RemoteDevice remoteDevice0 = ((akzp)akty0).a;
            if(remoteDevice0 != null) {
                s = remoteDevice0.b;
            }
        }
        return s;
    }

    public final void d(akzt akzt0) {
        synchronized(this.d) {
            this.c.add(akzt0);
        }
    }

    public final void e(akzp akzp0) {
        this.l = akzp0;
        this.k = akzp0;
        this.n = this.g.a("nearby_listener_connection_time");
    }

    public final void f(int v) {
        synchronized(this.d) {
            int v2 = this.m;
            if(v2 == v) {
                return;
            }
            akyk.b.h("Connection status changed from %s to %s.", new Object[]{ConnectionInfo.a(v2), ConnectionInfo.a(v)});
            this.m = v;
            for(Object object1: this.c) {
                ((akzt)object1).h(this, v2, v);
            }
        }
    }

    @Override  // akzu
    public final void g() {
        synchronized(this.d) {
            this.f.r(this.e);
        }
    }

    public final void h(alaa alaa0) {
        Object object0 = this.d;
        synchronized(object0) {
            int v = this.m;
            if(v != 0) {
                if(v != 1 && v != 2) {
                    if(this.i(alaa0) && hpzm.I() && hpzm.I()) {
                        Queue queue0 = this.i;
                        if(!queue0.isEmpty()) {
                            while(true) {
                                if(queue0.isEmpty() || ((akyj)queue0.peek()).a != this.j.get()) {
                                    break;
                                }
                                akyk.b.h("Retrying buffered message.", new Object[0]);
                                if(!this.i(((akyj)queue0.poll()).b)) {
                                    break;
                                }
                            }
                        }
                    }
                    __monitor_exit(object0);
                    return;
                }
                goto label_13;
            }
            goto label_82;
        }
        __monitor_exit(object0);
        return;
        try {
        label_13:
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        try {
            batl.l(this.l != null);
            if(this.l.e()) {
                __monitor_enter(object0);
                goto label_51;
            }
            else {
                synchronized(this.d) {
                    baun baun0 = akyk.b;
                    String s = this.e;
                    baun0.h("Processing [Initiator Hello] message from %s.", new Object[]{s});
                    if(hpzm.g()) {
                        this.a.c(this.c(), 4, 2);
                    }
                    try {
                        alaa alaa1 = this.l.c(alaa0);
                        if(hpzm.B()) {
                            aliv aliv0 = this.a;
                            if(aliv0 != null) {
                                aliv0.c(this.c(), 2, 2);
                            }
                        }
                        baun0.h("Sending [Responder Auth] to %s.", new Object[]{s});
                        if(hpzm.T()) {
                            gmbu.t(akyf.c(AppContextProvider.a()).d(s, ByteString.copyFrom(alaa1.a())), new akyi(this), gmap.a);
                        }
                        else {
                            cuwu cuwu0 = cuwu.b(alaa1.a());
                            evql evql0 = this.f.k(s, cuwu0);
                            evql0.b(new akyg(this));
                            evql0.A(new akyh(this));
                        }
                    }
                    catch(akyq akyq0) {
                        akyk.b.n("Error handling [Initiator Hello] message from %s.", akyq0, new Object[]{this.e});
                        if(hpzm.B()) {
                            aliv aliv1 = this.a;
                            if(aliv1 != null) {
                                aliv1.c(this.c(), 2, 3);
                            }
                        }
                        this.g.E(1);
                        this.g();
                    }
                }
            }
            goto label_79;
        }
        catch(Throwable throwable1) {
            goto label_76;
        }
        try {
        label_51:
            akyk.b.h("Processing [Initiator Auth] message from %s.", new Object[]{this.e});
            if(hpzm.g()) {
                this.a.c(this.c(), 5, 2);
            }
            try {
                this.l.d(alaa0);
                this.f(3);
                if(hpzm.B()) {
                    aliv aliv2 = this.a;
                    if(aliv2 != null) {
                        aliv2.c(this.c(), 3, 2);
                    }
                }
                this.g.E(0);
                this.g.X(this.n);
            }
            catch(akyq akyq1) {
                akyk.b.n("Error handling [Initiator Auth] message from %s.", akyq1, new Object[]{this.e});
                if(hpzm.B()) {
                    aliv aliv3 = this.a;
                    if(aliv3 != null) {
                        aliv3.c(this.c(), 3, 3);
                    }
                }
                this.g.E(2);
                this.g();
            }
            goto label_78;
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(object0);
                throw throwable2;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_76:
            __monitor_exit(object0);
            throw throwable1;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_78:
        __monitor_exit(object0);
    label_79:
        __monitor_exit(object0);
        __monitor_exit(object0);
        return;
        try {
        label_82:
            Object[] arr_object = {bboy.c(alaa0.a)};
            akyk.b.m("Message was received after channel disconnected; message: 0x%s", arr_object);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    private final boolean i(alaa alaa0) {
        synchronized(this.d) {
            try {
                byte[] arr_b = this.k.b(alaa0);
                for(Object object1: this.c) {
                    ((akzt)object1).i(this, alaa0.b, arr_b);
                }
                this.j.incrementAndGet();
                return true;
            }
            catch(akyq akyq0) {
                baun baun0 = akyk.b;
                baun0.n("Unable to decrypt received message.", akyq0, new Object[0]);
                Throwable throwable0 = akyq0.getCause();
                if(hpzm.I() && (throwable0 != null && throwable0.getClass() == SignatureException.class)) {
                    Throwable throwable1 = throwable0.getCause();
                    if(throwable1 != null && throwable1.getClass() == hhtj.class) {
                        int v1 = ((hhtj)throwable1).b;
                        int v2 = ((hhtj)throwable1).a;
                        int v3 = v1 - v2;
                        this.g.C("message_received_out_of_sequence", v3);
                        if(v1 < v2) {
                            baun0.g("Received message with repeated sequence number.", ((hhtj)throwable1), new Object[0]);
                            this.g();
                        }
                        else if(((long)v3) > hpzm.a.f().f()) {
                            baun0.g("Received message with a sequence number that is much higher than expected.", ((hhtj)throwable1), new Object[0]);
                            this.g();
                        }
                        else {
                            baun0.h("Buffering message that was received out of sequence.", new Object[0]);
                            akyj akyj0 = new akyj(alaa0, v1);
                            this.i.add(akyj0);
                            this.j.set(v2);
                        }
                    }
                }
                return false;
            }
        }
    }

    @Override  // akzu
    public final void l(ParcelFileDescriptor parcelFileDescriptor0, long v) {
        Object object0 = this.d;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        if(this.m == 3) {
            if(hpzm.a.f().Y() && hpzm.T()) {
                try {
                    ((ggtj)akyf.a.h()).B("sendFile to endpoint %s", this.e);
                    this.h.e();
                    this.h.g.a().j(this.e, parcelFileDescriptor0, v);
                }
                catch(ywm ywm0) {
                    a.ae(akyf.a.j(), "sendFile error", ywm0);
                    gmbu.h(ywm0);
                }
            }
            else {
                cuwu cuwu0 = cuwu.d(parcelFileDescriptor0, v);
                this.f.k(this.e, cuwu0);
            }
            FIN.finallyCodeBegin$NT(v1);
            return;
        }
        throw new IllegalStateException("Must be connected and authenticated to send files.");
    }

    @Override  // akzu
    public final void m(byte[] arr_b, String s) {
        Object object0 = this.d;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.m == 3) {
            try {
                alaa alaa0 = this.k.a(arr_b, s);
                if(hpzm.T()) {
                    ByteString hfsf0 = ByteString.copyFrom(alaa0.a());
                    this.h.d(this.e, hfsf0);
                }
                else {
                    cuwu cuwu0 = cuwu.h(new ByteArrayInputStream(alaa0.a()));
                    this.f.k(this.e, cuwu0);
                }
            }
            catch(akyq akyq0) {
                throw new IllegalStateException("Unable to encrypt", akyq0);
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Must be connected and authenticated to send secure message.");
    }

    @Override  // akzu
    public final byte[] o() {
        byte[] arr_b;
        synchronized(this.d) {
            arr_b = this.k == null ? null : ((akzp)this.k).b;
        }
        return arr_b;
    }

    @Override
    public final String toString() {
        return String.format("[endpointId=%s]", this.e);
    }
}


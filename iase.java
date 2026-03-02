import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iase extends Binder {
    public iare a;
    private static final Logger b;

    static {
        iase.b = Logger.getLogger(iase.class.getName());
    }

    public iase(iare iare0) {
        this.a = iare0;
    }

    @Override  // android.os.Binder
    protected final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        iarm iarm0;
        iare iare0 = this.a;
        if(iare0 != null) {
            try {
                if((v1 & 1) == 0) {
                    iase.b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "ignoring non-oneway transaction. flags=" + v1);
                    return false;
                }
                iarm0 = iare0.a;
                if(v < 1001) {
                    goto label_7;
                }
                goto label_65;
            }
            catch(RuntimeException runtimeException0) {
                iase.b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "failure sending transaction " + v, runtimeException0);
                return false;
            }
            try {
            label_7:
                __monitor_enter(iarm0);
            }
            catch(RuntimeException runtimeException1) {
                goto label_95;
            }
            try {
                if(v == 1) {
                    iarm0.i(parcel0);
                }
                else {
                    switch(v) {
                        case 2: {
                            goto label_14;
                        }
                        case 3: {
                            goto label_16;
                        }
                        case 4: {
                            goto label_51;
                        }
                        case 5: {
                            goto label_59;
                        }
                    }
                }
                goto label_60;
            }
            catch(Throwable throwable0) {
                goto label_63;
            }
            try {
                __monitor_exit(iarm0);
                return false;
            }
            catch(RuntimeException runtimeException1) {
                goto label_95;
            }
            try {
            label_14:
                iarm0.u(iapk.q.f("transport shutdown by peer"), true);
                goto label_60;
            label_16:
                long v2 = parcel0.readLong();
                if(iarm0.u.a(v2)) {
                    iarm.j.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: " + iarm0.toString());
                    ConcurrentHashMap concurrentHashMap0 = iarm0.p;
                    Set set0 = concurrentHashMap0.keySet();
                    iarm0.q.addAll(set0);
                    Iterator iterator0 = iarm0.q.iterator();
                    while(iarm0.v() && iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        iart iart0 = (iart)concurrentHashMap0.get(object0);
                        iterator0.remove();
                        if(iart0 != null) {
                            __monitor_enter(iart0);
                            iaso iaso0 = iart0.e;
                            ibfq ibfq0 = iart0.g;
                            __monitor_exit(iart0);
                            if(ibfq0 != null) {
                                ibfq0.e();
                            }
                            if(iaso0 == null) {
                                continue;
                                try {
                                label_35:
                                    synchronized(iaso0) {
                                        iaso0.f();
                                    }
                                }
                                catch(iapl iapl0) {
                                    synchronized(iart0) {
                                        iart0.g(iapl0.a);
                                    }
                                }
                                continue;
                            }
                            else {
                                goto label_35;
                            }
                            break;
                        }
                    }
                    goto label_60;
                label_51:
                    int v5 = parcel0.readInt();
                    if(iarm0.x == 3) {
                        try(iasp iasp0 = iasp.c()) {
                            iasp0.a().writeInt(v5);
                            iarm0.t.a(5, iasp0);
                        }
                        catch(RemoteException unused_ex) {
                        }
                        goto label_60;
                    label_59:
                        iarm0.g(parcel0);
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_63;
            }
            try {
            label_60:
                __monitor_exit(iarm0);
            }
            catch(RuntimeException runtimeException1) {
                goto label_95;
            }
            try {
                return true;
            }
            catch(Throwable throwable0) {
                try {
                label_63:
                    __monitor_exit(iarm0);
                    throw throwable0;
                label_65:
                    int v6 = parcel0.dataSize();
                    iart iart1 = (iart)iarm0.p.get(Integer.valueOf(v));
                    if(iart1 == null) {
                        iart1 = null;
                    }
                    if(iart1 != null) {
                        iart1.j(parcel0);
                    }
                    long v7 = iarm0.v + ((long)v6);
                    iarm0.v = v7;
                    if(v7 - iarm0.w <= 0x4000L) {
                        return true;
                    }
                    __monitor_enter(iarm0);
                }
                catch(RuntimeException runtimeException1) {
                    goto label_95;
                }
            }
            try {
                iasm iasm0 = iarm0.t;
                gftb.check(iasm0);
                long v8 = iarm0.v;
                try(iasp iasp1 = iasp.c()) {
                    iasp1.a().writeLong(v8);
                    iasm0.a(3, iasp1);
                }
                catch(RemoteException remoteException0) {
                    iarm0.u(iarm.s(remoteException0), true);
                }
                goto label_91;
            }
            catch(Throwable throwable1) {
                try {
                    __monitor_exit(iarm0);
                    throw throwable1;
                label_91:
                    __monitor_exit(iarm0);
                    iarm0.w = iarm0.v;
                    return true;
                }
                catch(RuntimeException runtimeException1) {
                }
            }
            try {
            label_95:
                iarm.j.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", "Terminating transport for uncaught Exception in transaction " + v, runtimeException1);
                synchronized(iarm0) {
                    iarm0.u(iapk.p.e(runtimeException1), true);
                }
                return false;
            }
            catch(RuntimeException runtimeException0) {
                iase.b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "failure sending transaction " + v, runtimeException0);
            }
        }
        return false;
    }

    @Override  // android.os.Binder
    public final boolean pingBinder() {
        return this.a != null;
    }
}


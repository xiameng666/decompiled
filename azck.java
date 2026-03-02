import android.content.Context;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;

final class azck extends azvc {
    final azcl a;
    private final aytx d;
    private final ayvl m;

    public azck(azcl azcl0, aytx aytx0, aztw aztw0, ayvl ayvl0) {
        Objects.requireNonNull(azcl0);
        this.a = azcl0;
        super(ayud.c, aztw0);
        this.d = aytx0;
        this.m = ayvl0;
    }

    @Override  // azvc
    public final void b(Object object0) {
        super.n(((azuj)object0));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return status0;
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        LogEventParcelable logEventParcelable0;
        aytx aytx0;
        azcm azcm0 = (azcm)azsr0;
        try {
            aytx0 = this.d.b();
        }
        catch(RuntimeException runtimeException0) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", runtimeException0);
            this.a(new Status(10, "EventModifier"));
            return;
        }
        if(aytx0 == null) {
            this.n(Status.b);
            return;
        }
        if(!aytx0.a.d.a(aytx0.j, -1, ((hlpp)aytx0.n.b_message).g)) {
            this.n(Status.b);
            return;
        }
        ayvl ayvl0 = this.m;
        if(ayvl0.c != 1) {
            if((aytx0 instanceof ayuc)) {
                double f = ayvl0.b;
                if(f != 0.0) {
                    hftr hftr0 = ((ayuc)aytx0).n;
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    hlpp hlpp0 = (hlpp)hftr0.b_message;
                    hlpp0.b |= 0x4000000;
                    hlpp0.u = f;
                }
            }
            try {
                logEventParcelable0 = aytx0.c();
            }
            catch(RuntimeException runtimeException1) {
                Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", runtimeException1);
                logEventParcelable0 = null;
                goto label_35;
            }
            if((aytx0 instanceof ayuc)) {
                ayvm ayvm0 = ((ayuc)aytx0).o;
                if(ayvm0 != null) {
                    gftb.check(logEventParcelable0.l);
                    logEventParcelable0.i = new LogVerifierResultParcelable(ayvm0.a(logEventParcelable0.l.j));
                }
            }
        label_35:
            if(logEventParcelable0 != null) {
                try {
                    azcj azcj0 = new azcj(this);
                    ((azda)azcm0.H()).c(azcj0, logEventParcelable0);
                }
                catch(RemoteException | RuntimeException exception0) {
                    if((exception0 instanceof TransactionTooLargeException)) {
                        Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", exception0);
                        LogErrorParcelable logErrorParcelable0 = new LogErrorParcelable(logEventParcelable0.a.f, 31004, 1);
                        azcl azcl0 = this.a;
                        if(hrbs.c(azcl0.v)) {
                            azdb.b().c(logErrorParcelable0);
                        }
                        else {
                            azcl0.g(new BatchedLogErrorParcelable(Arrays.asList(new LogErrorParcelable[]{logErrorParcelable0})));
                        }
                    }
                    else {
                        Log.w("ClearcutLoggerApiImpl", "logEvent exception", exception0);
                        Context context0 = this.a.v;
                        if(hrbp.a.b().c(context0)) {
                            if(azde.a == null) {
                                Class class0 = azde.class;
                                synchronized(class0) {
                                    if(azde.a == null) {
                                        azde.a = new azde(context0);
                                    }
                                }
                            }
                            if(!azde.a.a(logEventParcelable0)) {
                                goto label_62;
                            }
                        }
                        else {
                        label_62:
                            if(hrbs.c(this.a.v)) {
                                azdb.b().c(new LogErrorParcelable(logEventParcelable0.a.f, 1003, 1));
                            }
                        }
                    }
                    throw exception0;
                }
                azcl azcl1 = this.a;
                if(hrbs.c(azcl1.v)) {
                    azcl1.g(azdb.b().a());
                }
                return;
            }
            this.a(new Status(10, "MessageProducer"));
            return;
        }
        this.n(new Status(0, "The event was not logged due to sampling."));
        LogErrorParcelable logErrorParcelable1 = new LogErrorParcelable(aytx0.j, 1006, 1);
        azcl azcl2 = this.a;
        if(hrbs.c(azcl2.v)) {
            azdb.b().c(logErrorParcelable1);
            return;
        }
        azcl2.g(new BatchedLogErrorParcelable(Arrays.asList(new LogErrorParcelable[]{logErrorParcelable1})));
    }
}


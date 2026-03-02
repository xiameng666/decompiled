import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import com.google.android.gms.clearcut.BatchedLogEventParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.EnumSet;
import java.util.Map;
import jeb.synthetic.TWR;

public final class azcz extends wby implements azda, cjug {
    private final Context a;
    private final cjts b;
    private final azgg c;
    private final cjtn d;
    private final String e;
    private final aywm f;
    private final azem g;

    public azcz() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public azcz(Context context0, cjts cjts0, azgg azgg0, cjtn cjtn0, String s, aywm aywm0) {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        this.a = context0;
        this.b = cjts0;
        this.c = azgg0;
        this.d = cjtn0;
        this.e = s;
        this.f = aywm0;
        this.g = new azem(context0);
    }

    @Override  // azda
    public final void a(azcx azcx0) {
        if(hrat.d()) {
            brze.a(azcx0);
        }
        azen azen0 = new azen(azcx0, this.e, this.d);
        this.b.b(azen0);
    }

    @Override  // azda
    public final void b(azcx azcx0, BatchedLogErrorParcelable batchedLogErrorParcelable0) {
        if(hrat.d()) {
            brze.a(azcx0);
        }
        azep azep0 = new azep(azcx0, batchedLogErrorParcelable0, this.d);
        this.b.b(azep0);
    }

    @Override  // azda
    public final void c(azcx azcx0, LogEventParcelable logEventParcelable0) {
        if(hrat.d()) {
            brze.a(azcx0);
        }
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/service/ClearcutLoggerChimeraService$ClearcutLoggerServiceImpl", "logEvent", 304, "ClearcutLoggerChimeraService.logEvent")) {
            if(!hqzv.c()) {
                this.d(azcx0, logEventParcelable0);
                return;
            }
            try {
                azcx0.d(new Status(31002, "Logging is disabled"));
            }
            catch(RemoteException remoteException0) {
                Log.w("CCTLoggerService", "Failed to send operation result", remoteException0);
            }
        }
    }

    private final void d(azcx azcx0, LogEventParcelable logEventParcelable0) {
        azcx azcx1;
        ayvn ayvn0;
        cjtn cjtn1;
        gdqb gdqb0;
        cjtn cjtn0;
        String s2;
        azbj azbj1;
        String s1;
        aywm aywm0 = this.f;
        if(aywm0 != null) {
            aywm0.b(AppContextProvider.a());
        }
        if(hqzy.f()) {
            String s = azif.a(logEventParcelable0.a);
            azbj azbj0 = azbk.a();
            azbj0.g();
            azbj0.e(s, azbc.q);
            LogVerifierResultParcelable logVerifierResultParcelable0 = logEventParcelable0.i;
            if(logVerifierResultParcelable0 != null) {
                azbj0.e(s, azbc.af);
                if(!logVerifierResultParcelable0.a) {
                    azbj0.e(s, azbc.ag);
                }
            }
            s1 = s;
            azbj1 = azbj0;
        }
        else {
            s1 = null;
            azbj1 = null;
        }
        if(hrll.c()) {
            bain.a.a("Clearcut log " + s1);
        }
        try {
            s2 = this.e;
            cjtn0 = this.d;
            gdqb0 = gdsp.e("com/google/android/gms/clearcut/service/ClearcutLoggerChimeraService", "throwIfCallerIsRestricted", 0x60, "ClearcutLoggerChimeraService.throwIfCallerIsRestricted");
        }
        catch(Throwable throwable0) {
            goto label_78;
        }
        try {
            if(logEventParcelable0.a != null && !cjtn0.g()) {
                if(logEventParcelable0.a.c == 24 || logEventParcelable0.a.c == 493 || logEventParcelable0.a.c == 494 || ClearcutLoggerChimeraService.c.contains(logEventParcelable0.a.f)) {
                    throw new SecurityException("Log source can only be written to from GmsCore: " + logEventParcelable0.a.f + " and " + logEventParcelable0.a.c);
                }
                hlov hlov0 = hrab.a.b().e();
                Map map0 = DesugarCollections.unmodifiableMap(hlov0.d);
                if(!map0.isEmpty()) {
                    hlos hlos0 = (hlos)map0.get(s2);
                    if(hlos0 != null) {
                        int v = logEventParcelable0.a.b;
                        for(Object object0: hlos0.b) {
                            hlor hlor0 = (hlor)object0;
                            if(v <= hlor0.c && v >= hlor0.b) {
                                throw new SecurityException("Log blocked: pkg=" + s2 + " v=" + v);
                            }
                        }
                    }
                }
                boolean z = ClearcutLoggerChimeraService.d(hlov0.e, logEventParcelable0.a);
                if(z) {
                    int v1 = logEventParcelable0.a.k;
                    if(v1 == 0) {
                        ayvn0 = ayvn.a;
                        cjtn1 = cjtn0;
                    }
                    else {
                        EnumSet enumSet0 = EnumSet.noneOf(ayvo.class);
                        ayvo[] arr_ayvo = ayvo.values();
                        int v2 = 0;
                        while(v2 < arr_ayvo.length) {
                            ayvo ayvo0 = arr_ayvo[v2];
                            if((~v1 & ayvo0.e) > 0) {
                                enumSet0.add(ayvo0);
                            }
                            ++v2;
                            cjtn0 = cjtn0;
                        }
                        cjtn1 = cjtn0;
                        ayvn0 = new ayvn(ggog.b(enumSet0));
                    }
                    if(!ayvn0.equals(ayvn.c)) {
                        throw new SecurityException("Log source : " + logEventParcelable0.a.f + " and " + logEventParcelable0.a.c + " must log exclusively with a pseudonymous logger.");
                    }
                }
                else {
                    cjtn1 = cjtn0;
                }
                if(hlov0.b && !cjtn1.e()) {
                    int v3 = logEventParcelable0.a.c;
                    String s3 = logEventParcelable0.a.f;
                    if(!z && !ClearcutLoggerChimeraService.d(hlov0.c, logEventParcelable0.a)) {
                        throw new SecurityException("Log source is restricted: " + s3 + " and " + v3);
                    }
                }
            }
        }
        catch(Throwable throwable1) {
            try {
                azcx1 = azcx0;
                gdqb0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable1.addSuppressed(throwable2);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            goto label_79;
        }
        try {
            gdqb0.close();
            goto label_86;
        }
        catch(Throwable throwable0) {
        label_78:
            azcx1 = azcx0;
        }
    label_79:
        if(azcx1 != null) {
            try {
                azcx1.d(new Status(31002, "Caller is restricted"));
            }
            catch(RemoteException unused_ex) {
                Log.w("CCTLoggerService", "Failed to send operation result", throwable0);
            }
        }
        if(azbj1 != null) {
            azbj1.f(s1, azbc.ab, 1);
            return;
        label_86:
            ModuleManager moduleManager0 = ModuleManager.get(this.a);
            azer azer0 = new azer(azcx0, logEventParcelable0, this.c, moduleManager0, s2, this.g, ClearcutLoggerChimeraService.b);
            this.b.b(azer0);
            if(azbj1 != null) {
                azbj1.f(s1, azbc.ac, 1);
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azcx azcx0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface0 instanceof azcx) ? ((azcx)iInterface0) : new azcv(iBinder0);
                }
                LogEventParcelable logEventParcelable0 = (LogEventParcelable)wbz.a(parcel0, LogEventParcelable.CREATOR);
                azcz.gr(parcel0);
                this.c(azcx0, logEventParcelable0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface1 instanceof azcx) ? ((azcx)iInterface1) : new azcv(iBinder1);
                }
                azcz.gr(parcel0);
                this.a(azcx0);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface2 instanceof azcx) ? ((azcx)iInterface2) : new azcv(iBinder2);
                }
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                azcx0.h(Status.b);
                return true;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface3 instanceof azcx) ? ((azcx)iInterface3) : new azcv(iBinder3);
                }
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                azcx0.f(Status.b);
                return true;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface4 instanceof azcx) ? ((azcx)iInterface4) : new azcv(iBinder4);
                }
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                azcx0.g(Status.b);
                return true;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface5 instanceof azcx) ? ((azcx)iInterface5) : new azcv(iBinder5);
                }
                String s = parcel0.readString();
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                azeo azeo0 = new azeo(azcx0, s, this.c, this.e, false);
                this.b.b(azeo0);
                return true;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface6 instanceof azcx) ? ((azcx)iInterface6) : new azcv(iBinder6);
                }
                String s1 = parcel0.readString();
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                azeo azeo1 = new azeo(azcx0, s1, this.c, this.e, true);
                this.b.b(azeo1);
                return true;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface7 instanceof azcx) ? ((azcx)iInterface7) : new azcv(iBinder7);
                }
                BatchedLogErrorParcelable batchedLogErrorParcelable0 = (BatchedLogErrorParcelable)wbz.a(parcel0, BatchedLogErrorParcelable.CREATOR);
                azcz.gr(parcel0);
                this.b(azcx0, batchedLogErrorParcelable0);
                return true;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    azcx0 = (iInterface8 instanceof azcx) ? ((azcx)iInterface8) : new azcv(iBinder8);
                }
                BatchedLogEventParcelable batchedLogEventParcelable0 = (BatchedLogEventParcelable)wbz.a(parcel0, BatchedLogEventParcelable.CREATOR);
                azcz.gr(parcel0);
                if(hrat.d()) {
                    brze.a(azcx0);
                }
                gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/service/ClearcutLoggerChimeraService$ClearcutLoggerServiceImpl", "logBatchedEvents", 324, "ClearcutLoggerChimeraService.logBatchedEvents");
                try {
                    if(hqzv.c()) {
                        try {
                            azcx0.b(new Status(31002, "Logging is disabled"));
                        }
                        catch(RemoteException remoteException1) {
                            Log.w("CCTLoggerService", "Failed to send operation result", remoteException1);
                        }
                    }
                    else {
                        for(Object object0: batchedLogEventParcelable0.a) {
                            this.d(azcx0, ((LogEventParcelable)object0));
                        }
                        try {
                            azcx0.b(Status.b);
                        }
                        catch(RemoteException remoteException0) {
                            Log.w("CCTLoggerService", "Failed to send operation result", remoteException0);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(gdqb0, throwable0);
                    throw throwable0;
                }
                gdqb0.close();
                return true;
            }
            case 10: {
                BatchedLogEventParcelable batchedLogEventParcelable1 = (BatchedLogEventParcelable)wbz.a(parcel0, BatchedLogEventParcelable.CREATOR);
                azcz.gr(parcel0);
                gdqb gdqb1 = gdsp.e("com/google/android/gms/clearcut/service/ClearcutLoggerChimeraService$ClearcutLoggerServiceImpl", "logBatchedEventsFireAndForget", 0x15F, "ClearcutLoggerChimeraService.logBatchedEvents");
                try {
                    if(!hqzv.c()) {
                        for(Object object1: batchedLogEventParcelable1.a) {
                            this.d(null, ((LogEventParcelable)object1));
                        }
                    }
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(gdqb1, throwable1);
                    throw throwable1;
                }
                gdqb1.close();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}


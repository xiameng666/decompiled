import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

public final class azdj implements azdl {
    private final Context a;
    private final ayvf b;
    private ayvd c;

    public azdj(Context context0, ayvf ayvf0) {
        this.a = context0;
        this.b = ayvf0;
        ayvf0.j();
    }

    final gjbc a(hlsi hlsi0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjbc.a).v_newBuilder();
        azdj.r(hftp0, hlsi0);
        Context context0 = this.a;
        boolean z = azib.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc0 = (gjbc)hftp0.b_message;
        gjbc0.b |= 4;
        gjbc0.e = z;
        boolean z1 = azib.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc1 = (gjbc)hftp0.b_message;
        gjbc1.b |= 8;
        gjbc1.f = z1;
        if((hlsi0.b & 0x400) != 0) {
            hlqe hlqe0 = (hlqe)gfsx.l(hlqe.b(hlsi0.k)).f(hlqe.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjbc)hftp0.b_message).g = hlqe0.f;
            ((gjbc)hftp0.b_message).b |= 16;
        }
        return (gjbc)hftp0.N_build();
    }

    @Override  // azdl
    public final void b(String s) {
        this.b.d(s).a(0L, 1L, ayvf.b);
    }

    @Override  // azdl
    public final void c(azfz azfz0) {
        ayvf ayvf0 = this.b;
        ayvf0.l(null);
        if(azfz0.b != 0L || azfz0.d != 0L || azfz0.f != 0L || azfz0.a != 0L || azfz0.e != 0L || azfz0.g != 0L || azfz0.c != 0L || azfz0.h != 0L) {
            ayux ayux0 = ayvf0.d("CleanupOccurrence");
            ayuy ayuy0 = ayvf.b;
            ayux0.a(0L, 1L, ayuy0);
            if(azfz0.b != 0L) {
                ayvb ayvb0 = ayvf0.f("CleanupNumBytesDeletedOverSize");
                ayvb0.a(ayvb0.g.a(azfz0.b), 1L, ayuy0);
            }
            if(azfz0.d != 0L) {
                ayvb ayvb1 = ayvf0.f("CleanupNumCorruptContextsDeleted");
                ayvb1.a(ayvb1.g.a(azfz0.d), 1L, ayuy0);
            }
            if(azfz0.f != 0L) {
                ayvb ayvb2 = ayvf0.f("CleanupNumEventsDeletedOversize");
                ayvb2.a(ayvb2.g.a(azfz0.f), 1L, ayuy0);
            }
            if(azfz0.a != 0L) {
                ayvb ayvb3 = ayvf0.f("CleanupNumBytesDeletedTooOld");
                ayvb3.a(ayvb3.g.a(azfz0.a), 1L, ayuy0);
            }
            if(azfz0.e != 0L) {
                ayvb ayvb4 = ayvf0.f("CleanupNumEventsDeletedTooOld");
                ayvb4.a(ayvb4.g.a(azfz0.e), 1L, ayuy0);
            }
            if(azfz0.g != 0L) {
                ayvb ayvb5 = ayvf0.f("CleanupNumEventsDeletedCorruptPLC");
                ayvb5.a(ayvb5.g.a(azfz0.g), 1L, ayuy0);
            }
            if(azfz0.c != 0L) {
                ayvb ayvb6 = ayvf0.f("CleanupNumBytesDeletedCorruptPLC");
                ayvb6.a(ayvb6.g.a(azfz0.c), 1L, ayuy0);
            }
        }
    }

    @Override  // azdl
    public final void close() {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/metalogger/CountersMetaLogger", "close", 373, "CountersMetaLogger#close")) {
            this.b.h();
        }
    }

    @Override  // azdl
    public final void d(int v, String s) {
        if(s == null) {
            this.b.l(null);
        }
        else {
            gjbc gjbc0 = azdj.n(s);
            this.b.l(((MessageLite)gjbc0));
        }
        this.b.e("GetAuthToken").a(((long)v), 1L, ayvf.b);
    }

    @Override  // azdl
    public final void e(long v) {
        gjbc gjbc0 = this.q();
        this.b.l(((MessageLite)gjbc0));
        ayvb ayvb0 = this.b.f("LastUploadElapsedDurationSecs");
        ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
    }

    @Override  // azdl
    public final void f(hlsi hlsi0, int v) {
        gjbc gjbc0 = this.a(hlsi0);
        this.b.l(((MessageLite)gjbc0));
        this.b.e("OversizeBatchedLogRequests").a(((long)v), 1L, ayvf.b);
    }

    @Override  // azdl
    public final void g() {
        this.b.l(null);
        this.b.d("PseudonymousIdFailures").a(0L, 1L, ayvf.b);
    }

    @Override  // azdl
    public final void h(hlsi hlsi0, long v) {
        ayvf ayvf0 = this.b;
        ayvf0.l(((MessageLite)this.a(hlsi0)));
        if(v > -1L) {
            ayvb ayvb0 = ayvf0.f("RequestSize");
            ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
        }
    }

    @Override  // azdl
    public final void i(hlsi hlsi0, long v) {
        ayvf ayvf0 = this.b;
        ayvf0.l(((MessageLite)this.a(hlsi0)));
        if(v > -1L) {
            ayvb ayvb0 = ayvf0.f("RequestHeaderSize");
            ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
        }
    }

    @Override  // azdl
    public final void j(hlsi hlsi0, long v) {
        gjbc gjbc0 = this.a(hlsi0);
        this.b.l(((MessageLite)gjbc0));
        ayvb ayvb0 = this.b.f("RequestUploadDelay");
        ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
    }

    @Override  // azdl
    public final void k(int v) {
        ayvf ayvf0 = this.b;
        ayvf0.l(null);
        ayvd ayvd0 = this.c;
        if(ayvd0 != null) {
            long v1 = ayvd0.a();
            long v2 = ayvd0.a.g.a(v1);
            ayvd0.a.a(v2, 1L, ayvf.b);
        }
        ayvf0.l(((MessageLite)this.q()));
        ayvf0.e("ResponseStatus").a(((long)v), 1L, ayvf.b);
    }

    @Override  // azdl
    public final void l(azge azge0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/metalogger/CountersMetaLogger", "logStorageUsage", 130, "CountersMetaLogger#logStorageUsage")) {
            this.b.l(null);
            String s = azge0.i();
            try {
                long v = azge0.d();
                ayvb ayvb0 = this.b.f(s + "TotalStorage");
                ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
            }
            catch(IOException iOException0) {
                Log.e("CCTCountersMetaLogger", "Couldn\'t log total storage size.", iOException0);
            }
            try(gdqb gdqb1 = gdsp.e("com/google/android/gms/clearcut/metalogger/CountersMetaLogger", "logStorageUsageImpl", 0x98, "incrementPlayLoggerContextNum")) {
                long v1 = azge0.c();
                ayvb ayvb1 = this.b.f(s + "PlayLoggerContextNum");
                ayvb1.a(ayvb1.g.a(v1), 1L, ayvf.b);
            }
            catch(IOException iOException1) {
                Log.e("CCTCountersMetaLogger", "Couldn\'t log play logger context num.", iOException1);
            }
            try {
                if(azge0.v()) {
                    Log.i("CCTCountersMetaLogger", "Storage is overflowing - bailing on size by log source");
                    return;
                }
            }
            catch(IOException iOException2) {
                Log.e("CCTCountersMetaLogger", "Couldn\'t read database - bailing on size by log source", iOException2);
                return;
            }
            Iterator iterator0 = azge0.l().entrySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                azfy azfy0 = (azfy)((Map.Entry)object0).getValue();
                ayvf ayvf0 = this.b;
                ayvf0.l(((MessageLite)azdj.n(((String)((Map.Entry)object0).getKey()))));
                if(azfy0.b != 0L) {
                    ayvb ayvb2 = ayvf0.f(s + "PlcNumPerLogSource");
                    ayvb2.a(ayvb2.g.a(azfy0.b), 1L, ayvf.b);
                }
                if(azfy0.a != 0L) {
                    ayvb ayvb3 = ayvf0.f(s + "SizePerLogSource");
                    ayvb3.a(ayvb3.g.a(azfy0.a), 1L, ayvf.b);
                }
                if(azfy0.c != 0L) {
                    ayvb ayvb4 = ayvf0.f(s + "NumFilesPerLogSource");
                    ayvb4.a(ayvb4.g.a(azfy0.c), 1L, ayvf.b);
                }
            }
            try {
                String s1 = azge0.i();
                Iterator iterator1 = azge0.h().v().iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    ayvf ayvf1 = this.b;
                    azgd azgd0 = (azgd)((Map.Entry)object1).getKey();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjbc.a).v_newBuilder();
                    String s2 = azgd0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s2.getClass();
                    ((gjbc)hftv0).b |= 1;
                    ((gjbc)hftv0).c = s2;
                    String s3 = azgd0.b;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjbc gjbc0 = (gjbc)hftp0.b_message;
                    s3.getClass();
                    gjbc0.b |= 0x20;
                    gjbc0.h = s3;
                    ayvf1.l(((MessageLite)(((gjbc)hftp0.N_build()))));
                    long v2 = (long)(((int)(((Integer)((Map.Entry)object1).getValue()))));
                    ayvf1.d(s1 + "LogDropCount").a(0L, v2, ayvf.b);
                }
            }
            catch(IOException iOException3) {
                Log.i("CCTCountersMetaLogger", "Could not retrieve the number of dropped logs.", iOException3);
            }
        }
    }

    @Override  // azdl
    public final void m(hlsi hlsi0) {
        gjbc gjbc0 = this.a(hlsi0);
        this.b.l(((MessageLite)gjbc0));
        ayve ayve0 = this.b.g("RequestLatency");
        this.c = new ayvd(ayve0, ayve0);
    }

    static final gjbc n(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjbc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc0 = (gjbc)hftp0.b_message;
        s.getClass();
        gjbc0.b |= 1;
        gjbc0.c = s;
        return (gjbc)hftp0.N_build();
    }

    @Override  // azdl
    public final void o() {
        this.b.l(null);
        this.b.d("LogResponseParseError").a(0L, 1L, ayvf.b);
    }

    @Override  // azdl
    public final void p(hlsi hlsi0, int v, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjbc.a).v_newBuilder();
        azdj.r(hftp0, hlsi0);
        Context context0 = this.a;
        boolean z1 = azib.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc0 = (gjbc)hftp0.b_message;
        gjbc0.b |= 4;
        gjbc0.e = z1;
        boolean z2 = azib.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc1 = (gjbc)hftp0.b_message;
        gjbc1.b |= 8;
        gjbc1.f = z2;
        if((hlsi0.b & 0x400) != 0) {
            hlqe hlqe0 = (hlqe)gfsx.l(hlqe.b(hlsi0.k)).f(hlqe.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjbc)hftp0.b_message).g = hlqe0.f;
            ((gjbc)hftp0.b_message).b |= 16;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjbc)hftp0.b_message).i = v - 1;
        ((gjbc)hftp0.b_message).b |= 0x40;
        if(hraz.h()) {
            boolean z3 = azib.f(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gjbc)hftv0).b |= 0x200;
            ((gjbc)hftv0).j = z3;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjbc gjbc2 = (gjbc)hftp0.b_message;
            gjbc2.b |= 0x400;
            gjbc2.k = z;
        }
        gjbc gjbc3 = (gjbc)hftp0.N_build();
        this.b.l(((MessageLite)gjbc3));
        this.b.d("HttpRequest").a(0L, 1L, ayvf.b);
    }

    private final gjbc q() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjbc.a).v_newBuilder();
        Context context0 = this.a;
        boolean z = azib.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc0 = (gjbc)hftp0.b_message;
        gjbc0.b |= 4;
        gjbc0.e = z;
        boolean z1 = azib.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc1 = (gjbc)hftp0.b_message;
        gjbc1.b |= 8;
        gjbc1.f = z1;
        return (gjbc)hftp0.N_build();
    }

    private static void r(ProtoLiteBuilder hftp0, hlsi hlsi0) {
        if((hlsi0.b & 0x100) != 0) {
            String s = hlsi0.i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjbc gjbc0 = (gjbc)hftp0.b_message;
            s.getClass();
            gjbc0.b |= 1;
            gjbc0.c = s;
            return;
        }
        int v = hlsi0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjbc gjbc1 = (gjbc)hftp0.b_message;
        gjbc1.b |= 2;
        gjbc1.d = v;
    }
}


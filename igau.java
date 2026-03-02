import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import j..util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

public final class igau extends ifye {
    private final AtomicInteger a;
    private final igay b;

    static {
    }

    public igau() {
        igay igay0 = new igay();
        super();
        this.a = new AtomicInteger();
        this.b = igay0;
    }

    @Override  // ifye
    public final long a() {
        long v = ThreadLocalRandom.current().nextLong(0x8000000000000001L, 0x7FFFFFFFFFFFFFFDL);
        return v < -1L ? v : v + 2L;
    }

    @Override  // ifye
    public final void b(ifya ifya0) {
        int v2;
        new ifvp("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long v = ifya0.a;
            int v1 = ifya0.h - 1;
            if(ifya0.h == 0) {
                throw null;
            }
            switch(v1) {
                case 0: {
                    v2 = 1;
                    break;
                }
                case 1: {
                    v2 = 2;
                    break;
                }
                default: {
                    v2 = 0;
                }
            }
            int v3 = ifya0.b;
            int v4 = igau.e(ifya0.c);
            int v5 = -1;
            int v6 = igax.a(ifya0.d) - 1;
            int v7 = ifya0.e.a;
            int v8 = ifya0.e.b;
            int v9 = ifya0.e.c;
            int v10 = ifya0.e.d;
            ifyd ifyd0 = ifya0.f;
            int v11 = ifyd0 == null ? -1 : ifyd0.a;
            int v12 = ifyd0 == null ? -1 : ifyd0.b;
            if(ifyd0 != null) {
                v5 = ifyd0.c;
            }
            int v13 = ifya0.g;
            StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
            statsEvent$Builder0.setAtomId(0x2FA);
            statsEvent$Builder0.writeLong(v);
            statsEvent$Builder0.writeInt(v2);
            statsEvent$Builder0.writeInt(v3);
            statsEvent$Builder0.writeInt(v4);
            statsEvent$Builder0.writeInt(v6);
            statsEvent$Builder0.writeInt(v7);
            statsEvent$Builder0.writeInt(v8);
            statsEvent$Builder0.writeInt(v9);
            statsEvent$Builder0.writeInt(v10);
            statsEvent$Builder0.writeInt(v11);
            statsEvent$Builder0.writeInt(v12);
            statsEvent$Builder0.writeInt(v5);
            statsEvent$Builder0.writeInt((ifyd0 == null ? -1 : ifyd0.d));
            statsEvent$Builder0.writeInt(v13);
            statsEvent$Builder0.addBooleanAnnotation(1, true);
            statsEvent$Builder0.usePooledBuffer();
            StatsLog.write(statsEvent$Builder0.build());
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    @Override  // ifye
    public final void c(long v, ifxz ifxz0, ifyd ifyd0, ifyb ifyb0) {
        boolean z5;
        int v6;
        int v5;
        if(ifyb0 != null) {
            try {
                new ifvp("CronetLoggerImpl#writeCronetEngineCreation");
            }
            catch(Exception unused_ex) {
                return;
            }
            try {
                igav igav0 = new igav(ifxz0.f);
                int v1 = ifyd0.a;
                int v2 = ifyd0.b;
                int v3 = ifyd0.c;
                int v4 = ifyd0.d;
                switch(ifyb0.ordinal()) {
                    case 1: {
                        v5 = 1;
                        break;
                    }
                    case 2: {
                        v5 = 2;
                        break;
                    }
                    case 3: {
                        v5 = 3;
                        break;
                    }
                    case 4: {
                        v5 = 4;
                        break;
                    }
                    default: {
                        v5 = 0;
                    }
                }
                boolean z = ifxz0.d;
                boolean z1 = ifxz0.c;
                switch(ifxz0.e) {
                    case 0: {
                        v6 = 1;
                        break;
                    }
                    case 1: {
                        v6 = 2;
                        break;
                    }
                    case 2: {
                        v6 = 3;
                        break;
                    }
                    default: {
                        v6 = 4;
                    }
                }
                boolean z2 = ifxz0.a;
                boolean z3 = ifxz0.g;
                boolean z4 = ifxz0.b;
                String s = (String)igav0.f("QUIC", "connection_options", null, String.class);
                if(igav.h(s)) {
                    z5 = z2;
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    String[] arr_s = s.split(",", -1);
                    int v7 = arr_s.length;
                    int v8 = 0;
                    while(v8 < v7) {
                        String s1 = arr_s[v8];
                        if(igav.a.contains(s1.toUpperCase(Locale.ROOT).trim())) {
                            arrayList0.add(s1);
                        }
                        ++v8;
                        v7 = v7;
                        z2 = z2;
                    }
                    z5 = z2;
                    StringBuilder stringBuilder0 = new StringBuilder();
                    Iterator iterator0 = arrayList0.iterator();
                    if(iterator0.hasNext()) {
                        for(Object object0 = iterator0.next(); true; object0 = iterator0.next()) {
                            stringBuilder0.append(((CharSequence)object0));
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            stringBuilder0.append(",");
                        }
                    }
                    s = stringBuilder0.toString();
                }
                Object object1 = null;
                int v9 = igax.a(((Boolean)igav0.f("QUIC", "store_server_configs_in_properties", null, Boolean.class))) - 1;
                int v10 = igav0.b();
                int v11 = igav0.a();
                int v12 = igax.a(((Boolean)igav0.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class))) - 1;
                int v13 = igax.a(((Boolean)igav0.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class))) - 1;
                int v14 = igav0.k() - 1;
                int v15 = igav0.j() - 1;
                Integer integer0 = (int)-1;
                int v16 = igax.a(((Boolean)igav0.f("QUIC", "disable_bidirectional_streams", null, Boolean.class))) - 1;
                int v17 = (int)(((Integer)igav0.f("QUIC", "max_time_before_crypto_handshake_seconds", integer0, Integer.class)));
                int v18 = (int)(((Integer)igav0.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", integer0, Integer.class)));
                int v19 = igax.a(((Boolean)igav0.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class))) - 1;
                int v20 = igav0.i() - 1;
                int v21 = igav0.m() - 1;
                int v22 = igav0.c();
                int v23 = igav0.d();
                int v24 = (int)(((Integer)igav0.f("StaleDNS", "max_stale_uses", integer0, Integer.class)));
                int v25 = igav0.l() - 1;
                int v26 = igav0.n() - 1;
                int v27 = igav0.e();
                int v28 = igav0.o() - 1;
                Class class0 = Boolean.class;
                if(igav0.b.length() != 0) {
                    try {
                        object1 = class0.cast(igav0.b.get("disable_ipv6_on_wifi"));
                    }
                    catch(JSONException | ClassCastException unused_ex) {
                    }
                }
                int v29 = Process.myUid();
                StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
                statsEvent$Builder0.setAtomId(703);
                statsEvent$Builder0.writeLong(v);
                statsEvent$Builder0.writeInt(v1);
                statsEvent$Builder0.writeInt(v2);
                statsEvent$Builder0.writeInt(v3);
                statsEvent$Builder0.writeInt(v4);
                statsEvent$Builder0.writeInt(v5);
                statsEvent$Builder0.writeBoolean(z);
                statsEvent$Builder0.writeBoolean(z1);
                statsEvent$Builder0.writeInt(v6);
                statsEvent$Builder0.writeBoolean(z5);
                statsEvent$Builder0.writeBoolean(z4);
                statsEvent$Builder0.writeBoolean(z3);
                statsEvent$Builder0.writeInt(0);
                statsEvent$Builder0.writeString(s);
                statsEvent$Builder0.writeInt(v9);
                statsEvent$Builder0.writeInt(v10);
                statsEvent$Builder0.writeInt(v11);
                statsEvent$Builder0.writeInt(v12);
                statsEvent$Builder0.writeInt(v13);
                statsEvent$Builder0.writeInt(v14);
                statsEvent$Builder0.writeInt(v15);
                statsEvent$Builder0.writeInt(v16);
                statsEvent$Builder0.writeInt(v17);
                statsEvent$Builder0.writeInt(v18);
                statsEvent$Builder0.writeInt(v19);
                statsEvent$Builder0.writeInt(v20);
                statsEvent$Builder0.writeInt(v21);
                statsEvent$Builder0.writeInt(v22);
                statsEvent$Builder0.writeInt(v23);
                statsEvent$Builder0.writeInt(v24);
                statsEvent$Builder0.writeInt(v25);
                statsEvent$Builder0.writeInt(v26);
                statsEvent$Builder0.writeInt(v27);
                statsEvent$Builder0.writeInt(v28);
                statsEvent$Builder0.writeInt(igax.a(((Boolean)object1)) - 1);
                statsEvent$Builder0.writeLong(ifxz0.h);
                statsEvent$Builder0.writeInt(v29);
                statsEvent$Builder0.addBooleanAnnotation(1, true);
                statsEvent$Builder0.usePooledBuffer();
                StatsLog.write(statsEvent$Builder0.build());
                goto label_134;
            }
            catch(Throwable throwable0) {
                try {
                    Trace.endSection();
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    try {
                        throwable0.addSuppressed(throwable1);
                        throw throwable0;
                    label_134:
                        Trace.endSection();
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }
    }

    @Override  // ifye
    public final void d(long v, ifyc ifyc0) {
        StatsEvent.Builder statsEvent$Builder0;
        Boolean boolean0;
        int v13;
        int v12;
        int v11;
        long v10;
        int v9;
        int v8;
        int v6;
        int v5;
        int v4;
        igay igay0 = this.b;
        synchronized(igay0.a) {
            long v2 = SystemClock.elapsedRealtime();
            if(Long.compare(igay0.c + 1000L, v2) <= 0) {
                igay0.b = 1;
                igay0.c = v2;
                goto label_11;
            }
            if(igay0.b <= 0) {
                igay0.b = 1;
            label_11:
                int v3 = this.a.getAndSet(0);
                try {
                    new ifvp("CronetLoggerImpl#writeCronetTrafficReported");
                }
                catch(Exception unused_ex) {
                    v4 = v3;
                    this.a.addAndGet(v4);
                    return;
                }
                try {
                    igaz.a(ifyc0.a, "Request header size is negative");
                    double f = ((double)ifyc0.a) / 1024.0;
                    if(igaz.b(f, 0, 1)) {
                        v5 = 1;
                    }
                    else if(igaz.b(f, 1, 10)) {
                        v5 = 2;
                    }
                    else if(igaz.b(f, 10, 25)) {
                        v5 = 3;
                    }
                    else if(igaz.b(f, 25, 50)) {
                        v5 = 4;
                    }
                    else {
                        v5 = igaz.b(f, 50, 100) ? 5 : 6;
                    }
                    igaz.a(-1L, "Request body size is negative");
                    igaz.a(ifyc0.b, "Response header size is negative");
                    double f1 = ((double)ifyc0.b) / 1024.0;
                    if(igaz.b(f1, 0, 1)) {
                        v6 = 1;
                    }
                    else if(igaz.b(f1, 1, 10)) {
                        v6 = 2;
                    }
                    else if(igaz.b(f1, 10, 25)) {
                        v6 = 3;
                    }
                    else if(igaz.b(f1, 25, 50)) {
                        v6 = 4;
                    }
                    else {
                        v6 = igaz.b(f1, 50, 100) ? 5 : 6;
                    }
                    igaz.a(ifyc0.c, "Response body size is negative");
                    double f2 = ((double)ifyc0.c) / 1024.0;
                    int v7 = Double.compare(f2, 0.0);
                    if(v7 == 0) {
                        v8 = 1;
                    }
                    else if(v7 > 0 && f2 < 10.0) {
                        v8 = 2;
                    }
                    else if(igaz.b(f2, 10, 50)) {
                        v8 = 3;
                    }
                    else if(igaz.b(f2, 50, 200)) {
                        v8 = 4;
                    }
                    else if(igaz.b(f2, 200, 500)) {
                        v8 = 5;
                    }
                    else if(igaz.b(f2, 500, 1000)) {
                        v8 = 6;
                    }
                    else {
                        v8 = igaz.b(f2, 1000, 5000) ? 7 : 8;
                    }
                    v9 = ifyc0.d;
                    String s = ifyc0.g;
                    MessageDigest messageDigest0 = igaw.a;
                    v10 = 0L;
                    if(messageDigest0 != null && s != null && !s.isEmpty()) {
                        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
                        if(arr_b != null && arr_b.length != 0) {
                            v10 = ByteBuffer.wrap(messageDigest0.digest(arr_b)).getLong();
                        }
                    }
                    v11 = (int)ifyc0.e.toMillis();
                    v12 = (int)ifyc0.f.toMillis();
                    switch(ifyc0.n - 1) {
                        case 0: {
                            v13 = 1;
                            break;
                        }
                        case 1: {
                            v13 = 2;
                            break;
                        }
                        default: {
                            v13 = 3;
                        }
                    }
                    boolean0 = Boolean.valueOf(false);
                    statsEvent$Builder0 = StatsEvent.newBuilder();
                    statsEvent$Builder0.setAtomId(704);
                }
                catch(Throwable throwable0) {
                    v4 = v3;
                    goto label_128;
                }
                try {
                    statsEvent$Builder0.writeLong(v);
                    statsEvent$Builder0.writeInt(v5);
                    statsEvent$Builder0.writeInt(8);
                    statsEvent$Builder0.writeInt(v6);
                    statsEvent$Builder0.writeInt(v8);
                    statsEvent$Builder0.writeInt(v9);
                    statsEvent$Builder0.writeLong(v10);
                    statsEvent$Builder0.writeInt(v11);
                    statsEvent$Builder0.writeInt(v12);
                    statsEvent$Builder0.writeBoolean(false);
                    v4 = v3;
                    statsEvent$Builder0.writeBoolean(false);
                    v4 = v3;
                    statsEvent$Builder0.writeInt(v4);
                    statsEvent$Builder0.writeInt(v13);
                    statsEvent$Builder0.writeInt(ifyc0.h);
                    statsEvent$Builder0.writeLong(-1L);
                    statsEvent$Builder0.writeLong(-1L);
                    statsEvent$Builder0.writeInt(ifyc0.i);
                    statsEvent$Builder0.writeInt(ifyc0.j);
                    statsEvent$Builder0.writeInt(igax.a(boolean0) - 1);
                    statsEvent$Builder0.writeInt(igax.a(Boolean.valueOf(ifyc0.k)) - 1);
                    statsEvent$Builder0.writeInt(ifyc0.l);
                    statsEvent$Builder0.addBooleanAnnotation(1, true);
                    statsEvent$Builder0.writeInt(0);
                    statsEvent$Builder0.writeInt(0);
                    statsEvent$Builder0.writeInt(0);
                    statsEvent$Builder0.writeInt(0);
                    statsEvent$Builder0.writeInt(igax.a(boolean0) - 1);
                    statsEvent$Builder0.writeString("140.0.7289.0");
                    statsEvent$Builder0.writeInt(igau.e(ifyc0.m));
                    statsEvent$Builder0.usePooledBuffer();
                    StatsLog.write(statsEvent$Builder0.build());
                    goto label_133;
                }
                catch(Throwable throwable0) {
                }
                try {
                label_128:
                    Trace.endSection();
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    try {
                        throwable0.addSuppressed(throwable1);
                        throw throwable0;
                    label_133:
                        Trace.endSection();
                        return;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                this.a.addAndGet(v4);
                return;
            }
        }
        this.a.incrementAndGet();
    }

    private static int e(ifyb ifyb0) {
        int v = ifyb0.ordinal();
        return v == 1 || v == 2 || (v == 3 || v == 4) ? 1 : 0;
    }
}


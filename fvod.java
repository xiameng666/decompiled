import android.content.Context;
import android.os.Looper;
import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

final class fvod extends Thread {
    public final Object a;
    public fvnk b;
    private final String c;
    private final fwzp d;
    private final fvwz e;
    private final fvsd f;
    private final fwzx g;
    private final CountDownLatch h;
    private final clhy i;
    private final fybc j;
    private volatile fvlt k;
    private volatile Context l;
    private volatile fvlh m;
    private final int n;

    public fvod(fwzp fwzp0, Context context0, fvlh fvlh0, CountDownLatch countDownLatch0, fvsd fvsd0, fwzx fwzx0, int v, fvlt fvlt0, fybc fybc0, fvwz fvwz0, String s) {
        this.a = new Object();
        this.setName("SignalCollector.ScannerThread");
        this.setPriority(4);
        this.m = fvlh0;
        this.l = context0;
        this.k = fvlt0;
        this.n = v;
        this.j = fybc0;
        this.h = countDownLatch0;
        this.f = fvsd0;
        this.g = fwzx0;
        this.d = fwzp0;
        this.i = clib.c.d(fvoe.class, 16, "location", "SignalCollector");
        this.e = fvwz0;
        this.c = s;
    }

    public final void a() {
        String s3;
        fvok fvok1;
        fvls fvls1;
        boolean z7;
        RealCollectorConfig realCollectorConfig1;
        long v10;
        fvok fvok0;
        Map map0;
        boolean z3;
        Set set1;
        fybc fybc0;
        fxbi fxbi0;
        String s2;
        Object object1;
        fvlu fvlu0;
        fvne fvne0;
        ArrayList arrayList0;
        fvlh fvlh2;
        fwyc fwyc1;
        fvlt fvlt1;
        fvsd fvsd1;
        int v9;
        fwyc fwyc0;
        fvwz fvwz0;
        fvlt fvlt0;
        int v8;
        fwzx fwzx0;
        fvsd fvsd0;
        fvlh fvlh1;
        Context context0;
        fvnk fvnk0;
        Object object0;
        File file0;
        int v6;
        fvoc fvoc0;
        fwzp fwzp0 = this.d;
        fwzp0.i(fwzf.u, 600000L, ((RealCollectorConfig)this.m).w);
        try {
            Looper.prepare();
            fvoc0 = new fvoc();
            try {
                fvlh fvlh0 = this.m;
                String s = ((RealCollectorConfig)fvlh0).f;
                if(s != null) {
                    Set set0 = ((RealCollectorConfig)fvlh0).c;
                    boolean z = ((RealCollectorConfig)fvlh0).d;
                    boolean z1 = ((RealCollectorConfig)fvlh0).m;
                    long v = ((RealCollectorConfig)fvlh0).h;
                    long v1 = ((RealCollectorConfig)fvlh0).i;
                    long v2 = ((RealCollectorConfig)fvlh0).k;
                    ParcelableSensorScannerConfig parcelableSensorScannerConfig0 = ((RealCollectorConfig)fvlh0).o;
                    long v3 = ((RealCollectorConfig)fvlh0).l;
                    int v4 = ((RealCollectorConfig)fvlh0).B;
                    String s1 = ((RealCollectorConfig)fvlh0).e;
                    long v5 = ((RealCollectorConfig)fvlh0).j;
                    if(huqs.c()) {
                        v6 = v4;
                        file0 = new File(ccsb.a.a(s));
                    }
                    else {
                        v6 = v4;
                        file0 = new File(s);
                    }
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    FileInputStream fileInputStream0 = new FileInputStream(file0);
                    byte[] arr_b = new byte[0x80];
                    int v7;
                    while((v7 = fileInputStream0.read(arr_b)) != -1) {
                        byteArrayOutputStream0.write(arr_b, 0, v7);
                        parcelableSensorScannerConfig0 = parcelableSensorScannerConfig0;
                    }
                    RealCollectorConfig realCollectorConfig0 = new RealCollectorConfig(set0, z, z1, v, v1, v5, v2, v3, parcelableSensorScannerConfig0, v6, s1, byteArrayOutputStream0.toByteArray(), ((RealCollectorConfig)fvlh0).u, ((RealCollectorConfig)fvlh0).w, ((RealCollectorConfig)fvlh0).n, ((RealCollectorConfig)fvlh0).q, ((RealCollectorConfig)fvlh0).p, null, ((RealCollectorConfig)fvlh0).y, ((RealCollectorConfig)fvlh0).z, ((RealCollectorConfig)fvlh0).A);
                    realCollectorConfig0.r = ((RealCollectorConfig)fvlh0).r;
                    realCollectorConfig0.s.putAll(((RealCollectorConfig)fvlh0).s);
                    realCollectorConfig0.t = ((RealCollectorConfig)fvlh0).t;
                    realCollectorConfig0.v = ((RealCollectorConfig)fvlh0).v;
                    fvlh0 = realCollectorConfig0;
                }
                this.m = fvlh0;
                object0 = this.a;
                __monitor_enter(object0);
                goto label_45;
            }
            catch(IOException iOException0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_214;
        }
        boolean z2 = false;
        goto label_196;
        try {
        label_45:
            fvnk0 = new fvnk(fwzp0, fvoc0, this.j);
            this.b = fvnk0;
            context0 = this.l;
            fvlh1 = this.m;
            fvsd0 = this.f;
            fwzx0 = this.g;
            v8 = this.n;
            fvlt0 = this.k;
            fvwz0 = this.e;
            fvnk0.i = fvlh1;
            fwyc0 = ((RealCollectorConfig)fvlh1).w;
            v9 = ((RealCollectorConfig)fvlh1).B;
            if(v9 == 3) {
                fvnk0.d = new fvnu(fvlt0, fvlh1);
                fvsd1 = fvsd0;
                fvlt1 = fvlt0;
                fwyc1 = fwyc0;
                fvlh2 = fvlh1;
            }
            else {
                arrayList0 = new ArrayList();
                if(v9 == 0) {
                    object1 = object0;
                    throw null;
                }
                switch(v9 - 1) {
                    case 1: {
                        fvsd1 = fvsd0;
                        fwyc1 = fwyc0;
                        fvob fvob0 = new fvob(((RealCollectorConfig)fvlh1).v);
                        fvlt1 = fvlt0;
                        fvne0 = new fvne(fvnk0.b, ((RealCollectorConfig)fvlh1).e, ((RealCollectorConfig)fvlh1).g, fvlt0, fvnk0.f, fvob0, fwyc1);
                        goto label_98;
                    }
                    case 3: {
                        fvsd1 = fvsd0;
                        fwyc1 = fwyc0;
                        fvob fvob1 = new fvob(((RealCollectorConfig)fvlh1).v);
                        fvlt1 = fvlt0;
                        arrayList0.add(new fvne(fvnk0.b, ((RealCollectorConfig)fvlh1).e, ((RealCollectorConfig)fvlh1).g, fvlt0, fvnk0.f, fvob1, fwyc1));
                        arrayList0.add(new fvng(fvlt1, fvnk0.f, true));
                        fvne0 = new fvlu(fvlt1, fvnk0.f, arrayList0);
                        goto label_98;
                    }
                    case 4: {
                        goto label_86;
                    }
                    default: {
                        fvne0 = new fvng(fvlt0, fvnk0.f, true);
                        fvsd1 = fvsd0;
                        fvlt1 = fvlt0;
                        fwyc1 = fwyc0;
                        goto label_98;
                    }
                }
            }
            goto label_108;
        }
        catch(Throwable throwable1) {
            object1 = object0;
            goto label_189;
        }
        try {
        label_86:
            fvsd1 = fvsd0;
            fvob fvob2 = new fvob(((RealCollectorConfig)fvlh1).v);
            fwyc1 = fwyc0;
            fvlt1 = fvlt0;
            arrayList0.add(new fvne(fvnk0.b, ((RealCollectorConfig)fvlh1).e, ((RealCollectorConfig)fvlh1).g, fvlt0, fvnk0.f, fvob2, fwyc1));
            arrayList0.add(new fvng(fvlt1, fvnk0.f, false));
            fvlu0 = new fvlu(fvlt1, fvnk0.f, arrayList0);
        }
        catch(Throwable throwable1) {
            object1 = object0;
            goto label_189;
        }
        try {
            fvne0 = fvlu0;
        label_98:
            s2 = ((RealCollectorConfig)fvlh1).t;
            fxbi0 = new fxbi(context0);
        }
        catch(Throwable throwable1) {
            object1 = object0;
            goto label_189;
        }
        try {
            fvmp fvmp0 = new fvmp(fvne0, context0, s2, fvlh1, v8, fxbi0, fvwz0);
            context0 = context0;
            fvlh2 = fvlh1;
            fvnk0.d = fvmp0;
        label_108:
            fybc0 = fvnk0.f;
            fvnk0.e = new fvls(fvnk0.d, fvnk0.a);
            if(((RealCollectorConfig)fvlh2).n) {
                fwzp fwzp1 = fvnk0.b;
                fvnk0.h = fvkx.a(context0, fwzp1, fybc0);
                fvnk0.g = "RealCollector" + UUID.randomUUID();
                set1 = ((RealCollectorConfig)fvlh2).c;
                if(set1.size() == 1 && set1.contains(fvns.d) || set1.size() == 2 && set1.contains(fvns.d) && set1.contains(fvns.n)) {
                    z3 = ((RealCollectorConfig)fvlh2).d;
                    map0 = fvlh2.c();
                    fvok0 = new fvok(fwzp1, fvnk0.h, 60000L, false, fwyc1, true);
                    v10 = ((RealCollectorConfig)fvlh2).h;
                    realCollectorConfig1 = (RealCollectorConfig)fvlh2;
                    object1 = object0;
                    goto label_126;
                }
                else {
                    object1 = object0;
                    goto label_179;
                }
            }
            else {
                goto label_136;
            }
            goto label_180;
        }
        catch(Throwable throwable1) {
            object1 = object0;
            goto label_189;
        }
        try {
        label_126:
            fvnk0.c = new fvlv(context0, set1, z3, map0, fvok0, null, fvsd1, fwzx0, v10, realCollectorConfig1.i, ((RealCollectorConfig)fvlh2).j, ((RealCollectorConfig)fvlh2).k, fvnk0.e, ((RealCollectorConfig)fvlh2).u, fvlt1, fybc0, fwyc1, ((RealCollectorConfig)fvlh2).q, ((RealCollectorConfig)fvlh2).p, ((RealCollectorConfig)fvlh2).A);
            for(Object object2: set1) {
                fvnk0.h.e(fvnk0.g, ((fvns)object2), fvlh2.a(((fvns)object2)), 60000);
            }
            fvlh fvlh3 = fvlh2;
            goto label_162;
        label_136:
            object1 = object0;
            fwzp fwzp2 = fvnk0.b;
            Set set2 = ((RealCollectorConfig)fvlh2).c;
            boolean z4 = ((RealCollectorConfig)fvlh2).d;
            Map map1 = fvlh2.c();
            long v11 = ((RealCollectorConfig)fvlh2).l;
            fvnx fvnx0 = fvlh2.b();
            fvlh3 = fvlh2;
            long v12 = ((RealCollectorConfig)fvlh2).h;
            long v13 = ((RealCollectorConfig)fvlh3).i;
            long v14 = ((RealCollectorConfig)fvlh3).j;
            long v15 = ((RealCollectorConfig)fvlh3).k;
            fvls fvls0 = fvnk0.e;
            boolean z5 = ((RealCollectorConfig)fvlh3).u;
            int v16 = ((RealCollectorConfig)fvlh3).q;
            int v17 = ((RealCollectorConfig)fvlh3).p;
            boolean z6 = ((RealCollectorConfig)fvlh3).A;
            if(((RealCollectorConfig)fvlh2).m) {
                z7 = z5;
                fvls1 = fvls0;
                fvok1 = new fvok(fwzp2, fvkx.a(context0, fwzp2, fybc0), v11, ((boolean)((v9 == 3 ? 0 : 1) ^ 1)), null, false);
            }
            else {
                z7 = z5;
                fvls1 = fvls0;
                fvok1 = null;
            }
            fvnk0.c = new fvlv(context0, set2, z4, map1, fvok1, fvnx0, fvsd1, fwzx0, v12, v13, v14, v15, fvls1, z7, fvlt1, fybc0, fwyc1, v16, v17, z6);
        label_162:
            if(fvnk0.c.a.size() > 0) {
                if(((RealCollectorConfig)fvlh3).m) {
                    fvnk0.c.m(new fvnf(fvnk0.c, fvnk0.e), null);
                }
                else if(fvlh3.b() == null) {
                    long v18 = ((RealCollectorConfig)fvlh3).l;
                    if(v18 == 0L) {
                        fvnk0.c.l(null);
                    }
                    else {
                        fvnk0.c.m(new fvos(fvnk0.c, fvnk0.e, v18), null);
                    }
                }
                else if(fvlh3.b().e != 0L) {
                    fvnk0.c.m(new fvoa(fvnk0.c, fvnk0.e, fvlh3.b()), null);
                }
                else {
                    fvnk0.c.m(new fvlz(fvnk0.c, fvnk0.e, fvlh3.b()), null);
                }
                z2 = true;
            }
            else {
            label_179:
                z2 = false;
            }
        }
        catch(Throwable throwable1) {
            goto label_189;
        }
        try {
        label_180:
            __monitor_exit(object1);
            s3 = z2 ? null : "RealCollector: Nothing to scan.";
            goto label_197;
        }
        catch(Throwable throwable1) {
            __monitor_exit(object1);
            break;
        }
        s3 = null;
        goto label_197;
        try {
            s3 = "RealCollector: Nothing to scan.";
            goto label_197;
        }
        catch(IOException iOException0) {
            goto label_196;
        }
        catch(Throwable throwable0) {
            goto label_214;
        }
        try {
            object1 = object0;
            throw null;
        }
        catch(Throwable throwable1) {
        }
    label_189:
        z2 = false;
        while(true) {
            __monitor_exit(object1);
            break;
        }
        try {
            throw throwable1;
        }
        catch(IOException iOException0) {
            try {
            label_196:
                s3 = String.format("Failed normalize configuration: %s", iOException0.getMessage());
            label_197:
                if(!z2 && this.k != null) {
                    this.k.d(s3);
                }
                this.h.countDown();
                if(z2) {
                    Looper.loop();
                }
                this.getName();
            }
            catch(Throwable throwable0) {
                goto label_214;
            }
            fwzp fwzp3 = this.d;
            fwzf fwzf0 = fwzf.u;
            if(fwzp3.k(fwzf0)) {
                fwzp3.j(fwzf0);
            }
            synchronized(this.a) {
                this.l = null;
                this.m = null;
                this.b = null;
            }
        }
        catch(Throwable throwable0) {
        label_214:
            fwzp fwzp4 = this.d;
            fwzf fwzf1 = fwzf.u;
            if(fwzp4.k(fwzf1)) {
                fwzp4.j(fwzf1);
            }
            synchronized(this.a) {
                this.l = null;
                this.m = null;
                this.b = null;
            }
            throw throwable0;
        }
    }

    @Override
    public final void run() {
        clhy clhy0 = this.i;
        if(clhy0 != null) {
            try(gdqs gdqs0 = clhy0.k(this.c)) {
                this.a();
            }
            return;
        }
        this.a();
    }
}


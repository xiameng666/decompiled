import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.google.android.location.quake.SeismicMonitor;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

final class fxek extends fxpd implements fxgm {
    public SeismicMonitor a;
    private final fxot b;
    private final int c;
    private boolean d;
    private boolean i;
    private int j;
    private List k;
    private final fxga l;

    static {
        bboh.c("EQMon", bbcu.g, "MonSt");
    }

    public fxek(fxga fxga0, fxot fxot0, int v) {
        super("MonSt");
        this.l = fxga0;
        this.c = v;
        this.b = fxot0;
    }

    @Override  // fxpd
    public final void a() {
        this.d = false;
        this.i = false;
        this.j = 0;
        this.k = new ArrayList();
        fxga fxga0 = this.l;
        fxgr fxgr0 = fxga0.a;
        Context context0 = fxgr0.e;
        Optional optional0 = fxga0.c;
        Object object0 = optional0.isPresent() ? optional0.get() : new fxdd(context0);
        fxgw fxgw0 = new fxgw(fxga0.b, ((Supplier)object0), fxga0.d);
        fxnw fxnw0 = new fxnw(7, fxgr0.h);
        gxnz gxnz0 = new gxnz(TimeUnit.MILLISECONDS.toNanos(huwd.d()), TimeUnit.MILLISECONDS.toNanos(huwd.a.n().B()), TimeUnit.MILLISECONDS.toNanos(huwd.e()), TimeUnit.MILLISECONDS.toNanos(huwd.a.n().T()), TimeUnit.MILLISECONDS.toNanos(huwd.a.n().v()), ((int)huwd.b()), ((int)huwd.a.n().r()), ((int)huwd.a.n().s()), huwe.a.e().a());
        long v = huwd.d() + huwd.a.n().y();
        long v1 = TimeUnit.MILLISECONDS.toNanos(v);
        double f = huwd.a.n().j();
        double f1 = huwd.a.n().d();
        int v2 = (int)huwd.a.n().t();
        double f2 = huwd.a.n().m();
        double f3 = huwd.a.n().n();
        int v3 = (int)huwd.a.n().Z();
        boolean z = huwd.a.n().as();
        double f4 = huwd.a.n().a();
        boolean z1 = huwd.p();
        double f5 = huwd.a.n().f();
        boolean z2 = huwd.q();
        double f6 = huwd.a.n().h();
        double f7 = huwd.a.n().g();
        boolean z3 = huwd.o();
        boolean z4 = huwd.r();
        double f8 = huwd.a.n().e();
        double f9 = huwd.a.n().c();
        double f10 = huwd.a.n().k();
        double f11 = huwd.a.n().l();
        double f12 = huwd.a.n().b();
        SeismicMonitor seismicMonitor0 = new SeismicMonitor(context0, fxgw0, fxnw0, gxnz0, new gxnw(new gxnt(v1, f, f1, v2, true, f2, f3, v3, z, f4, z1, f5, z2, f6, f7, z3, z4, true, f8, f9, f10, f11, huwd.a.n().i(), f12, huwd.s()), ((gxnx)fxga0.e.get())));
        this.a = seismicMonitor0;
        seismicMonitor0.d = (SensorManager)seismicMonitor0.a.getSystemService("sensor");
        SensorManager sensorManager0 = seismicMonitor0.d;
        if(sensorManager0 != null) {
            Sensor sensor0 = sensorManager0.getDefaultSensor(1);
            if(sensor0 != null) {
                seismicMonitor0.e = new HandlerThread("QMon", 9);
                seismicMonitor0.e.start();
                clht clht0 = new clht(seismicMonitor0.e.getLooper());
                int v4 = (int)(TimeUnit.SECONDS.toMicros(1L) / huwd.b());
                try {
                    seismicMonitor0.d.registerListener(seismicMonitor0, sensor0, v4, clht0);
                }
                catch(IllegalStateException unused_ex) {
                }
            }
        }
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        SeismicMonitor seismicMonitor0 = this.a;
        if(seismicMonitor0 != null) {
            SensorManager sensorManager0 = seismicMonitor0.d;
            if(sensorManager0 != null) {
                sensorManager0.unregisterListener(seismicMonitor0);
            }
            HandlerThread handlerThread0 = seismicMonitor0.e;
            if(handlerThread0 != null) {
                seismicMonitor0.d = null;
                handlerThread0.quit();
                seismicMonitor0.e = null;
            }
            this.a = null;
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        long v3;
        int v = fxpj0.a;
        switch(v) {
            case 7: {
                fxnv fxnv0 = fxpj0.b;
                int v2 = ((fxgu)fxnv0).c;
                if(this.d) {
                    return true;
                }
                if(!this.i) {
                    if(v2 != 1) {
                        switch(v2) {
                            case 2: {
                                v3 = huwd.m();
                                break;
                            }
                            case 3: {
                                v3 = huwd.a.n().ad();
                                break;
                            }
                            case 4: {
                                v3 = huwd.a.n().U();
                                break;
                            }
                            case 5: {
                                v3 = huwd.a.n().R();
                                break;
                            }
                            case 6: {
                                v3 = huwd.a.n().aa();
                                break;
                            }
                            case 7: {
                                v3 = huwd.a.n().W();
                                break;
                            }
                            default: {
                                v3 = huwd.c();
                            }
                        }
                        if(v3 > 0L) {
                            this.d = true;
                            this.h.e(20, new fxgx(v2, v3));
                        }
                        return true;
                    }
                    this.h.e(8, fxnv0);
                    this.i = true;
                    return true;
                }
                return false;
            }
            case 18: 
            case 19: {
                if(this.d) {
                    return true;
                }
                int v4 = this.j + 1;
                this.j = v4;
                if(v4 == this.c) {
                    this.i = false;
                    this.j = 0;
                    fxot fxot0 = this.b;
                    fxol fxol0 = new fxol(fxot0);
                    long v5 = System.currentTimeMillis() / 1000L;
                    List list0 = fxot0.c;
                    for(Object object0: list0) {
                        if(v5 - ((fxos)object0).b[((fxos)object0).c] >= ((fxos)object0).a.a) {
                            continue;
                        }
                        ++fxot0.d;
                        fxot0.a();
                        goto label_82;
                    }
                    for(Object object1: list0) {
                        ((fxos)object1).a(v5);
                    }
                    fxol0.run();
                    ++fxot0.e;
                    if(!list0.isEmpty()) {
                        fxor fxor0 = fxot0.b;
                        long[] arr_v = ((fxos)list0.get(0)).b;
                        Arrays.toString(arr_v);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fwqx.a).v_newBuilder();
                        for(int v1 = 0; v1 < arr_v.length; ++v1) {
                            long v6 = arr_v[v1];
                            if(v6 > 0L) {
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                fwqx fwqx0 = (fwqx)hftp0.b_message;
                                hfui hfui0 = fwqx0.b;
                                if(!hfui0.c()) {
                                    fwqx0.b = ProtoLiteMessage.D(hfui0);
                                }
                                fwqx0.b.g(v6);
                            }
                        }
                        fxop fxop0 = new fxop(((fwqx)hftp0.N_build()));
                        gmcd gmcd0 = fxor0.b.c(fxop0, fxor0.a);
                        gmcd0.hB(gdrx.g(new fxoq(gmcd0)), gmap.a);
                    }
                label_82:
                    fxon fxon0 = fxot0.a();
                    if(fxon0.a > 0L) {
                        this.d = true;
                        this.h.e(20, new fxha(fxon0));
                    }
                    for(Object object2: this.k) {
                        this.h.e(((fxpj)object2).a, ((fxpj)object2).b);
                    }
                    this.k = new ArrayList();
                }
                return true;
            }
            case 24: {
                this.d = true;
                return false;
            }
            default: {
                if(this.i) {
                    switch(v) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 11: 
                        case 14: 
                        case 16: 
                        case 23: {
                            this.k.add(fxpj0);
                            return true;
                        }
                        default: {
                            return false;
                        }
                    }
                }
                return false;
            }
        }
    }

    @Override  // fxgm
    public final gxnz e() {
        return this.a == null ? null : this.a.b;
    }
}


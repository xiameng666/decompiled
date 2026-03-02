import android.location.Location;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;

public final class fxts {
    public long a;
    public ActivityRecognitionResult b;
    public fxtn c;
    public long d;
    public boolean e;
    public boolean f;
    public fxro g;
    public boolean h;
    public boolean i;
    public boolean j;
    private long k;
    private Location l;
    private ActivityRecognitionResult m;
    private long n;
    private Location o;
    private long p;
    private Long q;
    private gzuh r;
    private ReportingConfig s;

    public fxts() {
        this.k = 0L;
        this.k();
    }

    public final long a() {
        synchronized(this) {
        }
        return this.p;
    }

    public final long b() {
        synchronized(this) {
        }
        return this.n;
    }

    public final long c() {
        synchronized(this) {
        }
        return this.k;
    }

    public final Location d() {
        synchronized(this) {
        }
        return this.l;
    }

    public final Location e() {
        synchronized(this) {
        }
        return this.o;
    }

    public final ActivityRecognitionResult f() {
        synchronized(this) {
        }
        return this.b;
    }

    public final ActivityRecognitionResult g() {
        synchronized(this) {
        }
        return this.m;
    }

    public final ReportingConfig h() {
        synchronized(this) {
        }
        return this.s;
    }

    public final gzuh i() {
        synchronized(this) {
        }
        return this.r;
    }

    public final Long j() {
        synchronized(this) {
        }
        return this.q;
    }

    public final void k() {
        synchronized(this) {
            this.l = null;
            this.a = -1L;
            this.m = null;
            this.b = null;
            this.n = -1L;
            this.o = null;
            this.p = -1L;
            this.q = null;
            this.r = null;
            this.c = null;
            this.d = -1L;
            this.e = false;
            this.s = null;
            this.g = null;
            this.i = false;
            this.j = false;
        }
    }

    public final void l() {
        synchronized(this) {
            ++this.k;
        }
    }

    public final void m(long v) {
        synchronized(this) {
            this.n = v;
            this.e = false;
        }
    }

    public final void n(gzuh gzuh0) {
        synchronized(this) {
            this.r = gzuh0;
        }
    }

    public final void o(gzuh gzuh0, fxtn fxtn0, long v) {
        synchronized(this) {
            this.r = gzuh0;
            this.c = fxtn0;
            this.d = v;
        }
    }

    public final void p(fxtn fxtn0) {
        synchronized(this) {
            this.c = fxtn0;
        }
    }

    public final void q(boolean z) {
        synchronized(this) {
            this.f = z;
        }
    }

    public final void r(ActivityRecognitionResult activityRecognitionResult0) {
        synchronized(this) {
            this.m = activityRecognitionResult0;
        }
    }

    public final void s(Location location0, long v) {
        synchronized(this) {
            this.l = location0;
            this.a = v;
        }
    }

    public final void t(long v) {
        synchronized(this) {
            this.q = v;
        }
    }

    @Override
    public final String toString() {
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        String s9;
        String s8;
        long v4;
        long v3;
        long v2;
        long v1;
        String s3;
        String s2;
        String s1;
        String s7;
        String s6;
        Long long1;
        String s5;
        String s;
        synchronized(this) {
            ReportingConfig reportingConfig0 = this.s;
            if(reportingConfig0 == null) {
                s = null;
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: reportingConfig0.a) {
                    ArrayList arrayList0 = new ArrayList();
                    fxux.b("account", cnug.a(((AccountConfig)object0).a), arrayList0);
                    fxux.b("restriction", Integer.valueOf(((AccountConfig)object0).j), arrayList0);
                    fxux.b("reporting", Integer.valueOf(((AccountConfig)object0).b()), arrayList0);
                    fxux.b("history", Integer.valueOf(((AccountConfig)object0).a()), arrayList0);
                    fxux.b("updateNumber", Long.valueOf(((AccountConfig)object0).c), arrayList0);
                    fxux.b("serverMillis", Long.valueOf(((AccountConfig)object0).i), arrayList0);
                    fxux.b("lastUploadTimeMs", ((AccountConfig)object0).q, arrayList0);
                    fxux.b("reasons", ((AccountConfig)object0).d(), arrayList0);
                    stringBuilder0.append(fxux.a(arrayList0, ((AccountConfig)object0)));
                    stringBuilder0.append(";");
                }
                s = stringBuilder0.toString();
            }
            s1 = this.l == null ? "null" : String.valueOf(this.l.getTime());
            s2 = this.m == null ? "null" : String.valueOf(this.m.c);
            s3 = this.b == null ? "null" : String.valueOf(this.b.c);
            String s4 = this.o == null ? "null" : String.valueOf(this.o.getTime());
            v1 = this.k;
            v2 = this.a;
            v3 = this.n;
            v4 = this.p;
            Long long0 = this.q;
            fxro fxro0 = this.g;
            if(fxro0 == null) {
                s5 = s;
                s6 = s4;
                long1 = long0;
                s7 = null;
            }
            else {
                s5 = s;
                long1 = long0;
                s6 = s4;
                s7 = "voltage: " + fxro0.f + ", level: " + fxro0.d;
            }
            s8 = this.r == null ? null : this.r.k;
            s9 = String.valueOf(this.c);
            z = this.e;
            z1 = this.h;
            z2 = this.i;
            z3 = this.j;
        }
        return "InternalState{numLocationsSinceStart=" + v1 + ", lastLocationRecorded.time=" + s1 + ", lastLocationRecordedRealtime=" + v2 + ", lastActivityProcessedRealtime=" + s2 + ", currentActivityProcessedRealtime=" + s3 + ", lastWifiAttachedRealtime=" + v3 + ", lastUploadAttemptRealtime=" + v4 + ", lastUploadAttemptLocation.time=" + s6 + ", lastLocationStatusRealtime=" + long1 + ", currentBatteryCondition=" + s7 + ", apiRateGrpc=" + s8 + ", sampleSpec=" + s9 + ", awaitingWifi=" + z + ", hasActiveBurstRequest=" + z1 + ", reportingConfig=" + s5 + ", isAtHome=" + z2 + ", isAtWork=" + z3 + "}";
    }

    public final void u(Location location0) {
        synchronized(this) {
            this.o = location0;
        }
    }

    public final void v(long v) {
        synchronized(this) {
            this.p = v;
        }
    }

    public final void w(ReportingConfig reportingConfig0) {
        synchronized(this) {
            this.s = reportingConfig0;
        }
    }
}


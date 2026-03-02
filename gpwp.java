import android.os.SystemClock;
import j..time.Instant;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;

public final class gpwp {
    public final String a;
    public final long b;
    public final long c;
    private final int d;
    private final Deque e;

    public gpwp(int v, long v1) {
        this.e = new ArrayDeque();
        this.a = "FOP";
        this.d = v;
        this.b = v1;
        this.c = TimeUtils.d(TimeUtils.a(Instant.now().minusMillis(SystemClock.elapsedRealtime()).toEpochMilli()));
    }

    public final String a() {
        StringBuilder stringBuilder0;
        synchronized(this) {
            stringBuilder0 = new StringBuilder();
            for(Object object0: this.e) {
                StringBuilder stringBuilder1 = new StringBuilder();
                Locale locale0 = Locale.US;
                gpxm_Observation gpxm0 = ((gpwo)object0).a;
                stringBuilder1.append(String.format(locale0, "%d,%d,%d", ((long)(((gpwo)object0).b + this.c)), ((long)(TimeUtils.d(gpxm0.timestamp_) + this.c)), ((int)gpxm0.data_)));
                for(int v1 = 0; v1 < (gpxm0.e == null ? 0 : gpxm0.e.length); ++v1) {
                    stringBuilder1.append(String.format(Locale.US, ",%s", gpxm0.b(v1)));
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                gpxm0.a(stringBuilder2);
                if(stringBuilder2.length() > 0) {
                    stringBuilder1.append(",");
                    stringBuilder1.append(stringBuilder2);
                }
                stringBuilder0.append(stringBuilder1.toString());
                stringBuilder0.append("\n");
            }
        }
        return stringBuilder0.toString();
    }

    public final void b(gpxm_Observation gpxm0) {
        synchronized(this) {
            Deque deque0 = this.e;
            if(this.d == deque0.size()) {
                deque0.removeFirst();
            }
            this.c();
            deque0.add(new gpwo(gpxm0, fgvx.a()));
        }
    }

    public final void c() {
        synchronized(this) {
            long v1 = fgvx.a();
            while(true) {
                Deque deque0 = this.e;
                if(deque0.isEmpty()) {
                    break;
                }
                gpwo gpwo0 = (gpwo)deque0.peekFirst();
                if(gpwo0 != null && v1 - gpwo0.b < this.b) {
                    break;
                }
                deque0.removeFirst();
            }
        }
    }
}


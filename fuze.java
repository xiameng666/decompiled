import j..util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;

public final class fuze {
    private final fuzf a;
    private final fuzf b;
    private final fuzf c;
    private final float d;
    private int e;
    private float f;

    static {
    }

    public fuze(String s) {
        this.e = 0;
        this.f = -1.0f;
        this.a = new fuzf(3);
        this.b = new fuzf(3);
        this.c = new fuzf(3);
        this.d = fuzg.a.containsKey(s) ? ((float)(((Float)fuzg.a.get(s)))) : 1.0f;
    }

    public final fuzk a(fwya fwya0) {
        fuzk fuzk0;
        float f;
        synchronized(this) {
            fuzk0 = new fuzk();
            int v1 = (int)(fwya0.f / 1000L);
            int v2 = v1 - this.e;
            boolean z = this.e == 0;
            int v3 = z ? 3 : (v2 + 60) / 360 - 1;
            for(int v4 = 0; v4 < v3; ++v4) {
                this.b.d(0.002f);
            }
            this.b.d(fwya0.c);
            fuzk0.g = this.b.a(2);
            fuzk0.h = this.b.a(1);
            fuzk0.i = this.b.a(0);
            for(int v5 = 0; true; ++v5) {
                f = 0.0f;
                if(v5 >= v3) {
                    break;
                }
                this.a.d(0.0f);
            }
            float f1 = Math.min(1000.0f, this.d * fwya0.a);
            fuzk0.c = f1;
            float f2 = this.f;
            if(f2 != -1.0f) {
                f = f1 - f2;
            }
            this.a.d(f);
            fuzk0.d = this.a.a(2);
            fuzk0.e = this.a.a(1);
            fuzk0.f = this.a.a(0);
            this.f = f1;
            for(int v6 = 0; v6 < v3; ++v6) {
                this.c.d(2.0f);
            }
            this.c.d(fwya0.e);
            fuzk0.I = this.c.a(2);
            fuzk0.J = this.c.a(1);
            fuzk0.K = this.c.a(0);
            fuzk0.M = (float)fwya0.g;
            Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone(TimeZone.getDefault().getID()));
            calendar0.setTimeInMillis(((long)v1) * 1000L);
            fuzk0.L = (float)calendar0.get(11);
            if(z || v2 >= 330) {
                this.e = v1;
            }
        }
        return fuzk0;
    }
}


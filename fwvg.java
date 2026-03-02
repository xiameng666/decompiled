import android.os.SystemClock;
import j..util.Objects;
import java.util.Locale;

final class fwvg implements Runnable {
    final fwya a;
    final fuuy b;

    public fwvg(fwvh fwvh0, fuuy fuuy0, fwya fwya0) {
        this.b = fuuy0;
        this.a = fwya0;
        Objects.requireNonNull(fwvh0);
        super();
    }

    @Override
    public final void run() {
        if(huwz.o() && huwz.l()) {
            fuuy fuuy0 = this.b;
            fwya fwya0 = this.a;
            int v = fwya0.d;
            String s = String.format(Locale.US, "m=%d, t=%.2f, l=%.1f, l_m=%.1f, noise=%.1f, ts=%d, pres=%d,", v, ((float)fwya0.c), ((float)fwya0.a), ((float)fwya0.b), ((float)fwya0.e), ((long)fwya0.f), ((int)fwya0.g));
            futd futd0 = fuuy0.d;
            fuzj fuzj0 = futd0.f();
            if(fuzj0 != null) {
                fwyd fwyd0 = fuuy0.a;
                futd0.V = SystemClock.elapsedRealtime();
                fuzk fuzk0 = fuuy0.c.a(fwya0);
                int v1 = fuzj0.a(fuzk0);
                String[] arr_s = fuzk.b;
                boolean z = false;
                for(int v2 = 0; v2 < 37; ++v2) {
                    fuzk0.a(arr_s[v2]);
                }
                fuuz fuuz0 = fuuy0.e;
                if(fuuz0 != null) {
                    long v3 = fwyd0.c();
                    if(v > 0) {
                        z = true;
                    }
                    SystemClock.elapsedRealtime();
                    fuuz0.e(v1, v3, fuzk0, z);
                    fvwx fvwx0 = new fvwx(0x77, fuuy0.b.f(), null, s, -1, -1, -1);
                    fuuy0.b.a(fvwx0);
                }
            }
        }
    }
}


import com.google.android.gms.nearby.fastpair.sass.device.SassDevice.1;
import java.util.ArrayList;

public final class cymu implements Runnable {
    public final SassDevice.1 a;
    public final ArrayList b;

    public cymu(SassDevice.1 sassDevice$10, ArrayList arrayList0) {
        this.a = sassDevice$10;
        this.b = arrayList0;
    }

    @Override
    public final void run() {
        fgtc fgtc0 = new fgtc(null);
        int v = (int)(((Integer)this.b.get(0)));
        fgtc0.D(fgtl.a, v);
        int v1 = (int)(((Integer)this.b.get(1)));
        fgtc0.D(fgtl.b, v1);
        int v2 = (int)(((Integer)this.b.get(2)));
        fgtc0.D(fgtl.c, v2);
        int v3 = (int)(((Integer)this.b.get(3)));
        fgtc0.D(fgtl.d, v3);
        byte[] arr_b = fgtc0.p();
        cyqk.a(this.a.b.q.a(fgmh.e, arr_b), new cyml(this.a.b), this.a.b.e);
    }
}


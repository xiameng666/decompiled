import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class fvnj extends fvor {
    private final int e;
    private final int f;

    public fvnj(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, fwyd fwyd0, int v, int v1) {
        super(context0, fvls0, fvlt0, fybc0);
        this.e = v;
        this.f = v1;
    }

    @Override  // fvor
    protected final int a() {
        return 4;
    }

    @Override  // fvor
    protected final int d() {
        return 6;
    }

    @Override  // fvor
    protected final int e() {
        return 4;
    }

    @Override  // fvor
    protected final int f() {
        return 48000;
    }

    @Override  // fvor
    protected final AudioFormat g() {
        return new AudioFormat.Builder().setChannelIndexMask(15).setEncoding(4).setSampleRate(48000).build();
    }

    @Override  // fvor
    protected final boolean h(int v, int v1, long v2) {
        int v18;
        int v16;
        int v14;
        int v3 = v;
        fvls fvls0 = this.m;
        int v4 = this.e;
        int v5 = this.f;
        fvls0.post(new fvlq(fvls0, v4, v5));
        if(v4 != 0) {
            gftb.checkTrue(v4 > 0 && v5 > 0);
            gftb.checkTrue(v4 < v5);
        }
        else if(v5 == 0) {
            v5 = 1000;
            v4 = 1000;
        }
        else {
            v4 = 0;
            gftb.checkTrue(false);
            gftb.checkTrue(0 < v5);
        }
        gftb.checkTrue(((long)v5) < TimeUnit.HOURS.toMillis(1L));
        gftb.checkTrue(((long)v4) * 48000L % 1000L == 0L);
        gftb.checkTrue(48000L * ((long)v5) % 1000L == 0L);
        int v6 = (int)(((long)v4) * 48000L / 1000L);
        int v7 = v3 * v1;
        fvpw fvpw0 = new fvpw(v6 * v1, v7, Float.class);
        float[] arr_f = new float[v3];
        long v8 = v2;
        int v9 = 0;
        while(fvnj.a) {
            int v10 = fvnj.b.read(arr_f, 0, v3, 0);
            if(v10 < 0) {
                Locale.getDefault();
                return false;
            }
            gftb.checkTrue(v3 % v1 == 0);
            gftb.checkTrue(v3 <= v7);
            int v11 = v10 / v1;
            ArrayList arrayList0 = new ArrayList();
            int v12 = 0;
            int v13 = 0;
            while(true) {
                v14 = (int)(48000L * ((long)v5) / 1000L);
                int v15 = v12 + v13;
                if(v15 >= v11) {
                    break;
                }
                if(v9 < v6) {
                    v16 = v11;
                    arrayList0.addAll(fvpw0.a(arr_f, v12 * v1, v13 * v1));
                }
                else {
                    v16 = v11;
                }
                v9 = (v9 + v13) % v14;
                v13 = v9 >= v6 ? v14 - v9 : v6 - v9;
                v12 = v15;
                v11 = v16;
            }
            int v17 = v11 - v12;
            if(v9 < v6) {
                v18 = v6;
                arrayList0.addAll(fvpw0.a(arr_f, v12 * v1, v17 * v1));
            }
            else {
                v18 = v6;
            }
            v9 = (v9 + v17) % v14;
            ArrayList arrayList1 = new ArrayList();
            int v19 = arrayList0.size();
            int v20 = 0;
            while(v20 < v19) {
                arrayList1.add(new fvot(((float[])arrayList0.get(v20)), v8, v1));
                v8 += (long)v5;
                ++v20;
                v19 = v19;
                arr_f = arr_f;
            }
            for(Object object0: arrayList1) {
                ((fvoq)object0).a(fvls0);
            }
            v3 = v;
            v6 = v18;
            arr_f = arr_f;
        }
        return true;
    }
}


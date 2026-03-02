import java.util.concurrent.TimeUnit;

public final class fvyf implements fvyc {
    public static final long a;
    public static final long b;
    public static final int[] c;
    public final fvyc d;
    public final gluu[][] e;
    public final gluu[][] f;
    public final gluu[] g;
    public int h;
    public long i;
    public fvye j;
    public cguv k;

    static {
        fvyf.a = TimeUnit.MINUTES.toNanos(1L);
        fvyf.b = TimeUnit.MILLISECONDS.toNanos(700L);
        fvyf.c = new int[]{0, 1};
    }

    public fvyf(fvyc fvyc0) {
        this.e = new gluu[2][5];
        this.f = new gluu[2][5];
        this.g = new gluu[2];
        this.h = 0;
        this.i = -TimeUnit.DAYS.toNanos(1L);
        this.d = fvyc0;
        int[] arr_v = fvyf.c;
        for(int v = 0; v < 2; ++v) {
            int v1 = arr_v[v];
            this.g[v1] = new gluu();
            this.e[v1] = new gluu[5];
            this.f[v1] = new gluu[5];
            for(int v2 = 0; v2 <= 4; ++v2) {
                gluu[] arr_gluu = this.e[v1];
                arr_gluu[v2] = new gluu();
                gluu[] arr_gluu1 = this.f[v1];
                arr_gluu1[v2] = new gluu();
            }
        }
        this.k = cguv.v();
    }

    public static int a(long v) {
        if(v < 60000000000L) {
            return -1;
        }
        return v >= 600000000000L ? 1 : 0;
    }
}


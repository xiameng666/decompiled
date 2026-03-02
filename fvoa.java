import android.hardware.SensorEvent;

public final class fvoa extends fvkt {
    private final fvnx d;
    private long e;
    private final long[] f;
    private final double[] g;
    private final double[] h;
    private int i;

    public fvoa(fvnr fvnr0, fvls fvls0, fvnx fvnx0) {
        super(fvnr0, fvls0);
        this.e = 0L;
        this.f = new long[0x100];
        this.g = new double[0x100];
        this.h = new double[3];
        this.i = 0;
        this.d = fvnx0;
    }

    @Override  // fvkt
    public final void a() {
    }

    @Override  // fvkt
    public final void b() {
    }

    @Override  // fvkt
    public final void c(fvns fvns0, long v, SensorEvent sensorEvent0) {
        int v4;
        double f3;
        if(sensorEvent0 != null && sensorEvent0.sensor.getType() == 1) {
            double f = 0.0;
            double f1 = 0.0;
            for(int v1 = 0; v1 < 3; ++v1) {
                this.h[v1] = this.h[v1] * 0.9 + ((double)sensorEvent0.values[v1]) * 0.1;
                double f2 = ((double)sensorEvent0.values[v1]) - this.h[v1];
                f1 += f2 * f2;
            }
            int v2 = this.i;
            this.f[v2] = v;
            double[] arr_f = this.g;
            this.i = v2 + 1;
            arr_f[v2] = Math.sqrt(f1);
            if(v2 + 1 >= 0x100 || v2 + 1 != 0 && v - this.f[0] > 300L) {
                if(v2 + 1 == 0) {
                    f3 = NaN;
                }
                else {
                    double f4 = 0.0;
                    for(int v3 = 0; true; ++v3) {
                        v4 = this.i;
                        if(v3 >= v4) {
                            break;
                        }
                        double f5 = arr_f[v3];
                        f4 += f5;
                        f += f5 * f5;
                    }
                    f3 = (f - f4 * (f4 / ((double)v4))) / ((double)v4);
                }
                if((f3 > 0.05)) {
                    this.e = v;
                }
                if(this.e != 0L && v - this.e > this.d.e) {
                    this.c.postAtFrontOfQueue(this.a);
                }
                this.i = 0;
            }
        }
    }
}


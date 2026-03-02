public final class fouo {
    public float a;
    public int b;
    public byte c;
    public int d;
    private gfsx e;

    public fouo() {
        throw null;
    }

    public fouo(byte[] arr_b) {
        this.e = gfqx.a;
    }

    public final foup a() {
        boolean z = true;
        if(this.c == 3) {
            int v = this.d;
            if(v != 0) {
                foup foup0 = new foup(v, this.a, this.b, this.e);
                if(Float.compare(foup0.a, 0.0f) <= 0 || foup0.a > 100.0f) {
                    z = false;
                }
                gftb.b(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
                return foup0;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == 0) {
            stringBuilder0.append(" enablement");
        }
        if((this.c & 1) == 0) {
            stringBuilder0.append(" startupSamplePercentage");
        }
        if((this.c & 2) == 0) {
            stringBuilder0.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.d = z ? 3 : 2;
    }
}


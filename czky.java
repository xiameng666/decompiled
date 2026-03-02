import java.net.InetAddress;

public final class czky {
    public String a;
    public InetAddress b;
    private gyxl c;
    private String d;
    private long e;
    private long f;
    private long g;
    private byte h;

    public final czkz a() {
        if(this.h == 7) {
            gyxl gyxl0 = this.c;
            if(gyxl0 != null) {
                String s = this.d;
                if(s != null) {
                    return new czkz(gyxl0, s, this.e, this.f, this.g, this.a, this.b);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" medium");
        }
        if(this.d == null) {
            stringBuilder0.append(" expectedServiceType");
        }
        if((this.h & 1) == 0) {
            stringBuilder0.append(" registerWaitDurationSeconds");
        }
        if((this.h & 2) == 0) {
            stringBuilder0.append(" unregisterWaitDurationSeconds");
        }
        if((this.h & 4) == 0) {
            stringBuilder0.append(" resolveServiceWaitDurationSeconds");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null expectedServiceType");
        }
        this.d = s;
    }

    public final void c(gyxl gyxl0) {
        if(gyxl0 == null) {
            throw new NullPointerException("Null medium");
        }
        this.c = gyxl0;
    }

    public final void d(long v) {
        this.e = v;
        this.h = (byte)(this.h | 1);
    }

    public final void e(long v) {
        this.g = v;
        this.h = (byte)(this.h | 4);
    }

    public final void f(long v) {
        this.f = v;
        this.h = (byte)(this.h | 2);
    }
}


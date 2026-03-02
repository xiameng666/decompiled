import java.util.UUID;

public final class czqk {
    public String a;
    private String b;
    private czsy c;
    private boolean d;
    private UUID e;
    private int f;
    private byte g;

    public final czql a() {
        if(this.g == 3) {
            String s = this.b;
            if(s != null) {
                czsy czsy0 = this.c;
                if(czsy0 != null) {
                    UUID uUID0 = this.e;
                    if(uUID0 != null) {
                        return new czql(s, czsy0, this.d, this.a, uUID0, this.f);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" serviceId");
        }
        if(this.c == null) {
            stringBuilder0.append(" blePeripheral");
        }
        if((this.g & 1) == 0) {
            stringBuilder0.append(" forceL2cap");
        }
        if(this.e == null) {
            stringBuilder0.append(" serviceUuid");
        }
        if((this.g & 2) == 0) {
            stringBuilder0.append(" powerLevel");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(czsy czsy0) {
        if(czsy0 == null) {
            throw new NullPointerException("Null blePeripheral");
        }
        this.c = czsy0;
    }

    public final void c(boolean z) {
        this.d = z;
        this.g = (byte)(this.g | 1);
    }

    public final void d(int v) {
        this.f = v;
        this.g = (byte)(this.g | 2);
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null serviceId");
        }
        this.b = s;
    }

    public final void f(UUID uUID0) {
        if(uUID0 == null) {
            throw new NullPointerException("Null serviceUuid");
        }
        this.e = uUID0;
    }
}


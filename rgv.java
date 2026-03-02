import android.net.Network;

public final class rgv {
    public Network a;
    public bkbc b;
    private String c;
    private String d;
    private boolean e;
    private int f;
    private String g;
    private byte h;

    public final rgw a() {
        if(this.h == 3) {
            String s = this.c;
            if(s != null) {
                String s1 = this.d;
                if(s1 != null) {
                    String s2 = this.g;
                    if(s2 != null) {
                        return new rgw(s, s1, this.e, this.f, this.a, this.b, s2);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" serverUrl");
        }
        if(this.d == null) {
            stringBuilder0.append(" clientTs43");
        }
        if((this.h & 1) == 0) {
            stringBuilder0.append(" useHttpPost");
        }
        if((this.h & 2) == 0) {
            stringBuilder0.append(" timeoutInSec");
        }
        if(this.g == null) {
            stringBuilder0.append(" eapAkaRealm");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null clientTs43");
        }
        this.d = s;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null eapAkaRealm");
        }
        this.g = s;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null serverUrl");
        }
        this.c = s;
    }

    public final void e(int v) {
        this.f = v;
        this.h = (byte)(this.h | 2);
    }

    public final void f(boolean z) {
        this.e = z;
        this.h = (byte)(this.h | 1);
    }
}


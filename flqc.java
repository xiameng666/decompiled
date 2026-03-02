import android.net.Uri;

public final class flqc {
    public gged_interceptors a;
    public String b;
    public gged_interceptors c;
    public String d;
    private Uri e;
    private int f;
    private int g;
    private byte h;

    public final flqd a() {
        if(this.h == 3) {
            Uri uri0 = this.e;
            if(uri0 != null) {
                return new flqd(uri0, this.a, this.b, this.c, this.d, this.f, this.g);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.e == null) {
            stringBuilder0.append(" tableUri");
        }
        if((this.h & 1) == 0) {
            stringBuilder0.append(" limit");
        }
        if((this.h & 2) == 0) {
            stringBuilder0.append(" offset");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.f = v;
        this.h = (byte)(this.h | 1);
    }

    public final void c(int v) {
        this.g = v;
        this.h = (byte)(this.h | 2);
    }

    public final void d(Uri uri0) {
        if(uri0 == null) {
            throw new NullPointerException("Null tableUri");
        }
        this.e = uri0;
    }
}


import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

public final class acps {
    public float a;
    public int b;
    public int c;
    public int d;
    public AdsrParams e;
    private int f;
    private int g;
    private final float[] h;

    public acps() {
        this.f = 6;
        this.a = 44100.0f;
        this.b = 16;
        this.c = 50;
        this.d = 2;
        this.g = 1;
        this.e = DtmfEncoding.b;
        this.h = DtmfEncoding.a;
    }

    public final Encoding a() {
        boolean z = false;
        batl.c(Long.compare(this.e.a(), this.c) <= 0, "Sum of ADSR window components must not be more than windowDurationMillis");
        if(this.d < 10) {
            z = true;
        }
        batl.c(z, "Number of tone frequencies must be greater than number of frequencies per symbol");
        return new Encoding(1, null, new DtmfEncoding(this.f, Encoding.b(this.g), this.a, this.b, this.c, this.d, Encoding.a(this.g), this.e, this.h));
    }

    public final void b(int v) {
        this.g = v;
    }

    public final void c(int v) {
        batl.c(v > 0, "tokenLengthBytes must be greater than zero");
        this.f = v;
    }
}


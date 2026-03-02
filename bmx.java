import java.util.List;

public final class bmx {
    public final bmb a;
    public final bnc b;
    public final bmi c;
    public final List d;
    public boolean e;
    public boolean f;

    public bmx(bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        this.e = false;
        this.f = false;
        this.a = bmb0;
        this.b = bnc0;
        this.c = bmi0;
        this.d = list0;
    }

    @Override
    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}


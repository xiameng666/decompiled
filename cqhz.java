import android.content.Intent;

public final class cqhz implements gftc {
    public final Intent a;

    public cqhz(Intent intent0) {
        this.a = intent0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return bbpz.f(((String)object0)).equals(this.a.getAction());
    }
}


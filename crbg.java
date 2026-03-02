import android.os.Parcel;
import j..util.Objects;

public final class crbg extends crbj {
    final Runnable a;
    final crbs b;

    public crbg(crbs crbs0, Runnable runnable0) {
        this.a = runnable0;
        Objects.requireNonNull(crbs0);
        this.b = crbs0;
        super(crbs0);
    }

    @Override  // crbj
    public final void a() {
        crba crba0 = this.b.e;
        batl.s(crba0);
        crbc crbc0 = new crbc(this, this.a);
        Parcel parcel0 = crba0.jo();
        wbz.h(parcel0, crbc0);
        crba0.jp(58, parcel0);
    }
}


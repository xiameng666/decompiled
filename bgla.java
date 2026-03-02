import android.content.pm.ApplicationInfo;

public final class bgla implements gftc {
    public final bgln a;

    public bgla(bgln bgln0) {
        this.a = bgln0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return (((ApplicationInfo)object0).flags & 1) == 0 && this.a.b.a(((ApplicationInfo)object0));
    }
}


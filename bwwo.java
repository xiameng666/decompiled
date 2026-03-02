import android.net.Uri;

public abstract class bwwo extends bwwp {
    protected abstract abxz a();

    @Override  // bwwp
    public final String b(String s) {
        return "appdatasearch/" + Uri.encode(s);
    }

    @Override  // bwwp
    protected final abxz c() {
        return this.a();
    }
}


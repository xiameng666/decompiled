import android.net.Uri;

public final class ddls {
    public final String a;
    public final Uri b;
    public final boolean c;

    public ddls(String s, Uri uri0, boolean z) {
        this.a = s;
        this.b = uri0;
        this.c = z;
    }

    @Override
    public final String toString() {
        return String.format("Profile<name: %s, uri: %s>", this.a, this.b);
    }
}


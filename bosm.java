import android.content.Context;

public final class bosm {
    public final Context a;
    private final fqxe b;
    private final fquu c;

    public bosm(fqxe fqxe0, fquu fquu0, Context context0) {
        this.b = fqxe0;
        this.c = fquu0;
        this.a = context0;
    }

    public final gmcd a() {
        gmcd gmcd0 = this.b.f();
        gmcd gmcd1 = this.c.l();
        return gdtf.d(new gmcd[]{gmcd0, gmcd1}).a(new bosk(this, gmcd0, gmcd1), gmap.a);
    }

    public static void b(StringBuilder stringBuilder0, String s, String s1) {
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(s1);
        stringBuilder0.append('\n');
    }
}


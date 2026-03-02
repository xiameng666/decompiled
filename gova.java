import android.content.Context;

public final class gova extends goua {
    private final String e;

    public gova(String s, String s1, goxi goxi0, String s2, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "UnlinkEmailCredential");
        this.e = s2;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        batl.q(this.e);
        gowa gowa0 = new gowa(gowy0, this.a);
        gowy0.a(this.e, gowa0);
    }
}


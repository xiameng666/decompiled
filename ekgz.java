import android.content.Context;

public final class ekgz {
    private static ekgz a;
    private final bayo b;

    private ekgz(Context context0) {
        this.b = bayo.a(context0.getApplicationContext());
    }

    static ekgz a(Context context0) {
        synchronized(ekgz.class) {
            if(ekgz.a == null) {
                ekgz.a = new ekgz(context0);
            }
        }
        return ekgz.a;
    }

    final boolean b() {
        return this.b.f();
    }
}


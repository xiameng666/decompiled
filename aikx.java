import android.content.Context;

public final class aikx {
    public final aiig a;
    private static aikx b;

    private aikx(Context context0) {
        aiig aiig0 = new aiig(context0);
        super();
        batl.s(context0);
        this.a = aiig0;
    }

    public static aikx a(Context context0) {
        synchronized(aikx.class) {
            if(aikx.b == null) {
                aikx.b = new aikx(context0.getApplicationContext());
            }
        }
        return aikx.b;
    }
}


import android.content.Context;

public final class ejyq {
    public static final bboh a;
    public final Context b;
    public final ekep c;
    private static ejyq d;

    static {
        ejyq.a = bboh.b("DCU_LocalDataRetentUtil", bbcu.bN);
    }

    private ejyq(Context context0) {
        ekeq ekeq0 = new ekeq(context0);
        super();
        this.b = context0.getApplicationContext();
        this.c = ekeq0;
    }

    public static ejyq a(Context context0) {
        synchronized(ejyq.class) {
            if(ejyq.d == null) {
                ejyq.d = new ejyq(context0);
            }
        }
        return ejyq.d;
    }
}


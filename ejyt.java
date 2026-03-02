import android.content.Context;

public final class ejyt {
    public aqee a;
    private static ejyt b;

    private ejyt() {
    }

    private ejyt(Context context0) {
        this.a = new aqee(context0);
    }

    public static ejyt a(Context context0) {
        synchronized(ejyt.class) {
            if(ejyt.b == null) {
                ejyt.b = new ejyt(context0);
            }
        }
        return ejyt.b;
    }
}


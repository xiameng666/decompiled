import android.content.Context;

public final class aiam {
    private static volatile aian a;

    public static aian a(Context context0, String s) {
        synchronized(aiam.class) {
            if(aiam.a == null) {
                aian.a.d("Instantiate SmsRetrieverCore.", new Object[0]);
                aiam.a = new aian(context0, s);
            }
        }
        return aiam.a;
    }

    public static void b() {
        synchronized(aiam.class) {
            aian.a.d("Release SmsRetrieverCore instance.", new Object[0]);
            aiam.a = null;
        }
    }

    public static boolean c() {
        synchronized(aiam.class) {
        }
        return aiam.a != null;
    }
}


import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

public final class ezoi {
    public static final int[] a;
    public final SharedPreferences b;
    public final cchj c;
    private static final Object d;
    private static ezoi e;

    static {
        ezoi.a = new int[]{10, 9};
        ezoi.d = new Object();
    }

    private ezoi(Context context0) {
        this.b = context0.getSharedPreferences("LockboxOptInSettings", 0);
        this.c = cchj.b(context0);
    }

    public static ezoi a(Context context0) {
        synchronized(ezoi.d) {
            if(ezoi.e == null) {
                ezoi.e = new ezoi(context0.getApplicationContext());
            }
        }
        return ezoi.e;
    }

    public static String b(String s) {
        return "udc-account-event-index-" + s;
    }

    public static String c(String s, int v) {
        return "opt-in-status-" + s + "-" + ezoi.j(v);
    }

    public static String d(String s, int v) {
        return "opt-in-timestamp-" + s + "-" + ezoi.j(v);
    }

    public final Set e() {
        Set set0 = new HashSet();
        SharedPreferences sharedPreferences0 = this.b;
        synchronized(sharedPreferences0) {
            for(Object object0: sharedPreferences0.getAll().keySet()) {
                String s = (String)object0;
                String s1 = s.matches("^opt-in-status-.+-\\d+$") ? s.substring(14, s.lastIndexOf(45)) : null;
                if(s1 != null) {
                    set0.add(s1);
                }
            }
        }
        return set0;
    }

    public final void f() {
        SharedPreferences sharedPreferences0 = this.b;
        synchronized(sharedPreferences0) {
            __monitor_enter(sharedPreferences0);
        }
        try {
            boolean z = sharedPreferences0.getBoolean("is-account-renaming-migrated", false);
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(sharedPreferences0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(sharedPreferences0);
                throw throwable0;
            }
        }
        __monitor_exit(sharedPreferences0);
        if(z) {
            __monitor_exit(sharedPreferences0);
            return;
        }
        try {
            HashSet hashSet0 = new HashSet();
            SharedPreferences sharedPreferences1 = this.b;
            synchronized(sharedPreferences1) {
                for(Object object0: sharedPreferences1.getAll().keySet()) {
                    String s = (String)object0;
                    if(s.startsWith("account-event-index-")) {
                        hashSet0.add(s);
                    }
                }
            }
            SharedPreferences sharedPreferences2 = this.b;
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences2.edit();
            for(Object object1: hashSet0) {
                int v1 = sharedPreferences2.getInt(((String)object1), -1);
                String s1 = ((String)object1).substring(20);
                sharedPreferences$Editor0.putInt("udc-account-event-index-" + s1, v1);
                sharedPreferences$Editor0.putInt("lockbox-account-event-index-" + s1, v1);
                sharedPreferences$Editor0.remove(((String)object1));
            }
            sharedPreferences$Editor0.putBoolean("is-account-renaming-migrated", true);
            sharedPreferences$Editor0.apply();
        }
        catch(Throwable throwable0) {
            __monitor_exit(sharedPreferences0);
            throw throwable0;
        }
        __monitor_exit(sharedPreferences0);
    }

    public final boolean g() {
        synchronized(this.b) {
        }
        return this.b.getBoolean("is-migrated", false);
    }

    public final boolean h(String s, int v) {
        synchronized(this.b) {
        }
        return this.b.getBoolean(ezoi.c(s, v), this.g());
    }

    public final boolean i(String s, int v) {
        synchronized(this.b) {
        }
        return this.h(s, v);
    }

    private static int j(int v) {
        switch(v) {
            case 9: {
                return 2;
            }
            case 10: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }
}


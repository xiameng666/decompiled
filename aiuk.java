import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Executor;

public final class aiuk extends aiuc {
    public final Executor b;
    private Boolean c;

    public aiuk(Context context0) {
        super(context0);
        this.b = new bblp(0x7FFFFFFF, 9);
        this.c = null;
    }

    @Override  // aiuc
    public final int a(String s) {
        int v1;
        synchronized(this) {
            v1 = this.j().getInt(aiuk.l(s), 0);
        }
        return v1;
    }

    @Override  // aiuc
    public final gmcd b(String s) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.j().edit();
            sharedPreferences$Editor0.remove("package:" + s);
            if(!sharedPreferences$Editor0.commit()) {
                Log.e("BlockstoreAccessPrefDb", "Unable to clear access for package " + s);
            }
        }
        return gmbx.a;
    }

    @Override  // aiuc
    public final gmcd c(String s) {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = gmbu.i(Integer.valueOf(this.a(s)));
        }
        return gmcd0;
    }

    @Override  // aiuc
    public final gmcd d(String s, int v) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.j().edit();
            sharedPreferences$Editor0.putInt(aiuk.l(s), v);
            if(v == 3) {
                if(this.c == null) {
                    this.c = Boolean.valueOf(this.j().getBoolean(aiuk.k("hasDetectedRestoredPackages"), false));
                }
                if(!this.c.booleanValue()) {
                    this.c = Boolean.valueOf(true);
                    sharedPreferences$Editor0.putBoolean(aiuk.k("hasDetectedRestoredPackages"), true);
                }
            }
            if(!sharedPreferences$Editor0.commit()) {
                Log.e("BlockstoreAccessPrefDb", "Unable to set access for package " + s);
            }
        }
        return gmbx.a;
    }

    @Override  // aiuc
    public final gmcd e(long v) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.j().edit();
            sharedPreferences$Editor0.putLong("metadata:restoreTriggeredTimestampMillis", v);
            if(!sharedPreferences$Editor0.commit()) {
                Log.e("BlockstoreAccessPrefDb", a.u(v, "Unable to set restoreTriggeredTimestampMillis to "));
            }
        }
        return gmbx.a;
    }

    @Override  // aiuc
    public final gmcd f(String s) {
        gmcd gmcd2;
        synchronized(this) {
            gmcd gmcd0 = this.i();
            gmcd gmcd1 = this.c(s);
            gmcd2 = gmbu.d(new gmcd[]{gmcd0, gmcd1}).b(new aiuj(this, gmcd0, gmcd1, s), this.b);
        }
        return gmcd2;
    }

    @Override  // aiuc
    public final gmcd g(String s, int v) {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = glzd.g(gmbt.h(this.c(s)), new aiui(this, v, s), this.b);
        }
        return gmcd0;
    }

    @Override  // aiuc
    public final gmcd h(Set set0, gfsx gfsx0) {
        throw null;
    }

    public final gmcd i() {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = gmbu.i(Long.valueOf(this.j().getLong(aiuk.k("restoreTriggeredTimestampMillis"), 0L)));
        }
        return gmcd0;
    }

    private final SharedPreferences j() {
        return this.a.getSharedPreferences("auth_blockstore_access_control", 0);
    }

    private static String k(String s) {
        return "metadata:" + s;
    }

    private static String l(String s) {
        return "package:" + s;
    }
}


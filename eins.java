import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class eins {
    protected final einq c;
    protected final String d;
    public final AtomicBoolean e;
    public long f;
    public long g;
    public float h;

    public eins(einq einq0, String s) {
        this.e = new AtomicBoolean(false);
        this.g = 0L;
        this.h = 1.0f;
        this.c = einq0;
        this.d = s;
        this.f = 2000L;
    }

    protected void a() {
        fphq.d(fpib.a(this.d));
    }

    protected void b(Exception exception0, boolean z) {
    }

    protected void c(Exception exception0, boolean z) {
    }

    protected boolean d(Configurations configurations0) {
        this.e(configurations0);
        return true;
    }

    @Deprecated
    protected void e(Configurations configurations0) {
        throw new IllegalStateException("Requires implementation");
    }

    protected final Configurations f(String s, String s1, String s2, boolean z) {
        evql evql0 = this.c.f(s, s1, s2);
        try {
            return (Configurations)evrg.o(evql0, this.f, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            this.c(exception0, z);
            Log.e("PhenotypeFlagCommitter", a.a(s, "Retrieving snapshot for ", " failed"), exception0);
            return null;
        }
    }

    protected String g() {
        return null;
    }

    public final boolean h(String s) {
        return this.j(s, 3, this.g);
    }

    public static boolean i(SharedPreferences sharedPreferences0, Configurations configurations0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        if(!configurations0.f) {
            sharedPreferences$Editor0.clear();
        }
        Configuration[] arr_configuration = configurations0.d;
        for(int v = 0; v < arr_configuration.length; ++v) {
            Configuration configuration0 = arr_configuration[v];
            if(configuration0 != null) {
                String[] arr_s = configuration0.c;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    sharedPreferences$Editor0.remove(arr_s[v1]);
                }
                Flag[] arr_flag = configuration0.b;
                for(int v2 = 0; v2 < arr_flag.length; ++v2) {
                    Flag flag0 = arr_flag[v2];
                    switch(flag0.h) {
                        case 1: {
                            long v3 = flag0.b();
                            sharedPreferences$Editor0.putLong(flag0.b, v3);
                            break;
                        }
                        case 2: {
                            boolean z = flag0.f();
                            sharedPreferences$Editor0.putBoolean(flag0.b, z);
                            break;
                        }
                        case 3: {
                            float f = (float)flag0.a();
                            sharedPreferences$Editor0.putFloat(flag0.b, f);
                            break;
                        }
                        case 4: {
                            String s = flag0.d();
                            sharedPreferences$Editor0.putString(flag0.b, s);
                            break;
                        }
                        case 5: {
                            String s1 = Base64.encodeToString(flag0.g(), 3);
                            sharedPreferences$Editor0.putString(flag0.b, s1);
                        }
                    }
                }
            }
        }
        sharedPreferences$Editor0.putString("__phenotype_server_token", configurations0.c);
        sharedPreferences$Editor0.putLong("__phenotype_configuration_version", configurations0.g);
        sharedPreferences$Editor0.putString("__phenotype_snapshot_token", configurations0.a);
        if(!sharedPreferences$Editor0.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
            return false;
        }
        return true;
    }

    private final boolean j(String s, int v, long v1) {
        boolean z = false;
        if(v <= 0) {
            Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for " + this.d);
            return false;
        }
        boolean z1 = this.e.get() && v > 1;
        Configurations configurations0 = this.f(this.d, s, this.g(), z1);
        if(configurations0 == null) {
            return z1 ? this.k(s, v, v1) : false;
        }
        if(!this.d(configurations0)) {
            return false;
        }
        String s1 = configurations0.a;
        if(s1 != null && !s1.isEmpty()) {
            evql evql0 = this.c.e(s1);
            try {
                evrg.o(evql0, this.f, TimeUnit.MILLISECONDS);
                this.a();
                return true;
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.d + " failed, retrying", exception0);
                if(v > 1) {
                    z = true;
                }
                this.b(exception0, z);
                return this.k(s, v, v1);
            }
        }
        return true;
    }

    private final boolean k(String s, int v, long v1) {
        if(v1 > 0L && v > 1) {
            SystemClock.sleep(v1);
        }
        return this.j(s, v - 1, ((long)(((float)v1) * this.h)));
    }
}


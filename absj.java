import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public final class absj extends abpf {
    public SharedPreferences a;
    public final absi b;
    private long c;
    private long e;

    protected absj(abpi abpi0) {
        super(abpi0);
        this.e = -1L;
        this.b = new absi(this, ((long)(((Long)abru.F.a()))));
    }

    @Override  // abpf
    protected final void a() {
        this.a = this.f().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        aboc.b();
        this.I();
        long v = this.c;
        if(v == 0L) {
            long v1 = this.a.getLong("first_run", 0L);
            if(v1 != 0L) {
                this.c = v1;
                return v1;
            }
            long v2 = System.currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            sharedPreferences$Editor0.putLong("first_run", v2);
            if(!sharedPreferences$Editor0.commit()) {
                this.B("Failed to commit first run time");
            }
            this.c = v2;
            return v2;
        }
        return v;
    }

    public final long c() {
        aboc.b();
        this.I();
        long v = this.e;
        if(v == -1L) {
            v = this.a.getLong("last_dispatch", 0L);
            this.e = v;
        }
        return v;
    }

    public final void d() {
        aboc.b();
        this.I();
        long v = System.currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
        sharedPreferences$Editor0.putLong("last_dispatch", v);
        sharedPreferences$Editor0.apply();
        this.e = v;
    }
}


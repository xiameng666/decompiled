import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

final class crjx extends crlv {
    static final Pair a;
    public SharedPreferences b;
    public crjv c;
    public final crju d;
    public final crju e;
    public final crjw f;
    public String g;
    public boolean h;
    public long i;
    public final crju j;
    public final crjs k;
    public final crjw l;
    public final crjt m;
    public final crjs n;
    public final crju o;
    public final crju p;
    public boolean q;
    public final crjs r;
    public final crjs s;
    public final crju t;
    public final crjw u;
    public final crjw v;
    public final crju w;
    public final crjt x;
    private SharedPreferences z;

    static {
        crjx.a = new Pair("", ((long)0L));
    }

    public crjx(crkt crkt0) {
        super(crkt0);
        this.j = new crju(this, "session_timeout", 1800000L);
        this.k = new crjs(this, "start_new_session", true);
        this.o = new crju(this, "last_pause_time", 0L);
        this.p = new crju(this, "session_id", 0L);
        this.l = new crjw(this, "non_personalized_ads");
        this.m = new crjt(this, "last_received_uri_timestamps_by_source");
        this.n = new crjs(this, "allow_remote_dynamite", false);
        this.d = new crju(this, "first_open_time", 0L);
        this.e = new crju(this, "app_install_time", 0L);
        this.f = new crjw(this, "app_instance_id");
        this.r = new crjs(this, "app_backgrounded", false);
        this.s = new crjs(this, "deep_link_retrieval_complete", false);
        this.t = new crju(this, "deep_link_retrieval_attempts", 0L);
        this.u = new crjw(this, "firebase_feature_rollouts");
        this.v = new crjw(this, "deferred_attribution_cache");
        this.w = new crju(this, "deferred_attribution_cache_timestamp", 0L);
        this.x = new crjt(this, "default_event_parameters");
    }

    protected final SharedPreferences a() {
        this.n();
        this.l();
        if(this.z == null) {
            this.aJ().k.b("Default prefs file", "com.google.android.gms_preferences");
            this.z = this.aj().getSharedPreferences("com.google.android.gms_preferences", 0);
        }
        return this.z;
    }

    @Override  // crlv
    protected final void aL() {
        SharedPreferences sharedPreferences0 = this.aj().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        this.q = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        this.c = new crjv(this, Math.max(0L, ((Long)crif.d.a()).longValue()));
    }

    protected final SharedPreferences b() {
        this.n();
        this.l();
        batl.s(this.b);
        return this.b;
    }

    final SparseArray c() {
        Bundle bundle0 = this.m.a();
        int[] arr_v = bundle0.getIntArray("uriSources");
        long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
        if(arr_v != null && arr_v1 != null) {
            if(arr_v.length != arr_v1.length) {
                this.aJ().c.a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray0 = new SparseArray();
            for(int v = 0; v < arr_v.length; ++v) {
                sparseArray0.put(arr_v[v], Long.valueOf(arr_v1[v]));
            }
            return sparseArray0;
        }
        return new SparseArray();
    }

    final crdk d() {
        this.m();
        this.n();
        return crdk.b(this.b().getString("dma_consent_settings", null));
    }

    @Override  // crlv
    protected final boolean e() {
        return true;
    }

    final crmb f() {
        this.m();
        this.n();
        return crmb.i(this.b().getString("consent_settings", "G1"), this.b().getInt("consent_source", 100));
    }

    final Boolean g() {
        this.n();
        return this.b().contains("measurement_enabled") ? Boolean.valueOf(this.b().getBoolean("measurement_enabled", true)) : null;
    }

    final void i(Boolean boolean0) {
        this.n();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.b().edit();
        sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        sharedPreferences$Editor0.apply();
    }

    final boolean j(long v) {
        return v - this.j.a() > this.o.a();
    }

    final boolean k(int v) {
        return crmb.r(v, this.b().getInt("consent_source", 100));
    }
}


import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import j..util.Objects;

final class crjf implements Runnable {
    final int a;
    final String b;
    final Object c;
    final Object d;
    final Object e;
    final crji f;

    public crjf(crji crji0, int v, String s, Object object0, Object object1, Object object2) {
        this.a = v;
        this.b = s;
        this.c = object0;
        this.d = object1;
        this.e = object2;
        Objects.requireNonNull(crji0);
        this.f = crji0;
        super();
    }

    @Override
    public final void run() {
        crji crji0 = this.f;
        crjx crjx0 = crji0.y.g();
        if(crjx0.q()) {
            if(crji0.a == 0) {
                crcu crcu0 = crji0.am();
                if(crcu0.b == null) {
                    synchronized(crcu0) {
                        if(crcu0.b == null) {
                            ApplicationInfo applicationInfo0 = crcu0.aj().getApplicationInfo();
                            String s = bbqc.b();
                            if(applicationInfo0 != null) {
                                crcu0.b = Boolean.valueOf(applicationInfo0.processName != null && applicationInfo0.processName.equals(s));
                            }
                            if(crcu0.b == null) {
                                crcu0.b = Boolean.valueOf(true);
                                crcu0.aJ().c.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if(crcu0.b.booleanValue()) {
                    this.f.a = this.f.al().a ? 'P' : 'C';
                }
                else {
                    this.f.a = this.f.al().a ? 'p' : 'c';
                }
            }
            crji crji1 = this.f;
            if(crji1.b < 0L) {
                crji1.b = crji1.am().i();
            }
            int v = crji1.a;
            long v1 = crji1.b;
            String s1 = this.b;
            String s2 = crji.b(true, s1, this.c, this.d, this.e);
            String s3 = "2" + "01VDIWEA?".charAt(this.a) + ((char)v) + v1 + ":" + s2;
            if(s3.length() > 0x400) {
                s3 = s1.substring(0, 0x400);
            }
            crjv crjv0 = crjx0.c;
            if(crjv0 != null) {
                crjx crjx1 = crjv0.e;
                crjx1.n();
                if(crjv0.a() == 0L) {
                    crjv0.b();
                }
                if(s3 == null) {
                    s3 = "";
                }
                SharedPreferences sharedPreferences0 = crjx1.b();
                String s4 = crjv0.b;
                long v2 = sharedPreferences0.getLong(s4, 0L);
                if(Long.compare(v2, 0L) <= 0) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = crjx1.b().edit();
                    sharedPreferences$Editor0.putString(crjv0.c, s3);
                    sharedPreferences$Editor0.putLong(s4, 1L);
                    sharedPreferences$Editor0.apply();
                    return;
                }
                long v3 = crjx1.aq().E().nextLong() & 0x7FFFFFFFFFFFFFFFL;
                SharedPreferences.Editor sharedPreferences$Editor1 = crjx1.b().edit();
                if(v3 < 0x7FFFFFFFFFFFFFFFL / (v2 + 1L)) {
                    sharedPreferences$Editor1.putString(crjv0.c, s3);
                }
                sharedPreferences$Editor1.putLong(s4, v2 + 1L);
                sharedPreferences$Editor1.apply();
            }
            return;
        }
        this.f.i(6, "Persisted config not initialized. Not logging error/warn");
    }
}


import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import com.google.android.wallet.bender3.framework.storage.SessionEntity;
import j..time.Duration;
import java.util.Map;

public final class gbgr {
    static final ibxd[] a;
    public final String b;
    public final boolean c;
    public final icck d;
    public final gbln e;
    public final gblg f;
    public gmcd g;
    public gmcd h;
    public final ibth i;
    public final ibth j;
    public static final int k;
    private final gaym l;
    private final gbgo m;

    static {
        gbgr.a = new ibxd[]{new ibut(gbgr.class, "hasExistingSession", "getHasExistingSession()Z", 0)};
    }

    public gbgr(Context context0, String s, boolean z, gaym gaym0, icck icck0) {
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "sessionId");
        ibuq.f(gaym0, "eventLogger");
        gbln gbln0 = gbku.b(Bender3Database.m, context0).x();
        gblg gblg0 = gbku.b(Bender3Database.m, context0).w();
        gmcd gmcd0 = icpu.e(icck0, new gbgi(gbln0, s, null));
        gmcd gmcd1 = icpu.e(icck0, new gbgj(z, gblg0, s, null));
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "sessionId");
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(gbln0, "sessionDao");
        ibuq.f(gblg0, "savedInstanceStateDao");
        ibuq.f(gmcd0, "futureHasExistingSession");
        ibuq.f(gmcd1, "futureSavedState");
        super();
        this.b = s;
        this.c = z;
        this.l = gaym0;
        this.d = icck0;
        this.e = gbln0;
        this.f = gblg0;
        this.g = gmcd0;
        this.h = gmcd1;
        this.i = new gbgf(this);
        this.m = new gbgo(this);
        this.j = new gbgg(this);
    }

    public final Bundle a() {
        return (Bundle)this.j().get("aefSavedStateKey");
    }

    public final Bundle b() {
        return (Bundle)this.j().get("activityResultSavedStateKey");
    }

    public final Bundle c() {
        return (Bundle)this.j().get("widgetSavedStateKey");
    }

    public final Object d(String s, int v, String s1, ibrl ibrl0) {
        gbgk gbgk0;
        if((ibrl0 instanceof gbgk)) {
            gbgk0 = (gbgk)ibrl0;
            int v1 = gbgk0.c;
            if((v1 & 0x80000000) == 0) {
                gbgk0 = new gbgk(this, ibrl0);
            }
            else {
                gbgk0.c = v1 - 0x80000000;
            }
        }
        else {
            gbgk0 = new gbgk(this, ibrl0);
        }
        Object object0 = gbgk0.a;
        Object object1 = ibrx.a;
        switch(gbgk0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gbgk0.c = 1;
                    if(this.e.b(this.i(s, new Integer(v), s1), gbgk0) == object1) {
                        return object1;
                    label_17:
                        ibnx.b(object0);
                    }
                    this.f(true);
                    return this.e.a(this.b);
                }
                catch(SQLException sQLException0) {
                    break;
                }
            }
            case 1: {
                goto label_17;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        gbge gbge0 = new gbge(sQLException0);
        gavv.a("BW_SR_01", this.l, gavs.a, gbge0);
        return null;
    }

    public final Object e(gblm gblm0, ibrl ibrl0) {
        Object object1;
        Object object0;
        gbgp gbgp0;
        if((ibrl0 instanceof gbgp)) {
            gbgp0 = (gbgp)ibrl0;
            int v = gbgp0.c;
            if((v & 0x80000000) == 0) {
                gbgp0 = new gbgp(this, ibrl0);
            }
            else {
                gbgp0.c = v - 0x80000000;
            }
        }
        else {
            gbgp0 = new gbgp(this, ibrl0);
        }
        try {
            object0 = gbgp0.a;
            object1 = ibrx.a;
            switch(gbgp0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_32;
                }
            }
        }
        catch(SQLException sQLException0) {
            goto label_35;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            if(!this.k()) {
                SessionEntity sessionEntity0 = this.i(null, null, null);
                gbgp0.d = gblm0;
                gbgp0.c = 1;
                if(this.e.b(sessionEntity0, gbgp0) == object1) {
                    return object1;
                }
                goto label_22;
            label_20:
                gblm0 = gbgp0.d;
                ibnx.b(object0);
            label_22:
                this.f(true);
            }
            gblg gblg0 = this.f;
            gbgp0.d = null;
            gbgp0.c = 2;
            if(gblm0 == null) {
                throw null;
            }
            gblh gblh0 = new gblh(((gbll)gblg0), gblm0);
            return oqj.d(((gbll)gblg0).a, false, true, gblh0, gbgp0) == object1 ? object1 : Boolean.valueOf(true);
        label_32:
            ibnx.b(object0);
            return Boolean.valueOf(true);
        }
        catch(SQLException sQLException0) {
        label_35:
            gbgh gbgh0 = new gbgh(sQLException0);
            gavv.a("BW_SR_02", this.l, gavs.a, gbgh0);
            return Boolean.valueOf(false);
        }
    }

    public final void f(boolean z) {
        ibuq.f(gbgr.a[0], "property");
        this.m.b = z;
    }

    public final void g(String s, Bundle bundle0) {
        ibuq.f(bundle0, "bundle");
        byte[] arr_b = gcur.c(bundle0);
        gblm gblm0 = new gblm(this.b, s, arr_b);
        Map map0 = this.j();
        ibuq.f(bundle0, "<this>");
        new Bundle();
        Bundle bundle1 = bundle0.deepCopy();
        ibuq.e(bundle1, "deepCopy(...)");
        map0.put(s, bundle1);
        gbgq gbgq0 = new gbgq(this, gblm0, null);
        icpu.e(this.d, gbgq0);
    }

    public final int h() {
        if(!this.k()) {
            return 1;
        }
        if(this.b() != null) {
            return 4;
        }
        if(this.c() != null) {
            return this.a() == null ? 2 : 3;
        }
        return 2;
    }

    private final SessionEntity i(String s, Integer integer0, String s1) {
        gaxl.a();
        return new SessionEntity(this.b, s, s1, integer0, System.currentTimeMillis(), System.currentTimeMillis() + Duration.ofSeconds(hzkv.a.b().c()).toMillis());
    }

    private final Map j() {
        Object object0 = this.h.get();
        ibuq.e(object0, "get(...)");
        return (Map)object0;
    }

    private final boolean k() {
        ibuq.f(gbgr.a[0], "property");
        gbgo gbgo0 = this.m;
        if(!gbgo0.a) {
            Object object0 = gbgo0.c.g.get();
            ibuq.e(object0, "get(...)");
            gbgo0.b = ((Boolean)object0).booleanValue();
            gbgo0.a = true;
        }
        boolean z = gbgo0.b;
        Boolean.valueOf(z).getClass();
        return z;
    }
}


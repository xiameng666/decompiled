import android.content.Context;
import android.os.Handler;
import android.os.UserHandle;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class eqln {
    public static final baun a;
    public final cjpc b;
    public final eqle c;
    private final eqlo d;
    private final Context e;

    static {
        eqln.a = new erqc(new String[]{"WorkProfileController"});
    }

    public eqln(Context context0, Handler handler0) {
        eqle eqle0 = new eqle(context0, handler0);
        super();
        this.d = new eqlo(context0);
        this.b = cjqh.a(context0, "smartdevice", "SmartDevice.WorkProfile", 0);
        this.c = eqle0;
        this.e = context0;
    }

    public final evql a(epzc epzc0, epzc epzc1) {
        if(epzc0.b(5) && (hyhe.e() || this.f() == 4)) {
            epzc1.c(6, true);
            return this.b();
        }
        return null;
    }

    public final evql b() {
        eqlo eqlo0 = this.d;
        int v = eqlo0.b();
        evql evql0 = evrg.d("");
        long v1 = bbmq.d(this.e);
        evql evql1 = evrg.d(Long.valueOf(v1));
        if(v == 4) {
            UserHandle userHandle0 = eqlo0.a();
            if(userHandle0 != null) {
                if(hyhe.d()) {
                    evql evql2 = this.c.a(userHandle0);
                    evql evql3 = evql2.g(new eqlg(this)).g(new eqll());
                    evql1 = evql2.g(new eqlh(this));
                    evql0 = evql3;
                }
                else {
                    evql0 = this.c.a(userHandle0).g(new eqli(this)).g(new eqll());
                }
                if(!hyhe.e()) {
                    evql0 = evql0.g(new eqlm());
                }
            }
            return hyhe.d() ? evrg.h(new evql[]{evql0, evql1}).c(new eqlj(evql0, evql1, v1, 4)) : evql0.c(new eqlk(v1, 4));
        }
        return hyhe.d() ? evrg.h(new evql[]{evql0, evql1}).c(new eqlj(evql0, evql1, v1, v)) : evql0.c(new eqlk(v1, v));
    }

    public final evql c() {
        eqln.a.d("getPersistedManagedAccountState() called", new Object[0]);
        String s = cjpd.c(this.b, "name", null);
        int v = gjnf.a(cjpd.a(this.b, "managementMode", 0));
        String s1 = cjpd.c(this.b, "sourceId", null);
        if(v == 0) {
            throw null;
        }
        if(v - 1 != 1) {
            return v - 1 != 2 && v - 1 != 3 && v - 1 != 4 ? evrg.d(new ManagedAccountSetupInfo(s, 0, s1)) : evrg.d(new ManagedAccountSetupInfo(s, 2, s1));
        }
        return evrg.d(new ManagedAccountSetupInfo(s, 1, s1));
    }

    public static String d(long v) {
        byte[] arr_b = bbmq.aa(Long.toString(v), "SHA1");
        if(arr_b != null && arr_b.length >= 2) {
            byte[] arr_b1 = new byte[2];
            arr_b1[1] = arr_b[arr_b.length - 1];
            arr_b1[0] = (byte)(arr_b[arr_b.length - 2] & 3);
            return bboy.c(arr_b1);
        }
        return null;
    }

    public final void e(WorkProfilePayload workProfilePayload0) {
        cjpa cjpa0 = this.b.c();
        cjpa0.h("name", workProfilePayload0.b);
        cjpa0.f("managementMode", workProfilePayload0.c);
        cjpa0.h("sourceId", workProfilePayload0.e);
        if(cjpd.g(cjpa0)) {
            eqln.a.d("Successfully persisted managed account state (mode = %d)", new Object[]{((int)workProfilePayload0.c)});
            return;
        }
        eqln.a.f("Failed to persist managed account state", new Object[0]);
    }

    public final int f() {
        return this.d.b();
    }
}


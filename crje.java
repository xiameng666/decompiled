import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.measurement.AppContextProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class crje extends crqq {
    private String v;
    private long w;
    private Set x;
    private final String y;
    private final ccmg z;

    public crje(crqr crqr0) {
        super(crqr0);
        ccmp ccmp0;
        this.w = -1L;
        this.y = "com.google.android.gms.ads.social.GmsDoritosProvider";
        fpim.e(crqr0.a);
        if(crcn.a(crqr0.a)) {
            if(AppContextProvider.c == null) {
                babh.a();
            }
            ccmp0 = new ccmp();
        }
        else {
            ccmp0 = null;
        }
        this.z = ccmp0;
    }

    @Override  // crqq
    public final String a(String s, long v, crmb crmb0) {
        return crmb0.o() ? this.b(this.y, s, v) : null;
    }

    final String b(String s, String s1, long v) {
        if(this.w < 0L) {
            goto label_3;
        }
        this.av();
        if(SystemClock.elapsedRealtime() > this.w + 120000L) {
            try {
            label_3:
                this.av();
                this.w = SystemClock.elapsedRealtime();
                Class class0 = Class.forName(s);
                Constructor constructor0 = class0.getConstructor(Context.class);
                Future future0 = (Future)class0.getMethod("getDoritosCookieAsynchronously", String.class).invoke(constructor0.newInstance(this.e()), s1);
                batl.s(future0);
                this.v = (String)future0.get(v, TimeUnit.MILLISECONDS);
                return this.v;
            }
            catch(ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | InterruptedException | ClassCastException | ExecutionException | TimeoutException exception0) {
                if(this.x == null) {
                    this.x = new HashSet();
                }
                if(!this.x.contains(s1)) {
                    this.x.add(s1);
                    this.aJ().f.d("Failed to get dsid. appId, exception type, exception", crji.a(s1), crji.a(exception0.getClass().getName()), exception0);
                }
            }
        }
        return this.v;
    }

    @Override  // crqq
    public final void c() {
        ccmg ccmg0 = this.z;
        if(ccmg0 != null) {
            ccmg0.a(bbdg.bR);
        }
    }
}


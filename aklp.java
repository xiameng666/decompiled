import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.UserHandle;
import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import j..util.function.Function.-CC;
import java.io.IOException;
import java.util.function.Function;

public final class aklp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = (int)2;
        if(Build.VERSION.SDK_INT != 34) {
            return object1;
        }
        akrj akrj0 = akrj.f(((UserRestrictionsService)object0));
        String s = akrj0.g();
        if(s != null) {
            Context context0 = akrj0.b;
            if(!"com.google.android.gms".equals(s)) {
                hpwf hpwf0 = hpwf.a;
                if(!hpwf0.b().d().b.contains(s)) {
                    hfuo hfuo0 = hpwf0.b().e().b;
                    if(hfuo0.contains(s) || hfuo0.contains("*")) {
                        try {
                            UserHandle userHandle0 = Process.myUserHandle();
                            bboh bboh0 = akrj.a;
                            ((ggtj)bboh0.h()).B("Fixing user restrictions for %s", userHandle0);
                            PersistableBundle persistableBundle0 = akrj.e(context0, "user_restrictions_recorded");
                            PersistableBundle persistableBundle1 = akrj0.d(userHandle0);
                            int v = akrj0.a(userHandle0, persistableBundle0, persistableBundle1);
                            UserHandle userHandle1 = akrj0.c.getProfileParent(userHandle0);
                            if(userHandle1 != null) {
                                ((ggtj)bboh0.h()).B("Fixing parent user restrictions for %s", userHandle1);
                                v += akrj0.a(userHandle1, persistableBundle0, persistableBundle1);
                            }
                            if(v > 0) {
                                akrj.h(context0, "user_restrictions_fixed", akrj0.d(userHandle0));
                            }
                            return (int)0;
                        }
                        catch(RuntimeException | IOException exception0) {
                            a.ae(UserRestrictionsService.a.i(), "Failed to fix users restrictions", exception0);
                        }
                    }
                }
            }
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}


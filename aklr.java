import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.os.Process;
import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import j..util.function.Function.-CC;
import java.io.IOException;
import java.util.function.Function;

public final class aklr implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        UserRestrictionsService userRestrictionsService0 = (UserRestrictionsService)object0;
        Object object1 = (int)2;
        if(Build.VERSION.SDK_INT != 33 && !userRestrictionsService0.d) {
            return object1;
        }
        try {
            akrj akrj0 = akrj.f(userRestrictionsService0);
            PersistableBundle persistableBundle0 = akrj0.d(Process.myUserHandle());
            akrj.h(akrj0.b, "user_restrictions_recorded", persistableBundle0);
            return (int)0;
        }
        catch(RuntimeException | IOException exception0) {
            a.ae(UserRestrictionsService.a.i(), "Failed to record restriction task.", exception0);
            return object1;
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}


import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

public final class alfg implements Callable {
    public final alfl a;
    public final String b;
    public final Role c;
    public final byte[] d;

    public alfg(alfl alfl0, String s, Role role0, byte[] arr_b) {
        this.a = alfl0;
        this.b = s;
        this.c = role0;
        this.d = arr_b;
    }

    @Override
    public final Object call() {
        akzn akzn0 = this.a.b;
        String s = this.b;
        Role role0 = this.c;
        if(!akzn0.i(s, role0.a())) {
            return Status.d;
        }
        akzu akzu0 = akzn0.d(s, role0.a());
        if(akzu0 == null) {
            return Status.d;
        }
        akzu0.m(this.d, role0.b);
        return Status.b;
    }
}


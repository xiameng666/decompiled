import android.content.Context;
import com.google.android.gms.auth.managed.ui.GenericChimeraActivity;
import j..util.Objects;

final class akph implements acl {
    final akpi a;

    public akph(akpi akpi0) {
        Objects.requireNonNull(akpi0);
        this.a = akpi0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        akpi akpi0 = this.a;
        if(!akpi0.i) {
            akpi0.i = true;
            ((akms)akpi0.h()).d(((GenericChimeraActivity)akpi0));
        }
    }
}


import android.content.Context;
import com.google.android.gms.auth.managed.ui.EmmChimeraActivity;
import j..util.Objects;

final class akpf implements acl {
    final akpg a;

    public akpf(akpg akpg0) {
        Objects.requireNonNull(akpg0);
        this.a = akpg0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        akpg akpg0 = this.a;
        if(!akpg0.A) {
            akpg0.A = true;
            ((akmm)akpg0.h()).K(((EmmChimeraActivity)akpg0));
        }
    }
}


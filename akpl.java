import android.content.Context;
import com.google.android.gms.auth.managed.ui.SetNewPasswordChimeraActivity;
import j..util.Objects;

final class akpl implements acl {
    final akpm a;

    public akpl(akpm akpm0) {
        Objects.requireNonNull(akpm0);
        this.a = akpm0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        akpm akpm0 = this.a;
        if(!akpm0.h) {
            akpm0.h = true;
            ((akpr)akpm0.h()).f(((SetNewPasswordChimeraActivity)akpm0));
        }
    }
}


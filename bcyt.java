import android.content.Context;
import com.google.android.gms.credential.manager.PasswordManagerChimeraActivity;
import j..util.Objects;

final class bcyt implements acl {
    final bcyu a;

    public bcyt(bcyu bcyu0) {
        Objects.requireNonNull(bcyu0);
        this.a = bcyu0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bcyu bcyu0 = this.a;
        if(!bcyu0.p) {
            bcyu0.p = true;
            ((bcys)bcyu0.h()).e(((PasswordManagerChimeraActivity)bcyu0));
        }
    }
}


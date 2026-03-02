import android.content.Context;
import com.google.firebase.auth.UserProfileChangeRequest;

public final class govc extends goua {
    private final String e;
    private final UserProfileChangeRequest f;

    public govc(String s, String s1, goxi goxi0, String s2, UserProfileChangeRequest userProfileChangeRequest0, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "UpdateProfile");
        this.e = s2;
        this.f = userProfileChangeRequest0;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        batl.q(this.e);
        batl.s(this.f);
        gowt gowt0 = new gowt(gowy0, this.f, this.a);
        gowy0.a(this.e, gowt0);
    }
}


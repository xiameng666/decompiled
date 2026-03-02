import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowt implements goxl {
    final UserProfileChangeRequest a;
    final goxa b;
    final gowy c;

    public gowt(gowy gowy0, UserProfileChangeRequest userProfileChangeRequest0, goxa goxa0) {
        this.a = userProfileChangeRequest0;
        this.b = goxa0;
        Objects.requireNonNull(gowy0);
        this.c = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.b.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        goyp goyp0 = new goyp();
        goyp0.d(((GetTokenResponse)object0).b);
        UserProfileChangeRequest userProfileChangeRequest0 = this.a;
        if(userProfileChangeRequest0.c || userProfileChangeRequest0.a != null) {
            String s = userProfileChangeRequest0.a;
            if(s == null) {
                goyp0.f.a.add("DISPLAY_NAME");
            }
            else {
                goyp0.c = s;
            }
        }
        if(userProfileChangeRequest0.d || userProfileChangeRequest0.e != null) {
            String s1 = userProfileChangeRequest0.b;
            if(s1 == null) {
                goyp0.f.a.add("PHOTO_URL");
            }
            else {
                goyp0.d = s1;
            }
        }
        this.c.e(this.b, ((GetTokenResponse)object0), goyp0, this);
    }
}


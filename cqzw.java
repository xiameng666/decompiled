import com.google.android.gms.mdocstore.DisconnectionCause;
import com.google.android.gms.mdocstore.PresentationRequest;
import j..util.Objects;

final class cqzw extends cqxy {
    final azyf a;
    final craf b;

    public cqzw(craf craf0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(craf0);
        this.b = craf0;
        super();
    }

    @Override  // cqxz
    public final void a(DisconnectionCause disconnectionCause0) {
        cqzv cqzv0 = new cqzv(this, disconnectionCause0, this.a);
        this.a.b(cqzv0);
    }

    @Override  // cqxz
    public final void c(String s) {
        cqzt cqzt0 = new cqzt(this, s);
        this.a.b(cqzt0);
    }

    @Override  // cqxz
    public final void d(PresentationRequest presentationRequest0) {
        cqzu cqzu0 = new cqzu(this, presentationRequest0);
        this.a.b(cqzu0);
    }
}


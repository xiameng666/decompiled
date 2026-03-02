import com.google.android.gms.fido.authenticator.autoenroll.FidoEnrollmentPersistentIntentOperation;
import j..util.Objects;

public final class blok implements blop {
    final FidoEnrollmentPersistentIntentOperation a;

    public blok(FidoEnrollmentPersistentIntentOperation fidoEnrollmentPersistentIntentOperation0) {
        Objects.requireNonNull(fidoEnrollmentPersistentIntentOperation0);
        this.a = fidoEnrollmentPersistentIntentOperation0;
        super();
    }

    @Override  // blop
    public final void a(Exception exception0) {
        this.a.b.D(this.a.a, blga.c, blgc.c, 2, exception0);
        this.a.c.countDown();
    }

    @Override  // blop
    public final void b() {
        this.a.b.D(this.a.a, blga.b, blgc.c, 2, null);
        this.a.c.countDown();
    }
}


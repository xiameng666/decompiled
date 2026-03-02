import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ahju implements Consumer {
    public final CredentialPickerChimeraActivity a;

    public ahju(CredentialPickerChimeraActivity credentialPickerChimeraActivity0) {
        this.a = credentialPickerChimeraActivity0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.t.a(bxok.b(202, ((bxoj)object0), this.a.s));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}


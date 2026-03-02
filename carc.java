import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity;

public final class carc implements acn {
    public final KidsAuthSetupChimeraActivity a;

    public carc(KidsAuthSetupChimeraActivity kidsAuthSetupChimeraActivity0) {
        this.a = kidsAuthSetupChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "it");
        cbfc.a((((ActivityResult)object0).a == -1 ? gvka.D : gvka.E));
        this.a.setResult(((ActivityResult)object0).a, ((ActivityResult)object0).b);
        this.a.finish();
    }
}


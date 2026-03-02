import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity;

public final class caqv implements acn {
    public final KidsAuthRemoveAccountChimeraActivity a;

    public caqv(KidsAuthRemoveAccountChimeraActivity kidsAuthRemoveAccountChimeraActivity0) {
        this.a = kidsAuthRemoveAccountChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "it");
        cbfc.a((((ActivityResult)object0).a == -1 ? gvka.P : gvka.Q));
        this.a.setResult(((ActivityResult)object0).a, ((ActivityResult)object0).b);
        this.a.finish();
    }
}


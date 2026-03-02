import androidx.activity.result.ActivityResult;
import com.google.android.gms.googleone.smui.SmuiChimeraActivity;

public final class buij implements acn {
    public final SmuiChimeraActivity a;

    public buij(SmuiChimeraActivity smuiChimeraActivity0) {
        this.a = smuiChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "results");
        if(((ActivityResult)object0).a != -1) {
            ((ggtj)SmuiChimeraActivity.k.j()).x("User failed to authenticate");
        }
        this.a.f();
    }
}


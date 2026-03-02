import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity;

public final class caqj implements acn, ibum {
    final KidsAuthAddAccountChimeraActivity a;

    public caqj(KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity0) {
        this.a = kidsAuthAddAccountChimeraActivity0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, KidsAuthAddAccountChimeraActivity.class, "handleConfirmCredentialsResult", "handleConfirmCredentialsResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof acn) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "p0");
        int v = ((ActivityResult)object0).a;
        if(v == -1) {
            cbfc.a(gvka.as);
        }
        else {
            cbfc.a(gvka.ar);
        }
        this.a.setResult(v, ((ActivityResult)object0).b);
        this.a.finish();
    }
}


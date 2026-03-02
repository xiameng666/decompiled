import androidx.activity.result.ActivityResult;

public final class cbqj implements acn {
    public final cbqn a;

    public cbqj(cbqn cbqn0) {
        this.a = cbqn0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        cbqn cbqn0 = this.a;
        if(((ActivityResult)object0).a == -1 && ((ActivityResult)object0).b != null) {
            cbqn0.y().b();
            cbqn0.z();
            return;
        }
        ((ggtj)cbqn.a.h()).x("No account was chosen, canceling");
        cbqn0.y().b.l(cbqb.j);
    }
}


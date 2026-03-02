import androidx.activity.result.ActivityResult;

public final class epla implements acn {
    public final eplj a;

    public epla(eplj eplj0) {
        this.a = eplj0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).a == -1) {
            xob xob0 = xoc.b(this.a);
            xob0.setResult(-1, ((ActivityResult)object0).b);
            epil.b(xob0);
        }
    }
}


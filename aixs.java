import com.google.android.gms.common.api.Status;

public final class aixs implements gfsi {
    public final aixt a;

    public aixs(aixt aixt0) {
        this.a = aixt0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggtj ggtj0 = (ggtj)((ggtj)aixt.a.j()).s(((Throwable)object0));
        aixt aixt0 = this.a;
        ggtj0.B("Unable to set access for package %s", aixt0.b);
        if((((Throwable)object0) instanceof aiml)) {
            aixt0.b(((aiml)(((Throwable)object0))).a);
            return null;
        }
        aixt0.b(Status.d);
        return null;
    }
}


import com.google.android.gms.common.api.Status;

public final class aiws implements gfsi {
    public final aiwt a;

    public aiws(aiwt aiwt0) {
        this.a = aiwt0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggtj ggtj0 = (ggtj)((ggtj)aiwt.a.j()).s(((Throwable)object0));
        aiwt aiwt0 = this.a;
        ggtj0.B("Unable to clear access for package %s", aiwt0.b);
        if((((Throwable)object0) instanceof aiml)) {
            aiwt0.b(((aiml)(((Throwable)object0))).a);
            return null;
        }
        aiwt0.b(Status.d);
        return null;
    }
}


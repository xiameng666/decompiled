import com.google.android.gms.common.api.Status;

public final class aiwy implements gfsi {
    public final aiwz a;

    public aiwy(aiwz aiwz0) {
        this.a = aiwz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggtj ggtj0 = (ggtj)((ggtj)aiwz.a.j()).s(((Throwable)object0));
        aiwz aiwz0 = this.a;
        ggtj0.B("Unable to get access for package %s", aiwz0.b);
        if((((Throwable)object0) instanceof aiml)) {
            aiwz0.b(((aiml)(((Throwable)object0))).a, 0);
            return null;
        }
        aiwz0.b(Status.d, 0);
        return null;
    }
}


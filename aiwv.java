import com.google.android.gms.common.api.Status;

public final class aiwv implements gfsi {
    public final aiww a;

    public aiwv(aiww aiww0) {
        this.a = aiww0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        a.ae(aiww.a.j(), "Exception during deleteBytes(DeleteBytesRequest)", ((Throwable)object0));
        aiww aiww0 = this.a;
        if((((Throwable)object0) instanceof aiml)) {
            aiww0.b(((aiml)(((Throwable)object0))).a, false);
            return null;
        }
        aiww0.b(Status.d, false);
        return null;
    }
}


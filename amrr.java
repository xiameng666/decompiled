import com.google.android.gms.autofill.data.Credential;

public final class amrr implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggfn ggfn0 = new ggfn();
        ggqj ggqj0 = ((ggfp)object0).om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            Object object2 = ((amnm)object1).a;
            if((object2 instanceof Credential)) {
                String s = ((Credential)object2).a;
                gfsx gfsx0 = aqbh.a(s);
                if(gfsx0.i()) {
                    ggfn0.i(amnm.a(gfsx0.d(), new amnl("chromesync_password", s)));
                }
            }
        }
        return new amqb(ggfn0.h());
    }
}


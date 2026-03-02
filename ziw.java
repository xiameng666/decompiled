import j..util.Objects;
import java.util.Arrays;

final class ziw implements gmbg {
    final aatb a;
    final lqi b;

    public ziw(zix zix0, aatb aatb0, lqi lqi0) {
        this.a = aatb0;
        this.b = lqi0;
        Objects.requireNonNull(zix0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        zix.a.g("Exception while resolving future in OwnerRepositoryImpl - %s", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((foec)object0) == null) {
            lqi lqi0 = this.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatc.a).v_newBuilder();
            String s = this.a.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aatc aatc0 = (aatc)hftp0.b_message;
            s.getClass();
            aatc0.b = s;
            lqi0.l(gfsx.m(((aatc)hftp0.N_build())));
            return;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aatc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aatc aatc1 = (aatc)hftp1.b_message;
        ((foec)object0).a.getClass();
        aatc1.b = ((foec)object0).a;
        String s1 = ((foec)object0).c;
        if(s1 != null && !((foec)object0).a.equals(s1)) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((aatc)hftp1.b_message).c = s1;
        }
        String s2 = ((foec)object0).h;
        if(!bbqr.d(s2)) {
            int v = Arrays.hashCode(new Object[]{s2});
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((aatc)hftp1.b_message).d = v;
        }
        boolean z = ((foec)object0).g;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((aatc)hftp1.b_message).e = z;
        gfsx gfsx0 = gfsx.m(((aatc)hftp1.N_build()));
        this.b.l(gfsx0);
    }
}


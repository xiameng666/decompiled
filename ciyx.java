import j..util.Collection.-EL;
import java.util.HashSet;

public final class ciyx implements ciyn {
    private final HashSet a;
    private final ciyn b;
    private final gged_interceptors c;

    public ciyx() {
        this.a = new HashSet();
        ciym ciym0 = new ciym();
        ciym0.a = "gaia_account";
        this.b = ciym0;
        this.c = ggna.a;
    }

    @Override  // ciyn
    public final ciww a(ProtoLiteMessage hftv0, ciyl ciyl0) {
        try {
            gged_interceptors gged0 = ((ciym)this.b).d(hftv0, ciyl0).a;
            this.a.addAll(gged0);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return this.d();
    }

    @Override  // ciyn
    public final ciww b(ciyl ciyl0) {
        try {
            gged_interceptors gged0 = this.b.b(ciyl0).a;
            this.a.addAll(gged0);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return this.d();
    }

    @Override  // ciyn
    public final ciww c(hfki hfki0) {
        throw null;
    }

    private final ciww d() {
        return new ciww(((gged_interceptors)Collection.-EL.stream(this.c).map(new ciyv(this)).collect(ggaf.a)));
    }

    @Override  // ciyn
    public final void e(String s) {
        ((ciym)this.b).a = s;
    }
}


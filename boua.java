import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public final class boua implements gfsi {
    public final boul a;
    public final Predicate b;
    public final AtomicBoolean c;
    public final hfwn d;
    public final fqys e;

    public boua(boul boul0, Predicate predicate0, AtomicBoolean atomicBoolean0, hfwn hfwn0, fqys fqys0) {
        this.a = boul0;
        this.b = predicate0;
        this.c = atomicBoolean0;
        this.d = hfwn0;
        this.e = fqys0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((fqzl)object0).c == 0x1F) {
            fqys fqys0 = fqys.b(((fqyt)((fqzl)object0).d).c);
            if(fqys0 == null) {
                fqys0 = fqys.a;
            }
            if(this.b.test(fqys0)) {
                hfwn hfwn0 = this.d;
                this.c.set(true);
                gfsx gfsx0 = gfsx.m(hfwn0);
                fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqyt.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((fqyt)hftv0).c = this.e.o;
                ((fqyt)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fqyt fqyt0 = (fqyt)hftp0.b_message;
                hfwn0.getClass();
                fqyt0.d = hfwn0;
                fqyt0.b |= 2;
                if(!fqyg0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fqyg0).ensureMutable();
                }
                fqzl fqzl0 = (fqzl)fqyg0.b_message;
                fqyt fqyt1 = (fqyt)hftp0.N_build();
                fqyt1.getClass();
                fqzl0.d = fqyt1;
                fqzl0.c = 0x1F;
                return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
            }
        }
        return (fqzl)object0;
    }
}


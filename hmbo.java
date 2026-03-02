import java.util.Arrays;
import java.util.List;

public final class hmbo extends hmbi {
    private static final hmgz h;

    static {
        hmbo.h = new hmgz((byte)0x83);
        hmbd.b(((byte)-88), hmbo.class);
    }

    public hmbo() {
        this.e((byte)0x80);
        this.g(0);
        this.h(0);
        this.j();
        this.i(hmgh.b);
    }

    @Override  // hmbi
    protected final hmbe c(byte[] arr_b) {
        return new hmbn(arr_b);
    }

    @Override  // hmbi
    protected final hmbg d() {
        hmdk hmdk0;
        try {
            hmdk0 = hmdk.b(((hmbn)this.e).h());
            this.g.e();
        }
        catch(hmdn | hmdl exception0) {
            this.g.b(exception0, "Invalid Data in GPO C-APDU", new Object[0]);
            throw new hmfn(hmfl.ae);
        }
        catch(hmdm hmdm0) {
            this.g.b(hmdm0, "Bad DOL length in GPO C-APDU", new Object[0]);
            throw new hmfn(hmfl.R);
        }
        hmgz hmgz0 = hmbo.h;
        if(hmdk0.a.q(hmgz0)) {
            if(hmdk0.a() == ((hmbn)this.e).h().length) {
                hmgf hmgf0 = this.f.a;
                hmft hmft0 = (hmft)hmgf0.i;
                hmdi hmdi0 = hmgf0.e;
                List list0 = ((hmgc)hmgf0).a();
                hmbb hmbb0 = this.g;
                hmhf.a(list0);
                hmbb0.e();
                hmgz hmgz1 = hmdk0.c;
                if(hmgw.b(list0) == ((long)hmgz1.b())) {
                    try {
                        int v = 0;
                        for(Object object0: list0) {
                            int v1 = ((hmht)object0).b + v;
                            hmgz hmgz2 = hmgz1.c(v, v1);
                            hmdk hmdk1 = new hmdk(hmgz.e(((hmht)object0).a), hmgz2);
                            this.g.e();
                            hmdi0.m(hmdk1);
                            v = v1;
                        }
                    }
                    catch(hmdl | hmdm | hmdn | RuntimeException exception1) {
                        this.g.b(exception1, "Cannot properly parse/match requested PDOLs with received values", new Object[0]);
                        throw new hmfn(hmfl.ab);
                    }
                    ((hmgc)hmgf0).c = hmgz1;
                    hmcr hmcr0 = hmft0.a ? hmgf0.p.b.c : hmgf0.p.b.b;
                    hmcw hmcw0 = hmcr0.b;
                    if(!((hmft)hmgf0.i).a) {
                        try {
                            if(((long)(((Long)hmdi0.h().a))) == 840L || ((long)(((Long)hmdi0.h().a))) == 0L) {
                                this.g.e();
                                hmda hmda0 = hmgf0.p.a;
                                if(hmda0.i && hmda0.f) {
                                    this.g.e();
                                    try {
                                        hmer hmer0 = hmdi0.i();
                                        if(hmer0.a == null || ((hmgz)hmer0.a).b() == 0 || Arrays.equals(((hmgz)hmer0.a).a, new byte[((hmgz)hmer0.a).b()])) {
                                            hmcw0 = hmcr0.c;
                                            this.g.e();
                                        }
                                    }
                                    catch(hmdp unused_ex) {
                                        hmcw0 = hmcr0.c;
                                        this.g.e();
                                    }
                                }
                            }
                        }
                        catch(hmdp unused_ex) {
                            this.g.e();
                        }
                    }
                    hmbg hmbg0 = new hmbw();
                    hmgz hmgz3 = hmcw0.b;
                    hmbg0.b = hmcw0.a;
                    hmbg0.c = hmgz3;
                    this.f.b.c(hmgh.c);
                    return hmbg0;
                }
                this.g.a("Requested PDOLs length does not match the length of data in C-APDU", new Object[0]);
                throw new hmfn(hmfl.R);
            }
            this.g.a("Input C-APDU contains too much data", new Object[0]);
            throw new hmfn(hmfl.R);
        }
        this.g.a("Input C-APDU does not contain COMMAND_TEMPLATE_TAG %s tag", new Object[]{hmgz0});
        throw new hmfn(hmfl.ab);
    }
}


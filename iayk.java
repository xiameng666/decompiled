import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

public abstract class iayk extends iatv {
    private static final iamn a;
    private static final iaoa b;
    private iapk c;
    private iaof_metadata d;
    private Charset e;
    private boolean f;

    static {
        iayj iayj0 = new iayj();
        iayk.a = iayj0;
        iayk.b = iamo.a(":status", iayj0);
    }

    protected iayk(int v, ibfn ibfn0, ibfu ibfu0) {
        super(v, ibfn0, ibfu0);
        this.e = StandardCharsets.UTF_8;
    }

    protected abstract void c(iapk arg1, boolean arg2, iaof_metadata arg3);

    private static Charset f(iaof_metadata iaof0) {
        String s = (String)iaof0.d(iayh.g);
        if(s != null) {
            try {
                String[] arr_s = s.split("charset=", 2);
                return Charset.forName(arr_s[arr_s.length - 1].trim());
            }
            catch(Exception unused_ex) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    protected final void n(ibdc ibdc0, boolean z) {
        iavr iavr0;
        iapk iapk0 = this.c;
        boolean z1 = false;
        if(iapk0 == null) {
            if(!this.f) {
                ibdc0.close();
                this.c(iapk.p.f("headers not received before payload"), false, new iaof_metadata());
                return;
            }
            int v1 = ibdc0.f();
            boolean z2 = true;
            try {
                if(this.t) {
                    iats.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    goto label_25;
                }
                else {
                    goto label_27;
                }
                goto label_50;
            }
            catch(Throwable throwable0) {
                z1 = true;
                goto label_47;
            }
        label_25:
            ibdc0.close();
            goto label_50;
            try {
            label_27:
                iavr0 = this.j;
            }
            catch(Throwable throwable1) {
                goto label_44;
            }
            try {
                if(!((ibbw)iavr0).b() && !((ibbw)iavr0).f) {
                    ((ibbw)iavr0).d.h(ibdc0);
                    goto label_33;
                }
                else {
                    goto label_41;
                }
                goto label_50;
            }
            catch(Throwable throwable2) {
                try {
                    goto label_38;
                }
                catch(Throwable throwable1) {
                    goto label_44;
                }
            }
            try {
            label_33:
                ((ibbw)iavr0).a();
                goto label_50;
            }
            catch(Throwable throwable3) {
                throwable2 = throwable3;
                z2 = false;
            }
            try {
            label_38:
                if(z2) {
                    ibdc0.close();
                }
                throw throwable2;
            label_41:
                ibdc0.close();
                goto label_50;
            }
            catch(Throwable throwable1) {
                try {
                label_44:
                    this.b(throwable1);
                    goto label_50;
                }
                catch(Throwable throwable0) {
                }
            }
        label_47:
            if(z1) {
                ibdc0.close();
            }
            throw throwable0;
        label_50:
            if(z) {
                this.c = v1 > 0 ? iapk.p.f("Received unexpected EOS on non-empty DATA frame from server") : iapk.p.f("Received unexpected EOS on empty DATA frame from server");
                iaof_metadata iaof0 = new iaof_metadata();
                this.d = iaof0;
                this.l(this.c, false, iaof0);
            }
        }
        else {
            Charset charset0 = this.e;
            gftb.z(charset0, "charset");
            int v = ibdc0.f();
            byte[] arr_b = new byte[v];
            ibdc0.k(arr_b, 0, v);
            this.c = iapk0.b("DATA-----------------------------\n" + new String(arr_b, charset0));
            ibdc0.close();
            if(this.c.u.length() > 1000 || z) {
                this.c(this.c, false, this.d);
            }
        }
    }

    public final void o(iaof_metadata iaof0) {
        iapk iapk0 = this.c;
        if(iapk0 != null) {
            this.c = iapk0.b("headers: " + iaof0.toString());
            return;
        }
        try {
            if(this.f) {
                this.c = iapk.p.f("Received headers twice");
            }
            else {
                Integer integer0 = (Integer)iaof0.d(iayk.b);
                if(integer0 == null || ((int)integer0) < 100 || ((int)integer0) >= 200) {
                    this.f = true;
                    iapk iapk1 = iayk.r(iaof0);
                    this.c = iapk1;
                    if(iapk1 != null) {
                        this.c = iapk1.b("headers: " + iaof0.toString());
                        this.d = iaof0;
                        this.e = iayk.f(iaof0);
                        return;
                    }
                    iayk.q(iaof0);
                    gftb.r(((boolean)(this.t ^ 1)), "Received headers on closed stream");
                    this.p.d();
                    String s = (String)iaof0.d(iayh.d);
                    String s1 = (String)iaof0.d(iayh.b);
                    if(s1 == null) {
                        this.q.c(iaof0);
                    }
                    else {
                        ialu ialu0 = (ialu)this.r.c.get(s1);
                        ialt ialt0 = ialu0 == null ? null : ialu0.a;
                        if(ialt0 == null) {
                            this.b(new iapn(iapk.p.f(String.format("Can\'t find decompressor for %s", s1))));
                        }
                        else {
                            if(ialt0 != ialf.a) {
                                ((ibbw)this.j).c = ialt0;
                            }
                            this.q.c(iaof0);
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            iapk iapk2 = this.c;
            if(iapk2 != null) {
                this.c = iapk2.b("headers: " + iaof0.toString());
                this.d = iaof0;
                this.e = iayk.f(iaof0);
            }
            throw throwable0;
        }
        iapk iapk3 = this.c;
        if(iapk3 != null) {
            this.c = iapk3.b("headers: " + iaof0.toString());
            this.d = iaof0;
            this.e = iayk.f(iaof0);
        }
    }

    public final void p(iaof_metadata iaof0) {
        iapk iapk2;
        iapk iapk0 = this.c;
        if(iapk0 == null && !this.f) {
            iapk0 = iayk.r(iaof0);
            this.c = iapk0;
            if(iapk0 != null) {
                this.d = iaof0;
            }
        }
        if(iapk0 == null) {
            iapk iapk1 = (iapk)iaof0.d(iamp.b);
            if(iapk1 != null) {
                iapk2 = iapk1.f(((String)iaof0.d(iamp.a)));
            }
            else if(this.f) {
                iapk2 = iapk.d.f("missing GRPC status in response");
            }
            else {
                Integer integer0 = (Integer)iaof0.d(iayk.b);
                iapk2 = (integer0 == null ? iapk.p.f("missing HTTP status code") : iayh.a(integer0.intValue())).b("missing GRPC status, inferred error from HTTP status code");
            }
            iayk.q(iaof0);
            if(this.t) {
                iats.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{iapk2, iaof0});
                return;
            }
            this.l(iapk2, false, iaof0);
            return;
        }
        iapk iapk3 = iapk0.b("trailers: " + iaof0.toString());
        this.c = iapk3;
        this.c(iapk3, false, this.d);
    }

    private static void q(iaof_metadata iaof0) {
        iaof0.g(iayk.b);
        iaof0.g(iamp.b);
        iaof0.g(iamp.a);
    }

    private static final iapk r(iaof_metadata iaof0) {
        Integer integer0 = (Integer)iaof0.d(iayk.b);
        if(integer0 == null) {
            return iapk.p.f("Missing HTTP status code");
        }
        String s = (String)iaof0.d(iayh.g);
        if(s != null && s.length() >= 16) {
            String s1 = s.toLowerCase(Locale.US);
            return !s1.startsWith("application/grpc") || s1.length() != 16 && (s1.charAt(16) != 43 && s1.charAt(16) != 59) ? iayh.a(integer0.intValue()).b("invalid content-type: " + s) : null;
        }
        return iayh.a(integer0.intValue()).b("invalid content-type: " + s);
    }
}


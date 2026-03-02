import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;

final class dctm extends ibsl implements ibtw {
    Object a;
    int b;
    final hjjt c;
    final dctq d;
    final String e;
    private Object f;

    public dctm(hjjt hjjt0, dctq dctq0, String s, ibrl ibrl0) {
        this.c = hjjt0;
        this.d = dctq0;
        this.e = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dctm)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dctm(this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    public static final void d(ichm ichm0, String s, dctx dctx0, Exception exception0) {
        Object object0 = ichd.a(ichm0, dctx0);
        if((object0 instanceof icgz)) {
            Throwable throwable0 = icha.b(object0);
            dcvz.a.e().f(throwable0).h("File [%s] - Send channel Failure.", s);
        }
        else {
            ibom ibom0 = (ibom)object0;
            if(exception0 != null) {
                dcvz.a.e().f(exception0).h("File [%s]: An error occurred during transfer.", s);
            }
        }
        if((object0 instanceof icgy)) {
            Throwable throwable1 = icha.b(object0);
            dcvz.a.e().f(throwable1).h("File [%s] - Send channel closed.", s);
        }
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        String s;
        ichm ichm2;
        CancellationException cancellationException1;
        ichm ichm1;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.f;
                dctl dctl0 = new dctl(this.e, ichm0);
                this.c.d(dctl0, 10000, 500);
                try {
                    gmcd gmcd0 = this.c.b();
                    ibuq.e(gmcd0, "send(...)");
                    this.f = ichm0;
                    this.b = 1;
                    object2 = icpu.c(gmcd0, this);
                }
                catch(CancellationException cancellationException0) {
                    ichm1 = ichm0;
                    cancellationException1 = cancellationException0;
                    goto label_76;
                }
                catch(Throwable throwable0) {
                    ichm1 = ichm0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                ichm2 = ichm0;
                object0 = object2;
                goto label_27;
            }
            case 1: {
                ichm2 = (ichm)this.f;
                try {
                    ibnx.b(object0);
                label_27:
                    if(((hjjw)object0).a()) {
                        hjjd hjjd0 = ((hjjw)object0).b;
                        ibuq.e(hjjd0.c, "getResponseBody(...)");
                        Charset charset0 = StandardCharsets.UTF_8;
                        ibuq.e(charset0, "UTF_8");
                        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(hjjd0.c, charset0), 0x2000);
                        try {
                            s = ibtc.a(bufferedReader0);
                        }
                        catch(Throwable throwable1) {
                            ibsx.a(bufferedReader0, throwable1);
                            throw throwable1;
                        }
                        ibsx.a(bufferedReader0, null);
                        cunf cunf0 = dcvz.a.b();
                        String s1 = this.e;
                        cunf0.i("File [%s] : Response received: %s", s1, s);
                        if(hjjd0.a != 200 && hjjd0.a != 201) {
                            dctm.d(ichm2, s1, new dctu(s1, this.c), new hjjv(hjju.f, s));
                            ichm1 = ichm2;
                        }
                        else {
                            this.f = ichm2;
                            this.a = s;
                            this.b = 2;
                            object0 = this.d.b.f(this.d.a, s1, s, this);
                            goto label_60;
                        }
                    }
                    else if(((hjjw)object0).b()) {
                        dctm.d(ichm2, this.e, new dctu(this.e, this.c, ((hjjw)object0).a.a()), ((hjjw)object0).a);
                        ichm1 = ichm2;
                    }
                    else {
                        ichm1 = ichm2;
                    }
                    goto label_73;
                }
                catch(CancellationException cancellationException1) {
                    ichm1 = ichm2;
                    goto label_76;
                }
                catch(Throwable throwable0) {
                    ichm1 = ichm2;
                    break;
                }
            label_60:
                if(object0 == object1) {
                    return object1;
                }
                ichm1 = ichm2;
                object3 = s;
                goto label_67;
            }
            case 2: {
                object3 = this.a;
                ichm1 = (ichm)this.f;
                try {
                    try {
                        ibnx.b(object0);
                    label_67:
                        if(((Boolean)object0).booleanValue()) {
                            dctt dctt0 = new dctt(this.e, this.c, ((String)object3));
                            dctm.d(ichm1, this.e, dctt0, null);
                        }
                        else {
                            dctu dctu0 = new dctu(this.e, this.c);
                            dctm.d(ichm1, this.e, dctu0, new iapl(iapk.p.f(a.a(this.e, "Failed to update sharing upload url for file id ", "."))));
                        }
                    label_73:
                        dcvz.a.b().h("File[%s] : All callbacks propagated, closing channel.", this.e);
                        goto label_82;
                    }
                    catch(CancellationException cancellationException1) {
                    }
                label_76:
                    dctu dctu1 = new dctu(this.e, this.c);
                    dctm.d(ichm1, this.e, dctu1, cancellationException1);
                    goto label_82;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        ichp.a(ichm1);
        throw throwable0;
    label_82:
        ichp.a(ichm1);
        dctk dctk0 = new dctk(this.c);
        this.f = null;
        this.a = null;
        this.b = 3;
        return ichl.b(ichm1, dctk0, this) == object1 ? object1 : ibom.a;
    }
}


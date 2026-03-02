import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import j..util.Objects;

public final class eqak extends cuvg {
    public String a;
    public final eqam b;
    private String c;

    public eqak(eqam eqam0, String s) {
        Objects.requireNonNull(eqam0);
        this.b = eqam0;
        super();
        this.a = s;
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        eqam eqam0 = this.b;
        if(eqam0.i != null && eqam0.i.equals(s)) {
            if(eqam0.p) {
                eqmj eqmj0 = eqam0.g;
                if((eqmj0 instanceof eqyf)) {
                    new eqnf();
                    ((eqyf)eqmj0).f();
                }
            }
            baun baun0 = eqam.b;
            baun0.h("Connection initiated from device: %s (%s)", new Object[]{cuvf0.a, s});
            String s1 = cuvf0.b;
            this.c = s1;
            if(this.a != null) {
                this.f();
                return;
            }
            String s2 = eqng.a(s1, eqam0.m);
            baun0.j(a.a(s2, "Forwarding pin (", ") to bootstrap controller."), new Object[0]);
            VerificationInfo verificationInfo0 = new VerificationInfo(s2, eqam0.m.h);
            if(hyis.p()) {
                verificationInfo0.c = eqam0.t;
                if(eqam0.t && eqam0.m == gjpi.f) {
                    baun0.d("Pin code for fallback: %s", new Object[]{cuvf0.a()});
                    verificationInfo0.a = cuvf0.a();
                }
            }
            eqmj eqmj1 = eqam0.g;
            if(eqmj1 != null) {
                eqmj1.e(verificationInfo0);
            }
            return;
        }
        eqam.b.m("Connection endpoint id (" + s + ") does not match endpoint id we connected with (" + eqam0.i + ")! Skipping.", new Object[0]);
    }

    @Override  // cuvg
    public final void c(String s, cuvl cuvl0) {
        Status status0 = cuvl0.a;
        if(!status0.e()) {
            eqam.b.f("Unsuccessful connection.", new Object[0]);
            eqam.b.m("Status: %s", new Object[]{status0});
            eqam eqam0 = this.b;
            if(eqam0.g == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqoc)hftv0).c = 1;
            ((eqoc)hftv0).b |= 1;
            int v = status0.i;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqoc eqoc0 = (eqoc)hftp0.b_message;
            eqoc0.b |= 2;
            eqoc0.d = v;
            eqoc eqoc1 = (eqoc)hftp0.N_build();
            eqam0.g.d(10584, eqoc1);
            return;
        }
        eqam eqam1 = this.b;
        if(eqam1.i != null && eqam1.i.equals(s)) {
            if(this.a == null) {
                if(hyis.p() && eqam1.t && eqam1.m == gjpi.f) {
                    epxu epxu0 = eqam1.o.a();
                    epxu0.a = true;
                    epxu0.e = true;
                    eqam1.o = epxu0.a();
                    return;
                }
                epxu epxu1 = eqam1.o.a();
                epxu1.a = true;
                eqam1.o = epxu1.a();
                eqam.b.j("Connection complete.", new Object[0]);
                eqgo eqgo0 = new eqgo(eqam1.c, s);
                if(eqam1.g != null) {
                    TargetConnectionArgs targetConnectionArgs0 = new TargetConnectionArgs(eqam1.r, eqam1.s);
                    targetConnectionArgs0.p(eqam1.u);
                    eqam1.g.a(eqgo0, targetConnectionArgs0);
                }
                return;
            }
            epxu epxu2 = eqam1.o.a();
            epxu2.a = true;
            epxu2.d = true;
            eqam1.o = epxu2.a();
            return;
        }
        eqam.b.m("Connection endpoint id (" + s + ") does not match endpoint id we connected with (" + eqam1.i + ")! Skipping.", new Object[0]);
    }

    @Override  // cuvg
    public final void d(String s) {
        this.b.h(s);
    }

    public final void f() {
        eqhi eqhi0 = eqhi.a(2, this.c, bbmu.d(this.a));
        eqam eqam0 = this.b;
        eqam0.k = eqhi0;
        cuvm cuvm0 = eqam0.c;
        if(cuvm0 != null) {
            String s = eqam0.i;
            if(s != null) {
                cuvm0.c(s, new eqmu(eqam0.e, eqam0.y));
            }
        }
    }
}


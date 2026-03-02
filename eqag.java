import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import j..util.Objects;

final class eqag extends cuvg {
    final eqam a;

    public eqag(eqam eqam0) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        eqam eqam0 = this.a;
        if(eqam0.i != null && eqam0.i.equals(s)) {
            if(eqam0.p) {
                eqmj eqmj0 = eqam0.g;
                if((eqmj0 instanceof eqyf)) {
                    new eqnf();
                    ((eqyf)eqmj0).f();
                }
            }
            eqam.b.h("Connection initiated from device: %s (%s)", new Object[]{cuvf0.a, s});
            String s1 = eqng.a(cuvf0.b, eqam0.m);
            eqam.b.j(a.a(s1, "Forwarding pin (", ") to bootstrap controller."), new Object[0]);
            VerificationInfo verificationInfo0 = new VerificationInfo(s1, eqam0.m.h);
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
        eqam eqam0 = this.a;
        if(eqam0.i != null && eqam0.i.equals(s)) {
            Status status0 = cuvl0.a;
            if(status0.e()) {
                epxu epxu0 = eqam0.o.a();
                epxu0.a = true;
                eqam0.o = epxu0.a();
                eqam.b.j("Connection complete.", new Object[0]);
                eqgo eqgo0 = new eqgo(eqam0.c, s);
                eqmj eqmj0 = eqam0.g;
                if(eqmj0 != null) {
                    eqmj0.a(eqgo0, null);
                }
            }
            else {
                eqam.b.f("Unsuccessful connection.", new Object[0]);
                eqam.b.m("Status: %s", new Object[]{status0});
                if(eqam0.g != null) {
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
            }
            return;
        }
        eqam.b.m("Connection endpoint id (" + s + ") does not match endpoint id we connected with (" + eqam0.i + ")! Skipping.", new Object[0]);
    }

    @Override  // cuvg
    public final void d(String s) {
        this.a.h(s);
    }
}


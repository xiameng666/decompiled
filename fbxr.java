import j..util.Objects;

final class fbxr extends fbnw {
    final fbxt a;

    public fbxr(fbxt fbxt0) {
        Objects.requireNonNull(fbxt0);
        this.a = fbxt0;
        super();
    }

    @Override  // fbnw
    public final void K(hcdi hcdi0) {
        hcdj hcdj0;
        getf getf0;
        gete gete0;
        getj getj0 = null;
        if((hcdi0.b & 2) == 0) {
            gete0 = null;
        }
        else {
            gete0 = hcdi0.d == null ? gete.c : hcdi0.d;
        }
        hcdu hcdu0 = hcdu.b(hcdi0.i) == null ? hcdu.a : hcdu.b(hcdi0.i);
        if((hcdi0.b & 4) == 0) {
            getf0 = null;
        }
        else {
            getf0 = hcdi0.e == null ? getf.a : hcdi0.e;
        }
        if((hcdi0.b & 16) == 0) {
            hcdj0 = null;
        }
        else {
            hcdj0 = hcdi0.g == null ? hcdj.a : hcdi0.g;
        }
        hfuo hfuo0 = hcdi0.h;
        if((hcdi0.b & 1) != 0) {
            getj0 = hcdi0.c;
            if(getj0 == null) {
                getj0 = getj.a;
            }
        }
        this.a.ah(gete0, hcdu0, getf0, hcdj0, hfuo0, getj0, true, "onInitializeSetupWizardResponse");
        new fbxu(this.a.getContext()).d(this.a.getContext(), this.a.oc(), hcdi0);
    }

    @Override  // fbnw
    public final void N(hcdm hcdm0) {
        hcdu hcdu0 = hcdu.b(hcdm0.e) == null ? hcdu.a : hcdu.b(hcdm0.e);
        this.a.ah((hcdm0.c == null ? gete.c : hcdm0.c), hcdu0, (hcdm0.d == null ? getf.a : hcdm0.d), null, ggna.a, (hcdm0.b == null ? getj.a : hcdm0.b), false, "onSubmitSetupWizardResponse");
    }

    @Override  // fbnw
    public final void b() {
        this.a.bS(22);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void c() {
        this.a.bS(20);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void f() {
        this.a.bS(21);
        gczm gczm0 = gczm.A(5, 0x7F1535AF, 0x7F1535AE, 1000, 0x7F1508E0);  // string:wallet_uic_network_error_title "No Internet Connection"
        this.a.ci(gczm0);
    }
}


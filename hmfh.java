public final class hmfh extends hmfj {
    public hmfh(hmgz hmgz0) {
        this.b = new hmgz(6);
        int v = hmgz0.a(3);
        ((hmgz)this.b).m(1, ((byte)v));
        this.j(1, 3);
        hmbb hmbb0 = this.c;
        ((hmgz)this.b).h();
        hmbb0.e();
    }

    public final hmgz a() {
        return (hmgz)this.b;
    }

    public final void b(hmgz hmgz0) {
        for(int v = 0; v < ((hmgz)this.b).b(); ++v) {
            this.j(v, hmgz0.a(v));
        }
        hmbb hmbb0 = this.c;
        ((hmgz)this.b).h();
        hmbb0.e();
    }

    public final void c() {
        this.f(0, 7, true);
        this.f(0, 5, true);
        ((hmgz)this.b).h();
        this.c.e();
    }

    public final void d() {
        this.f(3, 5, true);
        ((hmgz)this.b).h();
        this.c.e();
    }

    public final void e(boolean z) {
        if(z) {
            this.f(3, 1, true);
        }
        else {
            this.f(3, 2, true);
        }
        hmbb hmbb0 = this.c;
        ((hmgz)this.b).h();
        hmbb0.e();
    }

    public final void f(int v, int v1, boolean z) {
        int v2 = ((hmgz)this.b).a(v);
        ((hmgz)this.b).m(v, ((byte)(z ? 1 << v1 | v2 : ~(1 << v1) & v2)));
    }

    public final void g() {
        this.j(3, -2);
        this.j(5, -9);
        ((hmgz)this.b).h();
        this.c.e();
    }

    public final boolean h() {
        return (((hmgz)this.b).a(1) & 0x40) != 0;
    }

    public final void i(int v) {
        switch(v - 1) {
            case 0: 
            case 1: {
                this.d();
                return;
            }
            case 2: {
                this.f(0, 2, true);
                hmbb hmbb0 = this.c;
                ((hmgz)this.b).h();
                hmbb0.e();
                this.f(0, 0, true);
                ((hmgz)this.b).h();
                hmbb0.e();
                return;
            }
            case 3: {
                this.f(0, 2, true);
                this.f(3, 4, true);
                hmbb hmbb1 = this.c;
                ((hmgz)this.b).h();
                hmbb1.e();
                return;
            }
            case 5: {
                this.f(0, 2, true);
                hmbb hmbb2 = this.c;
                ((hmgz)this.b).h();
                hmbb2.e();
            }
        }
    }

    private final void j(int v, byte b) {
        hmgz hmgz0 = (hmgz)this.b;
        hmgz0.m(v, ((byte)(b & hmgz0.a(v))));
    }

    @Override
    public final String toString() {
        return "CardVerificationResultsModel";
    }
}


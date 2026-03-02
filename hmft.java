public final class hmft extends hmfv {
    public boolean a;
    private final hmbb b;
    private final hmgc c;

    public hmft(hmgc hmgc0) {
        super(hmgc0);
        this.c = hmgc0;
        this.b = hmhe.a();
    }

    @Override  // hmfv
    public final int a() {
        try {
            hmep hmep0 = this.c.e.h();
            long v = hmgv.a(this.c.p.b.k.a);
            this.d.e();
            return ((long)(((Long)hmep0.a))) != v ? 2 : 1;
        }
        catch(hmdp hmdp0) {
            this.b.b(hmdp0, "Terminal country code not provided in C-APDU", new Object[0]);
            return 3;
        }
        return 2;
    }

    @Override  // hmfv
    public final int b() {
        try {
            hmgc hmgc0 = this.c;
            hmej hmej0 = hmgc0.e.f();
            if(hmgc0.o) {
                hmen hmen0 = hmgc0.e.g();
                if(hmej0.c()) {
                    return 1;
                }
                if(hmen0 != null) {
                    if(!hmen0.d()) {
                        return 5;
                    }
                    if(hmen0.e(5) && hmen0.e(6)) {
                        return 4;
                    }
                    switch(((hmgz)hmen0.a).a(1) & 0xF8) {
                        case 0x20: {
                            return 3;
                        }
                        case 0x40: {
                            return 2;
                        }
                        default: {
                            return 1;
                        }
                    }
                }
                return 5;
            }
            hmdy hmdy0 = hmgc0.e.c();
            if(hmdy0 == null) {
                return 5;
            }
            switch(hmdy0.f()) {
                case 3: {
                    if(hmdy0.e()) {
                        return 2;
                    }
                label_23:
                    if(hmdy0.f() == 4) {
                        return hmdy0.e() ? 3 : 1;
                    }
                    return 1;
                }
                case 7: {
                    return 5;
                }
                default: {
                    goto label_23;
                }
            }
        }
        catch(hmdp hmdp0) {
            this.b.b(hmdp0, "Error retrieving ExpectedUserActionOnPoi. Model not found", new Object[0]);
            return 5;
        }
    }
}


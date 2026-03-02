import j..util.Objects;

public final class fxsv {
    final fxsw a;

    public fxsv(fxsw fxsw0) {
        Objects.requireNonNull(fxsw0);
        this.a = fxsw0;
        super();
    }

    public final void a(int v) {
        fxsw fxsw0 = this.a;
        int v1 = 5;
        int v2 = 3;
        if(hzek.t()) {
            switch(v) {
                case 3: {
                    fxsw0.i(3);
                    break;
                }
                case 4: {
                    fxsw0.i(5);
                    break;
                }
                case 5: {
                    fxsw0.i(4);
                    break;
                }
                case 6: {
                    fxsw0.i(6);
                }
            }
        }
        int v3 = fxsw0.h;
        int v4 = 1;
    alab1:
        switch(v3) {
            case 3: {
                switch(v) {
                    case 2: {
                        fxsw0.h = 2;
                        break alab1;
                    }
                    case 3: {
                        this.b();
                        break alab1;
                    }
                    case 4: {
                        this.c();
                        break alab1;
                    }
                    case 7: {
                        fxts fxts0 = fxsw0.d;
                        if(fxts0.i) {
                            fxsw0.h = 4;
                        }
                        else if(fxts0.j) {
                            fxsw0.h = 6;
                        }
                        break alab1;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            case 4: {
                switch(v) {
                    case 5: {
                        fxsw0.h = 8;
                        break alab1;
                    }
                    case 8: {
                        if(fxsw0.d.f) {
                            v1 = 3;
                        }
                        fxsw0.h = v1;
                        break alab1;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            case 5: {
                if(v == 1) {
                    fxsw0.h = 3;
                }
                else {
                    switch(v) {
                        case 5: {
                            fxsw0.h = 8;
                            break;
                        }
                        case 7: {
                            fxsw0.h = 4;
                        }
                    }
                }
                break;
            }
            case 6: {
                switch(v) {
                    case 6: {
                        fxsw0.h = 9;
                        break alab1;
                    }
                    case 8: {
                        if(!fxsw0.d.f) {
                            v2 = 7;
                        }
                        fxsw0.h = v2;
                        break alab1;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            case 7: {
                switch(v) {
                    case 1: {
                        fxsw0.h = 3;
                        break alab1;
                    }
                    case 6: {
                        fxsw0.h = 9;
                        break alab1;
                    }
                    case 7: {
                        fxsw0.h = 6;
                        break alab1;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            case 2: 
            case 8: 
            case 9: {
                if(v == 1) {
                    fxsw0.h = 3;
                }
                else if(v == 3) {
                    this.b();
                }
                else if(v == 4) {
                    this.c();
                }
                break;
            }
            default: {
                fxqw.f(("Currently in unknown state " + v3));
            }
        }
        if(fxpw.c()) {
            gzuh gzuh0 = fxsw0.b(0L);
            gzuh gzuh1 = fxsw0.d.i();
            if(gzuh1 == null || gzuh0.d != gzuh1.d) {
                goto label_83;
            }
            int v5 = gzue.a(gzuh0.e) == 0 ? 1 : gzue.a(gzuh0.e);
            int v6 = gzue.a(gzuh1.e);
            if(v6 != 0) {
                v4 = v6;
            }
            if(v5 != v4) {
            label_83:
                fxsw0.d(fxsw0.h);
            }
        }
    }

    private final void b() {
        this.a.h = this.a.j() ? 4 : 5;
    }

    private final void c() {
        this.a.h = this.a.j() ? 6 : 7;
    }
}


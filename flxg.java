import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flxg implements gfsi {
    public final AccountContext a;
    public final String b;
    public final flsl c;

    public flxg(AccountContext accountContext0, String s, flsl flsl0) {
        this.a = accountContext0;
        this.b = s;
        this.c = flsl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v2;
        int v = 4;
        int v1 = 0;
        switch(((hnvh)object0).d) {
            case 0: {
                v2 = 2;
                break;
            }
            case 1: {
                v2 = 3;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            case 3: {
                v2 = 5;
                break;
            }
            case 4: {
                v2 = 6;
                break;
            }
            case 5: {
                v2 = 7;
                break;
            }
            case 6: {
                v2 = 8;
                break;
            }
            case 7: {
                v2 = 9;
                break;
            }
            case 8: {
                v2 = 10;
                break;
            }
            case 9: {
                v2 = 11;
                break;
            }
            case 10: {
                v2 = 12;
                break;
            }
            case 11: {
                v2 = 13;
                break;
            }
            case 12: {
                v2 = 14;
                break;
            }
            case 13: {
                v2 = 15;
                break;
            }
            default: {
                v2 = 0;
            }
        }
        if(v2 == 0) {
            v2 = 1;
        }
        flsl flsl0 = this.c;
        String s = this.b;
        AccountContext accountContext0 = this.a;
        switch(v2 - 2) {
            case 1: {
                return new fmdf();
            }
            case 2: {
                return new fmdj();
            }
            case 3: {
                return new fmdp();
            }
            case 4: {
                return new fmdl();
            }
            case 5: {
                return new fmdn();
            }
            case 6: {
                return new fmdm();
            }
            case 7: {
                return ((hnvh)object0).b == 8 ? new fmdg(flwp.a(((hjie)((hnvh)object0).c))) : new fmdg(flwp.a(hjie.a));
            }
            case 8: {
                return ((hnvh)object0).b == 9 ? new fmde(flwp.a(((hjie)((hnvh)object0).c))) : new fmde(flwp.a(hjie.a));
            }
            case 9: {
                if(((hnvh)object0).b == 10) {
                    v1 = (int)(((Integer)((hnvh)object0).c));
                }
                return new fmdk(v1);
            }
            case 10: {
                return ((hnvh)object0).b == 11 ? fmds.b(flbp.c(((hnvi)((hnvh)object0).c).b, new flxq(accountContext0, s, flsl0))) : fmds.b(flbp.c(hnvi.a.b, new flxq(accountContext0, s, flsl0)));
            }
            case 11: {
                if(((hnvh)object0).b == 12) {
                    switch(((int)(((Integer)((hnvh)object0).c)))) {
                        case 0: {
                            v = 2;
                            break;
                        }
                        case 1: {
                            v = 3;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                    if(v == 0) {
                        v = 1;
                    }
                }
                else {
                    v = 2;
                }
                switch(v - 2) {
                    case 1: {
                        return new fmdh(1);
                    }
                    case 2: {
                        return new fmdh(2);
                    }
                    default: {
                        return new fmdh(0);
                    }
                }
            }
            case 12: {
                hnvc hnvc0 = ((hnvh)object0).b == 13 ? ((hnvc)((hnvh)object0).c) : hnvc.a;
                fmha fmha0 = new fmha();
                fmha0.b(hnvc0.b);
                return fmds.a(fmha0.a());
            }
            default: {
                fmai fmai0 = fmaj.a();
                fmai0.g(24);
                fmai0.n(accountContext0.c().f());
                fmai0.o(accountContext0.d().toStringUtf8());
                fmai0.p(s);
                fmai0.f(0x74);
                flsl0.b(fmai0.a());
                return new fmdq();
            }
        }
    }
}


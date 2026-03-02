public final class rhc {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l;
    private String m;
    private String n;
    private String o;
    private byte p;

    public final rhd a() {
        if(this.p == 3) {
            String s = this.b;
            if(s != null) {
                String s1 = this.c;
                if(s1 != null) {
                    String s2 = this.d;
                    if(s2 != null) {
                        String s3 = this.e;
                        if(s3 != null) {
                            String s4 = this.f;
                            if(s4 != null) {
                                String s5 = this.g;
                                if(s5 != null) {
                                    String s6 = this.h;
                                    if(s6 != null) {
                                        String s7 = this.i;
                                        if(s7 != null) {
                                            String s8 = this.j;
                                            if(s8 != null) {
                                                String s9 = this.k;
                                                if(s9 != null) {
                                                    String s10 = this.m;
                                                    if(s10 != null) {
                                                        String s11 = this.n;
                                                        if(s11 != null) {
                                                            String s12 = this.o;
                                                            if(s12 != null) {
                                                                return new rhd(this.a, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, this.l, s10, s11, s12);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.p & 1) == 0) {
            stringBuilder0.append(" configurationVersion");
        }
        if(this.b == null) {
            stringBuilder0.append(" entitlementVersion");
        }
        if(this.c == null) {
            stringBuilder0.append(" authenticationToken");
        }
        if(this.d == null) {
            stringBuilder0.append(" temporaryToken");
        }
        if(this.e == null) {
            stringBuilder0.append(" terminalId");
        }
        if(this.f == null) {
            stringBuilder0.append(" terminalVendor");
        }
        if(this.g == null) {
            stringBuilder0.append(" terminalModel");
        }
        if(this.h == null) {
            stringBuilder0.append(" terminalSoftwareVersion");
        }
        if(this.i == null) {
            stringBuilder0.append(" appName");
        }
        if(this.j == null) {
            stringBuilder0.append(" appVersion");
        }
        if(this.k == null) {
            stringBuilder0.append(" notificationToken");
        }
        if((this.p & 2) == 0) {
            stringBuilder0.append(" notificationAction");
        }
        if(this.m == null) {
            stringBuilder0.append(" acceptContentType");
        }
        if(this.n == null) {
            stringBuilder0.append(" boostType");
        }
        if(this.o == null) {
            stringBuilder0.append(" gid1");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null acceptContentType");
        }
        this.m = s;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null appName");
        }
        this.i = s;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null appVersion");
        }
        this.j = s;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null authenticationToken");
        }
        this.c = s;
    }

    public final void f(String s) {
        if(s == null) {
            throw new NullPointerException("Null boostType");
        }
        this.n = s;
    }

    public final void g(int v) {
        this.a = v;
        this.p = (byte)(this.p | 1);
    }

    public final void h(String s) {
        if(s == null) {
            throw new NullPointerException("Null entitlementVersion");
        }
        this.b = s;
    }

    public final void i(String s) {
        if(s == null) {
            throw new NullPointerException("Null gid1");
        }
        this.o = s;
    }

    public final void j(int v) {
        this.l = v;
        this.p = (byte)(this.p | 2);
    }

    public final void k(String s) {
        if(s == null) {
            throw new NullPointerException("Null notificationToken");
        }
        this.k = s;
    }

    public final void l(String s) {
        if(s == null) {
            throw new NullPointerException("Null temporaryToken");
        }
        this.d = s;
    }

    public final void m(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalId");
        }
        this.e = s;
    }

    public final void n(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalModel");
        }
        this.g = s;
    }

    public final void o(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalSoftwareVersion");
        }
        this.h = s;
    }

    public final void p(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalVendor");
        }
        this.f = s;
    }
}


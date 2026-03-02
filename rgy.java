public final class rgy {
    private String A;
    private byte B;
    public String a;
    public String b;
    public String c;
    public String d;
    private String e;
    private int f;
    private gged_interceptors g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private gged_interceptors s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public final rgz a() {
        if(this.B == 1) {
            String s = this.e;
            if(s != null) {
                String s1 = this.a;
                if(s1 != null) {
                    String s2 = this.b;
                    if(s2 != null) {
                        gged_interceptors gged0 = this.g;
                        if(gged0 != null) {
                            String s3 = this.h;
                            if(s3 != null) {
                                String s4 = this.i;
                                if(s4 != null) {
                                    String s5 = this.j;
                                    if(s5 != null) {
                                        String s6 = this.k;
                                        if(s6 != null) {
                                            String s7 = this.l;
                                            if(s7 != null) {
                                                String s8 = this.m;
                                                if(s8 != null) {
                                                    String s9 = this.n;
                                                    if(s9 != null) {
                                                        String s10 = this.o;
                                                        if(s10 != null) {
                                                            String s11 = this.p;
                                                            if(s11 != null) {
                                                                String s12 = this.q;
                                                                if(s12 != null) {
                                                                    String s13 = this.r;
                                                                    if(s13 != null) {
                                                                        gged_interceptors gged1 = this.s;
                                                                        if(gged1 != null) {
                                                                            String s14 = this.t;
                                                                            if(s14 != null) {
                                                                                String s15 = this.u;
                                                                                if(s15 != null) {
                                                                                    String s16 = this.v;
                                                                                    if(s16 != null) {
                                                                                        String s17 = this.w;
                                                                                        if(s17 != null) {
                                                                                            String s18 = this.c;
                                                                                            if(s18 != null) {
                                                                                                String s19 = this.x;
                                                                                                if(s19 != null) {
                                                                                                    String s20 = this.y;
                                                                                                    if(s20 != null) {
                                                                                                        String s21 = this.d;
                                                                                                        if(s21 != null) {
                                                                                                            String s22 = this.z;
                                                                                                            if(s22 != null) {
                                                                                                                String s23 = this.A;
                                                                                                                if(s23 != null) {
                                                                                                                    return new rgz(s, this.f, s1, s2, gged0, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, gged1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
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
        if(this.e == null) {
            stringBuilder0.append(" operation");
        }
        if(this.B == 0) {
            stringBuilder0.append(" operationType");
        }
        if(this.a == null) {
            stringBuilder0.append(" ipv6Address");
        }
        if(this.b == null) {
            stringBuilder0.append(" ipv4Address");
        }
        if(this.g == null) {
            stringBuilder0.append(" operationTargets");
        }
        if(this.h == null) {
            stringBuilder0.append(" companionTerminalId");
        }
        if(this.i == null) {
            stringBuilder0.append(" companionTerminalVendor");
        }
        if(this.j == null) {
            stringBuilder0.append(" companionTerminalModel");
        }
        if(this.k == null) {
            stringBuilder0.append(" companionTerminalSoftwareVersion");
        }
        if(this.l == null) {
            stringBuilder0.append(" companionTerminalFriendlyName");
        }
        if(this.m == null) {
            stringBuilder0.append(" companionTerminalService");
        }
        if(this.n == null) {
            stringBuilder0.append(" companionTerminalIccid");
        }
        if(this.o == null) {
            stringBuilder0.append(" companionTerminalEid");
        }
        if(this.p == null) {
            stringBuilder0.append(" terminalIccid");
        }
        if(this.q == null) {
            stringBuilder0.append(" terminalEid");
        }
        if(this.r == null) {
            stringBuilder0.append(" targetTerminalId");
        }
        if(this.s == null) {
            stringBuilder0.append(" targetTerminalIds");
        }
        if(this.t == null) {
            stringBuilder0.append(" targetTerminalIccid");
        }
        if(this.u == null) {
            stringBuilder0.append(" targetTerminalEid");
        }
        if(this.v == null) {
            stringBuilder0.append(" targetTerminalSerialNumber");
        }
        if(this.w == null) {
            stringBuilder0.append(" targetTerminalModel");
        }
        if(this.c == null) {
            stringBuilder0.append(" targetTerminalEntitlementProtocol");
        }
        if(this.x == null) {
            stringBuilder0.append(" oldTerminalId");
        }
        if(this.y == null) {
            stringBuilder0.append(" oldTerminalIccid");
        }
        if(this.d == null) {
            stringBuilder0.append(" oldTerminalEntitlementProtocol");
        }
        if(this.z == null) {
            stringBuilder0.append(" messageResponse");
        }
        if(this.A == null) {
            stringBuilder0.append(" messageButton");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalEid");
        }
        this.o = s;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalFriendlyName");
        }
        this.l = s;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalIccid");
        }
        this.n = s;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalId");
        }
        this.h = s;
    }

    public final void f(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalModel");
        }
        this.j = s;
    }

    public final void g(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalService");
        }
        this.m = s;
    }

    public final void h(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalSoftwareVersion");
        }
        this.k = s;
    }

    public final void i(String s) {
        if(s == null) {
            throw new NullPointerException("Null companionTerminalVendor");
        }
        this.i = s;
    }

    public final void j(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageButton");
        }
        this.A = s;
    }

    public final void k(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageResponse");
        }
        this.z = s;
    }

    public final void l(String s) {
        if(s == null) {
            throw new NullPointerException("Null oldTerminalIccid");
        }
        this.y = s;
    }

    public final void m(String s) {
        if(s == null) {
            throw new NullPointerException("Null oldTerminalId");
        }
        this.x = s;
    }

    public final void n(String s) {
        if(s == null) {
            throw new NullPointerException("Null operation");
        }
        this.e = s;
    }

    public final void o(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null operationTargets");
        }
        this.g = gged0;
    }

    public final void p(int v) {
        this.f = v;
        this.B = 1;
    }

    public final void q(String s) {
        if(s == null) {
            throw new NullPointerException("Null targetTerminalEid");
        }
        this.u = s;
    }

    public final void r(String s) {
        if(s == null) {
            throw new NullPointerException("Null targetTerminalIccid");
        }
        this.t = s;
    }

    public final void s(String s) {
        if(s == null) {
            throw new NullPointerException("Null targetTerminalId");
        }
        this.r = s;
    }

    public final void t(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null targetTerminalIds");
        }
        this.s = gged0;
    }

    public final void u(String s) {
        if(s == null) {
            throw new NullPointerException("Null targetTerminalModel");
        }
        this.w = s;
    }

    public final void v(String s) {
        if(s == null) {
            throw new NullPointerException("Null targetTerminalSerialNumber");
        }
        this.v = s;
    }

    public final void w(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalEid");
        }
        this.q = s;
    }

    public final void x(String s) {
        if(s == null) {
            throw new NullPointerException("Null terminalIccid");
        }
        this.p = s;
    }
}


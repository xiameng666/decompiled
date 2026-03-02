public final class ehxe implements lqj {
    public final ehxh a;

    public ehxe(ehxh ehxh0) {
        this.a = ehxh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ehws ehws0 = new ehws(null);
        int v = ((ehwq)object0).f;
        if(v == 0) {
            throw null;
        }
        ehxh ehxh0 = this.a;
        if(v - 1 == 0) {
            ehws0.b(ehwt.a);
            ehxh0.d = gfqx.a;
        }
        else {
            switch(v - 1) {
                case 1: {
                label_9:
                    gfsx gfsx0 = ((ehwq)object0).d;
                    if(!gfsx0.i()) {
                        return;
                    }
                    if(ehxh0.b) {
                        ehxh0.c.removeCallbacksAndMessages(null);
                        ehxh0.b = false;
                    }
                    if(v != 4) {
                    label_19:
                        switch(v) {
                            case 2: {
                            label_21:
                                gfsx gfsx1 = ((ehwq)object0).c;
                                gfsx gfsx2 = gfsx0.i() ? gfsx.m(ehwr.a(((Float)gfsx0.d()).floatValue(), ehxh0.d)) : gfqx.a;
                                ehws0.b(ehwt.b);
                                ehws0.c(gfsx1);
                                ehws0.a = gfsx0.b(new ehxg());
                                ehws0.b = gfqx.a;
                                ehws0.c = gfsx2;
                                ehxh0.d = gfsx2;
                                break;
                            }
                            case 4: {
                                ehxh0.g();
                                ehwt ehwt0 = ehxh0.e();
                                ehwt ehwt1 = ehwt.a;
                                if(ehwt0 == ehwt1) {
                                    return;
                                }
                                if(ehxh0.e() == ehwt.e) {
                                    ehws0.b(ehwt1);
                                    break;
                                }
                            }
                        }
                    }
                    else if(ehxh0.e() == ehwt.b) {
                        ehxh0.f();
                        goto label_21;
                    }
                    else {
                        v = 4;
                        goto label_19;
                    }
                    break;
                }
                case 2: {
                    gfsx gfsx3 = ((ehwq)object0).b;
                    if(gfsx3.i() && ((int)(((Integer)gfsx3.d()))) == 19) {
                        ehxh0.f();
                        return;
                    }
                    ehxh0.g();
                    ehws0.b(ehwt.a);
                    ehxh0.d = gfqx.a;
                    break;
                }
                default: {
                    if(v - 1 != 3) {
                        ehws0.b(ehwt.d);
                        break;
                    }
                    goto label_9;
                }
            }
        }
        ehwv ehwv0 = ehws0.a();
        ehxh0.a.l(ehwv0);
    }
}


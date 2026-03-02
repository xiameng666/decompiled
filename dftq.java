import android.accounts.Account;

public final class dftq implements gfsi {
    public final dfud a;
    public final Account b;
    public final boolean c;
    public final dcpv d;

    public dftq(dfud dfud0, Account account0, boolean z, dcpv dcpv0) {
        this.a = dfud0;
        this.b = account0;
        this.c = z;
        this.d = dcpv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Contact book update: %s.", ((dgbe)object0).a);
        int v = ((dgbe)object0).a.ordinal();
        dfud dfud0 = this.a;
        dcpv dcpv0 = this.d;
        boolean z = false;
        boolean z1 = true;
        switch(v) {
            case 1: {
                if(hvqz.k()) {
                    dcpn dcpn1 = dfud0.i;
                    if(dcpn1 != null) {
                        cunf0.b().p("User Added Contact.", new Object[0]);
                        boolean z4 = ((dgbe)object0).c;
                        boolean z5 = ((dgbe)object0).d;
                        ProtoLiteBuilder hftp2 = dcpt.L(24);
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gyqd.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp3.b_message;
                        ((gyqd)hftv1).b |= 1;
                        ((gyqd)hftv1).c = z4;
                        if(!hftv1.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gyqd gyqd0 = (gyqd)hftp3.b_message;
                        gyqd0.b |= 2;
                        gyqd0.d = z5;
                        gyqd gyqd1 = (gyqd)hftp3.N_build();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gysp gysp1 = (gysp)hftp2.b_message;
                        gyqd1.getClass();
                        gysp1.y = gyqd1;
                        gysp1.b |= 0x1000000;
                        dcpn1.i(new dcow(((gysp)hftp2.N_build())));
                    }
                }
                z = true;
                break;
            }
            case 2: {
                dfud0.c(dcpv0);
                z = true;
                break;
            }
            default: {
                if(v == 3) {
                    if(hvqz.k()) {
                        dcpn dcpn0 = dfud0.i;
                        if(dcpn0 != null) {
                            cunf0.b().p("User Removed Contact.", new Object[0]);
                            boolean z2 = ((dgbe)object0).e;
                            boolean z3 = ((dgbe)object0).f;
                            ProtoLiteBuilder hftp0 = dcpt.L(25);
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrn.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((gyrn)hftv0).b |= 1;
                            ((gyrn)hftv0).c = z2;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gyrn gyrn0 = (gyrn)hftp1.b_message;
                            gyrn0.b |= 2;
                            gyrn0.d = z3;
                            gyrn gyrn1 = (gyrn)hftp1.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gysp gysp0 = (gysp)hftp0.b_message;
                            gyrn1.getClass();
                            gysp0.z = gyrn1;
                            gysp0.b |= 0x2000000;
                            dcpn0.i(new dcow(((gysp)hftp0.N_build())));
                        }
                    }
                    dfud0.c(dcpv0);
                    z = true;
                }
            }
        }
        boolean z6 = this.c;
        Account account0 = this.b;
        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)((dgbe)object0).b).jf(5, null);
        hftp4.X(((ProtoLiteMessage)((dgbe)object0).b));
        dfty dfty0 = dfty.b;
        if(z || z6 || dfud0.b.W(account0)) {
            dfty0 = dfud0.a(account0, ((dbxw)hftp4), dcpv0);
            cunf0.b().h("Check contacts reachability: %s.", dfty0);
        }
        if(z || dfty0 == dfty.c || z6 || !dfud0.b.S(account0)) {
            z1 = dfud0.f(account0, ((dbxx)((ProtoLiteBuilder)(((dbxw)hftp4))).N_build()), dcpv0);
            dfud0.b.I(account0, z1);
        }
        return Boolean.valueOf(z1);
    }
}


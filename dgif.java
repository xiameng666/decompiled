import java.util.List;

public final class dgif {
    private final dggg a;
    private final dgih b;
    private final boolean c;
    private final dgia d;
    private final dghz e;

    public dgif(dghz dghz0, dggg dggg0, dgih dgih0, boolean z, dgia dgia0) {
        ibuq.f(dgia0, "transport");
        super();
        this.e = dghz0;
        this.a = dggg0;
        this.b = dgih0;
        this.c = z;
        this.d = dgia0;
    }

    public final Object a(List list0, ibrl ibrl0) {
        Object object3;
        dgfp dgfp0;
        boolean z2;
        Object object2;
        List list5;
        List list3;
        dgie dgie0;
        List list1 = list0;
        if((ibrl0 instanceof dgie)) {
            dgie0 = (dgie)ibrl0;
            int v = dgie0.d;
            if((v & 0x80000000) == 0) {
                dgie0 = new dgie(this, ibrl0);
            }
            else {
                dgie0.d = v - 0x80000000;
            }
        }
        else {
            dgie0 = new dgie(this, ibrl0);
        }
        Object object0 = dgie0.b;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(dgie0.d) {
            case 0: {
                ibnx.b(object0);
                dgia dgia0 = this.d;
                dghz dghz0 = this.e;
                ibuq.f(list1, "token");
                dcpv dcpv0 = dcpw.a(new dghr(dghz0));
                dghp dghp0 = dghz0.a;
                byte[] arr_b = ibpo.aC(ibpo.ak(ibpo.b(Byte.valueOf(dghv.b(dghp0))), list1));
                dgah dgah0 = dghz0.b;
                byte[] arr_b1 = dgah0.l(arr_b, dcpv0);
                ibuq.e(arr_b1, "signWithPairedKey(...)");
                List list2 = ibpg.J(arr_b1);
                dggg dggg0 = this.a;
                if(dggg0 == null) {
                    list3 = ibpg.J(dizs.e(6));
                }
                else {
                    ibuq.f(list1, "rawAuthToken");
                    list3 = dghv.a(list1, ibpg.J(ibpo.aC(dggg0.c)));
                }
                ibuq.f(list1, "token");
                List list4 = null;
                if(dghp0 != dghp.a && dghz0.c.c().toMillis() - dghz0.d <= hvqs.ap()) {
                    dcpv dcpv1 = dcpw.a(new dghq(dghz0));
                    byte[] arr_b2 = dgah0.m(ibpo.aC(ibpo.ak(ibpo.b(Byte.valueOf(dghv.b(dghp0))), list1)), dcpv1);
                    ibuq.e(arr_b2, "signWithPreviousPairedKey(...)");
                    list5 = ibpg.J(arr_b2);
                }
                else {
                    list5 = null;
                }
                dgih dgih0 = this.b;
                if(dgih0 != null) {
                    list4 = dgih0.a(list1);
                }
                dgfn dgfn0 = new dgfn(list2, list5, list3, list4);
                dgie0.a = list1;
                dgie0.d = 1;
                if(dgia0.c(dgfn0, dgie0) == object1) {
                    return object1;
                }
                goto label_51;
            }
            case 1: {
                list1 = (List)dgie0.a;
                ibnx.b(object0);
            label_51:
                dgie0.a = list1;
                dgie0.d = 2;
                object0 = this.d.a(dgie0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_58;
            }
            case 2: {
                list1 = (List)dgie0.a;
                ibnx.b(object0);
            label_58:
                if(((dgfn)object0) != null) {
                    dggg dggg1 = this.a;
                    int v1 = this.b == null ? 1 : 0;
                    List list6 = ((dgfn)object0).d;
                    boolean z1 = this.b == null || list6 == null ? false : this.b.b(list1, list6);
                    if(!this.c && !z1) {
                        cunf cunf0 = dcvz.a.e();
                        if(list6 == null) {
                            z = false;
                        }
                        cunf0.i("QR Code verification failed: hasQrCodeAuthenticator=%b, hasQrCodeHandshakeData=%b", Boolean.valueOf(((boolean)(v1 ^ 1))), Boolean.valueOf(z));
                        object2 = new dgib(dgfo.a, false);
                    }
                    else if(dggg1 == null) {
                        object2 = new dgib(dgfq.a, z1);
                    }
                    else {
                        dghz dghz1 = this.e;
                        List list7 = ((dgfn)object0).c;
                        ibuq.f(list7, "keyHash");
                        ibuq.f(list1, "rawAuthToken");
                        if(list7.size() == 6) {
                            dcpv dcpv2 = dcpw.a(new dght(dghz1));
                            dgah dgah1 = dghz1.b;
                            dbwu dbwu0 = dgah1.c(dcpv2);
                            if(dbwu0 == null) {
                                z2 = false;
                            }
                            else {
                                ByteString hfsf0 = dbwu0.e;
                                ibuq.e(hfsf0, "getAuthenticityKey(...)");
                                if(ibuq.m(dghv.a(list1, ibpo.ar(hfsf0)), list7)) {
                                    z2 = true;
                                }
                                else if(dghz1.a != dghp.a && dghz1.c.c().toMillis() - dghz1.d <= hvqs.ap()) {
                                    dbwu dbwu1 = dgah1.b(dcpv2);
                                    if(dbwu1 == null) {
                                        z2 = false;
                                    }
                                    else {
                                        ByteString hfsf1 = dbwu1.e;
                                        ibuq.e(hfsf1, "getAuthenticityKey(...)");
                                        z2 = ibuq.m(dghv.a(list1, ibpo.ar(hfsf1)), list7);
                                    }
                                }
                                else {
                                    z2 = false;
                                }
                            }
                        }
                        else {
                            z2 = false;
                        }
                        List list8 = ((dgfn)object0).b;
                        boolean z3 = dghz1.c(list1, ((dgfn)object0).a, dggg1) || list8 != null && dghz1.c(list1, list8, dggg1);
                        if(!z2) {
                            dgfp0 = z3 ? dgfq.a : dgfo.a;
                        }
                        else if(z3) {
                            dgfp0 = new dgfp(gzad.b);
                        }
                        else {
                            dgfp0 = dgfo.a;
                        }
                        object2 = new dgib(dgfp0, z1);
                    }
                    dgfr dgfr0 = object2.a;
                    if(ibuq.m(dgfr0, dgfo.a)) {
                        return object2;
                    }
                    dgie0.a = object2;
                    dgie0.d = 3;
                    if(this.d.d(dgfr0, dgie0) != object1) {
                        goto label_123;
                    }
                    return object1;
                }
                break;
            }
            case 3: {
                object2 = (dgib)dgie0.a;
                ibnx.b(object0);
            label_123:
                dgie0.a = object2;
                dgie0.d = 4;
                object0 = this.d.b(dgie0);
                if(object0 != object1) {
                    object3 = object2;
                    goto label_132;
                }
                return object1;
            }
            case 4: {
                object3 = (dgib)dgie0.a;
                ibnx.b(object0);
            label_132:
                if(((dgfr)object0) != null) {
                    if(!(object3.a instanceof dgfp) || !(((dgfr)object0) instanceof dgfp)) {
                        return ibuq.m(((dgfr)object0), dgfo.a) ? new dgib(dgfo.a, object3.b) : new dgib(dgfq.a, object3.b);
                    }
                    return new dgib(((dgfr)object0), object3.b);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return dgic.a;
    }
}


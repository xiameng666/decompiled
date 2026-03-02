import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebwt implements ibts {
    public final ebxe a;
    public final AccountInfo b;
    public final dymw c;
    public final dycl d;
    public final long e;
    public final ebxd f;

    public ebwt(ebxd ebxd0, ebxe ebxe0, AccountInfo accountInfo0, dymw dymw0, dycl dycl0, long v) {
        this.f = ebxd0;
        this.a = ebxe0;
        this.b = accountInfo0;
        this.c = dymw0;
        this.d = dycl0;
        this.e = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ebxe ebxe0 = this.a;
        AccountInfo accountInfo0 = this.b;
        dymw dymw0 = this.c;
        dycl dycl0 = this.d;
        byte[] arr_b = (byte[])object0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((dyfy)hftv0), "parseFrom(...)");
            int v = dyif.a((((dyfy)hftv0).b == 8 ? ((dyig)((dyfy)hftv0).c) : dyig.a).b);
            if(v == 0) {
                throw null;
            }
            ebxd ebxd0 = this.f;
            switch(v - 1) {
                case 0: {
                    dymw dymw1 = ebxd0.a;
                    if(dymw1.b == 1) {
                        ebxd0.b.n(ebxd0.c, dymw1, ebxd0.d);
                    }
                    if(dymw1.b == 2) {
                        ebxd0.b.m(ebxd0.c, dymw1, ebxd0.d);
                    }
                    break;
                }
                case 1: {
                    ebxd0.a();
                    ebst ebst0 = ebxe0.d();
                    ibuq.e(accountInfo0.b, "getAccountName(...)");
                    ebst0.a(accountInfo0.b, 0x319FA);
                    break;
                }
                case 2: {
                    ebxd0.a();
                    ebst ebst1 = ebxe0.d();
                    ibuq.e(accountInfo0.b, "getAccountName(...)");
                    ebst1.a(accountInfo0.b, 0x319F9);
                    break;
                }
                default: {
                    if(v - 1 != 3) {
                        throw new ibnq();
                    }
                    ((ggtj)ebxe.a.j()).x("Status not set in MfiSignInAndInitializeChipResponse");
                    ebxe0.l(accountInfo0, dymw0, dycl0);
                }
            }
            long v1 = this.e;
            if(v1 >= 1L) {
                ebst ebst2 = ebxe0.d();
                ibuq.e(accountInfo0.b, "getAccountName(...)");
                ebst.e(ebst2, accountInfo0.b, 0x379A3, v1, 15, 16);
                return ibom.a;
            }
        }
        catch(hfur hfur0) {
            a.ae(ebxe.a.i(), "Failed to parse EmoneyCardOperationResponse", hfur0);
            ebxe0.l(accountInfo0, dymw0, dycl0);
        }
        return ibom.a;
    }
}


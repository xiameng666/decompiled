import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class duog extends lsb implements lom {
    public final frxj a;
    public final String b;
    public final dtze c;
    public String d;
    public static final int e;
    private static final bboh f;
    private final cqxc g;
    private final edse h;
    private final azts i;

    static {
        duog.f = bboh.b("Pay", bbcu.cZ);
    }

    public duog(String s, azts azts0, cqxc cqxc0, edse edse0, dtze dtze0) {
        this.a = new frxj(new duob(null));
        this.b = s;
        this.i = azts0;
        this.g = cqxc0;
        this.h = edse0;
        this.c = dtze0;
    }

    public final duob a() {
        return (duob)this.a.a();
    }

    public final Object b(ibrl ibrl0) {
        Object object3;
        Object object2;
        duof duof0;
        if((ibrl0 instanceof duof)) {
            duof0 = (duof)ibrl0;
            int v = duof0.c;
            if((v & 0x80000000) == 0) {
                duof0 = new duof(this, ibrl0);
            }
            else {
                duof0.c = v - 0x80000000;
            }
        }
        else {
            duof0 = new duof(this, ibrl0);
        }
        Object object0 = duof0.a;
        Object object1 = ibrx.a;
        switch(duof0.c) {
            case 0: {
                ibnx.b(object0);
                azts azts0 = this.i;
                ftcf ftcf0 = ftce.a(((ProtoLiteMessage)ftcd.a).v_newBuilder());
                ftcf0.b(this.b);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fthb.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((fthb)hftv0), "value");
                ProtoLiteBuilder hftp1 = ftcf0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftcd ftcd0 = (ftcd)hftp1.b_message;
                ((fthb)hftv0).getClass();
                ftcd0.d = (fthb)hftv0;
                ftcd0.c = 9;
                evql evql0 = azts0.bc(ftcf0.a().toBytesArray());
                duof0.c = 1;
                object2 = fsdk.a(evql0, duof0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_36;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_36:
                if((object2 instanceof ibnv)) {
                    a.ae(duog.f.i(), "Refresh status failed", ibnw.a(object2));
                    return ibom.a;
                }
                cqxc cqxc0 = this.g;
                String s = this.d;
                if(s == null) {
                    ibuq.j("provisioningId");
                    s = null;
                }
                evql evql1 = cqxc0.k(new ProvisioningId(s));
                duof0.c = 2;
                object3 = fsdk.a(evql1, duof0);
                if(object3 == object1) {
                    return object1;
                }
                goto label_51;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        object3 = ((ibnw)object0).a;
    label_51:
        if((object3 instanceof ibnv)) {
            a.ae(duog.f.i(), "Get mdoc info failed", ibnw.a(object3));
            return ibom.a;
        }
        ibnx.b(object3);
        ibuq.e(object3, "getOrThrow(...)");
        gtxb gtxb0 = gtxb.b(fshl.a(((gtxg)object3)).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        ibuq.e(gtxb0, "getStatus(...)");
        switch(gtxb0.ordinal()) {
            case 5: {
                this.c(duob.a(this.a(), duoc.c, null, false, 6));
                return ibom.a;
            }
            case 2: 
            case 4: 
            case 6: {
                return ibom.a;
            }
            case 7: 
            case 8: {
                this.c(duob.a(this.a(), duoc.b, null, false, 6));
                return ibom.a;
            }
            case 10: {
                this.c(duob.a(this.a(), duoc.d, null, false, 6));
                return ibom.a;
            }
            case 0: 
            case 1: 
            case 3: 
            case 9: 
            case 11: 
            case 12: 
            case 13: {
                ((ggtj)duog.f.i()).B("Cannot handle mdoc status %s", gtxb0);
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public final void c(duob duob0) {
        this.a.b(duob0);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        this.c(duob.a(this.a(), null, null, this.h.c() == edsd.b, 3));
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}


import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;

final class eyfk extends ibsl implements ibtw {
    Object a;
    int b;
    final ibts c;
    final ConnectionInfo d;
    final eyfl e;

    public eyfk(ibts ibts0, ConnectionInfo connectionInfo0, eyfl eyfl0, ibrl ibrl0) {
        this.c = ibts0;
        this.d = connectionInfo0;
        this.e = eyfl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyfk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyfk(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object3;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            object3 = new ibvd();
            gzxd gzxd0 = gzxc.a(((ProtoLiteMessage)gzzc.a).v_newBuilder());
            this.c.a(gzxd0);
            object3.a = gzxd0.a();
            ConnectionInfo connectionInfo0 = this.d;
            if(connectionInfo0 != null) {
                this.a = object3;
                this.b = 1;
                Object object4 = this.e.b.a(connectionInfo0, this);
                if(object4 != object1) {
                    object2 = object3;
                    object0 = object4;
                label_18:
                    if(((exlu)object0) != null) {
                        gzzc gzzc0 = (gzzc)((ibvd)object2).a;
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzzc0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)gzzc0));
                        gzxd gzxd1 = gzxc.a(hftp0);
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzxl.a).v_newBuilder();
                        ibuq.f(hftp1, "builder");
                        gzxb gzxb0 = gzxa.a(((ProtoLiteMessage)gzxm.a).v_newBuilder());
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzyq.a).v_newBuilder();
                        ibuq.f(hftp2, "builder");
                        exni exni0 = ((exlu)object0).b;
                        if(exni0 == null) {
                            exni0 = exni.a;
                        }
                        String s = exni0.b;
                        ibuq.e(s, "getBuildId(...)");
                        ibuq.f(s, "value");
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp2.b_message;
                        s.getClass();
                        ((gzyq)hftv0).b = s;
                        exni exni1 = ((exlu)object0).b;
                        if(exni1 == null) {
                            exni1 = exni.a;
                        }
                        int v = exni1.c;
                        if(!hftv0.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gzyq)hftp2.b_message).c = v;
                        ProtoLiteMessage hftv1 = hftp2.N_build();
                        ibuq.e(hftv1, "build(...)");
                        ibuq.f(((gzyq)hftv1), "value");
                        ProtoLiteBuilder hftp3 = gzxb0.a;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gzxm gzxm0 = (gzxm)hftp3.b_message;
                        ((gzyq)hftv1).getClass();
                        gzxm0.c = (gzyq)hftv1;
                        gzxm0.b |= 1;
                        gzxh gzxh0 = gzxg.a(((ProtoLiteMessage)gzyb.a).v_newBuilder());
                        exmi exmi0 = ((exlu)object0).c;
                        if(exmi0 == null) {
                            exmi0 = exmi.a;
                        }
                        String s1 = exmi0.b;
                        ibuq.e(s1, "getDeviceModel(...)");
                        ibuq.f(s1, "value");
                        ProtoLiteBuilder hftp4 = gzxh0.a;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        gzyb gzyb0 = (gzyb)hftp4.b_message;
                        s1.getClass();
                        gzyb0.b = s1;
                        gzxb0.b(gzxh0.a());
                        gzxm gzxm1 = gzxb0.a();
                        ibuq.f(gzxm1, "value");
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gzxl gzxl0 = (gzxl)hftp1.b_message;
                        gzxm1.getClass();
                        gzxl0.c = gzxm1;
                        gzxl0.b |= 1;
                        ProtoLiteMessage hftv2 = hftp1.N_build();
                        ibuq.e(hftv2, "build(...)");
                        ibuq.f(((gzxl)hftv2), "value");
                        ProtoLiteBuilder hftp5 = gzxd1.a;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gzzc gzzc1 = (gzzc)hftp5.b_message;
                        ((gzxl)hftv2).getClass();
                        gzzc1.f = (gzxl)hftv2;
                        gzzc1.b |= 1;
                        ((ibvd)object2).a = gzxd1.a();
                    }
                    object3 = object2;
                    this.e.a.a(((gzzc)((ibvd)object3).a));
                    return ibom.a;
                }
                return object1;
            }
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
            goto label_18;
        }
        this.e.a.a(((gzzc)((ibvd)object3).a));
        return ibom.a;
    }
}


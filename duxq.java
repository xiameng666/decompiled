import android.util.Base64;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.io.IOException;

final class duxq extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final duyb f;
    final hkas g;

    public duxq(duyb duyb0, hkas hkas0, ibrl ibrl0) {
        this.f = duyb0;
        this.g = hkas0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duxq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duxq(this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object5;
        duyb duyb0;
        Object object4;
        Object object3;
        Object object2;
        hjzu hjzu0;
        Object object7;
        Object object6;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                this.e = 1;
                if(this.f.e(this) != object1) {
                    goto label_14;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_14:
                this.e = 2;
                object6 = this.f.l(this);
                if(object6 != object1) {
                    goto label_20;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                object6 = object0;
            label_20:
                if(((gtxg)object6) != null) {
                    duxk duxk0 = duxk.a(((duxk)this.f.h.b()), null, null, false, null, ((gtxg)object6), false, 43);
                    this.f.h.g(duxk0);
                    return ibom.a;
                }
                duyb duyb1 = this.f;
                if(duyb1.e == null || !edky.b(duyb1.e)) {
                    goto label_29;
                }
                this.e = 3;
                if(duyb1.k(this) != object1) {
                    goto label_33;
                label_29:
                    duxk duxk1 = duxk.a(((duxk)duyb1.h.b()), null, null, false, null, null, true, 0x1F);
                    duyb1.h.g(duxk1);
                    return ibom.a;
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
            label_33:
                this.e = 4;
                object7 = this.f.a(this.g, this);
                if(object7 != object1) {
                    goto label_39;
                }
                break;
            }
            case 4: {
                ibnx.b(object0);
                object7 = object0;
            label_39:
                this.a = (ProvisioningId)object7;
                this.e = 5;
                if(this.f.c(((ProvisioningId)object7), this.g, this) != object1) {
                    object4 = (ProvisioningId)object7;
                    goto label_47;
                }
                break;
            }
            case 5: {
                ProvisioningId provisioningId0 = (ProvisioningId)this.a;
                ibnx.b(object0);
                object4 = provisioningId0;
            label_47:
                duyb0 = this.f;
                object3 = this.g;
                String s = duyb0.g;
                if(s == null) {
                    ibuq.j("preauthCode");
                    s = null;
                }
                this.a = duyb0;
                this.b = object4;
                this.c = object3;
                this.d = s;
                this.e = 6;
                object5 = duyb0.f(this);
                if(object5 != object1) {
                    object2 = s;
                label_61:
                    ByteString hfsf0 = (ByteString)object5;
                    ibuq.f(object4, "provisioningId");
                    ibuq.f(object3, "issuer");
                    ibuq.f(object2, "preauthCode");
                    ibuq.f(hfsf0, "clientToken");
                    String s1 = ((ProvisioningId)object4).a;
                    ByteString hfsf1 = ((hkas)object3).b;
                    try {
                        int v = dtpl.k(570);
                        dmhi dmhi0 = duyb0.b.c;
                        dpuj dpuj0 = dpuj.al;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjzt.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s1.getClass();
                        ((hjzt)hftv0).b |= 1;
                        ((hjzt)hftv0).c = s1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        hfsf1.getClass();
                        ((hjzt)hftv1).b |= 2;
                        ((hjzt)hftv1).d = hfsf1;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjzt hjzt0 = (hjzt)hftp0.b_message;
                        hfsf0.getClass();
                        hjzt0.b |= 8;
                        hjzt0.f = hfsf0;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkaz.a).v_newBuilder();
                        hkbf hkbf0 = hkbf.a;
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkbf0).v_newBuilder();
                        String s2 = Base64.encodeToString(dtpl.o("fake_wallet_binding_token".getBytes()), 0);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp2.b_message;
                        s2.getClass();
                        ((hkbf)hftv2).b = s2;
                        if(!hftv2.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((hkbf)hftp2.b_message).c = v;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hkaz hkaz0 = (hkaz)hftp1.b_message;
                        hkbf hkbf1 = (hkbf)hftp2.N_build();
                        hkbf1.getClass();
                        hkaz0.c = hkbf1;
                        hkaz0.b |= 1;
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hkbf0).v_newBuilder();
                        String s3 = Base64.encodeToString(dtpl.o(((String)object2).getBytes()), 0);
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp3.b_message;
                        s3.getClass();
                        ((hkbf)hftv3).b = s3;
                        if(!hftv3.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((hkbf)hftp3.b_message).c = v;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hkaz hkaz1 = (hkaz)hftp1.b_message;
                        hkbf hkbf2 = (hkbf)hftp3.N_build();
                        hkbf2.getClass();
                        hkaz1.d = hkbf2;
                        hkaz1.b |= 2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjzt hjzt1 = (hjzt)hftp0.b_message;
                        hkaz hkaz2 = (hkaz)hftp1.N_build();
                        hkaz2.getClass();
                        hjzt1.e = hkaz2;
                        hjzt1.b |= 4;
                        hjzu0 = (hjzu)dptv.i(dmhi0, dpuj0, ((MessageLite)hftp0.N_build()), ((MessageLite)hjzu.a), ggeo.m("3.2.1", String.valueOf(v), "3.1.1", String.valueOf(v)));
                    }
                    catch(IOException | dpuk exception0) {
                        throw new dtzv("Failed to get proofing parameters.", exception0, 8);
                    }
                    ByteString hfsf2 = hjzu0.b;
                    ibuq.e(hfsf2, "getActionToken(...)");
                    duxk duxk2 = duxk.a(((duxk)this.f.h.b()), null, hfsf2, false, null, null, false, 57);
                    this.f.h.g(duxk2);
                    return ibom.a;
                }
                break;
            }
            default: {
                object2 = this.d;
                object3 = this.c;
                object4 = this.b;
                duyb0 = (duyb)this.a;
                ibnx.b(object0);
                object5 = object0;
                goto label_61;
            }
        }
        return object1;
    }
}


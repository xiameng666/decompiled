import com.google.android.gms.chromesync.zeroparty.CrossUserSharingPrivateKey;
import java.util.ArrayList;
import java.util.List;

public final class bfel {
    private static final bboh a;
    private final bdbr b;
    private final bfdn c;
    private final bdcd d;
    private final beaw e;

    static {
        bfel.a = bboh.b("PasswordSendingCoordinator", bbcu.cX);
    }

    public bfel(bdbr bdbr0, bfdn bfdn0, beaw beaw0, bdcd bdcd0) {
        this.b = bdbr0;
        this.c = bfdn0;
        this.e = beaw0;
        this.d = bdcd0;
    }

    static Object a(bfel bfel0, gqmd gqmd0, List list0, ibrl ibrl0) {
        Object object3;
        Object object2;
        bfek bfek0;
        bfel bfel1 = bfel0;
        if((ibrl0 instanceof bfek)) {
            bfek0 = (bfek)ibrl0;
            int v = bfek0.e;
            if((v & 0x80000000) == 0) {
                bfek0 = new bfek(bfel1, ibrl0);
            }
            else {
                bfek0.e = v - 0x80000000;
            }
        }
        else {
            bfek0 = new bfek(bfel1, ibrl0);
        }
        Object object0 = bfek0.c;
        Object object1 = ibrx.a;
        switch(bfek0.e) {
            case 0: {
                ibnx.b(object0);
                if(list0.isEmpty()) {
                    throw new IllegalArgumentException("Recipients list cannot be empty");
                }
                bfek0.f = bfel1;
                object2 = gqmd0;
                bfek0.a = object2;
                object3 = list0;
                bfek0.b = object3;
                bfek0.e = 1;
                object0 = bdbr.a(bfel1.b, bfek0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_32;
            }
            case 1: {
                Object object4 = bfek0.b;
                object2 = bfek0.a;
                bfel bfel2 = bfek0.f;
                ibnx.b(object0);
                object3 = object4;
                bfel1 = bfel2;
            label_32:
                if(((CrossUserSharingPrivateKey)object0) == null) {
                    ((ggtj)bfel.a.j()).x("Sharing Encryption Private Key is missing.");
                    return Boolean.valueOf(false);
                }
                ibuq.f(object2, "<this>");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hepw.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hepu.a).v_newBuilder();
                String s = ((bedg)((gqmd)object2).j()).a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hepu hepu0 = (hepu)hftp1.b_message;
                hepu0.b |= 1;
                hepu0.c = s;
                String s1 = ((grdf)((bedg)((gqmd)object2).j()).b.d()).a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hepu hepu1 = (hepu)hftp1.b_message;
                hepu1.b |= 2;
                hepu1.d = s1;
                gged_interceptors gged0 = ((gqmd)object2).c();
                ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
                for(ggqk ggqk0 = gged0.E(); ggqk0.hasNext(); ggqk0 = ggqk0) {
                    Object object5 = ggqk0.next();
                    ibuq.c(((bedg)object5));
                    ibuq.f(((bedg)object5), "<this>");
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hepv.a).v_newBuilder();
                    String s2 = ((bedg)object5).c;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    ((hepv)hftv0).b |= 2;
                    ((hepv)hftv0).d = s2;
                    heqb heqb0 = ((bedg)object5).e;
                    int v1 = heqb0.c;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((hepv)hftv1).b |= 1;
                    ((hepv)hftv1).c = v1;
                    String s3 = heqb0.e;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    s3.getClass();
                    ((hepv)hftv2).b |= 4;
                    ((hepv)hftv2).e = s3;
                    String s4 = heqb0.f;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    s4.getClass();
                    ((hepv)hftv3).b |= 8;
                    ((hepv)hftv3).f = s4;
                    String s5 = heqb0.h;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp2.b_message;
                    s5.getClass();
                    ((hepv)hftv4).b |= 16;
                    ((hepv)hftv4).g = s5;
                    String s6 = heqb0.o;
                    if(!hftv4.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp2.b_message;
                    s6.getClass();
                    ((hepv)hftv5).b |= 0x20;
                    ((hepv)hftv5).h = s6;
                    String s7 = heqb0.p;
                    if(!hftv5.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hepv hepv0 = (hepv)hftp2.b_message;
                    s7.getClass();
                    hepv0.b |= 0x40;
                    hepv0.i = s7;
                    ProtoLiteMessage hftv6 = hftp2.N_build();
                    ibuq.e(hftv6, "build(...)");
                    arrayList0.add(((hepv)hftv6));
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hepu hepu2 = (hepu)hftp1.b_message;
                hfuo hfuo0 = hepu2.e;
                if(!hfuo0.c()) {
                    hepu2.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(arrayList0, hepu2.e);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hepw hepw0 = (hepw)hftp0.b_message;
                hepu hepu3 = (hepu)hftp1.N_build();
                hepu3.getClass();
                hepw0.c = hepu3;
                hepw0.b |= 1;
                ProtoLiteMessage hftv7 = hftp0.N_build();
                ibuq.e(hftv7, "build(...)");
                ArrayList arrayList1 = new ArrayList(ibpo.q(((Iterable)object3), 10));
                for(Object object6: ((Iterable)object3)) {
                    heox heox0 = ((herj)object6).e;
                    if(heox0 == null) {
                        heox0 = heox.a;
                    }
                    ibuq.e(heox0, "getCrossUserSharingPublicKey(...)");
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)heow.a).v_newBuilder();
                    int v2 = ((CrossUserSharingPrivateKey)object0).a;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    heow heow0 = (heow)hftp3.b_message;
                    heow0.b |= 1;
                    heow0.c = v2;
                    ByteString hfsf0 = ByteString.copyFrom(((CrossUserSharingPrivateKey)object0).b);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    heow heow1 = (heow)hftp3.b_message;
                    heow1.b |= 2;
                    heow1.d = hfsf0;
                    ProtoLiteMessage hftv8 = hftp3.N_build();
                    ibuq.e(hftv8, "build(...)");
                    ibuq.f(((hepw)hftv7), "invitationData");
                    ibuq.f(heox0, "recipientPublicKey");
                    ibuq.f(((heow)hftv8), "senderPrivateKey");
                    byte[] arr_b = heox0.c.toByteArray();
                    ibuq.e(arr_b, "toByteArray(...)");
                    gmwi gmwi0 = bfdn.b(arr_b);
                    byte[] arr_b1 = ((heow)hftv8).d.toByteArray();
                    ibuq.e(arr_b1, "toByteArray(...)");
                    gmwa gmwa0 = bfdn.a(arr_b1);
                    gmvz gmvz0 = gmwi0.a;
                    if(!gmvz0.equals(gmwa0.d())) {
                        throw new IllegalArgumentException("Recipient HPKE params do not match the sender\'s params.");
                    }
                    gmyf gmyf0 = gmyj.b(gmvz0.a);
                    gmxz gmxz0 = gmyj.c(gmvz0.b);
                    gmyb gmyb0 = gmyj.a(gmvz0.c);
                    gmyi gmyi0 = gmyh.a(gmwa0);
                    byte[] arr_b2 = ((hepw)hftv7).toBytesArray();
                    gmyg gmyg0 = gmyf0.a(gmwi0.b.c(), gmyi0);
                    gmyc gmyc0 = gmyc.c(gmyo.b, gmyg0.b, gmyg0.a, gmyf0, gmxz0, gmyb0, new byte[0]);
                    byte[] arr_b3 = gmyc0.a();
                    byte[] arr_b4 = gmyc0.a.d(gmyc0.b, arr_b3, arr_b2, gmzf.a);
                    byte[] arr_b5 = gnqf.b(new byte[][]{gmyc0.c, arr_b4});
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hepr.a).v_newBuilder();
                    ByteString hfsf1 = ByteString.copyFrom(arr_b5);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hepr hepr0 = (hepr)hftp4.b_message;
                    hepr0.b |= 4;
                    hepr0.e = hfsf1;
                    String s8 = beaw.a().toString();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp4.b_message;
                    s8.getClass();
                    ((hepr)hftv9).b |= 1;
                    ((hepr)hftv9).c = s8;
                    String s9 = ((herj)object6).c;
                    if(!hftv9.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv10 = hftp4.b_message;
                    s9.getClass();
                    ((hepr)hftv10).b |= 2;
                    ((hepr)hftv10).d = s9;
                    heox heox1 = ((herj)object6).e;
                    if(heox1 == null) {
                        heox1 = heox.a;
                    }
                    int v3 = heox1.b;
                    if(!hftv10.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv11 = hftp4.b_message;
                    ((hepr)hftv11).b |= 16;
                    ((hepr)hftv11).f = v3;
                    if(!hftv11.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hepr hepr1 = (hepr)hftp4.b_message;
                    hepr1.b |= 0x20;
                    hepr1.g = v2;
                    ProtoLiteMessage hftv12 = hftp4.N_build();
                    ibuq.e(hftv12, "build(...)");
                    arrayList1.add(((hepr)hftv12));
                    continue;
                }
                gged_interceptors gged1 = ggdx.a(arrayList1);
                try {
                    evql evql0 = bfel1.d.f(gged1);
                    bfek0.f = null;
                    bfek0.a = null;
                    bfek0.b = null;
                    bfek0.e = 2;
                    object0 = ictn.b(evql0, bfek0);
                    if(object0 == object1) {
                        return object1;
                    label_220:
                        ibnx.b(object0);
                    }
                    Void void0 = (Void)object0;
                    return Boolean.valueOf(true);
                }
                catch(aztb aztb0) {
                    break;
                }
            }
            case 2: {
                goto label_220;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bfel.a.j(), "Saving outgoing sharing invitations failed.", aztb0);
        return Boolean.valueOf(false);
    }
}


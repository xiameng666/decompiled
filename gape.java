import android.accounts.Account;
import android.content.Intent;
import j..util.DesugarCollections;
import java.util.List;

public final class gape extends gaok {
    private final gaxk b;

    public gape(gamx gamx0, gaxk gaxk0) {
        super(gamx0);
        this.b = gaxk0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Object object2;
        int v4;
        byi byi4;
        byi byi3;
        ibuq.f(gano0, "request");
        ibuq.e(gano0.a, "getIntent(...)");
        ibuq.f(gano0.a, "<this>");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbd.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        byi byi0 = gawj.a(gano0.a, "encryptionConfig", ((MessageLite)(((fbbd)hftv0))));
        ibuq.e(gano0.a, "getIntent(...)");
        ibuq.f(gano0.a, "<this>");
        byi byi1 = gawj.a(gano0.a, "unencryptedDataValueMap", ((MessageLite)hcos.a));
        byi byi2 = new byi(byi1.b());
        int v = byi1.b();
        int v1 = 0;
        while(v1 < v) {
            long v2 = byi1.c(v1);
            hcos hcos0 = (hcos)byi1.f(v1);
            Object object0 = null;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hcos0));
            ibuq.e(hftp1, "toBuilder(...)");
            hftr hftr0 = (hftr)hftp1;
            List list0 = DesugarCollections.unmodifiableList(((hcos)hftr0.b_message).j);
            ibuq.e(list0, "getEncryptedFieldsToSubmitList(...)");
            int v3 = 0;
            for(Object object1: list0) {
                if(v3 < 0) {
                    ibpo.m();
                }
                hcoy hcoy0 = ((hcov)object1).d;
                if(hcoy0 == null) {
                    hcoy0 = hcoy.a;
                }
                if((hcoy0.b & 1) == 0) {
                    byi3 = byi1;
                    byi4 = byi2;
                    v4 = v;
                    object2 = object0;
                }
                else {
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hcov)object1))).jf(5, object0);
                    hftp2.X(((ProtoLiteMessage)(((hcov)object1))));
                    ibuq.e(hftp2, "toBuilder(...)");
                    hcoy hcoy1 = ((hcov)hftp2.b_message).d;
                    if(hcoy1 == null) {
                        hcoy1 = hcoy.a;
                    }
                    String s = hcoy1.d;
                    ibuq.e(s, "getEncryptedFieldValue(...)");
                    byi3 = byi1;
                    byi4 = byi2;
                    fbbd fbbd0 = (fbbd)byi0.d(((hcov)hftp2.b_message).c);
                    if(fbbd0 == null) {
                        return ganp.j();
                    }
                    Account account0 = this.d().d.a;
                    v4 = v;
                    ibuq.e(account0, "getAccount(...)");
                    gaxj gaxj0 = this.b.a(account0);
                    byte[] arr_b = s.getBytes(ibyo.c);
                    ibuq.e(arr_b, "getBytes(...)");
                    String s1 = bbmu.b(gaxj0.a(fbbd0, arr_b));
                    if(s1 == null) {
                        return ganp.j();
                    }
                    hcoy hcoy2 = ((hcov)object1).d;
                    if(hcoy2 == null) {
                        hcoy2 = hcoy.a;
                    }
                    object2 = null;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hcoy2).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)hcoy2));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hcoy hcoy3 = (hcoy)hftp3.b_message;
                    hcoy3.b |= 1;
                    hcoy3.d = s1;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hcov hcov0 = (hcov)hftp2.b_message;
                    hcoy hcoy4 = (hcoy)hftp3.N_build();
                    hcoy4.getClass();
                    hcov0.d = hcoy4;
                    hcov0.b |= 2;
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    hcos hcos1 = (hcos)hftr0.b_message;
                    hcov hcov1 = (hcov)hftp2.N_build();
                    hcov1.getClass();
                    hcos1.b();
                    hcos1.j.set(v3, hcov1);
                }
                object0 = object2;
                ++v3;
                byi1 = byi3;
                byi2 = byi4;
                v = v4;
            }
            ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)hftr0).N_build();
            ibuq.e(hftv1, "build(...)");
            byi2.h(v2, hftv1);
            ++v1;
            byi1 = byi1;
        }
        Intent intent0 = ganp.e(0);
        gawj.b(intent0, "encryptedDataValueMap", byi2);
        return new ganp(intent0);
    }

    public static final byi b(ganp ganp0) {
        ibuq.f(ganp0, "<this>");
        ibuq.e(ganp0.a, "getIntent(...)");
        ibuq.f(ganp0.a, "<this>");
        return gawj.a(ganp0.a, "encryptedDataValueMap", ((MessageLite)hcos.a));
    }
}


import java.util.List;

public final class dgfn {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public dgfn(List list0, List list1, List list2, List list3) {
        ibuq.f(list0, "signedData");
        ibuq.f(list2, "secretIdHash");
        super();
        this.a = list0;
        this.b = list1;
        this.c = list2;
        this.d = list3;
    }

    public final byte[] a() {
        dbyv dbyv0 = dbyu.a(((ProtoLiteMessage)dcjh.a).v_newBuilder());
        dbyv0.c(dcjg.b);
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.d);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjl.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ByteString hfsf0 = ByteString.copyFrom(ibpo.aC(this.c));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjl dcjl0 = (dcjl)hftp0.b_message;
        dcjl0.b |= 2;
        dcjl0.d = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(ibpo.aC(this.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjl dcjl1 = (dcjl)hftp0.b_message;
        dcjl1.b |= 1;
        dcjl1.c = hfsf1;
        List list0 = this.d;
        if(list0 != null) {
            ByteString hfsf2 = ByteString.copyFrom(ibpo.aC(list0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dcjl dcjl2 = (dcjl)hftp0.b_message;
            dcjl2.b |= 8;
            dcjl2.f = hfsf2;
        }
        List list1 = this.b;
        if(list1 != null) {
            ByteString hfsf3 = ByteString.copyFrom(ibpo.aC(list1));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dcjl dcjl3 = (dcjl)hftp0.b_message;
            dcjl3.b |= 4;
            dcjl3.e = hfsf3;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dcjl)hftv0), "value");
        ProtoLiteBuilder hftp1 = dcnr0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp1.b_message;
        ((dcjl)hftv0).getClass();
        dcjy0.f = (dcjl)hftv0;
        dcjy0.b |= 8;
        dbyv0.b(dcnr0.a());
        return dbyv0.a().toBytesArray();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfn)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dgfn)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgfn)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((dgfn)object0).c) ? ibuq.m(this.d, ((dgfn)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        List list0 = this.d;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "PairedKeyEncryptionData(signedData=" + this.a + ", optionalSignedData=" + this.b + ", secretIdHash=" + this.c + ", qrCodeHandshakeData=" + this.d + ")";
    }
}


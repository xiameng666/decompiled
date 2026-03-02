import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bpio implements gfsi {
    public final bpir a;
    public final AtomicReference b;
    public final boolean c;
    public final fqyi d;

    public bpio(bpir bpir0, AtomicReference atomicReference0, boolean z, fqyi fqyi0) {
        this.a = bpir0;
        this.b = atomicReference0;
        this.c = z;
        this.d = fqyi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyi fqyi0 = fqyi.b(((fqzl)object0).r);
        if(fqyi0 == null) {
            fqyi0 = fqyi.a;
        }
        fqyi fqyi1 = this.d;
        AtomicReference atomicReference0 = this.b;
        atomicReference0.set((this.c ? fqyi0 : fqyi1));
        if(fqyi1.equals(fqyi.d)) {
            bpir bpir0 = this.a;
            if(!fqyi1.equals(fqyi0)) {
                atomicReference0.set(fqyi1);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
                hftp0.X(((ProtoLiteMessage)(((fqzl)object0))));
                if(!((fqyg)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
                }
                ((fqzl)((fqyg)hftp0).b_message).r = fqyi1.aa;
                ((fqzl)((fqyg)hftp0).b_message).b |= 0x400;
                hfwn hfwn0 = hfyn.h(bpir0.d.d().toEpochMilli());
                if(!((fqyg)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
                }
                fqzl fqzl0 = (fqzl)((fqyg)hftp0).b_message;
                hfwn0.getClass();
                fqzl0.s = hfwn0;
                fqzl0.b |= 0x800;
                return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp0))).N_build();
            }
            if((((fqzl)object0).b & 0x800) == 0) {
                return (fqzl)object0;
            }
            long v = bpir0.d.d().toEpochMilli();
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            hfwn hfwn1 = ((fqzl)object0).s;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
            if(timeUnit0.toSeconds(v - hfyn.b(hfwn1)) <= hsxv.a.y().ak()) {
                return (fqzl)object0;
            }
            atomicReference0.set(fqyi.a);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((fqzl)object0))));
            if(!((fqyg)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyg)hftp1))).ensureMutable();
            }
            ((fqzl)((fqyg)hftp1).b_message).s = null;
            ((fqzl)((fqyg)hftp1).b_message).b &= 0xFFFFF7FF;
            return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp1))).N_build();
        }
        if(fqyi1.equals(fqyi0)) {
            return (fqzl)object0;
        }
        Integer integer0 = (Integer)bpir.b.get(fqyi0);
        Integer integer1 = (Integer)bpir.b.get(fqyi1);
        if(integer0 != null && integer1 != null && ((int)integer1) < ((int)integer0)) {
            atomicReference0.set(fqyi1);
            return (fqzl)object0;
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((fqzl)object0))));
        if(!((fqyg)hftp2).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp2))).ensureMutable();
        }
        ((fqzl)((fqyg)hftp2).b_message).r = fqyi1.aa;
        ((fqzl)((fqyg)hftp2).b_message).b |= 0x400;
        if(!((fqyg)hftp2).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp2))).ensureMutable();
        }
        ((fqzl)((fqyg)hftp2).b_message).s = null;
        ((fqzl)((fqyg)hftp2).b_message).b &= 0xFFFFF7FF;
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp2))).N_build();
    }
}


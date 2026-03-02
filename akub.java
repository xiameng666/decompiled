import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class akub {
    static final long a;
    private final SecureRandom b;

    static {
        akub.a = TimeUnit.DAYS.toMillis(14L);
    }

    public akub() {
        this.b = new SecureRandom();
    }

    public final List a() {
        List list0 = new ArrayList();
        long v = System.currentTimeMillis();
        boolean z = Long.compare(v % akub.a, Math.round(((double)akub.a) * 0.333333)) < 0;
        if(z) {
            list0.add(this.b(v, -1));
        }
        list0.add(this.b(v, 0));
        list0.add(this.b(v, 1));
        list0.add(this.b(v, 2));
        if(!z) {
            list0.add(this.b(v, 3));
        }
        return list0;
    }

    private final allu b(long v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)allu.a).v_newBuilder();
        long v2 = (v / akub.a + ((long)v1)) * akub.a;
        long v3 = akub.a + v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((allu)hftv0).c = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((allu)hftp0.b_message).d = v3;
        byte[] arr_b = new byte[0x20];
        this.b.nextBytes(arr_b);
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((allu)hftp0.b_message).b = hfsf0;
        return (allu)hftp0.N_build();
    }
}


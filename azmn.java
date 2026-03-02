import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Map.Entry;

public final class azmn implements azmb {
    private final SecureRandom a;
    private final azmo b;
    private final genm c;
    private final azmf d;

    public azmn(SecureRandom secureRandom0, azmo azmo0, genm genm0, azmf azmf0) {
        this.a = secureRandom0;
        this.b = azmo0;
        this.c = genm0;
        this.d = azmf0;
    }

    @Override  // azmb
    public final gged_interceptors a(ggeo ggeo0) {
        ggdy ggdy0 = new ggdy();
        boolean z = true;
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            azki azki0 = (azki)((Map.Entry)object0).getKey();
            azii azii0 = (azii)((Map.Entry)object0).getValue();
            gged_interceptors gged0 = this.d.b(azki0, azii0);
            int v = ((ggna)gged0).c;
            int v1 = 0;
            while(v1 < v) {
                ggdy0.i(this.d(((Integer)gged0.get(v1)).intValue(), z));
                ++v1;
                z = false;
            }
        }
        gged_interceptors gged1 = this.e();
        int v2 = ((ggna)gged1).c;
        int v3 = 0;
        while(v3 < v2) {
            ggdy0.i(this.d(((Integer)gged1.get(v3)).intValue(), z));
            ++v3;
            z = false;
        }
        ggdy0.i(this.c(z));
        return ggdy0.h();
    }

    @Override  // azmb
    public final gged_interceptors b() {
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = this.e();
        int v = ((ggna)gged0).c;
        boolean z = true;
        int v1 = 0;
        while(v1 < v) {
            ggdy0.i(this.d(((Integer)gged0.get(v1)).intValue(), z));
            ++v1;
            z = false;
        }
        ggdy0.i(this.c(z));
        return ggdy0.h();
    }

    private final azio c(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azio.a).v_newBuilder();
        if(z) {
            ByteString hfsf0 = this.b.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((azio)hftp0.b_message).c = hfsf0;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)genb.a).v_newBuilder();
        genn genn0 = genn.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        genb genb0 = (genb)hftp1.b_message;
        genn0.getClass();
        genb0.c = genn0;
        genb0.b = 10000;
        ByteString hfsf1 = this.b.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((genb)hftp1.b_message).d = hfsf1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azio azio0 = (azio)hftp0.b_message;
        genb genb1 = (genb)hftp1.N_build();
        genb1.getClass();
        azio0.d = genb1;
        azio0.b |= 1;
        return (azio)hftp0.N_build();
    }

    private final azio d(int v, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azio.a).v_newBuilder();
        if(z) {
            ByteString hfsf0 = this.b.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((azio)hftp0.b_message).c = hfsf0;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)genb.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gene.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gene)hftp2.b_message).b = (long)v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        genb genb0 = (genb)hftp1.b_message;
        gene gene0 = (gene)hftp2.N_build();
        gene0.getClass();
        genb0.c = gene0;
        genb0.b = 13;
        ByteString hfsf1 = this.b.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((genb)hftp1.b_message).d = hfsf1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azio azio0 = (azio)hftp0.b_message;
        genb genb1 = (genb)hftp1.N_build();
        genb1.getClass();
        azio0.d = genb1;
        azio0.b |= 1;
        return (azio)hftp0.N_build();
    }

    private final gged_interceptors e() {
        BigDecimal bigDecimal2;
        double f2;
        int v = this.d.a();
        gftb.b(v >= 0, "maxIndex value can not be negative");
        double f = (this.c.c == 107 ? ((genl)this.c.d) : genl.a).b;
        gftb.f(f > 0.0, "poisson_mean must be positive, got %s", Double.valueOf(f));
        BigDecimal bigDecimal0 = new BigDecimal(v).add(BigDecimal.ONE).multiply(BigDecimal.valueOf(f));
        RoundingMode roundingMode0 = RoundingMode.UP;
        gftb.z(bigDecimal0, "x");
        gftb.z(roundingMode0, "mode");
        double f1 = bigDecimal0.doubleValue();
        if(Double.isInfinite(f1)) {
            switch(gluv.a[roundingMode0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    f1 = ((double)bigDecimal0.signum()) * 1.797693E+308;
                    break;
                }
                case 5: {
                    f1 = f1 == Infinity ? 1.797693E+308 : -Infinity;
                    break;
                }
                case 6: {
                    f1 = f1 == Infinity ? Infinity : -1.797693E+308;
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    throw new ArithmeticException(bigDecimal0 + " cannot be represented precisely as a double");
                }
                default: {
                    goto label_25;
                }
            }
        }
        else {
        label_25:
            BigDecimal bigDecimal1 = new BigDecimal(f1);
            int v1 = bigDecimal0.compareTo(bigDecimal1);
            int[] arr_v = gluv.a;
            switch(arr_v[roundingMode0.ordinal()]) {
                case 1: {
                    if(bigDecimal0.signum() < 0) {
                        if(v1 > 0) {
                            f1 = Math.nextUp(f1);
                        }
                    }
                    else if(v1 < 0) {
                        f1 = gluf.b(f1);
                    }
                    break;
                }
                case 2: 
                case 3: 
                case 4: {
                    if(v1 >= 0) {
                        f2 = Math.nextUp(f1);
                        if(f2 != Infinity) {
                            bigDecimal2 = new BigDecimal(f2);
                            goto label_50;
                        }
                    }
                    else {
                        double f3 = gluf.b(f1);
                        if(f3 != -Infinity) {
                            bigDecimal2 = bigDecimal1;
                            bigDecimal1 = new BigDecimal(f3);
                            f2 = f1;
                            f1 = f3;
                        label_50:
                            int v2 = bigDecimal0.subtract(bigDecimal1).compareTo(bigDecimal2.subtract(bigDecimal0));
                            if(v2 >= 0) {
                                if(v2 <= 0) {
                                    switch(arr_v[roundingMode0.ordinal()]) {
                                        case 2: {
                                            if((Double.doubleToRawLongBits(f1) & 1L) != 0L) {
                                                f1 = f2;
                                            }
                                            break;
                                        }
                                        case 3: {
                                            if(bigDecimal0.signum() < 0) {
                                                f1 = f2;
                                            }
                                            break;
                                        }
                                        case 4: {
                                            if(bigDecimal0.signum() >= 0) {
                                                f1 = f2;
                                            }
                                            break;
                                        }
                                        default: {
                                            throw new AssertionError("impossible");
                                        }
                                    }
                                }
                                else {
                                    f1 = f2;
                                }
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    if(v1 < 0) {
                        f1 = gluf.b(f1);
                    }
                    break;
                }
                case 6: {
                    if(v1 > 0) {
                        f1 = Math.nextUp(f1);
                    }
                    break;
                }
                case 7: {
                    if(bigDecimal0.signum() < 0) {
                        if(v1 < 0) {
                            f1 = gluf.b(f1);
                        }
                    }
                    else if(v1 > 0) {
                        f1 = Math.nextUp(f1);
                    }
                    break;
                }
                case 8: {
                    gluo.b(v1 == 0);
                    break;
                }
                default: {
                    throw new AssertionError("impossible");
                }
            }
        }
        ggdy ggdy0 = new ggdy();
        SecureRandom secureRandom0 = this.a;
        double f4 = Math.exp(-f1);
        double f5 = secureRandom0.nextDouble();
        double f6 = f4;
        int v3 = 0;
        while((f5 > f4)) {
            ++v3;
            f6 = f6 * f1 / ((double)v3);
            f4 += f6;
        }
        for(int v4 = 0; v4 < v3; ++v4) {
            ggdy0.i(Integer.valueOf(secureRandom0.nextInt(v + 1)));
        }
        return ggdy0.h();
    }
}


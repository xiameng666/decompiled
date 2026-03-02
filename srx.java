import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public final class srx {
    public static final ssy a;
    public static final ssy b;
    public static final ssy c;
    public static final ssy d;
    public static final ssy e;
    public static final ssy f;
    public static final ssy g;
    public static final byte[] h;
    public static final byte[] i;
    private final byte[] j;
    private final byte[] k;

    static {
        srx.a = new ssy(0x7F21);
        srx.b = new ssy(0x7F4E);
        srx.c = new ssy(0x5F37);
        srx.d = new ssy(66);
        srx.e = new ssy(0x7F49);
        srx.f = new ssy(0x86);
        srx.g = new ssy(6);
        srx.h = str.c("2a8648ce3d030107");
        srx.i = str.c("1122");
    }

    public srx(byte[] arr_b, byte[] arr_b1) {
        this.j = stm.a(arr_b);
        this.k = stm.a(arr_b1);
    }

    public static srx a(byte[] arr_b) {
        try {
            return srx.b(arr_b, null);
        }
        catch(srm srm0) {
            throw new IllegalStateException("Signature should not be verified by this method", srm0);
        }
    }

    public static srx b(byte[] arr_b, srj srj0) {
        try {
            ssw ssw0 = new ssv(arr_b).a();
            srx.e(ssw0, srx.a);
            ssv ssv0 = new ssv(ssw0.a());
            ssw ssw1 = ssv0.a();
            srx.e(ssw1, srx.b);
            ssw ssw2 = ssv0.a();
            srx.e(ssw2, srx.c);
            if(srj0 != null) {
                byte[] arr_b1 = ssw2.a();
                BigInteger bigInteger0 = new BigInteger(1, Arrays.copyOf(arr_b1, 0x20));
                BigInteger bigInteger1 = new BigInteger(1, Arrays.copyOfRange(arr_b1, 0x20, arr_b1.length));
                byte[] arr_b2 = ssw1.a();
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                stq.a(ssw1.d().e(), byteArrayOutputStream0);
                stq.b(arr_b2.length, byteArrayOutputStream0);
                stq.a(arr_b2, byteArrayOutputStream0);
                byte[] arr_b3 = byteArrayOutputStream0.toByteArray();
                ieqm ieqm0 = new ieqm(new ieqr(), new ieex());
                ieqm0.a(false, srj0.a);
                ieqm0.c(arr_b3, 0, arr_b3.length);
                try {
                    idpi idpi0 = new idpi();
                    idpi0.b(new idpx(bigInteger0));
                    idpi0.b(new idpx(bigInteger1));
                    byte[] arr_b4 = new idsg(idpi0).u();
                }
                catch(IOException iOException0) {
                    throw new stt("Failed to encode ECDSA ASN.1", iOException0);
                }
                if(!ieqm0.d(arr_b4)) {
                    throw new srm();
                }
            }
            ssv ssv1 = new ssv(ssw1.a());
            srx.e(ssv1.a(), srx.d);
            ssw ssw3 = ssv1.a();
            srx.e(ssw3, srx.e);
            ssv ssv2 = new ssv(ssw3.a());
            srx.e(ssv2.a(), srx.g);
            ssw ssw4 = ssv2.a();
            srx.e(ssw4, srx.f);
            return new srx(ssw4.a(), arr_b);
        }
        catch(srm srm0) {
            throw srm0;
        }
        catch(Exception exception0) {
            throw new stt("Failed to parse AKE certificate", exception0);
        }
    }

    public final byte[] c() {
        return stm.a(this.k);
    }

    public final byte[] d() {
        return stm.a(this.j);
    }

    private static void e(ssw ssw0, ssy ssy0) {
        if(ssw0.d().a == ssy0.a) {
            return;
        }
        throw new stt("Unexpected tag in AKE certificate: " + ssw0.d());
    }
}


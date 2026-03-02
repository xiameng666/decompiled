import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class sri {
    public final ieop a;
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;

    static {
        sri.b = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        sri.c = new byte[]{0, (byte)0x80};
        sri.d = str.c("00000001");
    }

    public sri(ieop ieop0) {
        this.a = ieop0;
    }

    public sri(byte[] arr_b) {
        ieax ieax0 = iegv.b("secp256r1");
        ieok ieok0 = new ieok(ieax0.b(), ieax0.c(), ieax0.a);
        this.a = new ieop(new BigInteger(1, arr_b), new ieok(ieok0.a, ieok0.b, ieok0.c));
    }

    public final Map a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        ieax ieax0 = iegv.b("secp256r1");
        ieok ieok0 = new ieok(ieax0.b(), ieax0.c(), ieax0.a);
        ieoq ieoq0 = new ieoq(ieok0.a.s(arr_b), new ieok(ieok0.a, ieok0.b, ieok0.c));
        iedg iedg0 = new iedg();
        iedg0.c(this.a);
        byte[] arr_b3 = stf.a(iedg0.b(ieoq0));
        ieex ieex0 = new ieex();
        ieex0.update(arr_b3, 0, arr_b3.length);
        ieex0.update(sri.d, 0, sri.d.length);
        byte[] arr_b4 = new byte[0x20];
        ieex0.doFinal(arr_b4, 0);
        srk srk0 = srk.b;
        srp srp0 = new srp(srk0, Arrays.copyOf(arr_b4, srk0.e));
        Map map0 = new HashMap();
        for(int v = 0; v < arr_b2.length; ++v) {
            int v1 = arr_b2[v];
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            stq.a(sri.b, byteArrayOutputStream0);
            byteArrayOutputStream0.write(v1);
            byteArrayOutputStream0.write(0);
            stq.a(sri.c, byteArrayOutputStream0);
            byte[] arr_b5 = byteArrayOutputStream0.toByteArray();
            srp0.d();
            byte[] arr_b6 = new byte[16];
            int v3 = 1;
            int v4 = 0;
            int v5 = 0;
            for(int v2 = 16; v5 < 16; v2 = 16) {
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                stq.a(arr_b5, byteArrayOutputStream1);
                byteArrayOutputStream1.write(v3);
                stq.a(arr_b1, byteArrayOutputStream1);
                byte[] arr_b7 = srp0.f(srp0.a(srk0), byteArrayOutputStream1.toByteArray());
                int v6 = arr_b7.length;
                if(v6 < 16) {
                    v2 = Math.min(v6, 16 - v5);
                }
                System.arraycopy(arr_b7, 0, arr_b6, v4, v2);
                v5 += v6;
                v4 += v2;
                v3 = (byte)(v3 + 1);
            }
            map0.put(Byte.valueOf(((byte)v1)), new srp(srp0.a, arr_b6));
        }
        return map0;
    }
}


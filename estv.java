import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class estv implements esse {
    private static final Logger a;
    private final byte[] b;
    private final essg c;
    private final essp d;

    static {
        estv.a = Logger.getLogger(estv.class.getName());
    }

    public estv(essp essp0, essg essg0) {
        this.d = essp0;
        this.b = essp0.s;
        this.c = essg0;
    }

    @Override  // esse
    public final int a() {
        return Integer.parseInt(this.d.U.substring(2, 4));
    }

    @Override  // esse
    public final int b() {
        return Integer.parseInt(("20" + this.d.U.substring(0, 2)));
    }

    @Override  // esse
    public final String c() {
        return this.d.k;
    }

    @Override  // esse
    public final String d() {
        return String.format(Locale.US, "transaction: %d, %d, %d, %s, %d, %s", ((long)this.c.a), ((long)this.c.c), ((int)this.c.b), this.c.h.toString(), ((int)this.c.e), this.c.d);
    }

    @Override  // esse
    public final String e() {
        byte[] arr_b = new byte[estb.b.Y];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.b);
        byteBuffer0.position(estb.b.X);
        byteBuffer0.get(arr_b, 0, estb.b.Y);
        return essz.a(arr_b);
    }

    @Override  // esse
    public final byte[] f() {
        byte[] arr_b20;
        byte[] arr_b19;
        String s3;
        byte[] arr_b = new byte[8];
        byte[] arr_b1 = new byte[2];
        byte[] arr_b2 = this.b;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b2);
        byteBuffer0.position(estb.b.X);
        byteBuffer0.get(arr_b1);
        BigInteger bigInteger0 = new BigInteger("1", 16);
        String s = esuq.c(new BigInteger(essz.a(arr_b1), 16).add(bigInteger0).toString(16));
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(2);
        byte[] arr_b3 = ests.a;
        byte[] arr_b4 = essz.b(s);
        ByteBuffer byteBuffer2 = byteBuffer1.put(arr_b3, 0, 2 - s.length() / 2).put(arr_b4);
        byte[] arr_b5 = byteBuffer2.array();
        essp.ab(arr_b5);
        byteBuffer0.position(estb.b.X);
        byteBuffer0.put(arr_b5);
        ByteBuffer byteBuffer3 = ByteBuffer.wrap(arr_b2);
        byteBuffer3.position(estb.b.X);
        byte[] arr_b6 = new byte[2];
        byteBuffer3.get(arr_b6);
        essp essp0 = this.d;
        ByteBuffer byteBuffer4 = ByteBuffer.wrap(essp0.t);
        byteBuffer4.position(estc.b.i);
        byteBuffer4.put(estv.h(arr_b6));
        byte[] arr_b7 = essp0.t;
        ByteBuffer byteBuffer5 = ByteBuffer.wrap(arr_b2);
        byteBuffer5.position(estb.b.X);
        byte[] arr_b8 = new byte[estb.b.Y];
        byteBuffer5.get(arr_b8);
        ByteBuffer byteBuffer6 = ByteBuffer.wrap(arr_b7);
        byteBuffer6.position(estc.b.i);
        byte[] arr_b9 = new byte[estb.b.Y];
        byteBuffer6.get(arr_b9);
        if(!Arrays.equals(estv.h(arr_b8), arr_b9)) {
            return arr_b;
        }
        String s1 = esuq.c(String.valueOf(this.c.c / 1000000L));
        ByteBuffer byteBuffer7 = ByteBuffer.allocate(6).put(arr_b3, 0, 6 - s1.length() / 2).put(essz.b(s1));
        byte[] arr_b10 = essz.b(esuq.c(String.valueOf(this.c.e)));
        byte[] arr_b11 = essz.b(esuq.c(String.valueOf(this.c.b)));
        byte[] arr_b12 = essz.b(this.c.d);
        essp.ac(arr_b12);
        long v = this.c.a;
        ByteBuffer byteBuffer8 = ByteBuffer.allocate(4);
        if(Long.compare(v, 0L) == 0) {
            byte[] arr_b13 = new byte[4];
            new SecureRandom().nextBytes(arr_b13);
            byteBuffer8.put(arr_b13);
        }
        else {
            String s2 = String.valueOf(v);
            if(s2.length() > 8) {
                s3 = s2.substring(0, 8);
            }
            else {
                s3 = esuq.c(s2);
                byteBuffer8.put(arr_b3, 0, 4 - s3.length() / 2);
            }
            byteBuffer8.put(essz.b(s3));
        }
        essp.ad(byteBuffer8.array());
        byte[] arr_b14 = ByteBuffer.allocate(33).put(byteBuffer7.array()).put(new byte[6]).put(arr_b10).put(new byte[5]).put(arr_b11).put(arr_b12).put(0).put(byteBuffer8.array()).put(essp0.J()).put(arr_b5).array();
        byte[] arr_b15 = new byte[6];
        ByteBuffer byteBuffer9 = ByteBuffer.wrap(arr_b2);
        byteBuffer9.position(estb.i.X);
        byteBuffer9.get(arr_b15, 0, estb.i.Y);
        byte[] arr_b16 = new byte[2];
        int v1 = essp0.K()[4] >> 4;
        int v2 = essp0.K()[2];
        byte[] arr_b17 = ByteBuffer.allocate(0x20).put(new byte[3]).put(new byte[8]).put(arr_b15).put(new byte[6]).put(arr_b16).put(new byte[2]).put(new byte[2]).put(((byte)(v1 & 15))).put(((byte)v2)).put(arr_b16[0]).array();
        essp0.w(arr_b17);
        byte[] arr_b18 = ByteBuffer.allocate(arr_b14.length + arr_b17.length).put(arr_b14).put(arr_b17).array();
        try {
            arr_b19 = esul.e(essz.a(byteBuffer2.array()), essp0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            estv.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.InAppResultImpl", "getCryptogram", generalSecurityException0.getLocalizedMessage(), generalSecurityException0);
            return arr_b;
        }
        try {
            arr_b20 = esul.d(arr_b18, arr_b19);
        }
        catch(GeneralSecurityException generalSecurityException1) {
            estv.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.InAppResultImpl", "getCryptogram", generalSecurityException1.getLocalizedMessage(), generalSecurityException1);
            arr_b20 = arr_b;
        }
        int v3 = ByteBuffer.wrap(this.b).getShort(estb.e.X) + 1;
        ByteBuffer.wrap(this.b).putShort(estb.e.X, ((short)v3));
        return arr_b20;
    }

    @Override  // esse
    public final byte[] g(byte[] arr_b) {
        byte[] arr_b8;
        essp essp0 = this.d;
        byte[] arr_b1 = esuq.n(essp0.f());
        byte[] arr_b2 = esuq.n(essp0.d());
        byte[] arr_b3 = esuq.n(essp0.e());
        byte[] arr_b4 = essp0.aa();
        byte[] arr_b5 = essp0.Y();
        byte[] arr_b6 = essp0.Z();
        byte[] arr_b7 = essp0.X();
        if(arr_b6 != null) {
            arr_b8 = essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b1), essy.c(0xDF12, arr_b2), essy.c(0xDF14, arr_b3), essy.c(0xDF13, arr_b4), essy.c(0xDF17, arr_b5), essy.c(0xDF19, arr_b6), essy.c(0xDF23, arr_b7), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)}));
            return ByteBuffer.allocate(arr_b8.length).put(arr_b8).array();
        }
        arr_b8 = essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b1), essy.c(0xDF12, arr_b2), essy.c(0xDF14, arr_b3), essy.c(0xDF13, arr_b4), essy.c(0xDF17, arr_b5), essy.c(0xDF23, arr_b7), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)}));
        return ByteBuffer.allocate(arr_b8.length).put(arr_b8).array();
    }

    private static final byte[] h(byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b1[v] = (byte)(arr_b[v] ^ 0xFF);
        }
        return arr_b1;
    }
}


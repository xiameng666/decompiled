import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class estu {
    public static final Logger a;
    public static final String b;
    public final estr c;
    public esur d;
    public byte[] e;
    public byte[] f;
    public boolean g;
    public ByteBuffer h;
    public essp i;
    private final esup j;
    private boolean k;

    static {
        estu.a = Logger.getLogger(estu.class.getName());
        estu.b = "GPAY: estu ";
    }

    public estu() {
        this.k = true;
        this.g = false;
        this.j = new esup();
        this.c = new estr();
    }

    public final byte a(byte[] arr_b, byte[] arr_b1) {
        boolean z = estr.t(arr_b[0], ((byte)7));
        boolean z1 = estr.t(arr_b[0], ((byte)4));
        int v = this.h.get(estb.r.X);
        byte[] arr_b2 = new byte[6];
        if(v == -91 && z && !z1) {
            this.h.put(estb.s.X, -91);
            estr estr0 = this.c;
            if(estr0.z(estm.e, arr_b)) {
                this.h.position(estb.i.X);
                this.h.get(arr_b2, 0, 6);
                estr0.p(este.j, arr_b2);
                estr0.b();
            }
            this.h.put(estb.p.X, arr_b1[0]);
            return arr_b1[0];
        }
        byte[] arr_b3 = this.d.c("9A");
        byte[] arr_b4 = this.d.c("9F21");
        estr estr1 = this.c;
        if(!z && !estu.h(estr1.G(este.n), essz.a(arr_b3) + essz.a(arr_b4))) {
            this.h.put(estb.s.X, -91);
            this.h.put(estb.p.X, arr_b1[0]);
            if(estr1.z(estm.e, arr_b)) {
                this.h.position(estb.i.X);
                this.h.get(arr_b2, 0, 6);
                estr1.p(este.j, arr_b2);
                estr1.b();
            }
            return arr_b1[0];
        }
        return -1;
    }

    public final esta b(byte[] arr_b) {
        esta esta0;
        Logger logger0 = estu.a;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "buildGpoCommandResponse", estu.b + "buildGpoCommandResponse method begin");
        int v = this.h.get(estb.w.X);
        int v1 = this.h.get(estb.v.X);
        int v2 = this.h.get(estb.s.X);
        if(v != -91) {
            esta0 = esta.a(essy.d(essy.a(0x77, new esss[]{essy.c(130, this.i.J()), essy.c(0x94, arr_b)})), 0x9000);
        }
        else if(v2 == -91) {
            esta0 = esta.a(essy.d(essy.a(0x77, new esss[]{essy.c(130, this.i.J()), essy.c(0x94, arr_b), essy.c(0xDF33, Arrays.copyOfRange(this.i.Y(), 0, 0x80))})), 0x9000);
        }
        else if(!this.k) {
            esta0 = esta.a(essy.d(essy.a(0x77, new esss[]{essy.c(130, this.i.J()), essy.c(0x94, arr_b)})), 0x9000);
        }
        else {
            esta0 = esta.a(essy.d(essy.a(0x77, new esss[]{essy.c(130, this.i.J()), essy.c(0x94, arr_b), essy.b(0xDF03, ((byte)v1))})), 0x9000);
        }
        estr.g = 4;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "buildGpoCommandResponse", "buildGpoCommandResponse method end");
        return esta0;
    }

    public final esta c(byte[] arr_b) {
        esta esta0;
        esup esup0 = this.j;
        esup0.b(arr_b);
        if(esup0.c != 0 || esup0.d != 0) {
            esta0 = esta.c;
        }
        else if(this.i.d.g + 2 != esup0.e || esup0.e < 19) {
            estu.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "validateBasicParams", estu.b + "Wrong Lc ");
            esta0 = esta.f;
        }
        else if(esup0.f != 0) {
            esta0 = esta.f;
        }
        else if(arr_b[5] == 0xFFFFFF83) {
            esta0 = esta.i;
        }
        else {
            esta0 = esta.e;
        }
        esta esta1 = esta.i;
        if(esta0 != esta1) {
            return esta0;
        }
        esur esur0 = new esur(this.i.d, arr_b);
        this.d = esur0;
        this.i.L = esur0;
        if(esur0.a && esur0.a() == esup0.e - 2) {
            if(!Arrays.equals(this.d.c("9F40"), essz.b("0000000000")) && !Arrays.equals(this.d.c("9F33"), essz.b("000000")) && !Arrays.equals(this.d.c("9A"), essz.b("000000")) && !Arrays.equals(this.d.c("9F37"), essz.b("00000000"))) {
                int v = this.d.c("DF16").length;
                return v <= 0 || v == 2 ? esta1 : esta.f;
            }
            return esta.b;
        }
        estu.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "checkCommandParameterValidation", estu.b + "Invalid lc or pDol field");
        return esta.a;
    }

    public final void d() {
        this.c.l(estk.M);
        this.h.put(estb.p.X, -1);
    }

    public final void e() {
        int v = 0;
        if(esuq.a(this.d.c("9F09")) > 1 && estr.t(this.d.c("DF3A")[1], ((byte)6))) {
            int v1 = estb.t.X;
            this.h.put(v1, 90);
            estr estr0 = this.c;
            estf estf0 = estf.e;
            byte[] arr_b = estr0.H(estf0);
            estf estf1 = estf.d;
            byte[] arr_b1 = estr0.H(estf1);
            int v2 = arr_b[0];
            if(v2 < arr_b1[0]) {
                byte[] arr_b2 = {((byte)(v2 + 1))};
                estr0.p(este.a, arr_b2);
                byte[] arr_b3 = this.d.c("DF16");
                estr0.p(este.b, arr_b3);
                this.h.put(estb.v.X, (byte)0xC0);
                this.h.put(estb.p.X, arr_b2[0]);
                goto label_38;
            }
            this.h.put(v1, 90);
            if(this.i.f() != null) {
                for(Object object0: this.i.f().entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    byte[] arr_b4 = essz.b(((String)map$Entry0.getValue()));
                    if(estr0.z(estm.a, arr_b4)) {
                        continue;
                    }
                    String s = essz.a(this.d.c("9A")) + essz.a(this.d.c("9F21"));
                    byte[] arr_b5 = (byte[])this.i.d().get(map$Entry0.getKey());
                    if(arr_b5 != null) {
                        this.i.A(Arrays.copyOfRange(arr_b5, 0, arr_b5.length));
                    }
                    if(!estu.h(estr0.G(este.n), s)) {
                        continue;
                    }
                    this.h.put(v1, -91);
                    this.h.position(estb.u.X);
                    this.h.put(essz.b(((String)map$Entry0.getKey())), 0, estb.u.Y);
                    this.h.put(estb.v.X, 0x40);
                    byte[] arr_b6 = this.i.Y();
                    Arrays.fill(arr_b6, 1, arr_b6.length, 0);
                    this.i.A(arr_b6);
                label_38:
                    byte[] arr_b7 = estr0.H(estf0);
                    byte[] arr_b8 = estr0.H(estf1);
                    byte[] arr_b9 = estr0.H(estf.g);
                    byte[] arr_b10 = estr0.H(estf.h);
                    int v3 = arr_b7[0];
                    int v4 = arr_b8[0];
                    int v5 = arr_b9[0];
                    int v6 = arr_b10[0];
                    if(((byte)(v4 - v6 - (v3 - v5))) > 0) {
                        this.h.position(estb.v.X);
                        this.h.put(estb.v.X, 0x40);
                        v = 1;
                    }
                    if(v5 < v6) {
                        this.h.put(estb.v.X, (byte)0x80);
                        v |= 10;
                    }
                    if(v == 11) {
                        this.h.put(estb.v.X, (byte)0xC0);
                    }
                    return;
                }
            }
            this.h.put(v1, 90);
            this.h.put(estb.p.X, -1);
            return;
        }
        this.h.put(estb.p.X, -1);
        this.k = false;
    }

    public final boolean f() {
        int v = esuq.a(this.d.c("DF16"));
        if(v >= 16 && (v != 0xFFFE && v != 0xFFFF)) {
            this.h.put(estb.r.X, -91);
            this.h.put(estb.w.X, -91);
            return true;
        }
        this.h.put(estb.p.X, -1);
        this.h.put(estb.w.X, 90);
        this.h.put(estb.v.X, 0);
        return false;
    }

    public final byte[] g() {
        byte[] arr_b10;
        byte[] arr_b6;
        byte[] arr_b5;
        byte[] arr_b = this.h.get(estb.s.X) == -91 ? this.c.G(este.t) : null;
        int v = 0;
        byte[] arr_b1 = Arrays.copyOfRange(esul.c(), 0, 8);
        this.h.position(estb.A.X);
        this.h.put(arr_b1, 0, estb.A.Y);
        byte[] arr_b2 = new byte[16];
        this.c.o(arr_b2);
        try {
            essp essp0 = this.i;
            byte[] arr_b3 = ByteBuffer.allocate(16).put(essz.b(essp0.w.get("prmHce").toString())).array();
            if(arr_b != null) {
                arr_b3 = new BigInteger(ByteBuffer.allocate(16).put(Arrays.copyOfRange(arr_b, 0, 8)).put(arr_b1).array()).xor(new BigInteger(arr_b3)).toByteArray();
            }
            String s = essp0.k + essp0.l;
            byte[] arr_b4 = ByteBuffer.allocate(16).put(essz.b((s.length() < 16 ? "0000000000000000".substring(0, 16 - s.length()) + s : s.substring(s.length() - 16)))).put(arr_b1).array();
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b3, "AES");
            Cipher cipher0 = Cipher.getInstance("AES/CBC/NoPadding");
            arr_b5 = esul.a;
            cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b5));
            arr_b6 = cipher0.doFinal(arr_b4);
            if(arr_b6 != null) {
                ByteBuffer.allocate(16).put(Arrays.copyOfRange(arr_b6, 0, 16));
            }
        }
        catch(NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException exception0) {
            goto label_40;
        }
        try {
            this.h.position(estb.B.X);
            this.h.put(arr_b6, 0, estb.B.Y);
            if(arr_b != null) {
                estu.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "generateQDDASign", estu.b + "generateQDDASign srvSessionKey Encrypted ");
                if(arr_b6 == null) {
                    arr_b6 = null;
                }
                else {
                    SecretKeySpec secretKeySpec1 = new SecretKeySpec(arr_b, "AES");
                    Cipher cipher1 = Cipher.getInstance("AES/CBC/NoPadding");
                    cipher1.init(1, secretKeySpec1, new IvParameterSpec(arr_b5));
                    byte[] arr_b7 = cipher1.doFinal(arr_b6);
                    if(arr_b7 != null) {
                        ByteBuffer.allocate(16).put(Arrays.copyOfRange(arr_b7, 0, 16));
                    }
                    arr_b6 = arr_b7;
                }
            }
            goto label_42;
        }
        catch(NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException exception0) {
            arr_b2 = arr_b6;
        }
    label_40:
        estu.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "generateQDDASign", ((GeneralSecurityException)exception0).getLocalizedMessage(), exception0);
        arr_b6 = arr_b2;
    label_42:
        byte[] arr_b8 = ByteBuffer.allocate(25).put(8).put(arr_b1).put(arr_b6).array();
        byte[] arr_b9 = this.d.c("9F37");
        if(this.i.W().length != this.i.U().length) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.i.U().length);
            this.i.y(byteBuffer0.array());
        }
        if(this.i.U().length != 0) {
            v = this.i.U().length - arr_b8.length - 25;
        }
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(arr_b8.length + 3 + v + arr_b9.length).put(5).put(1);
        int v1 = (byte)arr_b8.length;
        ByteBuffer byteBuffer2 = byteBuffer1.put(((byte)v1)).put(arr_b8);
        if(v > 0) {
            arr_b10 = new byte[v];
            Arrays.fill(arr_b10, -69);
            byteBuffer2.put(arr_b10).put(arr_b9);
        }
        else {
            arr_b10 = null;
        }
        byte[] arr_b11 = esul.b(byteBuffer2.array());
        byteBuffer2.clear();
        return esul.f(ByteBuffer.allocate(arr_b8.length + 5 + v + arr_b11.length).put(106).put(5).put(1).put(((byte)v1)).put(arr_b8).put(arr_b10).put(arr_b11).put(-68).array(), this.i);
    }

    private static final boolean h(byte[] arr_b, String s) {
        try {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyMMddHHmmss", Locale.getDefault());
            simpleDateFormat0.setLenient(false);
            Date date0 = simpleDateFormat0.parse(essz.a(arr_b));
            long v = 0L;
            long v1 = date0 == null ? 0L : date0.getTime();
            Date date1 = simpleDateFormat0.parse(s);
            if(date1 != null) {
                v = date1.getTime();
            }
            Date date2 = new Date();
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTimeInMillis(v);
            calendar0.add(5, -2);
            date2.setTime(calendar0.getTime().getTime());
            if(v > v1 && date2.getTime() > v1) {
                return true;
            }
        }
        catch(ParseException unused_ex) {
            estu.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "isServiceExpired", "Invalid Transaction Date Format");
        }
        return false;
    }
}


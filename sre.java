import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public final class sre extends svt {
    public final swc a;
    private final Map b;
    private final ssd c;
    private final ssr d;

    public sre(srp srp0) {
        this.b = new EnumMap(ssg.class);
        this.c = new ssd(swx.a(8));
        this.d = new ssr(swx.a(8));
        this.a = new srd(srp0);
    }

    @Override  // svt
    public final srt a() {
        return new srt(srs.a);
    }

    @Override  // svt
    public final srt b() {
        return new srt(srs.b);
    }

    public static sry c(ssg ssg0) {
        Throwable throwable2;
        BigInteger bigInteger1;
        BigInteger bigInteger0;
        ssc ssc0 = new ssc(new byte[]{-106, 2});
        srh srh0 = new srh();
        sri sri0 = srh0.b;
        srj srj0 = srh0.a;
        byte[] arr_b = srj0.b();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        stq.a(srx.g.e(), byteArrayOutputStream0);
        stq.b(srx.h.length, byteArrayOutputStream0);
        stq.a(srx.h, byteArrayOutputStream0);
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        stq.a(srx.f.e(), byteArrayOutputStream1);
        stq.b(arr_b.length, byteArrayOutputStream1);
        stq.a(arr_b, byteArrayOutputStream1);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        stq.a(srx.e.e(), byteArrayOutputStream2);
        stq.b(byteArrayOutputStream0.size() + byteArrayOutputStream1.size(), byteArrayOutputStream2);
        stq.a(byteArrayOutputStream0.toByteArray(), byteArrayOutputStream2);
        stq.a(byteArrayOutputStream1.toByteArray(), byteArrayOutputStream2);
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        stq.a(srx.d.e(), byteArrayOutputStream3);
        stq.b(srx.i.length, byteArrayOutputStream3);
        stq.a(srx.i, byteArrayOutputStream3);
        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
        stq.a(srx.b.e(), byteArrayOutputStream4);
        stq.b(byteArrayOutputStream2.size() + byteArrayOutputStream3.size(), byteArrayOutputStream4);
        stq.a(byteArrayOutputStream3.toByteArray(), byteArrayOutputStream4);
        stq.a(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream4);
        byte[] arr_b1 = byteArrayOutputStream4.toByteArray();
        ieqm ieqm0 = new ieqm(new ieqr(), new ieex());
        ieqm0.a(true, new iepr(sri0.a, swx.a));
        ieqm0.c(arr_b1, 0, arr_b1.length);
        byte[] arr_b2 = ieqm0.e();
        idpv idpv0 = null;
        try {
            idpv0 = new idpv(arr_b2);
            goto label_38;
        }
        catch(IOException iOException0) {
            IOException iOException1 = iOException0;
            throw new stt("Failed to decode ECDSA ASN.1", iOException1);
            try {
            label_38:
                idqt idqt0 = idqt.m(idpv0.b());
                idpx idpx0 = idpx.n(idqt0.h(0));
                idpx idpx1 = idpx.n(idqt0.h(1));
                bigInteger0 = idpx0.m();
                bigInteger1 = idpx1.m();
                goto label_55;
            }
            catch(IOException iOException2) {
            }
            catch(Throwable throwable1) {
                goto label_51;
            }
            iOException1 = iOException2;
            try {
                throw new stt("Failed to decode ECDSA ASN.1", iOException1);
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
                goto label_52;
            }
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_52;
        }
    label_51:
        throwable2 = throwable1;
    label_52:
        if(idpv0 != null) {
            try {
                idpv0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable2;
        try {
        label_55:
            idpv0.close();
        }
        catch(IOException unused_ex) {
        }
        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
        stq.a(srx.c.e(), byteArrayOutputStream5);
        stq.b(0x40, byteArrayOutputStream5);
        stq.a(stf.a(bigInteger0), byteArrayOutputStream5);
        stq.a(stf.a(bigInteger1), byteArrayOutputStream5);
        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
        stq.a(srx.a.e(), byteArrayOutputStream6);
        stq.b(arr_b1.length + byteArrayOutputStream5.size(), byteArrayOutputStream6);
        stq.a(arr_b1, byteArrayOutputStream6);
        stq.a(byteArrayOutputStream5.toByteArray(), byteArrayOutputStream6);
        return new sry(ssg0, ssc0, sri0, new srx(srj0.b(), byteArrayOutputStream6.toByteArray()), srh0.a);
    }

    @Override  // svt
    public final ssd d() {
        return this.c;
    }

    @Override  // svt
    public final ssr e() {
        return this.d;
    }

    @Override  // svt
    public final svt f(ssp ssp0) {
        return this;
    }

    @Override  // svt
    public final sxd g(ssg ssg0) {
        return new sxd(sre.c(ssg0));
    }

    @Override  // svt
    public final sxd h(ssg ssg0) {
        return sxd.a;
    }

    @Override  // svt
    public final sxd i(ssy ssy0) {
        return sxd.a;
    }

    @Override  // svt
    public final sxd j(ssg ssg0) {
        Map map0 = this.b;
        if(map0.containsKey(ssg0)) {
            return new sxd(((svy)map0.get(ssg0)));
        }
        ssi ssi0 = new ssi(new byte[]{(byte)0x87});
        byte[] arr_b = new byte[srk.b.e];
        svy svy0 = new svy(ssg0, ssi0, srk.b, arr_b, arr_b, arr_b, this.a);
        map0.put(ssg0, svy0);
        return new sxd(svy0);
    }

    @Override  // svt
    public final Map k() {
        return Collections.EMPTY_MAP;
    }
}


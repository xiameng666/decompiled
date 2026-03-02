import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Arrays;

public final class tte extends tix {
    private static final String a = "tte";
    private BigInteger b;
    private BigInteger c;
    private tfd d;

    static {
    }

    @Override  // tix
    public final ten a(ten ten0) {
        return new tet(ten0.g());
    }

    @Override  // tix
    public final teo b(tgn tgn0, ten ten0) {
        return this.c(((tqo)tgn0), ((tet)ten0));
    }

    public final teo c(tqo tqo0, tet tet0) {
        byte[] arr_b15;
        tgc tgc0;
        byte[] arr_b14;
        byte[] arr_b16;
        byte[] arr_b13;
        tgx tgx1;
        int v4;
        tgx tgx0;
        thb thb2;
        tgg tgg1;
        tgw tgw0;
        tjk.f("processGAC start", new Object[0]);
        int v = tet0.a() & 16;
        if(tqo0.f) {
            if(!tqo0.b()) {
                if(tet0.a[0] == 0xFFFFFF80) {
                    if((tet0.a() & 0xC0) != 0xC0) {
                        if(tet0.b() == 0) {
                            if(tet0.f()) {
                                if(tet0.d() == 0x100) {
                                    tet0.h();
                                    tgl tgl0 = tqo0.j;
                                    tgg tgg0 = tqo0.b;
                                    trq trq0 = (trq)tgg0.a().d(trq.a);
                                    tgp tgp0 = tgl0.q();
                                    tjk.f("processGAC check IAD", new Object[0]);
                                    tqx tqx0 = tgl0.w();
                                    ((tqm)tgg0.a()).g();
                                    new tgy();
                                    trq0.j();
                                    tqw tqw0 = tgl0.v();
                                    tgl tgl1 = tqo0.i;
                                    tgl1.o();
                                    ttb ttb0 = tgl1.p();
                                    tgl1.n();
                                    trq0.k();
                                    tre tre0 = tgl0.y();
                                    tjk.f("analyze_CDOL1_Data", new Object[0]);
                                    if(tgg0.a().e(tie.a)) {
                                        byte[] arr_b = ((tih)tgg0.a().d(tih.a)).d;
                                        this.b = new BigInteger(tjs.b(((tii)tgg0.a().d(tii.a)).d), 16);
                                        this.c = new BigInteger(tjs.b(arr_b), 16);
                                        tgw0 = new tgw(((tsi)tgg0.a().d(tsi.a)).b(tgw.a));
                                    }
                                    else {
                                        tgw0 = new tgw(((tsd)tgg0.a().d(tsd.a)).b(tgw.a));
                                    }
                                    tgw0.d();
                                    this.d = tgw0.n(tet0.i());
                                    byte[] arr_b1 = tgl1.f().k();
                                    byte[] arr_b2 = til.a;
                                    if(Arrays.equals(arr_b1, this.d.c(new tfg(arr_b2)).d())) {
                                        if(!Arrays.equals(tgl1.j().k(), this.d.c(new tfg(tiq.a)).d())) {
                                            throw new teq("Invalid dol data - transaction currency does not match pdol", tes.c);
                                        }
                                        tjk.f("Merging TLV data {}", new Object[]{this.d.toString()});
                                        tgl1.d(this.d);
                                        int v1 = tet0.a() & 0xC0;
                                        thb[] arr_thb = thb.values();
                                        int v2 = 0;
                                        while(v2 < arr_thb.length) {
                                            thb thb0 = arr_thb[v2];
                                            if(v1 >> 6 == thb0.e) {
                                                thb thb1 = thb.a;
                                                if(thb0.equals(thb1)) {
                                                    tjk.f("Terminal Requested AAC", new Object[0]);
                                                    tgg1 = tgg0;
                                                    thb2 = thb1;
                                                }
                                                else {
                                                    tqx tqx1 = tgl0.w();
                                                    tqt tqt0 = trq0.h();
                                                    tqu tqu0 = trq0.i();
                                                    tgg1 = tgg0;
                                                    tjk.f("performCardIssuerActionCodeAnalysis - cvr {}", new Object[]{tqx1.k()});
                                                    tjk.f("performCardIssuerActionCodeAnalysis - ciacDenial {}", new Object[]{tqt0.k()});
                                                    tjk.f("performCardIssuerActionCodeAnalysis - ciacOnline {}", new Object[]{tqu0.k()});
                                                    boolean z = tqt0.n(tqx1);
                                                    boolean z1 = tqu0.n(tqx1);
                                                    if(tqx1.u() && z1) {
                                                        tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is ARQC but Unable to go online indicated by Terminal. Returning AAC.", new Object[0]);
                                                        thb2 = thb1;
                                                    }
                                                    else if(z) {
                                                        tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is AAC.", new Object[0]);
                                                        thb2 = thb1;
                                                    }
                                                    else {
                                                        tjk.f("performCardIssuerActionCodeAnalysis - ciac analysis is ARQC.", new Object[0]);
                                                        thb2 = thb.c;
                                                    }
                                                }
                                                if(thb2 == thb1) {
                                                    tjk.f("Preparing AAC", new Object[0]);
                                                    tgx0 = new tgx(0);
                                                    tqw0.n();
                                                    tqw0.r();
                                                    tre0.n();
                                                }
                                                else {
                                                    tjk.f("Preparing ARQC", new Object[0]);
                                                    tgx0 = new tgx((byte)0x80);
                                                    tqw0.o();
                                                    tqw0.r();
                                                    if(!ttb0.j(0, 0) && tqx0.j(3, 6)) {
                                                        tqw0.j(0, 2);
                                                    }
                                                }
                                                int v3 = v == 16 ? 1 : 0;
                                                tgl0.c(tgx0);
                                                tgl0.c(tqw0);
                                                tgl0.c(tre0);
                                                tra tra0 = tqo0.h();
                                                tgl0.c(tra0);
                                                if((thb0.equals(thb.c) || thb0.equals(thb.b)) && v3 != 0) {
                                                    if(!((trz)tgg1.a().d(trz.a)).h().j(0, 0)) {
                                                        tjk.f("Invalid function - aip.isCDASupported()", new Object[0]);
                                                        throw new teq("Invalid function -  AIP is not supporting CDA", tes.e);
                                                    }
                                                    if(tgx0.n()) {
                                                        v4 = v3;
                                                        tgx1 = tgx0;
                                                        tte.d(tqo0);
                                                        arr_b13 = null;
                                                    }
                                                    else {
                                                        tqw0.e(1, 7, true);
                                                        tgl0.c(tqw0);
                                                        tra tra1 = tqo0.h();
                                                        tgl0.c(tra1);
                                                        tgs tgs0 = tqo0.a();
                                                        tgl0.c(tgs0);
                                                        byte[] arr_b3 = tgs0.k();
                                                        v4 = v3;
                                                        byte[] arr_b4 = glwl.d(new byte[][]{tqo0.m, tet0.i(), tgx0.l().c(), tgp0.l().c(), tra1.l().c()});
                                                        tjk.f("Data used for hashing: {}", new Object[]{tjs.b(arr_b4)});
                                                        byte[] arr_b5 = ghgb.a.a(arr_b4).e();
                                                        byte[] arr_b6 = tjs.d("05");
                                                        byte[] arr_b7 = tjs.d("01");
                                                        BigInteger bigInteger0 = this.b.multiply(this.c);
                                                        BigInteger bigInteger1 = this.b.subtract(BigInteger.ONE).multiply(this.c.subtract(BigInteger.ONE));
                                                        tgx1 = tgx0;
                                                        BigInteger bigInteger2 = new BigInteger((tgg1.a().e(trw.a) ? ((trw)tgg1.a().d(trw.a)) : null).e.c(new tfg(tjs.d("9f47"))).d()).modInverse(bigInteger1);
                                                        byte[] arr_b8 = this.d.c(new tfg(tga.a)).d();
                                                        int v5 = bigInteger0.toByteArray().length;
                                                        byte[] arr_b9 = this.d.c(new tfg(tit.a)).d();
                                                        byte[] arr_b10 = glwl.d(new byte[][]{tjs.d("08"), arr_b8, tgx1.k(), arr_b3, arr_b5});
                                                        int v6 = tjs.d("BB")[0];
                                                        int v7 = v5 - arr_b10.length - 26;
                                                        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v7);
                                                        for(int v8 = 0; v8 < v7; ++v8) {
                                                            byteBuffer0.put(((byte)v6));
                                                        }
                                                        byte[] arr_b11 = byteBuffer0.array();
                                                        byte[] arr_b12 = glwl.d(new byte[][]{arr_b6, arr_b7, tjs.d(Integer.toHexString(arr_b10.length)), arr_b10, arr_b11, arr_b9});
                                                        try {
                                                            PrivateKey privateKey0 = KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(bigInteger0, bigInteger2));
                                                            ieik ieik0 = new ieik();
                                                            ieev ieev0 = new ieev();
                                                            BigInteger bigInteger3 = ((RSAKey)privateKey0).getModulus();
                                                            iera iera0 = new iera(ieik0, ieev0);
                                                            iera0.a(true, new iepy(true, bigInteger3, ((RSAPrivateKey)privateKey0).getPrivateExponent()));
                                                            tjk.f("dataToBeSigned: {}", new Object[]{tjs.b(arr_b12)});
                                                            iera0.b(arr_b12[0]);
                                                            iera0.c(arr_b12, 1, arr_b12.length - 1);
                                                            arr_b13 = iera0.e();
                                                            goto label_146;
                                                        }
                                                        catch(iebv iebv0) {
                                                            iebv0.printStackTrace();
                                                        }
                                                        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                                                            noSuchAlgorithmException0.printStackTrace();
                                                        }
                                                        catch(InvalidKeySpecException invalidKeySpecException0) {
                                                            invalidKeySpecException0.printStackTrace();
                                                        }
                                                        arr_b13 = null;
                                                    label_146:
                                                        tra0 = tra1;
                                                    }
                                                }
                                                else {
                                                    v4 = v3;
                                                    tgx1 = tgx0;
                                                    tte.d(tqo0);
                                                    arr_b13 = null;
                                                }
                                                tgs tgs1 = tgl0.r();
                                                if(!thb0.equals(thb.c) && !thb0.equals(thb.b) || v4 == 0) {
                                                    try {
                                                        tgc[] arr_tgc2 = {tgx1, tgp0, tgs1, tra0};
                                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                        for(int v11 = 0; v11 < 4; ++v11) {
                                                            arr_tgc2[v11].l().b(byteArrayOutputStream2);
                                                        }
                                                        arr_b16 = byteArrayOutputStream2.toByteArray();
                                                    }
                                                    catch(tev tev2) {
                                                        throw new RuntimeException(tev2);
                                                    }
                                                    tgc0 = new tgc(arr_b16, thn.b);
                                                }
                                                else if(tgx1.n()) {
                                                    try {
                                                        tgc[] arr_tgc = {tgx1, tgp0, tgs1, tra0};
                                                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                                        for(int v9 = 0; v9 < 4; ++v9) {
                                                            arr_tgc[v9].l().b(byteArrayOutputStream0);
                                                        }
                                                        arr_b14 = byteArrayOutputStream0.toByteArray();
                                                    }
                                                    catch(tev tev0) {
                                                        throw new RuntimeException(tev0);
                                                    }
                                                    tgc0 = new tgc(arr_b14, thn.b);
                                                }
                                                else {
                                                    tgc[] arr_tgc1 = {tgx1, tgp0, new tho(arr_b13), tra0};
                                                    try {
                                                        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                                                        for(int v10 = 0; v10 < 4; ++v10) {
                                                            arr_tgc1[v10].l().b(byteArrayOutputStream1);
                                                        }
                                                        arr_b15 = byteArrayOutputStream1.toByteArray();
                                                    }
                                                    catch(tev tev1) {
                                                        throw new RuntimeException(tev1);
                                                    }
                                                    tgc0 = new tgc(arr_b15, thn.b);
                                                }
                                                teo teo0 = new teo(tgc0.l().c(), tes.g);
                                                tre0.p(false);
                                                tre0.e(1, 0, true);
                                                tgl0.c(tre0);
                                                tjk.f(" Setting transaction to completed", new Object[0]);
                                                tgl tgl2 = tqo0.j;
                                                byte[] arr_b17 = tgx.a;
                                                if(!tgl2.a(arr_b17)) {
                                                    throw new RuntimeException("CID is missing");
                                                }
                                                if(tgl2.s().k()[0] == 0xFFFFFF80) {
                                                    tjk.f(" Setting transaction to APPROVED", new Object[0]);
                                                    tqo0.c = tgo.b;
                                                    tjk.f("processGAC end, MSI: {}, CTI: {}, CVR: {}", new Object[]{tre0.toString(), tqw0.toString(), tqx0.toString()});
                                                    return teo0;
                                                }
                                                if(!tgl2.a(arr_b17)) {
                                                    throw new RuntimeException("CID is missing");
                                                }
                                                if(tgl2.s().n()) {
                                                    tjk.f(" Setting transaction to DECLINED", new Object[0]);
                                                    tqo0.c = tgo.c;
                                                }
                                                tjk.f("processGAC end, MSI: {}, CTI: {}, CVR: {}", new Object[]{tre0.toString(), tqw0.toString(), tqx0.toString()});
                                                return teo0;
                                            }
                                            ++v2;
                                            v1 = v1;
                                            arr_thb = arr_thb;
                                            tgg0 = tgg0;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                    tjk.f("PDOL 9F02 : {}", new Object[]{tgl1.f().k()});
                                    tjk.f("CDOL 9F02 : {}", new Object[]{this.d.c(new tfg(arr_b2)).d()});
                                    throw new teq("Invalid dol data - amount authorized does not match pdol", tes.c);
                                }
                                tjk.f("Processing [GPO] - Le required and is non-zero", new Object[0]);
                                throw new teq("Le required and is non-zero", tes.k);
                            }
                            tjk.f("Processing [GPO] - Le absent", new Object[0]);
                            throw new teq("Le absent", tes.k);
                        }
                        tjk.f("Processing [GEN AC] - incorrect P2 != 0x00", new Object[0]);
                        throw new teq("incorrect P2", tes.f);
                    }
                    tjk.f("Processing [GEN AC] - incorrect P1 b8-7 = \'11\'", new Object[0]);
                    throw new teq("incorrect P1", tes.f);
                }
                tjk.f("Processing [GEN AC] - incorrect CLA != 0x80", new Object[0]);
                throw new teq("incorrect CLA", tes.b);
            }
            tjk.f("Invalid state - GEN AC already performed", new Object[0]);
            throw new teq("Invalid state - GEN AC already performed", tes.c);
        }
        tjk.f("Invalid state - GPO must be performed", new Object[0]);
        throw new teq("Invalid state - GPO must be performed", tes.c);
    }

    private static final void d(tqo tqo0) {
        tgs tgs0 = tqo0.a();
        tqo0.j.c(tgs0);
    }
}


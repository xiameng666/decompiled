import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

public final class esrs implements essa {
    public final int a;
    public boolean b;
    public int c;
    private static final bboh d;
    private static final byte[] e;
    private final byte f;
    private final byte[] g;
    private final byte[] h;
    private final essb i;
    private int j;
    private final esrq k;
    private final MessageDigest l;
    private final essh m;

    static {
        esrs.d = bboh.b("TapAndPay", bbcu.aM);
        esrs.e = new byte[]{(byte)0x90, 0};
    }

    public esrs(esrq esrq0, JSONObject jSONObject0, essb essb0) {
        this.b = false;
        this.j = 0;
        this.c = 3;
        this.m = new esrr(this);
        this.k = esrq0;
        try {
            this.a = Integer.parseInt(jSONObject0.getString("atc"), 16);
            this.g = esxg.c(jSONObject0.getString("keyValue"));
            this.f = (byte)Integer.parseInt(jSONObject0.getString("imkIndex"), 16);
            this.h = esxg.c(("0" + jSONObject0.getString("expDate")));
            this.i = essb0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalArgumentException(jSONException0);
        }
        try {
            this.l = MessageDigest.getInstance("SHA-1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new SecurityException(noSuchAlgorithmException0);
        }
    }

    @Override  // essa
    public final essh a() {
        return this.m;
    }

    private final byte[] b(byte[] arr_b) {
        this.c = 5;
        arr_b[0] = (byte)(arr_b[0] | 2);
        esru esru0 = new esru(0x77);
        esru0.e(new esrv(0x9F71, arr_b));
        esru0.e(new esrv(0x9F26, new byte[8]));
        esru0.e(new esrv(0x9F27, (byte)0x80));
        esru0.e(new esrv(0));
        esru0.e(new esrv(0x9F10, new byte[0x20]));
        return esru0.d(esrs.e);
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        byte[] arr_b14;
        byte[] arr_b7;
        byte b;
        int v = arr_b[0];
        if(v == 0) {
            if(arr_b[1] == -92) {
                this.j = 0;
                if(arr_b[2] != 4) {
                    return esvx.t.a();
                }
                String s = esxg.b(Arrays.copyOfRange(arr_b, 5, (arr_b[4] & 0xFF) + 5));
                byte[] arr_b1 = (byte[])this.k.b.get(s);
                if(arr_b1 != null) {
                    this.j = 1;
                    return arr_b1;
                }
                return esvx.r.a();
            }
            v = 0;
        }
        switch(v) {
            case 0xFFFFFF80: {
                if(arr_b[1] == -90) {
                    if(this.j != 1) {
                        this.c = 6;
                        return esvx.l.a();
                    }
                    if(arr_b[2] == 0 && arr_b[3] == 0) {
                        int v1 = arr_b[4] & 0xFF;
                        if(v1 < 27) {
                            ((ggtj)esrs.d.j()).z("Invalid ODOL length: %d", v1);
                            this.c = 6;
                            return esvx.g.a();
                        }
                        byte[] arr_b2 = new byte[v1];
                        System.arraycopy(arr_b, 5, arr_b2, 0, v1);
                        int v2 = arr_b2[0];
                        int v3 = arr_b2[1];
                        byte[] arr_b3 = new byte[5];
                        byte[] arr_b4 = new byte[2];
                        essb essb0 = this.i;
                        if(essb0.b()) {
                            arr_b4[0] = (byte)(arr_b4[0] | 1);
                        }
                        if((v2 & 2) == 0) {
                            b = 0x7B;
                        }
                        else if(!this.k.c && (v2 & 1) == 0) {
                            b = 0x7D;
                        }
                        else {
                            b = 0x7F;
                        }
                        if((v3 & 0x20) != 0 || (v2 & 4) != 0) {
                            b = 0x7F;
                        }
                        esrq esrq0 = this.k;
                        esrp esrp0 = (esrp)esrq0.d.get(Integer.valueOf(b));
                        if(b != 0x7F) {
                            batl.s(esrp0);
                            if(b != 0x7D) {
                                if((v2 & 0x20) != 0) {
                                    if(essb0.b()) {
                                        byte b1 = (byte)(arr_b4[0] | 1);
                                        arr_b4[0] = b1;
                                        if((v2 & 1) == 0) {
                                            if((esrp0.a[0] & 0x20) == 0) {
                                                arr_b4[0] = (v3 & 0x40) == 0 ? ((byte)(b1 | 0x20)) : ((byte)(b1 | 0xFFFFFF80));
                                            }
                                        }
                                        else if((esrp0.a[0] & 0xFFFFFF80) == 0) {
                                            arr_b4[0] = (byte)(b1 | 0xFFFFFF80);
                                        }
                                    }
                                    else {
                                        byte b2 = (byte)(arr_b4[0] & -2);
                                        arr_b4[0] = b2;
                                        if((v2 & 1) == 0) {
                                            if((v3 & 0x40) == 0) {
                                                if(essb0.c()) {
                                                    arr_b4[0] = (byte)(arr_b4[0] | 0x20);
                                                    goto label_100;
                                                }
                                                return this.b(arr_b4);
                                            }
                                            return this.b(arr_b4);
                                        }
                                        else {
                                            if((esrp0.a[0] & 0xFFFFFF80) != 0) {
                                                return this.b(arr_b4);
                                            }
                                            arr_b4[0] = (byte)(b2 | 0xFFFFFF80);
                                        }
                                    }
                                }
                                else if((v2 & 1) != 0) {
                                    arr_b4[0] = (byte)(arr_b4[0] | 0xFFFFFF80);
                                }
                                else if((v3 & 0x40) == 0) {
                                    if(essb0.c()) {
                                        arr_b4[0] = (byte)(arr_b4[0] | 0x20);
                                        goto label_100;
                                    }
                                    return this.b(arr_b4);
                                }
                                else {
                                    arr_b4[0] = (byte)(arr_b4[0] | 0xFFFFFF80);
                                }
                            }
                            else if((v3 & 0x40) == 0) {
                                if(essb0.c()) {
                                    arr_b4[0] = (byte)(arr_b4[0] | 0x20);
                                    arr_b3[0] = (byte)(arr_b3[0] | 8);
                                    goto label_100;
                                }
                                return this.b(arr_b4);
                            }
                            else if((v2 & 0x20) != 0) {
                                if(essb0.b()) {
                                    arr_b4[0] = (byte)(arr_b4[0] | 1);
                                    arr_b3[0] = (byte)(arr_b3[0] | 8);
                                    goto label_100;
                                }
                                arr_b4[0] = (byte)(arr_b4[0] & -2);
                                return this.b(arr_b4);
                            }
                            else {
                                b = 0x7F;
                            }
                        }
                    label_100:
                        byte b3 = b == 0x7F ? 0 : (byte)0x80;
                        if(b3 == 0xFFFFFF80) {
                            arr_b3[0] = (byte)(arr_b3[0] | 0x20);
                        }
                        byte b4 = arr_b4[0];
                        byte[] arr_b5 = esrq0.e;
                        arr_b5[0] = 15;
                        arr_b5[1] = esrq0.h;
                        arr_b5[2] = this.f;
                        System.arraycopy(arr_b3, 0, arr_b5, 3, 5);
                        arr_b5[16] = 10;
                        arr_b5[17] = b;
                        arr_b5[29] = b4;
                        System.arraycopy(this.h, 0, arr_b5, 30, 2);
                        byte[] arr_b6 = new byte[65];
                        System.arraycopy(arr_b2, 2, arr_b6, 0, 14);
                        System.arraycopy(arr_b2, 16, arr_b6, 19, 10);
                        arr_b6[0x1F] = (byte)(this.a >> 8);
                        arr_b6[0x20] = (byte)this.a;
                        System.arraycopy(arr_b5, 0, arr_b6, 33, 0x20);
                        try {
                            gnrn gnrn0 = new gnrn(this.g);
                            this.b = true;
                            arr_b7 = gnrn0.a(arr_b6, 8);
                        }
                        catch(Exception exception0) {
                            throw new SecurityException(exception0);
                        }
                        esru esru0 = new esru(0x77);
                        esru0.e(new esrv(0x9F71, arr_b4));
                        if(b == 0x7D && esrp0 != null) {
                            esru0.e(new esrv(0x94, esrp0.b));
                        }
                        esru0.e(new esrv(0x9F27, b3));
                        int v4 = (short)this.a;
                        esru0.e(new esrv(((short)v4)));
                        esru0.e(new esrv(0x9F26, arr_b7));
                        esru0.e(new esrv(0x9F10, arr_b5));
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        byteArrayOutputStream0.write(esru0.b(), 0, esru0.b().length);
                        byte[] arr_b8 = esrp0 == null ? null : esrp0.c;
                        if(arr_b8 != null) {
                            byteArrayOutputStream0.write(arr_b8, 0, arr_b8.length);
                        }
                        byte[] arr_b9 = byteArrayOutputStream0.toByteArray();
                        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                        byteArrayOutputStream1.write(arr_b9, 0, arr_b9.length);
                        if(b == 0x7D) {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            byteArrayOutputStream2.write(arr_b2, 0, v1);
                            byteArrayOutputStream2.write(arr_b9, 0, arr_b9.length);
                            byte[] arr_b10 = new byte[4];
                            System.arraycopy(arr_b2, 22, arr_b10, 0, 4);
                            byte[] arr_b11 = byteArrayOutputStream2.toByteArray();
                            byte[] arr_b12 = this.l.digest(arr_b11);
                            int v5 = this.k.f.getModulus().bitLength() / 8;
                            batl.m(v5 > 0x3F, "DDA key size must exceed 63");
                            byte[] arr_b13 = new byte[v5];
                            arr_b13[0] = 106;
                            arr_b13[1] = 5;
                            arr_b13[2] = 1;
                            arr_b13[3] = 38;
                            arr_b13[4] = 8;
                            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b13);
                            byteBuffer0.position(5);
                            byteBuffer0.putShort(((short)v4));
                            Arrays.fill(arr_b13, byteBuffer0.position(), byteBuffer0.position() + 6, 0);
                            arr_b13[13] = b3;
                            System.arraycopy(arr_b7, 0, arr_b13, 14, 8);
                            System.arraycopy(arr_b12, 0, arr_b13, 22, 20);
                            int v6 = ((short)(v5 - 0x3F)) + 42;
                            Arrays.fill(arr_b13, 42, v6, -69);
                            System.arraycopy(arr_b10, 0, arr_b13, ((int)(((short)v6))), 4);
                            this.l.update(arr_b13, 1, ((int)(((short)(v5 - 18)))));
                            System.arraycopy(this.l.digest(), 0, arr_b13, ((int)(((short)v6))), 20);
                            arr_b13[((short)(((short)(v5 - 0x3F)) + 62))] = -68;
                            try {
                                Cipher cipher0 = Cipher.getInstance("RSA/ECB/NoPadding");
                                cipher0.init(1, this.k.f);
                                arr_b14 = cipher0.doFinal(arr_b13, 0, v5);
                            }
                            catch(Exception exception1) {
                                throw new SecurityException(exception1);
                            }
                            esru0.e(new esrv(0x9F4B, arr_b14));
                            byte[] arr_b15 = new esrv(0x9F4B, arr_b14).c();
                            byteArrayOutputStream1.write(arr_b15, 0, arr_b15.length);
                        }
                        byte[] arr_b16 = byteArrayOutputStream1.toByteArray();
                        if(arr_b16.length > 0x100) {
                            this.c = 0;
                            return esvx.h.a();
                        }
                        byte[] arr_b17 = new esrv(0x77, arr_b16).c();
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        byteArrayOutputStream3.write(arr_b17, 0, arr_b17.length);
                        byteArrayOutputStream3.write(esrs.e, 0, 2);
                        if(byteArrayOutputStream3.toByteArray().length > 0x102) {
                            this.c = 0;
                            return esvx.i.a();
                        }
                        this.c = 1;
                        return byteArrayOutputStream3.toByteArray();
                    }
                    this.c = 7;
                    return esvx.t.a();
                }
                break;
            }
            case 0: {
                if(arr_b[1] == -78) {
                    byte[] arr_b18 = (byte[])this.k.g.get(String.format("%02x%02x", ((int)((arr_b[3] & 0xFF) >> 3)), ((int)(arr_b[2] & 0xFF))));
                    return arr_b18 == null ? esvx.s.a() : arr_b18;
                }
                break;
            }
            default: {
                return esvx.x.a();
            }
        }
        return esvx.x.a();
    }
}


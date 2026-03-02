package org.bouncycastle.jcajce.provider.asymmetric.x509;

import idqt;
import ifug;
import ifuh;
import ifui;
import ifuj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

class PEMUtil {
    private final PEMUtil.Boundaries[] _supportedBoundaries;

    public PEMUtil(String s) {
        this._supportedBoundaries = new PEMUtil.Boundaries[]{new PEMUtil.Boundaries(s, null), new PEMUtil.Boundaries("X509 " + s, null), new PEMUtil.Boundaries("PKCS7", null)};
    }

    private PEMUtil.Boundaries getBoundaries(String s) {
        int v = 0;
        while(true) {
            PEMUtil.Boundaries[] arr_pEMUtil$Boundaries = this._supportedBoundaries;
            if(v == arr_pEMUtil$Boundaries.length) {
                break;
            }
            PEMUtil.Boundaries pEMUtil$Boundaries0 = arr_pEMUtil$Boundaries[v];
            if(!pEMUtil$Boundaries0.isTheExpectedHeader(s) && !pEMUtil$Boundaries0.isTheExpectedFooter(s)) {
                ++v;
                continue;
            }
            return pEMUtil$Boundaries0;
        }
        return null;
    }

    private String readLine(InputStream inputStream0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        while(true) {
            int v = inputStream0.read();
            if(v != 10 && v != 13 && v >= 0) {
                stringBuffer0.append(((char)v));
            }
            else if(v < 0 || stringBuffer0.length() != 0) {
                break;
            }
        }
        if(v < 0) {
            return stringBuffer0.length() == 0 ? null : stringBuffer0.toString();
        }
        if(v == 13) {
            inputStream0.mark(1);
            int v1 = inputStream0.read();
            if(v1 == 10) {
                inputStream0.mark(1);
                inputStream0.reset();
                return stringBuffer0.toString();
            }
            if(v1 > 0) {
                inputStream0.reset();
            }
        }
        return stringBuffer0.toString();
    }

    public idqt readPEMObject(InputStream inputStream0, boolean z) {
        StringBuffer stringBuffer0 = new StringBuffer();
        PEMUtil.Boundaries pEMUtil$Boundaries0 = null;
        while(pEMUtil$Boundaries0 == null) {
            String s = this.readLine(inputStream0);
            if(s == null) {
                break;
            }
            pEMUtil$Boundaries0 = this.getBoundaries(s);
            if(pEMUtil$Boundaries0 != null && !pEMUtil$Boundaries0.isTheExpectedHeader(s)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if(pEMUtil$Boundaries0 == null) {
            if(!z) {
                return null;
            }
            throw new IOException("malformed PEM data: no header found");
        }
        PEMUtil.Boundaries pEMUtil$Boundaries1 = null;
        while(pEMUtil$Boundaries1 == null) {
            String s1 = this.readLine(inputStream0);
            if(s1 == null) {
                break;
            }
            pEMUtil$Boundaries1 = this.getBoundaries(s1);
            if(pEMUtil$Boundaries1 == null) {
                stringBuffer0.append(s1);
                continue;
            }
            else {
                if(pEMUtil$Boundaries0.isTheExpectedFooter(s1)) {
                    continue;
                }
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
            break;
        }
        if(pEMUtil$Boundaries1 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if(stringBuffer0.length() != 0) {
            try {
                String s2 = stringBuffer0.toString();
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(s2.length() / 4 * 3);
                try {
                    ifuj ifuj0 = ifug.a;
                    byte[] arr_b = new byte[54];
                    int v;
                    for(v = s2.length(); v > 0 && ifuh.a(s2.charAt(v - 1)); --v) {
                    }
                    if(v != 0) {
                        int v1 = v;
                        int v2 = 0;
                        while(v1 > 0 && v2 != 4) {
                            --v1;
                            if(!ifuh.a(s2.charAt(v1))) {
                                ++v2;
                            }
                        }
                        int v3 = ifuh.b(s2, 0, v1);
                        int v4 = 0;
                        while(v3 < v1) {
                            int v5 = ((ifuh)ifuj0).c[s2.charAt(v3)];
                            int v6 = ifuh.b(s2, v3 + 1, v1);
                            int v7 = ((ifuh)ifuj0).c[s2.charAt(v6)];
                            int v8 = ifuh.b(s2, v6 + 1, v1);
                            int v9 = ((ifuh)ifuj0).c[s2.charAt(v8)];
                            int v10 = ifuh.b(s2, v8 + 1, v1);
                            int v11 = ((ifuh)ifuj0).c[s2.charAt(v10)];
                            if((v5 | v7 | v9 | v11) < 0) {
                                throw new IOException("invalid characters encountered in base64 data");
                            }
                            arr_b[v4] = (byte)(v5 << 2 | v7 >> 4);
                            int v12 = v4 + 2;
                            arr_b[v4 + 1] = (byte)(v7 << 4 | v9 >> 2);
                            v4 += 3;
                            arr_b[v12] = (byte)(v11 | v9 << 6);
                            if(v4 == 54) {
                                byteArrayOutputStream0.write(arr_b);
                                v4 = 0;
                            }
                            v3 = ifuh.b(s2, v10 + 1, v1);
                        }
                        if(v4 > 0) {
                            byteArrayOutputStream0.write(arr_b, 0, v4);
                        }
                        int v13 = ifuh.b(s2, v3, v);
                        int v14 = ifuh.b(s2, v13 + 1, v);
                        int v15 = ifuh.b(s2, v14 + 1, v);
                        int v16 = s2.charAt(v13);
                        int v17 = s2.charAt(v14);
                        int v18 = s2.charAt(v15);
                        int v19 = s2.charAt(ifuh.b(s2, v15 + 1, v));
                        int v20 = ((ifuh)ifuj0).b;
                        if(v18 == v20) {
                            if(v19 != v20) {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                            int v28 = ((ifuh)ifuj0).c[v16];
                            int v29 = ((ifuh)ifuj0).c[v17];
                            if((v28 | v29) < 0) {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                            byteArrayOutputStream0.write(v29 >> 4 | v28 << 2);
                        }
                        else if(v19 == v20) {
                            int v21 = ((ifuh)ifuj0).c[v16];
                            int v22 = ((ifuh)ifuj0).c[v17];
                            int v23 = ((ifuh)ifuj0).c[v18];
                            if((v21 | v22 | v23) < 0) {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                            byteArrayOutputStream0.write(v21 << 2 | v22 >> 4);
                            byteArrayOutputStream0.write(v23 >> 2 | v22 << 4);
                        }
                        else {
                            int v24 = ((ifuh)ifuj0).c[v16];
                            int v25 = ((ifuh)ifuj0).c[v17];
                            int v26 = ((ifuh)ifuj0).c[v18];
                            int v27 = ((ifuh)ifuj0).c[v19];
                            if((v24 | v25 | v26 | v27) < 0) {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                            byteArrayOutputStream0.write(v24 << 2 | v25 >> 4);
                            byteArrayOutputStream0.write(v25 << 4 | v26 >> 2);
                            byteArrayOutputStream0.write(v27 | v26 << 6);
                        }
                    }
                }
                catch(Exception exception0) {
                    throw new ifui("unable to decode base64 string: " + exception0.getMessage(), exception0);
                }
                return idqt.m(byteArrayOutputStream0.toByteArray());
            }
            catch(Exception unused_ex) {
                throw new IOException("malformed PEM data encountered");
            }
        }
        return null;
    }
}


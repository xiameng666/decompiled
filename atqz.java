import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class atqz extends cjtm {
    private final atqq a;
    private final atqu b;
    private final EAPAKARequest c;
    private final bcqx d;
    private final UUID e;

    public atqz(Context context0, atqq atqq0, atqu atqu0, EAPAKARequest eAPAKARequest0, azug azug0) {
        super(0xBF, "EAPAKA", azug0);
        this.a = atqq0;
        this.b = atqu0;
        this.c = eAPAKARequest0;
        this.d = bcqx.a(context0);
        this.e = UUID.randomUUID();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s9;
        String s8;
        byte[] arr_b26;
        byte[] arr_b25;
        UUID uUID1;
        bcqx bcqx1;
        int v28;
        byte[] arr_b12;
        CharSequence charSequence0;
        byte[] arr_b8;
        byte[] arr_b6;
        byte[] arr_b5;
        boolean z2;
        byte b;
        byte[] arr_b2;
        byte[] arr_b1;
        boolean z;
        byte[] arr_b;
        String s1;
        int v3;
        TelephonyManager telephonyManager1;
        int v2;
        Context context1;
        TelephonyManager telephonyManager0;
        int v1;
        int v;
        String s;
        Integer integer0;
        baun baun0;
        atqz atqz0 = this;
        bcqx bcqx0 = atqz0.d;
        UUID uUID0 = atqz0.e;
        bcqx0.L(uUID0, 16);
        if(!hrde.f()) {
            bcqx0.f(uUID0, gmfz.bc, gmfx.ae);
            atqz0.j(new Status(33001));
            return;
        }
        try {
            baun0 = atqz0.a.a;
            integer0 = atqz0.c.d;
            s = atqz0.c.a;
            baun0.d("req.appType: " + atqz0.c.c + "; req.authType: " + atqz0.c.b + "; req.subId: " + integer0 + "; req.isimRequest: " + s, new Object[0]);
            v = atqz0.c.c == null || ((int)atqz0.c.c) == 0 ? 2 : ((int)atqz0.c.c);
            v1 = atqz0.c.b == null ? 0 : ((int)atqz0.c.b);
            telephonyManager0 = integer0 == null || ((int)integer0) == -1 ? atqz0.a.b : atqz0.a.b.createForSubscriptionId(integer0.intValue());
            if(atqz0.c.e == 1) {
                goto label_16;
            }
            else {
                goto label_379;
            }
            goto label_399;
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_385;
        }
        catch(JSONException unused_ex) {
            goto label_390;
        }
        catch(gdgw unused_ex) {
            goto label_395;
        }
        try {
        label_16:
            if(!hrde.e()) {
                baun0.m("Received a TS.43 auth request, but TS.43 is not enabled", new Object[0]);
                throw new UnsupportedOperationException("TS.43 authentication is not enabled on this device");
            }
            context1 = AppContextProvider.a();
            v2 = (int)integer0;
            if(!SubscriptionManager.isValidSubscriptionId(v2)) {
                telephonyManager1 = (TelephonyManager)context1.getSystemService(TelephonyManager.class);
                goto label_25;
            }
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_384;
        }
        catch(JSONException unused_ex) {
            goto label_389;
        }
        catch(gdgw unused_ex) {
            goto label_394;
        }
        try {
            telephonyManager1 = ((TelephonyManager)context1.getSystemService(TelephonyManager.class)).createForSubscriptionId(v2);
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_385;
        }
        catch(JSONException unused_ex) {
            goto label_390;
        }
        catch(gdgw unused_ex) {
            goto label_395;
        }
        try {
        label_25:
            v3 = (int)integer0;
            if(!SubscriptionManager.isValidSubscriptionId(v3)) {
                TelephonyManager telephonyManager2 = (TelephonyManager)context1.getSystemService(TelephonyManager.class);
                goto label_30;
            }
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_384;
        }
        catch(JSONException unused_ex) {
            goto label_389;
        }
        catch(gdgw unused_ex) {
            goto label_394;
        }
        try {
            ((TelephonyManager)context1.getSystemService(TelephonyManager.class)).createForSubscriptionId(v3);
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_385;
        }
        catch(JSONException unused_ex) {
            goto label_390;
        }
        catch(gdgw unused_ex) {
            goto label_395;
        }
        try {
        label_30:
            s1 = new JSONObject(s).getString("eap-relay-packet");
        }
        catch(UnsupportedOperationException unused_ex) {
            goto label_384;
        }
        catch(JSONException unused_ex) {
            goto label_389;
        }
        catch(gdgw unused_ex) {
            goto label_394;
        }
        try {
            if(TextUtils.isEmpty(s1)) {
                goto label_91;
            }
            else {
                arr_b = Base64.decode(s1, 0);
                gdgy.b(arr_b);
                gdha.a();
                if(arr_b.length <= 8) {
                    z = false;
                    arr_b1 = null;
                    arr_b2 = null;
                    b = -1;
                }
                else {
                    int v4 = arr_b[0];
                    b = arr_b[1];
                    goto label_42;
                }
            }
            goto label_102;
        }
        catch(Exception exception0) {
            goto label_97;
        }
        try {
        label_42:
            if(v4 == 1 && (arr_b[3] & 0xFF | (arr_b[2] & 0xFF) << 8) == arr_b.length && arr_b[4] == 23 && arr_b[5] == 1) {
                goto label_48;
            }
            else {
                goto label_50;
            }
            goto label_51;
        }
        catch(Exception exception0) {
            arr_b1 = null;
            arr_b2 = null;
            goto label_100;
        }
    label_48:
        boolean z1 = true;
        goto label_51;
    label_50:
        z1 = false;
    label_51:
        if(z1) {
            int v5 = 8;
            arr_b1 = null;
            arr_b2 = null;
            try {
                while(v5 < arr_b.length) {
                    int v6 = arr_b.length - v5;
                    if(v6 <= 2) {
                        goto label_101;
                    }
                    int v7 = arr_b[v5];
                    int v8 = (arr_b[v5 + 1] & 0xFF) * 4;
                    if(v8 > v6) {
                        goto label_101;
                    }
                    switch(v7) {
                        case 1: {
                            if(v8 != 20) {
                                goto label_101;
                            }
                            arr_b1 = new byte[16];
                            System.arraycopy(arr_b, v5 + 4, arr_b1, 0, 16);
                            v5 += 20;
                            continue;
                        }
                        case 2: {
                            if(v8 != 20) {
                                goto label_101;
                            }
                            byte[] arr_b3 = new byte[16];
                            arr_b2 = arr_b3;
                            System.arraycopy(arr_b, v5 + 4, arr_b3, 0, 16);
                            arr_b2 = arr_b3;
                            v5 += 20;
                            continue;
                        }
                        default: {
                            v5 += v8;
                        }
                    }
                }
                if(arr_b1 == null) {
                    Arrays.toString(null);
                    Arrays.toString(arr_b2);
                    goto label_101;
                }
                else if(arr_b2 == null) {
                    Arrays.toString(arr_b1);
                    Arrays.toString(null);
                    goto label_101;
                }
                else {
                    z = true;
                }
                goto label_102;
            }
            catch(Exception exception0) {
                goto label_100;
            }
            try {
            label_91:
                z = false;
                arr_b1 = null;
                arr_b2 = null;
                b = -1;
                goto label_102;
            }
            catch(Exception exception0) {
            label_97:
                arr_b1 = null;
                arr_b2 = null;
                b = -1;
            }
            try {
            label_100:
                Log.e("WfcActivationActivity", "parseEapAkaChallengeRequest Exception:", exception0);
            label_101:
                z = false;
            label_102:
                if(!z) {
                    throw new gdgw("EAP-AKA Challenge message not valid!");
                }
                byte[] arr_b4 = new byte[34];
                arr_b4[0] = 16;
                System.arraycopy(arr_b1, 0, arr_b4, 1, 16);
                arr_b4[17] = 16;
                System.arraycopy(arr_b2, 0, arr_b4, 18, 16);
                String s2 = Base64.encodeToString(arr_b4, 2).trim();
                gdha.a();
                String s3 = telephonyManager1.getIccAuthentication(2, 0x81, s2);
                if(TextUtils.isEmpty(s3)) {
                    z2 = false;
                    arr_b5 = null;
                    arr_b6 = null;
                    arr_b8 = null;
                }
                else {
                    gdha.a();
                    byte[] arr_b7 = Base64.decode(s3, 0);
                    gdgy.b(arr_b7);
                    gdha.a();
                    if(arr_b7.length <= 2) {
                        z2 = false;
                        arr_b5 = null;
                        arr_b6 = null;
                        arr_b8 = null;
                    }
                    else if((arr_b7[0] & 0xFF) == 0xDB) {
                        int v9 = arr_b7[1] & 0xFF;
                        if(v9 + 1 < arr_b7.length) {
                            arr_b5 = new byte[v9];
                            System.arraycopy(arr_b7, 2, arr_b5, 0, v9);
                            int v10 = arr_b7[v9 + 2] & 0xFF;
                            if(v9 + 2 + v10 >= arr_b7.length) {
                                z2 = false;
                                arr_b6 = null;
                                arr_b8 = null;
                            }
                            else {
                                arr_b6 = new byte[v10];
                                System.arraycopy(arr_b7, v9 + 3, arr_b6, 0, v10);
                                int v11 = v9 + 3 + v10;
                                int v12 = arr_b7[v11] & 0xFF;
                                if(v11 + v12 < arr_b7.length) {
                                    arr_b8 = new byte[v12];
                                    System.arraycopy(arr_b7, v11 + 1, arr_b8, 0, v12);
                                    int v13 = v11 + 1 + v12;
                                    if(v13 < arr_b7.length) {
                                        int v14 = arr_b7[v13] & 0xFF;
                                        if(v13 + v14 < arr_b7.length) {
                                            System.arraycopy(arr_b7, v13 + 1, new byte[v14], 0, v14);
                                        }
                                    }
                                    z2 = true;
                                }
                                else {
                                    z2 = false;
                                    arr_b8 = null;
                                }
                            }
                        }
                        else {
                            z2 = false;
                            arr_b5 = null;
                            arr_b6 = null;
                            arr_b8 = null;
                        }
                    }
                    else {
                        z2 = false;
                        arr_b5 = null;
                        arr_b6 = null;
                        arr_b8 = null;
                    }
                }
                if(!z2) {
                    throw new gdgw("Invalid SIM EAP-AKA authentication response!");
                }
                String s4 = telephonyManager1.getSubscriberId();
                String s5 = telephonyManager1.getSimOperator();
                if(s5 != null && s5.length() >= 5) {
                    String s6 = s5.substring(3);
                    charSequence0 = a.ak(s5.substring(0, 3), (s6.length() == 2 ? "0" + s6 : s5.substring(3)), new StringBuilder(), s4, "0", "@nai.epc.mnc", ".mcc", ".3gppnetwork.org");
                }
                else {
                    charSequence0 = null;
                }
                byte[] arr_b9 = null;
                if(!TextUtils.isEmpty(charSequence0) && arr_b8.length != 0 && arr_b6.length != 0) {
                    byte[] arr_b10 = ((String)charSequence0).getBytes(StandardCharsets.UTF_8);
                    int v15 = arr_b10.length + arr_b8.length;
                    byte[] arr_b11 = new byte[v15 + arr_b6.length];
                    System.arraycopy(arr_b10, 0, arr_b11, 0, arr_b10.length);
                    System.arraycopy(arr_b8, 0, arr_b11, arr_b10.length, arr_b8.length);
                    System.arraycopy(arr_b6, 0, arr_b11, v15, arr_b6.length);
                    try {
                        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-1");
                        messageDigest0.update(arr_b11);
                        arr_b9 = messageDigest0.digest();
                        gdgy.b(arr_b9);
                        gdha.a();
                    }
                    catch(NoSuchAlgorithmException unused_ex) {
                    }
                }
                if(arr_b9 == null) {
                label_310:
                    bcqx1 = bcqx0;
                    uUID1 = uUID0;
                    String s7 = arr_b9 == null ? "null" : ((int)arr_b9.length);
                    Log.e("WfcActivationActivity", "Not a valid XKey!length=" + s7.toString());
                    arr_b12 = null;
                }
                else {
                    if(arr_b9.length == 20) {
                        int[] arr_v = {0x67452301, 0xEFCDAB89, 0x98BADCFE, 0x10325476, -1009589776};
                        arr_b12 = new byte[0xA0];
                        int v16 = 0;
                        for(int v17 = 0; v17 < 4; ++v17) {
                            int v18 = 0;
                            while(v18 < 2) {
                                byte[][] arr2_b = new byte[5][4];
                                int v19 = 0;
                                while(v19 < 5) {
                                    System.arraycopy(gdgy.a(arr_v[v19]), 0, arr2_b[v19], 0, 4);
                                    ++v19;
                                    arr2_b = arr2_b;
                                    arr_v = arr_v;
                                }
                                byte[] arr_b13 = new byte[0x40];
                                System.arraycopy(arr_b9, 0, arr_b13, 0, 20);
                                for(int v20 = 20; v20 < 0x40; ++v20) {
                                    arr_b13[v20] = 0;
                                }
                                byte[][] arr2_b1 = new byte[80][4];
                                int v21 = 0;
                                while(v21 < 16) {
                                    System.arraycopy(arr_b13, v21 * 4, arr2_b1[v21], 0, 4);
                                    ++v21;
                                    arr2_b1 = arr2_b1;
                                    v17 = v17;
                                }
                                for(int v22 = 16; v22 < 80; ++v22) {
                                    byte[] arr_b14 = arr2_b1[v22 - 3];
                                    byte[] arr_b15 = arr2_b1[v22 - 8];
                                    byte[] arr_b16 = arr2_b1[v22 - 14];
                                    byte[] arr_b17 = arr2_b1[v22 - 16];
                                    BigInteger bigInteger0 = new BigInteger(arr_b14);
                                    BigInteger bigInteger1 = new BigInteger(arr_b15);
                                    BigInteger bigInteger2 = new BigInteger(arr_b16);
                                    BigInteger bigInteger3 = new BigInteger(arr_b17);
                                    arr2_b1[v22] = gdgz.b(1, gdgy.a(bigInteger0.xor(bigInteger1).xor(bigInteger2).xor(bigInteger3).intValue()));
                                }
                                byte[] arr_b18 = new byte[4];
                                byte[] arr_b19 = new byte[4];
                                byte[] arr_b20 = new byte[4];
                                byte[] arr_b21 = new byte[4];
                                byte[] arr_b22 = new byte[4];
                                System.arraycopy(arr2_b[0], 0, arr_b18, 0, 4);
                                System.arraycopy(arr2_b[1], 0, arr_b19, 0, 4);
                                System.arraycopy(arr2_b[2], 0, arr_b20, 0, 4);
                                System.arraycopy(arr2_b[3], 0, arr_b21, 0, 4);
                                System.arraycopy(arr2_b[4], 0, arr_b22, 0, 4);
                                int v23 = 0;
                                while(v23 < 80) {
                                    int v24 = new BigInteger(gdgz.b(5, arr_b18)).intValue();
                                    BigInteger bigInteger4 = new BigInteger(arr_b19);
                                    BigInteger bigInteger5 = new BigInteger(arr_b20);
                                    BigInteger bigInteger6 = new BigInteger(arr_b21);
                                    BigInteger bigInteger7 = BigInteger.valueOf(-1L);
                                    if(v23 >= 0 && v23 <= 19) {
                                        bigInteger7 = bigInteger4.and(bigInteger5).or(bigInteger4.not().and(bigInteger6));
                                    }
                                    else if(v23 >= 20 && v23 <= 39) {
                                        bigInteger7 = bigInteger4.xor(bigInteger5).xor(bigInteger6);
                                    }
                                    else if(v23 >= 40 && v23 <= 59) {
                                        bigInteger7 = bigInteger4.and(bigInteger5).or(bigInteger4.and(bigInteger6)).or(bigInteger5.and(bigInteger6));
                                    }
                                    else if(v23 >= 60 && v23 <= 0x4F) {
                                        bigInteger7 = bigInteger4.xor(bigInteger5).xor(bigInteger6);
                                    }
                                    int v25 = bigInteger7.intValue();
                                    int v26 = new BigInteger(arr_b22).intValue();
                                    int v27 = new BigInteger(arr2_b1[v23]).intValue();
                                    if(v23 >= 0 && v23 <= 19) {
                                        v28 = 1518500249;
                                    }
                                    else if(v23 >= 20 && v23 <= 39) {
                                        v28 = 0x6ED9EBA1;
                                    }
                                    else if(v23 >= 40 && v23 <= 59) {
                                        v28 = -1894007588;
                                    }
                                    else {
                                        v28 = v23 < 60 || v23 > 0x4F ? -1 : 0xCA62C1D6;
                                    }
                                    byte[] arr_b23 = gdgz.b(30, arr_b19);
                                    ++v23;
                                    arr_b19 = arr_b18;
                                    arr_b22 = arr_b21;
                                    arr_b18 = gdgy.a(v24 + v25 + v26 + v27 + v28);
                                    arr_b21 = arr_b20;
                                    bcqx0 = bcqx0;
                                    arr_b20 = arr_b23;
                                    uUID0 = uUID0;
                                }
                                arr2_b[0] = gdgz.a(arr2_b[0], arr_b18);
                                arr2_b[1] = gdgz.a(arr2_b[1], arr_b19);
                                arr2_b[2] = gdgz.a(arr2_b[2], arr_b20);
                                arr2_b[3] = gdgz.a(arr2_b[3], arr_b21);
                                arr2_b[4] = gdgz.a(arr2_b[4], arr_b22);
                                byte[] arr_b24 = new byte[20];
                                System.arraycopy(arr2_b[0], 0, arr_b24, 0, 4);
                                System.arraycopy(arr2_b[1], 0, arr_b24, 4, 4);
                                System.arraycopy(arr2_b[2], 0, arr_b24, 8, 4);
                                System.arraycopy(arr2_b[3], 0, arr_b24, 12, 4);
                                System.arraycopy(arr2_b[4], 0, arr_b24, 16, 4);
                                System.arraycopy(arr_b24, 0, arr_b12, v16, 20);
                                v16 += 20;
                                int v29 = 1;
                                for(int v30 = 19; v30 >= 0; --v30) {
                                    int v31 = v29 + ((arr_b9[v30] & 0xFF) + (arr_b24[v30] & 0xFF));
                                    arr_b9[v30] = (byte)(v31 & 0xFF);
                                    v29 = v31 >> 8;
                                }
                                ++v18;
                                arr_v = arr_v;
                                v17 = v17;
                                bcqx0 = bcqx0;
                                uUID0 = uUID0;
                            }
                        }
                        bcqx1 = bcqx0;
                        uUID1 = uUID0;
                        goto label_318;
                    }
                    goto label_310;
                }
            label_318:
                if(arr_b12 == null) {
                    Log.e("WfcActivationActivity", "Invalid TEKs data!");
                    arr_b25 = null;
                }
                else {
                    System.arraycopy(arr_b12, 0, new byte[16], 0, 16);
                    arr_b25 = new byte[16];
                    System.arraycopy(arr_b12, 16, arr_b25, 0, 16);
                    System.arraycopy(arr_b12, 0x20, new byte[0x40], 0, 0x40);
                    System.arraycopy(arr_b12, 0x60, new byte[0x40], 0, 0x40);
                }
                if(arr_b25 == null) {
                    throw new gdgw("Can\'t generate K_Aut!");
                }
                if(arr_b5 == null) {
                    arr_b26 = null;
                }
                else {
                    arr_b26 = new byte[arr_b5.length + 0x20];
                    arr_b26[0] = 2;
                    arr_b26[1] = b;
                    byte[] arr_b27 = gdgy.a(arr_b5.length + 0x20);
                    arr_b26[2] = arr_b27[2];
                    arr_b26[3] = arr_b27[3];
                    arr_b26[4] = 23;
                    arr_b26[5] = 1;
                    arr_b26[6] = 0;
                    arr_b26[7] = 0;
                    arr_b26[8] = 3;
                    arr_b26[9] = (byte)(arr_b5.length + 4 >> 2 & 0xFF);
                    byte[] arr_b28 = gdgy.a(arr_b5.length * 8);
                    arr_b26[10] = arr_b28[2];
                    arr_b26[11] = arr_b28[3];
                    System.arraycopy(arr_b5, 0, arr_b26, 12, arr_b5.length);
                    arr_b26[arr_b5.length + 12] = 11;
                    arr_b26[arr_b5.length + 13] = 5;
                    arr_b26[arr_b5.length + 14] = 0;
                    int v32 = arr_b5.length + 16;
                    arr_b26[arr_b5.length + 15] = 0;
                    int v33 = 0;
                    while(v33 < 16) {
                        arr_b26[v32] = 0;
                        ++v33;
                        ++v32;
                    }
                    byte[] arr_b29 = gdgx.a(arr_b25, arr_b26);
                    if(arr_b29 == null) {
                        arr_b26 = null;
                    }
                    else {
                        System.arraycopy(arr_b29, 0, arr_b26, arr_b5.length + 16, 16);
                    }
                }
                gdgy.b(arr_b26);
                gdha.a();
                if(arr_b26 == null) {
                    throw new gdgw("Failed to generate EAP-AKA Challenge Response data!");
                }
                s8 = Base64.encodeToString(arr_b26, 2).trim();
                goto label_375;
            }
            catch(gdgw gdgw0) {
                throw gdgw0;
            }
            catch(Exception exception1) {
                goto label_373;
            }
        }
        else {
            z = false;
            arr_b1 = null;
            arr_b2 = null;
        }
        goto label_102;
        try {
            throw gdgw0;
        label_373:
            Log.e("WfcActivationActivity", "Unknown exception", exception1);
            throw new gdgw("Unknown exception!");
        label_375:
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("eap-relay-packet", s8);
            s9 = jSONObject0.toString();
            goto label_399;
        label_379:
            bcqx1 = bcqx0;
            uUID1 = uUID0;
            s9 = telephonyManager0.getIccAuthentication(v, v1, s);
            baun0.d("resp: " + s9, new Object[0]);
            goto label_399;
        }
        catch(UnsupportedOperationException unused_ex) {
        label_384:
            atqz0 = this;
        label_385:
            atqz0.d.f(atqz0.e, gmfz.bc, gmfx.ae);
            Status status0 = new Status(33001);
            atqz0.b.a(status0, null, ApiMetadata.b);
            return;
        }
        catch(JSONException unused_ex) {
        label_389:
            atqz0 = this;
        label_390:
            atqz0.d.f(atqz0.e, gmfz.bc, gmfx.aI);
            Status status1 = new Status(33003);
            atqz0.b.a(status1, null, ApiMetadata.b);
            return;
        }
        catch(gdgw unused_ex) {
        label_394:
            atqz0 = this;
        }
    label_395:
        atqz0.d.f(atqz0.e, gmfz.bc, gmfx.bH);
        Status status2 = new Status(33004);
        atqz0.b.a(status2, null, ApiMetadata.b);
        return;
    label_399:
        bcqx1.o(uUID1, gmfz.bc, gmgd.g);
        EAPAKAResponse eAPAKAResponse0 = new EAPAKAResponse(s9);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
        this.b.a(Status.b, eAPAKAResponse0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}


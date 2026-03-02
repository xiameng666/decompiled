import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class esro implements essj {
    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        return new esrq(jSONObject0, jSONObject1);
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        return new esrs(((esrq)esrz0), jSONObject0, essb0);
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        byte[] arr_b12;
        byte b2;
        boolean z1;
        byte b1;
        byte[] arr_b9;
        byte[] arr_b2;
        byte b;
        byte[] arr_b1;
        int v;
        try {
            v = Integer.parseInt(jSONObject0.getString("atc"), 16);
            arr_b1 = esxg.c(jSONObject0.getString("keyValue"));
            b = (byte)Integer.parseInt(jSONObject0.getString("imkIndex"), 16);
            arr_b2 = esxg.c(("0" + jSONObject0.getString("expDate")));
        }
        catch(JSONException jSONException0) {
            throw new IllegalArgumentException(jSONException0);
        }
        byte[] arr_b3 = new byte[6];
        byte[] arr_b4 = new byte[3];
        byte[] arr_b5 = new byte[2];
        byte[] arr_b6 = {((byte)(((int)(essg0.a >> 24)))), ((byte)(((int)(essg0.a >> 16 & 0xFFL)))), ((byte)(((int)(essg0.a >> 8 & 0xFFL)))), ((byte)(((int)(essg0.a & 0xFFL))))};
        int v1 = Integer.parseInt(((esrq)esrz0).i, 16) & 0xFF;
        byte[] arr_b7 = {((byte)(v >> 8 & 0xFF)), ((byte)(v & 0xFF))};
        byte[] arr_b8 = new byte[5];
        boolean z = essg0.h.contains(essf.b);
        if(z) {
            arr_b3 = esyw.c(essg0.c / 10000L, 6);
            arr_b5 = esyw.c(essg0.e, 2);
            arr_b9 = esyw.c(essg0.b, 2);
            arr_b4 = esxg.c(essg0.d);
            arr_b8[0] = (byte)(arr_b8[0] | 0x20);
            b1 = 1;
        }
        else {
            arr_b9 = new byte[2];
            b1 = 0;
        }
        byte[] arr_b10 = new byte[0x20];
        arr_b10[0] = 15;
        arr_b10[2] = b;
        arr_b10[16] = 10;
        if(z) {
            z1 = z;
            arr_b10[1] = ((esrq)esrz0).h;
            b2 = b;
            System.arraycopy(arr_b8, 0, arr_b10, 3, 5);
            arr_b10[17] = 91;
            arr_b10[29] = b1;
        }
        else {
            z1 = z;
            b2 = b;
            arr_b10[1] = -74;
            arr_b10[17] = 90;
            arr_b10[29] = 1;
        }
        System.arraycopy(arr_b2, 0, arr_b10, 30, 2);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            if(z1) {
                byteArrayOutputStream0.write(arr_b3);
                byteArrayOutputStream0.write(new byte[6]);
                byteArrayOutputStream0.write(arr_b5);
                byteArrayOutputStream0.write(new byte[5]);
                byteArrayOutputStream0.write(arr_b9);
                byteArrayOutputStream0.write(arr_b4);
                byteArrayOutputStream0.write(0);
            }
            else {
                byteArrayOutputStream0.write(new byte[25]);
            }
            byteArrayOutputStream0.write(arr_b6);
            byteArrayOutputStream0.write(new byte[2]);
            byteArrayOutputStream0.write(arr_b7);
            byteArrayOutputStream0.write(arr_b10);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        byte[] arr_b11 = byteArrayOutputStream0.toByteArray();
        try {
            arr_b12 = new gnrn(arr_b1).a(arr_b11, 8);
        }
        catch(Exception exception0) {
            throw new SecurityException(exception0);
        }
        if(z1) {
            esru esru0 = new esru(1);
            esru0.e(new esrv(0x9F02, arr_b3));
            esru0.e(new esrv(0x9F03, new byte[6]));
            esru0.e(new esrv(40730, arr_b5));
            esru0.e(new esrv(0x95, new byte[5]));
            esru0.e(new esrv(0x5F2A, arr_b9));
            esru0.e(new esrv(0x9A, arr_b4));
            esru0.e(new esrv(0x9C, 0));
            esru0.e(new esrv(0x9F37, arr_b6));
            esru0.e(new esrv(130, new byte[2]));
            esru0.e(new esrv(((short)v)));
            esru0.e(new esrv(0x9F10, arr_b10));
            esru0.e(new esrv(0x9F26, arr_b12));
            esru0.e(new esrv(0x5F34, ((byte)v1)));
            return new esrt(esru0.b(), ((esrq)esrz0).a, ((esrq)esrz0).k, ((esrq)esrz0).j, Integer.toString(v, 16));
        }
        byte[] arr_b13 = new byte[19];
        arr_b13[0] = (byte)v1;
        System.arraycopy(arr_b12, 0, arr_b13, 1, 8);
        arr_b13[9] = arr_b7[0];
        arr_b13[10] = arr_b7[1];
        System.arraycopy(arr_b6, 0, arr_b13, 11, 4);
        arr_b13[15] = (byte)(arr_b2[0] | 16);
        arr_b13[16] = arr_b2[1];
        arr_b13[17] = b2;
        arr_b13[18] = ((esrq)esrz0).h;
        return new esrt(arr_b13, ((esrq)esrz0).a, ((esrq)esrz0).k, ((esrq)esrz0).j, Integer.toString(v, 16));
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }
}


import android.util.Base64;
import j..time.Instant;
import j..time.LocalDate;
import j..time.ZoneOffset;
import j..time.format.DateTimeParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cacz {
    public static final cada a(JSONObject jSONObject0) {
        JSONArray jSONArray1;
        long v5;
        long v4;
        LocalDate localDate2;
        LocalDate localDate1;
        LocalDate localDate0;
        long v1;
        long v;
        cact cact0;
        ibuq.f(jSONObject0, "json");
        if(jSONObject0.has("device") && !jSONObject0.isNull("device")) {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("device");
            ibuq.e(jSONObject1, "getJSONObject(...)");
            cact0 = cacs.a(jSONObject1);
        }
        else {
            cact0 = new cact(0L, "", LocalDate.of(1970, 1, 1), "");
        }
        if(jSONObject0.has("logFileId") && !jSONObject0.isNull("logFileId")) {
            String s = jSONObject0.getString("logFileId");
            ibuq.e(s, "getString(...)");
            v = Long.parseLong(s);
        }
        else {
            v = 0L;
        }
        if(jSONObject0.has("blobSize") && !jSONObject0.isNull("blobSize")) {
            String s1 = jSONObject0.getString("blobSize");
            ibuq.e(s1, "getString(...)");
            v1 = Long.parseLong(s1);
        }
        else {
            v1 = 0L;
        }
        if(jSONObject0.has("uploadTimestamp") && !jSONObject0.isNull("uploadTimestamp")) {
            try {
                localDate0 = LocalDate.ofInstant(Instant.parse(jSONObject0.getString("uploadTimestamp")), ZoneOffset.UTC);
            }
            catch(DateTimeParseException dateTimeParseException0) {
                a.ae(cacq.a.j(), "Failed to parse upload timestamp", dateTimeParseException0);
                localDate0 = LocalDate.of(1970, 1, 1);
            }
        }
        else {
            localDate0 = LocalDate.of(1970, 1, 1);
        }
        ibuq.c(localDate0);
        if(jSONObject0.has("expiryTimestamp") && !jSONObject0.isNull("expiryTimestamp")) {
            try {
                localDate1 = LocalDate.ofInstant(Instant.parse(jSONObject0.getString("expiryTimestamp")), ZoneOffset.UTC);
            }
            catch(DateTimeParseException dateTimeParseException1) {
                a.ae(cacq.a.j(), "Failed to parse expiry timestamp", dateTimeParseException1);
                localDate1 = LocalDate.of(1970, 1, 1);
            }
        }
        else {
            localDate1 = LocalDate.of(1970, 1, 1);
        }
        ibuq.c(localDate1);
        ArrayList arrayList0 = new ArrayList();
        if(jSONObject0.has("logFileKeys") && !jSONObject0.isNull("logFileKeys")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("logFileKeys");
            ibuq.e(jSONArray0, "getJSONArray(...)");
            int v2 = jSONArray0.length();
            int v3 = 0;
            while(v3 < v2) {
                if(jSONArray0.isNull(v3)) {
                    localDate2 = localDate1;
                    jSONArray1 = jSONArray0;
                }
                else {
                    JSONObject jSONObject2 = jSONArray0.getJSONObject(v3);
                    ibuq.e(jSONObject2, "getJSONObject(...)");
                    ibuq.f(jSONObject2, "json");
                    if(jSONObject2.has("logFileId") && !jSONObject2.isNull("logFileId")) {
                        localDate2 = localDate1;
                        String s2 = jSONObject2.getString("logFileId");
                        ibuq.e(s2, "getString(...)");
                        v4 = Long.parseLong(s2);
                    }
                    else {
                        localDate2 = localDate1;
                        v4 = 0L;
                    }
                    if(jSONObject2.has("logFileKeyId") && !jSONObject2.isNull("logFileKeyId")) {
                        String s3 = jSONObject2.getString("logFileKeyId");
                        ibuq.e(s3, "getString(...)");
                        v5 = Long.parseLong(s3);
                    }
                    else {
                        v5 = 0L;
                    }
                    String s4 = !jSONObject2.has("encryptedLogFileEncryptionKey") || jSONObject2.isNull("encryptedLogFileEncryptionKey") ? "" : jSONObject2.getString("encryptedLogFileEncryptionKey");
                    ibuq.c(s4);
                    jSONArray1 = jSONArray0;
                    byte[] arr_b = Base64.decode(s4, 0);
                    int v6 = !jSONObject2.has("versionNumber") || jSONObject2.isNull("versionNumber") ? 0 : jSONObject2.getInt("versionNumber");
                    ibuq.c(arr_b);
                    arrayList0.add(new cacx(v4, v5, arr_b, v6));
                }
                ++v3;
                localDate1 = localDate2;
                jSONArray0 = jSONArray1;
            }
        }
        return new cada(cact0, v, v1, localDate0, localDate1, arrayList0);
    }
}


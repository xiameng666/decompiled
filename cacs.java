import j..time.Instant;
import j..time.LocalDate;
import j..time.ZoneOffset;
import j..time.format.DateTimeParseException;
import org.json.JSONObject;

public final class cacs {
    public static final cact a(JSONObject jSONObject0) {
        LocalDate localDate0;
        ibuq.f(jSONObject0, "json");
        long v = 0L;
        if(jSONObject0.has("deviceId") && !jSONObject0.isNull("deviceId")) {
            String s = jSONObject0.getString("deviceId");
            ibuq.e(s, "getString(...)");
            v = Long.parseLong(s);
        }
        String s1 = "";
        String s2 = !jSONObject0.has("androidId") || jSONObject0.isNull("androidId") ? "" : jSONObject0.getString("androidId");
        ibuq.c(s2);
        if(jSONObject0.has("lastUploadTimestamp") && !jSONObject0.isNull("lastUploadTimestamp")) {
            try {
                localDate0 = LocalDate.ofInstant(Instant.parse(jSONObject0.getString("lastUploadTimestamp")), ZoneOffset.UTC);
            }
            catch(DateTimeParseException dateTimeParseException0) {
                a.ae(cacq.a.j(), "Failed to parse last upload timestamp", dateTimeParseException0);
                localDate0 = LocalDate.of(1970, 1, 1);
            }
        }
        else {
            localDate0 = LocalDate.of(1970, 1, 1);
        }
        ibuq.c(localDate0);
        if(jSONObject0.has("deviceDescription") && !jSONObject0.isNull("deviceDescription")) {
            s1 = jSONObject0.getString("deviceDescription");
        }
        ibuq.c(s1);
        return new cact(v, s2, localDate0, s1);
    }
}


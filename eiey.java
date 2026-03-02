import android.os.Bundle;

public final class eiey {
    public static eiex a(Bundle bundle0) {
        if(bundle0.containsKey("TagRingingInfoMacAddress") && bundle0.containsKey("TagRingingInfoLastSeenEpochMillis") && bundle0.containsKey("TagRingingInfoRingingAttemptEpochMillis")) {
            eiev eiev0 = eiex.a();
            String s = bundle0.getString("TagRingingInfoMacAddress");
            if(s == null) {
                ((ggtj)eicd.a.i()).x("Missing macAddress in required ringing intent extras.");
                return null;
            }
            eiev0.d(s);
            if(bundle0.containsKey("TagRingingInfoDeviceType")) {
                eiev0.b(bundle0.getInt("TagRingingInfoDeviceType"));
            }
            if(bundle0.containsKey("TagRingingInfoPreRingingScanEnumInt")) {
                gwog gwog0 = gwog.b(bundle0.getInt("TagRingingInfoPreRingingScanEnumInt"));
                gftb.check(gwog0);
                eiev0.c = gwog0;
            }
            else {
                eiev0.c = gwog.a;
            }
            if(bundle0.containsKey("TagRingingInfoLastSeenEpochMillis")) {
                eiev0.c(bundle0.getLong("TagRingingInfoLastSeenEpochMillis"));
            }
            if(bundle0.containsKey("TagRingingInfoRingingAttemptEpochMillis")) {
                eiev0.f(bundle0.getLong("TagRingingInfoRingingAttemptEpochMillis"));
            }
            if(bundle0.containsKey("TagRingingInfoRSSI")) {
                eiev0.b = bundle0.getInt("TagRingingInfoRSSI");
            }
            if(bundle0.containsKey("TagRingingInfoPreRingingScanEpochMillis")) {
                eiev0.e(bundle0.getLong("TagRingingInfoPreRingingScanEpochMillis"));
            }
            if(bundle0.containsKey("TagRingingInfoLastConnectionStatus")) {
                eiev0.a = bundle0.getInt("TagRingingInfoLastConnectionStatus");
            }
            if(bundle0.containsKey("TagRingingInfoFinderRingKey")) {
                eiev0.d = bundle0.getString("TagRingingInfoFinderRingKey");
            }
            return eiev0.a();
        }
        ((ggtj)eicd.a.i()).x("Missing required ringing intent extras.");
        return null;
    }
}


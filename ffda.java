import java.util.Locale;

public final class ffda {
    public static String a(ffbw ffbw0) {
        if(ffbw0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{source=");
        stringBuilder0.append(ffbw0.i);
        stringBuilder0.append(", target=");
        stringBuilder0.append(ffbw0.f);
        stringBuilder0.append(", (");
        stringBuilder0.append(ffbw0.k);
        stringBuilder0.append(":");
        stringBuilder0.append(ffbw0.c);
        stringBuilder0.append("), ");
        stringBuilder0.append(ffmr.a(ffbw0.d));
        stringBuilder0.append(", ");
        if((ffbw0.b & 0x100) == 0) {
            stringBuilder0.append(String.format(Locale.US, "%s, dataBytes=%d", ffbw0.g, ffbw0.h.size()));
        }
        else {
            stringBuilder0.append("is a channel");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}


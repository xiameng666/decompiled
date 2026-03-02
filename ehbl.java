import android.content.ContentValues;
import java.util.List;

public final class ehbl {
    public static String a(egzv egzv0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("n-");
        ehbl.b(stringBuilder0, egzv0.E);
        stringBuilder0.append("p-");
        ehbl.b(stringBuilder0, egzv0.I);
        stringBuilder0.append("e-");
        ehbl.b(stringBuilder0, egzv0.r);
        return stringBuilder0.toString();
    }

    private static void b(StringBuilder stringBuilder0, List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                String s = ((ContentValues)object0).getAsString("data1");
                if(s != null && !s.isEmpty()) {
                    stringBuilder0.append(s.hashCode());
                    stringBuilder0.append("-");
                }
            }
        }
    }
}


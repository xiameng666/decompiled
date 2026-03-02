import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class egif {
    public static void a(Object object0, String s, StringBuilder stringBuilder0) {
        if(object0 == null) {
            stringBuilder0.append("[null]\n");
            return;
        }
        stringBuilder0.append("(");
        stringBuilder0.append(object0.getClass().getSimpleName());
        stringBuilder0.append(") ");
        if((object0 instanceof Bundle)) {
            if(((Bundle)object0).isEmpty()) {
                stringBuilder0.append("{ }\n");
                return;
            }
            stringBuilder0.append("{\n");
            for(Object object1: ((Bundle)object0).keySet()) {
                stringBuilder0.append(s + "  ");
                stringBuilder0.append(((String)object1));
                stringBuilder0.append(" : ");
                egif.a(((Bundle)object0).get(((String)object1)), s + "  ", stringBuilder0);
            }
            stringBuilder0.append(s);
            stringBuilder0.append("}\n");
            return;
        }
        if((object0 instanceof DataHolder)) {
            stringBuilder0.append(" [");
            if(((DataHolder)object0).g()) {
                stringBuilder0.append("CLOSED");
            }
            else {
                stringBuilder0.append(((DataHolder)object0).i);
            }
            stringBuilder0.append("] ");
            stringBuilder0.append(object0);
            stringBuilder0.append("\n");
            return;
        }
        if((object0 instanceof ArrayList)) {
            if(((ArrayList)object0).isEmpty()) {
                stringBuilder0.append("[ ]\n");
                return;
            }
            stringBuilder0.append("[\n");
            for(int v = 0; v < ((ArrayList)object0).size(); ++v) {
                stringBuilder0.append(s + "  ");
                stringBuilder0.append(v);
                stringBuilder0.append(" : ");
                egif.a(((ArrayList)object0).get(v), s + "  ", stringBuilder0);
            }
            stringBuilder0.append(s);
            stringBuilder0.append("]\n");
            return;
        }
        if((object0 instanceof byte[])) {
            stringBuilder0.append(" [");
            stringBuilder0.append(((byte[])object0).length);
            stringBuilder0.append("] ");
            int v1 = Math.min(((byte[])object0).length, 56);
            byte[] arr_b = new byte[v1];
            System.arraycopy(object0, 0, arr_b, 0, v1);
            stringBuilder0.append(Base64.encodeToString(arr_b, 0));
            return;
        }
        if((object0 instanceof char[])) {
            stringBuilder0.append("\"");
            stringBuilder0.append(((char[])object0));
            stringBuilder0.append("\"\n");
            return;
        }
        if(object0.getClass().isArray()) {
            if(Array.getLength(object0) == 0) {
                stringBuilder0.append("[ ]\n");
                return;
            }
            stringBuilder0.append("[ ");
            stringBuilder0.append(Array.get(object0, 0));
            for(int v2 = 1; v2 < Array.getLength(object0); ++v2) {
                stringBuilder0.append(", ");
                stringBuilder0.append(Array.get(object0, v2));
            }
            stringBuilder0.append(" ]\n");
            return;
        }
        if((object0 instanceof String)) {
            stringBuilder0.append("\"");
            stringBuilder0.append(object0);
            stringBuilder0.append("\"\n");
            return;
        }
        stringBuilder0.append(object0);
        stringBuilder0.append("\n");
    }
}


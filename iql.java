import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class iql {
    public static final View a(inq inq0, int v) {
        for(Object object0: inq0.b.entrySet()) {
            if(((ify)((Map.Entry)object0).getKey()).c != v) {
                continue;
            }
            return ((Map.Entry)object0) != null ? ((jmw)((Map.Entry)object0).getValue()) : null;
        }
        object0 = null;
        return ((Map.Entry)object0) != null ? ((jmw)((Map.Entry)object0).getValue()) : null;
    }

    public static final iqj b(List list0, int v) {
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((iqj)list0.get(v2)).a == v) {
                return (iqj)list0.get(v2);
            }
        }
        return null;
    }

    public static final jbe c(ity ity0) {
        ArrayList arrayList0 = new ArrayList();
        itj itj0 = (itj)itz.a(ity0, itw.a);
        if(itj0 != null) {
            ibts ibts0 = (ibts)itj0.b;
            return ibts0 == null || !((Boolean)ibts0.a(arrayList0)).booleanValue() ? null : ((jbe)arrayList0.get(0));
        }
        return null;
    }

    public static final String d(int v) {
        switch(v) {
            case 0: {
                return "android.widget.Button";
            }
            case 1: {
                return "android.widget.CheckBox";
            }
            case 3: {
                return "android.widget.RadioButton";
            }
            case 5: {
                return "android.widget.ImageView";
            }
            case 6: {
                return "android.widget.Spinner";
            }
            case 7: {
                return "android.widget.NumberPicker";
            }
            default: {
                return null;
            }
        }
    }
}


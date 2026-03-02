import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;

public final class cruz {
    public static final void a(int v, MdpDataPlanStatus mdpDataPlanStatus0) {
        if(!MdpDataPlanStatus.a.containsKey(Integer.valueOf(v))) {
            throw new IllegalArgumentException("Illegal overusage policy: " + v);
        }
        mdpDataPlanStatus0.h = v;
    }
}


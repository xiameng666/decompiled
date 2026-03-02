import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

public class kno {
    public static final knn a;
    public static final Set b;
    public static final int c;

    static {
        kno.a = new knn();
        kno.b = ibqg.c(new Integer[]{((int)7), ((int)20)});
        kno.c = 1;
    }

    public kno(Context context0) {
        ibuq.f(context0, "context");
        super();
    }

    public static final ResultReceiver a(ResultReceiver resultReceiver0) {
        Parcel parcel0 = Parcel.obtain();
        ibuq.e(parcel0, "obtain(...)");
        ibuq.c(resultReceiver0);
        resultReceiver0.writeToParcel(parcel0, 0);
        parcel0.setDataPosition(0);
        ResultReceiver resultReceiver1 = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel0);
        parcel0.recycle();
        return resultReceiver1;
    }

    public static final void b(ResultReceiver resultReceiver0, Intent intent0, String s) {
        ibuq.f(resultReceiver0, "resultReceiver");
        intent0.putExtra("TYPE", s);
        intent0.putExtra("ACTIVITY_REQUEST_CODE", kno.c);
        intent0.putExtra("RESULT_RECEIVER", kno.a(resultReceiver0));
        intent0.setFlags(0x10000);
    }
}


import android.content.Context;
import com.google.android.gms.intrusiondetection.storage.database.IntrusionDetectionEventDatabase;

public final class caeg {
    public final IntrusionDetectionEventDatabase a(Context context0) {
        IntrusionDetectionEventDatabase intrusionDetectionEventDatabase0;
        ibuq.f(context0, "context");
        synchronized(this) {
            intrusionDetectionEventDatabase0 = IntrusionDetectionEventDatabase.n;
            if(intrusionDetectionEventDatabase0 == null) {
                omd omd0 = cctd.a(context0.getApplicationContext(), IntrusionDetectionEventDatabase.class, "intrusion_detection_event_database");
                omd0.e(false);
                omn omn0 = omd0.a();
                intrusionDetectionEventDatabase0 = (IntrusionDetectionEventDatabase)omn0;
                IntrusionDetectionEventDatabase.n = intrusionDetectionEventDatabase0;
                ibuq.e(omn0, "also(...)");
            }
        }
        return intrusionDetectionEventDatabase0;
    }
}


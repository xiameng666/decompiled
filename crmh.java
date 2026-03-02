import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;

public final class crmh {
    final Context a;
    Boolean b;
    long c;
    InitializationParams d;
    boolean e;
    String f;

    public crmh(Context context0, InitializationParams initializationParams0) {
        this.e = true;
        batl.s(context0);
        Context context1 = context0.getApplicationContext();
        batl.s(context1);
        this.a = context1;
        if(initializationParams0 != null) {
            this.d = initializationParams0;
            this.e = initializationParams0.c;
            this.c = initializationParams0.b;
            this.f = initializationParams0.e;
            Bundle bundle0 = initializationParams0.d;
            if(bundle0 != null) {
                this.b = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}


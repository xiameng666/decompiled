import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import j..util.Objects;

final class crbf extends crbj {
    final Context a;
    final crbs b;

    public crbf(crbs crbs0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(crbs0);
        this.b = crbs0;
        super(crbs0);
    }

    @Override  // crbj
    public final void a() {
        try {
            Context context0 = this.a;
            String s = crkl.a(context0);
            Resources resources0 = context0.getResources();
            if(TextUtils.isEmpty(s)) {
                s = crkl.a(context0);
            }
            crba crba0 = null;
            Boolean boolean0 = crkl.b(resources0, s);
            crbs crbs0 = this.b;
            if(boolean0 != null && boolean0.booleanValue()) {
                try {
                    bjhz bjhz0 = bjia.b;
                    goto label_12;
                label_11:
                    bjhz0 = bjia.c;
                label_12:
                    IBinder iBinder0 = bjia.f(context0, bjhz0, "com.google.android.gms.measurement.dynamite").e("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                        crba0 = (iInterface0 instanceof crba) ? ((crba)iInterface0) : new crba(iBinder0);
                    }
                    goto label_19;
                }
                catch(bjhw bjhw0) {
                    goto label_18;
                }
            }
            else {
                goto label_11;
            }
            goto label_12;
        label_18:
            crbs0.a(bjhw0, true, false);
        label_19:
            crbs0.e = crba0;
            crbs crbs1 = this.b;
            if(crbs1.e == null) {
                Log.w(crbs1.b, "Failed to connect to measurement client.");
                return;
            }
            int v = bjia.a(this.a, "com.google.android.gms.measurement.dynamite");
            int v1 = bjia.b(this.a, "com.google.android.gms.measurement.dynamite");
            InitializationParams initializationParams0 = new InitializationParams(136000L, ((long)Math.max(v, v1)), Boolean.TRUE.equals(boolean0) || v1 < v, null, crkl.a(this.a));
            crba crba1 = crbs1.e;
            batl.s(crba1);
            ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
            long v2 = this.c;
            Parcel parcel0 = crba1.jo();
            wbz.h(parcel0, objectWrapper0);
            wbz.f(parcel0, initializationParams0);
            parcel0.writeLong(v2);
            crba1.jp(1, parcel0);
        }
        catch(Exception exception0) {
            this.b.a(exception0, true, false);
        }
    }
}


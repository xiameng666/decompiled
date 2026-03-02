import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Locale;

public final class fxqp {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public fxqp() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public final void a(byte[] arr_b, fxrq fxrq0) {
        this.f.add(arr_b);
        if((fxrq0.b & 1) != 0) {
            this.a.add((fxrq0.c == null ? fxrv.a : fxrq0.c));
        }
        if((fxrq0.b & 2) != 0) {
            fxbp fxbp0 = fxrq0.d == null ? fxbp.a : fxrq0.d;
            int v = fxbp0.c.size();
            Object object0 = null;
            if(v != 0) {
                ArrayList arrayList0 = new ArrayList(v);
                for(Object object1: fxbp0.c) {
                    arrayList0.add(new DetectedActivity(fwsb.a(((fxbu)object1)), ((fxbu)object1).d));
                }
                if(fxbp0.f.size() > 0) {
                    object0 = new Bundle();
                    for(Object object2: fxbp0.f) {
                        fxbr fxbr0 = (fxbr)object2;
                        String s = fxbr0.f;
                        int v1 = fxbr0.c;
                        if(v1 == 3) {
                            ((Bundle)object0).putInt(s, ((Integer)fxbr0.d).intValue());
                        }
                        else if(v1 == 8) {
                            ((Bundle)object0).putBoolean(s, ((Boolean)fxbr0.d).booleanValue());
                        }
                        else {
                            switch(v1) {
                                case 4: {
                                    ((Bundle)object0).putLong(s, ((Long)fxbr0.d).longValue());
                                    break;
                                }
                                case 5: {
                                    ((Bundle)object0).putFloat(s, ((Float)fxbr0.d).floatValue());
                                    break;
                                }
                                case 6: {
                                    ((Bundle)object0).putDouble(s, ((Double)fxbr0.d).doubleValue());
                                    break;
                                }
                                case 7: {
                                    ((Bundle)object0).putString(s, ((String)fxbr0.d));
                                }
                            }
                        }
                    }
                }
                object0 = new ActivityRecognitionResult(arrayList0, fxbp0.e, fxbp0.d, ((Bundle)object0));
            }
            this.b.add(object0);
        }
        if((fxrq0.b & 4) != 0) {
            this.c.add((fxrq0.e == null ? gzty.a : fxrq0.e));
        }
        if((fxrq0.b & 8) != 0) {
            this.d.add((fxrq0.f == null ? gzuw.a : fxrq0.f));
        }
        if((fxrq0.b & 16) != 0) {
            this.e.add((fxrq0.g == null ? gzvf.a : fxrq0.g));
        }
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "%d locations, %d activities, and %d metadata", this.a.size(), this.b.size(), this.c.size());
    }
}


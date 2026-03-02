import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.update.execution.InstallationEventIntentOperation;

public final class ezyo implements gfsi {
    public final boolean a;

    public ezyo(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        if(!ezwp.b() || this.a || ((int)(((Integer)object0))) == 102) {
            if(ezxo.a.contains(((Integer)object0))) {
                InstallationEventIntentOperation.a.j("Ignoring event of type %d.", new Object[]{((Integer)object0)});
                return null;
            }
            InstallationEventIntentOperation.a.h("Handling event of type %d.", new Object[]{((Integer)object0)});
            ezym ezym0 = (ezym)ezym.b.b();
            int v = (int)(((Integer)object0));
            new Bundle();
            object1 = ezym0.f;
            synchronized(object1) {
                switch(v) {
                    case 102: {
                        ezym0.d.c(new fagn[]{ezyq.a});
                        ezyj ezyj0 = ezym0.h;
                        if(ezyj0 == null) {
                            ezym0.b();
                            Intent intent0 = ezye.d(ezym0.c);
                            ezym0.c.startService(intent0);
                        }
                        else {
                            ezym0.i = true;
                            ezyj0.d();
                        }
                        break;
                    }
                    case 0x73: {
                        goto label_23;
                    }
                    default: {
                        goto label_24;
                    }
                }
            }
            return null;
        label_23:
            v = 0x73;
        label_24:
            ezyj ezyj1 = ezym0.h;
            if(ezyj1 == null) {
                Intent intent1 = ezye.d(ezym0.c);
                ezym0.c.startService(intent1);
            }
            else if(!ezyj1.e(v)) {
                ezym0.i = true;
            }
            return null;
        }
        return null;
    }
}


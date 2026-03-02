import com.google.android.gms.wearable.MessageOptions;
import j..util.Objects;

final class fdwg implements Runnable {
    final fdwh a;

    public fdwg(fdwh fdwh0) {
        Objects.requireNonNull(fdwh0);
        this.a = fdwh0;
        super();
    }

    @Override
    public final void run() {
        boolean z = false;
        fdwh fdwh0 = this.a;
        synchronized(fdwh0.g) {
            if(!fdwh0.f) {
                if(fdwh0.e == 0) {
                label_15:
                    z = true;
                    fdwh0.f = true;
                    fdwh0.a = null;
                }
                else {
                    fdwi fdwi0 = fdwh0.h;
                    Object object1 = fdwh0.a;
                    batl.t(((feak)object1).b, "channelRequest was null");
                    MessageOptions messageOptions0 = new MessageOptions(0);
                    if(fdwi0.b.a.b(((feak)object1).a.b, ((feak)object1).a.a, false, "", null, ((feak)object1).b, null, null, messageOptions0) >= 0) {
                        --fdwh0.e;
                        fdwi0.a.a(fdwh0.c, fdwh0.b);
                        goto label_18;
                    }
                    goto label_15;
                }
            }
        }
    label_18:
        if(z) {
            try {
                fdwh0.d.a(fdwh0);
            }
            finally {
                fdwh0.h.c.a();
            }
        }
    }
}


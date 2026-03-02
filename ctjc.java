import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;
import java.util.Map;

final class ctjc extends ibsl implements ibtw {
    int a;
    final ctho b;
    final ctza c;
    final RemoteAppListChimeraActivity d;

    public ctjc(ctho ctho0, ctza ctza0, RemoteAppListChimeraActivity remoteAppListChimeraActivity0, ibrl ibrl0) {
        this.b = ctho0;
        this.c = ctza0;
        this.d = remoteAppListChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctjc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctjc(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                String s = this.c.c;
                ibuq.e(s, "getPackageName(...)");
                this.a = 1;
                object0 = this.b.a(s, this);
                if(object0 == object1) {
                    return object1;
                }
            label_11:
                Bitmap bitmap0 = null;
                if(((Icon)object0) != null) {
                    Drawable drawable0 = ((Icon)object0).loadDrawable(this.d.getApplicationContext());
                    if(drawable0 != null) {
                        bitmap0 = jxv.b(drawable0, 0, 0, 7);
                    }
                }
                icnl icnl0 = this.d.j;
                ctza ctza0 = this.c;
                do {
                    Object object2 = icnl0.b();
                }
                while(!icnl0.h(object2, ibpz.o(((Map)object2), new ibns(ctza0.c, bitmap0))));
                goto label_24;
            }
            catch(Throwable throwable0) {
            }
            this.d.f.remove(this.c.c);
            throw throwable0;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                this.d.f.remove(this.c.c);
                throw throwable0;
            }
        }
        goto label_11;
    label_24:
        this.d.f.remove(this.c.c);
        return ibom.a;
    }
}


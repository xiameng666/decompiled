import android.content.Context;
import com.google.android.gms.activeunlock.SettingsTileState;

final class eyhm extends ibsl implements ibtw {
    int a;
    final eyhn b;
    final Context c;

    public eyhm(eyhn eyhn0, Context context0, ibrl ibrl0) {
        this.b = eyhn0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyhm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyhm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            eyhn eyhn0 = this.b;
            Context context0 = this.c;
            if(eyef.a(context0)) {
                eyhn0.e.c();
            }
            try {
                this.a = 1;
                object0 = eyhn0.d.b(context0, eyhn0.c, this);
                if(object0 == object1) {
                    return object1;
                }
                object2 = (SettingsTileState)object0;
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
            this.b.d(this.c);
            throw throwable0;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                this.b.d(this.c);
                throw throwable0;
            }
        }
        object2 = (SettingsTileState)object0;
    label_18:
        this.b.d(this.c);
        return object2;
    }
}


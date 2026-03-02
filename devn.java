import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Iterator;

final class devn extends ibsl implements ibtw {
    final Intent a;
    final Context b;

    public devn(Intent intent0, Context context0, ibrl ibrl0) {
        this.a = intent0;
        this.b = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((devn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new devn(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1;
        ibnx.b(object0);
        Intent intent0 = this.a;
        if(intent0.hasExtra("share_target_bytes")) {
            try {
                ArrayList arrayList0 = bauc.h(intent0, "share_target_bytes", ShareTarget.CREATOR);
                if(arrayList0 == null) {
                    object2 = dizi.l(this.b, intent0);
                }
                else {
                    Iterator iterator0 = arrayList0.iterator();
                    if(iterator0.hasNext()) {
                        object1 = iterator0.next();
                        ((ShareTarget)object1).e();
                    }
                    else {
                        object1 = null;
                    }
                    object2 = ((ShareTarget)object1) == null ? dizi.l(this.b, intent0) : ((ShareTarget)object1).e();
                }
            }
            catch(IllegalArgumentException unused_ex) {
                object2 = dizi.l(this.b, this.a);
            }
        }
        else {
            object2 = dizi.l(this.b, this.a);
        }
        dcvz.a.a().h("Loaded attachments: %s", object2);
        return object2;
    }
}


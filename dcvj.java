import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.common.ContextExtensionsKt.broadcastReceiverFlow.1.receiver.1;

final class dcvj extends ibsl implements ibtw {
    int a;
    final Context b;
    final IntentFilter c;
    final String d;
    private Object e;

    public dcvj(Context context0, IntentFilter intentFilter0, String s, ibrl ibrl0) {
        this.b = context0;
        this.c = intentFilter0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcvj)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcvj(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.e;
            ContextExtensionsKt.broadcastReceiverFlow.1.receiver.1 contextExtensionsKt$broadcastReceiverFlow$1$receiver$10 = new ContextExtensionsKt.broadcastReceiverFlow.1.receiver.1(this.d, ichm0);
            cutr.b(this.b, contextExtensionsKt$broadcastReceiverFlow$1$receiver$10, this.c);
            dcvi dcvi0 = new dcvi(this.b, contextExtensionsKt$broadcastReceiverFlow$1$receiver$10);
            this.a = 1;
            if(ichl.b(ichm0, dcvi0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.List;

public final class gxvn extends wby implements gxvo {
    public Context a;
    public gxux b;
    private final Handler c;

    public gxvn() {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
    }

    public gxvn(Context context0, gxux gxux0) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
        this.a = context0;
        this.c = new Handler(Looper.getMainLooper());
        this.b = gxux0;
    }

    @Override  // gxvo
    public final void a(List list0) {
        gxvb gxvb0 = new gxvb(this, list0);
        this.c.post(gxvb0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            parcel0.readInt();
            ArrayList arrayList0 = parcel0.createTypedArrayList(DiscoveryListItem.CREATOR);
            gxvn.gr(parcel0);
            this.a(arrayList0);
            return true;
        }
        return false;
    }
}


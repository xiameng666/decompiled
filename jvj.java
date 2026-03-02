import android.app.Notification.Action.Builder;
import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class jvj implements jut {
    public int a;
    public Bitmap b;
    public int c;
    private ArrayList d;
    private ArrayList e;
    private int f;
    private int g;
    private int h;

    public jvj() {
        this.d = new ArrayList();
        this.a = 1;
        this.e = new ArrayList();
        this.f = 0x800005;
        this.g = -1;
        this.h = 80;
    }

    @Override  // jut
    public final void a(juo juo0) {
        Bundle bundle0 = new Bundle();
        if(!this.d.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(this.d.size());
            ArrayList arrayList1 = this.d;
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                juh juh0 = (juh)arrayList1.get(v1);
                IconCompat iconCompat0 = juh0.a();
                Notification.Action.Builder notification$Action$Builder0 = new Notification.Action.Builder((iconCompat0 == null ? null : jxw.c(iconCompat0)), juh0.h, juh0.i);
                Bundle bundle1 = new Bundle(juh0.a);
                bundle1.putBoolean("android.support.allowGeneratedReplies", juh0.c);
                jvh.a(notification$Action$Builder0, juh0.c);
                jvi.a(notification$Action$Builder0, juh0.j);
                notification$Action$Builder0.addExtras(bundle1);
                jvz[] arr_jvz = juh0.b;
                if(arr_jvz != null) {
                    RemoteInput[] arr_remoteInput = jvz.a(arr_jvz);
                    for(int v2 = 0; v2 < arr_remoteInput.length; ++v2) {
                        notification$Action$Builder0.addRemoteInput(arr_remoteInput[v2]);
                    }
                }
                arrayList0.add(notification$Action$Builder0.build());
            }
            bundle0.putParcelableArrayList("actions", arrayList0);
        }
        int v3 = this.a;
        if(v3 != 1) {
            bundle0.putInt("flags", v3);
        }
        if(!this.e.isEmpty()) {
            bundle0.putParcelableArray("pages", ((Parcelable[])this.e.toArray(new Notification[this.e.size()])));
        }
        Bitmap bitmap0 = this.b;
        if(bitmap0 != null) {
            bundle0.putParcelable("background", bitmap0);
        }
        int v4 = this.c;
        if(v4 != 0) {
            bundle0.putInt("contentIcon", v4);
        }
        int v5 = this.f;
        if(v5 != 0x800005) {
            bundle0.putInt("contentIconGravity", v5);
        }
        if(this.g != -1) {
            bundle0.putInt("contentActionIndex", 0);
        }
        int v6 = this.h;
        if(v6 != 80) {
            bundle0.putInt("gravity", v6);
        }
        juo0.b().putBundle("android.wearable.EXTENSIONS", bundle0);
    }

    @Override
    public final Object clone() {
        Object object0 = new jvj();
        object0.d = new ArrayList(this.d);
        object0.a = this.a;
        object0.e = new ArrayList(this.e);
        object0.b = this.b;
        object0.c = this.c;
        object0.f = this.f;
        object0.g = this.g;
        object0.h = this.h;
        return object0;
    }
}


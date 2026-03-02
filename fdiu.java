import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;

public final class fdiu extends wby implements fdiv {
    private final int a;
    private final String b;
    private final fdpl c;
    private final String d;
    private final MessageOptions e;
    private final Object f;
    private boolean g;

    public fdiu() {
        super("com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public fdiu(int v, String s, fdpl fdpl0, String s1, MessageOptions messageOptions0) {
        super("com.google.android.gms.wearable.internal.IRpcResponseCallback");
        this.f = new Object();
        this.a = v;
        this.b = s;
        this.c = fdpl0;
        this.d = s1;
        this.e = messageOptions0;
        this.g = false;
    }

    @Override  // fdiv
    public final void a(boolean z, byte[] arr_b) {
        if(!z) {
            return;
        }
        synchronized(this.f) {
            if(this.g) {
                Log.e("WearableService", dlbc.c(this.c.c, "Response received for already complete request from ", ". Ignoring."));
                return;
            }
            this.g = true;
        }
        fdyu fdyu0 = fdyu.c();
        fdyr fdyr0 = new fdyr(this.a, arr_b);
        MessageOptions messageOptions0 = new MessageOptions(this.e.a);
        fdyu0.g(this.c, this.b, this.d, arr_b, null, fdyr0, messageOptions0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            boolean z = wbz.i(parcel0);
            byte[] arr_b = parcel0.createByteArray();
            fdiu.gr(parcel0);
            this.a(z, arr_b);
            return true;
        }
        return false;
    }
}


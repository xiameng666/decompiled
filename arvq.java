import android.os.Parcel;

public final class arvq extends wby implements arvr {
    private final aruv a;
    private final aqql b;

    public arvq() {
        super("com.google.android.gms.backup.extension.internal.IManagerServiceClientUiCallback");
    }

    public arvq(aruv aruv0) {
        super("com.google.android.gms.backup.extension.internal.IManagerServiceClientUiCallback");
        this.b = new aqql(new String[]{"ManagerServiceUiCallback"});
        this.a = aruv0;
    }

    @Override  // arvr
    public final void a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)artm.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            aruu aruu0 = new aruu(this.a, ((artm)hftv0).c, ((artm)hftv0));
            this.a.b.post(aruu0);
        }
        catch(hfur unused_ex) {
            this.b.m("Invalid proto received from service..continuing", new Object[0]);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            byte[] arr_b = parcel0.createByteArray();
            arvq.gr(parcel0);
            this.a(arr_b);
            return true;
        }
        return false;
    }
}


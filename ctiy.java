import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;

final class ctiy extends ibsl implements ibtw {
    final RemoteAppListChimeraActivity a;
    final ctza b;

    public ctiy(RemoteAppListChimeraActivity remoteAppListChimeraActivity0, ctza ctza0, ibrl ibrl0) {
        this.a = remoteAppListChimeraActivity0;
        this.b = ctza0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctiy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctiy(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        do {
            Object object1 = this.a.i.b();
            String s = (String)object1;
        }
        while(!this.a.i.h(object1, this.b.c));
        return ibom.a;
    }
}


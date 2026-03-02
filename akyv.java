import android.os.RemoteException;

public final class akyv implements azys {
    public final akzc a;
    public final azyf b;

    public akyv(akzc akzc0, azyf azyf0) {
        this.a = akzc0;
        this.b = azyf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alir alir0 = (alir)object0;
        evqp evqp0 = (evqp)object1;
        akzc akzc0 = this.a;
        if(akzc0.b.isEmpty()) {
            try {
                ((alim)alir0.H()).b(akzc0.a);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }
        akzc0.b.add(this.b);
    }
}


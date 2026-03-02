import android.os.RemoteException;
import java.io.IOException;

final class bupr extends ibsl implements ibtw {
    int a;
    final bupw b;

    public bupr(bupw bupw0, ibrl ibrl0) {
        this.b = bupw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bupr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bupr(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                gmcd gmcd0 = this.b.c.b(this.b.b.a);
                ibuq.e(gmcd0, "loadOwner(...)");
                this.a = 1;
                object0 = icpu.c(gmcd0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_11:
                this.b.l.g(((foec)object0));
            }
            catch(azqj azqj0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", azqj0);
            }
            catch(azqi azqi0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", azqi0);
            }
            catch(foee foee0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", foee0);
            }
            catch(RemoteException remoteException0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", remoteException0);
            }
            catch(aztb aztb0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", aztb0);
            }
            catch(IOException iOException0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", iOException0);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(azqj azqj0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", azqj0);
                return ibom.a;
            }
            catch(azqi azqi0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", azqi0);
                return ibom.a;
            }
            catch(foee foee0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", foee0);
                return ibom.a;
            }
            catch(RemoteException remoteException0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", remoteException0);
                return ibom.a;
            }
            catch(aztb aztb0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", aztb0);
                return ibom.a;
            }
            catch(IOException iOException0) {
                a.ae(bupw.a.j(), "Cannot fetch account information", iOException0);
                return ibom.a;
            }
        }
        goto label_11;
    }
}


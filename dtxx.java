import com.google.android.gms.mdocstore.types.ProvisioningId;
import org.json.JSONException;

final class dtxx extends ibsl implements ibtw {
    int a;
    final dtyc b;
    final ProvisioningId c;
    final byte[] d;

    public dtxx(dtyc dtyc0, ProvisioningId provisioningId0, byte[] arr_b, ibrl ibrl0) {
        this.b = dtyc0;
        this.c = provisioningId0;
        this.d = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtxx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtxx(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.a) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_10;
                }
                default: {
                    ibnx.b(object0);
                    return ibom.a;
                }
            }
        }
        catch(dtzv dtzv0) {
            throw dtzv0;
        }
        catch(JSONException jSONException0) {
            throw new dtzv("Error decoding received credential", jSONException0, 16);
        }
        catch(Exception exception0) {
            throw new dtzv("Error fetching and storing credential", exception0, 1);
        }
        ibnx.b(object0);
        try {
            evql evql0 = this.b.a.k(this.c);
            this.a = 1;
            Object object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            label_10:
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            }
            ibnx.b(object2);
            ibuq.c(((gtxg)object2));
            gtxd gtxd0 = fshl.a(((gtxg)object2));
            this.a = 2;
            return this.b.c(((gtxg)object2), gtxd0, this.d, this) == object1 ? object1 : ibom.a;
        }
        catch(dtzv dtzv0) {
            throw dtzv0;
        }
        catch(JSONException jSONException0) {
            throw new dtzv("Error decoding received credential", jSONException0, 16);
        }
        catch(Exception exception0) {
            throw new dtzv("Error fetching and storing credential", exception0, 1);
        }
        return object1;
    }
}


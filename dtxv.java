import org.json.JSONException;

final class dtxv extends ibsl implements ibtw {
    int a;
    final dtyc b;
    final gtxg c;
    final gtxd d;
    final byte[] e;

    public dtxv(dtyc dtyc0, gtxg gtxg0, gtxd gtxd0, byte[] arr_b, ibrl ibrl0) {
        this.b = dtyc0;
        this.c = gtxg0;
        this.d = gtxd0;
        this.e = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtxv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtxv(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return ibom.a;
            }
            catch(JSONException jSONException0) {
                throw new dtzv("Error decoding received credential", jSONException0, 16);
            }
            catch(Exception exception0) {
                goto label_11;
            }
        }
        ibnx.b(object0);
        try {
            this.a = 1;
            return this.b.c(this.c, this.d, this.e, this) == object1 ? object1 : ibom.a;
        }
        catch(JSONException jSONException0) {
            throw new dtzv("Error decoding received credential", jSONException0, 16);
        }
        catch(Exception exception0) {
        label_11:
            dtzv dtzv0 = (exception0 instanceof dtzv) ? ((dtzv)exception0) : null;
            throw dtzv0 == null ? new dtzv("Error fetching and storing credential", exception0, 1) : dtzv0;
        }
        return object1;
    }
}


import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dvwe implements evqf {
    public final dvxj a;

    public dvwe(dvxj dvxj0) {
        this.a = dvxj0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        gged_interceptors gged0 = fsig.b(((ProtoSafeParcelable)object0));
        dvxj dvxj0 = this.a;
        int v = dvxj0.U(gged0, true, gfqx.a);
        if(v == 2) {
            dvxj0.c.b(true);
            dvxj0.J();
            return;
        }
        switch(v) {
            case 3: 
            case 4: {
                dvxj0.J();
                return;
            }
            case 5: {
                dvxj0.J();
            }
        }
    }
}


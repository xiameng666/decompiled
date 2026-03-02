import com.google.android.gms.common.api.Status;

public final class fdlj implements azvd {
    final evqp a;

    public fdlj(evqp evqp0) {
        this.a = evqp0;
    }

    @Override  // azvd
    public final void a(Status status0) {
        aztb aztb0 = new aztb(status0);
        this.a.a(aztb0);
    }

    @Override  // azvd
    public final void b(Object object0) {
        switch(((Status)object0).i) {
            case 0: 
            case 4001: {
                this.a.b(null);
                return;
            }
            default: {
                this.a(((Status)object0));
            }
        }
    }
}


import com.google.android.gms.common.api.Status;

public final class fdli implements azvd {
    final evqp a;

    public fdli(evqp evqp0) {
        this.a = evqp0;
    }

    @Override  // azvd
    public final void a(Status status0) {
        aztb aztb0 = new aztb(status0);
        this.a.a(aztb0);
    }

    @Override  // azvd
    public final void b(Object object0) {
        int v = ((Status)object0).i;
        if(v == 0) {
            this.a.b(Boolean.valueOf(true));
            return;
        }
        if(v == 4002) {
            this.a.b(Boolean.valueOf(false));
            return;
        }
        this.a(((Status)object0));
    }
}


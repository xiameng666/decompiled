import android.content.Context;

final class eknr implements evqc, evqf {
    final eknt a;

    public eknr(eknt eknt0) {
        this.a = eknt0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Context context0 = this.a.getContext();
        if(context0 == null) {
            return;
        }
        eknp.a(context0, "IsV5EnabledListener", exception0);
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        eknt eknt0 = this.a;
        if(eknt0.getContext() == null) {
            return;
        }
        eknt0.L((z ? 3 : 2));
    }
}


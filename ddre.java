import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;

public final class ddre implements azys {
    public final boolean a;

    public ddre(boolean z) {
        this.a = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        SetEnabledParams setEnabledParams0 = new SetEnabledParams();
        setEnabledParams0.a = this.a;
        setEnabledParams0.b = new ddrt(((evqp)object1));
        ddot0.X(setEnabledParams0);
    }
}


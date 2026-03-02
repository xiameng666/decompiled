import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

public final class ddpx implements azys {
    public final CharSequence a;

    public ddpx(CharSequence charSequence0) {
        this.a = charSequence0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        SetDeviceNameParams setDeviceNameParams0 = new SetDeviceNameParams();
        setDeviceNameParams0.a = this.a.toString();
        setDeviceNameParams0.b = new ddrt(((evqp)object1));
        ddot0.U(setDeviceNameParams0);
    }
}


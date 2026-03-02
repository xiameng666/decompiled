import android.content.IntentFilter;

public final class fdfo implements azys {
    public final fcec a;
    public final azyf b;
    public final IntentFilter[] c;

    public fdfo(fcec fcec0, azyf azyf0, IntentFilter[] arr_intentFilter) {
        this.a = fcec0;
        this.b = azyf0;
        this.c = arr_intentFilter;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        fdmm fdmm0 = (fdmm)object0;
        fdlj fdlj0 = new fdlj(((evqp)object1));
        fdmt fdmt0 = new fdmt(this.c);
        fdmt0.d = this.b;
        fdmm0.f.a(fdmm0, fdlj0, this.a, fdmt0);
    }
}


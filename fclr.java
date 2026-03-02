import com.google.android.gms.wearable.backup.phone.SelectBackupFragment;

public final class fclr implements lqj {
    public final SelectBackupFragment a;
    public final lqd b;
    public final fcln c;

    public fclr(SelectBackupFragment selectBackupFragment0, lqd lqd0, fcln fcln0) {
        this.a = selectBackupFragment0;
        this.b = lqd0;
        this.c = fcln0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        this.b.k(this.a);
        fcln.a.h("Selecting device " + ((aqfl)object0).e, new Object[0]);
        fcln fcln0 = this.c;
        fcln0.i.l(((aqfl)object0));
        if(fcln0.f) {
            byte[] arr_b = ((aqfl)object0).toBytesArray();
            evql evql0 = fcln0.d.g(fcln0.e, fclm.d.ordinal(), arr_b);
            evql0.b(new fcla(fcln0));
            evql0.A(new fclb(fcln0));
            return;
        }
        fcln0.b(fclm.d);
    }
}


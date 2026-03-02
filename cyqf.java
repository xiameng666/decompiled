public final class cyqf implements Runnable {
    public final cyqh a;

    public cyqf(cyqh cyqh0) {
        this.a = cyqh0;
    }

    @Override
    public final void run() {
        cyqh cyqh0 = this.a;
        if(cyqh0.i()) {
            ((ggtj)cyjh.a.g().ar(8024)).B("%s: onResponseTimeout called but task already finished!", cyqh0.a());
            return;
        }
        cyqh0.k(8);
        if(cyqh0.i > cyqh0.f) {
            cyqh0.h(cyqm.c, null);
            return;
        }
        cyqh0.g();
    }
}


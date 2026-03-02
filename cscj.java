public final class cscj implements Runnable {
    public final cscn a;
    public final qia b;

    public cscj(cscn cscn0, qia qia0) {
        this.a = cscn0;
        this.b = qia0;
    }

    @Override
    public final void run() {
        String s = this.b.b;
        String s1 = this.b.c;
        ((ggtj)cscn.a.h()).x("Received activation code for eSIM");
        csbe csbe0 = new csbe();
        cscn cscn0 = this.a;
        cscn0.ag.putString("esim_activation_code", s);
        if(hvlq.q() && cscn0.ag.getBoolean("show_new_phone_number")) {
            cscn0.ag.putString("esim_phone_number", s1);
        }
        cscn0.c.o(cscn0.ag);
        cscn0.d.removeCallbacksAndMessages(null);
        ca ca0 = new ca(cscn0.b.getSupportFragmentManager());
        ca0.j = 0x1003;
        ca0.C();
        ca0.z(0x7F0B0FCE, csbe0, "esim_download");  // id:container
        ca0.a();
        cscn0.b.getSupportFragmentManager().aq();
    }
}


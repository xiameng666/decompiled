public final class bbt implements blv {
    public final bce a;

    public bbt(bce bce0) {
        this.a = bce0;
    }

    @Override  // blv
    public final void a(bmb bmb0) {
        bce bce0 = this.a;
        if(bce0.C() == null) {
            return;
        }
        bhd bhd0 = bce0.d;
        boj.b();
        bhd0.e = true;
        bgw bgw0 = bhd0.c;
        if(bgw0 != null) {
            boj.b();
            if(!bgw0.b.isDone()) {
                bgw0.b(new bcf("The request is aborted silently and retried.", null));
                boj.b();
                bcs.h("TakePictureManagerImpl");
                bgw0.h.a.addFirst(bgw0.a);
                bgw0.h.b();
            }
        }
        bce0.i(true);
        bce0.F();
        bkk bkk0 = (bkk)bce0.i;
        bmi bmi0 = bce0.j;
        kay.i(bmi0);
        bce0.e = bce0.q(bkk0, bmi0);
        bce0.P(bbs.a(bce0.e.a()));
        bce0.K();
        bhd bhd1 = bce0.d;
        boj.b();
        bhd1.e = false;
        bhd1.b();
    }
}


public final class bdl implements bav {
    public final bdm a;

    public bdl(bdm bdm0) {
        this.a = bdm0;
    }

    @Override  // bav
    public final void k(bcn bcn0) {
        bav bav0;
        bdm bdm0 = this.a;
        synchronized(bdm0.a) {
            int v1 = bdm0.b - 1;
            bdm0.b = v1;
            if(bdm0.c && v1 == 0) {
                bdm0.i();
            }
            bav0 = bdm0.e;
        }
        if(bav0 != null) {
            bav0.k(bcn0);
        }
    }
}


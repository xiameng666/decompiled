public final class fwwt {
    public int a;
    private int b;

    public fwwt() {
        this.a = 0;
    }

    final boolean a(long v, fwvy[] arr_fwvy) {
        int v1 = 0;
        switch(this.a) {
            case 0: {
                if(arr_fwvy != null && arr_fwvy.length != 0) {
                    ++this.b;
                    while(v1 < arr_fwvy.length) {
                        fwvy fwvy0 = arr_fwvy[v1];
                        if(fwvy0 == null) {
                            ++v1;
                            continue;
                        }
                        else {
                            long v2 = fwvy0.a;
                            if(v2 != 0L && v2 != -1L) {
                                if(Math.abs(v - v2) > 3600000L) {
                                    this.a = 1;
                                    return this.a(v, null);
                                }
                                if(this.b > 6) {
                                    this.a = 2;
                                }
                                ++v1;
                                continue;
                            }
                            this.a = 1;
                            return this.a(v, null);
                        }
                        break;
                    }
                    return this.a(v, null);
                }
                return true;
            }
            case 1: {
                return false;
            }
            default: {
                return true;
            }
        }
    }
}


public final class dlzr implements dmba {
    private final dlmc a;

    public dlzr(dlmc dlmc0) {
        this.a = dlmc0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ftgf ftgf0;
        int v1;
        ftgg ftgg0 = ecfu.a(this.a.b());
        hjuy hjuy0 = hjwe0.b == 41 ? ((hjuy)hjwe0.c) : hjuy.a;
        int v = 2;
        switch(hjuy0.b) {
            case 0: {
                v1 = 2;
                break;
            }
            case 1: {
                v1 = 3;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            case 3: {
                v1 = 5;
                break;
            }
            case 4: {
                v1 = 6;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 2) {
            case 1: {
                ftgf0 = ftgf.b(ftgg0.l);
                if(ftgf0 == null) {
                    ftgf0 = ftgf.e;
                }
                break;
            }
            case 2: {
                ftgf0 = ftgf.b(ftgg0.o);
                if(ftgf0 == null) {
                    ftgf0 = ftgf.e;
                }
                break;
            }
            case 3: {
                ftgf0 = ftgf.b(ftgg0.m);
                if(ftgf0 == null) {
                    ftgf0 = ftgf.e;
                }
                break;
            }
            case 4: {
                ftgf0 = ftgf.b(ftgg0.n);
                if(ftgf0 == null) {
                    ftgf0 = ftgf.e;
                }
                break;
            }
            default: {
                return false;
            }
        }
        switch(hjuy0.c) {
            case 0: {
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            v = 1;
        }
        return ftgf0 != ftgf.c || v != 3 ? ftgf0 == ftgf.d && v == 4 : true;
    }
}


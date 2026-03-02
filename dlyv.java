import com.google.android.gms.pay.IntentSource;

public final class dlyv implements dmba {
    private final IntentSource a;

    public dlyv(IntentSource intentSource0) {
        this.a = intentSource0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 11, "cannot evaluate: does not have intent source filter");
        for(Object object0: new hfuh((hjwe0.b == 11 ? ((hjua)hjwe0.c) : hjua.b).c, hjua.a)) {
            switch(((hjtz)object0).ordinal()) {
                case 1: {
                    if(this.a.a != 1) {
                        continue;
                    }
                    return true;
                }
                case 2: {
                    if(this.a.a != 2) {
                        continue;
                    }
                    return true;
                }
                case 3: {
                    if(this.a.a != 3) {
                        continue;
                    }
                    return true;
                }
                case 4: {
                    if(this.a.a == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


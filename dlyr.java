public final class dlyr implements dmba {
    private final int a;

    public dlyr(int v) {
        this.a = v;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 10, "Cannot evaluate this filter, because it is not a Host Page filter.");
        for(Object object0: new hfuh((hjwe0.b == 10 ? ((hjvl)hjwe0.c) : hjvl.b).c, hjvl.a)) {
            switch(((hjvk)object0).ordinal()) {
                case 2: {
                    if(this.a != 2) {
                        continue;
                    }
                    return true;
                }
                case 3: {
                    if(this.a != 3) {
                        continue;
                    }
                    return true;
                }
                case 4: {
                    if(this.a != 4) {
                        continue;
                    }
                    return true;
                }
                case 5: {
                    if(this.a != 6) {
                        continue;
                    }
                    return true;
                }
                case 6: {
                    if(this.a != 7) {
                        continue;
                    }
                    return true;
                }
                case 7: {
                    if(this.a != 8) {
                        continue;
                    }
                    return true;
                }
                case 8: {
                    if(this.a != 9) {
                        continue;
                    }
                    return true;
                }
                case 9: {
                    if(this.a == 10) {
                        return true;
                    }
                    continue;
                }
                case 0: 
                case 1: 
                case 10: {
                    if(this.a != 1) {
                        continue;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}


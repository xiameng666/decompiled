public final class hmfy {
    private final hmgf a;

    public hmfy(hmgf hmgf0) {
        this.a = hmgf0;
    }

    public final int a() {
        hmgf hmgf0 = this.a;
        if(hmgf0.e() == 1) {
            int v = (byte)(((Byte)((hmfb)hmgf0.e.d(hmfb.class)).a));
            try {
                hmef hmef0 = (hmef)hmgf0.e.d(hmef.class);
                if(((long)(((Long)hmgf0.e.b().a))) == 0L) {
                    switch(((short)(((Short)hmef0.a)))) {
                        case 0x4111: 
                        case 0x4131: 
                        case 18308: {
                            return 4;
                        }
                    }
                    if(((short)(((Short)hmef0.a))) == 0x7523) {
                        return 4;
                    }
                }
            label_8:
                switch(v) {
                    case 0: {
                        return 1;
                    }
                    case 1: {
                        return 3;
                    }
                    case 9: {
                        return 5;
                    }
                    case 0x20: {
                        return 2;
                    }
                }
            }
            catch(hmdp unused_ex) {
                goto label_8;
            }
            return 6;
        }
        else {
            hmgf hmgf1 = this.a;
            if(hmgf1.e() == 2) {
                hmgd hmgd0 = (hmgd)hmgf1;
            }
        }
        return 1;
    }
}


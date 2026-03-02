public final class bat {
    public static final bat a;
    public static final bat b;
    public static final bat c;
    public static final bat d;
    public static final bat e;
    public static final bat f;
    public static final bat g;
    public final int h;
    public final int i;

    static {
        bat.a = new bat(0, 0);
        bat.b = new bat(1, 8);
        bat.c = new bat(3, 10);
        bat.d = new bat(4, 10);
        bat.e = new bat(5, 10);
        bat.f = new bat(6, 10);
        bat.g = new bat(6, 8);
    }

    public bat(int v, int v1) {
        this.h = v;
        this.i = v1;
    }

    public final boolean a() {
        return this.b() && this.h != 1 && this.i == 10;
    }

    public final boolean b() {
        return this.h != 0 && this.h != 2 && this.i != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bat) && this.h == ((bat)object0).h && this.i == ((bat)object0).i;
    }

    @Override
    public final int hashCode() {
        return this.i ^ (this.h ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("DynamicRange@");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("{encoding=");
        switch(this.h) {
            case 0: {
                s = "UNSPECIFIED";
                break;
            }
            case 1: {
                s = "SDR";
                break;
            }
            case 2: {
                s = "HDR_UNSPECIFIED";
                break;
            }
            case 3: {
                s = "HLG";
                break;
            }
            case 4: {
                s = "HDR10";
                break;
            }
            case 5: {
                s = "HDR10_PLUS";
                break;
            }
            case 6: {
                s = "DOLBY_VISION";
                break;
            }
            default: {
                s = "<Unknown>";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", bitDepth=");
        stringBuilder0.append(this.i);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}


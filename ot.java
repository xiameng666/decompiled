public final class ot {
    public int a;
    public int b;
    Object c;
    public int d;

    public ot(int v, int v1, int v2, Object object0) {
        this.a = v;
        this.b = v1;
        this.d = v2;
        this.c = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ot)) {
            return false;
        }
        int v = this.a;
        if(v != ((ot)object0).a) {
            return false;
        }
        if(v == 8 && Math.abs(this.d - this.b) == 1 && this.d == ((ot)object0).b && this.b == ((ot)object0).d) {
            return true;
        }
        if(this.d != ((ot)object0).d) {
            return false;
        }
        if(this.b != ((ot)object0).b) {
            return false;
        }
        return this.c == null ? ((ot)object0).c == null : this.c.equals(((ot)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.a * 0x1F + this.b) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("[");
        switch(this.a) {
            case 1: {
                s = "add";
                break;
            }
            case 2: {
                s = "rm";
                break;
            }
            case 4: {
                s = "up";
                break;
            }
            case 8: {
                s = "mv";
                break;
            }
            default: {
                s = "??";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(",s:");
        stringBuilder0.append(this.b);
        stringBuilder0.append("c:");
        stringBuilder0.append(this.d);
        stringBuilder0.append(",p:");
        stringBuilder0.append(this.c);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}


import java.io.IOException;

public abstract class igdo implements igdj {
    @Override
    public final int compareTo(Object object0) {
        return this.i(((igdj)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igdj) ? this.h() == ((igdj)object0).h() : false;
    }

    @Override
    public final int hashCode() {
        long v = this.h();
        return (int)(v ^ v >>> 0x20);
    }

    public final int i(igdj igdj0) {
        int v = Long.compare(this.h(), igdj0.h());
        if(v < 0) {
            return -1;
        }
        return v <= 0 ? 0 : 1;
    }

    @Override
    public final String toString() {
        long v = this.h();
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("PT");
        try {
            if(((long)(((int)v))) == v) {
                ighn.d(stringBuffer0, ((int)v));
            }
            else {
                stringBuffer0.append(Long.toString(v));
            }
        }
        catch(IOException unused_ex) {
        }
        while(true) {
            int v1 = Long.compare(v, 0L);
            if(stringBuffer0.length() >= (v1 >= 0 ? 6 : 7)) {
                break;
            }
            stringBuffer0.insert((v1 >= 0 ? 2 : 3), "0");
        }
        if(v / 1000L * 1000L == v) {
            stringBuffer0.setLength(stringBuffer0.length() - 3);
        }
        else {
            stringBuffer0.insert(stringBuffer0.length() - 3, ".");
        }
        stringBuffer0.append('S');
        return stringBuffer0.toString();
    }
}


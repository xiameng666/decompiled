import java.util.List;
import java.util.Objects;

public final class azy {
    private final List a;
    private final bki b;

    public azy(List list0, bki bki0) {
        this.a = list0;
        this.b = bki0;
        kay.b(((boolean)(list0.isEmpty() ^ 1)), "Camera ID set cannot be empty.");
    }

    public final String a() {
        kay.d(this.a.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String)ibpo.R(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof azy)) {
            return false;
        }
        return ibuq.m(this.a, ((azy)object0).a) ? ibuq.m(this.b, ((azy)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("CameraIdentifier{cameraIds=");
        stringBuilder0.append(ibpo.aK(this.a, ",", null, null, null, 62));
        bki bki0 = this.b;
        if(bki0 == null) {
            s = "";
        }
        else {
            Objects.toString(bki0);
            s = ", compatId=" + bki0.toString();
        }
        stringBuilder0.append(s);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}


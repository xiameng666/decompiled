import com.google.android.gms.findmydevice.spot.GetOwnerKeyResponse;

public final class bpmf implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        fqzn fqzn0 = (fqzn)object0;
        Object object1 = new GetOwnerKeyResponse();
        object1.a = fqzn0.e;
        object1.b = fqzn0.c.toByteArray();
        return object1;
    }
}


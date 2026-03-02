import com.google.android.gms.semanticlocationhistory.InferredPlace;

public final class ehvt implements evqf {
    public final ehvw a;

    public ehvt(ehvw ehvw0) {
        this.a = ehvw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((InferredPlace)object0) != null && ((InferredPlace)object0).b != null) {
            this.a.e.add(((InferredPlace)object0));
        }
    }
}


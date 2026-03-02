import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;

public final class crvb {
    public final MdpDataPlanStatusRequest a;

    public crvb() {
        this.a = new MdpDataPlanStatusRequest();
    }

    public crvb(MdpDataPlanStatusRequest mdpDataPlanStatusRequest0) {
        this.a = new MdpDataPlanStatusRequest(mdpDataPlanStatusRequest0.a, mdpDataPlanStatusRequest0.b, mdpDataPlanStatusRequest0.c, mdpDataPlanStatusRequest0.d, mdpDataPlanStatusRequest0.e, mdpDataPlanStatusRequest0.f);
    }

    public final void a(String s) {
        this.a.a = s;
    }

    public final void b(Integer integer0) {
        this.a.c = integer0;
    }

    public final void c(Long long0) {
        this.a.d = long0;
    }
}


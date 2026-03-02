import j..util.Optional;

public final class asfq implements Runnable {
    public final asfr a;
    public final asfm b;

    public asfq(asfr asfr0, asfm asfm0) {
        this.a = asfr0;
        this.b = asfm0;
    }

    @Override
    public final void run() {
        asfr asfr0 = this.a;
        if(asfr0.h != null && !((bbll)asfr0.h).d) {
            asfr.a.j("Checking if backup constraints are still satisfied...", new Object[0]);
            Optional optional0 = asfr0.a();
            if(optional0.isPresent()) {
                this.b.a.h = Optional.of(((Integer)optional0.get()));
                this.b.a.b.e();
            }
        }
    }
}


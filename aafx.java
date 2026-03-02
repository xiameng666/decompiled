public final class aafx extends re {
    @Override  // vl
    public final boolean o(uq uq0, uq uq1, tq tq0, tq tq1) {
        ibuq.f(uq0, "oldHolder");
        ibuq.f(uq1, "newHolder");
        ibuq.f(tq0, "preLayoutInfo");
        ibuq.f(tq1, "postLayoutInfo");
        if((uq0 instanceof zrd) && (uq1 instanceof zrd) && tq1.b < tq0.b) {
            this.l(uq1);
            return true;
        }
        return super.o(uq0, uq1, tq0, tq1);
    }
}


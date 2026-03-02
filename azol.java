public final class azol {
    public final ggfp a;
    public final int b;

    public azol() {
        throw null;
    }

    public azol(int v, ggfp ggfp0) {
        this.b = v;
        if(ggfp0 == null) {
            throw new NullPointerException("Null experimentIds");
        }
        this.a = ggfp0;
    }

    public static azol a(Iterable iterable0) {
        return azol.b(1, iterable0);
    }

    static azol b(int v, Iterable iterable0) {
        return new azol(v, ggfp.F(iterable0));
    }

    public static azol c(int v) {
        return azol.b(v, ggnj.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azol) && this.b == ((azol)object0).b && this.a.equals(((azol)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.b ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        switch(this.b) {
            case 1: {
                return "ExperimentIdsResult{status=SUCCESS, experimentIds=" + this.a.toString() + "}";
            }
            case 2: {
                return "ExperimentIdsResult{status=TOKEN_DECODING_FAILURE, experimentIds=" + this.a.toString() + "}";
            }
            case 3: {
                return "ExperimentIdsResult{status=CACHE_READ_FAILURE, experimentIds=" + this.a.toString() + "}";
            }
            default: {
                return "ExperimentIdsResult{status=TASKS_AWAIT_FAILURE, experimentIds=" + this.a.toString() + "}";
            }
        }
    }
}


public final class ayvl {
    public static final ayvl a;
    public final double b;
    public final int c;

    static {
        ayvl.b(1, Double.valueOf(0.0));
        ayvl.a(3);
        ayvl.a(4);
        ayvl.a = ayvl.a(5);
        ayvl.b(2, Double.valueOf(1.0));
    }

    public ayvl() {
        throw null;
    }

    public ayvl(int v, double f) {
        this.c = v;
        this.b = f;
    }

    static ayvl a(int v) {
        return ayvl.b(v, null);
    }

    static ayvl b(int v, Double double0) {
        if(double0 == null) {
            double0 = (double)0.0;
        }
        return new ayvl(v, ((double)double0));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ayvl) && this.c == ((ayvl)object0).c && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((ayvl)object0).b);
    }

    @Override
    public final int hashCode() {
        return (this.c ^ 1000003) * 1000003 ^ ((int)(Double.doubleToLongBits(this.b) ^ Double.doubleToLongBits(this.b) >>> 0x20));
    }

    @Override
    public final String toString() {
        switch(this.c) {
            case 1: {
                return "LogSamplerResult{samplingDecision=NO_UPLOAD, overallEffectiveSamplingRate=" + this.b + "}";
            }
            case 2: {
                return "LogSamplerResult{samplingDecision=UPLOAD, overallEffectiveSamplingRate=" + this.b + "}";
            }
            case 3: {
                return "LogSamplerResult{samplingDecision=ALWAYS_UPLOAD_DUE_TO_ERROR, overallEffectiveSamplingRate=" + this.b + "}";
            }
            case 4: {
                return "LogSamplerResult{samplingDecision=SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT, overallEffectiveSamplingRate=" + this.b + "}";
            }
            default: {
                return "LogSamplerResult{samplingDecision=ALWAYS_UPLOAD_NO_SAMPLER, overallEffectiveSamplingRate=" + this.b + "}";
            }
        }
    }
}


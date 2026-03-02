public final class fuzk {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public static final String[] a;
    public static final String[] b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
        fuzk.a = new String[]{"Diff0To6", "Diff6To12", "Diff12To18"};
        fuzk.b = new String[]{"meanLightLevel", "meanLightLevelDiff0To6", "meanLightLevelDiff6To12", "meanLightLevelDiff12To18", "accelGravityDirDiff0To6", "accelGravityDirDiff6To12", "accelGravityDirDiff12To18", "soundMeanLogEnergy", "soundLogStdEnergy", "soundStdOverMeanEnergy", "soundMeanLogBark1", "soundMeanLogBark2", "soundMeanLogBark3", "soundMeanLogBark4", "soundMeanLogBark5", "soundMeanLogBark6", "soundMeanLogBark7", "soundMeanLogBark8", "soundMeanLogBark9", "soundMeanLogBark10", "soundMeanLogBark11", "soundMeanLogBark12", "soundMeanLogBark13", "soundMeanLogBark14", "soundMeanLogBark15", "soundMeanLogBark16", "soundMeanLogBark17", "soundMeanLogBark18", "soundMeanLogBark19", "soundMeanLogBark20", "soundMeanLogBark21", "soundMeanLogBark22", "soundMeanLogBarkDiff0To6", "soundMeanLogBarkDiff6To12", "soundMeanLogBarkDiff12To18", "hourOfDay", "presenceConfidence"};
    }

    public fuzk() {
        this.I = -1.0f;
        this.J = -1.0f;
        this.K = -1.0f;
    }

    public final float a(String s) {
        String s1;
        int v;
        for(v = 0; true; ++v) {
            if(v >= 37) {
                s1 = s;
                v = -1;
                break;
            }
            if(fuzk.b[v].equals(s)) {
                s1 = s;
                break;
            }
        }
        if(v != -1) {
            return new float[]{this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M}[v];
        }
        throw new IllegalArgumentException("Invalid feature name: " + s1);
    }

    public final void b(String s, float f) {
        switch(s) {
            case "accelGravityDirDiff0To6": {
                this.g = f;
                return;
            }
            case "accelGravityDirDiff12To18": {
                this.i = f;
                return;
            }
            case "accelGravityDirDiff6To12": {
                this.h = f;
                return;
            }
            case "hourOfDay": {
                this.L = f;
                return;
            }
            case "meanLightLevel": {
                this.c = f;
                return;
            }
            case "meanLightLevelDiff0To6": {
                this.d = f;
                return;
            }
            case "meanLightLevelDiff12To18": {
                this.f = f;
                return;
            }
            case "meanLightLevelDiff6To12": {
                this.e = f;
                return;
            }
            case "presenceConfidence": {
                this.M = f;
                return;
            }
            case "soundLogStdEnergy": {
                this.k = f;
                return;
            }
            case "soundMeanLogBark1": {
                this.m = f;
                return;
            }
            case "soundMeanLogBark10": {
                this.v = f;
                return;
            }
            case "soundMeanLogBark11": {
                this.w = f;
                return;
            }
            case "soundMeanLogBark12": {
                this.x = f;
                return;
            }
            case "soundMeanLogBark13": {
                this.y = f;
                return;
            }
            case "soundMeanLogBark14": {
                this.z = f;
                return;
            }
            case "soundMeanLogBark15": {
                this.A = f;
                return;
            }
            case "soundMeanLogBark16": {
                this.B = f;
                return;
            }
            case "soundMeanLogBark17": {
                this.C = f;
                return;
            }
            case "soundMeanLogBark18": {
                this.D = f;
                return;
            }
            case "soundMeanLogBark19": {
                this.E = f;
                return;
            }
            case "soundMeanLogBark2": {
                this.n = f;
                return;
            }
            case "soundMeanLogBark20": {
                this.F = f;
                return;
            }
            case "soundMeanLogBark21": {
                this.G = f;
                return;
            }
            case "soundMeanLogBark22": {
                this.H = f;
                return;
            }
            case "soundMeanLogBark3": {
                this.o = f;
                return;
            }
            case "soundMeanLogBark4": {
                this.p = f;
                return;
            }
            case "soundMeanLogBark5": {
                this.q = f;
                return;
            }
            case "soundMeanLogBark6": {
                this.r = f;
                return;
            }
            case "soundMeanLogBark7": {
                this.s = f;
                return;
            }
            case "soundMeanLogBark8": {
                this.t = f;
                return;
            }
            case "soundMeanLogBark9": {
                this.u = f;
                return;
            }
            case "soundMeanLogBarkDiff0To6": {
                this.I = f;
                return;
            }
            case "soundMeanLogBarkDiff12To18": {
                this.K = f;
                return;
            }
            case "soundMeanLogBarkDiff6To12": {
                this.J = f;
                return;
            }
            case "soundMeanLogEnergy": {
                this.j = f;
                return;
            }
            case "soundStdOverMeanEnergy": {
                this.l = f;
                return;
            }
            default: {
                throw new IllegalArgumentException("Invalid feature name: " + s);
            }
        }
    }
}


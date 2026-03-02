public final class qqr implements qql {
    public final boolean a;
    public final int b;

    public qqr(int v, boolean z) {
        this.b = v;
        this.a = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        if(!qkz0.i) {
            qtq.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new qmc(this);
    }

    @Override
    public final String toString() {
        switch(this.b) {
            case 1: {
                return a.a("MERGE", "MergePaths{mode=", "}");
            }
            case 2: {
                return a.a("ADD", "MergePaths{mode=", "}");
            }
            case 3: {
                return a.a("SUBTRACT", "MergePaths{mode=", "}");
            }
            case 4: {
                return a.a("INTERSECT", "MergePaths{mode=", "}");
            }
            case 5: {
                return a.a("EXCLUDE_INTERSECTIONS", "MergePaths{mode=", "}");
            }
            default: {
                return a.a("null", "MergePaths{mode=", "}");
            }
        }
    }
}


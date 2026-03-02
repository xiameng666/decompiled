import java.util.Objects;

public class iep extends hfb {
    public final int C;
    public hfb D;

    public iep() {
        this.C = iia.b(this);
    }

    @Override  // hfb
    public final void K() {
        super.K();
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.R(this.x);
            if(!hfb0.B) {
                hfb0.K();
            }
        }
    }

    @Override  // hfb
    public final void L() {
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.L();
        }
        super.L();
    }

    @Override  // hfb
    public final void M() {
        super.M();
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.M();
        }
    }

    @Override  // hfb
    public final void N() {
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.N();
        }
        super.N();
    }

    @Override  // hfb
    public final void O() {
        super.O();
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.O();
        }
    }

    @Override  // hfb
    public final void P(hfb hfb0) {
        this.r = hfb0;
        for(hfb hfb1 = this.D; hfb1 != null; hfb1 = hfb1.v) {
            hfb1.P(hfb0);
        }
    }

    @Override  // hfb
    public final void R(ihy ihy0) {
        this.x = ihy0;
        for(hfb hfb0 = this.D; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.R(ihy0);
        }
    }

    public final void S(iem iem0) {
        hfb hfb0 = this.D;
        hfb hfb1 = null;
        while(hfb0 != null) {
            if(hfb0 == iem0) {
                if(hfb0.B) {
                    iia.f(hfb0);
                    hfb0.O();
                    hfb0.L();
                }
                hfb0.P(hfb0);
                hfb0.t = 0;
                if(hfb1 == null) {
                    this.D = hfb0.v;
                }
                else {
                    hfb1.v = hfb0.v;
                }
                hfb0.v = null;
                hfb0.u = null;
                int v = this.s;
                int v1 = iia.c(this);
                this.dI(v1, true);
                if(this.B && (v & 2) != 0 && (v1 & 2) == 0) {
                    ihl ihl0 = ien.d(this).u;
                    this.r.R(null);
                    ihl0.i();
                }
                return;
            }
            hfb1 = hfb0;
            hfb0 = hfb0.v;
        }
        Objects.toString(iem0);
        throw new IllegalStateException("Could not find delegate: " + iem0);
    }

    public final void T(iem iem0) {
        hfb hfb0 = iem0.I();
        hfb hfb1 = null;
        if(hfb0 == iem0) {
            if(hfb0.B) {
                hxt.d("Cannot delegate to an already attached node");
            }
            hfb0.P(this.r);
            int v = this.s;
            int v1 = iia.c(hfb0);
            hfb0.s = v1;
            if((v1 & 2) != 0 && (this.s & 2) != 0 && !(this instanceof ifk)) {
                hxt.d(a.m(hfb0, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
            }
            hfb0.v = this.D;
            this.D = hfb0;
            hfb0.u = this;
            this.dI(v1 | this.s, false);
            if(this.B) {
                if((v1 & 2) != 0 && (v & 2) == 0) {
                    ihl ihl0 = ien.d(this).u;
                    this.r.R(null);
                    ihl0.i();
                }
                else {
                    this.R(this.x);
                }
                hfb0.K();
                hfb0.N();
                iia.d(hfb0);
            }
        }
        else {
            if(!(iem0 instanceof hfb)) {
                iem0 = null;
            }
            if(iem0 != null) {
                hfb1 = ((hfb)iem0).u;
            }
            if(hfb0 != this.r || !ibuq.m(hfb1, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        }
    }

    private final void dI(int v, boolean z) {
        int v1 = this.s;
        this.s = v;
        if(v1 != v) {
            if(this.I() == this) {
                this.t = v;
            }
            if(this.B) {
                hfb hfb0 = this.r;
                while(this != null) {
                    v |= this.s;
                    this.s = v;
                    if(this == hfb0) {
                        break;
                    }
                    this = this.u;
                }
                if(z && this == hfb0) {
                    v = iia.c(hfb0);
                    hfb0.s = v;
                }
                int v2 = 0;
                if(this != null) {
                    hfb hfb1 = this.v;
                    if(hfb1 != null) {
                        v2 = hfb1.t;
                    }
                }
                int v3 = v | v2;
                while(this != null) {
                    v3 |= this.s;
                    this.t = v3;
                    this = this.u;
                }
            }
        }
    }
}


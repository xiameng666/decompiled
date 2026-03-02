import java.util.List;
import jeb.synthetic.FIN;

public final class hfsm {
    public final hfsl a;
    public int b;
    public int c;
    private int d;

    private hfsm(hfsl hfsl0) {
        this.c = 0;
        this.a = hfsl0;
        hfsl0.f = this;
    }

    public final void A(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfty)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfty)list0).i(hfsl0.f());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfty)list0).i(hfsl1.f());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Integer.valueOf(hfsl2.f()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Integer.valueOf(hfsl3.f()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void B(List list0) {
        int v5;
        int v2;
        if((list0 instanceof hfty)) {
            switch(hfxg.b(this.b)) {
                case 2: {
                    hfsl hfsl0 = this.a;
                    int v = hfsl0.n();
                    hfsm.T(v);
                    int v1 = hfsl0.d() + v;
                    do {
                        ((hfty)list0).i(hfsl0.g());
                    }
                    while(hfsl0.d() < v1);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl1 = this.a;
                ((hfty)list0).i(hfsl1.g());
                if(hfsl1.D()) {
                    return;
                }
                v2 = hfsl1.m();
            }
            while(v2 == this.b);
        }
        else {
            switch(hfxg.b(this.b)) {
                case 2: {
                    hfsl hfsl2 = this.a;
                    int v3 = hfsl2.n();
                    hfsm.T(v3);
                    int v4 = hfsl2.d() + v3;
                    do {
                        list0.add(Integer.valueOf(hfsl2.g()));
                    }
                    while(hfsl2.d() < v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl3 = this.a;
                list0.add(Integer.valueOf(hfsl3.g()));
                if(hfsl3.D()) {
                    return;
                }
                v5 = hfsl3.m();
            }
            while(v5 == this.b);
            v2 = v5;
        }
        this.c = v2;
    }

    public final void C(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfvb)) {
            switch(hfxg.b(this.b)) {
                case 1: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfvb)list0).g(hfsl0.o());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    hfsm.U(v1);
                    int v2 = v1 + hfsl1.d();
                    do {
                        ((hfvb)list0).g(hfsl1.o());
                    }
                    while(hfsl1.d() < v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(hfxg.b(this.b)) {
            case 1: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Long.valueOf(hfsl2.o()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                hfsm.U(v4);
                int v5 = v4 + hfsl3.d();
                do {
                    list0.add(Long.valueOf(hfsl3.o()));
                }
                while(hfsl3.d() < v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void D(List list0) {
        int v5;
        int v2;
        if((list0 instanceof hftj)) {
            switch(this.b & 7) {
                case 2: {
                    hfsl hfsl0 = this.a;
                    int v = hfsl0.n();
                    hfsm.T(v);
                    int v1 = hfsl0.d() + v;
                    do {
                        ((hftj)list0).h(hfsl0.c());
                    }
                    while(hfsl0.d() < v1);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl1 = this.a;
                ((hftj)list0).h(hfsl1.c());
                if(hfsl1.D()) {
                    return;
                }
                v2 = hfsl1.m();
            }
            while(v2 == this.b);
        }
        else {
            switch(this.b & 7) {
                case 2: {
                    hfsl hfsl2 = this.a;
                    int v3 = hfsl2.n();
                    hfsm.T(v3);
                    int v4 = hfsl2.d() + v3;
                    do {
                        list0.add(Float.valueOf(hfsl2.c()));
                    }
                    while(hfsl2.d() < v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl3 = this.a;
                list0.add(Float.valueOf(hfsl3.c()));
                if(hfsl3.D()) {
                    return;
                }
                v5 = hfsl3.m();
            }
            while(v5 == this.b);
            v2 = v5;
        }
        this.c = v2;
    }

    public final void E(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfty)) {
            switch(hfxg.b(this.b)) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfty)list0).i(hfsl0.h());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfty)list0).i(hfsl1.h());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(hfxg.b(this.b)) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Integer.valueOf(hfsl2.h()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Integer.valueOf(hfsl3.h()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void F(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfvb)) {
            switch(hfxg.b(this.b)) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfvb)list0).g(hfsl0.p());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfvb)list0).g(hfsl1.p());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(hfxg.b(this.b)) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Long.valueOf(hfsl2.p()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Long.valueOf(hfsl3.p()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void G(List list0) {
        int v5;
        int v2;
        if((list0 instanceof hfty)) {
            switch(this.b & 7) {
                case 2: {
                    hfsl hfsl0 = this.a;
                    int v = hfsl0.n();
                    hfsm.T(v);
                    int v1 = hfsl0.d() + v;
                    do {
                        ((hfty)list0).i(hfsl0.k());
                    }
                    while(hfsl0.d() < v1);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl1 = this.a;
                ((hfty)list0).i(hfsl1.k());
                if(hfsl1.D()) {
                    return;
                }
                v2 = hfsl1.m();
            }
            while(v2 == this.b);
        }
        else {
            switch(this.b & 7) {
                case 2: {
                    hfsl hfsl2 = this.a;
                    int v3 = hfsl2.n();
                    hfsm.T(v3);
                    int v4 = hfsl2.d() + v3;
                    do {
                        list0.add(Integer.valueOf(hfsl2.k()));
                    }
                    while(hfsl2.d() < v4);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
            do {
                hfsl hfsl3 = this.a;
                list0.add(Integer.valueOf(hfsl3.k()));
                if(hfsl3.D()) {
                    return;
                }
                v5 = hfsl3.m();
            }
            while(v5 == this.b);
            v2 = v5;
        }
        this.c = v2;
    }

    public final void H(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfvb)) {
            switch(hfxg.b(this.b)) {
                case 1: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfvb)list0).g(hfsl0.t());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    hfsm.U(v1);
                    int v2 = v1 + hfsl1.d();
                    do {
                        ((hfvb)list0).g(hfsl1.t());
                    }
                    while(hfsl1.d() < v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(hfxg.b(this.b)) {
            case 1: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Long.valueOf(hfsl2.t()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                hfsm.U(v4);
                int v5 = v4 + hfsl3.d();
                do {
                    list0.add(Long.valueOf(hfsl3.t()));
                }
                while(hfsl3.d() < v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void I(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfty)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfty)list0).i(hfsl0.l());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfty)list0).i(hfsl1.l());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Integer.valueOf(hfsl2.l()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Integer.valueOf(hfsl3.l()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void J(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfvb)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfvb)list0).g(hfsl0.u());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfvb)list0).g(hfsl1.u());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Long.valueOf(hfsl2.u()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Long.valueOf(hfsl3.u()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void K(List list0, boolean z) {
        int v1;
        int v;
        if(hfxg.b(this.b) != 2) {
            throw new hfuq("Protocol message tag had invalid wire type.");
        }
        if((list0 instanceof hfuy) && !z) {
            do {
                this.o();
                ((hfuy)list0).b();
                hfsl hfsl0 = this.a;
                if(hfsl0.D()) {
                    return;
                }
                v = hfsl0.m();
            }
            while(v == this.b);
        }
        else {
            do {
                list0.add((z ? this.v() : this.u()));
                hfsl hfsl1 = this.a;
                if(hfsl1.D()) {
                    return;
                }
                v1 = hfsl1.m();
            }
            while(v1 == this.b);
            v = v1;
        }
        this.c = v;
    }

    public final void L(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfty)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfty)list0).i(hfsl0.n());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfty)list0).i(hfsl1.n());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Integer.valueOf(hfsl2.n()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Integer.valueOf(hfsl3.n()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void M(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfvb)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfvb)list0).g(hfsl0.v());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfvb)list0).g(hfsl1.v());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Long.valueOf(hfsl2.v()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Long.valueOf(hfsl3.v()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void N(int v) {
        if(hfxg.b(this.b) == v) {
            return;
        }
        throw new hfuq("Protocol message tag had invalid wire type.");
    }

    public final boolean O() {
        this.N(0);
        return this.a.E();
    }

    public final boolean P() {
        hfsl hfsl0 = this.a;
        if(!hfsl0.D()) {
            return this.b == this.d ? false : hfsl0.F(this.b);
        }
        return false;
    }

    private final void Q(Object object0, hfwc hfwc0, hftc hftc0) {
        int v = FIN.finallyOpen$NT();
        int v1 = this.d;
        this.d = hfxg.c(this.b >>> 3, 4);
        hfwc0.l(object0, this, hftc0);
        if(this.b == this.d) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new hfur("Failed to parse the message.");
    }

    private final void R(Object object0, hfwc hfwc0, hftc hftc0) {
        int v = this.a.n();
        this.a.T();
        int v1 = this.a.e(v);
        ++this.a.b;
        hfwc0.l(object0, this, hftc0);
        this.a.z(0);
        --this.a.b;
        this.a.A(v1);
    }

    private final void S(int v) {
        if(this.a.d() == v) {
            return;
        }
        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private static final void T(int v) {
        if((v & 3) == 0) {
            return;
        }
        throw new hfur("Failed to parse the message.");
    }

    private static final void U(int v) {
        if((v & 7) == 0) {
            return;
        }
        throw new hfur("Failed to parse the message.");
    }

    public final double a() {
        this.N(1);
        return this.a.b();
    }

    public final float b() {
        this.N(5);
        return this.a.c();
    }

    public final int c() {
        int v = this.c;
        if(v != 0) {
            this.b = v;
            this.c = 0;
            return v == 0 || v == this.d ? 0x7FFFFFFF : v >>> 3;
        }
        v = this.a.m();
        this.b = v;
        return v == 0 || v == this.d ? 0x7FFFFFFF : v >>> 3;
    }

    public final int d() {
        this.N(0);
        return this.a.f();
    }

    public final int e() {
        this.N(5);
        return this.a.g();
    }

    public final int f() {
        this.N(0);
        return this.a.h();
    }

    public final int g() {
        this.N(5);
        return this.a.k();
    }

    public final int h() {
        this.N(0);
        return this.a.l();
    }

    public final int i() {
        this.N(0);
        return this.a.n();
    }

    public final long j() {
        this.N(1);
        return this.a.o();
    }

    public final long k() {
        this.N(0);
        return this.a.p();
    }

    public final long l() {
        this.N(1);
        return this.a.t();
    }

    public final long m() {
        this.N(0);
        return this.a.u();
    }

    public final long n() {
        this.N(0);
        return this.a.v();
    }

    public final ByteString o() {
        this.N(2);
        return this.a.w();
    }

    public static hfsm p(hfsl hfsl0) {
        Object object0 = hfsl0.f;
        return object0 == null ? new hfsm(hfsl0) : ((hfsm)object0);
    }

    public final Object q(hfxe hfxe0, Class class0, hftc hftc0) {
        switch(hfxe0.ordinal()) {
            case 0: {
                return this.a();
            }
            case 1: {
                return this.b();
            }
            case 2: {
                return this.k();
            }
            case 3: {
                return this.n();
            }
            case 4: {
                return this.f();
            }
            case 5: {
                return this.j();
            }
            case 6: {
                return this.e();
            }
            case 7: {
                return Boolean.valueOf(this.O());
            }
            case 8: {
                return this.v();
            }
            case 10: {
                return this.t(class0, hftc0);
            }
            case 11: {
                return this.o();
            }
            case 12: {
                return this.i();
            }
            case 13: {
                return this.d();
            }
            case 14: {
                return this.g();
            }
            case 15: {
                return this.l();
            }
            case 16: {
                return this.h();
            }
            case 17: {
                return this.m();
            }
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    public final Object r(hfwc hfwc0, hftc hftc0) {
        Object object0 = hfwc0.e();
        this.Q(object0, hfwc0, hftc0);
        hfwc0.g(object0);
        return object0;
    }

    public final Object s(hfwc hfwc0, hftc hftc0) {
        Object object0 = hfwc0.e();
        this.R(object0, hfwc0, hftc0);
        hfwc0.g(object0);
        return object0;
    }

    public final Object t(Class class0, hftc hftc0) {
        this.N(2);
        return this.s(hfvu.a.b(class0), hftc0);
    }

    public final String u() {
        this.N(2);
        return this.a.x();
    }

    public final String v() {
        this.N(2);
        return this.a.y();
    }

    public final void w(Object object0, hfwc hfwc0, hftc hftc0) {
        this.N(3);
        this.Q(object0, hfwc0, hftc0);
    }

    public final void x(Object object0, hfwc hfwc0, hftc hftc0) {
        this.N(2);
        this.R(object0, hfwc0, hftc0);
    }

    public final void y(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfrs)) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfrs)list0).f(hfsl0.E());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    int v2 = hfsl1.d() + v1;
                    do {
                        ((hfrs)list0).f(hfsl1.E());
                    }
                    while(hfsl1.d() < v2);
                    this.S(v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Boolean.valueOf(hfsl2.E()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                int v5 = hfsl3.d() + v4;
                do {
                    list0.add(Boolean.valueOf(hfsl3.E()));
                }
                while(hfsl3.d() < v5);
                this.S(v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }

    public final void z(List list0) {
        int v3;
        int v;
        if((list0 instanceof hfss)) {
            switch(this.b & 7) {
                case 1: {
                    do {
                        hfsl hfsl0 = this.a;
                        ((hfss)list0).h(hfsl0.b());
                        if(hfsl0.D()) {
                            return;
                        }
                        v = hfsl0.m();
                    }
                    while(v == this.b);
                    this.c = v;
                    return;
                }
                case 2: {
                    hfsl hfsl1 = this.a;
                    int v1 = hfsl1.n();
                    hfsm.U(v1);
                    int v2 = v1 + hfsl1.d();
                    do {
                        ((hfss)list0).h(hfsl1.b());
                    }
                    while(hfsl1.d() < v2);
                    return;
                }
                default: {
                    throw new hfuq("Protocol message tag had invalid wire type.");
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    hfsl hfsl2 = this.a;
                    list0.add(Double.valueOf(hfsl2.b()));
                    if(hfsl2.D()) {
                        return;
                    }
                    v3 = hfsl2.m();
                }
                while(v3 == this.b);
                v = v3;
                this.c = v;
                return;
            }
            case 2: {
                hfsl hfsl3 = this.a;
                int v4 = hfsl3.n();
                hfsm.U(v4);
                int v5 = v4 + hfsl3.d();
                do {
                    list0.add(Double.valueOf(hfsl3.b()));
                }
                while(hfsl3.d() < v5);
                return;
            }
            default: {
                throw new hfuq("Protocol message tag had invalid wire type.");
            }
        }
    }
}


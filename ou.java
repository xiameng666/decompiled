import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ou {
    public final ArrayList a;
    public final ArrayList b;
    final st c;
    public int d;
    final ti e;
    private final kav f;

    public ou(ti ti0) {
        this.f = new kaw(30);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = 0;
        this.e = ti0;
        this.c = new st(this);
    }

    final int a(int v) {
        return this.b(v, 0);
    }

    final int b(int v, int v1) {
        ArrayList arrayList0 = this.b;
        int v2 = arrayList0.size();
        while(v1 < v2) {
            ot ot0 = (ot)arrayList0.get(v1);
            int v3 = ot0.a;
            if(v3 == 8) {
                int v4 = ot0.b;
                if(v4 == v) {
                    v = ot0.d;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(ot0.d <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = ot0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += ot0.d;
                            break;
                        }
                        case 2: {
                            int v6 = ot0.d;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    public final ot c(int v, int v1, int v2, Object object0) {
        ot ot0 = (ot)this.f.a();
        if(ot0 == null) {
            return new ot(v, v1, v2, object0);
        }
        ot0.a = v;
        ot0.b = v1;
        ot0.d = v2;
        ot0.c = object0;
        return ot0;
    }

    public final void d() {
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ot ot0 = (ot)arrayList0.get(v1);
            this.e.b(ot0);
        }
        this.i(arrayList0);
        this.d = 0;
    }

    public final void e() {
        this.d();
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ot ot0 = (ot)arrayList0.get(v1);
            switch(ot0.a) {
                case 1: {
                    this.e.b(ot0);
                    this.e.d(ot0.b, ot0.d);
                    break;
                }
                case 2: {
                    this.e.b(ot0);
                    this.e.f(ot0.b, ot0.d);
                    break;
                }
                case 4: {
                    this.e.b(ot0);
                    this.e.c(ot0.b, ot0.d, ot0.c);
                    break;
                }
                case 8: {
                    this.e.b(ot0);
                    this.e.e(ot0.b, ot0.d);
                }
            }
        }
        this.i(arrayList0);
        this.d = 0;
    }

    final void f(ot ot0, int v) {
        ti ti0 = this.e;
        ti0.b(ot0);
        switch(ot0.a) {
            case 2: {
                ti0.f(v, ot0.d);
                return;
            }
            case 4: {
                ti0.c(v, ot0.d, ot0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    // This method was un-flattened
    public final void g() {
        int v34;
        ot ot4;
        ot ot3;
        boolean z2;
        boolean z1;
        int v;
        ArrayList arrayList0;
        while(true) {
            arrayList0 = this.a;
            v = -1;
            int v1 = arrayList0.size() - 1;
            boolean z = false;
            while(true) {
                if(v1 < 0) {
                    v1 = -1;
                    break;
                }
                if(((ot)arrayList0.get(v1)).a != 8) {
                }
                else if(z) {
                    break;
                }
                else {
                    z = false;
                    --v1;
                    continue;
                }
                z = true;
                --v1;
            }
            ot ot0 = null;
            if(v1 == -1) {
                break;
            }
            st st0 = this.c;
            ot ot1 = (ot)arrayList0.get(v1);
            ot ot2 = (ot)arrayList0.get(v1 + 1);
            switch(ot2.a) {
                case 1: {
                    int v2 = ot1.d;
                    int v3 = ot2.b;
                    if(v2 >= v3) {
                        v = 0;
                    }
                    int v4 = ot1.b;
                    if(v4 < v3) {
                        ++v;
                    }
                    if(v3 <= v4) {
                        ot1.b = v4 + ot2.d;
                    }
                    int v5 = ot2.b;
                    if(v5 <= v2) {
                        ot1.d = v2 + ot2.d;
                    }
                    ot2.b = v5 + v;
                    arrayList0.set(v1, ot2);
                    arrayList0.set(v1 + 1, ot1);
                    break;
                }
                case 2: {
                    int v6 = ot1.b;
                    int v7 = ot1.d;
                    if(v6 < v7) {
                        if(ot2.b == v6 && ot2.d == v7 - v6) {
                            z1 = true;
                            z2 = false;
                            goto label_53;
                        }
                        else {
                            z2 = false;
                            goto label_52;
                        }
                        goto label_47;
                    }
                    else {
                    label_47:
                        if(ot2.b == v7 + 1 && ot2.d == v6 - v7) {
                            z2 = true;
                            z1 = true;
                            goto label_53;
                        }
                        else {
                            z2 = true;
                        }
                    }
                label_52:
                    z1 = false;
                label_53:
                    int v8 = ot2.b;
                    if(v7 < v8) {
                        --v8;
                        ot2.b = v8;
                    }
                    else {
                        int v9 = ot2.d;
                        if(v7 < v8 + v9) {
                            ot2.d = v9 - 1;
                            ot1.a = 2;
                            ot1.d = 1;
                            if(ot2.d != 0) {
                                break;
                            }
                            arrayList0.remove(v1 + 1);
                            st0.a.h(ot2);
                            break;
                        }
                    }
                    int v10 = ot1.b;
                    if(v10 <= v8) {
                        ot2.b = v8 + 1;
                    }
                    else {
                        int v11 = v8 + ot2.d;
                        if(v10 < v11) {
                            ot3 = st0.a.c(2, v10 + 1, v11 - v10, null);
                            ot2.d = ot1.b - ot2.b;
                            goto label_77;
                        }
                    }
                    ot3 = null;
                label_77:
                    if(z1) {
                        arrayList0.set(v1, ot2);
                        arrayList0.remove(v1 + 1);
                        st0.a.h(ot1);
                    }
                    else {
                        if(z2) {
                            if(ot3 != null) {
                                int v12 = ot1.b;
                                if(v12 > ot3.b) {
                                    ot1.b = v12 - ot3.d;
                                }
                                int v13 = ot1.d;
                                if(v13 > ot3.b) {
                                    ot1.d = v13 - ot3.d;
                                }
                                ot0 = ot3;
                            }
                            int v14 = ot1.b;
                            if(v14 > ot2.b) {
                                ot1.b = v14 - ot2.d;
                            }
                            int v15 = ot1.d;
                            if(v15 > ot2.b) {
                                ot1.d = v15 - ot2.d;
                            }
                        }
                        else {
                            if(ot3 != null) {
                                int v16 = ot1.b;
                                if(v16 >= ot3.b) {
                                    ot1.b = v16 - ot3.d;
                                }
                                int v17 = ot1.d;
                                if(v17 >= ot3.b) {
                                    ot1.d = v17 - ot3.d;
                                }
                                ot0 = ot3;
                            }
                            int v18 = ot1.b;
                            if(v18 >= ot2.b) {
                                ot1.b = v18 - ot2.d;
                            }
                            int v19 = ot1.d;
                            if(v19 >= ot2.b) {
                                ot1.d = v19 - ot2.d;
                            }
                        }
                        arrayList0.set(v1, ot2);
                        if(ot1.b == ot1.d) {
                            arrayList0.remove(v1 + 1);
                        }
                        else {
                            arrayList0.set(v1 + 1, ot1);
                        }
                        if(ot0 == null) {
                            break;
                        }
                        arrayList0.add(v1, ot0);
                    }
                    break;
                }
                case 4: {
                    int v20 = ot1.d;
                    int v21 = ot2.b;
                    if(v20 < v21) {
                        ot2.b = v21 - 1;
                    }
                    else {
                        int v22 = ot2.d;
                        if(v20 < v21 + v22) {
                            ot2.d = v22 - 1;
                            ot4 = st0.a.c(4, ot1.b, 1, ot2.c);
                            goto label_131;
                        }
                    }
                    ot4 = null;
                label_131:
                    int v23 = ot1.b;
                    int v24 = ot2.b;
                    if(v23 <= v24) {
                        ot2.b = v24 + 1;
                    }
                    else {
                        int v25 = v24 + ot2.d;
                        if(v23 < v25) {
                            int v26 = v25 - v23;
                            ot0 = st0.a.c(4, v23 + 1, v26, ot2.c);
                            ot2.d -= v26;
                        }
                    }
                    arrayList0.set(v1 + 1, ot1);
                    if(ot2.d > 0) {
                        arrayList0.set(v1, ot2);
                    }
                    else {
                        arrayList0.remove(v1);
                        st0.a.h(ot2);
                    }
                    if(ot4 != null) {
                        arrayList0.add(v1, ot4);
                    }
                    if(ot0 == null) {
                        break;
                    }
                    arrayList0.add(v1, ot0);
                }
            }
        }
        int v27 = arrayList0.size();
        int v28 = 0;
        while(v28 < v27) {
            ot ot5 = (ot)arrayList0.get(v28);
            switch(ot5.a) {
                case 1: {
                    this.o(ot5);
                    break;
                }
                case 2: {
                    int v29 = ot5.b;
                    int v30 = ot5.d + v29;
                    int v31 = v29;
                    int v32 = 0;
                    int v33 = -1;
                    while(v31 < v30) {
                        if(this.e.a(v31) == null && !this.p(v31)) {
                            if(v33 == 1) {
                                this.o(this.c(2, v29, v32, null));
                                v34 = 0;
                                v31 -= v32;
                                v30 -= v32;
                                v32 = 1;
                                goto label_182;
                            }
                            else {
                                v34 = 0;
                                goto label_181;
                            }
                            goto label_173;
                        }
                        else {
                        label_173:
                            if(v33 == 0) {
                                this.n(this.c(2, v29, v32, null));
                                v34 = 1;
                                v31 -= v32;
                                v30 -= v32;
                                v32 = 1;
                                goto label_182;
                            }
                            else {
                                v34 = 1;
                            }
                        }
                    label_181:
                        ++v32;
                    label_182:
                        ++v31;
                        v33 = v34;
                    }
                    if(v32 != ot5.d) {
                        this.h(ot5);
                        ot5 = this.c(2, v29, v32, null);
                    }
                    if(v33 == 0) {
                        this.n(ot5);
                    }
                    else {
                        this.o(ot5);
                    }
                    break;
                }
                case 4: {
                    int v35 = ot5.b;
                    int v36 = ot5.d + v35;
                    int v37 = v35;
                    int v38 = 0;
                    while(v35 < v36) {
                        if(this.e.a(v35) == null && !this.p(v35)) {
                            if(v == 1) {
                                this.o(this.c(4, v37, v38, ot5.c));
                                v37 = v35;
                                v38 = 0;
                            }
                            v = 0;
                        }
                        else {
                            if(v == 0) {
                                this.n(this.c(4, v37, v38, ot5.c));
                                v37 = v35;
                                v38 = 0;
                            }
                            v = 1;
                        }
                        ++v38;
                        ++v35;
                    }
                    if(v38 != ot5.d) {
                        Object object0 = ot5.c;
                        this.h(ot5);
                        ot5 = this.c(4, v37, v38, object0);
                    }
                    if(v == 0) {
                        this.n(ot5);
                    }
                    else {
                        this.o(ot5);
                    }
                    break;
                }
                case 8: {
                    this.o(ot5);
                }
            }
            ++v28;
            v = -1;
        }
        arrayList0.clear();
    }

    public final void h(ot ot0) {
        ot0.c = null;
        this.f.b(ot0);
    }

    final void i(List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.h(((ot)list0.get(v1)));
        }
        list0.clear();
    }

    public final void j() {
        this.i(this.a);
        this.i(this.b);
        this.d = 0;
    }

    public final boolean k(int v) {
        return (this.d & v) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }

    private final int m(int v, int v1) {
        ArrayList arrayList0 = this.b;
        int v2 = arrayList0.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ot ot0 = (ot)arrayList0.get(v2);
            int v3 = ot0.a;
            if(v3 == 8) {
                int v4 = ot0.b;
                int v5 = ot0.d;
                int v6 = v4 >= v5 ? v5 : v4;
                if(v < v6 || v > (v4 >= v5 ? v4 : v5)) {
                    if(v >= v4) {
                        continue;
                    }
                    if(v1 == 1) {
                        ot0.b = v4 + 1;
                        ot0.d = v5 + 1;
                    }
                    else {
                        if(v1 != 2) {
                            continue;
                        }
                        ot0.b = v4 - 1;
                        ot0.d = v5 - 1;
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        ot0.d = v5 + 1;
                    }
                    else if(v1 == 2) {
                        ot0.d = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        ot0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        ot0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v7 = ot0.b;
                if(v7 <= v) {
                    if(v3 == 1) {
                        v -= ot0.d;
                    }
                    else {
                        if(v3 != 2) {
                            continue;
                        }
                        v += ot0.d;
                    }
                }
                else if(v1 == 1) {
                    ot0.b = v7 + 1;
                }
                else if(v1 == 2) {
                    ot0.b = v7 - 1;
                }
            }
        }
        int v8 = arrayList0.size();
        while(true) {
            --v8;
            if(v8 < 0) {
                break;
            }
            ot ot1 = (ot)arrayList0.get(v8);
            if(ot1.a == 8) {
                if(ot1.d != ot1.b && ot1.d >= 0) {
                    continue;
                }
                arrayList0.remove(v8);
                this.h(ot1);
            }
            else if(ot1.d <= 0) {
                arrayList0.remove(v8);
                this.h(ot1);
            }
        }
        return v;
    }

    private final void n(ot ot0) {
        int v3;
        int v = ot0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.m(ot0.b, v);
        int v2 = ot0.b;
        switch(ot0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                Objects.toString(ot0);
                throw new IllegalArgumentException("op should be remove or update." + ot0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; v4 < ot0.d; ++v4) {
            int v6 = this.m(ot0.b + v3 * v4, ot0.a);
            int v7 = ot0.a;
            switch(v7) {
                case 2: {
                    if(v6 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v6 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            ot ot1 = this.c(v7, v1, v5, ot0.c);
            this.f(ot1, v2);
            this.h(ot1);
            if(ot0.a == 4) {
                v2 += v5;
            }
            v5 = 1;
            v1 = v6;
        }
        Object object0 = ot0.c;
        this.h(ot0);
        if(v5 > 0) {
            ot ot2 = this.c(ot0.a, v1, v5, object0);
            this.f(ot2, v2);
            this.h(ot2);
        }
    }

    private final void o(ot ot0) {
        this.b.add(ot0);
        switch(ot0.a) {
            case 1: {
                this.e.d(ot0.b, ot0.d);
                return;
            }
            case 2: {
                this.e.a.Z(ot0.b, ot0.d, false);
                this.e.a.P = true;
                return;
            }
            case 4: {
                this.e.c(ot0.b, ot0.d, ot0.c);
                return;
            }
            case 8: {
                this.e.e(ot0.b, ot0.d);
                return;
            }
            default: {
                Objects.toString(ot0);
                throw new IllegalArgumentException("Unknown update op type for " + ot0);
            }
        }
    }

    private final boolean p(int v) {
        ArrayList arrayList0 = this.b;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ot ot0 = (ot)arrayList0.get(v2);
            int v3 = ot0.a;
            if(v3 == 8) {
                if(this.b(ot0.d, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = ot0.b;
                int v5 = ot0.d + v4;
                while(v4 < v5) {
                    if(this.b(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }
}


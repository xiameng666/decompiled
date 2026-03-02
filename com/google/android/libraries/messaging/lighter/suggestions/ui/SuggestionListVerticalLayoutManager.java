package com.google.android.libraries.messaging.lighter.suggestions.ui;

import android.view.View;
import tx;
import ty;
import uf;
import un;

public class SuggestionListVerticalLayoutManager extends tx {
    private final int a;
    private final boolean b;

    public SuggestionListVerticalLayoutManager(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // tx
    public final boolean ae() {
        return false;
    }

    @Override  // tx
    public final boolean af() {
        return true;
    }

    @Override  // tx
    public final ty f() {
        return new ty(-2, -2);
    }

    @Override  // tx
    public final void o(uf uf0, un un0) {
        this.aG(uf0);
        int v = this.G;
        int v1 = 0;
        for(int v2 = 0; v1 < this.at(); v2 = v4) {
            View view0 = uf0.c(v1);
            this.aD(view0);
            this.br(view0);
            int v3 = SuggestionListVerticalLayoutManager.bj(view0);
            int v4 = SuggestionListVerticalLayoutManager.bi(view0) + v2;
            int v5 = v - v3;
            int v6 = this.a;
            if(this.b) {
                SuggestionListVerticalLayoutManager.bp(view0, v6, v2, v3 + v6, v4);
            }
            else {
                int v7 = v5 - v6;
                SuggestionListVerticalLayoutManager.bp(view0, v7, v2, v3 + v7, v4);
            }
            ++v1;
        }
    }
}


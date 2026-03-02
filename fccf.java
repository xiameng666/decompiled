import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class fccf extends uq {
    protected final ViewGroup v;

    protected fccf(ViewGroup viewGroup0) {
        super(viewGroup0);
        this.v = viewGroup0;
    }

    protected void D(gdcl gdcl0) {
        this.v.removeAllViews();
    }

    public void E(gdcl gdcl0, boolean z) {
    }

    protected abstract void F(hcfc arg1, gdcl arg2);

    protected abstract boolean G(hcfc arg1, gdcl arg2);

    protected final Context H() {
        return this.v.getContext();
    }

    protected final LayoutInflater I() {
        return LayoutInflater.from(this.H());
    }
}


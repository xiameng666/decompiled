import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;

public final class fygg extends lkj {
    @Override  // lkj
    public final float a(Object object0) {
        return ((MaterialButton)object0).w;
    }

    @Override  // lkj
    public final void b(Object object0, float f) {
        if(((MaterialButton)object0).w != f) {
            ((MaterialButton)object0).w = f;
            ((MaterialButton)object0).E();
            ((MaterialButton)object0).invalidate();
            if((((MaterialButton)object0).getParent() instanceof MaterialButtonGroup)) {
                MaterialButtonGroup materialButtonGroup0 = (MaterialButtonGroup)((MaterialButton)object0).getParent();
                int v = (int)((MaterialButton)object0).w;
                int v1 = materialButtonGroup0.indexOfChild(((MaterialButton)object0));
                if(v1 >= 0) {
                    MaterialButton materialButton0 = materialButtonGroup0.c(v1);
                    MaterialButton materialButton1 = materialButtonGroup0.b(v1);
                    if(materialButton0 != null || materialButton1 != null) {
                        if(materialButton0 == null) {
                            materialButton1.t(v);
                        }
                        if(materialButton1 == null) {
                            materialButton0.t(v);
                        }
                        if(materialButton0 != null && materialButton1 != null) {
                            materialButton0.t(v / 2);
                            materialButton1.t((v + 1) / 2);
                        }
                    }
                }
            }
        }
    }
}


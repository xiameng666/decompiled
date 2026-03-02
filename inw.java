import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

final class inw {
    private final Matrix a;
    private final int[] b;

    public inw() {
        this.a = new Matrix();
        this.b = new int[2];
    }

    public void a(View view0, float[] arr_f) {
        Matrix matrix0 = this.a;
        matrix0.reset();
        View view1 = view0;
        view1.transformMatrixToGlobal(matrix0);
        for(ViewParent viewParent0 = view1.getParent(); (viewParent0 instanceof View); viewParent0 = view1.getParent()) {
            view1 = (View)viewParent0;
        }
        view1.getLocationOnScreen(this.b);
        int v = this.b[0];
        int v1 = this.b[1];
        view1.getLocationInWindow(this.b);
        matrix0.postTranslate(((float)(this.b[0] - v)), ((float)(this.b[1] - v1)));
        matrix0.getValues(arr_f);
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        arr_f[1] = f3;
        arr_f[2] = 0.0f;
        arr_f[3] = f6;
        arr_f[4] = f1;
        arr_f[5] = f4;
        arr_f[6] = 0.0f;
        arr_f[7] = f7;
        arr_f[8] = 0.0f;
        arr_f[9] = 0.0f;
        arr_f[10] = 1.0f;
        arr_f[11] = 0.0f;
        arr_f[12] = f2;
        arr_f[13] = f5;
        arr_f[14] = 0.0f;
        arr_f[15] = f8;
    }
}


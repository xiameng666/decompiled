import android.opengl.GLES20;
import java.util.Objects;

public final class btn extends btm {
    private int e;
    private int f;
    private int g;

    public btn(bat bat0, bsg bsg0) {
        String s1;
        String s;
        try {
            s = bat0.a() ? bto.d : bto.c;
            s1 = bsg0.a();
            if(s1 != null && s1.contains("vTextureCoord")) {
                goto label_3;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        }
        catch(Throwable throwable0) {
            goto label_21;
        }
    label_3:
        if(s1.contains("sTexture")) {
            super(s, s1);
            this.e = -1;
            this.f = -1;
            this.g = -1;
            super.d();
            int v = GLES20.glGetUniformLocation(this.a, "sTexture");
            this.e = v;
            bto.i(v, "sTexture");
            int v1 = GLES20.glGetAttribLocation(this.a, "aTextureCoord");
            this.g = v1;
            bto.i(v1, "aTextureCoord");
            int v2 = GLES20.glGetUniformLocation(this.a, "uTexMatrix");
            this.f = v2;
            bto.i(v2, "uTexMatrix");
            return;
        }
        try {
            throw new IllegalArgumentException("Invalid fragment shader");
        }
        catch(Throwable throwable0) {
        label_21:
            if((throwable0 instanceof IllegalArgumentException)) {
                throw throwable0;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", throwable0);
        }
    }

    public btn(bat bat0, btl btl0) {
        bsg bsg0;
        if(bat0.a()) {
            Objects.toString(btl0);
            kay.b(btl0 != btl.a, "No default sampler shader available for" + btl0);
            bsg0 = btl0 == btl.c ? bto.g : bto.f;
        }
        else {
            bsg0 = bto.e;
        }
        this(bat0, bsg0);
    }

    @Override  // btm
    public final void c() {
        super.c();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        bto.f("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 0x1406, false, 0, bto.k);
        bto.f("glVertexAttribPointer");
    }

    public final void e(float[] arr_f) {
        GLES20.glUniformMatrix4fv(this.f, 1, false, arr_f, 0);
        bto.f("glUniformMatrix4fv");
    }
}


import android.opengl.GLES20;

public class btm {
    public int a;
    protected int b;
    protected int c;
    protected int d;

    public btm() {
        this("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
    }

    public btm(String s, String s1) {
        int v1;
        int v;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        try {
            v = bto.b(0x8B31, s);
        }
        catch(IllegalStateException | IllegalArgumentException exception0) {
            v = -1;
            v1 = -1;
            goto label_14;
        }
        try {
            v1 = bto.b(0x8B30, s1);
            goto label_16;
        }
        catch(IllegalStateException | IllegalArgumentException exception0) {
            v1 = -1;
        }
    label_14:
        int v2 = -1;
        goto label_34;
        try {
        label_16:
            v2 = GLES20.glCreateProgram();
        }
        catch(IllegalStateException | IllegalArgumentException exception0) {
            v2 = -1;
            goto label_34;
        }
        try {
            bto.f("glCreateProgram");
            GLES20.glAttachShader(v2, v);
            bto.f("glAttachShader");
            GLES20.glAttachShader(v2, v1);
            bto.f("glAttachShader");
            GLES20.glLinkProgram(v2);
            int[] arr_v = new int[1];
            GLES20.glGetProgramiv(v2, 0x8B82, arr_v, 0);
            if(arr_v[0] != 1) {
                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(v2));
            }
            this.a = v2;
            goto label_41;
        }
        catch(IllegalStateException | IllegalArgumentException exception0) {
        }
    label_34:
        if(v != -1) {
            GLES20.glDeleteShader(v);
        }
        if(v1 != -1) {
            GLES20.glDeleteShader(v1);
        }
        if(v2 != -1) {
            GLES20.glDeleteProgram(v2);
        }
        throw exception0;
    label_41:
        this.d();
    }

    public final void a(float f) {
        GLES20.glUniform1f(this.c, f);
        bto.f("glUniform1f");
    }

    public final void b(float[] arr_f) {
        GLES20.glUniformMatrix4fv(this.b, 1, false, arr_f, 0);
        bto.f("glUniformMatrix4fv");
    }

    public void c() {
        GLES20.glUseProgram(this.a);
        bto.f("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        bto.f("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 0x1406, false, 0, bto.i);
        bto.f("glVertexAttribPointer");
        this.b(bto.j());
        this.a(1.0f);
    }

    public final void d() {
        int v = GLES20.glGetAttribLocation(this.a, "aPosition");
        this.d = v;
        bto.i(v, "aPosition");
        int v1 = GLES20.glGetUniformLocation(this.a, "uTransMatrix");
        this.b = v1;
        bto.i(v1, "uTransMatrix");
        int v2 = GLES20.glGetUniformLocation(this.a, "uAlphaScale");
        this.c = v2;
        bto.i(v2, "uAlphaScale");
    }
}


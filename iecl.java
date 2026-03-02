public interface iecl {
    int doFinal(byte[] arg1, int arg2);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte arg1);

    void update(byte[] arg1, int arg2, int arg3);
}


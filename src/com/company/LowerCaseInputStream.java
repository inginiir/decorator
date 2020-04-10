package com.company;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res  =in.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return res;
    }
}

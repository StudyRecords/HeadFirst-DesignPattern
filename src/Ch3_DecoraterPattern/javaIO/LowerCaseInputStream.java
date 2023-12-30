package Ch3_DecoraterPattern.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


// 입력 스트림에 있는 대문자를 전부 소문자로 바꿔주는 데코레이터
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        if(c == -1) {
            return c;
        }
        else {
            return Character.toLowerCase((char) c);
        }
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}

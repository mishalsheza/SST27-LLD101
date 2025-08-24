public class SimpleDecoder implements Decoder {

    @Override
    public Frame decode(byte[] fileBytes) {
        // TODO Auto-generated method stub
        return new Frame(fileBytes); // pretend decoding
    }
    
}

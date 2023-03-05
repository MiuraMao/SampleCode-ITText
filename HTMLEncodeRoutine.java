//HTMLエンコード処理ルーチンのメソッド

private String htmlencode(String original) {
    StringBuffer encoded = new StringBuffer();
    for (int i = 0; i < original.length; i++) {
        char c = original.charAt(i);
        switch(c) {
            case '<':
            encoded.append("&lt");
                break;
            case '>':
            encoded.append("&gt");
                break;
            case '&':
            encoded.append("&amp");
                break;
            case '\"':
            encoded.append("&quot");
                break;
            default:
            encoded.append(c);
        }
    }
    return encoded.toString()
}
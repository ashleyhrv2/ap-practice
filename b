public String getShortenedName()
{
    String s = username;
    String out = "";

    int i = 0;

    while (i < s.length()) {

        char c = s.charAt(i);

        if (c == '-') {
            if (out.length() > 0) {
                out = out.substring(0, out.length() - 1);
            }
            i = i + 1;
        }
        else {
            out = out + c;
            i = i + 1;
        }
    }

    return out;
}

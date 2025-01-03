/*
 * Szabadon felhasználható
 */
package java_exercise_14;

/**
 *
 * @author dady
 */
public class Filename {

    private String fullPath;
    private char pathSeparator;
    private char extensionSeparator;

    public Filename(String fp, char sep, char ext) {
        fullPath = fp;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dotPosition = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dotPosition + 1);
    }

    public String filename() {
        int dotPosition = fullPath.lastIndexOf(extensionSeparator);
        int sepPosition = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sepPosition + 1, dotPosition);
    }

    public String path() {
        int sepPosition = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sepPosition);
    }

}

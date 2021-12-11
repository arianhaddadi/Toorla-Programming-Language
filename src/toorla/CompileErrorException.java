package toorla;

public abstract class CompileErrorException extends Exception {
    protected int atLine;
    protected int atColumn;

    public CompileErrorException(int atLine, int atColumn) {
        this.atLine = atLine;
        this.atColumn = atColumn;
    }

    public CompileErrorException() {
    }

    public void setPlace(int line, int column) {
        atLine = line;
        atColumn = column;
    }
    public abstract String toString();

}

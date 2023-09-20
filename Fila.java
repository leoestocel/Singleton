public class Fila {

    private int fila;

    private int imprimeDocumento;

    private int removeDocumento;

    private int removeTodosDocumentos;

    private static Fila instance;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getImprimeDocumento() {
        return imprimeDocumento;
    }

    public void setImprimeDocumento(int imprimeDocumento) {
        this.imprimeDocumento = imprimeDocumento;
    }

    public int getRemoveDocumento() {
        return removeDocumento;
    }

    public void setRemoveDocumento(int removeDocumento) {
        this.removeDocumento = removeDocumento;
    }

    public int getRemoveTodosDocumentos() {
        return removeTodosDocumentos;
    }

    public void setRemoveTodosDocumentos(int removeTodosDocumentos) {
        this.removeTodosDocumentos = removeTodosDocumentos;
    }

    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

}
public class Fila {
    private static Fila instancia = null;
    private void ImprimeDocumento(){
    }

    private void RemoveDocumento(){
    }

    private void RemoveTodosDocumentos(){
    }

    private Fila(){
    }

    public static Fila getInstance(){
        if (instancia == null)
        {
            instancia = new Fila();
        }
        return instancia;
    }
}

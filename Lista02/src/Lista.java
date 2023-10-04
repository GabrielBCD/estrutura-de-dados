public class Lista {
    No primeiro = null, ultimo = null;

    public void inserirNoFinal(No novoNo) {
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
    }

    public void imprimir() {

        No aux = primeiro;
        int i = 0;
        while (aux != null) {
            System.out.println("Pos: " + i + " Valor: " + aux.valor);
            i++;
            aux = aux.prox;
        }
    }
}
